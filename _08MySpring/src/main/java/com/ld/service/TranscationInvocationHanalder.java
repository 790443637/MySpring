package com.ld.service;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.cglib.proxy.InvocationHandler;

public class TranscationInvocationHanalder implements InvocationHandler {

	private Object target;
	private TranscationManager txManager;
	
	public TranscationInvocationHanalder(Object service,TranscationManager txManager){
		this.target=service;
		this.txManager=txManager;
	}
	/**
	 * ����:
	 * 1.proxy��������Ķ���
	 * 2.��ε��õķ���
	 * 3.��ε��÷�������Ĳ���	
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		txManager.begin();
		try {
			Object invoke = method.invoke(target, args);
			txManager.commit();
			return invoke;
		} catch (Exception e) {
			txManager.rollback();
		}
		return null;
	}

}
