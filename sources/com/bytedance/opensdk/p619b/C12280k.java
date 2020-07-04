package com.bytedance.opensdk.p619b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri.Builder;
import com.bytedance.opensdk.core.C12287a;
import com.bytedance.opensdk.core.base.C12303a;
import com.bytedance.opensdk.core.base.config.AppConfig;
import com.bytedance.opensdk.core.base.config.C12310a;
import com.bytedance.opensdk.core.base.config.C12310a.C12311a;
import com.bytedance.opensdk.core.base.p627c.C12308a;
import com.bytedance.opensdk.core.grant.p631a.C12323a;
import com.bytedance.opensdk.core.p620a.p621a.C12290b;
import com.bytedance.opensdk.core.p620a.p621a.C12293c;
import com.bytedance.opensdk.core.p620a.p622b.C12296b;
import com.bytedance.opensdk.core.p620a.p622b.C12297c;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.p277b.C6597a;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.b.k */
public final class C12280k {

    /* renamed from: a */
    public static final C12280k f32621a = new C12280k();

    /* renamed from: com.bytedance.opensdk.b.k$a */
    public static final class C12281a extends C6597a<HashMap<String, String>> {
        C12281a() {
        }
    }

    private C12280k() {
    }

    /* renamed from: a */
    public final C12290b mo30083a() {
        return new C12290b(m35706c());
    }

    /* renamed from: a */
    public final C12293c mo30084a(String str, String str2) {
        C7573i.m23587b(str, "ticketDomain");
        C7573i.m23587b(str2, "codeDomain");
        return new C12293c(m35703b(str, str2));
    }

    /* renamed from: a */
    public final boolean mo30085a(Context context) {
        C7573i.m23587b(context, "context");
        try {
            NetworkInfo b = m35702b(context);
            if (b == null || !b.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m35701a(com.bytedance.opensdk.core.ApiInfo r6) {
        /*
            java.lang.String r0 = "apiInfo"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            int[] r0 = com.bytedance.opensdk.p619b.C12282l.f32622a
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0012
            return r2
        L_0x0012:
            java.lang.String r0 = "app.buzz.share"
            com.bytedance.opensdk.core.base.a r3 = com.bytedance.opensdk.core.base.C12303a.f32660a
            android.content.Context r3 = r3.mo30102b()
            boolean r3 = com.bytedance.opensdk.p619b.C12266a.m35663a(r3, r0)
            com.bytedance.opensdk.core.base.a r4 = com.bytedance.opensdk.core.base.C12303a.f32660a     // Catch:{ Exception -> 0x002f }
            android.content.Context r4 = r4.mo30102b()     // Catch:{ Exception -> 0x002f }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ Exception -> 0x002f }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = com.bytedance.opensdk.p619b.C12283m.m35715a(r4, r0, r5)     // Catch:{ Exception -> 0x002f }
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0045
            android.os.Bundle r0 = r0.metaData
            if (r0 == 0) goto L_0x0045
            java.lang.String r4 = "com.ss.android.openplatform.version"
            r5 = -1
            int r0 = r0.getInt(r4, r5)
            int r6 = r6.getApiSupportVersion()
            if (r0 < r6) goto L_0x0045
            r6 = 1
            goto L_0x0046
        L_0x0045:
            r6 = 0
        L_0x0046:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 < r4) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r3 == 0) goto L_0x0056
            if (r6 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0056
            return r1
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.p619b.C12280k.m35701a(com.bytedance.opensdk.core.ApiInfo):boolean");
    }

    /* renamed from: b */
    public static String m35704b() {
        C12311a.m35749a();
        return "https://i.sgsnssdk.com/api/100/community/sdk_auth";
    }

    /* renamed from: f */
    private static C12310a m35711f() {
        return C12303a.f32660a.mo30103c();
    }

    /* renamed from: d */
    private static C12308a m35708d() {
        return C12303a.f32660a.mo30103c().f32681d;
    }

    /* renamed from: e */
    private int m35710e() {
        return m35711f().f32680c.f32671c;
    }

    /* renamed from: c */
    private static C12296b m35706c() {
        return new C12296b(C12284n.f32623a.mo30086a(C12303a.f32660a.mo30102b()), C12303a.f32660a.mo30103c().f32680c.f32671c, C12266a.m35662a(C12303a.f32660a.mo30102b()), C12303a.f32660a.mo30103c().f32679b);
    }

    /* renamed from: a */
    public static C12323a m35694a(AppConfig appConfig) {
        C7573i.m23587b(appConfig, "appConfig");
        return new C12323a(appConfig);
    }

    /* renamed from: a */
    public static Builder m35693a(String str) {
        C7573i.m23587b(str, "path");
        Builder builder = new Builder();
        builder.scheme("snssdk1342");
        builder.authority(str);
        return builder;
    }

    /* renamed from: b */
    private static NetworkInfo m35702b(Context context) {
        C7573i.m23587b(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            try {
                return ((ConnectivityManager) systemService).getActiveNetworkInfo();
            } catch (Exception unused) {
                return null;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
    }

    /* renamed from: c */
    public static String m35707c(String str) {
        C7573i.m23587b(str, "ticketDomain");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/passport/open/authorize/ticket/");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m35709d(String str) {
        C7573i.m23587b(str, "platform");
        if (C12311a.m35749a()) {
            StringBuilder sb = new StringBuilder("https:/passport.helo-app.com/mobile/grant/");
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("https:/passport.helo-app.com/mobile/grant/");
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: b */
    public static String m35705b(String str) {
        C7573i.m23587b(str, "codeDomain");
        if (C12311a.m35749a()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/passport/open/authorize/");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/oauth/authorize/");
        return sb2.toString();
    }

    /* renamed from: b */
    private final C12297c m35703b(String str, String str2) {
        C12297c cVar = new C12297c(str, str2, null, null, m35710e(), C12303a.f32660a.mo30103c().f32678a, 12, null);
        return cVar;
    }

    /* renamed from: a */
    public static void m35699a(String str, C6711m mVar) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(mVar, "params");
        try {
            HashMap hashMap = (HashMap) C12287a.m35724a().mo15971a((C6709k) mVar, new C12281a().type);
            if (hashMap != null) {
                m35700a(str, (Map<String, String>) hashMap);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m35700a(String str, Map<String, String> map) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(map, "params");
        C12303a.f32660a.mo30103c().f32682e.mo30099a(str, map);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m35698a(String str, Map<String, String> map, Map<String, String> map2) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(map, "requestHeaderMap");
        C7573i.m23587b(map2, "respHeaderMap");
        return m35708d().mo30111a(str, map, map2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m35697a(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "body");
        C7573i.m23587b(map, "requestHeaderMap");
        C7573i.m23587b(map2, "respHeaderMap");
        return m35708d().mo30110a(str, str2, map, map2);
    }
}
