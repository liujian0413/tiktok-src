package com.p280ss.sys.p1806ck;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.sys.ck.a */
public final class C45969a extends AlertDialog {

    /* renamed from: a */
    public C45973a f117484a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f117485b;

    /* renamed from: c */
    private TextView f117486c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ScrollView f117487d;

    /* renamed from: e */
    private TextView f117488e;

    /* renamed from: f */
    private Button f117489f;

    /* renamed from: g */
    private Button f117490g;

    /* renamed from: h */
    private String f117491h = "";

    /* renamed from: i */
    private String f117492i = "";

    /* renamed from: j */
    private String f117493j = "";

    /* renamed from: com.ss.sys.ck.a$a */
    public interface C45973a {
        /* renamed from: a */
        void mo111296a();

        /* renamed from: b */
        void mo111297b();
    }

    public C45969a(Context context, String str, String str2, String str3) {
        super(context, R.style.x5);
        setCanceledOnTouchOutside(false);
        this.f117485b = context;
        this.f117491h = str;
        this.f117492i = str2;
        this.f117493j = str3;
    }

    /* renamed from: a */
    private void m144142a() {
        this.f117486c = (TextView) findViewById(R.id.f_);
        this.f117487d = (ScrollView) findViewById(R.id.f8);
        this.f117488e = (TextView) findViewById(R.id.f7);
        this.f117489f = (Button) findViewById(R.id.f9);
        this.f117490g = (Button) findViewById(R.id.f6);
    }

    /* renamed from: b */
    private void m144144b() {
        if (!TextUtils.isEmpty(this.f117491h)) {
            this.f117488e.setText(this.f117491h);
        }
        if (!TextUtils.isEmpty(this.f117492i)) {
            this.f117489f.setText(this.f117492i);
        }
        if (!TextUtils.isEmpty(this.f117493j)) {
            this.f117490g.setText(this.f117493j);
        }
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        this.f117488e.setLayoutParams(layoutParams);
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.f117485b).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (displayMetrics.widthPixels <= 480) {
            this.f117488e.setTextSize(15.0f);
        }
        final int i = displayMetrics.heightPixels;
        this.f117487d.post(new Runnable() {
            public final void run() {
                ScrollView a;
                LinearLayout.LayoutParams layoutParams;
                new StringBuilder("mMsgScroll.getMeasuredHeight()=").append(C45969a.this.f117487d.getMeasuredHeight());
                if (C45969a.this.f117487d.getMeasuredHeight() > i / 2) {
                    a = C45969a.this.f117487d;
                    layoutParams = new LinearLayout.LayoutParams(displayMetrics.widthPixels - (C45969a.this.f117485b.getResources().getDimensionPixelOffset(R.dimen.bs) * 2), i / 2);
                } else {
                    a = C45969a.this.f117487d;
                    layoutParams = new LinearLayout.LayoutParams(displayMetrics.widthPixels - (C45969a.this.f117485b.getResources().getDimensionPixelOffset(R.dimen.bs) * 2), -2);
                }
                a.setLayoutParams(layoutParams);
            }
        });
    }

    /* renamed from: c */
    private void m144146c() {
        this.f117489f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C45969a.this.dismiss();
                if (C45969a.this.f117484a != null) {
                    C45969a.this.f117484a.mo111297b();
                }
            }
        });
        this.f117490g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C45969a.this.dismiss();
                if (C45969a.this.f117484a != null) {
                    C45969a.this.f117484a.mo111296a();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fq);
        m144142a();
        m144144b();
        m144146c();
    }
}
