package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.view.View;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a */
public final class C40119a extends ProgressDialog {

    /* renamed from: a */
    CharSequence f104299a;

    /* renamed from: b */
    Drawable f104300b;

    /* renamed from: c */
    private boolean f104301c;

    /* renamed from: d */
    private AnimationImageView f104302d;

    public final void dismiss() {
        if (this.f104302d.mo7084e()) {
            this.f104302d.mo7085f();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m128252a(String str) {
        this.f104302d.setAnimation(str);
        this.f104302d.mo7078b();
        this.f104302d.mo7082c(true);
    }

    public final void setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        if (this.f104301c) {
            TextView textView = (TextView) findViewById(R.id.by6);
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
        this.f104299a = charSequence;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.a59);
        this.f104301c = true;
        this.f104302d = (AnimationImageView) findViewById(R.id.gf);
        setMessage(this.f104299a);
        setIndeterminate(false);
        if (this.f104300b != null) {
            m128251a(this.f104300b);
        }
    }

    /* renamed from: a */
    private void m128251a(Drawable drawable) {
        if (this.f104301c) {
            View findViewById = findViewById(R.id.cwi);
            if (findViewById != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0683b.m2903a(getContext(), (int) R.drawable.hk)}));
            }
        }
        this.f104300b = drawable;
    }

    private C40119a(Context context, int i) {
        super(context, 3);
    }

    /* renamed from: a */
    public static C40119a m128250a(Context context, String str, String str2) {
        C40119a aVar = new C40119a(context, 3);
        aVar.setCancelable(false);
        aVar.setIndeterminate(false);
        aVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            aVar.show();
        }
        aVar.setMessage(str);
        aVar.m128252a(str2);
        return aVar;
    }
}
