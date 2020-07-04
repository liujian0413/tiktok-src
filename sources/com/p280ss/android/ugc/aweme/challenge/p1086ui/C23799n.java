package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.n */
final /* synthetic */ class C23799n implements OnClickListener {

    /* renamed from: a */
    private final ImageView f62825a;

    /* renamed from: b */
    private final ViewGroup f62826b;

    /* renamed from: c */
    private final TextView f62827c;

    /* renamed from: d */
    private final SpannableString f62828d;

    /* renamed from: e */
    private final boolean f62829e;

    /* renamed from: f */
    private final SpannableString f62830f;

    /* renamed from: g */
    private final TextView f62831g;

    C23799n(ImageView imageView, ViewGroup viewGroup, TextView textView, SpannableString spannableString, boolean z, SpannableString spannableString2, TextView textView2) {
        this.f62825a = imageView;
        this.f62826b = viewGroup;
        this.f62827c = textView;
        this.f62828d = spannableString;
        this.f62829e = z;
        this.f62830f = spannableString2;
        this.f62831g = textView2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C23793i.m77991a(this.f62825a, this.f62826b, this.f62827c, this.f62828d, this.f62829e, this.f62830f, this.f62831g, view);
    }
}
