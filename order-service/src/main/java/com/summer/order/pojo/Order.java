package com.summer.order.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author Summer
 * @date 2022/3/29 19:05
 */
@Data
public class Order {
    private Long id;
    private Long price;
    private String name;
    private Integer num;
    private Long userId;
    @TableField(exist = false)
    private User user;
}
