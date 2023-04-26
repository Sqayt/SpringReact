package ru.ivanovds.catalizator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.ivanovds.catalizator.domain.Message;
import ru.ivanovds.catalizator.service.MessageService;

@RestController
@RequestMapping("/controller")
@RequiredArgsConstructor
public class MainController {

    @Autowired
    private final MessageService service;

    @GetMapping
    public Flux<Message> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return service.list();
    }

    @PostMapping
    public Mono<Message> add(Message message) {
        return service.addOne(message);
    }
}
