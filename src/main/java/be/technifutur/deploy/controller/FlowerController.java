package be.technifutur.deploy.controller;

import be.technifutur.deploy.dto.FlowerDTO;
import be.technifutur.deploy.entity.Flower;
import be.technifutur.deploy.service.FlowerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/flowers")
public class FlowerController {

    private final FlowerService flowerService;

    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<FlowerDTO> getAllFlowers() {
        return this.flowerService.getAllFlowers();
    }

    @PostMapping
    public Boolean insert(@RequestBody Flower flower) {
        return this.flowerService.insert(flower);
    }
}
