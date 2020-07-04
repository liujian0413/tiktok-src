package com.p280ss.android.ugc.aweme.account.p945h;

import android.os.Bundle;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p647b.C12720d;
import com.bytedance.sdk.account.p645a.p649d.C12733e;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21151c;
import com.p280ss.android.ugc.aweme.account.log.C21249a;
import com.p280ss.android.ugc.aweme.account.p950k.C21233e;
import com.p280ss.android.ugc.aweme.account.p950k.C21233e.C21234a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.account.h.a */
public final class C21203a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f56982a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21203a.class), "userService", "getUserService()Lcom/ss/android/ugc/aweme/IAccountUserService;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21203a.class), "passportApi", "getPassportApi()Lcom/bytedance/sdk/account/api/IBDAccountAPI;"))};

    /* renamed from: b */
    public static String f56983b = "";

    /* renamed from: c */
    public static final C21203a f56984c = new C21203a();

    /* renamed from: d */
    private static final boolean f56985d = C7163a.m22363a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static int f56986e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static List<String> f56987f;

    /* renamed from: g */
    private static final C7541d f56988g = C7546e.m23569a(C21207d.f56996a);

    /* renamed from: h */
    private static final C7541d f56989h = C7546e.m23569a(C21204a.f56990a);

    /* renamed from: com.ss.android.ugc.aweme.account.h.a$a */
    static final class C21204a extends Lambda implements C7561a<C12728d> {

        /* renamed from: a */
        public static final C21204a f56990a = new C21204a();

        C21204a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m71386a();
        }

        /* renamed from: a */
        private static C12728d m71386a() {
            return C12798d.m37186a(C21671bd.m72532b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.h.a$b */
    public static final class C21205b extends C12720d {

        /* renamed from: a */
        final /* synthetic */ Bundle f56991a;

        /* renamed from: b */
        final /* synthetic */ C12720d f56992b;

        /* renamed from: c */
        final /* synthetic */ String f56993c;

        /* renamed from: d */
        final /* synthetic */ boolean f56994d;

        /* renamed from: e */
        final /* synthetic */ Bundle f56995e;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(C12733e eVar) {
            C12898b bVar;
            if (eVar != null) {
                bVar = eVar.f33711g;
            } else {
                bVar = null;
            }
            C21671bd.m72526a(bVar);
            C21151c.m71290b(this.f56991a);
            C21249a.m71527b();
            C21233e.f57043d.mo57166a(0, Integer.valueOf(0), "");
            C12720d dVar = this.f56992b;
            if (dVar != null) {
                dVar.onSuccess(eVar);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onError(C12733e eVar, int i) {
            Integer num;
            String str;
            Integer num2;
            String str2;
            if (i == 1 || i == 4) {
                C21203a.f56984c.mo57132a().delete(this.f56993c, "switch error:1|4");
            }
            if (eVar != null) {
                num = Integer.valueOf(eVar.f33702b);
            } else {
                num = null;
            }
            if (eVar != null) {
                str = eVar.f33703c;
            } else {
                str = null;
            }
            C21249a.m71525a(num, str);
            C21234a aVar = C21233e.f57043d;
            if (eVar != null) {
                num2 = Integer.valueOf(eVar.f33702b);
            } else {
                num2 = null;
            }
            if (eVar != null) {
                str2 = eVar.f33703c;
            } else {
                str2 = null;
            }
            aVar.mo57166a(1, num2, str2);
            if (C21203a.f56987f != null && this.f56994d) {
                C21203a aVar2 = C21203a.f56984c;
                C21203a.f56986e = C21203a.f56986e - 1;
                if (C21203a.f56986e >= 0) {
                    List a = C21203a.f56987f;
                    if (a == null) {
                        C7573i.m23580a();
                    }
                    C21203a.m71380a((String) a.get(C21203a.f56986e), this.f56995e, true, this.f56992b);
                    return;
                }
            }
            C21671bd.m72531a(false, (User) null);
            C12720d dVar = this.f56992b;
            if (dVar != null) {
                dVar.onError(eVar, i);
            }
        }

        C21205b(Bundle bundle, C12720d dVar, String str, boolean z, Bundle bundle2) {
            this.f56991a = bundle;
            this.f56992b = dVar;
            this.f56993c = str;
            this.f56994d = z;
            this.f56995e = bundle2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.h.a$c */
    public static final class C21206c extends C12720d {
        C21206c() {
        }

        /* renamed from: a */
        private static void m71389a(C12733e eVar) {
            C21203a.m71383c();
        }

        public final /* synthetic */ void onSuccess(C12707b bVar) {
            m71389a((C12733e) bVar);
        }

        /* renamed from: a */
        private static void m71390a(C12733e eVar, int i) {
            C21203a.m71383c();
            C21151c.m71291c(null);
        }

        public final /* synthetic */ void onError(C12707b bVar, int i) {
            m71390a((C12733e) bVar, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.h.a$d */
    static final class C21207d extends Lambda implements C7561a<IAccountUserService> {

        /* renamed from: a */
        public static final C21207d f56996a = new C21207d();

        C21207d() {
            super(0);
        }

        /* renamed from: a */
        private static IAccountUserService m71391a() {
            return C21671bd.m72520a();
        }

        public final /* synthetic */ Object invoke() {
            return m71391a();
        }
    }

    private C21203a() {
    }

    /* renamed from: d */
    private final C12728d m71384d() {
        return (C12728d) f56989h.getValue();
    }

    /* renamed from: a */
    public final IAccountUserService mo57132a() {
        return (IAccountUserService) f56988g.getValue();
    }

    /* renamed from: c */
    public static void m71383c() {
        f56987f = null;
        f56986e = -1;
        f56983b = "";
    }

    /* renamed from: b */
    public static final void m71382b() {
        List<String> allUidList = f56984c.mo57132a().allUidList();
        f56987f = allUidList;
        if (allUidList == null) {
            C7573i.m23580a();
        }
        f56986e = C7525m.m23459a(allUidList);
        if (f56985d) {
            StringBuilder sb = new StringBuilder("Starting switch sequence, total UID: ");
            List<String> list = f56987f;
            if (list == null) {
                C7573i.m23580a();
            }
            sb.append(list.size());
            sb.append(' ');
            sb.append(String.valueOf(f56987f));
        }
        List<String> list2 = f56987f;
        if (list2 == null) {
            C7573i.m23580a();
        }
        String str = (String) C7525m.m23515h(list2);
        IAccountUserService a = f56984c.mo57132a();
        C7573i.m23582a((Object) a, "userService");
        String curUserId = a.getCurUserId();
        C7573i.m23582a((Object) curUserId, "userService.curUserId");
        C21249a.m71526a(curUserId, str, String.valueOf(f56987f), "after logout");
        if (f56986e >= 0) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("need_restart", true);
            m71380a(str, bundle, true, new C21206c());
        }
    }

    /* renamed from: a */
    public static final void m71379a(String str, Bundle bundle, C12720d dVar) {
        m71380a(str, bundle, false, dVar);
    }

    /* renamed from: a */
    public static final void m71380a(String str, Bundle bundle, boolean z, C12720d dVar) {
        boolean z2;
        Bundle bundle2;
        String str2;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            IAccountUserService a = f56984c.mo57132a();
            C7573i.m23582a((Object) a, "userService");
            if (!C7634n.m23717a(str, a.getCurUserId(), true)) {
                if (bundle == null) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = bundle;
                }
                String str3 = "previous_uid";
                IAccountUserService a2 = f56984c.mo57132a();
                C7573i.m23582a((Object) a2, "userService");
                if (a2.isLogin()) {
                    IAccountUserService a3 = f56984c.mo57132a();
                    C7573i.m23582a((Object) a3, "userService");
                    str2 = a3.getCurUserId();
                } else {
                    str2 = f56983b;
                }
                bundle2.putString(str3, str2);
                C12728d d = f56984c.m71384d();
                C21205b bVar = new C21205b(bundle2, dVar, str, z, bundle);
                d.mo31183a(str, (C12720d) bVar);
            }
        }
    }
}
