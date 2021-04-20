package com.lwh.my02.entity;


import lombok.Data;

/**
 * @author 李文浩
 * @create 2021-04-15 22:19:13
 */
@Data
public class HistoricalNetValue {
    private String fundCode;
    private String fundDate;
    private String netAssetValue;
    private String cumulativeNetValue;
    private String dayOfGrowth;
    private String subscriptionStatus;
    private String redemptionStatus;
    private String dividendDistribution;
}