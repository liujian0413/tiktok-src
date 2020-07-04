package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.j */
final /* synthetic */ class C23795j implements Runnable {

    /* renamed from: a */
    private final TextView f62813a;

    /* renamed from: b */
    private final SpannableString f62814b;

    /* renamed from: c */
    private final ImageView f62815c;

    /* renamed from: d */
    private final TextView f62816d;

    /* renamed from: e */
    private final ViewGroup f62817e;

    /* renamed from: f */
    private final SpannableString f62818f;

    /* renamed from: g */
    private final boolean f62819g;

    C23795j(TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, SpannableString spannableString2, boolean z) {
        this.f62813a = textView;
        this.f62814b = spannableString;
        this.f62815c = imageView;
        this.f62816d = textView2;
        this.f62817e = viewGroup;
        this.f62818f = spannableString2;
        this.f62819g = z;
    }

    public final void run() {
        C23793i.m77992a(this.f62813a, this.f62814b, this.f62815c, this.f62816d, this.f62817e, this.f62818f, this.f62819g);
    }
}
