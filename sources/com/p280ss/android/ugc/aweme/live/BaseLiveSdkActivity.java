package com.p280ss.android.ugc.aweme.live;

import android.os.Bundle;
import com.bytedance.common.utility.C9729e;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29962c;

/* renamed from: com.ss.android.ugc.aweme.live.BaseLiveSdkActivity */
public class BaseLiveSdkActivity extends AmeActivity implements C9729e {

    /* renamed from: a */
    private C29962c f84544a;

    /* renamed from: b */
    private boolean f84545b;

    static {
        C32430a.m105068e();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f84544a != null) {
            this.f84544a.mo76117a();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f84544a != null) {
            this.f84544a.mo76122b();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f84544a != null) {
            this.f84544a.mo76125c();
        }
    }

    /* renamed from: a */
    private boolean mo83650a() {
        if (!isViewValid()) {
            return false;
        }
        if (this.f84544a == null) {
            this.f84544a = new C29962c(this);
            this.f84544a.f78760g = this.f84545b;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C32528i.m105349a();
        this.f84545b = false;
    }

    public void showCustomToast(String str) {
        if (mo83650a()) {
            this.f84544a.mo76120a(str);
        }
    }

    public void showCustomLongToast(int i, String str) {
        if (mo83650a()) {
            this.f84544a.mo76118a(i, str);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        if (mo83650a()) {
            this.f84544a.mo76119a(i, str, i2, i3);
        }
    }
}
