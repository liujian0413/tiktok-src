package com.p280ss.android.ugc.aweme;

import android.app.Application;
import android.os.Handler;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.ugc.aweme.IAccountService.C21077a;
import com.p280ss.android.ugc.aweme.IAccountService.C21078b;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.AgeGateService;
import com.p280ss.android.ugc.aweme.account.model.C6862d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.BaseBindService;
import com.p280ss.android.ugc.aweme.services.BaseLoginService;
import com.p280ss.android.ugc.aweme.services.BindService;
import com.p280ss.android.ugc.aweme.services.LoginService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.bd */
public class C21671bd {

    /* renamed from: a */
    private static List<C21077a> f58080a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private static C21763n f58081b;

    /* renamed from: c */
    private static LoginService f58082c;

    /* renamed from: d */
    private static BindService f58083d;

    /* renamed from: b */
    public static Application m72532b() {
        return C21084a.f56601a;
    }

    /* renamed from: e */
    public static C21078b m72537e() {
        return C21084a.f56603c;
    }

    /* renamed from: a */
    public static void m72531a(boolean z, User user) {
        for (C21077a a : f58080a) {
            a.mo56854a(2, z, 0, user);
        }
    }

    /* renamed from: a */
    public static void m72530a(boolean z) {
        for (C21077a a : f58080a) {
            a.mo56854a(3, z, 0, null);
        }
    }

    /* renamed from: a */
    public static IAccountUserService m72520a() {
        return f58081b.userService();
    }

    /* renamed from: h */
    public static C6862d m72540h() {
        return C21084a.f56603c.mo56856a();
    }

    /* renamed from: i */
    public static void m72541i() {
        m72520a().accountUserClear();
    }

    /* renamed from: l */
    public static void m72544l() {
        m72520a().queryUser();
    }

    /* renamed from: d */
    public static String m72536d() {
        return m72520a().getCurUserId();
    }

    /* renamed from: f */
    public static AgeGateService m72538f() {
        return (AgeGateService) f58081b.ageGateService();
    }

    /* renamed from: g */
    public static boolean m72539g() {
        return f58081b.userService().isLogin();
    }

    /* renamed from: j */
    public static boolean m72542j() {
        return m72520a().isNewUser();
    }

    /* renamed from: k */
    public static User m72543k() {
        return m72520a().getCurUser();
    }

    /* renamed from: c */
    public static boolean m72535c() {
        if (m72545m().getLoginParam() == null || !m72545m().getLoginParam().f56593g) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static BaseLoginService m72545m() {
        if (f58082c == null) {
            f58082c = (LoginService) f58081b.loginService();
        }
        return f58082c;
    }

    /* renamed from: n */
    public static BaseBindService m72546n() {
        if (f58083d == null) {
            f58083d = (BindService) f58081b.bindService();
        }
        return f58083d;
    }

    /* renamed from: o */
    public static void m72547o() {
        for (C21077a a : f58080a) {
            a.mo56854a(4, true, 0, null);
        }
    }

    /* renamed from: a */
    public static void m72528a(C21763n nVar) {
        f58081b = nVar;
    }

    /* renamed from: a */
    public static <T> T m72521a(Class<T> cls) {
        return C21084a.m71113a(cls);
    }

    /* renamed from: b */
    public static void m72533b(C21077a aVar) {
        synchronized (C21671bd.class) {
            f58080a.remove(aVar);
        }
    }

    /* renamed from: b */
    public static void m72534b(User user) {
        for (C21077a a : f58080a) {
            a.mo56854a(1, true, 0, user);
        }
    }

    /* renamed from: a */
    public static void m72526a(C12898b bVar) {
        f58081b.userService().updateUserInfo(bVar);
    }

    /* renamed from: a */
    public static void m72527a(C21077a aVar) {
        synchronized (C21671bd.class) {
            if (!f58080a.contains(aVar)) {
                f58080a.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m72529a(User user) {
        m72520a().updateCurUser(user);
    }

    /* renamed from: a */
    public static void m72525a(Handler handler, boolean z) {
        m72520a().updateSecret(handler, false, 0);
    }

    /* renamed from: a */
    public static void m72522a(int i, int i2, Object obj) {
        f58081b.returnResult(i, i2, obj);
    }

    /* renamed from: a */
    public static void m72523a(int i, int i2, String str) {
        f58081b.notifyProgress(i, i2, str);
    }

    /* renamed from: a */
    public static void m72524a(int i, String str, C21083g gVar) {
        f58081b.proAccountService().switchProAccount(i, str, gVar);
    }
}
