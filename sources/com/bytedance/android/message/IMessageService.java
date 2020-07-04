package com.bytedance.android.message;

import android.content.Context;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;

public interface IMessageService extends C2324b {
    Class<? extends C8538c> getMessageClass(String str);

    IMessageManager messageManagerProvider(long j, boolean z, Context context);

    IMessageManager messageManagerProvider(long j, boolean z, Context context, boolean z2);

    void release(long j);
}
