package com.github.slamdunk.springframework.study.proxy.generator;

import java.io.IOException;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;

/**
 * a class generator based on the lib of java assist
 * @author liuzhongda
 *
 */
public class MyAssistGenerator {

	public static void main(String[] args) throws CannotCompileException, IOException {
		// TODO Auto-generated method stub
		   ClassPool pool = ClassPool.getDefault();
	        //创建Programmer类       
	        CtClass cc = pool.makeClass("com.github.slamdunk.springframework.study.proxy.generator.Programmer");
	        //定义code方法  
	        CtMethod method = CtNewMethod.make("public void code(){}", cc);
	        //插入方法代码  
	        method.insertBefore("System.out.println(\"I'm a Programmer,Just Coding.....\");");
	        cc.addMethod(method);
	        //保存生成的字节码  
	        cc.writeFile("./target/temp");
	}

}
