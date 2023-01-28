package com.sninfotech.app.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sninfotech.app.model.CaptchaResponse;

@Component
public class CaptchaValidator {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public boolean isValidCaptcha(String captcha) {
		
		String url="https://www.google.com/recaptcha/api/siteverify";
		String params="?secret=6LfisjsaAAAAAF8ZsWeSH3YPrWnzFTCSaQIodQ6J&response="+captcha;
		String completeUrl=url+params;
		CaptchaResponse resp=restTemplate.postForObject(completeUrl,null,CaptchaResponse.class);
		return resp.isSuccess();
	}

}
