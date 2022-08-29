package com.revature.service;

import com.revature.dao.UserDao;
import com.revature.exceptions.InvalidLoginException;
import com.revature.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthenticationServiceTest {

    // Positive test case (valid login)
    @Test
    public void testValidLogin() throws SQLException, InvalidLoginException {
        // When it comes to unit testing,
        // follow the AAA acronym
        // Arrange, Act, Assert

        /*
            Arrange: setup required objects and mock return values for unit test
         */
        // Mock the DAO layer
        UserDao mockUserDao = mock(UserDao.class); // fake UserDao object

        // Mock return data from UserDao
        when(mockUserDao.getUserByUsernameAndPassword(eq("test123"), eq("test")))
                .thenReturn(new User(100, "test123", "test", "test@email.com"));

        AuthenticationService authService = new AuthenticationService(mockUserDao);

        /*
            Act
         */
        User actual = authService.login("test123", "test");

        /*
            Assert
         */
        User expected = new User(100, "test123", "test", "test@email.com");

        Assert.assertEquals(actual, expected);
    }

}
