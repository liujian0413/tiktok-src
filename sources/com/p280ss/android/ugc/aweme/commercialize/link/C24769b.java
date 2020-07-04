package com.p280ss.android.ugc.aweme.commercialize.link;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p280ss.android.ugc.aweme.profile.model.LinkUserInfoStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.b */
public final class C24769b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f65254a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C24769b.class), "shownGuideUserIdSpCache", "getShownGuideUserIdSpCache()Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C24769b.class), "settingItemEnteredUserId", "getSettingItemEnteredUserId()Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;"))};

    /* renamed from: b */
    public static final C24769b f65255b = new C24769b();

    /* renamed from: c */
    private static final C7541d f65256c = C7546e.m23569a(C24772c.f65263a);

    /* renamed from: d */
    private static final C7541d f65257d = C7546e.m23569a(C24771b.f65262a);

    /* renamed from: e */
    private static final C24770a f65258e = new C24770a("ad_link_auth_page_publish", "aweme://webview/?url=https%3A%2F%2Fwww.douyin.com%2Ffalcon%2Frn%2Flink_plan%3Fhide_nav_bar%3D1%26enter_from%3Dpublish&hide_nav_bar=1&enter_from=publish&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_link_plan%26bg_theme%3D%2523161823%26hide_nav_bar%3D1%26enter_from%3Dpublish");

    /* renamed from: f */
    private static final C24770a f65259f = new C24770a("ad_link_auth_page_settings", "aweme://webview/?url=https%3A%2F%2Fwww.douyin.com%2Ffalcon%2Frn%2Flink_plan%3Fhide_nav_bar%3D1%26enter_from%3Dsettings&hide_nav_bar=1&enter_from=settings&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_link_plan%26bg_theme%3D%2523161823%26hide_nav_bar%3D1%26enter_from%3Dsettings");

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.b$a */
    static final class C24770a {

        /* renamed from: a */
        private final C22903bl<String> f65260a;

        /* renamed from: b */
        private final String f65261b;

        /* renamed from: a */
        private String m81293a() {
            boolean z;
            String str = (String) this.f65260a.mo59877d();
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return this.f65261b;
            }
            return str;
        }

        /* renamed from: a */
        public final void mo64788a(Activity activity) {
            C7195s a = C7195s.m22438a();
            if (a != null) {
                a.mo18679a(activity, m81293a());
            }
        }

        /* renamed from: a */
        public final void mo64789a(String str) {
            boolean z;
            C22903bl<String> blVar = this.f65260a;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "";
            }
            blVar.mo59871a(str);
        }

        public C24770a(String str, String str2) {
            C7573i.m23587b(str, "key");
            C7573i.m23587b(str2, "default");
            this.f65261b = str2;
            this.f65260a = new C22903bl<>(str, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.b$b */
    static final class C24771b extends Lambda implements C7561a<C22903bl<String>> {

        /* renamed from: a */
        public static final C24771b f65262a = new C24771b();

        C24771b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m81296a();
        }

        /* renamed from: a */
        private static C22903bl<String> m81296a() {
            return new C22903bl<>("ad_link_auth_setting_item_entered_uid", "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.b$c */
    static final class C24772c extends Lambda implements C7561a<C22903bl<String>> {

        /* renamed from: a */
        public static final C24772c f65263a = new C24772c();

        C24772c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m81297a();
        }

        /* renamed from: a */
        private static C22903bl<String> m81297a() {
            return new C22903bl<>("ad_link_auth_guide_shown_uid", "");
        }
    }

    private C24769b() {
    }

    /* renamed from: a */
    public static final int m81282a(boolean z) {
        return z ? R.string.bzg : R.string.bzf;
    }

    /* renamed from: g */
    private final C22903bl<String> m81292g() {
        return (C22903bl) f65256c.getValue();
    }

    /* renamed from: e */
    public static final void m81290e() {
        f65255b.m81292g().mo59871a(m81291f());
    }

    /* renamed from: f */
    private static String m81291f() {
        IAccountUserService a = C21115b.m71197a();
        if (a != null) {
            String curUserId = a.getCurUserId();
            if (curUserId != null) {
                return curUserId;
            }
        }
        return "";
    }

    /* renamed from: d */
    public static final boolean m81289d() {
        return C7573i.m23585a((Object) (String) f65255b.m81292g().mo59877d(), (Object) m81291f());
    }

    /* renamed from: b */
    public static final boolean m81287b() {
        Integer num;
        IAccountUserService f = C6861a.m21337f();
        if (f != null) {
            User curUser = f.getCurUser();
            if (curUser != null) {
                CommerceUserInfo commerceUserInfo = curUser.getCommerceUserInfo();
                if (commerceUserInfo != null) {
                    LinkUserInfoStruct linkUserInfo = commerceUserInfo.getLinkUserInfo();
                    if (linkUserInfo != null) {
                        num = Integer.valueOf(linkUserInfo.authStatus);
                        return m81286a(num, 1);
                    }
                }
            }
        }
        num = null;
        return m81286a(num, 1);
    }

    /* renamed from: a */
    public static final boolean m81285a() {
        Integer num;
        IAccountUserService f = C6861a.m21337f();
        if (f != null) {
            User curUser = f.getCurUser();
            if (curUser != null) {
                CommerceUserInfo commerceUserInfo = curUser.getCommerceUserInfo();
                if (commerceUserInfo != null) {
                    LinkUserInfoStruct linkUserInfo = commerceUserInfo.getLinkUserInfo();
                    if (linkUserInfo != null) {
                        num = Integer.valueOf(linkUserInfo.authStatus);
                        return m81286a(num, 2);
                    }
                }
            }
        }
        num = null;
        return m81286a(num, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m81288c() {
        /*
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            r1 = 0
            if (r0 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.profile.model.CommerceUserInfo r0 = r0.getCommerceUserInfo()
            if (r0 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.profile.model.LinkUserInfoStruct r0 = r0.getLinkUserInfo()
            if (r0 == 0) goto L_0x0020
            int r0 = r0.authStatus
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            r2 = 2
            boolean r0 = m81286a(r0, r2)
            if (r0 == 0) goto L_0x004e
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.profile.model.CommerceUserInfo r0 = r0.getCommerceUserInfo()
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.profile.model.LinkUserInfoStruct r0 = r0.getLinkUserInfo()
            if (r0 == 0) goto L_0x0046
            int r0 = r0.authType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0046:
            r0 = 1
            boolean r1 = m81286a(r1, r0)
            if (r1 == 0) goto L_0x004e
            return r0
        L_0x004e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.link.C24769b.m81288c():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m81284a(com.p280ss.android.ugc.aweme.setting.model.AwemeSettings r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.setting.model.AwemeSettings$AwemeFEConfigs r3 = r3.feConfigs
            if (r3 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.setting.model.AwemeSettings$LinkPlan r3 = r3.linkPlan
            goto L_0x000b
        L_0x000a:
            r3 = r0
        L_0x000b:
            com.ss.android.ugc.aweme.commercialize.link.b$a r1 = f65258e
            if (r3 == 0) goto L_0x0012
            java.lang.String r2 = r3.publish
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1.mo64789a(r2)
            com.ss.android.ugc.aweme.commercialize.link.b$a r1 = f65259f
            if (r3 == 0) goto L_0x001c
            java.lang.String r0 = r3.settings
        L_0x001c:
            r1.mo64789a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.link.C24769b.m81284a(com.ss.android.ugc.aweme.setting.model.AwemeSettings):void");
    }

    /* renamed from: a */
    public static final void m81283a(Activity activity, String str) {
        int hashCode = str.hashCode();
        if (hashCode != -235365105) {
            if (hashCode == 1434631203 && str.equals("settings")) {
                f65259f.mo64788a(activity);
            }
        } else if (str.equals("publish")) {
            f65258e.mo64788a(activity);
        }
    }

    /* renamed from: a */
    private static boolean m81286a(Integer num, int i) {
        if (num != null && i == num.intValue()) {
            return true;
        }
        return false;
    }
}
