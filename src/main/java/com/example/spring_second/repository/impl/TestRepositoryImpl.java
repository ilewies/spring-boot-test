package com.example.spring_second.repository.impl;

import com.example.spring_second.repository.TestRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by user on 3/2/19.
 */
@Repository
public class TestRepositoryImpl implements TestRepository{
    @Override
    public void doPrint() {
        System.out.println("test contructor no autowired");
    }
}
