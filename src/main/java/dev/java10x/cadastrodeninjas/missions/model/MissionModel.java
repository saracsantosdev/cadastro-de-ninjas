package dev.java10x.cadastrodeninjas.missions.model;

import dev.java10x.cadastrodeninjas.ninjas.model.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="tb_missions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mission;
    private String level;
    @OneToMany(mappedBy = "missions")
    private List<NinjaModel> ninjas;
}
