package com.krafttech.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenu_StepDefs {


    @Then("Get the text of Dashboard")
    public void get_the_text_of_dashboard() {
        System.out.println("verify dashboard ");
    }
    @When("Go to Developers menu")
    public void go_to_developers_menu() {
        System.out.println("navigate to developers menu");
    }
    @Then("Get the text of Developer")
    public void get_the_text_of_developer() {
        System.out.println("verify developer");
    }

    @When("Go to Edit Profile menu")
    public void goToEditProfileMenu() {
        System.out.println("navigate to Edit Profile menu");
    }

    @Then("Get the text of Edit User profile")
    public void getTheTextOfEditUserProfile() {
        System.out.println("verify User profile");
    }

    @When("Go to MyProfile menu")
    public void goToMyProfileMenu() {
        System.out.println("navigate to MyProfile menu");
    }

    @Then("Get the text of User profile")
    public void getTheTextOfUserProfile() {
        System.out.println("verify User profile");
    }
}
