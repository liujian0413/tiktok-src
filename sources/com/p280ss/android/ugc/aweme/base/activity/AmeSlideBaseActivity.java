package com.p280ss.android.ugc.aweme.base.activity;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.base.activity.AmeSlideBaseActivity */
public class AmeSlideBaseActivity extends AmeBaseActivity {

    /* renamed from: a */
    protected C23259f f61269a;

    /* renamed from: b */
    private Handler f61270b = new Handler();

    /* renamed from: c */
    private Runnable f61271c = new Runnable() {
        public final void run() {
            if (AmeSlideBaseActivity.this.f61269a != null) {
                AmeSlideBaseActivity.this.f61269a.mo60530c();
            }
        }
    };

    public void onDestroy() {
        super.onDestroy();
        this.f61270b.removeCallbacks(this.f61271c);
    }

    /* renamed from: c */
    private static boolean m76340c() {
        try {
            if (!C30199h.m98861a().getUseRightSwipeBack().booleanValue()) {
                return false;
            }
        } catch (NullValueException unused) {
        }
        if (VERSION.SDK_INT == 29) {
            return false;
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        this.f61270b.removeCallbacks(this.f61271c);
        this.f61270b.postDelayed(this.f61271c, TimeUnit.SECONDS.toMillis(2));
    }

    public void onResume() {
        super.onResume();
        this.f61270b.removeCallbacks(this.f61271c);
        if (this.f61269a != null) {
            this.f61269a.mo60529b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m76340c()) {
            this.f61269a = new C23259f(this, 1);
            this.f61269a.mo60527a();
        }
    }
}
