package com.github.slamdunk.springframework.study.proxy.classloader;

/**
 * my customer class loader
 * 
 * @author liuzhongda
 *
 */
public class MyClassLoader extends ClassLoader {
	public Class<?> defineMyClass(byte[] b, int off, int len) {
		return super.defineClass(b, off, len);
	}
}
