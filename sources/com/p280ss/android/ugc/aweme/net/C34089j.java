package com.p280ss.android.ugc.aweme.net;

import android.os.Handler;
import android.os.Message;
import bolts.C1591g;
import bolts.C1592h;

/* renamed from: com.ss.android.ugc.aweme.net.j */
public final class C34089j<TTaskResult> implements C1591g<TTaskResult, Object> {

    /* renamed from: a */
    private Handler f88848a;

    /* renamed from: b */
    private int f88849b;

    public final Object then(C1592h<TTaskResult> hVar) {
        if (this.f88848a == null) {
            return null;
        }
        Message obtainMessage = this.f88848a.obtainMessage(this.f88849b);
        if (hVar.mo6887c()) {
            obtainMessage.obj = null;
        } else if (hVar.mo6889d()) {
            obtainMessage.obj = hVar.mo6891f();
        } else {
            obtainMessage.obj = hVar.mo6890e();
        }
        this.f88848a.sendMessage(obtainMessage);
        return null;
    }

    public C34089j(Handler handler, int i) {
        this.f88848a = handler;
        this.f88849b = i;
    }
}
