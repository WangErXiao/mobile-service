package com.yao.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by root on 15-4-3.
 */
@XmlRootElement(name="dogList")
public class DogList {
    private List<Dog>dogs;

    @XmlElement(name="dog")
    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }
}
