package com.fb.login;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\test\\resources",
		glue = "com.fb.login",
		plugin = {"html:target/index.html"}
		)
public class TestRunner {
	
}
