package com.bridgeLabz.advTesting;

import com.bridgeLabz.advtesting.PasswordValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PasswordValidationTesting {
    @ParameterizedTest
    @ValueSource(strings = {"Harman_","HdiasgfdgknsdifH232","1hhakkdaskagihiI"})
    public void passwordStrengthValidatorTest(String s){
        Assertions.assertTrue(PasswordValidation.passwordStrengthValidator(s));
    }
}