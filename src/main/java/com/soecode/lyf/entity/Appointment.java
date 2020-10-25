package com.soecode.lyf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * 预约图书实体
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {

    private long bookId;// 图书ID

    private long studentId;// 学号

    private Date appointTime;// 预约时间

    // 多对一的复合属性
    private Book book;// 图书实体


}
