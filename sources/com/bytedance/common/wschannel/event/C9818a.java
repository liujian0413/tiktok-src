package com.bytedance.common.wschannel.event;

/* renamed from: com.bytedance.common.wschannel.event.a */
public final class C9818a {

    /* renamed from: a */
    public final ChannelType f26733a;

    /* renamed from: b */
    public final ConnectionState f26734b;

    /* renamed from: c */
    public final int f26735c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectEvent{mType=");
        sb.append(this.f26733a);
        sb.append(", connectionState=");
        sb.append(this.f26734b);
        sb.append(", mChannelId=");
        sb.append(this.f26735c);
        sb.append('}');
        return sb.toString();
    }

    public C9818a(ConnectionState connectionState, ChannelType channelType, int i) {
        this.f26734b = connectionState;
        this.f26733a = channelType;
        this.f26735c = i;
    }
}
