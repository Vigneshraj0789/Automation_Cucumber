package com.Runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		     features = {"src\\test\\java\\com\\Features\\sign.feature"},
		     glue = {"com.StepDefinition","com.Hooks"},
		     dryRun = !true,
		     snippets = SnippetType.CAMELCASE,
		     plugin = {"pretty",
		    		 "html:target/login.html",
		    		 "json:target/login.json",
		    		 "junit:target/login.xml"
		     }
//		     tags = "@smoke"
		     
		     
	
		
		)

public class Test_Runner {

}
