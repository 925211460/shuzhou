package com.shuzhou.alipay.impl;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.response.AlipayTradePayResponse;
import com.shuzhou.alipay.PayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
@Service
public class PayServiceImpl implements PayService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AlipayClient alipayClient;

    @Override
    public AlipayTradePayResponse barCodePay(AlipayTradePayRequest request) {
        try {
            AlipayTradePayResponse response = alipayClient.execute(request);
            return response;
        }catch (Exception ex){
            logger.error("barcodePay fail",ex);
        }
        return null;
    }
}
