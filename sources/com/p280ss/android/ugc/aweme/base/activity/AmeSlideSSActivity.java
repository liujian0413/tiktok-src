package com.p280ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.utils.C43073dv;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity */
public class AmeSlideSSActivity extends AmeSSActivity {

    /* renamed from: a */
    protected C23259f f61273a;

    /* renamed from: b */
    private Handler f61274b = new Handler();

    /* renamed from: c */
    private Runnable f61275c = new Runnable() {
        public final void run() {
            if (AmeSlideSSActivity.this.f61273a != null) {
                AmeSlideSSActivity.this.f61273a.mo60530c();
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo60512e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo60513f() {
        return 1;
    }

    /* renamed from: a */
    private static boolean mo75662a() {
        try {
            return C30199h.m98861a().getUseRightSwipeBack().booleanValue();
        } catch (NullValueException unused) {
            return false;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f61274b.removeCallbacks(this.f61275c);
    }

    public void onPause() {
        super.onPause();
        this.f61274b.removeCallbacks(this.f61275c);
        this.f61274b.postDelayed(this.f61275c, TimeUnit.SECONDS.toMillis(2));
    }

    public void onResume() {
        super.onResume();
        this.f61274b.removeCallbacks(this.f61275c);
        if (this.f61273a != null) {
            this.f61273a.mo60529b();
        }
    }

    public Resources getResources() {
        if (!this.mFirstResumed) {
            C43073dv.m136653b((Activity) this);
            if (C23346d.m76602a(this)) {
                return new C23346d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
            }
        }
        return super.getResources();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo75662a() && mo60512e()) {
            this.f61273a = new C23259f(this, mo60513f());
            this.f61273a.mo60527a();
        }
    }
}
