package com.p280ss.android.ugc.aweme.p1168df.base.p1170ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.df.base.ui.a */
public final class C26235a extends ProgressDialog {

    /* renamed from: a */
    public boolean f69155a = true;

    /* renamed from: b */
    CharSequence f69156b;

    /* renamed from: c */
    Drawable f69157c;

    /* renamed from: d */
    int f69158d;

    /* renamed from: e */
    private boolean f69159e;

    public final void setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        if (this.f69159e) {
            TextView textView = (TextView) findViewById(R.id.by6);
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
        this.f69156b = charSequence;
    }

    /* renamed from: a */
    private void m86239a(Drawable drawable) {
        if (this.f69159e) {
            View findViewById = findViewById(R.id.cwi);
            if (findViewById != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0683b.m2903a(getContext(), (int) R.drawable.pm)}));
            }
        }
        this.f69157c = drawable;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.a9s);
        this.f69159e = true;
        setMessage(this.f69156b);
        setIndeterminate(false);
        setProgress(this.f69158d);
        if (this.f69157c != null) {
            m86239a(this.f69157c);
        }
    }

    public final void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.f69159e) {
            DynamicFeatureCircularProgressView dynamicFeatureCircularProgressView = (DynamicFeatureCircularProgressView) findViewById(R.id.b_w);
            if (dynamicFeatureCircularProgressView != null) {
                dynamicFeatureCircularProgressView.setIndeterminate(z);
            }
            TextView textView = (TextView) findViewById(R.id.cky);
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    public final void setProgress(int i) {
        super.setProgress(i);
        if (this.f69159e) {
            TextView textView = (TextView) findViewById(R.id.cky);
            if (textView != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("%");
                textView.setText(sb.toString());
            }
            DynamicFeatureCircularProgressView dynamicFeatureCircularProgressView = (DynamicFeatureCircularProgressView) findViewById(R.id.b_w);
            if (dynamicFeatureCircularProgressView != null) {
                dynamicFeatureCircularProgressView.setProgress((float) i);
            }
        }
        this.f69158d = i;
    }

    public C26235a(Context context, int i) {
        super(context, 3);
    }
}
