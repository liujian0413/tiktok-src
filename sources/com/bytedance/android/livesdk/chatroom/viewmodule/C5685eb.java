package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.eb */
final /* synthetic */ class C5685eb implements Runnable {

    /* renamed from: a */
    private final ImageView f16774a;

    /* renamed from: b */
    private final ImageView f16775b;

    /* renamed from: c */
    private final View f16776c;

    /* renamed from: d */
    private final TextView f16777d;

    C5685eb(ImageView imageView, ImageView imageView2, View view, TextView textView) {
        this.f16774a = imageView;
        this.f16775b = imageView2;
        this.f16776c = view;
        this.f16777d = textView;
    }

    public final void run() {
        C54861.m17725a(this.f16774a, this.f16775b, this.f16776c, this.f16777d);
    }
}
