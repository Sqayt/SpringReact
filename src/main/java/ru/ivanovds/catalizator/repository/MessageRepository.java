package ru.ivanovds.catalizator.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ru.ivanovds.catalizator.domain.Message;

public interface MessageRepository extends ReactiveCrudRepository<Message, Long> {
}
