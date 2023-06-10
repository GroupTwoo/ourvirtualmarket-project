package com.ourvirtualmarket.pages;


import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    //burası BasePage

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


}

