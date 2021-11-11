package br.com.mv.cafeDaManha.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "alimento")
@Table(name = "alimento")
@Data
@NoArgsConstructor
public class Alimentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String[]alimentos = new String[10];
}
