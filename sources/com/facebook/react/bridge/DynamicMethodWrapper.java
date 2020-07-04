package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule.NativeMethod;

public class DynamicMethodWrapper implements NativeMethod {
    private final String methodName;
    private final JavaModuleWrapper module;

    public String getType() {
        return "async";
    }

    public DynamicMethodWrapper(JavaModuleWrapper javaModuleWrapper, String str) {
        this.methodName = str;
        this.module = javaModuleWrapper;
    }

    public void invoke(JSInstance jSInstance, ReadableNativeArray readableNativeArray) {
        BaseJavaModule module2 = this.module.getModule();
        if (module2 instanceof IDynamicJavaMethodsFactory) {
            ((NativeMethod) ((IDynamicJavaMethodsFactory) module2).getDynamicMethods().get(this.methodName)).invoke(jSInstance, readableNativeArray);
        }
    }
}
