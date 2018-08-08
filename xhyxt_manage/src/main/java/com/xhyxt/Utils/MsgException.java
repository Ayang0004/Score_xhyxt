package com.xhyxt.Utils;

public class MsgException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1749433973524725374L;

	public MsgException(){
		super();
	}
	
	public MsgException(String msg){
		super(msg);
	}
}
