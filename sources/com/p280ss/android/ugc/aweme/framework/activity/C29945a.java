package com.p280ss.android.ugc.aweme.framework.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.framework.activity.a */
abstract class C29945a extends AppCompatActivity implements DefaultHardwareBackBtnHandler, C29948b {

    /* renamed from: a */
    public ReactRootView f78730a;

    /* renamed from: b */
    protected ImmersionBar f78731b;

    /* renamed from: c */
    public String f78732c = "";

    /* renamed from: d */
    public ReactInstanceManager f78733d;

    /* renamed from: e */
    private View f78734e;

    /* renamed from: f */
    private ViewGroup f78735f;

    /* renamed from: g */
    private FrameLayout f78736g;

    /* renamed from: h */
    private long f78737h;

    /* renamed from: i */
    private boolean f78738i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo76104a(Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Bundle mo76105b(Intent intent) {
        return null;
    }

    public String getReactId() {
        return "";
    }

    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }

    C29945a() {
    }

    public void onBackPressed() {
        if (this.f78733d != null) {
            this.f78733d.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    public void onPause() {
        this.f78733d.onHostPause(this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f78733d.onHostResume(this, this);
    }

    /* renamed from: a */
    private int m98182a() {
        String stringExtra = getIntent().getStringExtra("bg_theme");
        if (TextUtils.isEmpty(stringExtra)) {
            return -1;
        }
        return Color.parseColor(Uri.decode(stringExtra));
    }

    /* renamed from: d */
    public void mo67487d() {
        this.f78735f.setVisibility(8);
        this.f78736g.setVisibility(0);
        if (!this.f78738i) {
            ReactInstance.getProxy().mo67299a(SystemClock.elapsedRealtime() - this.f78737h);
        }
        this.f78738i = true;
    }

    public void onDestroy() {
        this.f78733d.onHostDestroy(this);
        this.f78733d.detachRootView(this.f78730a);
        if (this.f78730a != null) {
            this.f78730a.unmountReactApplication();
        }
        ReactInstance.detachReactView(this, getReactId());
        if (this.f78731b != null) {
            this.f78731b.destroy();
        }
        super.onDestroy();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f78737h = SystemClock.elapsedRealtime();
        setContentView((int) R.layout.a7d);
        this.f78732c = mo76104a(getIntent());
        ReactInstance.attachReactView(this);
        this.f78734e = findViewById(R.id.cwi);
        this.f78734e.setBackgroundColor(m98182a());
        this.f78736g = (FrameLayout) findViewById(R.id.ehf);
        this.f78735f = (ViewGroup) findViewById(R.id.btf);
        View a = ReactInstance.getConfig().mo67288a((Context) this);
        if (a != null) {
            findViewById(R.id.bty).setVisibility(8);
            findViewById(R.id.bu3).setVisibility(8);
            this.f78735f.addView(a, new LayoutParams(-1, -1));
        }
        this.f78730a = new ReactRootView(this);
        this.f78736g.addView(this.f78730a, new FrameLayout.LayoutParams(-1, -1));
        this.f78733d = ReactInstance.getReactInstanceManager(getReactId());
        this.f78730a.post(new Runnable() {
            public final void run() {
                C29945a.this.f78730a.startReactApplication(C29945a.this.f78733d, C29945a.this.f78732c, C29945a.this.mo76105b(C29945a.this.getIntent()));
            }
        });
        this.f78730a.postDelayed(new Runnable() {
            public final void run() {
                C29945a.this.mo67487d();
            }
        }, 3000);
    }
}
