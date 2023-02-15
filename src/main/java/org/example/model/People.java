package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class People {

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
