package com.p280ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0070y;
import android.arch.lifecycle.C0071z;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.Widget */
public abstract class Widget implements C0042h, C0071z {

    /* renamed from: a */
    private C0070y f60918a;

    /* renamed from: b */
    public Context f60919b;

    /* renamed from: c */
    protected View f60920c;

    /* renamed from: d */
    public View f60921d;

    /* renamed from: e */
    public DataCenter f60922e;

    /* renamed from: f */
    public C23076a f60923f;

    /* renamed from: g */
    public boolean f60924g;

    /* renamed from: h */
    boolean f60925h;

    /* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.Widget$a */
    protected interface C23076a {
        /* renamed from: a */
        Activity mo60149a();

        /* renamed from: a */
        void mo60150a(Intent intent, int i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60144a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60146a(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo60147b() {
        return 0;
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
    }

    @C0054q(mo125a = Event.ON_START)
    public void onStart() {
    }

    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Activity mo60148c() {
        return this.f60923f.mo60149a();
    }

    public C0070y getViewModelStore() {
        if (this.f60918a == null) {
            this.f60918a = new C0070y();
        }
        return this.f60918a;
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
        this.f60924g = true;
        this.f60925h = false;
        mo60146a(this.f60921d);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f60924g = false;
        this.f60925h = true;
        if (this.f60918a != null) {
            this.f60918a.mo151a();
        }
    }

    /* renamed from: a */
    public final void mo60145a(Intent intent, int i) {
        this.f60923f.mo60150a(intent, i);
    }
}
