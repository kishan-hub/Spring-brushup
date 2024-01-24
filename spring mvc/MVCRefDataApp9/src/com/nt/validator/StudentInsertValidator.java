package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.RegistrationCommand;

public class StudentInsertValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.isAssignableFrom(RegistrationCommand.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		//type casting
		RegistrationCommand cmd=(RegistrationCommand)command;
		//form validations
		if(cmd.getSno()<=0)
		  errors.rejectValue("sno","sno.invalid");
		if(cmd.getSname().equals("") || cmd.getSname()==null)
			errors.rejectValue("sname", "sname.required");
		}

}
