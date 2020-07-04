package com.p280ss.android.ugc.aweme.base.p308ui.session;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a.C23469a;

/* renamed from: com.ss.android.ugc.aweme.base.ui.session.Session$1 */
class Session$1 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C23469a f61930a;

    /* renamed from: b */
    final /* synthetic */ C23468a f61931b;

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f61931b.mo61082a(this.f61930a);
    }

    Session$1(C23468a aVar, C23469a aVar2) {
        this.f61931b = aVar;
        this.f61930a = aVar2;
    }
}
