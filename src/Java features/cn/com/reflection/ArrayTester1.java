package cn.com.reflection;   
  
import java.lang.reflect.Array;
import java.util.ArrayList;
  
public class ArrayTester1 {   
  
    /**  
     * ������ݷ���������  
     * һ����̬������   
     */  
    public static void main(String[] args) throws ClassNotFoundException {   
    	ArrayList list = new ArrayList();
        Class classType=Class.forName("java.lang.String");   
           
        Object array= Array.newInstance(classType,10);  //ָ����������ͺʹ�С   
           
         //������Ϊ5��λ�ý��и�ֵ   
        Array.set(array, 5, "hello");   
           
        String s=(String)Array.get(array, 5);   
           
        System.out.println(s);   
           
           
        //ѭ�����������̬����   
        for(int i=0;i<((String[])array).length;i++){   
               
            String str=(String)Array.get(array, i);   
               
            System.out.println(str);   
        }   
  
    }   
  
}