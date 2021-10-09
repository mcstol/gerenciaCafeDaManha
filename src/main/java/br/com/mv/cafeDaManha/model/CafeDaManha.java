package br.com.mv.cafeDaManha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "cafeDaManha")
@Table(name = "cafeDaManha")
@Data
@NoArgsConstructor
public class CafeDaManha {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date date;
}
