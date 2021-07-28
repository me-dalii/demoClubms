package fsb.aoc.clubmicroservice.services;

import fsb.aoc.clubmicroservice.entities.Club;
import fsb.aoc.clubmicroservice.repositories.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubServiceImpl implements ClubService{

    @Autowired
    ClubRepository clubRepository;

    @Override
    public void update(Long id, Club club) {
        Club club1 = clubRepository.getById(id);

        if (club.getName() != null)
            club1.setName(club.getName());
        if (club.getLeaderName() != null)
            club1.setLeaderName(club.getLeaderName());

        clubRepository.save(club1);
    }
}
