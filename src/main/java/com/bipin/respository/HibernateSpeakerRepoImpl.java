package com.bipin.respository;

import com.bipin.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepoImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll()
    {
        List<Speaker> speakers=new ArrayList<>();
        Speaker speaker=new Speaker();
        speaker.setFirstName("Bipin");
        speaker.setLastName("Kumar");
        speakers.add(speaker);
        return speakers;
    }
}
