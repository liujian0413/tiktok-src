package com.p280ss.ugc.live.sdk.message.data;

import java.util.List;

/* renamed from: com.ss.ugc.live.sdk.message.data.ProtoApiResult */
public class ProtoApiResult {
    public String cursor;
    public long delayTimeBeforeDispatch;
    public long fetchInterval;
    public List<IMessage> messages;
    public long now;
}
