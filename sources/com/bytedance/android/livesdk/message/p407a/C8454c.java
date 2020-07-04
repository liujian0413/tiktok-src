package com.bytedance.android.livesdk.message.p407a;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.message.IMessageService;
import com.google.gson.JsonParseException;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageConverter;

/* renamed from: com.bytedance.android.livesdk.message.a.c */
public final class C8454c implements IMessageConverter {
    public final IMessage convert(String str, String str2, long j) {
        Class messageClass = ((IMessageService) C3596c.m13172a(IMessageService.class)).getMessageClass(str);
        if (messageClass == null) {
            return null;
        }
        try {
            C8538c cVar = (C8538c) C2317a.m9932a().mo15974a(str2, messageClass);
            cVar.timestamp = j;
            return cVar;
        } catch (JsonParseException unused) {
            return null;
        }
    }
}
