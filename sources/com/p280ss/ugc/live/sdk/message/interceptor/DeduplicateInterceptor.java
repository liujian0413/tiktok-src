package com.p280ss.ugc.live.sdk.message.interceptor;

import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.data.LimitedSizeHashMap;
import com.p280ss.ugc.live.sdk.message.interfaces.IInterceptor;
import java.util.Map;

/* renamed from: com.ss.ugc.live.sdk.message.interceptor.DeduplicateInterceptor */
public class DeduplicateInterceptor implements IInterceptor {
    private Map<Long, Object> mBufferMap = new LimitedSizeHashMap(512);

    public void clear() {
        this.mBufferMap.clear();
    }

    public boolean onMessage(IMessage iMessage) {
        if (this.mBufferMap.containsKey(Long.valueOf(iMessage.getMessageId()))) {
            return true;
        }
        this.mBufferMap.put(Long.valueOf(iMessage.getMessageId()), null);
        return false;
    }
}
