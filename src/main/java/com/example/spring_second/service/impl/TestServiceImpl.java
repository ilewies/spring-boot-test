package com.example.spring_second.service.impl;

import com.example.spring_second.repository.TestRepository;
import com.example.spring_second.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by user on 3/2/19.
 */
@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;
    @Override
    public void doPrint() {
        testRepository.doPrint();
    }
}
