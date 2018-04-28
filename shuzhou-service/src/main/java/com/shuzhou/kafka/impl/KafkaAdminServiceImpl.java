package com.shuzhou.kafka.impl;

import com.shuzhou.kafka.KafkaAdminService;
import org.apache.kafka.clients.admin.AdminClient;
import org.springframework.stereotype.Service;

/**
 * Created by lufei on 18/4/28.
 */
@Service
public class KafkaAdminServiceImpl implements KafkaAdminService {
    @Override
    public AdminClient getAdminClient() {
        return null;
    }
}
