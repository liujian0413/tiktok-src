package com.bytedance.android.live.core.viewholder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;

public abstract class BaseViewHolder<T> extends C1293v {

    /* renamed from: a */
    public boolean f10222a;

    /* renamed from: b */
    private final C47562b f10223b = new C47562b();

    /* renamed from: a */
    public static T m12678a(Object obj) {
        return obj;
    }

    /* renamed from: a */
    public abstract void mo10072a(T t, int i);

    /* renamed from: b */
    public boolean mo10319b() {
        return false;
    }

    /* renamed from: c */
    public void mo10320c() {
        this.f10222a = true;
    }

    /* renamed from: d */
    public void mo10321d() {
        this.f10222a = false;
    }

    /* renamed from: a */
    public void mo10317a() {
        this.f10223b.mo119660a();
    }

    public BaseViewHolder(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo10318a(C7321c cVar) {
        this.f10223b.mo119661a(cVar);
    }
}
