package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;

    public Rejected(Cook aggregate) {
        super(aggregate);
    }

    public Rejected() {
        super();
    }
}
