package com.cognizant.cover;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class CoverController {

    @GetMapping
    Iterable<?> list(){
        return Collections.emptyList();
    }
}
