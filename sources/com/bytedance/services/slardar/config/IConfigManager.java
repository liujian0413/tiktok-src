package com.bytedance.services.slardar.config;

import com.bytedance.news.common.service.manager.IService;
import org.json.JSONObject;

public interface IConfigManager extends IService {
    void fetchConfig();

    int getConfigInt(String str, int i);

    JSONObject getConfigJSON(String str);

    boolean getLogTypeSwitch(String str);

    boolean getMetricTypeSwitch(String str);

    boolean getServiceSwitch(String str);

    boolean getSwitch(String str);

    boolean isConfigReady();

    String queryConfig();

    void registerConfigListener(C6480a aVar);

    void registerResponseConfigListener(C6481b bVar);

    void unregisterConfigListener(C6480a aVar);

    void unregisterResponseConfigListener(C6481b bVar);
}
