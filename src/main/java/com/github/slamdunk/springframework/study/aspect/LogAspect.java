package com.github.slamdunk.springframework.study.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.github.slamdunk.springframework.study.annotation.FileLog;

/**
 * define for handling log aspect
 */
@Aspect
@Component
public class LogAspect {
	@AfterReturning("within(com.github.slamdunk.springframework.study.service..*) && @annotation(fl)")
	public void addSuccessLog(JoinPoint jp, FileLog fl) {
		Object[] parames = jp.getArgs();
		// 获取目标方法体参数
		String className = jp.getTarget().getClass().toString();
		// 获取目标类名
		String signature = jp.getSignature().toString();
		// 获取目标方法签名
		String methodName = signature.substring(signature.lastIndexOf(".") + 1, signature.indexOf("("));
		// 获取注解值
		String desc = fl.value();
		// 把调用的信息写到日常记录信息里面去...
		System.out.println("params=" + parames.toString() + "&className=" + className + "&signature=" + signature
				+ "methodName=" + methodName + "&desc=" + desc);
	}

	// 标注该方法体为异常通知，当目标方法出现异常时，执行该方法体
	@AfterThrowing(pointcut = "within(com.github.slamdunk.springframework.study.service..*) && @annotation(fl)", throwing = "e")
	public void addExceptionLog(JoinPoint jp, FileLog fl, Exception e) {
		// 把错误信息写到错误日志文件里面去...
	}
}
