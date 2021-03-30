package be.technifutur.deploy.service;

import be.technifutur.deploy.dto.FlowerDTO;
import be.technifutur.deploy.entity.Flower;
import be.technifutur.deploy.mapper.Mapper;
import be.technifutur.deploy.repository.FlowerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlowerService {

    private final FlowerRepository repository;
    private final Mapper mapper;

    public FlowerService(FlowerRepository repository, Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<FlowerDTO> getAllFlowers() {
        return this.repository.findAll()
                .stream()
                .map(mapper::toFlowerDTO)
                .collect(Collectors.toList());
    }

    public boolean insert(Flower flower) {
        if (flower != null) {
            Flower inserted = this.repository.save(flower);
            return this.repository.existsById(inserted.getId());
        }
        return false;
    }
}
