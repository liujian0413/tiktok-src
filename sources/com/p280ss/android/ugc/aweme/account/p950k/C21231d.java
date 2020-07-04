package com.p280ss.android.ugc.aweme.account.p950k;

import android.os.Bundle;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.k.d */
public final class C21231d {

    /* renamed from: a */
    public static long f57038a;

    /* renamed from: b */
    public static final C21232a f57039b = new C21232a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.k.d$a */
    public static final class C21232a {
        private C21232a() {
        }

        /* renamed from: a */
        private static long m71465a() {
            return C21231d.f57038a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
            if (r11 == null) goto L_0x0070;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            if (r0 == null) goto L_0x000d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            if (r0 == null) goto L_0x001e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo57164a(boolean r8, int r9, java.lang.String r10, android.os.Bundle r11) {
            /*
                r7 = this;
                if (r11 == 0) goto L_0x000d
                java.lang.String r0 = "carrier_type"
                java.lang.String r0 = r11.getString(r0)
                if (r0 != 0) goto L_0x000b
                goto L_0x000d
            L_0x000b:
                r5 = r0
                goto L_0x0010
            L_0x000d:
                java.lang.String r0 = ""
                goto L_0x000b
            L_0x0010:
                r2 = r8 ^ 1
                if (r11 == 0) goto L_0x001e
                java.lang.String r0 = "login_path"
                java.lang.String r1 = ""
                java.lang.String r0 = r11.getString(r0, r1)
                if (r0 != 0) goto L_0x0020
            L_0x001e:
                java.lang.String r0 = ""
            L_0x0020:
                int r1 = r0.hashCode()
                switch(r1) {
                    case -1250497972: goto L_0x0085;
                    case -1028668664: goto L_0x0076;
                    case -262499015: goto L_0x0059;
                    case 1440398223: goto L_0x004a;
                    case 1778733764: goto L_0x003b;
                    case 1938103376: goto L_0x0028;
                    default: goto L_0x0027;
                }
            L_0x0027:
                goto L_0x0094
            L_0x0028:
                java.lang.String r8 = "one_login"
                boolean r8 = r0.equals(r8)
                if (r8 == 0) goto L_0x0094
                r1 = r7
                com.ss.android.ugc.aweme.account.k.d$a r1 = (com.p280ss.android.ugc.aweme.account.p950k.C21231d.C21232a) r1
                java.lang.String r6 = "type_normal"
                r3 = r9
                r4 = r10
                r1.m71471a(r2, r3, r4, r5, r6)
                return
            L_0x003b:
                java.lang.String r8 = "reset_password_for_phone"
                boolean r8 = r0.equals(r8)
                if (r8 == 0) goto L_0x0094
                r8 = r7
                com.ss.android.ugc.aweme.account.k.d$a r8 = (com.p280ss.android.ugc.aweme.account.p950k.C21231d.C21232a) r8
                r8.m71473b(r2, r9, r10)
                goto L_0x0094
            L_0x004a:
                java.lang.String r8 = "email_or_username"
                boolean r8 = r0.equals(r8)
                if (r8 == 0) goto L_0x0094
                r8 = r7
                com.ss.android.ugc.aweme.account.k.d$a r8 = (com.p280ss.android.ugc.aweme.account.p950k.C21231d.C21232a) r8
                r8.mo57161a(r2, r9, r10)
                return
            L_0x0059:
                java.lang.String r8 = "third_party_auth"
                boolean r8 = r0.equals(r8)
                if (r8 == 0) goto L_0x0094
                r8 = r7
                com.ss.android.ugc.aweme.account.k.d$a r8 = (com.p280ss.android.ugc.aweme.account.p950k.C21231d.C21232a) r8
                if (r11 == 0) goto L_0x0070
                java.lang.String r0 = "platform"
                java.lang.String r1 = ""
                java.lang.String r11 = r11.getString(r0, r1)
                if (r11 != 0) goto L_0x0072
            L_0x0070:
                java.lang.String r11 = ""
            L_0x0072:
                r8.mo57162a(r2, r11, r9, r10)
                return
            L_0x0076:
                java.lang.String r11 = "phone_sms"
                boolean r11 = r0.equals(r11)
                if (r11 == 0) goto L_0x0094
                r11 = r7
                com.ss.android.ugc.aweme.account.k.d$a r11 = (com.p280ss.android.ugc.aweme.account.p950k.C21231d.C21232a) r11
                r11.mo57165b(r8, r9, r10)
                return
            L_0x0085:
                java.lang.String r11 = "phone_password"
                boolean r11 = r0.equals(r11)
                if (r11 == 0) goto L_0x0094
                r11 = r7
                com.ss.android.ugc.aweme.account.k.d$a r11 = (com.p280ss.android.ugc.aweme.account.p950k.C21231d.C21232a) r11
                r11.mo57163a(r8, r9, r10)
                return
            L_0x0094:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.p950k.C21231d.C21232a.mo57164a(boolean, int, java.lang.String, android.os.Bundle):void");
        }

        /* renamed from: a */
        public final void mo57163a(boolean z, int i, String str) {
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "PhonePasswordLogin(%b, %d, %s)", Arrays.copyOf(new Object[]{Boolean.valueOf(z), Integer.valueOf(i), str}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            boolean z2 = !z;
            C21227b.m71450a("monitor_login_phone_passport", z2 ? 1 : 0, m71468a(i, str, "", ""));
        }

        /* renamed from: a */
        public final void mo57162a(int i, String str, int i2, String str2) {
            C7573i.m23587b(str, "platform");
            String a = m71466a(str);
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "ThirdPartyLogin(%d, %s, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), a, Integer.valueOf(i2), str2}, 4)), "java.lang.String.format(locale, format, *args)");
            }
            C21227b.m71450a("monitor_login_thirdparty", i, m71467a(i2, str2, a));
        }

        /* renamed from: a */
        public final void mo57161a(int i, int i2, String str) {
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "EmailOrUsernameLogin(%b, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            C21227b.m71450a("monitor_login_email", i, m71468a(i2, str, "", ""));
        }

        public /* synthetic */ C21232a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static void m71472a(long j) {
            C21231d.f57038a = 0;
        }

        /* renamed from: a */
        private static String m71466a(String str) {
            C7573i.m23587b(str, "platform");
            switch (str.hashCode()) {
                case -1530308138:
                    if (str.equals("qzone_sns")) {
                        return "qq";
                    }
                    break;
                case -1134307907:
                    if (str.equals("toutiao")) {
                        return "toutiao";
                    }
                    break;
                case -791575966:
                    if (str.equals("weixin")) {
                        return "weixin";
                    }
                    break;
                case -471473230:
                    if (str.equals("sina_weibo")) {
                        return "weibo";
                    }
                    break;
                case 635922494:
                    if (str.equals("toutiao_v2")) {
                        return "toutiao";
                    }
                    break;
            }
            return str;
        }

        /* renamed from: b */
        private void m71473b(int i, int i2, String str) {
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "ResetPasswordPhoneLogin(%b, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            C21227b.m71450a("reset_password_for_phone", i, m71468a(i2, str, "", ""));
        }

        /* renamed from: a */
        private JSONObject m71467a(int i, String str, String str2) {
            C21101a a = C21101a.m71159a();
            long currentTimeMillis = System.currentTimeMillis() - m71465a();
            m71472a(0);
            if (i != 0) {
                a.mo56940a("error_code", Integer.valueOf(i)).mo56942a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo56942a("platform", str2);
            }
            a.mo56941a("time", Long.valueOf(currentTimeMillis));
            JSONObject b = a.mo56943b();
            C7573i.m23582a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* renamed from: b */
        public final void mo57165b(boolean z, int i, String str) {
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "PhoneSmsLogin(%b, %d, %s)", Arrays.copyOf(new Object[]{Boolean.valueOf(z), Integer.valueOf(i), str}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            boolean z2 = !z;
            C21227b.m71450a("monitor_login_phone_sms", z2 ? 1 : 0, m71468a(i, str, "", ""));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static JSONObject m71468a(int i, String str, String str2, String str3) {
            C7573i.m23587b(str2, "platform");
            C7573i.m23587b(str3, "carrierType");
            C21101a a = C21101a.m71159a();
            if (i != 0) {
                a.mo56940a("error_code", Integer.valueOf(i)).mo56942a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo56942a("platform", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                a.mo56942a("carrier_type", str3);
            }
            JSONObject b = a.mo56943b();
            C7573i.m23582a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* renamed from: a */
        private static JSONObject m71469a(int i, String str, String str2, String str3, String str4) {
            C7573i.m23587b(str2, "platform");
            C7573i.m23587b(str3, "carrierType");
            C7573i.m23587b(str4, "errorType");
            C21101a a = C21101a.m71159a();
            if (i != 0) {
                a.mo56940a("error_code", Integer.valueOf(i)).mo56942a("error_desc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                a.mo56942a("platform", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                a.mo56942a("carrier_type", str3);
            }
            a.mo56942a("type", str4);
            JSONObject b = a.mo56943b();
            C7573i.m23582a((Object) b, "eventJsonBuilder.build()");
            return b;
        }

        /* renamed from: a */
        private void m71471a(int i, int i2, String str, String str2, String str3) {
            C7573i.m23587b(str2, "carrierType");
            C7573i.m23587b(str3, "errorType");
            if (C7163a.m22363a()) {
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                C7573i.m23582a((Object) C1642a.m8035a(locale, "OneLogin(%d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, 3)), "java.lang.String.format(locale, format, *args)");
            }
            C21227b.m71450a("monitor_login_quick", i, m71469a(i2, str, "", str2, str3));
        }
    }

    /* renamed from: a */
    public static final void m71459a(int i, int i2, String str) {
        f57039b.mo57161a(i, i2, str);
    }

    /* renamed from: a */
    public static final void m71460a(int i, String str, int i2, String str2) {
        f57039b.mo57162a(1, str, i2, str2);
    }

    /* renamed from: a */
    public static final void m71461a(long j) {
        f57038a = j;
    }

    /* renamed from: a */
    public static final void m71462a(boolean z, int i, String str) {
        f57039b.mo57163a(false, i, str);
    }

    /* renamed from: a */
    public static final void m71463a(boolean z, int i, String str, Bundle bundle) {
        f57039b.mo57164a(z, i, str, bundle);
    }

    /* renamed from: b */
    public static final void m71464b(boolean z, int i, String str) {
        f57039b.mo57165b(false, i, str);
    }
}
