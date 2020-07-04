package com.p280ss.android.ugc.aweme.p1216fe.method;

import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.UserInfoMethod */
public final class UserInfoMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27936a f73606a = new C27936a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.UserInfoMethod$a */
    public static final class C27936a {
        private C27936a() {
        }

        public /* synthetic */ C27936a(C7571f fVar) {
            this();
        }
    }

    public UserInfoMethod() {
        this(null, 1, null);
    }

    public UserInfoMethod(C11087a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m91493a(org.json.JSONObject r20) throws org.json.JSONException {
        /*
            r0 = r20
            java.lang.String r1 = "res"
            kotlin.jvm.internal.C7573i.m23587b(r0, r1)
            java.lang.String r1 = ""
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            com.ss.android.ugc.aweme.IAccountUserService r5 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r6 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getCurUser()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x00b8
            com.ss.android.ugc.aweme.IAccountUserService r8 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r9 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            boolean r8 = r8.isLogin()
            if (r8 == 0) goto L_0x00b8
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r2 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.String r1 = r1.getCurUserId()
            long r1 = java.lang.Long.parseLong(r1)
            java.lang.String r3 = r5.getNickname()
            if (r3 != 0) goto L_0x0048
            java.lang.String r3 = ""
        L_0x0048:
            java.lang.String r4 = r5.getUniqueId()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x005e
            java.lang.String r4 = r5.getShortId()
            java.lang.String r8 = "user.shortId"
        L_0x005a:
            kotlin.jvm.internal.C7573i.m23582a(r4, r8)
            goto L_0x0065
        L_0x005e:
            java.lang.String r4 = r5.getUniqueId()
            java.lang.String r8 = "user.uniqueId"
            goto L_0x005a
        L_0x0065:
            java.lang.String r8 = r5.getBindPhone()
            java.lang.String r9 = "user.bindPhone"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            java.lang.String r9 = r5.getSecUid()
            java.lang.String r10 = "user.secUid"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            com.ss.android.ugc.aweme.base.model.UrlModel r10 = r5.getAvatarMedium()
            if (r10 == 0) goto L_0x009a
            java.util.List r11 = r10.getUrlList()
            if (r11 == 0) goto L_0x009a
            java.util.List r11 = r10.getUrlList()
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x009a
            java.lang.String r11 = "avatar_url"
            java.util.List r10 = r10.getUrlList()
            java.lang.Object r7 = r10.get(r7)
            r0.put(r11, r7)
        L_0x009a:
            com.bytedance.ies.abmock.b r12 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.movie.experiment.MovieDetailExperiment> r13 = com.p280ss.android.ugc.aweme.movie.experiment.MovieDetailExperiment.class
            r14 = 1
            java.lang.String r15 = "mv_theme_mode_switch"
            com.bytedance.ies.abmock.b r7 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r7 = r7.mo15295d()
            boolean r7 = r7.mv_theme_mode_switch
            r17 = 1
            r16 = r7
            boolean r7 = r12.mo15292a(r13, r14, r15, r16, r17)
            r10 = r7
            r7 = 1
            goto L_0x00c6
        L_0x00b8:
            r8 = -1
            r10 = 0
            r18 = r3
            r3 = r1
            r19 = r4
            r4 = r2
            r1 = r8
            r8 = r18
            r9 = r19
        L_0x00c6:
            java.lang.String r11 = "is_login"
            r0.put(r11, r7)
            java.lang.String r11 = "success"
            r0.put(r11, r7)
            java.lang.String r7 = "user_id"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r7, r1)
            java.lang.String r1 = "nickname"
            r0.put(r1, r3)
            java.lang.String r1 = "unique_id"
            r0.put(r1, r4)
            java.lang.String r1 = "bind_phone"
            r0.put(r1, r8)
            java.lang.String r1 = "code"
            r0.put(r1, r6)
            java.lang.String r1 = "sec_user_id"
            r0.put(r1, r9)
            java.lang.String r1 = "isSupportMV"
            r0.put(r1, r10)
            com.ss.android.ugc.aweme.commercialize.model.f$a r1 = com.p280ss.android.ugc.aweme.commercialize.model.C24995f.f65904d
            java.lang.Long r1 = r1.mo65425b(r5)
            if (r1 == 0) goto L_0x0108
            java.lang.String r2 = "decoration_id"
            long r3 = r1.longValue()
            r0.put(r2, r3)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.UserInfoMethod.m91493a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        JSONObject jSONObject2 = new JSONObject();
        m91493a(jSONObject2);
        aVar.mo71365a(jSONObject2);
    }

    private /* synthetic */ UserInfoMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
