package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.xe */
public final class C16161xe {

    /* renamed from: A */
    private boolean f45285A;

    /* renamed from: B */
    private zzaxk f45286B;

    /* renamed from: C */
    private boolean f45287C;

    /* renamed from: D */
    private String f45288D;

    /* renamed from: E */
    private List<String> f45289E;

    /* renamed from: F */
    private boolean f45290F;

    /* renamed from: G */
    private String f45291G;

    /* renamed from: H */
    private zzbbq f45292H;

    /* renamed from: I */
    private boolean f45293I;

    /* renamed from: J */
    private boolean f45294J;

    /* renamed from: K */
    private boolean f45295K;

    /* renamed from: L */
    private boolean f45296L;

    /* renamed from: M */
    private String f45297M;

    /* renamed from: N */
    private boolean f45298N;

    /* renamed from: O */
    private final zzaxe f45299O;

    /* renamed from: a */
    private String f45300a;

    /* renamed from: b */
    private String f45301b;

    /* renamed from: c */
    private String f45302c;

    /* renamed from: d */
    private List<String> f45303d;

    /* renamed from: e */
    private String f45304e;

    /* renamed from: f */
    private String f45305f;

    /* renamed from: g */
    private String f45306g;

    /* renamed from: h */
    private List<String> f45307h;

    /* renamed from: i */
    private List<String> f45308i;

    /* renamed from: j */
    private long f45309j = -1;

    /* renamed from: k */
    private boolean f45310k;

    /* renamed from: l */
    private final long f45311l = -1;

    /* renamed from: m */
    private List<String> f45312m;

    /* renamed from: n */
    private long f45313n = -1;

    /* renamed from: o */
    private int f45314o = -1;

    /* renamed from: p */
    private boolean f45315p;

    /* renamed from: q */
    private boolean f45316q;

    /* renamed from: r */
    private boolean f45317r;

    /* renamed from: s */
    private boolean f45318s = true;

    /* renamed from: t */
    private boolean f45319t = true;

    /* renamed from: u */
    private String f45320u = "";

    /* renamed from: v */
    private boolean f45321v;

    /* renamed from: w */
    private boolean f45322w;

    /* renamed from: x */
    private zzbaz f45323x;

    /* renamed from: y */
    private List<String> f45324y;

    /* renamed from: z */
    private List<String> f45325z;

    /* renamed from: a */
    private static String m52367a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: b */
    private static long m52368b(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
                sb.append("Could not parse float from ");
                sb.append(str);
                sb.append(" header: ");
                sb.append(str2);
                acd.m45783e(sb.toString());
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static List<String> m52369c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m52370d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.parseBoolean((String) list.get(0));
    }

    public C16161xe(zzaxe zzaxe, String str) {
        this.f45301b = str;
        this.f45299O = zzaxe;
    }

    /* renamed from: a */
    public final zzaxi mo42060a(long j, C16163xg xgVar) {
        C16163xg xgVar2 = xgVar;
        zzaxe zzaxe = this.f45299O;
        String str = this.f45301b;
        String str2 = this.f45302c;
        List<String> list = this.f45303d;
        List<String> list2 = this.f45307h;
        long j2 = this.f45309j;
        boolean z = this.f45310k;
        List<String> list3 = this.f45312m;
        long j3 = this.f45313n;
        int i = this.f45314o;
        String str3 = this.f45300a;
        String str4 = this.f45305f;
        String str5 = str3;
        String str6 = this.f45306g;
        boolean z2 = this.f45315p;
        boolean z3 = this.f45316q;
        boolean z4 = this.f45317r;
        boolean z5 = this.f45318s;
        String str7 = this.f45320u;
        boolean z6 = this.f45321v;
        boolean z7 = this.f45322w;
        zzbaz zzbaz = this.f45323x;
        List<String> list4 = this.f45324y;
        List<String> list5 = this.f45325z;
        boolean z8 = this.f45285A;
        zzaxk zzaxk = this.f45286B;
        boolean z9 = this.f45287C;
        String str8 = this.f45288D;
        List<String> list6 = this.f45289E;
        boolean z10 = this.f45290F;
        String str9 = this.f45291G;
        zzbbq zzbbq = this.f45292H;
        String str10 = this.f45304e;
        boolean z11 = this.f45319t;
        boolean z12 = this.f45293I;
        int i2 = i;
        String str11 = str5;
        int i3 = i2;
        long j4 = j;
        zzaxi zzaxi = new zzaxi(zzaxe, str, str2, list, list2, j2, z, -1, list3, j3, i3, str11, j4, str4, str6, z2, z3, z4, z5, false, str7, z6, z7, zzbaz, list4, list5, z8, zzaxk, z9, str8, list6, z10, str9, zzbbq, str10, z11, z12, this.f45294J, xgVar2.f45332g ? 2 : 1, this.f45295K, this.f45308i, this.f45296L, this.f45297M, xgVar2.f45333h, xgVar2.f45334i, this.f45298N);
        return zzaxi;
    }

