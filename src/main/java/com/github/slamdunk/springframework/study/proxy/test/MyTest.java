package com.github.slamdunk.springframework.study.proxy.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import com.github.slamdunk.springframework.study.proxy.classloader.MyClassLoader;

/**
 * a test class for my own classloader
 * 
 * @author liuzhongda
 *
 */
public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(".");
		try {
			// InputStream input = new FileInputStream(file.getCanonicalFile()
			// +
			// "/target/classes/com/github/slamdunk/springframework/study/proxy/Programmer.class");
			InputStream input = new FileInputStream(file.getCanonicalFile() + "/target/Programmer.class");
			byte[] result = new byte[1024];
			int count = input.read(result);
			MyClassLoader loader = new MyClassLoader();
			Class clazz = loader.defineMyClass(result, 0, count);
			System.out.println(clazz.getCanonicalName());
			Object o = clazz.newInstance();
			clazz.getMethod("code", null).invoke(o, null);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
