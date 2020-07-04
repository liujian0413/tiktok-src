package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import javax.p1876a.C47883a;

public class EagerModuleProvider implements C47883a<NativeModule> {
    private final NativeModule mModule;

    public NativeModule get() {
        return this.mModule;
    }

    public EagerModuleProvider(NativeModule nativeModule) {
        this.mModule = nativeModule;
    }
}
