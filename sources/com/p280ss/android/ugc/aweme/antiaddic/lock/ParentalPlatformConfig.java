package com.p280ss.android.ugc.aweme.antiaddic.lock;

import android.text.TextUtils;
import com.bytedance.ies.NullValueException;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C22879as;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig */
public final class ParentalPlatformConfig {

    /* renamed from: a */
    public static final ParentalPlatformConfig f60133a = new ParentalPlatformConfig();

    /* renamed from: b */
    private static final Keva f60134b;

    /* renamed from: c */
    private static C37723b f60135c;

    /* renamed from: d */
    private static C37723b f60136d;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig$Role */
    public enum Role {
        UNLINK_LOCKED,
        PARENT,
        CHILD,
        NONE,
        CLOSE
    }

    private ParentalPlatformConfig() {
    }

    /* renamed from: a */
    public static C37723b m74612a() {
        if (f60135c == null) {
            return f60136d;
        }
        return f60135c;
    }

    /* renamed from: c */
    public final boolean mo59215c() {
        int i;
        C37723b a = m74612a();
        if (a != null) {
            i = a.f98259Q;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo59216d() {
        int i;
        C37723b a = m74612a();
        if (a != null) {
            i = a.f98260R;
        } else {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int mo59217e() {
        C37723b a = m74612a();
        if (a != null) {
            return a.f98260R;
        }
        return 0;
    }

    static {
        Keva repoSync = Keva.getRepoSync("repo_parental_platform", 0);
        C7573i.m23582a((Object) repoSync, "Keva.getRepoSync(REPO_NA…ants.MODE_SINGLE_PROCESS)");
        f60134b = repoSync;
        m74618j();
    }

    /* renamed from: f */
    public final boolean mo59218f() {
        if (m74612a() == null) {
            return true;
        }
        C37723b a = m74612a();
        if (a == null || a.f98262T != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static String m74615g() {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl guardianChildScheme = inst.getGuardianChildScheme();
        C7573i.m23582a((Object) guardianChildScheme, "SharePrefCache.inst().guardianChildScheme");
        String str = (String) guardianChildScheme.mo59877d();
        if (str != null) {
            if (!(!TextUtils.isEmpty(str))) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return C22879as.m75347b();
    }

    /* renamed from: h */
    public static String m74616h() {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl guardianParentScheme = inst.getGuardianParentScheme();
        C7573i.m23582a((Object) guardianParentScheme, "SharePrefCache.inst().guardianParentScheme");
        String str = (String) guardianParentScheme.mo59877d();
        if (str != null) {
            if (!(!TextUtils.isEmpty(str))) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return C22879as.m75346a();
    }

    /* renamed from: i */
    public static String m74617i() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            FeConfigCollection feConfigCollection = a.getFeConfigCollection();
            C7573i.m23582a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
            FEConfig guardianEntrance = feConfigCollection.getGuardianEntrance();
            C7573i.m23582a((Object) guardianEntrance, "SettingsReader.get().feC…llection.guardianEntrance");
            return guardianEntrance.getSchema();
        } catch (NullValueException unused) {
            return C22879as.m75348c();
        }
    }

    /* renamed from: j */
    private static void m74618j() {
        if (f60134b.getBoolean("valid", false)) {
            C37723b bVar = new C37723b();
            bVar.f98259Q = f60134b.getInt("teen_mode", 0);
            bVar.f98289y = f60134b.getBoolean("chatSettingOpenEveryone", false);
            bVar.f98261S = f60134b.getInt("parentalGuardianMode", 0);
            bVar.f98260R = f60134b.getInt("screenTimeManagement", 0);
            bVar.f98262T = f60134b.getInt("parentalGuardianEntrance", 0);
            f60136d = bVar;
        }
    }

    /* renamed from: b */
    public final Role mo59214b() {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin() || m74612a() == null) {
            return Role.CLOSE;
        }
        return m74613b(m74612a());
    }

    /* renamed from: a */
    public final void mo59213a(C37723b bVar) {
        f60135c = bVar;
        m74614c(bVar);
    }

    /* renamed from: b */
    public static Role m74613b(C37723b bVar) {
        if (bVar == null) {
            return Role.CLOSE;
        }
        switch (bVar.f98261S) {
            case 0:
                return Role.CLOSE;
            case 1:
                return Role.NONE;
            case 2:
                return Role.CHILD;
            case 3:
                return Role.PARENT;
            case 4:
                return Role.UNLINK_LOCKED;
            default:
                return Role.CLOSE;
        }
    }

    /* renamed from: c */
    private static void m74614c(C37723b bVar) {
        f60136d = bVar;
        if (bVar == null) {
            f60134b.storeBoolean("valid", false);
            return;
        }
        f60134b.storeBoolean("valid", true);
        f60134b.storeInt("teen_mode", bVar.f98259Q);
        f60134b.storeBoolean("chatSettingOpenEveryone", bVar.f98289y);
        f60134b.storeInt("parentalGuardianMode", bVar.f98261S);
        f60134b.storeInt("screenTimeManagement", bVar.f98260R);
        f60134b.storeInt("parentalGuardianEntrance", bVar.f98262T);
    }
}
