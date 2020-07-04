package com.bytedance.ies.sdk.widgets;

public class KVData {
    private Object data;
    private String key;

    public String getKey() {
        return this.key;
    }

    public <T> T getData() {
        if (this.data == null) {
            return null;
        }
        return this.data;
    }

    public <T> T getData(T t) {
        return DataCenter.get(this.data, t);
    }

    public KVData(String str, Object obj) {
        this.key = str;
        this.data = obj;
    }
}
