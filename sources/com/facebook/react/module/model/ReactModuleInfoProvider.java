package com.facebook.react.module.model;

import java.util.Map;

public interface ReactModuleInfoProvider {
    Map<Class, ReactModuleInfo> getReactModuleInfos();
}
