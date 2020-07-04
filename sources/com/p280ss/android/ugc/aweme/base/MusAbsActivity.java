package com.p280ss.android.ugc.aweme.base;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.MusAbsActivity */
public class MusAbsActivity extends AmeActivity {
    public void setStatusBarColor() {
        m76148a(this, getStatusBarColor());
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.a5o);
    }

    /* renamed from: a */
    private static void m76148a(Activity activity, int i) {
        C23487o.m77137a(activity, i);
        C23487o.m77155c(activity);
    }
}
