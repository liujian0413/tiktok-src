package com.bytedance.services.apm.api;

import com.bytedance.apm.impl.ApmAgentServiceImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

public class IApmAgent__ServiceProxy implements IServiceProxy<IApmAgent> {
    public IApmAgent newInstance() {
        return new ApmAgentServiceImpl();
    }

    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.services.apm.api.IApmAgent", "com.bytedance.apm.impl.ApmAgentServiceImpl");
    }
}
