package com.optional;

import java.util.Optional;

public class Demo {
	public static void main(String[] args) {
		
		String[] str=new String[10];
		str[5]="null";
		Optional<String> opt=Optional.ofNullable(str[5]);
		if(opt.isPresent()) {
			String lowerCase=str[5].toLowerCase();
			System.out.println(lowerCase);
		}else {
			System.out.println("null");
			System.out.println("jdsj");
		}
	}

}
