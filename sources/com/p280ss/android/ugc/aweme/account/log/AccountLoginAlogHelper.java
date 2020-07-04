package com.p280ss.android.ugc.aweme.account.log;

import android.text.TextUtils;
import com.bytedance.sdk.account.p668i.C12898b;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper */
public final class AccountLoginAlogHelper extends C21250b {

    /* renamed from: a */
    public static final AccountLoginAlogHelper f57075a = new AccountLoginAlogHelper();

    /* renamed from: c */
    private static final String f57076c = f57076c;

    /* renamed from: com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginMethod */
    public enum ALogLoginMethod {
        DEFAULT,
        EMAIL_PASS,
        USER_NAME_PASS,
        PHONE_NUMBER_PASS,
        PHONE_SMS,
        THIRD_PARTY,
        ONE_LOGIN
    }

    /* renamed from: com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginPart */
    public enum ALogLoginPart {
        GET_THIRD_PARTY_AUTH_INFO,
        SSO_WITH_THIRD_PARTY,
        HIT_VERIFY_STRATEGY,
        HIT_NO_TRUST_DEVICE,
        REFRESH_AWEME_USER,
        USER_OPERATOR_AFTER_LOGIN,
        CHECK_PRIVACY_ACCEPT,
        ONE_LOGIN_GET_TOKEN,
        ONE_LOGIN_BY_TOKEN,
        LOGIN_BY_PASS,
        LOGIN_BY_PHONE_SMS,
        THIRD_MATCH_SETTING_BEFORE_LOGIN,
        THIRD_MATCH_SETTING_AFTER_LOGIN,
        THIRD_MATCH_SETTING_CLICK,
        THIRD_LOGIN_AGE_GATE,
        PHONE_NUMBER_INVALID,
        NEED_INTERCEPTE
    }

    private AccountLoginAlogHelper() {
    }

    /* renamed from: a */
    public final String mo57172a() {
        return f57076c;
    }

