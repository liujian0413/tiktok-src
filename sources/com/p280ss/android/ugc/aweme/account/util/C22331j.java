package com.p280ss.android.ugc.aweme.account.util;

import android.os.Handler;
import android.os.Message;
import bolts.C1591g;
import bolts.C1592h;

/* renamed from: com.ss.android.ugc.aweme.account.util.j */
public final class C22331j<TTaskResult> implements C1591g<TTaskResult, Object> {

    /* renamed from: a */
    Handler f59600a;

    /* renamed from: b */
    int f59601b = 0;

    public final Object then(C1592h<TTaskResult> hVar) {
        if (this.f59600a == null) {
            return null;
        }
        Message obtainMessage = this.f59600a.obtainMessage(this.f59601b);
        if (hVar.mo6887c()) {
            obtainMessage.obj = null;
        } else if (hVar.mo6889d()) {
            obtainMessage.obj = hVar.mo6891f();
        } else {
            obtainMessage.obj = hVar.mo6890e();
        }
        this.f59600a.sendMessage(obtainMessage);
        return null;
    }

    public C22331j(Handler handler, int i) {
        this.f59600a = handler;
    }
}
