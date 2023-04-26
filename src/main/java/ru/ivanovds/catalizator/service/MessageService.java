package ru.ivanovds.catalizator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.ivanovds.catalizator.domain.Message;
import ru.ivanovds.catalizator.repository.MessageRepository;

@Service
@RequiredArgsConstructor
public class MessageService {

    @Autowired
    private final MessageRepository repository;

    public Flux<Message> list() {
        return repository.findAll();
    }

    public Mono<Message> addOne(Message message) {
        return repository.save(message);
    }
}
