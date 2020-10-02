package hiber.model;

import javax.persistence.*;

@Entity
public class Car {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column
    private String model;

    @Column
    private int series;

    @OneToOne(optional = true, mappedBy = "car")
    private User person;

    public User getUser() {
        return person;
    }

    public void setUser(User user) {
        this.person = user;
    }



    public Car(){

    }


    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }




}
