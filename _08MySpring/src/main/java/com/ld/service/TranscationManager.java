package com.ld.service;

public class TranscationManager {
	
	public void begin(){
		System.out.println("sessionactory.getTranscation().begin()");
	}
	
	public void commit(){
		System.out.println("sessionactory.getTranscation().commit()");
	}
	
	public void rollback(){
		System.out.println("sessionactory.getTranscation().rollback()");
	}
}
