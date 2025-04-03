package com.bridgeLabz.testing;

import com.bridgeLabz.basicTesting.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTesting {
    @BeforeEach
    public void getstart(){
        DatabaseConnection.connect();
    }
    @AfterEach
    public void teardown(){
        DatabaseConnection.disconnect();
    }
    @Test
    public void shouldCheckDatabaseIsReadyToConnect(){
        String result = DatabaseConnection.connect();
        String expected = "Connecting to database";
        Assertions.assertEquals(expected,result) ;
    }
    @Test
    public void shouldCheckDatabaseIsReadyToDisConnect(){
        String result = DatabaseConnection.disconnect();
        String expected = "Database Disconnected";
        Assertions.assertEquals(expected,result) ;
    }

}
