package com.coblah.ruftkeks_spring.api
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/contents")
class ContentsController {
    @GetMapping()
    fun index() : ResponseEntity<String> {
        val hello = "Hello World"
        return ResponseEntity.ok(hello)
    }
}