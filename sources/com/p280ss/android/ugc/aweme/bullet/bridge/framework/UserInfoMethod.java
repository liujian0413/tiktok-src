package com.p280ss.android.ugc.aweme.bullet.bridge.framework;

import com.bytedance.ies.bullet.core.kit.bridge.IBridge.Access;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod */
public final class UserInfoMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23601a f62271c = new C23601a(null);

    /* renamed from: d */
    private final String f62272d = "userInfo";

    /* renamed from: e */
    private Access f62273e = Access.PROTECT;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod$a */
    public static final class C23601a {
        private C23601a() {
        }

        public /* synthetic */ C23601a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final Access mo25126b() {
        return this.f62273e;
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62272d;
    }

    /* renamed from: a */
    public final void mo25139a(Access access) {
        C7573i.m23587b(access, "<set-?>");
        this.f62273e = access;
    }

    public UserInfoMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m77482a(org.json.JSONObject r13) throws org.json.JSONException {
        /*
            java.lang.String r0 = "res"
            kotlin.jvm.internal.C7573i.m23587b(r13, r0)
            java.lang.String r0 = ""
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            com.ss.android.ugc.aweme.IAccountUserService r4 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r5 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getCurUser()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.IAccountUserService r7 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r8 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            boolean r7 = r7.isLogin()
            if (r7 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r1 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r0 = r0.getCurUserId()
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.String r2 = r4.getNickname()
            if (r2 != 0) goto L_0x0046
            java.lang.String r2 = ""
        L_0x0046:
            java.lang.String r3 = r4.getUniqueId()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x005c
            java.lang.String r3 = r4.getShortId()
            java.lang.String r7 = "user.shortId"
        L_0x0058:
            kotlin.jvm.internal.C7573i.m23582a(r3, r7)
            goto L_0x0063
        L_0x005c:
            java.lang.String r3 = r4.getUniqueId()
            java.lang.String r7 = "user.uniqueId"
            goto L_0x0058
        L_0x0063:
            java.lang.String r7 = r4.getBindPhone()
            java.lang.String r8 = "user.bindPhone"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            java.lang.String r8 = r4.getSecUid()
            java.lang.String r9 = "user.secUid"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = r4.getAvatarMedium()
            if (r9 == 0) goto L_0x0098
            java.util.List r10 = r9.getUrlList()
            if (r10 == 0) goto L_0x0098
            java.util.List r10 = r9.getUrlList()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0098
            java.lang.String r10 = "avatar_url"
            java.util.List r9 = r9.getUrlList()
            java.lang.Object r6 = r9.get(r6)
            r13.put(r10, r6)
        L_0x0098:
            r6 = 1
            goto L_0x00a3
        L_0x009a:
            r7 = -1
            r11 = r2
            r2 = r0
            r12 = r3
            r3 = r1
            r0 = r7
            r7 = r11
            r8 = r12
        L_0x00a3:
            java.lang.String r9 = "is_login"
            r13.put(r9, r6)
            java.lang.String r9 = "success"
            r13.put(r9, r6)
            java.lang.String r6 = "user_id"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.put(r6, r0)
            java.lang.String r0 = "nickname"
            r13.put(r0, r2)
            java.lang.String r0 = "unique_id"
            r13.put(r0, r3)
            java.lang.String r0 = "bind_phone"
            r13.put(r0, r7)
            java.lang.String r0 = "code"
            r13.put(r0, r5)
            java.lang.String r0 = "sec_user_id"
            r13.put(r0, r8)
            com.ss.android.ugc.aweme.commercialize.model.f$a r0 = com.p280ss.android.ugc.aweme.commercialize.model.C24995f.f65904d
            java.lang.Long r0 = r0.mo65425b(r4)
            if (r0 == 0) goto L_0x00e0
            java.lang.String r1 = "decoration_id"
            long r2 = r0.longValue()
            r13.put(r1, r2)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod.m77482a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        JSONObject jSONObject2 = new JSONObject();
        m77482a(jSONObject2);
        aVar.mo61495a(jSONObject2);
    }
}
