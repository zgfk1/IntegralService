package com.czbank.integralservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author Han
 * @date 2019.7.24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Exchange {
    private Long exchangeId;

    private Long userId;

    private Long commodityId;

    private Integer exchangeQuantity;

    private LocalDateTime exchangeTime;

    private Long amountBefore;

    private Long amountAfter;

    private String deliveryAddress;

    private String userContact;
}
