package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22598e;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22612c;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.widget.TimeLockDesc;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22658a;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a.C23469a;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23470b;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TeenagerLockOptionsFragmentV2 */
public class TeenagerLockOptionsFragmentV2 extends AbsOptionsFragmentV2 {
    TimeLockDesc desc1;
    TimeLockDesc desc2;
    TimeLockDesc desc3;
    Button mAppealCloseTeenagerMode;
    View mBetaDes;
    View mBottom;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo59360a() {
        return R.layout.rb;
    }

    /* renamed from: g */
    private void m74856g() {
        Fragment b = C22612c.m74772b(1);
        C23470b.m77051a().mo61084a("TimeLockEnterFragmentV2", Boolean.class).mo61079a((C0043i) b).mo61081a(this, new C23469a() {
            /* renamed from: a */
            public final void mo59227a(Object obj) {
                Boolean bool = (Boolean) obj;
                if (!TeenagerLockOptionsFragmentV2.m74854a(bool)) {
                    C10761a.m31383a(C6399b.m19921a(), (int) R.string.dgr).mo25750a();
                    TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                    userSetting.setContentFilterOn(false);
                    if (!C21115b.m71197a().isLogin() || bool.booleanValue()) {
                        userSetting.setTimeLockOn(false);
                    }
                    if (userSetting.isTimeLockOn() || userSetting.isContentFilterOn()) {
                        TimeLockRuler.applyUserSetting(userSetting);
                    } else {
                        TimeLockRuler.removeUserSetting();
                    }
                    C6907h.m21524a("close_teen_mode_finish", (Map) C22984d.m75611a().f60753a);
                    C22603f.m74713a();
                }
            }
        });
        mo59362a(b);
    }

    /* renamed from: f */
    private void m74855f() {
        this.f60260e.setVisibility(8);
        this.f60261f.setBackgroundResource(R.drawable.cly);
        this.f60261f.setTextColor(getResources().getColor(R.color.a8d));
        if (!C6399b.m19944t()) {
            this.f60261f.setText(getString(R.string.b3h));
            this.desc3.setVisibility(0);
            this.desc3.setText(getString(R.string.cs7));
            this.desc3.setImageDrawable(getResources().getDrawable(R.drawable.b1g));
            return;
        }
        String str = ((C22658a) mo59364d().getValue()).f60316b.f60318b;
        if (!TextUtils.isEmpty(str)) {
            this.f60261f.setText(getString(R.string.b3i, str));
        } else {
            this.f60261f.setText(getString(R.string.b3h));
        }
        this.desc1.setText(getString(R.string.dnz));
        this.desc1.setImageDrawable(getResources().getDrawable(R.drawable.b1d));
        this.desc3.setVisibility(8);
        this.desc2.setText(getString(R.string.b3m));
        this.desc2.setImageDrawable(getResources().getDrawable(R.drawable.b1g));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo59371b(View view) {
        if (getContext() != null) {
            C22603f.m74720a("teen_mode", "appeal");
        }
    }

    /* renamed from: a */
    public static boolean m74854a(Boolean bool) {
        if (!C22598e.m74687f()) {
            return false;
        }
        C22598e.f60167a.mo59253b(bool.booleanValue());
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo59372c(View view) {
        C6907h.m21524a("close_teen_mode", (Map) C22984d.m75611a().f60753a);
        if (mo59365e()) {
            mo59361a(1);
        } else {
            m74856g();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!TimeLockRuler.isTeenagerAbEnable()) {
            this.desc2.setVisibility(8);
        }
        if (C6399b.m19944t()) {
            this.mBetaDes.setVisibility(4);
            this.desc1.setText(getString(R.string.dnz));
            this.desc2.setText(getString(R.string.do1));
            this.desc2.setImageDrawable(getResources().getDrawable(R.drawable.b1g));
        } else if (ParentalPlatformConfig.f60133a.mo59214b() == Role.PARENT && C21115b.m71197a().isLogin()) {
            this.desc1.setText(getString(R.string.e6f));
            C23487o.m77146a(true, this.mBottom);
            C23487o.m77146a(false, this.mAppealCloseTeenagerMode);
        } else if (((Boolean) C23060u.m75742a().mo60079i().mo59877d()).booleanValue()) {
            this.desc1.setText(getString(R.string.e5w));
            this.desc1.setImageDrawable(getResources().getDrawable(R.drawable.b1f));
            this.desc2.setText(getString(R.string.e6g));
            this.desc2.setImageDrawable(getResources().getDrawable(R.drawable.b1d));
            C23487o.m77146a(false, this.mBottom);
            C23487o.m77146a(true, this.mAppealCloseTeenagerMode);
        } else {
            this.desc1.setText(getString(R.string.e6g));
            C23487o.m77146a(true, this.mBottom);
            C23487o.m77146a(false, this.mAppealCloseTeenagerMode);
        }
        this.f60261f.setOnClickListener(new C22655d(this));
        if (mo59365e()) {
            m74855f();
        }
        this.mAppealCloseTeenagerMode.setOnClickListener(new C22656e(this));
    }
}
