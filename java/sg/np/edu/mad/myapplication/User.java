package sg.np.edu.mad.myapplication;

import java.util.*;

public class User {
    public String name;
    public String description;
    public Integer id;
    public Boolean followed;

    //create a constructor for name, description, etc.
    public User(String name, String description, Integer id, Boolean followed){
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }
}
