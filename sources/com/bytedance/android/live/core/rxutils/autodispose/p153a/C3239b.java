package com.bytedance.android.live.core.rxutils.autodispose.p153a;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.bytedance.android.live.core.rxutils.autodispose.OutsideScopeException;
import com.bytedance.android.live.core.rxutils.autodispose.p153a.p154a.C3237a;
import p346io.reactivex.C47560b;
import p346io.reactivex.C7322c;
import p346io.reactivex.p1865a.C47546a;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.a.b */
final class C3239b implements C7322c {

    /* renamed from: a */
    private final View f9962a;

    /* renamed from: com.bytedance.android.live.core.rxutils.autodispose.a.b$a */
    static final class C3240a extends C47546a implements OnAttachStateChangeListener {

        /* renamed from: a */
        private final View f9963a;

        /* renamed from: b */
        private final C47560b f9964b;

        public final void onViewAttachedToWindow(View view) {
        }

        /* renamed from: a */
        public final void mo10168a() {
            this.f9963a.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
            if (!isDisposed()) {
                this.f9964b.onComplete();
            }
        }

        C3240a(View view, C47560b bVar) {
            this.f9963a = view;
            this.f9964b = bVar;
        }
    }

    C3239b(View view) {
        this.f9962a = view;
    }

    /* renamed from: a */
    public final void mo10176a(C47560b bVar) {
        boolean z;
        C3240a aVar = new C3240a(this.f9962a, bVar);
        bVar.onSubscribe(aVar);
        if (!C3237a.m12267a()) {
            bVar.onError(new IllegalStateException("Views can only be bound to on the main thread!"));
            return;
        }
        if ((VERSION.SDK_INT < 19 || !this.f9962a.isAttachedToWindow()) && this.f9962a.getWindowToken() == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            bVar.onError(new OutsideScopeException("View is not attached!"));
            return;
        }
        this.f9962a.addOnAttachStateChangeListener(aVar);
        if (aVar.isDisposed()) {
            this.f9962a.removeOnAttachStateChangeListener(aVar);
        }
    }
}
