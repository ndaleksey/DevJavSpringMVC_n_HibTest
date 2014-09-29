package com.devjav.service;

import com.devjav.dao.QuestionDAO;
import com.devjav.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Shishkov A.V. on 29.09.2014.
 */
@Component
public class QuestionService {
    @Autowired
    private QuestionDAO questionDAO;

    @Transactional(readOnly = true)
    public List listAll() {
        return questionDAO.listAll();
    }
    @Transactional(rollbackFor = {Exception.class})
    public Question insert(Question question) {
        return questionDAO.insert(question);
    }
}
