package com.p280ss.android.ugc.aweme.requesttask.p1504a;

import android.content.Context;
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
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import com.p280ss.android.ugc.aweme.p313im.C30561h.C30562a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.a.c */
public final class C37229c implements C7152c {

    /* renamed from: a */
    private int f97354a = 1;

    /* renamed from: com.ss.android.ugc.aweme.requesttask.a.c$a */
    public static final class C37230a implements C22573a {

        /* renamed from: a */
        final /* synthetic */ C37229c f97355a;

        /* renamed from: b */
        final /* synthetic */ int f97356b;

        /* renamed from: a */
        public final void mo59223a(Exception exc) {
            C7573i.m23587b(exc, "e");
            C37229c.m119666a(this.f97356b, (C37723b) null);
        }

        C37230a(C37229c cVar, int i) {
            this.f97355a = cVar;
            this.f97356b = i;
        }

        /* renamed from: a */
        public final void mo59222a(C37723b bVar, boolean z) {
            C7573i.m23587b(bVar, "settings");
            if (this.f97356b == 1 && !z && TimeLockRuler.sLastContentFilterState && ParentalPlatformConfig.m74613b(bVar) == Role.CHILD && bVar.f98259Q == 0) {
                TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                if (userSetting != null) {
                    userSetting.setContentFilterOn(false);
                    TimeLockRuler.applyUserSetting(userSetting);
                }
                C22603f.m74713a();
            }
            C30562a.m99834a().mo80303a(Integer.valueOf(bVar.f98276l));
            C37229c.m119666a(this.f97356b, bVar);
        }
    }

    /* renamed from: a */
    public final RequestType mo18606a() {
        return RequestType.IDLE;
    }

    public C37229c(int i) {
    }

    /* renamed from: a */
    private final void m119665a(int i) {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (a.isLogin()) {
            ParentalPlatformManager.m74627a((C22573a) new C37230a(this, i));
        } else {
            m119666a(i, (C37723b) null);
        }
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        m119665a(this.f97354a);
    }

    /* renamed from: a */
    protected static void m119666a(int i, C37723b bVar) {
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
