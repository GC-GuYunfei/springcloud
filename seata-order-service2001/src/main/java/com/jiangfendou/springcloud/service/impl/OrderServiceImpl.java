package com.jiangfendou.springcloud.service.impl;

import com.jiangfendou.springcloud.dao.OrderDao;
import com.jiangfendou.springcloud.domain.Order;
import com.jiangfendou.springcloud.service.OrderService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * OrderServiceImpl.
 * @author jiangmh
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Override
    public void create(Order order) {

    }
}
