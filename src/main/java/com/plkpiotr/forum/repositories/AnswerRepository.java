package com.plkpiotr.forum.repositories;

import com.plkpiotr.forum.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

    Long countAnswersByUser_Id(Long id);
    Long countAnswersByUser_IdAndUseful(Long user_id, boolean useful);
    Long countAnswerByTopic_Id(Long topic_id);

    List<Answer> findAnswerByUser_IdOrderByCreatedDateDesc(Long id);
    List<Answer> findAnswerByUser_IdAndUsefulOrderByCreatedDateDesc(Long user_id, boolean useful);
    List<Answer> findAnswerByTopic_Id(Long topic_id);
}