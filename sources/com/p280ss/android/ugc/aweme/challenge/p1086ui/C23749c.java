package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.text.DynamicLayout;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.c */
final /* synthetic */ class C23749c implements Runnable {

    /* renamed from: a */
    private final TextView f62640a;

    /* renamed from: b */
    private final int f62641b;

    /* renamed from: c */
    private final DynamicLayout f62642c;

    /* renamed from: d */
    private final SpannableString f62643d;

    /* renamed from: e */
    private final ImageView f62644e;

    /* renamed from: f */
    private final TextView f62645f;

    /* renamed from: g */
    private final ViewGroup f62646g;

    /* renamed from: h */
    private final boolean f62647h;

    /* renamed from: i */
    private final SpannableString f62648i;

    C23749c(TextView textView, int i, DynamicLayout dynamicLayout, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, boolean z, SpannableString spannableString2) {
        this.f62640a = textView;
        this.f62641b = i;
        this.f62642c = dynamicLayout;
        this.f62643d = spannableString;
        this.f62644e = imageView;
        this.f62645f = textView2;
        this.f62646g = viewGroup;
        this.f62647h = z;
        this.f62648i = spannableString2;
    }

    public final void run() {
        C23747b.m77877a(this.f62640a, this.f62641b, this.f62642c, this.f62643d, this.f62644e, this.f62645f, this.f62646g, this.f62647h, this.f62648i);
    }
}
