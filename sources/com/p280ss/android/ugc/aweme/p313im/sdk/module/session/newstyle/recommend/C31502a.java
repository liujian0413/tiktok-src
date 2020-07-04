package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend;

import android.os.Handler;
import android.os.Message;
import bolts.C1591g;
import bolts.C1592h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.a */
public final class C31502a<TTaskResult> implements C1591g<TTaskResult, Object> {

    /* renamed from: a */
    private Handler f82493a;

    /* renamed from: b */
    private int f82494b = 0;

    public final Object then(C1592h<TTaskResult> hVar) {
        if (this.f82493a == null) {
            return null;
        }
        Message obtainMessage = this.f82493a.obtainMessage(this.f82494b);
        if (hVar.mo6887c()) {
            obtainMessage.obj = null;
        } else if (hVar.mo6889d()) {
            obtainMessage.obj = hVar.mo6891f();
        } else {
            obtainMessage.obj = hVar.mo6890e();
        }
        this.f82493a.sendMessage(obtainMessage);
        return null;
    }

    public C31502a(Handler handler, int i) {
        this.f82493a = handler;
    }
}
