package com.bytedance.android.live.broadcast.effect.model;

public class LocalFilterModel {
    private int coverResId;
    private String filterFilePath;

    /* renamed from: id */
    private String f8437id;
    private String name;

    public LocalFilterModel() {
    }

    public int getCoverResId() {
        return this.coverResId;
    }

    public String getFilterFilePath() {
        return this.filterFilePath;
    }

    public String getId() {
        return this.f8437id;
    }

    public String getName() {
        return this.name;
    }

    public void setCoverResId(int i) {
        this.coverResId = i;
    }

    public void setFilterFilePath(String str) {
        this.filterFilePath = str;
    }

    public void setId(String str) {
        this.f8437id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public LocalFilterModel(String str, int i, String str2, String str3) {
        this.f8437id = str;
        this.coverResId = i;
        this.name = str2;
        this.filterFilePath = str3;
    }
}
