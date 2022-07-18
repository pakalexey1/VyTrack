package com.cydeo.tests;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class VyTrackLoginDDTTest extends BasePage {

    LoginPage loginPage = new LoginPage();

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login"));
    }

    @Test
    public void loginDDTTest() throws IOException {

        String filePath = "VyTrackUsers.xlsx";
        FileInputStream input = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(input);
        XSSFSheet sheet = workbook.getSheet("data");

        for(int i = 1; i <= sheet.getLastRowNum(); i++){

            String username = sheet.getRow(i).getCell(0).toString();
            String password = sheet.getRow(i).getCell(1).toString();
            String firstname = sheet.getRow(i).getCell(2).toString();
            String lastname = sheet.getRow(i).getCell(3).toString();

            loginPage.usernameBox.sendKeys(username);
            loginPage.passwordBox.sendKeys(password);
            loginPage.submitButton.click();

            getWait10().until(ExpectedConditions.visibilityOf(logout_dropdown));
            String actualFullName = logout_dropdown.getText();

            XSSFCell resultCell = sheet.getRow(i).getCell(4);

            if((actualFullName.contains(firstname) && (actualFullName.contains(lastname)))){
                System.out.println("PASS");
                resultCell.setCellValue("PASS");
            } else{
                System.out.println("FAIL: actualFullName " +  actualFullName + "| expected: " + firstname + " " + lastname);
                resultCell.setCellValue("FAIL");
            }

            logout();
        }

        FileOutputStream output = new FileOutputStream(filePath);
        workbook.write(output);

        input.close();
        output.close();
        workbook.close();
    }
}
