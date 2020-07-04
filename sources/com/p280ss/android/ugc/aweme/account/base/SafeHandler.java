package com.p280ss.android.ugc.aweme.account.base;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Handler;

/* renamed from: com.ss.android.ugc.aweme.account.base.SafeHandler */
public class SafeHandler extends Handler implements C0042h {

    /* renamed from: a */
    private final C0043i f56692a;

    @C0054q(mo125a = Event.ON_DESTROY)
    public void destroy() {
        removeCallbacksAndMessages(null);
    }

    public SafeHandler(C0043i iVar) {
        this.f56692a = iVar;
        this.f56692a.getLifecycle().mo55a(this);
    }
}
