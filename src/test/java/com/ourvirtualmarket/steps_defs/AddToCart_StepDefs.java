package com.ourvirtualmarket.steps_defs;

import com.ourvirtualmarket.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();


    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() {
        dashboardPage.closePopUp();
    }
    @When("The user go to the Networking module")
    public void the_user_go_to_the_networking_module() {

    }
    @When("The user select the third product")
    public void the_user_select_the_third_product() {

    }
    @Then("The user should be able to see the product name, brand name, views number on the product page")
    public void the_user_should_be_able_to_see_the_product_name_brand_name_views_number_on_the_product_page() {

    }
    @Then("The user should be able to see add to cart button and buy now button")
    public void the_user_should_be_able_to_see_add_to_cart_button_and_buy_now_button() {

    }
    @When("The user clicks add to cart button")
    public void the_user_clicks_add_to_cart_button() {

    }
    @Then("The user should be able to see the pop up about added product")
    public void the_user_should_be_able_to_see_the_pop_up_about_added_product() {

    }
    @When("The user navigates to shopping cart icon on dashboard page")
    public void the_user_navigates_to_shopping_cart_icon_on_dashboard_page() {

    }
    @Then("The user should be able to see added product in the shopping cart")
    public void the_user_should_be_able_to_see_added_product_in_the_shopping_cart() {

    }

}
