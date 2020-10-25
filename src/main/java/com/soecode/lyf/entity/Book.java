package com.soecode.lyf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 图书实体
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private long bookId;// 图书ID

    private String name;// 图书名称

    private int number;// 馆藏数量


}
