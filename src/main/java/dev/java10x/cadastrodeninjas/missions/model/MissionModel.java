package dev.java10x.cadastrodeninjas.missions.model;

import dev.java10x.cadastrodeninjas.ninjas.model.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_missions")
public class MissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mission;
    private String level;
    @OneToMany(mappedBy = "missions")
    private List<NinjaModel> ninjas;
}
