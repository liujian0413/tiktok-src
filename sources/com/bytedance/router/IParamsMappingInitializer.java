package com.bytedance.router;

import java.util.Map;

public interface IParamsMappingInitializer {
    void init(Map<String, String[]> map);
}
