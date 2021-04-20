package com.lwh.my02.entity;


import lombok.Data;

/**
 * @author 李文浩
 * @create 2021-04-15 22:19:11
 */
@Data
public class FundManager {
    private String fundManagerCode;
    private String fundManagerName;
    private String fundCompanyCode;
    private String fundCompanyName;
    private String currentFundCodes;
    private String currentFundNames;
    private String bestRateReturn;
    private String workDays;
    private String fundScale;
    private String fundManagerDesc;
    private String fundManagerPhotoLink;
}