package com.p280ss.android.ugc.aweme.account;

import com.p280ss.android.ugc.aweme.C21643ad;
import com.p280ss.android.ugc.aweme.C21658ar;
import com.p280ss.android.ugc.aweme.C21660at;
import com.p280ss.android.ugc.aweme.C21663aw;
import com.p280ss.android.ugc.aweme.C21664ax;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.IAgeGateService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: com.ss.android.ugc.aweme.account.a */
public final class C6861a {

    /* renamed from: a */
    private static volatile IAccountService f19512a;

    /* renamed from: a */
    public static IAccountService m21332a() {
        m21340i();
        return f19512a;
    }

    /* renamed from: b */
    public static C21658ar m21333b() {
        m21340i();
        return f19512a.loginService();
    }

    /* renamed from: c */
    public static IAgeGateService m21334c() {
        m21340i();
        return f19512a.ageGateService();
    }

    /* renamed from: d */
    public static C21643ad m21335d() {
        m21340i();
        return f19512a.bindService();
    }

    /* renamed from: e */
    public static C21660at m21336e() {
        m21340i();
        return f19512a.passwordService();
    }

    /* renamed from: f */
    public static IAccountUserService m21337f() {
        m21340i();
        return f19512a.userService();
    }

    /* renamed from: g */
    public static C21664ax m21338g() {
        m21340i();
        return f19512a.rnAndH5Service();
    }

    /* renamed from: h */
    public static C21663aw m21339h() {
        m21340i();
        return f19512a.proAccountService();
    }

    /* renamed from: i */
    private static void m21340i() {
        if (f19512a == null) {
            f19512a = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        }
    }
}
