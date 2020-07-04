package com.bytedance.router;

import java.util.Map;

public interface IRouteCallMappingInitializer {
    void init(Map<String, IRouteCallWrapper> map);
}
