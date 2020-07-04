package com.p280ss.android.ugc.aweme.feed.helper;

import com.bytedance.ttnet.p671c.C12960e;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.api.p1024c.C22823d;
import com.p280ss.android.ugc.aweme.audio.AudioUtils;
import com.p280ss.android.ugc.aweme.feed.api.C28214b;
import com.p280ss.android.ugc.aweme.feed.api.C28221i;
import com.p280ss.android.ugc.aweme.feed.api.C28226n;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.b */
public final class C28413b {

    /* renamed from: a */
    public static volatile FeedItemList f74870a = new FeedItemList();

    /* renamed from: b */
    public static Object f74871b = new Object();

    /* renamed from: c */
    public static AtomicBoolean f74872c = new AtomicBoolean(false);

    /* renamed from: d */
    public static AtomicInteger f74873d = new AtomicInteger(1);

    /* renamed from: e */
    public static AtomicInteger f74874e = new AtomicInteger(0);

    /* renamed from: a */
    public static FeedItemList m93404a(C28221i iVar, int i, long j, long j2, int i2, Integer num, String str, int i3, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, Long l, String str9, String str10, C12960e eVar, Integer num3, Long l2, String str11, Integer num4, C28226n nVar) {
        String str12;
        double a = AudioUtils.m75891a();
        String str13 = "enter_auto";
        if (str2 == null) {
            str12 = "";
        } else {
            str12 = str2;
        }
        try {
            return C28214b.m92750a((C22823d) iVar.fetchRecommendFeedV2(i, j, j2, i2, num, str, a, i3, str13, str12, str3, str4, str5, C6903bc.m21484c().mo59244d(), str6, str7, num2, Integer.valueOf(C43161e.m136882a()), Integer.valueOf(C43161e.m136884b()), str8, l, str9, str10, eVar, num3, l2, str11, num4).get(), nVar);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0066 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.ugc.aweme.feed.model.FeedItemList m93405b(com.p280ss.android.ugc.aweme.feed.api.C28221i r32, int r33, long r34, long r36, int r38, java.lang.Integer r39, java.lang.String r40, int r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.Integer r48, java.lang.String r49, java.lang.Long r50, java.lang.String r51, java.lang.String r52, com.bytedance.ttnet.p671c.C12960e r53, java.lang.Integer r54, java.lang.Long r55, java.lang.String r56, java.lang.Integer r57, com.p280ss.android.ugc.aweme.feed.api.C28226n r58) {
        /*
            r3 = r32
            r4 = r33
            r5 = r34
            r7 = r36
            r9 = r38
            r10 = r39
            r11 = r40
            r12 = r41
            r13 = r42
            r14 = r43
            r15 = r44
            r16 = r45
            r17 = r46
            r18 = r47
            r19 = r48
            r20 = r49
            r21 = r50
            r22 = r51
            r23 = r52
            r24 = r53
            r25 = r54
            r26 = r55
            r27 = r56
            r28 = r57
            r29 = r58
            com.ss.android.ugc.aweme.feed.model.FeedCompoundConfig r0 = com.p280ss.android.ugc.aweme.feed.experiment.C28344a.m93120k()
            int r1 = r0.threshold
            java.util.List<java.lang.String> r0 = r0.requestDomains
            int r2 = r0.size()
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            com.ss.android.ugc.aweme.feed.helper.b$1 r30 = new com.ss.android.ugc.aweme.feed.helper.b$1
            r31 = r0
            r0 = r1
            r1 = r30
            r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            long r0 = (long) r0
            r2 = 0
            r32 = r31
            r33 = r30
            r34 = r2
            r36 = r0
            r32.scheduleAtFixedRate(r33, r34, r36)
            java.lang.Object r1 = f74871b
            monitor-enter(r1)
            java.lang.Object r0 = f74871b     // Catch:{ InterruptedException -> 0x0066 }
            r0.wait()     // Catch:{ InterruptedException -> 0x0066 }
            goto L_0x0066
        L_0x0064:
            r0 = move-exception
            goto L_0x0073
        L_0x0066:
            java.util.concurrent.atomic.AtomicBoolean r0 = f74872c     // Catch:{ all -> 0x0064 }
            r2 = 1
            r0.set(r2)     // Catch:{ all -> 0x0064 }
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            r31.cancel()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = f74870a
            return r0
        L_0x0073:
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.helper.C28413b.m93405b(com.ss.android.ugc.aweme.feed.api.i, int, long, long, int, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, com.bytedance.ttnet.c.e, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Integer, com.ss.android.ugc.aweme.feed.api.n):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }
}
