package com.exemplo.usuario.controller

import com.exemplo.usuario.model.Usuario
import com.exemplo.usuario.repository.UsuarioRepository
import org.springframework.web.bind.annotation.*
import jakarta.validation.Valid

@RestController
@RequestMapping("/usuarios")
class UsuarioController {

    private final UsuarioRepository repository

    UsuarioController(UsuarioRepository repository) {
        this.repository = repository
    }

    @GetMapping
    List<Usuario> listar() {
        repository.findAll()
    }

    @GetMapping("/{id}")
    Usuario buscar(@PathVariable Long id) {
        repository.findById(id).orElseThrow {
            new RuntimeException("Usuário não encontrado com ID: $id")
        }
    }

    @PostMapping
    Usuario criar(@Valid @RequestBody Usuario usuario) {
        repository.save(usuario)
    }

    @PutMapping("/{id}")
    Usuario atualizar(@PathVariable Long id, @Valid @RequestBody Usuario dadosAtualizados) {
        def usuario = repository.findById(id).orElseThrow {
            new RuntimeException("Usuário não encontrado com ID: $id")
        }

        usuario.nome = dadosAtualizados.nome
        usuario.idade = dadosAtualizados.idade
        usuario.cidade = dadosAtualizados.cidade
        usuario.estado = dadosAtualizados.estado
        usuario.pais = dadosAtualizados.pais
        usuario.cep = dadosAtualizados.cep
        usuario.email = dadosAtualizados.email
        usuario.cargo = dadosAtualizados.cargo

        repository.save(usuario)
    }

    @DeleteMapping("/{id}")
    void deletar(@PathVariable Long id) {
        repository.deleteById(id)
    }
}
