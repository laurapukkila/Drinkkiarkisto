package wad.drinkkikirjasto;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Drink extends AbstractPersistable<Long> {

    private String name;
    private String glass;
    private String color;
    private double percentage;
}
