package com.p280ss.android.ugc.aweme.profile.util;

import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.util.m */
final /* synthetic */ class C36742m implements OnClickListener {

    /* renamed from: a */
    private final ImageView f96425a;

    /* renamed from: b */
    private final ViewGroup f96426b;

    /* renamed from: c */
    private final TextView f96427c;

    /* renamed from: d */
    private final int f96428d;

    /* renamed from: e */
    private final int f96429e;

    /* renamed from: f */
    private final boolean f96430f;

    /* renamed from: g */
    private final SpannableString f96431g;

    C36742m(ImageView imageView, ViewGroup viewGroup, TextView textView, int i, int i2, boolean z, SpannableString spannableString) {
        this.f96425a = imageView;
        this.f96426b = viewGroup;
        this.f96427c = textView;
        this.f96428d = i;
        this.f96429e = i2;
        this.f96430f = z;
        this.f96431g = spannableString;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C36737j.m118422a(this.f96425a, this.f96426b, this.f96427c, this.f96428d, this.f96429e, this.f96430f, this.f96431g, view);
    }
}
