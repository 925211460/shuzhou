package com.shuzhou.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
@Configuration
public class PayConfig {

    @Bean
    public AlipayClient getDefaultAlipayClient(){
        DefaultAlipayClient defaultAlipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do",
                "2016081600256101",
                "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDgQCvBaPAs9elCEj1lnWYP+LWjtlZmxbekb40BQDPlxUItOTsimBuQAKotH4x/UxgjGDfXOu2+aV3F7gzprLiN05/mV1r6m8XANFZvWZiual7SR/SSfdPpGXnJBJbkM57wPFuZk63EZ7xcTj6AFKKi5mJbGEOJCJPfsEDQTEuoYvIE7fqImyz7MiQqkfxLFGAqm/ih2FaG6GtBk1UZi73HrjpJVHvFIOh0Fo4/MgEa/4lTPnThOUzSH0M3l6YNG2GrFwS2R9Ffr0YhcEdO8vCWrAUs8aFmoXKqWY570/Hnkd9RgSWmwHWpTHWTP8Gk1Dwhsm0mKmb99ao4e+kfKPrBAgMBAAECggEAZim2BXIqYUFTGE+4+u8/TS1wivoJ2N5gsKBFa/l060v3vySgpT0I6Yzz+oSx/Fu91lc1MW/eWe4k04SFC3wtxCdSZJ0NjLik2dC+RBJcdbFuK3yuloKOpVZ+3i6iE6rU0Puee5QFCUJ9VMwsuysrgO1Wh8vBENAAllr03DC2EyrOVwNfJ+c9PTQYxKQ1U+TIwmZ2l3wc499+2a51pfOWgZ06GtfRvxsvIqjeg1X2E9NS7yV7/Zld01Zr12XCJ9o8jX7Udc+3QJN+naizV4XtRsTIQUQsBZDqLmMy8UhVFIz2Q9VdTiQlF0EXXzvuiSPHaA/Lni5ZEdU0wK71x8VdwQKBgQD1xDZaVB9EaeXbKkVddofvzUqdzcOVehf05zrWwokkl1SbvU74ElfHwnu4JBegjGzWk3somFyxiCxQGFTgoZ7gnkvajUoyowpy1f4LbR3KcIVd5h2fWL1xLWi48mZwqnBHwn5vq4GVWlKz1uH4lJ9k265raOm+ihnfHBYQ0E2xGQKBgQDplpuJBs5L+RyPtwHYVinzNI3avSXJrzTXx7LLUMiDR7D7+r2qiBYy+9/iB+SLds1Jr3FNPFK9A4S1qe0glYoZbKiTpJ7iFbKcbVQqB1wOqIei04TDRIJFSByg2lB+xTqsU72EDt47/2NnGor0zutzGjm35f9az8WMAXf+GMuD6QKBgC0bAc66ObLYrLL4oxpwMqq0RsmHhinc6qCr/4SC16C7lW+v4tpso2eqLgKxvRReMWuATc45iGmc0GUy0gEYKIyZANrvq3p3qedBlwqJ0DnjRNbi8PTZ2Ir5BotLEboDze+dpo7gLzw2A4+2FGsG++oK14wnCR9LQUxNX09eq6OhAoGAOGhIMvTTyIDlpsbYyTc1dieQweu/Pk7zAdCVmodthFZBpPfN6WpngfRVAi5JwGv18v9M6wvQJxi8aWoZey7hZHZa1xx/ybTXpvK3ylZwopGL/4P4oXbfxn89epJ9sb9LBeZK86Lrg62OgY1lVOzK6sbAfWorGfDmkYKhSVkPfFECgYEAqUhkwbkWteIb2nPOUZL4S2Ah4MLrFMZUi3g4bbI+DSsajt9IBtLgUMu7Kb8wVAtv0cXjOoQ9W83GUJ2WFNDiHqKOLg7+ghC8k9dhEu1EJLcTEQGKOiyg5Qo9Kqx7f0w9//UGQHDueb4TwmcPLN0drGu1VabE2aVgBemS3rq41Mc=",
                "json",
                "utf-8",
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuQvn4YimY8gGBAFs7C+5Y2KTuGFNs0iMmP0NL+4gLfacJVUO7xnMNPCEfvN/1c6P8NhLZ6aBU338Qs8YYUpwN+dZKkgDxL+JskNdFXNLXp9hZPjta5U5vB6/Icfpm8zeEFuxbuMGL6LApj5AGgt6FFA9PYEdZOdMMcwMhYs9ZK+pmACryCYZfWLNvPrshQg5wA4WGFX7c6veLmLvu/ORJHALwO/fYMKjd+ux4SZoh29OccZRiTO63/Bp548Lmtedr0QB10OufB625tAfu2bFz1grlT5+lZrQuAb4VVlQMTlGgisHOnTUzePk5c3pBaSd8BW17Pf44Eh0RJt+YVaBYQIDAQAB",
                "RSA2" );
        return defaultAlipayClient;

    }

}
