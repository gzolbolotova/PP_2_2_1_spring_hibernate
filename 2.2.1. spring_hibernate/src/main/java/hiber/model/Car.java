package hiber.model;

//import jakarta.persistence.*;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @OneToOne(mappedBy = "car")
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;


    public Car(){}

    public Car(String model, int series){
        this.model = model;
        this.series = series;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
