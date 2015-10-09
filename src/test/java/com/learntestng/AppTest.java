package com.learntestng;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
//run java file from command prompt-maven
//run testng.xml from maven comd line
//generate surefire reports
//generate xslt reports with maven
//in order to run it from the command propmt u will need maven surefire plugin.we will add taht plugin in pom.xml
//commands to use with maven
//mvn archetype:generate
//mvn eclipse:eclipse
//generate M2_REPO var
//mvn compile
//mvn eclipse:eclipse
//mvn test
//If u want to generate surefore reports use
//mvn surefire-report:report
//mvn test site-by this u will get other reports as well
//If u want to generate xslt reports u have to put a plugin in pom.xml for that,which is called testng plugin
//for xslt reports give the  command mvn test site and u will see the xslt reports in site folder
public class AppTest {
	
	@Test
	public void SendMail()
	{
		System.out.println("******Sending email*******");
	}
	//mvn test site-to run the test from cmd with maven
}
    