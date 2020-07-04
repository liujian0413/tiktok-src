package com.bytedance.news.common.service.manager;

import java.util.Map;

public interface IServiceProxy<T> {
    void collectService(Map<String, String> map);

    T newInstance();
}
