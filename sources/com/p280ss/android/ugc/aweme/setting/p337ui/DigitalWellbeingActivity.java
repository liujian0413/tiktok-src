package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.SetTimeLockActivity;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity */
public final class DigitalWellbeingActivity extends AmeBaseActivity implements OnClickListener {

    /* renamed from: a */
    private ButtonTitleBar f98390a;

    /* renamed from: b */
    private CommonItemView f98391b;

    /* renamed from: c */
    private CommonItemView f98392c;

    /* renamed from: d */
    private CommonItemView f98393d;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity$a */
    static final class C37752a implements OnClickListener {

        /* renamed from: a */
        public static final C37752a f98394a = new C37752a();

        C37752a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("enter_kid_platform", (Map) new HashMap());
            if (!C6399b.m19944t() || ParentalPlatformConfig.f60133a.mo59214b() == Role.PARENT) {
                C7195s.m22438a().mo18682a(ParentalPlatformConfig.m74616h());
            } else {
                C7195s.m22438a().mo18682a(ParentalPlatformConfig.m74617i());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity$b */
    public static final class C37753b implements C10797a {

        /* renamed from: a */
        final /* synthetic */ DigitalWellbeingActivity f98395a;

        /* renamed from: b */
        public final void mo25896b(View view) {
        }

        C37753b(DigitalWellbeingActivity digitalWellbeingActivity) {
            this.f98395a = digitalWellbeingActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            this.f98395a.onBackPressed();
        }
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.bc;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    private final void m120718c() {
        m120719d();
        m120720i();
    }

    public final void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: j */
    private final void m120721j() {
        C6907h.m21524a("enter_time_lock", (Map) C22984d.m75611a().f60753a);
        SetTimeLockActivity.m74746a(this, 0);
    }

    /* renamed from: d */
    private final void m120719d() {
        View findViewById = findViewById(R.id.dke);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.title_layout)");
        this.f98390a = (ButtonTitleBar) findViewById;
        ButtonTitleBar buttonTitleBar = this.f98390a;
        if (buttonTitleBar == null) {
            C7573i.m23583a("mTitle");
        }
        buttonTitleBar.setTitle((int) R.string.dqr);
        ButtonTitleBar buttonTitleBar2 = this.f98390a;
        if (buttonTitleBar2 == null) {
            C7573i.m23583a("mTitle");
        }
        buttonTitleBar2.setOnTitleBarClickListener(new C37753b(this));
    }

    /* renamed from: k */
    private final void m120722k() {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        C6907h.m21524a("enter_teen_mode", (Map) C22984d.m75611a().mo59973a("enter_from", C22603f.m74728d()).mo59970a("is_login", a.isLogin() ? 1 : 0).f60753a);
        SetTimeLockActivity.m74746a(this, 1);
    }

    public final void onResume() {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity", "onResume", true);
        super.onResume();
        if (C6399b.m19944t() && ParentalPlatformConfig.f60133a.mo59214b() == Role.CHILD) {
            finish();
        }
        m120715a(false);
        m120717b(false);
        CommonItemView commonItemView = this.f98393d;
        if (commonItemView == null) {
            C7573i.m23583a("mParentModeSetting");
        }
        if (ParentalPlatformConfig.f60133a.mo59214b() == Role.PARENT) {
            i = R.string.bde;
        } else {
            i = R.string.cno;
        }
        commonItemView.setRightText(getString(i));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity", "onResume", false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m120720i() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.app.u r0 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            java.lang.String r1 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.app.bl r0 = r0.mo60080j()
            java.lang.String r1 = "CommonSharePrefCache.ins….hadEnterDigitalWellbeing"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r0.mo59871a(r2)
            r0 = 2131297581(0x7f09052d, float:1.821311E38)
            android.view.View r0 = r4.findViewById(r0)
            java.lang.String r2 = "findViewById(R.id.digital_wellbeing_time_lock)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = (com.bytedance.ies.dmt.p262ui.common.views.CommonItemView) r0
            r4.f98391b = r0
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r4.f98391b
            if (r0 != 0) goto L_0x0033
            java.lang.String r2 = "mTimeLockSetting"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0033:
            r2 = 2131822513(0x7f1107b1, float:1.92778E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setLeftText(r2)
            r0 = 2131297580(0x7f09052c, float:1.8213109E38)
            android.view.View r0 = r4.findViewById(r0)
            java.lang.String r2 = "findViewById(R.id.digital_wellbeing_teenager_mode)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = (com.bytedance.ies.dmt.p262ui.common.views.CommonItemView) r0
            r4.f98392c = r0
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r4.f98392c
            if (r0 != 0) goto L_0x0058
            java.lang.String r2 = "mTeenagerModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0058:
            r2 = 2131822512(0x7f1107b0, float:1.9277798E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setLeftText(r2)
            r4.m120715a(r1)
            r4.m120717b(r1)
            r0 = 2131297579(0x7f09052b, float:1.8213107E38)
            android.view.View r0 = r4.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.digital_wellbeing_parent_mode)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = (com.bytedance.ies.dmt.p262ui.common.views.CommonItemView) r0
            r4.f98393d = r0
            com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig r0 = com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.f60133a
            com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig$Role r0 = r0.mo59214b()
            com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig$Role r1 = com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role.CLOSE
            r2 = 0
            if (r0 == r1) goto L_0x0105
            boolean r0 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136767b()
            if (r0 != 0) goto L_0x0105
            com.ss.android.ugc.aweme.app.u r0 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            java.lang.String r1 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.app.bl r0 = r0.mo60079i()
            java.lang.String r1 = "CommonSharePrefCache.inst().isForceMinor"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.Object r0 = r0.mo59877d()
            java.lang.String r1 = "CommonSharePrefCache.inst().isForceMinor.cache"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00af
            goto L_0x0105
        L_0x00af:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r4.f98393d
            if (r0 != 0) goto L_0x00b8
            java.lang.String r1 = "mParentModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00b8:
            r0.setVisibility(r2)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r4.f98393d
            if (r0 != 0) goto L_0x00c4
            java.lang.String r1 = "mParentModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00c4:
            r1 = 2131826574(0x7f11178e, float:1.9286036E38)
            java.lang.String r1 = r4.getString(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setLeftText(r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r4.f98393d
            if (r0 != 0) goto L_0x00d9
            java.lang.String r1 = "mParentModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00d9:
            com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig r1 = com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.f60133a
            com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig$Role r1 = r1.mo59214b()
            com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig$Role r3 = com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role.NONE
            if (r1 == r3) goto L_0x00eb
            r1 = 2131823438(0x7f110b4e, float:1.9279676E38)
        L_0x00e6:
            java.lang.String r1 = r4.getString(r1)
            goto L_0x00ef
        L_0x00eb:
            r1 = 2131825187(0x7f111223, float:1.9283223E38)
            goto L_0x00e6
        L_0x00ef:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setRightText(r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r4.f98393d
            if (r0 != 0) goto L_0x00fd
            java.lang.String r1 = "mParentModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00fd:
            com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity$a r1 = com.p280ss.android.ugc.aweme.setting.p337ui.DigitalWellbeingActivity.C37752a.f98394a
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            goto L_0x0113
        L_0x0105:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r4.f98393d
            if (r0 != 0) goto L_0x010e
            java.lang.String r1 = "mParentModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x010e:
            r1 = 8
            r0.setVisibility(r1)
        L_0x0113:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x013d
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r4.f98393d
            if (r0 != 0) goto L_0x0122
            java.lang.String r1 = "mParentModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0122:
            r0.setRightIconRes(r2)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r4.f98392c
            if (r0 != 0) goto L_0x012e
            java.lang.String r1 = "mTeenagerModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x012e:
            r0.setRightIconRes(r2)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r4.f98391b
            if (r0 != 0) goto L_0x013a
            java.lang.String r1 = "mTimeLockSetting"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x013a:
            r0.setRightIconRes(r2)
        L_0x013d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.setting.p337ui.DigitalWellbeingActivity.m120720i():void");
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity", "onCreate", true);
        super.onCreate(bundle);
        m120718c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity", "onCreate", false);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.a94) {
            m120721j();
            return;
        }
        if (num != null && num.intValue() == R.id.a93) {
            m120722k();
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onEvent(TimeLockUserSetting timeLockUserSetting) {
        int i;
        if (timeLockUserSetting != null && !timeLockUserSetting.isNotifyParentModeOnly()) {
            m120715a(false);
            m120717b(false);
        }
        CommonItemView commonItemView = this.f98393d;
        if (commonItemView == null) {
            C7573i.m23583a("mParentModeSetting");
        }
        if (ParentalPlatformConfig.f60133a.mo59214b() == Role.PARENT) {
            i = R.string.bde;
        } else {
            i = R.string.cno;
        }
        commonItemView.setRightText(getString(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m120715a(boolean z) {
        String str;
        int i;
        String str2;
        if (ParentalPlatformConfig.f60133a.mo59214b() == Role.UNLINK_LOCKED) {
            C37723b a = ParentalPlatformConfig.m74612a();
            if (a != null) {
                i = a.f98260R;
            } else {
                i = 0;
            }
            if (i > 0) {
                CommonItemView commonItemView = this.f98391b;
                if (commonItemView == null) {
                    C7573i.m23583a("mTimeLockSetting");
                }
                commonItemView.setRightText(getString(R.string.b3_));
                return;
            }
            CommonItemView commonItemView2 = this.f98391b;
            if (commonItemView2 == null) {
                C7573i.m23583a("mTimeLockSetting");
            }
            if (TimeLockRuler.isSelfTimeLockOn()) {
                str2 = getString(R.string.bde);
            } else {
                str2 = getString(R.string.cno);
            }
            commonItemView2.setRightText(str2);
            if (z) {
                CommonItemView commonItemView3 = this.f98391b;
                if (commonItemView3 == null) {
                    C7573i.m23583a("mTimeLockSetting");
                }
                commonItemView3.setOnClickListener(this);
            }
            return;
        }
        CommonItemView commonItemView4 = this.f98391b;
        if (commonItemView4 == null) {
            C7573i.m23583a("mTimeLockSetting");
        }
        if (TimeLockRuler.isTimeLockOn()) {
            str = getString(R.string.bde);
        } else {
            str = getString(R.string.cno);
        }
        commonItemView4.setRightText(str);
        if (z) {
            CommonItemView commonItemView5 = this.f98391b;
            if (commonItemView5 == null) {
                C7573i.m23583a("mTimeLockSetting");
            }
            commonItemView5.setOnClickListener(this);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m120717b(boolean r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig r0 = com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.f60133a
            com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig$Role r0 = r0.mo59214b()
            com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig$Role r1 = com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role.UNLINK_LOCKED
            r2 = 2131825187(0x7f111223, float:1.9283223E38)
            r3 = 2131823438(0x7f110b4e, float:1.9279676E38)
            if (r0 != r1) goto L_0x0084
            com.ss.android.ugc.aweme.setting.serverpush.model.b r0 = com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.m74612a()
            if (r0 == 0) goto L_0x0031
            int r0 = r0.f98259Q
            r1 = 1
            if (r0 != r1) goto L_0x0031
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r6 = r5.f98392c
            if (r6 != 0) goto L_0x0024
            java.lang.String r0 = "mTeenagerModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0024:
            r0 = 2131823021(0x7f1109ad, float:1.927883E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.setRightText(r0)
            return
        L_0x0031:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r5.f98392c
            if (r0 != 0) goto L_0x003a
            java.lang.String r1 = "mTeenagerModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x003a:
            boolean r1 = com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isSelfContentFilterOn()
            if (r1 != 0) goto L_0x0069
            com.ss.android.ugc.aweme.app.u r1 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            com.ss.android.ugc.aweme.app.bl r1 = r1.mo60079i()
            java.lang.String r4 = "CommonSharePrefCache.inst().isForceMinor"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            java.lang.Object r1 = r1.mo59877d()
            java.lang.String r4 = "CommonSharePrefCache.inst().isForceMinor.cache"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            java.lang.String r1 = r5.getString(r2)
            goto L_0x006d
        L_0x0069:
            java.lang.String r1 = r5.getString(r3)
        L_0x006d:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setRightText(r1)
            if (r6 == 0) goto L_0x0083
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r6 = r5.f98392c
            if (r6 != 0) goto L_0x007d
            java.lang.String r0 = "mTeenagerModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x007d:
            r0 = r5
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
        L_0x0083:
            return
        L_0x0084:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r5.f98392c
            if (r0 != 0) goto L_0x008d
            java.lang.String r1 = "mTeenagerModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x008d:
            boolean r1 = com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isContentFilterOn()
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = r5.getString(r3)
            goto L_0x009c
        L_0x0098:
            java.lang.String r1 = r5.getString(r2)
        L_0x009c:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setRightText(r1)
            if (r6 == 0) goto L_0x00b2
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r6 = r5.f98392c
            if (r6 != 0) goto L_0x00ac
            java.lang.String r0 = "mTeenagerModeSetting"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x00ac:
            r0 = r5
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.setting.p337ui.DigitalWellbeingActivity.m120717b(boolean):void");
    }
}
