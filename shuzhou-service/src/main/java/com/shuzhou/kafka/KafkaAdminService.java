package com.shuzhou.kafka;

import org.apache.kafka.clients.admin.AdminClient;

/**
 * Created by lufei on 18/4/28.
 */
public interface KafkaAdminService {

    public AdminClient getAdminClient();
}
