package br.com.mv.cafeDaManha.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "cafeDaManha")
@Table(name = "cafeDaManha")
@Data
@NoArgsConstructor
public class CafeDaManhaTeste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date;
    private String[]alimentos = new String[10];
}
