package cn.com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTester {

	/**
	 * ����������������copy��������������ָ���ķ����Ĳ���ȥ ����һ���µĶ���Ŀ��� ����������
	 * 
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 */
	public Object copy(Object obj) throws IllegalArgumentException,
			SecurityException, InstantiationException, IllegalAccessException,
			InvocationTargetException, NoSuchMethodException {

		// ��ö��������
		Class classType = obj.getClass();
		System.out.println("�ö���������ǣ�" + classType.toString());

		// ͨ��Ĭ�Ϲ��췽��ȥ����һ���µĶ���getConstructor������������������ĸ����췽��
		Object objectCopy = classType.getConstructor(new Class[] {})
				.newInstance(new Object[] {});

		// ��ö������������
		Field[] fields = classType.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			// ��ȡ�����ж�Ӧ������
			Field field = fields[i];

			String fieldName = field.getName();
			String stringLetter = fieldName.substring(0, 1).toUpperCase();

			// �����Ӧ���Ե�getXXX��setXXX��������
			String getName = "get" + stringLetter + fieldName.substring(1);
			String setName = "set" + stringLetter + fieldName.substring(1);

			// ��ȡ��Ӧ�ķ���
			Method getMethod = classType.getMethod(getName, new Class[] {});
			Method setMethod = classType.getMethod(setName, new Class[] { field
					.getType() });

			// ����Դ�����getXXX��������
			Object value = getMethod.invoke(obj, new Object[] {});
			System.out.println(fieldName + " :" + value);

			// ���ÿ��������setXXX��������
			setMethod.invoke(objectCopy, new Object[] { value });

		}

		return objectCopy;

	}

	public static void main(String[] args) throws IllegalArgumentException,
			SecurityException, InstantiationException, IllegalAccessException,
			InvocationTargetException, NoSuchMethodException {
		Customer customer = new Customer();
		customer.setName("hejianjie");
		customer.setId(new Long(1234));
		customer.setAge(19);

		Customer customer2 = null;
		customer2 = (Customer) new ReflectTester().copy(customer);
		System.out.println(customer.getName() + " " + customer2.getAge() + " "
				+ customer2.getId());

		System.out.println(customer);
		System.out.println(customer2);

	}

}

class Customer {

	private Long id;

	private String name;

	private int age;

	public Customer() {

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}