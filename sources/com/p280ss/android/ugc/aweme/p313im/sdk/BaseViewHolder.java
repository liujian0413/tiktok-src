package com.p280ss.android.ugc.aweme.p313im.sdk;

import android.app.Activity;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30872j;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.BaseViewHolder */
public class BaseViewHolder<DATA> extends C1293v {

    /* renamed from: a */
    protected C30872j f80274a;

    /* renamed from: a */
    public void mo80308a(DATA data) {
    }

    /* renamed from: a */
    public void mo80309a(DATA data, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo80310b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80307a() {
        mo80310b();
        mo80311c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo80311c() {
        C31878ax.m103576a(this.itemView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final FragmentActivity mo80312d() {
        Activity e = C23487o.m77158e(this.itemView);
        if (e instanceof FragmentActivity) {
            return (FragmentActivity) e;
        }
        return null;
    }

    public BaseViewHolder(View view) {
        super(view);
        mo80307a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> T mo80306a(int i) {
        T findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return null;
    }

    public BaseViewHolder(View view, C30872j jVar) {
        super(view);
        this.f80274a = jVar;
        mo80307a();
    }

    public BaseViewHolder(ViewGroup viewGroup, int i) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        mo80307a();
    }
}
