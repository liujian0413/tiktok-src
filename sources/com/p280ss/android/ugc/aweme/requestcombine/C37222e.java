package com.p280ss.android.ugc.aweme.requestcombine;

import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.C22573a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p313im.C30561h.C30562a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.e */
public final class C37222e {

    /* renamed from: a */
    public static final C37223a f97349a = new C37223a(null);

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.e$a */
    public static final class C37223a {

        /* renamed from: com.ss.android.ugc.aweme.requestcombine.e$a$a */
        public static final class C37224a implements C22573a {

            /* renamed from: a */
            final /* synthetic */ int f97350a;

            C37224a(int i) {
                this.f97350a = i;
            }

            /* renamed from: a */
            public final void mo59223a(Exception exc) {
                C7573i.m23587b(exc, "e");
                C37223a.m119657b(this.f97350a, null);
            }

            /* renamed from: a */
            public final void mo59222a(C37723b bVar, boolean z) {
                C7573i.m23587b(bVar, "settings");
                if (this.f97350a == 1 && !z && TimeLockRuler.sLastContentFilterState && ParentalPlatformConfig.m74613b(bVar) == Role.CHILD && bVar.f98259Q == 0) {
                    TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                    if (userSetting != null) {
                        userSetting.setContentFilterOn(false);
                        TimeLockRuler.applyUserSetting(userSetting);
                    }
                    C22603f.m74713a();
                }
                C30562a.m99834a().mo80303a(Integer.valueOf(bVar.f98276l));
                C37223a.m119657b(this.f97350a, bVar);
            }
        }

        private C37223a() {
        }

        public /* synthetic */ C37223a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo93744a(int i, C37723b bVar) {
            C7573i.m23587b(bVar, "pushSettings");
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (a.isLogin()) {
                ParentalPlatformManager.m74628a((C22573a) new C37224a(1), bVar);
            } else {
                m119657b(1, null);
            }
        }

        /* renamed from: b */
        public static void m119657b(int i, C37723b bVar) {
            String str;
            String str2;
            String str3;
            if (i == 1) {
                if (TimeLockRuler.isTimeLockOn()) {
                    str = "on";
                } else {
                    str = "off";
                }
                if (TimeLockRuler.isContentFilterOn()) {
                    str2 = "on";
                } else {
                    str2 = "off";
                }
                if (ParentalPlatformConfig.f60133a.mo59214b() == Role.CHILD || ParentalPlatformConfig.f60133a.mo59214b() == Role.PARENT) {
                    str3 = "on";
                } else {
                    str3 = "off";
                }
                C6907h.m21524a("time_lock_status", (Map) C22984d.m75611a().mo59973a("status", str).f60753a);
                C6907h.m21524a("teen_mode_status", (Map) C22984d.m75611a().mo59973a("status", str2).f60753a);
                C6907h.m21524a("kid_platform_status", (Map) C22984d.m75611a().mo59973a("status", str3).f60753a);
            }
        }
    }
}
