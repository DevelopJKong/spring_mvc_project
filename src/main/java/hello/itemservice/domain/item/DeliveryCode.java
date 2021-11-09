package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * FAST : 빠른 배송
 * NOMAL : 일반 배송
 * SLOW :
 */

@Data
@AllArgsConstructor
public class DeliveryCode {

    private String code;
    private String displayName;

}
