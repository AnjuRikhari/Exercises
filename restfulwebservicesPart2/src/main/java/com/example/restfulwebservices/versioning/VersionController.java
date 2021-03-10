package com.example.restfulwebservices.versioning;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "This controller has different types of versioning techniques")
@RestController
public class VersionController {

    //MimeType Versioning
    @GetMapping(value = "person/producer", produces = "application/v1+json")
    @ApiOperation(value = "MimeType Versioning Technique", notes = "Which version to use is given to the Accept in Headers")
    public PersonV1 producesV1() {
        return new PersonV1("Tony Stark", 30);
    }

    @GetMapping(value = "person/producer", produces = "application/v2+json")
    public PersonV2 producesV2() {
        return new PersonV2(new Name("Tony", "Stark"), 30);
    }

    //URI versioning
    @GetMapping("v1/person")
    @ApiOperation(value = "Version 1 of API using URI Versioning Technique", notes = "Version 1 of API")
    public PersonV1 personV1() {
        return new PersonV1("Tony Stark", 30);
    }

    @GetMapping("v2/person")
    @ApiOperation(value = "Version 2 of API using URI Versioning Technique", notes = "Version 2 of API")
    public PersonV2 personV2() {
        return new PersonV2(new Name("Tony", "Stark"), 30);
    }

    //Request Parameter versioning
    @GetMapping(value = "person/param", params = "version=1")
    @ApiOperation(value = "Versioning using Request Parameter Versioning Technique", notes = "Version no. is given to the param")
    public PersonV1 paramV1() {
        return new PersonV1("Tony Stark", 30);
    }

    @GetMapping(value = "person/param", params = "version=2")
    @ApiOperation(value = "Versioning using Request Parameter Versioning Technique", notes = "Version no. is given to the param")
    public PersonV2 paramV2() {
        return new PersonV2(new Name("Tony", "Stark"), 30);
    }

    //Custom Header Versioning
    @GetMapping(value = "person/header", headers = "version=1")
    @ApiOperation(value = "Versioning using Custom Header Versioning Technique", notes = "Version no. is given to the header")
    public PersonV1 headerV1() {
        return new PersonV1("Tony Stark", 30);
    }

    @GetMapping(value = "person/header", headers = "version=2")
    public PersonV2 headerV2() {
        return new PersonV2(new Name("Tony", "Stark"), 30);
    }

}
