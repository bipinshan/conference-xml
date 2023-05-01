package com.bipin.service;

import com.bipin.model.Speaker;
import com.bipin.respository.HibernateSpeakerRepoImpl;
import com.bipin.respository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;
    public SpeakerServiceImpl(){

    }
    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll()
    {
        return repository.findAll();
    }
}
