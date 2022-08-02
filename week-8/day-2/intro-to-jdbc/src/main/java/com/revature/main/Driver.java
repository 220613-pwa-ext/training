package com.revature.main;

import com.revature.dao.UserDao;
import com.revature.model.User;
import com.revature.utility.ConnectionUtility;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        try {
            System.out.println(userDao.deleteUserById(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
