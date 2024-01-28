package com.qa.test

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.nio.channels.SelectableChannel

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.console.ui.SystemOutputInterceptor
import internal.GlobalVariable

public class customFunctions {
	@Keyword
	def printHello() {
		println("\nhello world\n");
	}

	@Keyword
	def CheckDropDownListElementExist(TestObject object,String option) {
		boolean flag = false;

		WebElement element  = WebUiCommonHelper.findWebElement(object, 20);

		Select ddl  = new Select(element)

		for(WebElement ele : ddl.getOptions()) {
			if(ele.getText().equals(option)) {
				System.out.println("Element Exists");
				flag=true;
				break;
			}
			else {
				System.out.println("Element not Exists");
			}
		}
		return flag;
	}
}
