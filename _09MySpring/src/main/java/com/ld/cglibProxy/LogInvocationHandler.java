package com.ld.cglibProxy;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.cglib.proxy.InvocationHandler;


public class LogInvocationHandler implements InvocationHandler{
	
	private Object target;
	
	public LogInvocationHandler(Object target) {
		this.target = target;
	}

	public Object invoke(Object arg0, Method m, Object[] arg)
			throws Throwable {
		System.out.println("日志:操作时间:"+new Date().toLocaleString()+"当前你调用了:"+m+"方法，传入的参数是:"+Arrays.toString(arg));
		return m.invoke(target, arg);
	}

}
