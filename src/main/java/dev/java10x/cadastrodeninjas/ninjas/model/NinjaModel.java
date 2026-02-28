package dev.java10x.cadastrodeninjas.ninjas.model;

import dev.java10x.cadastrodeninjas.missions.model.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
