package com.devjav.dao;

import com.devjav.domain.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Shishkov A.V. on 29.09.2014.
 */
@Component
public class QuestionDAO {
    @Autowired
    SessionFactory sesionFactory;

    public Question insert(Question question) {
        Session session = sesionFactory.getCurrentSession();
        session.save(question);
        return question;
    }

    public Question update(Question question) {
        Session session = sesionFactory.getCurrentSession();
        session.update(question);
        return question;
    }

    @SuppressWarnings("unchecked")
    public List listAll() {
        Session session = sesionFactory.getCurrentSession();
        return session.createCriteria(Question.class).list();
    }

}
