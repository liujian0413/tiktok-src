package com.bytedance.android.live.core.rxutils;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.LiveData;
import android.util.Pair;
import com.bytedance.android.live.core.rxutils.rxlifecycle.LifecycleEvent;
import java.util.ArrayList;
import java.util.List;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p354j.C47844a;

public class RxViewModel extends C0063u {

    /* renamed from: a */
    private final C47562b f9944a = new C47562b();

    /* renamed from: b */
    private final List<Pair<LiveData, C0053p>> f9945b = new ArrayList();

    /* renamed from: i */
    public final C47844a<LifecycleEvent> f9946i = C47844a.m148742a();

    public void onCleared() {
        this.f9944a.mo119660a();
        for (Pair pair : this.f9945b) {
            ((LiveData) pair.first).removeObserver((C0053p) pair.second);
        }
        this.f9945b.clear();
        this.f9946i.onNext(LifecycleEvent.DESTROY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10158a(C7321c cVar) {
        this.f9944a.mo119661a(cVar);
    }
}
