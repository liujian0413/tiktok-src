package com.bytedance.ttnet.hostmonitor;

public enum ConnectionType {
    NONE(0),
    WIFI(1),
    MOBILE(2);
    
    public int value;

    private ConnectionType(int i) {
        this.value = i;
    }
}
