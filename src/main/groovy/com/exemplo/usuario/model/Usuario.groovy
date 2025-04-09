package com.exemplo.usuario.model

import jakarta.persistence.*
import jakarta.validation.constraints.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp

@Entity
class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    @NotBlank(message = "Nome é obrigatório!")
    String nome
    
    @Min(value = 0L, message = "Idade deve ser maior que 0")
    Integer idade

    @NotBlank(message = "Cidade é obrigatória!")
    String cidade

    @NotBlank(message = "Estado é obrigatório!")
    String estado

    @NotBlank(message = "País é obrigatório!")    
    String pais

    @NotBlank(message = "CEP é obrigatório!")
    String cep

    @Email(message = "Email inválido!")
    @NotBlank(message = "Email é obrigatório!")
    String email

    @NotNull(message = "Cargo é obrigatório!")
    @Enumerated(EnumType.STRING)
    Cargo cargo

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    Date createdAt

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    Date updatedAt
}