    /* renamed from: a */
    public static final void m71515a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "login success");
        hashMap.put("extra", str);
        AccountLoginAlogHelper accountLoginAlogHelper = f57075a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        accountLoginAlogHelper.mo57173c(hashMap2);
    }

    /* renamed from: b */
    public static final void m71521b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on update user info result check");
        hashMap.put("errorMsg", str);
        AccountLoginAlogHelper accountLoginAlogHelper = f57075a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        accountLoginAlogHelper.mo57173c(hashMap2);
    }

    /* renamed from: a */
    public static final void m71513a(C12898b bVar) {
        JSONObject jSONObject;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on update user info");
        String str = "rawJson";
        if (bVar != null) {
            jSONObject = bVar.f34084g;
        } else {
            jSONObject = null;
        }
        hashMap.put(str, String.valueOf(String.valueOf(jSONObject)));
        AccountLoginAlogHelper accountLoginAlogHelper = f57075a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        accountLoginAlogHelper.mo57173c(hashMap2);
    }

    /* renamed from: a */
    public static final void m71516a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "show login page");
        String str3 = "from";
        if (str == null) {
            str = "";
        }
        hashMap.put(str3, str);
        hashMap.put("extra", str2);
        AccountLoginAlogHelper accountLoginAlogHelper = f57075a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        accountLoginAlogHelper.mo57173c(hashMap2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r3 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r4 == null) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m71514a(com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginPart r3, com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginMethod r4, java.lang.String r5) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "login part success"
            r0.put(r1, r2)
            java.lang.String r1 = "part"
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = r3.name()
            if (r3 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r3 = ""
        L_0x0018:
            r0.put(r1, r3)
            java.lang.String r3 = "loginMethod"
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = r4.name()
            if (r4 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r4 = ""
        L_0x0027:
            r0.put(r3, r4)
            java.lang.String r3 = "extra"
            if (r5 != 0) goto L_0x0030
            java.lang.String r5 = ""
        L_0x0030:
            r0.put(r3, r5)
            com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper r3 = f57075a
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "map.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            r3.mo57173c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.m71514a(com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginPart, com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginMethod, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r3 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r4 == null) goto L_0x0025;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m71520b(com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginPart r3, com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginMethod r4, java.lang.String r5) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "on some part"
            r0.put(r1, r2)
            java.lang.String r1 = "part"
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = r3.name()
            if (r3 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r3 = ""
        L_0x0018:
            r0.put(r1, r3)
            java.lang.String r3 = "loginMethod"
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = r4.name()
            if (r4 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r4 = ""
        L_0x0027:
            r0.put(r3, r4)
            java.lang.String r3 = "extra"
            if (r5 != 0) goto L_0x0030
            java.lang.String r5 = ""
        L_0x0030:
            r0.put(r3, r5)
            com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper r3 = f57075a
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "map.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            r3.mo57173c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.m71520b(com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginPart, com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginMethod, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r4 == null) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m71517a(java.lang.String r3, java.lang.String r4, com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginMethod r5, java.lang.String r6) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "start login"
            r0.put(r1, r2)
            java.lang.String r1 = "from"
            if (r3 != 0) goto L_0x0012
            java.lang.String r3 = ""
        L_0x0012:
            r0.put(r1, r3)
            java.lang.String r3 = "enterMethod"
            if (r4 != 0) goto L_0x001b
            java.lang.String r4 = ""
        L_0x001b:
            r0.put(r3, r4)
            java.lang.String r3 = "loginMethod"
            if (r5 == 0) goto L_0x0028
            java.lang.String r4 = r5.name()
            if (r4 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r4 = ""
        L_0x002a:
            r0.put(r3, r4)
            java.lang.String r3 = "extra"
            r0.put(r3, r6)
            com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper r3 = f57075a
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "map.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            r3.mo57173c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.m71517a(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginMethod, java.lang.String):void");
    }

    /* renamed from: b */
    public static final void m71523b(boolean z, String str, boolean z2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "Auto fill SMS verification code");
        hashMap.put("success", String.valueOf(z));
        hashMap.put("hasSimCard", String.valueOf(z2));
        hashMap.put("googleAvailability", String.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            String str2 = "errorMsg";
            if (str == null) {
                str = "";
            }
            hashMap.put(str2, str);
        }
        AccountLoginAlogHelper accountLoginAlogHelper = f57075a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        accountLoginAlogHelper.mo57173c(hashMap2);
    }

    /* renamed from: a */
    public static final void m71519a(boolean z, String str, boolean z2, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "Auto fill user's phone number");
        hashMap.put("success", String.valueOf(z));
        hashMap.put("hasSimCard", String.valueOf(z2));
        hashMap.put("googleAvailability", String.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            String str2 = "errorMsg";
            if (str == null) {
                str = "";
            }
            hashMap.put(str2, str);
        }
        AccountLoginAlogHelper accountLoginAlogHelper = f57075a;
        String hashMap2 = hashMap.toString();
        C7573i.m23582a((Object) hashMap2, "map.toString()");
        accountLoginAlogHelper.mo57173c(hashMap2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r4 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r4 == null) goto L_0x0028;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m71522b(java.lang.String r3, java.lang.String r4, com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginPart r5, com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginMethod r6, java.lang.String r7) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "login fail"
            r0.put(r1, r2)
            java.lang.String r1 = "errorCode"
            if (r3 != 0) goto L_0x0012
            java.lang.String r3 = ""
        L_0x0012:
            r0.put(r1, r3)
            java.lang.String r3 = "errorMsg"
            if (r4 != 0) goto L_0x001b
            java.lang.String r4 = ""
        L_0x001b:
            r0.put(r3, r4)
            java.lang.String r3 = "part"
            if (r5 == 0) goto L_0x0028
            java.lang.String r4 = r5.name()
            if (r4 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r4 = ""
        L_0x002a:
            r0.put(r3, r4)
            java.lang.String r3 = "loginMethod"
            if (r6 == 0) goto L_0x0037
            java.lang.String r4 = r6.name()
            if (r4 != 0) goto L_0x0039
        L_0x0037:
            java.lang.String r4 = ""
        L_0x0039:
            r0.put(r3, r4)
            java.lang.String r3 = "extra"
            if (r7 != 0) goto L_0x0042
            java.lang.String r7 = ""
        L_0x0042:
            r0.put(r3, r7)
            com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper r3 = f57075a
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "map.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            r3.mo57173c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.m71522b(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginPart, com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginMethod, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r4 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r4 == null) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m71518a(java.lang.String r3, java.lang.String r4, com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginPart r5, com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginMethod r6, java.lang.String r7) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "login part fail"
            r0.put(r1, r2)
            java.lang.String r1 = "errorCode"
            if (r3 != 0) goto L_0x0012
            java.lang.String r3 = ""
        L_0x0012:
            r0.put(r1, r3)
            java.lang.String r3 = "errorMsg"
            if (r4 != 0) goto L_0x001b
            java.lang.String r4 = ""
        L_0x001b:
            r0.put(r3, r4)
            java.lang.String r3 = "part"
            if (r5 == 0) goto L_0x0028
            java.lang.String r4 = r5.name()
            if (r4 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r4 = ""
        L_0x002a:
            r0.put(r3, r4)
            java.lang.String r3 = "loginMethod"
            if (r6 == 0) goto L_0x0037
            java.lang.String r4 = r6.name()
            if (r4 != 0) goto L_0x0039
        L_0x0037:
            java.lang.String r4 = ""
        L_0x0039:
            r0.put(r3, r4)
            java.lang.String r3 = "extra"
            if (r7 != 0) goto L_0x0042
            java.lang.String r7 = ""
        L_0x0042:
            r0.put(r3, r7)
            com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper r3 = f57075a
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "map.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            r3.mo57173c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.m71518a(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginPart, com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginMethod, java.lang.String):void");
    }
}
