package com.te.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.OK)
public class ResourceNotFoundException  extends RuntimeException{
	private static final long serialVersionUID=1L;
	private String resourceName;
	private String fieldName; 
	private Object fieldValue;
	public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
		super(String.format("%s its not found %s:'%s",resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	public String getResourceName() {
		return resourceName;
	}
	
	public String getFielNome() {
		return fieldName;
	}
	
	public Object getFieldValue() {
		return fieldValue;
	}
	
	 

	
}

