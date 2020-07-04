package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.C16355d;

/* renamed from: com.google.android.gms.common.api.internal.aw */
final class C15072aw extends C16355d {

    /* renamed from: a */
    private final /* synthetic */ C15070au f39005a;

    C15072aw(C15070au auVar, Looper looper) {
        this.f39005a = auVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ((C15071av) message.obj).mo38325a(this.f39005a);
                return;
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                return;
        }
    }
}
