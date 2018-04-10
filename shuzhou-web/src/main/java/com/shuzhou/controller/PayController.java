package com.shuzhou.controller;

import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.response.AlipayTradePayResponse;
import com.shuzhou.alipay.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
@RestController
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private PayService payService;


    @RequestMapping("/barcodePay")
    public void pay(@RequestParam String barcode){
        AlipayTradePayRequest request = new AlipayTradePayRequest();
        AlipayTradePayModel model = new AlipayTradePayModel();
        request.setBizModel(model);

        model.setOutTradeNo(System.currentTimeMillis()+"");
        model.setSubject("Iphone6 16G");
        model.setTotalAmount("0.01");
        model.setAuthCode(barcode);//沙箱钱包中的付款码
        model.setScene("bar_code");

        AlipayTradePayResponse response = payService.barCodePay(request);
        System.out.println(response.getBody());
        System.out.println(response.getTradeNo());
    }

}
