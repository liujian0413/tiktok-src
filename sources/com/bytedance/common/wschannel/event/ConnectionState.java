package com.bytedance.common.wschannel.event;

public enum ConnectionState {
    CONNECTION_UNKNOWN(1),
    CONNECTING(2),
    CONNECT_FAILED(4),
    CONNECT_CLOSED(8),
    CONNECTED(16);
    
    final int mTypeValue;

    public final int getTypeValue() {
        return this.mTypeValue;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionState{State=");
        sb.append(this.mTypeValue);
        sb.append('}');
        return sb.toString();
    }

    private ConnectionState(int i) {
        this.mTypeValue = i;
    }
}
