package structural.composite.entities;


import java.time.LocalDate;

public class User {

    private String name;
    private LocalDate birth;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public User setBirth(LocalDate birth) {
        this.birth = birth;
        return this;
    }
}
