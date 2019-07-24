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
public class Mission {

    private Long missionId;

    private String missionName;

    private String missionIntro;

    private Long missionIntegral;

    private String missionPath; // 任务来源

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private boolean missionValid;


}
