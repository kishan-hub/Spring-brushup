package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.StudentCommand;

public class StudentInsertValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.isAssignableFrom(StudentCommand.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		//type casting
		StudentCommand cmd=(StudentCommand)command;
		//form validations
		if(cmd.getSno()<=0)
		  errors.rejectValue("sno","sno.invalid");
		if(cmd.getSname().equals("") || cmd.getSname()==null)
			errors.rejectValue("sname", "sname.required");
		if(cmd.getSadd().equals("") || cmd.getSadd()==null)
			errors.rejectValue("sadd", "sadd.required");
		else{
			if(cmd.getSadd().length()<3){
				errors.rejectValue("sadd","sadd.minlength");
			}
		}
		
	}

}
