package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UsedPhoneConfirmActivity */
public final class UsedPhoneConfirmActivity extends AmeSSActivity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.al);
        C0633q a = getSupportFragmentManager().mo2645a();
        C7573i.m23582a((Object) a, "supportFragmentManager.beginTransaction()");
        a.mo2585a((int) R.id.aoy, (Fragment) new UsedPhoneConfirmFragment());
        a.mo2604c();
    }
}
