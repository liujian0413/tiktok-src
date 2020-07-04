package com.facebook.react.bridge;

public interface JSIModuleHolder {
    <T extends JSIModule> T getJSIModule();

    Class<? extends JSIModule> getJSIModuleClass();
}
