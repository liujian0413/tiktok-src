package com.p280ss.android.ugc.aweme.account.base;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.base.MusAbsActivity */
public class MusAbsActivity extends AmeActivity {
    public void setStatusBarColor() {
        m71201a(this, getStatusBarColor());
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.a5o);
    }

    /* renamed from: a */
    private static void m71201a(Activity activity, int i) {
        C23487o.m77137a(activity, i);
        C23487o.m77155c(activity);
    }
}
