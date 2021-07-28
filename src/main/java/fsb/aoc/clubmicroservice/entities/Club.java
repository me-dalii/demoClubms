package fsb.aoc.clubmicroservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Club {
    @Id @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String leaderName;
}