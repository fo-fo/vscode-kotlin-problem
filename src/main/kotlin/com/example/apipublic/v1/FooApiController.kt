package com.example.apipublic.v1

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// This import sometimes works, and sometimes doesn't, in VSCode. (However,
// FooApi should be referenceable even without the import because this code is
// in the same package as FooApi.)
import com.example.apipublic.v1.FooApi;

@RestController
@RequestMapping("/api/example")
open class FooApiController() : FooApi {
    override fun fooGet(): ResponseEntity<String> {
        return ResponseEntity.ok("hello world")
    }
}
