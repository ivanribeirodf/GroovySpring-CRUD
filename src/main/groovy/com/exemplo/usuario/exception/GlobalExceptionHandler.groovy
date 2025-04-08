package com.exemplo.usuario.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException)
    ResponseEntity<?> handleValidationException(MethodArgumentNotValidException ex) {
        def erros = ex.bindingResult.fieldErrors.collect {
            "${it.field}: ${it.defaultMessage}"
        }

        def resposta = [
            status: HttpStatus.BAD_REQUEST.value(),
            erros : erros
        ]
        return ResponseEntity.badRequest().body(resposta)
    }

    @ExceptionHandler(Exception)
    ResponseEntity<?> handleGenericException(Exception ex) {
        def resposta = [
            status : HttpStatus.INTERNAL_SERVER_ERROR.value(),
            erro   : "Erro inesperado. Tente novamente mais tarde.",
            detalhe: ex.message
        ]
        return new ResponseEntity<>(resposta, HttpStatus.INTERNAL_SERVER_ERROR)
    }
}
