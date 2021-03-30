package be.technifutur.deploy.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor @AllArgsConstructor
@Builder
public class FlowerDTO {
    Integer id;
    String name;
}
