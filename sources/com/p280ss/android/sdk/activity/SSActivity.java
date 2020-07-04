package com.p280ss.android.sdk.activity;

import android.os.Bundle;
import com.bytedance.common.utility.C9729e;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.sdk.C20095a;
import com.p280ss.android.ugc.aweme.base.activity.C23256c;

/* renamed from: com.ss.android.sdk.activity.SSActivity */
public class SSActivity extends AbsActivity implements C9729e {

    /* renamed from: a */
    private C20095a f54399a;

    /* renamed from: b */
    private boolean f54400b;

    /* renamed from: c */
    private int f54401c = -1;

    /* renamed from: d */
    private int f54402d = -1;

    /* renamed from: k */
    protected int f54403k;

    /* renamed from: l */
    public boolean f54404l;

    public void overridePendingTransition(int i, int i2) {
    }

    public void finish() {
        super.finish();
        C23256c.m76348b(this, this.f54403k);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f54399a != null) {
            this.f54399a.mo53805a();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f54399a != null) {
            this.f54399a.mo53810b();
        }
    }

    public void onResume() {
        this.f54404l = true;
        super.onResume();
        if (this.f54399a != null) {
            this.f54399a.mo53811c();
        }
    }

    /* renamed from: a */
    private void mo53821a() {
        if (this.f54399a == null) {
            this.f54399a = new C20095a(this);
            this.f54399a.mo53809a(this.f54400b);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f54400b = false;
        C23256c.m76347a(this, this.f54403k);
    }

    public void showCustomToast(String str) {
        if (isViewValid()) {
            mo53821a();
            this.f54399a.mo53808a(str);
        }
    }

    /* renamed from: a */
    public void mo53828a(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    public void showCustomLongToast(int i, String str) {
        if (isViewValid()) {
            mo53821a();
            this.f54399a.mo53806a(i, str);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        if (isViewValid()) {
            mo53821a();
            this.f54399a.mo53807a(i, str, i2, i3);
        }
    }
}
