package com.yao.controller;

import com.yao.model.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 15-4-3.
 */
@Controller
@RequestMapping("/dog")
public class DogController {
    @RequestMapping("/dogs")
    public String dogs(Model model){
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
        model.addAttribute("dogList",result);
        return "dogList";
    }
}
