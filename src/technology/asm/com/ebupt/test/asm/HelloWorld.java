package com.ebupt.test.asm;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
public class HelloWorld extends ClassLoader {
	/**
	 * ���ʹ��ASM��̬����һ���࣬����ӡ��HelloWorld!
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// ����һ��ClassWriter��дʾ���࣬�����̳�Object
		ClassWriter cw = new ClassWriter(0);
		/*
		 * ��һ��������JDK�汾 �ڶ��������������ķ��ʱ�� ����������������������
		 * ���ĸ�������������ǩ�����������û�м̳л���ʵ��һ���ӿڵ�ʱ�����Ϊ�ա� �������������ǰ�ุ�������
		 * �ӿڵĸ�����Object��������Object��ʱ��Ϊ�� �������������ӿڵ����� ����Ϊ��
		 */
		cw.visit(Opcodes.V1_6, Opcodes.ACC_PUBLIC, "Example", null,
				"java/lang/Object", null);
		/*
		 * ����һ��дĬ�Ϲ�������MethodWriter ��һ�������������ķ��ʱ�� �ڶ����������������� ��������������������������
		 * ���ĸ�����������ǩ�������������� �������� �Լ��쳣û���õ������Ե�ʱ�����Ϊ�գ� �ڢݸ��������쳣����
		 */
		MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V",
				null, null);
		// ѹ��this����
		mv.visitVarInsn(Opcodes.ALOAD, 0);
		// ִ�и��๹����
		mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>",
				"()V");
		mv.visitInsn(Opcodes.RETURN);
		// ��δ���ʹ�����һ����Ԫ�� ��һ�� �ֲ�����
		mv.visitMaxs(1, 1);
		mv.visitEnd();
		// ����һ��main������MethodWriter
		mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main",
				"([Ljava/lang/String;)V", null, null);
		// ����System���PrintStream���out
		mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out",
				"Ljava/io/PrintStream;");
		// ѹ��"Hello World!" ����
		mv.visitLdcInsn("Hello World!");
		// ִ�ж�����PrintStream�е�println����
		mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream",
				"println", "(Ljava/lang/String;)V");
		mv.visitInsn(Opcodes.RETURN);
		// ʹ�������Ѻ������ֲ�����
		mv.visitMaxs(2, 2);
		// ��ȡExample����ֽ��벢�Ҷ�̬��������
		byte[] code = cw.toByteArray();
		FileOutputStream fos = new FileOutputStream("Example.class");
		fos.write(code);
		fos.close();
		HelloWorld loader = new HelloWorld();
		Class<?> exampleClass = loader.defineClass("Example", code, 0,
				code.length);
		// ʹ�ö�̬���ɵ����ӡHelloWorld
		Method method = exampleClass.getMethods()[0];
		method.invoke(null, new Object[] { null });
	}
}