package com.rish.rish_order.mapper;

import com.rish.rish_order.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    /**
     * 查询所有工单
     */
    Order selectAll(String phoneNumber);
}
