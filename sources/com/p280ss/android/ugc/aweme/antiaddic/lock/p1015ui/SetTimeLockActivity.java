package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2.TimeLockAboutFragmentV2.C22647a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22658a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22658a.C22659a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.SetLockParamViewModel;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity */
public class SetTimeLockActivity extends BaseLockActivity {

    /* renamed from: b */
    private C22658a f60186b;
    ViewGroup rootView;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo59305a() {
        return R.layout.cz;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: c */
    private static boolean m74748c() {
        if (TimeLockRuler.isSelfContentFilterOn() || ((Boolean) C23060u.m75742a().mo60079i().mo59877d()).booleanValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo59307b() {
        Fragment fragment;
        Fragment fragment2;
        Fragment fragment3;
        this.f60186b = new C22658a();
        this.f60186b.f60315a = getIntent().getIntExtra("SetTimeLockActivityKeyType", 0);
        if (getIntent().getBooleanExtra("SetTimeLockActivityKeyFromParent", false)) {
            C22659a aVar = new C22659a();
            aVar.f60317a = getIntent().getStringExtra("SetTimeLockActivityKeyUid");
            aVar.f60318b = getIntent().getStringExtra("SetTimeLockActivityKeyUsername");
            this.f60186b.f60316b = aVar;
        }
        ((SetLockParamViewModel) C0069x.m159a((FragmentActivity) this).mo147a(SetLockParamViewModel.class)).f60313a.setValue(this.f60186b);
        if (getIntent().getBooleanExtra("SetTimeLockActivityKeyFromParent", false)) {
            int intExtra = getIntent().getIntExtra("SetTimeLockActivityKeyLockTimeInMin", 0);
            if (intExtra > 0) {
                ((TimeLockOptionViewModel) C0069x.m159a((FragmentActivity) this).mo147a(TimeLockOptionViewModel.class)).f60314a.setValue(new C22647a(intExtra));
            }
            if (getIntent().getBooleanExtra("SetTimeLockActivityKeyParentState", false)) {
                fragment3 = C22612c.m74774c(this.f60186b.f60315a);
            } else {
                fragment3 = C22612c.m74770a(this.f60186b.f60315a);
            }
            mo59306a(fragment3);
        } else if (this.f60186b.f60315a == 0) {
            if (TimeLockRuler.isSelfTimeLockOn()) {
                fragment2 = C22612c.m74774c(this.f60186b.f60315a);
            } else {
                fragment2 = C22612c.m74770a(this.f60186b.f60315a);
            }
            mo59306a(fragment2);
        } else {
            if (m74748c()) {
                fragment = C22612c.m74774c(this.f60186b.f60315a);
            } else {
                fragment = C22612c.m74770a(this.f60186b.f60315a);
            }
            mo59306a(fragment);
        }
        if (C6399b.m19946v()) {
            this.rootView.setBackgroundColor(getResources().getColor(R.color.a7f));
        }
    }

    /* renamed from: a */
    public static void m74746a(Context context, int i) {
        Intent intent = new Intent(context, SetTimeLockActivity.class);
        intent.putExtra("SetTimeLockActivityKeyType", i);
        intent.putExtra("SetTimeLockActivityKeyFromParent", false);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m74747a(Context context, int i, String str, String str2, boolean z, int i2) {
        Intent intent = new Intent(context, SetTimeLockActivity.class);
        intent.putExtra("SetTimeLockActivityKeyType", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("SetTimeLockActivityKeyFromParent", true);
            intent.putExtra("SetTimeLockActivityKeyUid", str);
            intent.putExtra("SetTimeLockActivityKeyUsername", str2);
            intent.putExtra("SetTimeLockActivityKeyParentState", z);
            intent.putExtra("SetTimeLockActivityKeyLockTimeInMin", i2);
        }
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
