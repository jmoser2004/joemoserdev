package dev.joemoser.backend.chatgpt;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMessagesRepository extends JpaRepository<UserMessages, Integer>
{
    
}
