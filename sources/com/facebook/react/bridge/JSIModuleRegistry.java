package com.facebook.react.bridge;

import com.facebook.infer.p728a.C13854a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSIModuleRegistry {
    private final Map<Class, JSIModule> mModules = new HashMap();

    public <T extends JSIModule> T getModule(Class<T> cls) {
        return (JSIModule) C13854a.m40916b(this.mModules.get(cls));
    }

    public void registerModules(List<JSIModuleHolder> list) {
        for (JSIModuleHolder jSIModuleHolder : list) {
            this.mModules.put(jSIModuleHolder.getJSIModuleClass(), jSIModuleHolder.getJSIModule());
        }
    }
}
