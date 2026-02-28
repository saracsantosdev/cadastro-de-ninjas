package dev.java10x.cadastrodeninjas.ninjas.model;

import dev.java10x.cadastrodeninjas.missions.model.MissionModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String email;
    private int age;
    private List<MissionModel> missionModelList;
    @ManyToOne
    @JoinColumn(name = "missions_id")
    private MissionModel missions;

    public NinjaModel() {
    }

    public NinjaModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
