package com.p280ss.android.ugc.aweme.base.p308ui.session;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.base.ui.session.Session$2 */
class Session$2 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C23468a f61932a;

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f61932a.mo61080a();
    }

    Session$2(C23468a aVar) {
        this.f61932a = aVar;
    }
}
