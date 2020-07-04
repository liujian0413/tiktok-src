package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.f */
public final class C31991f extends Dialog {

    /* renamed from: a */
    private final View f83683a;

    /* renamed from: b */
    private final TextView f83684b;

    public final void dismiss() {
        C31992g.m103915a(this);
        View view = this.f83683a;
        C7573i.m23582a((Object) view, "mMainLayout");
        ObjectAnimator.ofFloat(this.f83683a, "alpha", new float[]{view.getAlpha(), 0.0f}).setDuration(300).start();
    }

    public final void show() {
        super.show();
        ObjectAnimator.ofFloat(this.f83683a, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
    }

    /* renamed from: a */
    public final void mo82918a(String str) {
        C7573i.m23587b(str, "loadingTxt");
        this.f83684b.setText(str);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f83683a);
        setCanceledOnTouchOutside(false);
    }

    public C31991f(Context context) {
        C7573i.m23587b(context, "context");
        super(context, R.style.ga);
        this.f83683a = LayoutInflater.from(context).inflate(R.layout.kd, null);
        View findViewById = this.f83683a.findViewById(R.id.bu6);
        C7573i.m23582a((Object) findViewById, "mMainLayout.findViewById(R.id.loading_tv)");
        this.f83684b = (TextView) findViewById;
    }
}
