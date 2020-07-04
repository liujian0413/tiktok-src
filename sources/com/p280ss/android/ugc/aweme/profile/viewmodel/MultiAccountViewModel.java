package com.p280ss.android.ugc.aweme.profile.viewmodel;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.webkit.CookieManager;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.sdk.account.p645a.p647b.C12720d;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.user.C42800a;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel */
public final class MultiAccountViewModel extends C0063u {

    /* renamed from: a */
    public static int f96534a;

    /* renamed from: b */
    public static long f96535b;

    /* renamed from: c */
    public static final C36789a f96536c = new C36789a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel$a */
    public static final class C36789a {
        private C36789a() {
        }

        /* renamed from: b */
        private static void m118566b() {
            if (C6399b.m19944t()) {
                try {
                    String cookie = CookieManager.getInstance().getCookie("tiktokv.com");
                    C6907h.m21524a("cookie_status", (Map) C22984d.m75611a().mo59973a("cookie1", cookie).mo59973a("cookie2", CookieManager.getInstance().getCookie("musical.ly")).f60753a);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        public static boolean m118565a() {
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            String curUserId = a.getCurUserId();
            List allUidList = C21115b.m71197a().allUidList();
            C7573i.m23582a((Object) allUidList, "AccountUserProxyService.get().allUidList()");
            Iterable iterable = allUidList;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            Iterator it = iterable.iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (!C7573i.m23585a((Object) curUserId, (Object) str)) {
                    C7573i.m23582a((Object) str, "it");
                    i = C34315c.m110973a(str);
                }
                arrayList.add(Integer.valueOf(i));
            }
            if (C7525m.m23527q((List) arrayList) > 0) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C36789a(C7571f fVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
            if (com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f96534a != com.p280ss.android.ugc.aweme.account.C21115b.m71197a().allUidList().size()) goto L_0x005c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo93124a(boolean r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
                java.lang.String r1 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                boolean r0 = r0.mo18722O()
                if (r0 != 0) goto L_0x0010
                return
            L_0x0010:
                long r0 = com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f96535b
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0033
                com.ss.android.ugc.aweme.app.AwemeApplication r0 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()
                android.content.Context r0 = (android.content.Context) r0
                java.lang.Class<com.ss.android.ugc.aweme.profile.t> r1 = com.p280ss.android.ugc.aweme.profile.C36089t.class
                java.lang.Object r0 = com.p280ss.android.ugc.aweme.base.p1054a.p1055a.C23222h.m76242a(r0, r1)
                com.ss.android.ugc.aweme.profile.t r0 = (com.p280ss.android.ugc.aweme.profile.C36089t) r0
                r1 = 0
                int r1 = r0.mo60382b(r1)
                com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f96534a = r1
                long r0 = r0.mo60383b(r2)
                com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f96535b = r0
            L_0x0033:
                if (r6 != 0) goto L_0x005c
                com.ss.android.ugc.aweme.IAccountUserService r6 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
                java.lang.String r0 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.C7573i.m23582a(r6, r0)
                boolean r6 = r6.isLogin()
                if (r6 == 0) goto L_0x00b0
                long r0 = com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f96535b
                boolean r6 = com.p280ss.android.ugc.aweme.utils.C42937ar.m136295a(r0)
                if (r6 == 0) goto L_0x005c
                int r6 = com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f96534a
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
                java.util.List r0 = r0.allUidList()
                int r0 = r0.size()
                if (r6 == r0) goto L_0x00b0
            L_0x005c:
                com.ss.android.ugc.aweme.IAccountUserService r6 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
                java.util.List r6 = r6.allUidList()
                int r6 = r6.size()
                com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f96534a = r6
                java.util.Calendar r6 = java.util.Calendar.getInstance()
                java.lang.String r0 = "Calendar.getInstance()"
                kotlin.jvm.internal.C7573i.m23582a(r6, r0)
                java.util.Date r6 = r6.getTime()
                java.lang.String r0 = "Calendar.getInstance().time"
                kotlin.jvm.internal.C7573i.m23582a(r6, r0)
                long r0 = r6.getTime()
                com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f96535b = r0
                com.ss.android.ugc.aweme.app.AwemeApplication r6 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()
                android.content.Context r6 = (android.content.Context) r6
                java.lang.Class<com.ss.android.ugc.aweme.profile.t> r0 = com.p280ss.android.ugc.aweme.profile.C36089t.class
                java.lang.Object r6 = com.p280ss.android.ugc.aweme.base.p1054a.p1055a.C23222h.m76242a(r6, r0)
                com.ss.android.ugc.aweme.profile.t r6 = (com.p280ss.android.ugc.aweme.profile.C36089t) r6
                int r0 = com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f96534a
                r6.mo60378a(r0)
                long r0 = com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f96535b
                r6.mo60379a(r0)
                java.lang.String r6 = "multi_account_status"
                com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r1 = "account_num"
                int r2 = com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.f96534a
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59970a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r6, r0)
                m118566b()
            L_0x00b0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.C36789a.mo93124a(boolean):void");
        }

        /* renamed from: a */
        public static void m118564a(FragmentActivity fragmentActivity, String str, String str2) {
            C7573i.m23587b(str, "enterFrom");
            C7573i.m23587b(str2, "enterMethod");
            Activity activity = fragmentActivity;
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            C32656f.m105743a(activity, str, str2, C42914ab.m136242a().mo104633a("previous_uid", a.getCurUserId()).mo104634a("force_use_default_login_method", true).mo104634a("is_multi_account", true).mo104634a("need_auto_fill_latest_login_info", false).f111445a);
        }
    }

    /* renamed from: a */
    public static final void m118557a(FragmentActivity fragmentActivity, String str, String str2) {
        C36789a.m118564a(fragmentActivity, str, str2);
    }

    /* renamed from: a */
    public static final void m118559a(boolean z) {
        f96536c.mo93124a(true);
    }

    /* renamed from: b */
    public static final boolean m118560b() {
        return C36789a.m118565a();
    }

    /* renamed from: c */
    private static List<C42800a> m118561c() {
        List allUidList = C21115b.m71197a().allUidList();
        C7573i.m23582a((Object) allUidList, "AccountUserProxyService.get().allUidList()");
        Iterable<String> iterable = allUidList;
        Collection arrayList = new ArrayList();
        for (String findSignificanUserInfo : iterable) {
            C42800a findSignificanUserInfo2 = C21115b.m71197a().findSignificanUserInfo(findSignificanUserInfo);
            if (findSignificanUserInfo2 != null) {
                arrayList.add(findSignificanUserInfo2);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: d */
    private List<C42800a> m118562d() {
        Iterable c = m118561c();
        Collection arrayList = new ArrayList();
        for (Object next : c) {
            String str = ((C42800a) next).f111244a;
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (!C7573i.m23585a((Object) str, (Object) a.getCurUserId())) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r0.size() < 3) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (r0.size() < 2) goto L_0x0031;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.user.C42800a> mo93123a() {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            r2 = 1
            if (r1 == 0) goto L_0x001f
            java.util.List r1 = m118561c()
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            int r1 = r0.size()
            r3 = 3
            if (r1 >= r3) goto L_0x0030
            goto L_0x0031
        L_0x001f:
            java.util.List r1 = r11.m118562d()
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            int r1 = r0.size()
            r3 = 2
            if (r1 >= r3) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            if (r2 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.user.a r1 = new com.ss.android.ugc.aweme.user.a
            java.lang.String r4 = "-1"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 30
            r10 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.add(r1)
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.mo93123a():java.util.List");
    }

    /* renamed from: a */
    public static void m118558a(String str, Bundle bundle, C12720d dVar) {
        C7573i.m23587b(str, "uid");
        C6861a.m21333b().switchAccount(str, bundle, dVar);
    }
}
