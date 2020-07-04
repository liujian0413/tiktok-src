package com.bytedance.services.apm.api;

import com.bytedance.apm.impl.MonitorLogManagerImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

public class IMonitorLogManager__ServiceProxy implements IServiceProxy<IMonitorLogManager> {
    public IMonitorLogManager newInstance() {
        return new MonitorLogManagerImpl();
    }

    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.services.apm.api.IMonitorLogManager", "com.bytedance.apm.impl.MonitorLogManagerImpl");
    }
}
