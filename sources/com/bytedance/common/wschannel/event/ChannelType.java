package com.bytedance.common.wschannel.event;

public enum ChannelType {
    CHANNEL_SELF(1),
    CHANNEL_OK(2);
    
    int mTypeValue;

    public final int getVal() {
        return this.mTypeValue;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelType{Type=");
        sb.append(this.mTypeValue);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: of */
    public static ChannelType m28958of(int i) {
        if (i == 1) {
            return CHANNEL_SELF;
        }
        return CHANNEL_OK;
    }

    private ChannelType(int i) {
        this.mTypeValue = i;
    }
}
