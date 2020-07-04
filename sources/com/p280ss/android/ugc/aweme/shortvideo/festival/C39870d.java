package com.p280ss.android.ugc.aweme.shortvideo.festival;

import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.d */
final /* synthetic */ class C39870d implements OnClickListener {

    /* renamed from: a */
    private final ImageView f103600a;

    /* renamed from: b */
    private final ViewGroup f103601b;

    /* renamed from: c */
    private final TextView f103602c;

    /* renamed from: d */
    private final int f103603d;

    /* renamed from: e */
    private final int f103604e;

    /* renamed from: f */
    private final SpannableString f103605f;

    /* renamed from: g */
    private final SpannableString f103606g;

    /* renamed from: h */
    private final TextView f103607h;

    C39870d(ImageView imageView, ViewGroup viewGroup, TextView textView, int i, int i2, SpannableString spannableString, SpannableString spannableString2, TextView textView2) {
        this.f103600a = imageView;
        this.f103601b = viewGroup;
        this.f103602c = textView;
        this.f103603d = i;
        this.f103604e = i2;
        this.f103605f = spannableString;
        this.f103606g = spannableString2;
        this.f103607h = textView2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C39865a.m127603a(this.f103600a, this.f103601b, this.f103602c, this.f103603d, this.f103604e, this.f103605f, this.f103606g, this.f103607h, view);
    }
}
