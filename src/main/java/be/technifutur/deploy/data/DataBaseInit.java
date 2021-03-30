package be.technifutur.deploy.data;

import be.technifutur.deploy.entity.Flower;
import be.technifutur.deploy.service.FlowerService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataBaseInit implements InitializingBean {

    private final FlowerService flowerService;

    private List<Flower> flowers = Arrays.asList(
            Flower.builder()
                    .name("Rose")
                    .build(),
            Flower.builder()
                    .name("Violette")
                    .build(),
            Flower.builder()
                    .name("Marguerite")
                    .build()
    );

    public DataBaseInit(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        flowers.forEach(flowerService::insert);
    }
}
