package com.bytedance.router;

import java.util.List;
import java.util.Map;

public interface IMappingInitializer {
    int getMapSize();

    void init(Map<String, String> map);

    void initPermissionMap(Map<String, Map<String, String>> map);

    void initTestUrlList(List<String> list);
}
