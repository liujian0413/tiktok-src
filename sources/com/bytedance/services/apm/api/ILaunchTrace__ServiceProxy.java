package com.bytedance.services.apm.api;

import com.bytedance.apm.impl.LaunchTraceImpl;
import com.bytedance.news.common.service.manager.IServiceProxy;
import java.util.Map;

public class ILaunchTrace__ServiceProxy implements IServiceProxy<ILaunchTrace> {
    public ILaunchTrace newInstance() {
        return new LaunchTraceImpl();
    }

    public void collectService(Map<String, String> map) {
        map.put("com.bytedance.services.apm.api.ILaunchTrace", "com.bytedance.apm.impl.LaunchTraceImpl");
    }
}
