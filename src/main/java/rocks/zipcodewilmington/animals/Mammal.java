package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public abstract class Mammal implements Animal {
    private Integer id;
    private ArrayList<Food> eatenMeals;
    private String name;
    private Date birthDate;

    public Mammal(String name, Date birthDate, Integer id) {
        this.name = name;
        this.birthDate = birthDate;
        this.eatenMeals = new ArrayList<>();
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return birthDate;
    }


    public Integer getNumberOfMealsEaten() {
        return eatenMeals.size();
    }

    public Integer eat(Food food) {
        eatenMeals.add(food);
        return getNumberOfMealsEaten();
    }

    @Override
    public Integer getId() {
        return id;
    }


    public Integer setID(int i) {
        this.id = id;
        return id;
    }
}
