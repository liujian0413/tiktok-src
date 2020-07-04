package com.p280ss.android.ugc.aweme.feed.p1228d;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.feed.experiment.PreloadGatherModeExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.p332ml.C33573d;
import com.p280ss.android.ugc.aweme.p332ml.C33583m;
import com.p280ss.android.ugc.aweme.store.C41961c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.d.b */
public class C28292b {

    /* renamed from: a */
    public static final String f74560a = "b";

    /* renamed from: b */
    private int f74561b;

    /* renamed from: c */
    private int f74562c;

    /* renamed from: d */
    private int f74563d;

    /* renamed from: e */
    private int f74564e;

    /* renamed from: f */
    private int f74565f;

    /* renamed from: g */
    private int f74566g;

    /* renamed from: h */
    private C28291a<String, C28296c> f74567h;

    /* renamed from: i */
    private long f74568i;

    /* renamed from: com.ss.android.ugc.aweme.feed.d.b$a */
    static final class C28294a {

        /* renamed from: a */
        public int f74569a;

        /* renamed from: b */
        public int f74570b;

        /* renamed from: c */
        public int f74571c;

        /* renamed from: d */
        public int f74572d;

        /* renamed from: e */
        public int f74573e;

        private C28294a() {
        }

        /* renamed from: a */
        static C28294a m93064a(Aweme aweme) {
            C28294a aVar = new C28294a();
            if (aweme == null || aweme.getStatistics() == null) {
                return aVar;
            }
            AwemeStatistics statistics = aweme.getStatistics();
            aVar.f74569a = statistics.getPlayCount();
            aVar.f74570b = statistics.getCommentCount();
            aVar.f74571c = statistics.getDiggCount();
            aVar.f74572d = statistics.getShareCount();
            if (aweme.getAuthor() != null) {
                aVar.f74573e = aweme.getAuthor().getFollowStatus();
            }
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.d.b$b */
    static final class C28295b {

        /* renamed from: a */
        public static final C28292b f74574a = new C28292b();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.d.b$c */
    static final class C28296c {

        /* renamed from: a */
        public int f74575a;

        /* renamed from: b */
        public int f74576b;

        /* renamed from: c */
        public int f74577c;

        /* renamed from: d */
        public int f74578d;

        /* renamed from: e */
        public int f74579e;

        /* renamed from: f */
        public int f74580f;

        private C28296c() {
        }
    }

    /* renamed from: a */
    private static int m93051a(int i, int i2) {
        int i3 = i;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += i3 & 1;
            i3 >>= 1;
        }
        return i4;
    }

    /* renamed from: a */
    public static C28292b m93052a() {
        return C28295b.f74574a;
    }

    private C28292b() {
        this.f74567h = new C28291a<>(31);
        this.f74568i = -1;
    }

    /* renamed from: c */
    private static boolean m93054c() {
        if (m93055d() || C33573d.m108449a().mo85905b() || C33583m.m108463a().mo85912b()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m93055d() {
        if (C6384b.m19835a().mo15287a(PreloadGatherModeExperiment.class, true, "preload_gather_mode", C6384b.m19835a().mo15295d().preload_gather_mode, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private int[] m93053b() {
        int[] iArr = new int[6];
        C28296c[] cVarArr = (C28296c[]) this.f74567h.mo71973a().toArray(new C28296c[0]);
        for (int i = 0; i < cVarArr.length; i++) {
            C28296c cVar = cVarArr[(cVarArr.length - i) - 1];
            iArr[0] = iArr[0] ^ (cVar.f74576b << i);
            iArr[1] = iArr[1] ^ (cVar.f74577c << i);
            iArr[2] = iArr[2] ^ (cVar.f74578d << i);
            iArr[3] = iArr[3] ^ (cVar.f74579e << i);
            iArr[4] = iArr[4] ^ (cVar.f74580f << i);
            iArr[5] = (cVar.f74575a << i) ^ iArr[5];
        }
        return iArr;
    }

    /* renamed from: f */
    public final void mo71981f(String str) {
        if (m93054c()) {
            C28296c cVar = (C28296c) this.f74567h.mo71971a(str);
            if (cVar == null) {
                cVar = new C28296c();
                this.f74567h.mo71972a(str, cVar);
            }
            cVar.f74578d = 1;
        }
    }

    /* renamed from: g */
    public final void mo71982g(String str) {
        if (m93054c()) {
            C28296c cVar = (C28296c) this.f74567h.mo71971a(str);
            if (cVar != null) {
                cVar.f74578d = 0;
            }
        }
    }

    /* renamed from: a */
    public final void mo71976a(String str) {
        if (m93054c()) {
            this.f74562c++;
            C28296c cVar = (C28296c) this.f74567h.mo71971a(str);
            if (cVar == null) {
                cVar = new C28296c();
                this.f74567h.mo71972a(str, cVar);
            }
            cVar.f74576b = 1;
            C41961c.m133432a().mo102976a(str);
        }
    }

    /* renamed from: b */
    public final void mo71977b(String str) {
        if (m93054c()) {
            C28296c cVar = (C28296c) this.f74567h.mo71971a(str);
            if (cVar == null) {
                cVar = new C28296c();
                this.f74567h.mo71972a(str, cVar);
            }
            this.f74566g++;
            cVar.f74580f = 1;
        }
    }

    /* renamed from: c */
    public final void mo71978c(String str) {
        if (m93054c()) {
            C28296c cVar = (C28296c) this.f74567h.mo71971a(str);
            if (cVar != null) {
                this.f74563d++;
                cVar.f74577c = 1;
            }
        }
    }

    /* renamed from: d */
    public final void mo71979d(String str) {
        if (m93054c()) {
            C28296c cVar = (C28296c) this.f74567h.mo71971a(str);
            if (cVar == null) {
                cVar = new C28296c();
                this.f74567h.mo71972a(str, cVar);
            }
            this.f74564e++;
            cVar.f74575a = 1;
            C41961c.m133432a().mo102977b(str);
        }
    }

    /* renamed from: e */
    public final void mo71980e(String str) {
        if (m93054c()) {
            this.f74565f++;
            C28296c cVar = (C28296c) this.f74567h.mo71971a(str);
            if (cVar == null) {
                cVar = new C28296c();
                this.f74567h.mo71972a(str, cVar);
            }
            cVar.f74579e = 1;
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo71975a(Aweme aweme) {
        HashMap hashMap = new HashMap();
        if (aweme != null) {
            hashMap.put("user_is_login", Integer.valueOf(C6861a.m21332a().userService().isLogin() ? 1 : 0));
            C28294a a = C28294a.m93064a(aweme);
            hashMap.put("vs_v", Integer.valueOf(a.f74569a));
            hashMap.put("vs_c", Integer.valueOf(a.f74570b));
            hashMap.put("vs_l", Integer.valueOf(a.f74571c));
            hashMap.put("vs_s", Integer.valueOf(a.f74572d));
            hashMap.put("rel", Integer.valueOf(a.f74573e));
            hashMap.put("uas_v", Integer.valueOf(this.f74561b));
            hashMap.put("uas_c", Integer.valueOf(this.f74562c));
            hashMap.put("uas_pc", Integer.valueOf(this.f74563d));
            hashMap.put("uas_p", Integer.valueOf(this.f74564e));
            hashMap.put("uas_s", Integer.valueOf(this.f74565f));
            hashMap.put("uas_m", Integer.valueOf(this.f74566g));
            int[] b = m93053b();
            hashMap.put("ula_c", Integer.valueOf(b[0]));
            hashMap.put("ula_pc", Integer.valueOf(b[1]));
            hashMap.put("ula_l", Integer.valueOf(b[2]));
            hashMap.put("ula_s", Integer.valueOf(b[3]));
            hashMap.put("ula_m", Integer.valueOf(b[4]));
            hashMap.put("ula_p", Integer.valueOf(b[5]));
            hashMap.put("ula_c_cnt8", Integer.valueOf(m93051a(b[0], 8)));
            hashMap.put("ula_c_cnt16", Integer.valueOf(m93051a(b[0], 16)));
            hashMap.put("ula_c_cnt31", Integer.valueOf(m93051a(b[0], 31)));
            hashMap.put("ula_pc_cnt8", Integer.valueOf(m93051a(b[1], 8)));
            hashMap.put("ula_pc_cnt16", Integer.valueOf(m93051a(b[1], 16)));
            hashMap.put("ula_pc_cnt31", Integer.valueOf(m93051a(b[1], 31)));
            hashMap.put("ula_l_cnt8", Integer.valueOf(m93051a(b[2], 8)));
            hashMap.put("ula_l_cnt16", Integer.valueOf(m93051a(b[2], 16)));
            hashMap.put("ula_l_cnt31", Integer.valueOf(m93051a(b[2], 31)));
            hashMap.put("ula_s_cnt8", Integer.valueOf(m93051a(b[3], 8)));
            hashMap.put("ula_s_cnt16", Integer.valueOf(m93051a(b[3], 16)));
            hashMap.put("ula_s_cnt31", Integer.valueOf(m93051a(b[3], 31)));
            hashMap.put("ula_m_cnt8", Integer.valueOf(m93051a(b[4], 8)));
            hashMap.put("ula_m_cnt16", Integer.valueOf(m93051a(b[4], 16)));
            hashMap.put("ula_m_cnt31", Integer.valueOf(m93051a(b[4], 31)));
            hashMap.put("ula_p_cnt8", Integer.valueOf(m93051a(b[5], 8)));
            hashMap.put("ula_p_cnt16", Integer.valueOf(m93051a(b[5], 16)));
            hashMap.put("ula_p_cnt31", Integer.valueOf(m93051a(b[5], 31)));
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
