package com.itmuch.gateway;

import lombok.Data;

import java.time.LocalTime;

/**
 * 自定义谓词工厂配置
 *
 * @author JavaEdge
 * @date 2019/12/10
 */
@Data
public class TimeBetweenConfig {
    private LocalTime start;
    private LocalTime end;
}