    /* renamed from: a */
    public final void mo42061a(String str, Map<String, List<String>> map, String str2) {
        this.f45302c = str2;
        mo42062a(map);
    }

    /* renamed from: a */
    public final void mo42062a(Map<String, List<String>> map) {
        this.f45300a = m52367a(map, "X-Afma-Ad-Size");
        this.f45291G = m52367a(map, "X-Afma-Ad-Slot-Size");
        List<String> c = m52369c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f45303d = c;
        }
        this.f45304e = m52367a(map, "X-Afma-Debug-Signals");
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f45305f = (String) list.get(0);
        }
        List<String> c2 = m52369c(map, "X-Afma-Tracking-Urls");
        if (c2 != null) {
            this.f45307h = c2;
        }
        List<String> c3 = m52369c(map, "X-Afma-Downloaded-Impression-Urls");
        if (c3 != null) {
            this.f45308i = c3;
        }
        long b = m52368b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f45309j = b;
        }
        this.f45310k |= m52370d(map, "X-Afma-Mediation");
        List<String> c4 = m52369c(map, "X-Afma-Manual-Tracking-Urls");
        if (c4 != null) {
            this.f45312m = c4;
        }
        long b2 = m52368b(map, "X-Afma-Refresh-Rate");
        if (b2 != -1) {
            this.f45313n = b2;
        }
        List list2 = (List) map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = (String) list2.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.f45314o = 7;
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.f45314o = 6;
            }
        }
        this.f45306g = m52367a(map, "X-Afma-ActiveView");
        List list3 = (List) map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.f45317r = Boolean.parseBoolean((String) list3.get(0));
        }
        this.f45315p |= m52370d(map, "X-Afma-Custom-Rendering-Allowed");
        this.f45316q = "native".equals(m52367a(map, "X-Afma-Ad-Format"));
        List list4 = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.f45318s = Boolean.parseBoolean((String) list4.get(0));
        }
        List list5 = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.f45319t = Boolean.parseBoolean((String) list5.get(0));
        }
        List list6 = (List) map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.f45320u = (String) list6.get(0);
        }
        String a = m52367a(map, "X-Afma-Fluid");
        if (a != null && a.equals("height")) {
            this.f45321v = true;
        }
        this.f45322w = "native_express".equals(m52367a(map, "X-Afma-Ad-Format"));
        this.f45323x = zzbaz.m52670a(m52367a(map, "X-Afma-Rewards"));
        if (this.f45324y == null) {
            this.f45324y = m52369c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.f45325z == null) {
            this.f45325z = m52369c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.f45285A |= m52370d(map, "X-Afma-Use-Displayed-Impression");
        this.f45287C |= m52370d(map, "X-Afma-Auto-Collect-Location");
        this.f45288D = m52367a(map, "Set-Cookie");
        String a2 = m52367a(map, "X-Afma-Auto-Protection-Configuration");
        if (a2 == null || TextUtils.isEmpty(a2)) {
            Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f45305f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f45305f);
            }
            String valueOf = String.valueOf(buildUpon);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append(valueOf);
            sb.append("&navigationURL={NAVIGATION_URL}");
            this.f45286B = new zzaxk(true, Collections.singletonList(sb.toString()));
        } else {
            try {
                this.f45286B = zzaxk.m52666a(new JSONObject(a2));
            } catch (JSONException e) {
                acd.m45780c("Error parsing configuration JSON", e);
                this.f45286B = new zzaxk();
            }
        }
        List<String> c5 = m52369c(map, "X-Afma-Remote-Ping-Urls");
        if (c5 != null) {
            this.f45289E = c5;
        }
        String a3 = m52367a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a3)) {
            try {
                this.f45292H = zzbbq.m52672a(new JSONObject(a3));
            } catch (JSONException e2) {
                acd.m45780c("Error parsing safe browsing header", e2);
            }
        }
        this.f45290F |= m52370d(map, "X-Afma-Render-In-Browser");
        String a4 = m52367a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(a4)) {
            try {
                this.f45293I = new JSONObject(a4).getBoolean("never_pool");
            } catch (JSONException e3) {
                acd.m45780c("Error parsing interstitial pool header", e3);
            }
        }
        this.f45294J = m52370d(map, "X-Afma-Custom-Close-Blocked");
        this.f45295K = m52370d(map, "X-Afma-Enable-Omid");
        this.f45296L = m52370d(map, "X-Afma-Disable-Closable-Area");
        this.f45297M = m52367a(map, "X-Afma-Omid-Settings");
        String a5 = m52367a(map, "X-Afma-Creative-Configuration");
        if (!TextUtils.isEmpty(a5)) {
            try {
                this.f45298N = new JSONObject(a5).getBoolean("scroll_aware");
            } catch (JSONException e4) {
                acd.m45780c("Error parsing creative configuration header", e4);
            }
        }
    }
}
