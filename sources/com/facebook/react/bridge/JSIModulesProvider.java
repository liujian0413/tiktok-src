package com.facebook.react.bridge;

import java.util.List;

public interface JSIModulesProvider {
    List<JSIModuleHolder> getJSIModules(ReactApplicationContext reactApplicationContext, JavaScriptContextHolder javaScriptContextHolder);
}
