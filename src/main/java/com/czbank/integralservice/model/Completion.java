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
public class Completion {

    private Long completionId;

    private Long userId;

    private Long missionId;

    private LocalDateTime completionTime;

    private Long amountBefore;

    private Long amountAfter;
}
