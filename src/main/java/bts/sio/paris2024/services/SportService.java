package bts.sio.paris2024.services;

import bts.sio.paris2024.repositories.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportService {
    @Autowired
    private SportRepository sportRepository;

    public Iterable<bts.sio.paris2024.models.Sport> getLesSports() {
        return sportRepository.findAll();
    }

}
