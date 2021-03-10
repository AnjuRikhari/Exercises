package com.example.restfulwebservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(description = "Handles all the User request")
@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping("/static")
    public List<User> staticFilter() {
        return userDaoService.getAllUsers();
    }

    @GetMapping("/dynamic")
    public MappingJacksonValue dynamicFilter() {
        List<User> users = userDaoService.getAllUsers();
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("username", "age");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("userDTO", filter);
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(users);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }
}
