package hiber.model;

//import jakarta.persistence.*;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id=" + Id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
