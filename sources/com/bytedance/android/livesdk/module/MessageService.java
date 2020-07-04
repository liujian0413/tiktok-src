package com.bytedance.android.livesdk.module;

import android.content.Context;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.p209bl.LiveMessage;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.utils.C9038ag;
import com.bytedance.android.message.IMessageService;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;

public class MessageService implements IMessageService {
    public MessageService() {
        C3596c.m13174a(IMessageService.class, this);
    }

    public void release(long j) {
        C9038ag.m26999a(j);
    }

    public Class<? extends C8538c> getMessageClass(String str) {
        return LiveMessage.getMessageClass(str);
    }

    public IMessageManager messageManagerProvider(long j, boolean z, Context context) {
        return C9038ag.m26997a(j, z, context);
    }

    public IMessageManager messageManagerProvider(long j, boolean z, Context context, boolean z2) {
        return C9038ag.m26998a(j, z, context, z2);
    }
}
