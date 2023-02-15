package org.example.model;

import lombok.Getter;
import lombok.Setter;
import org.example.model.People;

import java.util.List;
@Getter
@Setter
public class Root {
    private String name;
    private List<People> people;
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", peopleList=" + people +
                '}';
    }
}
