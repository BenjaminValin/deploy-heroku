package be.technifutur.deploy.mapper;

import be.technifutur.deploy.dto.FlowerDTO;
import be.technifutur.deploy.entity.Flower;
import org.springframework.stereotype.Service;

@Service
public class Mapper {

    public FlowerDTO toFlowerDTO (Flower entity) {
        return entity != null ? FlowerDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build() : null;
    }

    public Flower toFlowerEntity (FlowerDTO dto) {
        return dto != null ? Flower.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build() : null;
    }
}
