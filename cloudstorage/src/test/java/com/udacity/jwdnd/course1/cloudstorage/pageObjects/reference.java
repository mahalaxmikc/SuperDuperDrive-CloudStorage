package com.udacity.jwdnd.course1.cloudstorage.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import javax.swing.*;

public class reference {
    public reference(WebDriver driver){
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//*[@id=\"nav-credentials\"]//tbody/tr/th")
    private WebElement credentialUrlText;


    @FindBy(id = "add-credential")
    private WebElement addCredentialButton;



    @FindBy(xpath = "//*[@id=\"nav-credentials\"]//tbody/tr/td/a")
    private WebElement deleteCredentialButton;



    @FindBy(xpath = "//*[@id=\"nav-credentials\"]//tbody/tr/td/button")
    private WebElement editCredentialButton;

    @FindBy(xpath = "//*[@id=\"nav-credentials\"]//tbody/tr/td[2]")
    private WebElement credentialUsername;

    @FindBy(xpath = "//*[@id=\"nav-credentials\"]//tbody/tr/td[3]")
    private WebElement credentialPassword;


    @FindBy(id = "credential-username")
    private WebElement credentialName;

    @FindBy(id = "credential-password")
    private WebElement credentialPass;

    @FindBy(id = "SubmitCredential")
    private WebElement credentialSubmit;

    @FindBy(id = "credential-url")
    private WebElement credentialUrl;

    @FindBy(id = "nav-credentials-tab")
    private WebElement credentialTab;

    public WebElement getCredentialName() {
        return credentialName;
    }

    public WebElement getCredentialPass() {
        return credentialPass;
    }

    public WebElement getCredentialUrl() {
        return credentialUrl;
    }

    public WebElement getAddCredentialButton() {
        return addCredentialButton;
    }

    public WebElement getCredentialSubmit() {
        return credentialSubmit;
    }

    public void createNewCredential(String url, String name, String pass){
        credentialUrl.sendKeys(url);
        credentialName.sendKeys(name);
        credentialPass.sendKeys(pass);
        credentialSubmit.click();
    }

    public void editCredential(String url,String user, String pass){
        credentialUrl.clear();
        credentialName.clear();
        credentialPass.clear();
        createNewCredential(url, user,pass);
    }

    public WebElement getEditCredentialButton() {
        return editCredentialButton;
    }

    public WebElement getDeleteCredentialButton() {
        return deleteCredentialButton;
    }

    public WebElement getCredentialTab() {
        return credentialTab;
    }

    public WebElement getCredentialUsername() {
        return credentialUsername;
    }

    public String getCredentialPassword() {
        return credentialPassword.getText();
    }

    public WebElement getCredentialUrlText() {
        return credentialUrlText;
    }










}

