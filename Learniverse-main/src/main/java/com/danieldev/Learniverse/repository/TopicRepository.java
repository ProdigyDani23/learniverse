package com.danieldev.Learniverse.repository;


import com.danieldev.Learniverse.model.Subtopic;
import com.danieldev.Learniverse.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository <Topic, Long> {

}
