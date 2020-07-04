package com.google.android.gms.common.api.internal;

import android.os.Message;
import com.google.android.gms.common.api.C15041e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.C16355d;

/* renamed from: com.google.android.gms.common.api.internal.bv */
final class C15099bv extends C16355d {

    /* renamed from: a */
    private final /* synthetic */ C15097bt f39050a;

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 0:
                C15041e eVar = (C15041e) message.obj;
                synchronized (this.f39050a.f39043e) {
                    if (eVar == null) {
                        try {
                            this.f39050a.f39040b.m43799a(new Status(13, "Transform returned null"));
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (eVar instanceof C15092bo) {
                        this.f39050a.f39040b.m43799a(((C15092bo) eVar).f39027a);
                    } else {
                        this.f39050a.f39040b.mo38355a(eVar);
                    }
                }
                return;
            case 1:
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String str = "Runtime exception on the transformation worker thread: ";
                String valueOf = String.valueOf(runtimeException.getMessage());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new String(str);
                }
                throw runtimeException;
            default:
                return;
        }
    }
}
