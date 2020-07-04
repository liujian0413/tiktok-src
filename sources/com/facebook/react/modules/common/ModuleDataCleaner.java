package com.facebook.react.modules.common;

import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NativeModule;

public class ModuleDataCleaner {

    public interface Cleanable {
        void clearSensitiveData();
    }

    public static void cleanDataFromModules(CatalystInstance catalystInstance) {
        for (NativeModule nativeModule : catalystInstance.getNativeModules()) {
            if (nativeModule instanceof Cleanable) {
                StringBuilder sb = new StringBuilder("Cleaning data from ");
                sb.append(nativeModule.getName());
                C13286a.m38842a("ReactNative", sb.toString());
                ((Cleanable) nativeModule).clearSensitiveData();
            }
        }
    }
}
