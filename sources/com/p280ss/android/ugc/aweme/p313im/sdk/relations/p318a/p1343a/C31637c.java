package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31644f.C31645a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p319c.C7042c;
import com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1348b.C31850a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.c */
public final class C31637c extends C31644f<IMUser, IMContact> {

    /* renamed from: f */
    public static final C31639b f82842f = new C31639b(null);

    /* renamed from: a */
    public List<String> f82843a;

    /* renamed from: b */
    public C7561a<? extends List<String>> f82844b;

    /* renamed from: c */
    public String f82845c;

    /* renamed from: d */
    public boolean f82846d;

    /* renamed from: e */
    public int f82847e;

    /* renamed from: r */
    private final C7562b<IMUser, IMContact> f82848r;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.c$a */
    public static final class C31638a extends C31645a<C31637c, IMUser, IMContact> {

        /* renamed from: a */
        public final C31637c f82849a = new C31637c(null);

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C31637c mo82428b() {
            return this.f82849a;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C31644f mo82427a() {
            return this.f82849a;
        }

        /* renamed from: a */
        public final C31638a mo82426a(boolean z) {
            C31638a aVar = this;
            aVar.f82849a.f82846d = z;
            return aVar;
        }

        /* renamed from: a */
        public final C31638a mo82424a(String str) {
            C7573i.m23587b(str, "sql");
            C31638a aVar = this;
            aVar.f82849a.f82845c = str;
            return aVar;
        }

        /* renamed from: a */
        public final C31638a mo82425a(C7561a<? extends List<String>> aVar) {
            C7573i.m23587b(aVar, "filter");
            C31638a aVar2 = this;
            aVar2.f82849a.f82844b = aVar;
            return aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.c$b */
    public static final class C31639b {
        private C31639b() {
        }

        /* renamed from: a */
        public static C31638a m102815a() {
            return new C31638a();
        }

        public /* synthetic */ C31639b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.c$c */
    static final class C31640c extends Lambda implements C7562b<IMUser, IMUser> {

        /* renamed from: a */
        public static final C31640c f82850a = new C31640c();

        C31640c() {
            super(1);
        }

        /* renamed from: a */
        private static IMUser m102816a(IMUser iMUser) {
            C7573i.m23587b(iMUser, "it");
            return iMUser;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m102816a((IMUser) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C7562b<IMUser, IMContact> mo82421g() {
        return this.f82848r;
    }

    private C31637c() {
        this.f82848r = C31640c.f82850a;
    }

    /* renamed from: m */
    private final List<String> m102802m() {
        C7561a<? extends List<String>> aVar = this.f82844b;
        if (aVar != null) {
            List<String> list = (List) aVar.invoke();
            if (list != null) {
                return list;
            }
        }
        return this.f82843a;
    }

    /* renamed from: n */
    private final int m102803n() {
        if (this.f82846d) {
            return -1;
        }
        if (this.f82862o < 0) {
            this.f82862o = 100;
        }
        return this.f82862o + 5;
    }

    /* renamed from: f */
    public final boolean mo82415f() {
        boolean z;
        if (!super.mo82415f()) {
            return false;
        }
        CharSequence charSequence = this.f82845c;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final List<IMUser> mo82423i() {
        if (!this.f82846d) {
            int n = m102803n();
            List<IMUser> a = C31850a.m103357a().mo82681a(m102802m(), n, this.f82847e * n, this.f82845c);
            if (a.isEmpty()) {
                return new ArrayList<>();
            }
            this.f82847e++;
            return a;
        }
        throw new UnsupportedOperationException("Weight sort mode not support load more!");
    }

    /* renamed from: o */
    private final void m102804o() {
        int i;
        C7573i.m23582a((Object) C31850a.m103357a(), "IMUserDao.inst()");
        boolean k = C31850a.m103372k();
        C7573i.m23582a((Object) C31850a.m103357a(), "IMUserDao.inst()");
        int l = C31850a.m103373l();
        User c = C7074e.m22071c();
        if (c != null) {
            i = c.getFollowingCount();
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder("FollowLoader DB: dbEmpty=");
        sb.append(k);
        sb.append(", dbCount=");
        sb.append(l);
        sb.append(", userCount=");
        sb.append(i);
        C6921a.m21555a(sb.toString());
        if (k) {
            m102801a(k, l, i);
            m102800a(3);
            return;
        }
        if (l + 1 < i) {
            m102801a(k, l, i);
            if (i < 200 || l < i / 5) {
                m102800a(4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final List<IMUser> mo82422h() {
        m102804o();
        if (this.f82846d) {
            List<IMUser> c = C31850a.m103357a().mo82685c(this.f82845c);
            C7573i.m23582a((Object) c, "IMUserDao.inst().queryBySortWeight(querySql)");
            return c;
        }
        List<IMUser> a = C31850a.m103357a().mo82681a(m102802m(), m102803n(), 0, this.f82845c);
        if (a.isEmpty()) {
            this.f82847e = 0;
            return new ArrayList<>();
        }
        this.f82847e++;
        return a;
    }

    public /* synthetic */ C31637c(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    private static void m102800a(int i) {
        C7042c.m21898a(i);
        StringBuilder sb = new StringBuilder("FollowLoader DB updated: dbEmpty=");
        C7573i.m23582a((Object) C31850a.m103357a(), "IMUserDao.inst()");
        sb.append(C31850a.m103372k());
        sb.append(", dbCount=");
        C7573i.m23582a((Object) C31850a.m103357a(), "IMUserDao.inst()");
        sb.append(C31850a.m103373l());
        C6921a.m21555a(sb.toString());
    }

    /* renamed from: a */
    private static void m102801a(boolean z, int i, int i2) {
        int i3;
        if (z) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error", Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder("empty=");
        sb.append(z);
        sb.append(", dbCount=");
        sb.append(i);
        sb.append(", userCount=");
        sb.append(i2);
        linkedHashMap.put("error_stack", sb.toString());
        C7074e.m22070b("follow_loader_data_error", linkedHashMap);
    }
}
