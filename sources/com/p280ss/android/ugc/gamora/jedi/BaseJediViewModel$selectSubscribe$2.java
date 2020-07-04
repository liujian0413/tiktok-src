package com.p280ss.android.ugc.gamora.jedi;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.jedi.BaseJediViewModel$selectSubscribe$2 */
public final class BaseJediViewModel$selectSubscribe$2 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C7321c f114658a;

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        if (!this.f114658a.isDisposed()) {
            this.f114658a.dispose();
        }
    }

    BaseJediViewModel$selectSubscribe$2(C7321c cVar) {
        this.f114658a = cVar;
    }
}
