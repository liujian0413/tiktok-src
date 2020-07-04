package com.p280ss.android.ugc.aweme.common.p1148ui;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.support.p029v7.app.AlertDialog;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.widget.ListAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.common.ui.a */
public final class C25712a {

    /* renamed from: a */
    C1081a f67663a;

    /* renamed from: b */
    private Context f67664b;

    /* renamed from: a */
    public final AlertDialog mo66610a() {
        return this.f67663a.mo4242b();
    }

    /* renamed from: b */
    public final AlertDialog mo66615b() {
        return this.f67663a.mo4245c();
    }

    public C25712a(Context context) {
        this.f67664b = context;
        this.f67663a = new C1081a(context, R.style.rk);
    }

    /* renamed from: a */
    public final void mo66611a(OnCancelListener onCancelListener) {
        this.f67663a.mo4227a(onCancelListener);
    }

    /* renamed from: a */
    public final void mo66612a(OnDismissListener onDismissListener) {
        this.f67663a.mo4228a(onDismissListener);
    }

    /* renamed from: a */
    public final void mo66613a(ListAdapter listAdapter, OnClickListener onClickListener) {
        this.f67663a.mo4232a(listAdapter, onClickListener);
    }

    /* renamed from: a */
    public final void mo66614a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
        this.f67663a.mo4236a(charSequenceArr, onClickListener);
    }
}
