package com.bytedance.ies.sdk.widgets;

public interface IWidgetProvider {
    <T extends IRecyclableWidget> T provide(Class<T> cls);
}
