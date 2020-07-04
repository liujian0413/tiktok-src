package com.p280ss.android.ugc.aweme.router;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p280ss.android.ugc.aweme.app.C22909c.C22910a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.router.w */
public final class C37287w implements IInterceptor {

    /* renamed from: a */
    public static final C37288a f97409a = new C37288a(null);

    /* renamed from: b */
    private final ArrayList<String> f97410b = C7525m.m23468d("aweme://challenge/detail/:id", "aweme://music/detail/:id", "aweme://assmusic/category/:cid", "aweme://music/category/:mc_id", "aweme://user/profile/:uid", "aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type", "aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type/:enter_from", "aweme://aweme/detail/:id", "aweme://aweme/detaillist/:id", "aweme://tuwen/detail/:id", "aweme://aweme/zhima/:type", "aweme://poi/detail/:id", "aweme://stickers/detail/:id", "aweme://aweme/forward/:forward_id");

    /* renamed from: c */
    private String f97411c = "";

    /* renamed from: com.ss.android.ugc.aweme.router.w$a */
    public static final class C37288a {
        private C37288a() {
        }

        public /* synthetic */ C37288a(C7571f fVar) {
            this();
        }
    }

    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        String str2 = null;
        if (routeIntent != null) {
            str = routeIntent.getUrl();
        } else {
            str = null;
        }
        if (str != null && C7634n.m23721b(str, "//", false)) {
            StringBuilder sb = new StringBuilder("aweme:");
            sb.append(str);
            str = sb.toString();
        }
        String str3 = str;
        if (str3 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C22910a.m75393a());
            sb2.append(C6399b.m19935k());
            str2 = C7634n.m23711a(str3, sb2.toString(), "aweme", false);
        }
        Iterator it = this.f97410b.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (C37286v.m119758a(str4, str2)) {
                C7573i.m23582a((Object) str4, "atypicalUrl");
                this.f97411c = str4;
                return true;
            }
        }
        this.f97411c = "";
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r11, com.bytedance.router.RouteIntent r12) {
        /*
            r10 = this;
            java.lang.String r11 = r10.f97411c
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            r0 = 0
            if (r11 == 0) goto L_0x000c
            return r0
        L_0x000c:
            java.lang.String r11 = r10.f97411c
            r1 = r11
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r11 = 1
            java.lang.String[] r2 = new java.lang.String[r11]
            java.lang.String r3 = "/:"
            r2[r0] = r3
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.util.List r1 = kotlin.text.C7634n.m23768b(r1, r2, false, 0)
            java.lang.String r2 = ""
            r3 = 0
            if (r1 == 0) goto L_0x002e
            int r4 = r1.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x002f
        L_0x002e:
            r4 = r3
        L_0x002f:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x003c
            java.lang.Object r1 = r1.get(r0)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
        L_0x003c:
            r1 = r2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0046
            return r0
        L_0x0046:
            com.ss.android.common.util.j r1 = new com.ss.android.common.util.j
            r1.<init>(r2)
            java.lang.String r2 = r10.f97411c
            java.util.List r2 = com.p280ss.android.ugc.aweme.router.C37286v.m119757a(r2)
            if (r12 == 0) goto L_0x005e
            android.net.Uri r4 = r12.getUri()
            if (r4 == 0) goto L_0x005e
            java.lang.String r4 = r4.toString()
            goto L_0x005f
        L_0x005e:
            r4 = r3
        L_0x005f:
            java.util.List r4 = com.p280ss.android.ugc.aweme.router.C37286v.m119757a(r4)
            int r5 = r2.size()
            r6 = 1
        L_0x0068:
            if (r6 >= r5) goto L_0x0097
            if (r6 >= r5) goto L_0x0094
            java.lang.Object r7 = r2.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r4.get(r6)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "key"
            kotlin.jvm.internal.C7573i.m23582a(r7, r9)
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = r7.substring(r11)
            java.lang.String r9 = "(this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r7, r9)
            r1.mo51188a(r7, r8)
            goto L_0x0094
        L_0x008c:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException
            java.lang.String r12 = "null cannot be cast to non-null type java.lang.String"
            r11.<init>(r12)
            throw r11
        L_0x0094:
            int r6 = r6 + 1
            goto L_0x0068
        L_0x0097:
            if (r12 == 0) goto L_0x00d2
            android.net.Uri r11 = r12.getUri()
            if (r11 == 0) goto L_0x00d2
            java.util.Set r11 = r11.getQueryParameterNames()
            if (r11 == 0) goto L_0x00d2
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            if (r11 == 0) goto L_0x00d2
            java.util.Iterator r11 = r11.iterator()
        L_0x00ad:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x00d2
            java.lang.Object r2 = r11.next()
            java.lang.String r2 = (java.lang.String) r2
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00ad
            android.net.Uri r4 = r12.getUri()
            if (r4 == 0) goto L_0x00cd
            java.lang.String r4 = r4.getQueryParameter(r2)
            goto L_0x00ce
        L_0x00cd:
            r4 = r3
        L_0x00ce:
            r1.mo51188a(r2, r4)
            goto L_0x00ad
        L_0x00d2:
            if (r12 == 0) goto L_0x00db
            java.lang.String r11 = r1.mo51184a()
            r12.setUrl(r11)
        L_0x00db:
            java.lang.String r11 = ""
            r10.f97411c = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.router.C37287w.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
