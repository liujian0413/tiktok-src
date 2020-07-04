package com.bytedance.ies.sdk.widgets;

public interface IRecyclableWidget {
    boolean isAlive();

    boolean isInitialized();

    void onInit(Object[] objArr);

    void onLoad(Object[] objArr);

    void onUnload();

    void setClearAfterDestroyed();
}
