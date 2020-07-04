package com.p280ss.android.medialib.model;

/* renamed from: com.ss.android.medialib.model.EffectFileInfo */
public class EffectFileInfo {
    String path;
    int type;

    public String getPath() {
        return this.path;
    }

    public int getType() {
        return this.type;
    }

    public EffectFileInfo(int i, String str) {
        this.type = i;
        this.path = str;
    }
}
