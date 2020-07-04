package com.p280ss.android.ugc.aweme.commercialize.log;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24641b;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24657f;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24669k;
import com.p280ss.android.ugc.aweme.commercialize.model.EasterEggInfo;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.q */
public final class C24972q implements C24669k {

    /* renamed from: a */
    public static final C24972q f65846a = new C24972q();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.q$a */
    static final class C24973a<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ boolean f65847a;

        /* renamed from: b */
        final /* synthetic */ C24641b f65848b;

        /* renamed from: c */
        final /* synthetic */ C24657f f65849c;

        /* renamed from: d */
        final /* synthetic */ String f65850d;

        C24973a(boolean z, C24641b bVar, C24657f fVar, String str) {
            this.f65847a = z;
            this.f65848b = bVar;
            this.f65849c = fVar;
            this.f65850d = str;
        }

        public final /* synthetic */ Object call() {
            m81990a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m81990a() {
            try {
                boolean z = !this.f65847a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_url", this.f65848b.f64975a);
                jSONObject.put("egg_type", this.f65849c.f65019a);
                jSONObject.put("egg_id", this.f65849c.f65023e);
                jSONObject.put("creative_id", this.f65849c.f65020b);
                jSONObject.put("log_extra", this.f65849c.f65021c);
                jSONObject.put("aweme_id", this.f65849c.f65022d);
                C6893q.m21444a(this.f65850d, z ? 1 : 0, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    private C24972q() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if ((r2 == null || r2.length() == 0) == false) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65289a(java.util.List<? extends com.p280ss.android.ugc.aweme.feed.model.Aweme> r9) {
        /*
            r8 = this;
            boolean r0 = m81983a()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r9 == 0) goto L_0x00b0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r9 = r9.iterator()
        L_0x0016:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r9.next()
            r2 = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r2
            com.ss.android.ugc.aweme.feed.model.ItemLikeEggData r2 = r2.getCommerceAdLikeDigg()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0054
            java.lang.String r5 = r2.getFileType()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x003c
            int r5 = r5.length()
            if (r5 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r5 = 0
            goto L_0x003d
        L_0x003c:
            r5 = 1
        L_0x003d:
            if (r5 != 0) goto L_0x0054
            java.lang.String r2 = r2.getMaterialUrl()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x0050
            int r2 = r2.length()
            if (r2 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r2 = 0
            goto L_0x0051
        L_0x0050:
            r2 = 1
        L_0x0051:
            if (r2 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            if (r3 == 0) goto L_0x0016
            r0.add(r1)
            goto L_0x0016
        L_0x005b:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r9 = r0.iterator()
        L_0x0063:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r9.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.commercialize.log.b r7 = new com.ss.android.ugc.aweme.commercialize.log.b
            java.lang.String r2 = "egg"
            java.lang.String r3 = "data_received"
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r1 = r0.getAid()
            com.ss.android.ugc.aweme.commercialize.log.b r1 = r7.mo65230a(r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
            r3 = 0
            if (r2 == 0) goto L_0x0090
            java.lang.String r2 = r2.getCreativeIdStr()
            goto L_0x0091
        L_0x0090:
            r2 = r3
        L_0x0091:
            com.ss.android.ugc.aweme.commercialize.log.b r1 = r1.mo65232b(r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x009f
            java.lang.String r3 = r0.getLogExtra()
        L_0x009f:
            com.ss.android.ugc.aweme.commercialize.log.b r0 = r1.mo65233c(r3)
            java.lang.String r1 = "like"
            com.ss.android.ugc.aweme.commercialize.log.b r0 = r0.mo65235e(r1)
            com.ss.android.ugc.aweme.commercialize.log.c r1 = com.p280ss.android.ugc.aweme.commercialize.log.C24952c.f65801b
            r1.mo65237a(r0)
            goto L_0x0063
        L_0x00af:
            return
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.log.C24972q.mo65289a(java.util.List):void");
    }

    /* renamed from: a */
    private static boolean m81983a() {
        if (!CommerceEggMonitorLogSetting.get()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo64537a(C24641b bVar) {
        if (!m81983a() && bVar != null) {
            m81980a(f65846a, "preload_start", bVar.f64981g, 0, null, 12, null);
        }
    }

    /* renamed from: b */
    public final void mo65290b(List<? extends Aweme> list) {
        String str;
        String str2;
        boolean z;
        if (!m81983a() && list != null) {
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (true) {
                List list2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ItemCommentEggGroup commentEggGroup = ((Aweme) next).getCommentEggGroup();
                if (commentEggGroup != null) {
                    list2 = commentEggGroup.getCommentEggData();
                }
                if (list2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (Aweme aweme : (List) arrayList) {
                C24951b bVar = new C24951b("egg", "data_received", 0, 4, null);
                C24951b a = bVar.mo65230a(aweme.getAid());
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    str = awemeRawAd.getCreativeIdStr();
                } else {
                    str = null;
                }
                C24951b b = a.mo65232b(str);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    str2 = awemeRawAd2.getLogExtra();
                } else {
                    str2 = null;
                }
                C24952c.f65801b.mo65237a(b.mo65233c(str2).mo65235e("comment"));
            }
        }
    }

    /* renamed from: a */
    public final void mo65288a(EasterEggInfo easterEggInfo) {
        if (!m81983a() && easterEggInfo != null) {
            C24951b bVar = new C24951b("egg", "data_received", 0, 4, null);
            C24952c.f65801b.mo65237a(bVar.mo65235e("search").mo65236f(easterEggInfo.getId()));
        }
    }

    /* renamed from: a */
    public final void mo64538a(C24641b bVar, boolean z) {
        if (!m81983a() && bVar != null) {
            m81980a(f65846a, "preload_result", bVar.f64981g, z ^ true ? 1 : 0, null, 8, null);
            m81981a("aweme_ad_egg_preload_error_rate", bVar, z);
        }
    }

    /* renamed from: a */
    private static void m81981a(String str, C24641b bVar, boolean z) {
        C24657f fVar = bVar.f64981g;
        if (fVar != null) {
            C1592h.m7855a((Callable<TResult>) new C24973a<TResult>(z, bVar, fVar, str), (Executor) C6907h.m21516a());
        }
    }

    /* renamed from: a */
    public final void mo64539a(C24641b bVar, boolean z, String str) {
        if (!m81983a() && bVar != null) {
            m81982a("show_result", bVar.f64981g, z ^ true ? 1 : 0, str);
            m81981a("aweme_ad_egg_show_error_rate", bVar, z);
        }
    }

    /* renamed from: a */
    private static void m81982a(String str, C24657f fVar, int i, String str2) {
        if (fVar != null) {
            C24952c.f65801b.mo65237a(new C24951b("egg", str, i).mo65230a(fVar.f65022d).mo65232b(fVar.f65020b).mo65233c(fVar.f65021c).mo65235e(fVar.f65019a).mo65236f(fVar.f65023e).mo65234d(str2));
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m81980a(C24972q qVar, String str, C24657f fVar, int i, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        m81982a(str, fVar, i, null);
    }
}
