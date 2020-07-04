package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.C16355d;

/* renamed from: com.google.android.gms.common.api.internal.ar */
final class C15067ar extends C16355d {

    /* renamed from: a */
    private final /* synthetic */ C15061al f38987a;

    C15067ar(C15061al alVar, Looper looper) {
        this.f38987a = alVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f38987a.m43684p();
                return;
            case 2:
                this.f38987a.m43683o();
                return;
            default:
                return;
        }
    }
}
