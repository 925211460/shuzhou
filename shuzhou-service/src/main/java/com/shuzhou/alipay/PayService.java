package com.shuzhou.alipay;

import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.response.AlipayTradePayResponse;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
public interface PayService {
    public AlipayTradePayResponse barCodePay(AlipayTradePayRequest request);
}
