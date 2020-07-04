package com.p280ss.android.ugc.aweme.qrcode.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.a */
public final class C37121a extends ProgressDialog {

    /* renamed from: a */
    CharSequence f97146a;

    /* renamed from: b */
    Drawable f97147b;

    /* renamed from: c */
    private boolean f97148c;

    /* renamed from: d */
    private ImageView f97149d;

    /* renamed from: e */
    private ImageView f97150e;

    /* renamed from: b */
    public final void mo93592b() {
        this.f97149d.setVisibility(4);
        this.f97150e.setVisibility(0);
    }

    public final void dismiss() {
        if (this.f97149d != null) {
            this.f97149d.clearAnimation();
        }
        super.dismiss();
    }

    public final void onBackPressed() {
        super.onBackPressed();
        if (isShowing()) {
            dismiss();
        }
    }

    /* renamed from: a */
    public final void mo93590a() {
        if (this.f97149d != null) {
            this.f97149d.clearAnimation();
            ((AnimationDrawable) this.f97149d.getDrawable()).start();
        }
    }

    public final void setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        if (this.f97148c) {
            TextView textView = (TextView) findViewById(R.id.by6);
            if (textView != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(charSequence);
                }
            }
        }
        this.f97146a = charSequence;
    }

    /* renamed from: a */
    public final void mo93591a(Drawable drawable) {
        if (this.f97148c) {
            View findViewById = findViewById(R.id.cwi);
            if (findViewById != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0683b.m2903a(getContext(), (int) R.drawable.blk)}));
            }
        }
        this.f97147b = drawable;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.a86);
        this.f97148c = true;
        this.f97149d = (ImageView) findViewById(R.id.gf);
        this.f97150e = (ImageView) findViewById(R.id.a__);
        LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.0f;
        getWindow().setAttributes(attributes);
        setMessage(this.f97146a);
        setIndeterminate(false);
        if (this.f97147b != null) {
            mo93591a(this.f97147b);
        }
    }

    private C37121a(Context context, int i) {
        super(context, 3);
    }

    /* renamed from: a */
    public static C37121a m119327a(Context context, String str) {
        C37121a aVar = new C37121a(context, 3);
        aVar.setCancelable(false);
        aVar.setIndeterminate(false);
        aVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            try {
                aVar.show();
            } catch (Exception unused) {
            }
        }
        aVar.setMessage(str);
        aVar.mo93590a();
        return aVar;
    }
}
