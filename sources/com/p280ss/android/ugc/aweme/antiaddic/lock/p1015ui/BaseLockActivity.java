package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.inputmethod.InputMethodManager;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.mobile.p1400a.C33601b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.BaseLockActivity */
public abstract class BaseLockActivity extends AmeSSActivity {

    /* renamed from: a */
    protected Fragment f60185a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo59305a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo59307b();

    /* renamed from: c */
    private void m74742c() {
        try {
            getSupportFragmentManager().mo2655c();
        } catch (Exception unused) {
        }
    }

    public void onBackPressed() {
        m74740a((Activity) this);
        if (getSupportFragmentManager().mo2657e() == 1) {
            C33601b.m108491a(this, false, true);
        } else {
            m74742c();
        }
    }

    /* renamed from: a */
    public final void mo59306a(Fragment fragment) {
        m74741a(fragment, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo59305a());
        mo59307b();
    }

    /* renamed from: a */
    private static void m74740a(Activity activity) {
        if (activity.getCurrentFocus() != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    /* renamed from: a */
    private void m74741a(Fragment fragment, boolean z) {
        if (getSupportFragmentManager().mo2658f() == null) {
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, fragment).mo2606d();
            return;
        }
        C0633q a = getSupportFragmentManager().mo2645a();
        a.mo2584a(R.anim.c4, R.anim.cc, R.anim.c2, R.anim.cf);
        a.mo2599b(R.id.aoy, fragment);
        a.mo2589a((String) null);
        a.mo2606d();
    }
}
