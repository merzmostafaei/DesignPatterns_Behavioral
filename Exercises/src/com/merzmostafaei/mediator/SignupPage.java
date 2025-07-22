package com.merzmostafaei.mediator;

public class SignupPage {
    private SignUpButton signUpButton = new SignUpButton();
    private CheckAcceptTerm checkAcceptTerm = new CheckAcceptTerm();
    private TextBox userBox = new TextBox();
    private TextBox passwordBox = new TextBox();


    public SignupPage() {
        userBox.addEventHandler(this::updateButtonStage);
        passwordBox.addEventHandler(this::updateButtonStage);
        checkAcceptTerm.addEventHandler(this::updateButtonStage);
    }

    // Mediator logic: only enable button if text is not empty AND terms are accepted
    private void updateButtonStage() {
        String username = userBox.getText();
        String password = passwordBox.getText();

        boolean hasText = username != null && !username.isEmpty();
        boolean haspass = password != null && !password.isEmpty();
        boolean termsAccepted = checkAcceptTerm.isCheck();

        signUpButton.setEnabled(hasText && haspass && termsAccepted);
    }


    public void simulateUserInteraction(){
        // Simulate input
        userBox.setText("username");
        passwordBox.setText("password");
        checkAcceptTerm.setCheck(true); // Must call setter to trigger update

        // Try clicking the button
        System.out.println("Username: " + userBox.getText());


        signUpButton.click();
    }




}
