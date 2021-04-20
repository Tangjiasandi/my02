package com.lwh.my02.entity;


import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 李文浩
 * @create 2021-04-15 22:19:12
 */
@Data
public class FundRateReturn {
    private String fundCode;
    private String fundDate;
    private String netAssetValue;
    private BigDecimal lastOneDayRate;
    private BigDecimal lastOneMonthRate;
    private BigDecimal lastThreeMonthRate;
    private BigDecimal lastSixMonthRate;
    private BigDecimal lastOneYearRate;
    private BigDecimal lastThreeYearRate;
    private BigDecimal setupDateRate;
}