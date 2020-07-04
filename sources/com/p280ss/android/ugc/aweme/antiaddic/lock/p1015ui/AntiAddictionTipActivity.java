package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.AntiAddictionTipFragment;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.AntiAddictionTipFragment.C22620a;
import com.p280ss.android.ugc.aweme.antiaddic.p1011b.C22559a;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.AntiAddictionTipActivity */
public final class AntiAddictionTipActivity extends AmeBaseActivity {
    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.ad;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void onBackPressed() {
    }

    public final void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onCloseAntiAddictionEvent(C22559a aVar) {
        C7573i.m23587b(aVar, "event");
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0608j supportFragmentManager = getSupportFragmentManager();
        if (((AntiAddictionTipFragment) supportFragmentManager.mo2642a((int) R.id.aoy)) == null) {
            supportFragmentManager.mo2645a().mo2585a((int) R.id.aoy, C22620a.m74791a()).mo2606d();
        }
    }
}
