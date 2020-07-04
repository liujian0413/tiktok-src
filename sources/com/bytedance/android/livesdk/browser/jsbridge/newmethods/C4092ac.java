package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ac */
public final class C4092ac extends C11152c<Object, Object> {

    /* renamed from: a */
    public C7321c f12079a;

    public final void onTerminate() {
        if (this.f12079a != null) {
            this.f12079a.dispose();
        }
    }

    public final void invoke(Object obj, CallContext callContext) {
        if (C3384d.m12589a(callContext.f30265a) == null) {
            finishWithFailure();
        }
        TTLiveSDKContext.getHostService().mo22367h().mo22167a(callContext.f30265a, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f6a)).mo22190a()).mo19189a((C7498y<? super T>) new C7498y<IUser>() {
            public final void onComplete() {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNext(IUser iUser) {
                C4092ac.this.finishWithSuccess();
            }

            public final void onError(Throwable th) {
                C4092ac.this.finishWithFailure(th);
            }

            public final void onSubscribe(C7321c cVar) {
                C4092ac.this.f12079a = cVar;
            }
        });
    }
}
