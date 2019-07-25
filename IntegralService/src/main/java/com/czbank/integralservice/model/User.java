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
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Long userId;

    private String account;

    private String password;

    private String name;

    private String salt;

    private Integer userType;

    private Integer integralAmount;

    private Integer integralHistoryAmount;

    private String telNumber;

    private String address;

}