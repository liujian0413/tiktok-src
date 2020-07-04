package com.p280ss.android.ugc.aweme.account.login.twostep;

import bolts.C1592h;
import com.bytedance.retrofit2.p264b.C6456g;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.p951l.C21245g;
import com.p280ss.android.ugc.aweme.account.util.C22329h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi */
public final class TwoStepAuthApi {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f57988a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(TwoStepAuthApi.class), "api", "getApi()Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$Api;"))};

    /* renamed from: b */
    public static final TwoStepAuthApi f57989b = new TwoStepAuthApi();

    /* renamed from: c */
    private static final C7541d f57990c = C7546e.m23569a(C21604d.f58011a);

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$Api */
    public interface Api {
        @C6456g
        @C7739o(mo20429a = "/passport/email/send_code/")
        C1592h<C21598a> sendEmailCode(@C7727c(mo20417a = "verify_ticket") String str, @C7727c(mo20417a = "type") Integer num);

        @C6456g
        @C7739o(mo20429a = "/passport/mobile/send_code/v1/")
        C1592h<C21600b> sendSmsCode(@C7727c(mo20417a = "verify_ticket") String str, @C7727c(mo20417a = "type") Integer num);

        @C7730f(mo20420a = "/passport/email/check_code/")
        C1592h<C21602c> verifyEmailCode(@C7744t(mo20436a = "mix_mode") Integer num, @C7744t(mo20436a = "email") String str, @C7744t(mo20436a = "code") String str2, @C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "verify_ticket") String str3);

        @C7730f(mo20420a = "/passport/account/verify/")
        C1592h<C21602c> verifyPassword(@C7744t(mo20436a = "username") String str, @C7744t(mo20436a = "mobile") String str2, @C7744t(mo20436a = "email") String str3, @C7744t(mo20436a = "password") String str4, @C7744t(mo20436a = "mix_mode") int i, @C7744t(mo20436a = "verify_ticket") String str5);

        @C7730f(mo20420a = "/passport/mobile/check_code/")
        C1592h<C21602c> verifySmsCode(@C7744t(mo20436a = "mix_mode") Integer num, @C7744t(mo20436a = "mobile") String str, @C7744t(mo20436a = "code") String str2, @C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "verify_ticket") String str3);

        @C7730f(mo20420a = "/passport/auth/verify/")
        C1592h<C21602c> verifyThirdParty(@C7744t(mo20436a = "access_token") String str, @C7744t(mo20436a = "access_token_secret") String str2, @C7744t(mo20436a = "code") String str3, @C7744t(mo20436a = "expires_in") Integer num, @C7744t(mo20436a = "openid") Integer num2, @C7744t(mo20436a = "platform") String str4, @C7744t(mo20436a = "platform_app_id") Integer num3, @C7744t(mo20436a = "mid") Integer num4, @C7744t(mo20436a = "verify_ticket") String str5);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a */
    public static final class C21598a {
        @C6593c(mo15949a = "message")

        /* renamed from: a */
        public final String f57991a;
        @C6593c(mo15949a = "data")

        /* renamed from: b */
        public final C21599a f57992b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a */
        public static final class C21599a {
            @C6593c(mo15949a = "email")

            /* renamed from: a */
            public final String f57993a;
            @C6593c(mo15949a = "captcha")

            /* renamed from: b */
            public final String f57994b;
            @C6593c(mo15949a = "description")

            /* renamed from: c */
            public final String f57995c;
            @C6593c(mo15949a = "error_code")

            /* renamed from: d */
            public final Integer f57996d;

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
                if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f57996d, (java.lang.Object) r3.f57996d) != false) goto L_0x0033;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0033
                    boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21598a.C21599a
                    if (r0 == 0) goto L_0x0031
                    com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r3 = (com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21598a.C21599a) r3
                    java.lang.String r0 = r2.f57993a
                    java.lang.String r1 = r3.f57993a
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    java.lang.String r0 = r2.f57994b
                    java.lang.String r1 = r3.f57994b
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    java.lang.String r0 = r2.f57995c
                    java.lang.String r1 = r3.f57995c
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    java.lang.Integer r0 = r2.f57996d
                    java.lang.Integer r3 = r3.f57996d
                    boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                    if (r3 == 0) goto L_0x0031
                    goto L_0x0033
                L_0x0031:
                    r3 = 0
                    return r3
                L_0x0033:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21598a.C21599a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.f57993a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f57994b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f57995c;
                int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                Integer num = this.f57996d;
                if (num != null) {
                    i = num.hashCode();
                }
                return hashCode3 + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Data(email=");
                sb.append(this.f57993a);
                sb.append(", captcha=");
                sb.append(this.f57994b);
                sb.append(", errorDescription=");
                sb.append(this.f57995c);
                sb.append(", errorCode=");
                sb.append(this.f57996d);
                sb.append(")");
                return sb.toString();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f57992b, (java.lang.Object) r3.f57992b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21598a
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a r3 = (com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21598a) r3
                java.lang.String r0 = r2.f57991a
                java.lang.String r1 = r3.f57991a
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r0 = r2.f57992b
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r3 = r3.f57992b
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21598a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f57991a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C21599a aVar = this.f57992b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SendEmailCodeResponse(message=");
            sb.append(this.f57991a);
            sb.append(", data=");
            sb.append(this.f57992b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b */
    public static final class C21600b {
        @C6593c(mo15949a = "message")

        /* renamed from: a */
        public final String f57997a;
        @C6593c(mo15949a = "data")

        /* renamed from: b */
        public final C21601a f57998b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b$a */
        public static final class C21601a {
            @C6593c(mo15949a = "mobile")

            /* renamed from: a */
            public final String f57999a;
            @C6593c(mo15949a = "retry_time")

            /* renamed from: b */
            public final Integer f58000b;
            @C6593c(mo15949a = "captcha")

            /* renamed from: c */
            public final String f58001c;
            @C6593c(mo15949a = "description")

            /* renamed from: d */
            public final String f58002d;
            @C6593c(mo15949a = "error_code")

            /* renamed from: e */
            public final Integer f58003e;
            @C6593c(mo15949a = "next_url")

            /* renamed from: f */
            public final String f58004f;

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
                if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f58004f, (java.lang.Object) r3.f58004f) != false) goto L_0x0047;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0047
                    boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21600b.C21601a
                    if (r0 == 0) goto L_0x0045
                    com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b$a r3 = (com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21600b.C21601a) r3
                    java.lang.String r0 = r2.f57999a
                    java.lang.String r1 = r3.f57999a
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    java.lang.Integer r0 = r2.f58000b
                    java.lang.Integer r1 = r3.f58000b
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    java.lang.String r0 = r2.f58001c
                    java.lang.String r1 = r3.f58001c
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    java.lang.String r0 = r2.f58002d
                    java.lang.String r1 = r3.f58002d
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    java.lang.Integer r0 = r2.f58003e
                    java.lang.Integer r1 = r3.f58003e
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x0045
                    java.lang.String r0 = r2.f58004f
                    java.lang.String r3 = r3.f58004f
                    boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                    if (r3 == 0) goto L_0x0045
                    goto L_0x0047
                L_0x0045:
                    r3 = 0
                    return r3
                L_0x0047:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21600b.C21601a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.f57999a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Integer num = this.f58000b;
                int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
                String str2 = this.f58001c;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f58002d;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
                Integer num2 = this.f58003e;
                int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
                String str4 = this.f58004f;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                return hashCode5 + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Data(mobile=");
                sb.append(this.f57999a);
                sb.append(", retryTime=");
                sb.append(this.f58000b);
                sb.append(", captcha=");
                sb.append(this.f58001c);
                sb.append(", errorDescription=");
                sb.append(this.f58002d);
                sb.append(", errorCode=");
                sb.append(this.f58003e);
                sb.append(", nextUrl=");
                sb.append(this.f58004f);
                sb.append(")");
                return sb.toString();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f57998b, (java.lang.Object) r3.f57998b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21600b
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b r3 = (com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21600b) r3
                java.lang.String r0 = r2.f57997a
                java.lang.String r1 = r3.f57997a
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b$a r0 = r2.f57998b
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b$a r3 = r3.f57998b
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21600b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f57997a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C21601a aVar = this.f57998b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SendSmsCodeResponse(message=");
            sb.append(this.f57997a);
            sb.append(", data=");
            sb.append(this.f57998b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c */
    public static final class C21602c {
        @C6593c(mo15949a = "message")

        /* renamed from: a */
        public final String f58005a;
        @C6593c(mo15949a = "data")

        /* renamed from: b */
        public final C21603a f58006b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a */
        public static final class C21603a {
            @C6593c(mo15949a = "ticket")

            /* renamed from: a */
            public final String f58007a;
            @C6593c(mo15949a = "captcha")

            /* renamed from: b */
            public final String f58008b;
            @C6593c(mo15949a = "error_code")

            /* renamed from: c */
            public final Integer f58009c;
            @C6593c(mo15949a = "description")

            /* renamed from: d */
            public final String f58010d;

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
                if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f58010d, (java.lang.Object) r3.f58010d) != false) goto L_0x0033;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0033
                    boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c.C21603a
                    if (r0 == 0) goto L_0x0031
                    com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r3 = (com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c.C21603a) r3
                    java.lang.String r0 = r2.f58007a
                    java.lang.String r1 = r3.f58007a
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    java.lang.String r0 = r2.f58008b
                    java.lang.String r1 = r3.f58008b
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    java.lang.Integer r0 = r2.f58009c
                    java.lang.Integer r1 = r3.f58009c
                    boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    java.lang.String r0 = r2.f58010d
                    java.lang.String r3 = r3.f58010d
                    boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                    if (r3 == 0) goto L_0x0031
                    goto L_0x0033
                L_0x0031:
                    r3 = 0
                    return r3
                L_0x0033:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c.C21603a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                String str = this.f58007a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f58008b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                Integer num = this.f58009c;
                int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
                String str3 = this.f58010d;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return hashCode3 + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Data(ticket=");
                sb.append(this.f58007a);
                sb.append(", captcha=");
                sb.append(this.f58008b);
                sb.append(", errorCode=");
                sb.append(this.f58009c);
                sb.append(", errorDescription=");
                sb.append(this.f58010d);
                sb.append(")");
                return sb.toString();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f58006b, (java.lang.Object) r3.f58006b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c r3 = (com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c) r3
                java.lang.String r0 = r2.f58005a
                java.lang.String r1 = r3.f58005a
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x001d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r2.f58006b
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r3 = r3.f58006b
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f58005a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C21603a aVar = this.f58006b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TwoStepApiResponse(message=");
            sb.append(this.f58005a);
            sb.append(", data=");
            sb.append(this.f58006b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$d */
    static final class C21604d extends Lambda implements C7561a<Api> {

        /* renamed from: a */
        public static final C21604d f58011a = new C21604d();

        C21604d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m72366a();
        }

        /* renamed from: a */
        private static Api m72366a() {
            return (Api) ((IRetrofitService) C21671bd.m72521a(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(Api.class);
        }
    }

    private TwoStepAuthApi() {
    }

    /* renamed from: a */
    private final Api m72359a() {
        return (Api) f57990c.getValue();
    }

    /* renamed from: b */
    public final C1592h<C21598a> mo57792b(String str) {
        return m72359a().sendEmailCode(str, Integer.valueOf(6));
    }

    /* renamed from: a */
    public final C1592h<C21600b> mo57788a(String str) {
        return m72359a().sendSmsCode(str, Integer.valueOf(22));
    }

    /* renamed from: a */
    public final C1592h<C21602c> mo57789a(String str, String str2) {
        C7573i.m23587b(str, "password");
        C7573i.m23587b(str2, "verifyTicket");
        Api a = m72359a();
        String a2 = C22329h.m73928a(str);
        C7573i.m23582a((Object) a2, "CryptoUtils.encryptWithXor(password)");
        return a.verifyPassword(null, null, null, a2, 1, str2);
    }

    /* renamed from: b */
    public final C1592h<C21602c> mo57793b(String str, String str2, String str3) {
        C7573i.m23587b(str2, "code");
        Api a = m72359a();
        Integer valueOf = Integer.valueOf(1);
        String a2 = C22329h.m73928a(null);
        C7573i.m23582a((Object) a2, "CryptoUtils.encryptWithXor(email)");
        String a3 = C22329h.m73928a(str2);
        C7573i.m23582a((Object) a3, "CryptoUtils.encryptWithXor(code)");
        return a.verifyEmailCode(valueOf, a2, a3, 6, str3);
    }

    /* renamed from: a */
    public final C1592h<C21602c> mo57790a(String str, String str2, String str3) {
        C7573i.m23587b(str2, "code");
        Api a = m72359a();
        Integer valueOf = Integer.valueOf(1);
        String a2 = C22329h.m73928a(null);
        String a3 = C22329h.m73928a(str2);
        C7573i.m23582a((Object) a3, "CryptoUtils.encryptWithXor(code)");
        return a.verifySmsCode(valueOf, a2, a3, 22, str3);
    }

    /* renamed from: a */
    public final C1592h<C21602c> mo57791a(String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        return m72359a().verifyThirdParty(str, str2, str3, num, Integer.valueOf(0), str4, Integer.valueOf(C21245g.m71503a(str5, 0)), null, str6);
    }
}
