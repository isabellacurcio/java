package br.unisinos.ecommerce.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

//criando uma entidade , especificando que esta classe é uma entidade no banco de dados
@Entity


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produto {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable= false,length= 100)
    private String nome;

    @Column(length= 500)
    private String descricao;

    @Column(nullable= false, precision= 10, scale = 2)
    private BigDecimal preco;

    @Column (nullable= false)
    private Integer estoque;



    
}
