package com.czbank.integralservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Han
 * @date 2019.7.24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Commodity {
    private Long commodityId;

    private String commodityName;

    private Long integralNum;

    private Long amount;

    private Integer exchangeNum;

    private Integer availableNum;

    private String intro;

    private String picture;
}
