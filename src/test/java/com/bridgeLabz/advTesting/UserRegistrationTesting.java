package com.bridgeLabz.advTesting;

import com.bridgeLabz.advtesting.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTesting {
    @Test
    public void shouldCheckIfUserProvidedValidUserDetails(){
        boolean result = UserRegistration.registerUser("Harman Veer Singh","harman@gmail.com","Harman@124");
        Assertions.assertTrue(result);
    }
    @Test
    public void shouldThrowExceptionForInvalidUsername() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("Harman23", "Harman@outlook.com", "Password123");
        });
    }
}
