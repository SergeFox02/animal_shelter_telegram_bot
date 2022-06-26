package pro.sky.animal_shelter_telegram_bot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Animal {

    @Id
    @GeneratedValue
    private Long id;
    private String animalName;
    private int animalAge;

    public Animal() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id.equals(animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", animalName='" + animalName + '\'' +
                ", animalAge=" + animalAge +
                '}';
    }
}
