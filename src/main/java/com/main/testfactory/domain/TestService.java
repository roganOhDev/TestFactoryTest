package com.main.testfactory.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TestService {
    private final TestRepository repository;

    @Transactional(readOnly = true)
    public List<Test> get() {
        return repository.findAllById(1L);

    }
}
