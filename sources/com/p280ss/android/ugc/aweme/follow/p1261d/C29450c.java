package com.p280ss.android.ugc.aweme.follow.p1261d;

import android.util.SparseArray;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.d.c */
public final class C29450c {

    /* renamed from: a */
    public static final C29450c f77648a = new C29450c();

    /* renamed from: b */
    private static int f77649b;

    /* renamed from: c */
    private static String f77650c = "";

    /* renamed from: d */
    private static long f77651d;

    /* renamed from: e */
    private static long f77652e;

    /* renamed from: f */
    private static final SparseArray<Integer> f77653f = new SparseArray<>();

    /* renamed from: g */
    private static boolean f77654g = true;

    /* renamed from: h */
    private static boolean f77655h = true;

    private C29450c() {
    }

    /* renamed from: a */
    public static int m96899a() {
        return f77649b;
    }

    /* renamed from: b */
    public static String m96906b() {
        return f77650c;
    }

    /* renamed from: b */
    public static String m96907b(int i) {
        switch (i) {
            case 1:
                return "cold_launch";
            case 2:
                return "link_launch";
            case 4:
                return "refresh_launch";
            case 5:
                return "hot_launch";
            default:
                return "";
        }
    }

    /* renamed from: c */
    public static long m96911c() {
        return f77651d;
    }

    /* renamed from: d */
    public static long m96912d() {
        return f77652e;
    }

    /* renamed from: d */
    private static String m96913d(int i) {
        switch (i) {
            case 0:
            case 1:
                return "homepage_follow";
            case 2:
                return "homepage_friends";
            default:
                return "";
        }
    }

    /* renamed from: e */
    public static SparseArray<Integer> m96914e() {
        return f77653f;
    }

    /* renamed from: f */
    public static void m96916f() {
        f77654g = true;
        f77655h = true;
    }

    /* renamed from: a */
    public static void m96900a(int i) {
        f77649b = i;
    }

    /* renamed from: b */
    public static void m96908b(long j) {
        f77652e = j;
    }

    /* renamed from: a */
    public static void m96901a(long j) {
        f77651d = j;
    }

    /* renamed from: e */
    private static boolean m96915e(int i) {
        if (i == 2) {
            return f77654g;
        }
        return f77655h;
    }

    /* renamed from: f */
    private static void m96917f(int i) {
        if (i == 2) {
            f77654g = false;
        } else {
            f77655h = false;
        }
    }

    /* renamed from: a */
    public static void m96903a(String str) {
        C7573i.m23587b(str, "<set-?>");
        f77650c = str;
    }

    /* renamed from: c */
    public static int m96910c(int i) {
        Object obj = f77653f.get(i, Integer.valueOf(0));
        C7573i.m23582a(obj, "followTabChannelCountArray.get(channel, 0)");
        return ((Number) obj).intValue();
    }

