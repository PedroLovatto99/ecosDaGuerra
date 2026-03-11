package com.projeto.Batalhas;
import com.projeto.Teatros.TeatroModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "batalhas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BatalhaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Date dataInicio;

    private Date dataFim;

    @ManyToOne
    @JoinColumn(name = "teatro_id")
    private TeatroModel teatro;

    @Enumerated(EnumType.STRING)
    private BatalhaResultado resultado;




}
