package fsb.aoc.clubmicroservice.web;

import fsb.aoc.clubmicroservice.entities.Club;
import fsb.aoc.clubmicroservice.repositories.ClubRepository;
import fsb.aoc.clubmicroservice.services.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ClubController {

    @Autowired
    ClubRepository clubRepository;

    @Autowired
    ClubService clubService;

    @PostMapping("/clubs")
    public void ajouter(@RequestBody Club club){
        clubRepository.save(club);
    }

    @GetMapping("/clubs")
    public List<Club> getAll(){
        return clubRepository.findAll();
    }

    @DeleteMapping("/clubs/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        clubRepository.deleteById(id);
    }

    @PutMapping("/clubs/{id}")
    public void update(@PathVariable(name = "id") Long id, @RequestBody Club club){
        clubService.update(id, club);
    }

    @GetMapping("/clubs/byLName")
    public List<Club> findByName(@RequestParam(name = "LName") String leaderName){
        return clubRepository.findByLeaderName(leaderName);
    }

}
