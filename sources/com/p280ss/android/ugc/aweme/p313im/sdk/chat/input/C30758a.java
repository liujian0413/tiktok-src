package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.emoji.base.C27520d;
import com.p280ss.android.ugc.aweme.emoji.base.C27521e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.a */
public abstract class C30758a<IV extends C27521e, P extends C27520d> extends C31882a implements OnAttachStateChangeListener {

    /* renamed from: a */
    public IV f80527a;

    /* renamed from: b */
    protected P f80528b;

    /* renamed from: c */
    public View f80529c;

    /* renamed from: a */
    public View mo80546a() {
        return this.f80529c;
    }

    /* renamed from: a */
    public void mo80547a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo80548b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo80550d();

    /* renamed from: e */
    public void mo80551e() {
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo80549c() {
        this.f80529c.addOnAttachStateChangeListener(this);
    }

    /* renamed from: a */
    private void m100191a(ViewGroup viewGroup) {
        if (this.f80529c == null) {
            this.f80529c = LayoutInflater.from(viewGroup.getContext()).inflate(mo80550d(), viewGroup, false);
        }
        mo80548b();
        mo80549c();
    }

    public C30758a(IV iv, P p, ViewGroup viewGroup) {
        this.f80527a = iv;
        this.f80528b = p;
        m100191a(viewGroup);
    }
}
