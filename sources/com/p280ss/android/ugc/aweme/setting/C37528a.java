package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.setting.a */
public final class C37528a {

    /* renamed from: a */
    public static final C37528a f97902a = new C37528a();

    /* renamed from: b */
    public boolean f97903b = this.f97904c.getBoolean("keva_enabled", false);

    /* renamed from: c */
    private Keva f97904c = Keva.getRepoSync("abmock_keva_repo", 0);

    private C37528a() {
    }

    /* renamed from: a */
    public final void mo94818a() {
        this.f97904c.storeBoolean("keva_enabled", C10292j.m30480a().mo25016a(ABMockKevaSettings.class, "abmock_keva_switch", C6384b.m19835a().mo15294c().getAbmockKevaSwitch()));
    }
}
