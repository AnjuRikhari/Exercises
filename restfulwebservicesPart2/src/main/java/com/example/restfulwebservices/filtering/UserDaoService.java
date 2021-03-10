package com.example.restfulwebservices.filtering;

import com.example.restfulwebservices.employee.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 3;

    static {
        users.add(new User("Harry", "Harry@1", 25));
        users.add(new User("Smith", "Smith@2", 28));
        users.add(new User("Clark", "Clark@3", 30));
    }

    public List<User> getAllUsers() {
        return users;
    }
}
