package com.p280ss.android.ugc.aweme.setting.secret.p1526a;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.setting.personalization.p1525c.C37686a.C37687a;
import com.p280ss.android.ugc.aweme.setting.secret.C37702c;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37709b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37716e;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.setting.secret.a.a */
public final class C37699a {
    /* renamed from: c */
    private static void m120559c() {
        new C36011ai().mo91644a(true);
    }

    /* renamed from: b */
    public static void m120557b() {
        if (C21115b.m71197a().getCurUser().getNotifyPrivateAccount() == 1) {
            C42961az.m136380a(new C37702c());
            return;
        }
        C37716e eVar = new C37716e();
        eVar.mo66537a(new C37709b() {
            /* renamed from: c_ */
            public final void mo83182c_(Exception exc) {
            }

            /* renamed from: a */
            public final void mo83181a(C37723b bVar) {
                if (bVar.f98264V == 1) {
                    C21115b.m71197a().getCurUser().setForcePrivateAccount(bVar.f98244B);
                    C21115b.m71197a().updateNotifyPrivateAccount(1);
                    C42961az.m136380a(new C37702c());
                }
            }
        });
        eVar.mo56976a(new Object[0]);
    }

    /* renamed from: d */
    private static boolean m120560d() {
        User curUser = C21115b.m71197a().getCurUser();
        String curUserId = C21115b.m71197a().getCurUserId();
        Set set = (Set) C23060u.m75742a().mo60057aa().mo59877d();
        if (!C21115b.m71197a().isLogin() || curUser == null || set.contains(curUserId)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m120556a() {
        Set set = (Set) C23060u.m75742a().mo60056Z().mo59877d();
        String curUserId = C21115b.m71197a().getCurUserId();
        if (C21115b.m71197a().getCurUser().isForcePrivateAccount() && !C21115b.m71197a().getCurUser().isSecret()) {
            m120559c();
            SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().mo59871a(Boolean.valueOf(true));
        }
        if (!C6399b.m19946v() || TextUtils.isEmpty(curUserId) || C21115b.m71197a().getCurUser() == null || C21115b.m71197a().getCurUser().getNotifyPrivateAccount() != 1 || set == null || set.contains(curUserId) || !C37687a.m120536e() || !m120560d()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m120554a(C22903bl<Set<String>> blVar) {
        if (blVar != null) {
            Set set = (Set) blVar.mo59877d();
            if (set != null) {
                String curUserId = C21115b.m71197a().getCurUserId();
                if (!TextUtils.isEmpty(curUserId)) {
                    set.add(curUserId);
                }
                blVar.mo59871a(set);
            }
        }
    }

    /* renamed from: a */
    public static void m120555a(String str, boolean z) {
        String str2;
        if (TextUtils.equals(str, "privacy_account_setting_show")) {
            str2 = "account_privacy_show";
        } else {
            str2 = "account_privacy_confirm";
        }
        C6907h.m21524a(str2, (Map) C22984d.m75611a().mo59970a("is_register", z ^ true ? 1 : 0).f60753a);
    }

    /* renamed from: b */
    public static void m120558b(String str, boolean z) {
        String str2;
        if (TextUtils.equals(str, "privacy_account_setting_show")) {
            str2 = "force_account_privacy_show";
        } else {
            str2 = "force_account_privacy_confirm";
        }
        C6907h.m21524a(str2, (Map) C22984d.m75611a().mo59970a("is_register", z ^ true ? 1 : 0).f60753a);
    }
}
