package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule.NativeMethod;
import java.util.Map;

public interface IDynamicJavaMethodsFactory {
    Map<String, NativeMethod> getDynamicMethods();
}
