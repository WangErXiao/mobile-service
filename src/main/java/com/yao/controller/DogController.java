package com.yao.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.yao.model.Dog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 15-4-3.
 */
@RestController
@RequestMapping("/dog")
public class DogController {
    @RequestMapping("/dogs")
    @ResponseBody
    private List<Dog> dogs(){
        Dog dog1=new Dog(){
            {
                setName("dog1");
                setColor("yellow");
            }
        };
        Dog dog2=new Dog(){
            {
                setName("dog2");
                setColor("black");
            }
        };
        List<Dog>result=new ArrayList<Dog>();
        result.add(dog1);
        result.add(dog2);
        return result;
    }
    @RequestMapping(value="/yellow", method= RequestMethod.GET)
    public @ResponseBody Dog yellow(){
        Dog dog=new Dog(){
            {
                setName("dog1");
                setColor("yellow");
            }
        };
        return dog;
    }
}
