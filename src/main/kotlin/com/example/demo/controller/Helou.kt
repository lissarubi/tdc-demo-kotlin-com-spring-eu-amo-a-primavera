package com.example.demo.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MeuController {
    @GetMapping("/")
    fun resposta(): ResponseEntity<String> {
        return ResponseEntity.ok("deu certo!")
    }
}