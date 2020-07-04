package com.p280ss.android.ugc.aweme.shortvideo.festival;

import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.b */
final /* synthetic */ class C39868b implements Runnable {

    /* renamed from: a */
    private final TextView f103593a;

    /* renamed from: b */
    private final SpannableString f103594b;

    /* renamed from: c */
    private final ImageView f103595c;

    /* renamed from: d */
    private final TextView f103596d;

    /* renamed from: e */
    private final ViewGroup f103597e;

    /* renamed from: f */
    private final SpannableString f103598f;

    C39868b(TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, SpannableString spannableString2) {
        this.f103593a = textView;
        this.f103594b = spannableString;
        this.f103595c = imageView;
        this.f103596d = textView2;
        this.f103597e = viewGroup;
        this.f103598f = spannableString2;
    }

    public final void run() {
        C39865a.m127604a(this.f103593a, this.f103594b, this.f103595c, this.f103596d, this.f103597e, this.f103598f);
    }
}
