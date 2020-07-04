package com.p280ss.android.ugc.aweme.profile.util;

import android.text.DynamicLayout;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.profile.util.k */
final /* synthetic */ class C36740k implements Runnable {

    /* renamed from: a */
    private final TextView f96415a;

    /* renamed from: b */
    private final int f96416b;

    /* renamed from: c */
    private final DynamicLayout f96417c;

    /* renamed from: d */
    private final SpannableString f96418d;

    /* renamed from: e */
    private final ImageView f96419e;

    /* renamed from: f */
    private final TextView f96420f;

    /* renamed from: g */
    private final ViewGroup f96421g;

    /* renamed from: h */
    private final boolean f96422h;

    /* renamed from: i */
    private final SpannableString f96423i;

    C36740k(TextView textView, int i, DynamicLayout dynamicLayout, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, boolean z, SpannableString spannableString2) {
        this.f96415a = textView;
        this.f96416b = i;
        this.f96417c = dynamicLayout;
        this.f96418d = spannableString;
        this.f96419e = imageView;
        this.f96420f = textView2;
        this.f96421g = viewGroup;
        this.f96422h = z;
        this.f96423i = spannableString2;
    }

    public final void run() {
        C36737j.m118423a(this.f96415a, this.f96416b, this.f96417c, this.f96418d, this.f96419e, this.f96420f, this.f96421g, this.f96422h, this.f96423i);
    }
}