    /* renamed from: a */
    private final void m96904a(String str, int i) {
        C22984d a = C22984d.m75611a();
        a.mo59973a("error_type", "num_bias");
        a.mo59973a("enter_from", "homepage_follow");
        a.mo59973a("yellow_dot_logid", f77650c);
        a.mo59973a("feed_logid", str);
        a.mo59973a("yellow_dot_type", "video");
        a.mo59973a("launch_type", m96907b(f77649b));
        a.mo59970a("bias", i);
        if (f77652e > 0) {
            a.mo59971a("author_id", f77652e);
        }
        if (f77651d > 0) {
            a.mo59971a("group_id", f77651d);
        }
        C6907h.m21524a("homepage_follow_monitor", (Map) a.f60753a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r2 == null) goto L_0x0022;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m96902a(com.p280ss.android.ugc.aweme.follow.presenter.FollowFeedList r14, int r15) {
        /*
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 1
            if (r15 == r0) goto L_0x000b
            return
        L_0x000b:
            r15 = 0
            if (r14 == 0) goto L_0x0013
            int r1 = r14.getFeedType()
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            boolean r2 = m96915e(r1)
            if (r2 == 0) goto L_0x00b8
            if (r14 == 0) goto L_0x0022
            java.lang.String r2 = r14.getRequestId()
            if (r2 != 0) goto L_0x0024
        L_0x0022:
            java.lang.String r2 = ""
        L_0x0024:
            if (r14 == 0) goto L_0x0030
            int r3 = r14.getFeedType()
            java.lang.String r3 = m96913d(r3)
        L_0x002e:
            r9 = r3
            goto L_0x0033
        L_0x0030:
            java.lang.String r3 = ""
            goto L_0x002e
        L_0x0033:
            if (r14 == 0) goto L_0x003b
            int r3 = r14.getNewItemCount()
            r10 = r3
            goto L_0x003c
        L_0x003b:
            r10 = 0
        L_0x003c:
            if (r14 == 0) goto L_0x0044
            int r3 = r14.getNewLiveCount()
            r11 = r3
            goto L_0x0045
        L_0x0044:
            r11 = 0
        L_0x0045:
            int r12 = m96910c(r0)
            if (r14 == 0) goto L_0x005e
            int r3 = r14.getFeedType()
            r4 = 2
            if (r3 != r4) goto L_0x0059
            r3 = 3
            int r3 = m96910c(r3)
        L_0x0057:
            r13 = r3
            goto L_0x005f
        L_0x0059:
            int r3 = m96910c(r4)
            goto L_0x0057
        L_0x005e:
            r13 = 0
        L_0x005f:
            if (r13 <= 0) goto L_0x0071
            com.ss.android.ugc.aweme.follow.d.c r3 = f77648a
            java.lang.String r6 = "video"
            if (r10 > 0) goto L_0x0069
            r7 = 1
            goto L_0x006a
        L_0x0069:
            r7 = 0
        L_0x006a:
            r8 = 0
            r4 = r2
            r5 = r9
            r3.m96905a(r4, r5, r6, r7, r8)
            goto L_0x0080
        L_0x0071:
            com.ss.android.ugc.aweme.follow.d.c r3 = f77648a
            java.lang.String r6 = "video"
            if (r10 <= 0) goto L_0x0079
            r7 = 1
            goto L_0x007a
        L_0x0079:
            r7 = 0
        L_0x007a:
            r8 = 0
            r4 = r2
            r5 = r9
            r3.m96909b(r4, r5, r6, r7, r8)
        L_0x0080:
            if (r12 <= 0) goto L_0x0092
            com.ss.android.ugc.aweme.follow.d.c r3 = f77648a
            java.lang.String r6 = "live"
            if (r11 > 0) goto L_0x008a
            r7 = 1
            goto L_0x008b
        L_0x008a:
            r7 = 0
        L_0x008b:
            r8 = 1
            r4 = r2
            r5 = r9
            r3.m96905a(r4, r5, r6, r7, r8)
            goto L_0x00a1
        L_0x0092:
            com.ss.android.ugc.aweme.follow.d.c r3 = f77648a
            java.lang.String r6 = "live"
            if (r11 <= 0) goto L_0x009a
            r7 = 1
            goto L_0x009b
        L_0x009a:
            r7 = 0
        L_0x009b:
            r8 = 1
            r4 = r2
            r5 = r9
            r3.m96909b(r4, r5, r6, r7, r8)
        L_0x00a1:
            if (r14 == 0) goto L_0x00b5
            int r14 = r14.getFeedType()
            if (r14 != r0) goto L_0x00b5
            if (r13 <= 0) goto L_0x00b5
            int r13 = r13 - r10
            int r14 = java.lang.Math.max(r13, r15)
            com.ss.android.ugc.aweme.follow.d.c r15 = f77648a
            r15.m96904a(r2, r14)
        L_0x00b5:
            m96917f(r1)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.follow.p1261d.C29450c.m96902a(com.ss.android.ugc.aweme.follow.presenter.FollowFeedList, int):void");
    }

    /* renamed from: b */
    private final void m96909b(String str, String str2, String str3, boolean z, boolean z2) {
        C22984d a = C22984d.m75611a();
        a.mo59973a("error_type", "feed_no_yellow_dot");
        a.mo59973a("enter_from", str2);
        a.mo59973a("yellow_dot_logid", f77650c);
        a.mo59973a("feed_logid", str);
        a.mo59973a("yellow_dot_type", str3);
        a.mo59973a("launch_type", m96907b(f77649b));
        a.mo59970a("is_error", z ? 1 : 0);
        if (!z2) {
            if (f77652e > 0) {
                a.mo59971a("author_id", f77652e);
            }
            if (f77651d > 0) {
                a.mo59971a("group_id", f77651d);
            }
        }
        C6907h.m21524a("homepage_follow_monitor", (Map) a.f60753a);
    }

    /* renamed from: a */
    private final void m96905a(String str, String str2, String str3, boolean z, boolean z2) {
        C22984d a = C22984d.m75611a();
        a.mo59973a("error_type", "yellow_dot_no_feed");
        a.mo59973a("enter_from", str2);
        a.mo59973a("yellow_dot_logid", f77650c);
        a.mo59973a("feed_logid", str);
        a.mo59973a("yellow_dot_type", str3);
        a.mo59973a("launch_type", m96907b(f77649b));
        a.mo59970a("is_error", z ? 1 : 0);
        if (!z2) {
            if (f77652e > 0) {
                a.mo59971a("author_id", f77652e);
            }
            if (f77651d > 0) {
                a.mo59971a("group_id", f77651d);
            }
        }
        C6907h.m21524a("homepage_follow_monitor", (Map) a.f60753a);
    }
}
