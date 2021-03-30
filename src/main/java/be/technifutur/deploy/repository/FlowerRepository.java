package be.technifutur.deploy.repository;

import be.technifutur.deploy.entity.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
