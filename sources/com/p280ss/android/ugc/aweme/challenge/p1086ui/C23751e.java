package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.e */
final /* synthetic */ class C23751e implements OnClickListener {

    /* renamed from: a */
    private final ImageView f62650a;

    /* renamed from: b */
    private final ViewGroup f62651b;

    /* renamed from: c */
    private final TextView f62652c;

    /* renamed from: d */
    private final int f62653d;

    /* renamed from: e */
    private final int f62654e;

    /* renamed from: f */
    private final boolean f62655f;

    /* renamed from: g */
    private final SpannableString f62656g;

    /* renamed from: h */
    private final SpannableString f62657h;

    /* renamed from: i */
    private final TextView f62658i;

    C23751e(ImageView imageView, ViewGroup viewGroup, TextView textView, int i, int i2, boolean z, SpannableString spannableString, SpannableString spannableString2, TextView textView2) {
        this.f62650a = imageView;
        this.f62651b = viewGroup;
        this.f62652c = textView;
        this.f62653d = i;
        this.f62654e = i2;
        this.f62655f = z;
        this.f62656g = spannableString;
        this.f62657h = spannableString2;
        this.f62658i = textView2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C23747b.m77876a(this.f62650a, this.f62651b, this.f62652c, this.f62653d, this.f62654e, this.f62655f, this.f62656g, this.f62657h, this.f62658i, view);
    }
}
