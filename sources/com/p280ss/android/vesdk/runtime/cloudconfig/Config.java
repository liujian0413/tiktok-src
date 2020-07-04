package com.p280ss.android.vesdk.runtime.cloudconfig;

/* renamed from: com.ss.android.vesdk.runtime.cloudconfig.Config */
public class Config<T> {
    public static final int TYPE_FLOAT = 1;
    public static final int TYPE_INT = 0;
    public final T defaultValue;
    public final String key;
    public final int type;

    public Config(String str, int i, T t) {
        this.key = str;
        this.type = i;
        this.defaultValue = t;
    }
}
