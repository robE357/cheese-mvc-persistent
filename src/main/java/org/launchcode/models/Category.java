package org.launchcode.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {


    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3,max=15)
    private String name;


    // Add public getter for name and id
    public String getName() { return name; }
    public int getId() { return id; }
    // Add public setter for name
    public void setName(String newName) { this.name = newName; }


    //Add constructors
    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }

    //TODO add private
    /**
     * Within Category, add a private property cheeses of type List<Cheese> and initialize it to an empty ArrayList. After we set up the Cheese class to work with Category objects, this list will represent the list of all items in a given category. We'll do this in a bit.
     *
     * Add the following annotations:
     *
     * @OneToMany
     * @JoinColumn(name = "category_id")
     * private List<Cheese> cheeses = new ArrayList<>();
     */
    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Cheese> cheeses = new ArrayList<>();
}
