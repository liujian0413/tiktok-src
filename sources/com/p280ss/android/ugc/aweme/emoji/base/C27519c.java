package com.p280ss.android.ugc.aweme.emoji.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.emoji.base.C27520d;
import com.p280ss.android.ugc.aweme.emoji.base.C27521e;
import com.p280ss.android.ugc.aweme.emoji.utils.C27642k.C27644a;

/* renamed from: com.ss.android.ugc.aweme.emoji.base.c */
public abstract class C27519c<IV extends C27521e, P extends C27520d> extends C27644a implements OnAttachStateChangeListener {

    /* renamed from: a */
    protected IV f72561a;

    /* renamed from: b */
    protected P f72562b;

    /* renamed from: c */
    protected View f72563c;

    /* renamed from: a */
    public View mo70735a() {
        return this.f72563c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo70736b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo70738d();

    /* renamed from: e */
    public void mo70739e() {
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo70737c() {
        this.f72563c.addOnAttachStateChangeListener(this);
    }

    /* renamed from: a */
    private void m90201a(ViewGroup viewGroup) {
        if (this.f72563c == null) {
            this.f72563c = LayoutInflater.from(viewGroup.getContext()).inflate(mo70738d(), viewGroup, false);
        }
        mo70736b();
        mo70737c();
    }

    public C27519c(IV iv, P p, ViewGroup viewGroup) {
        this.f72561a = iv;
        this.f72562b = p;
        m90201a(viewGroup);
    }
}
