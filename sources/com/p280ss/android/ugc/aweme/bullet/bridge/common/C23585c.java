package com.p280ss.android.ugc.aweme.bullet.bridge.common;

import android.os.Message;
import com.bytedance.common.utility.collection.C6309f.C6310a;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.c */
final /* synthetic */ class C23585c implements C6310a {

    /* renamed from: a */
    private final UploadFileMethod f62234a;

    /* renamed from: b */
    private final int f62235b;

    C23585c(UploadFileMethod uploadFileMethod, int i) {
        this.f62234a = uploadFileMethod;
        this.f62235b = i;
    }

    public final void handleMsg(Message message) {
        this.f62234a.mo61504a(this.f62235b, message);
    }
}
