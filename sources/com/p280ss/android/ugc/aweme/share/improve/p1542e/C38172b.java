package com.p280ss.android.ugc.aweme.share.improve.p1542e;

import com.p280ss.android.ugc.aweme.share.C37983ao;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.share.p1533d.C38025a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38329t;
import com.p280ss.android.ugc.trill.share.data.C45111a;
import com.p280ss.android.ugc.trill.share.data.ShareDatabase;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7507ae;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.share.improve.e.b */
public final class C38172b implements Comparator<C38343b> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f99292a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38172b.class), "shareDataBase", "getShareDataBase()Lcom/ss/android/ugc/trill/share/data/ShareDatabase;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38172b.class), "sharePlatforms", "getSharePlatforms()Ljava/util/List;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38172b.class), "channelTimes", "getChannelTimes()Ljava/util/Map;"))};

    /* renamed from: b */
    public int f99293b = -1;

    /* renamed from: c */
    public final int f99294c;

    /* renamed from: d */
    private final C7541d f99295d = C7546e.m23569a(C38174b.f99299a);

    /* renamed from: e */
    private final C7541d f99296e = C7546e.m23569a(C38175c.f99300a);

    /* renamed from: f */
    private final C7541d f99297f = C7546e.m23569a(new C38173a(this));

    /* renamed from: com.ss.android.ugc.aweme.share.improve.e.b$a */
    static final class C38173a extends Lambda implements C7561a<Map<String, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ C38172b f99298a;

        C38173a(C38172b bVar) {
            this.f99298a = bVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Map<String, Integer> invoke() {
            int i;
            try {
                HashMap hashMap = new HashMap();
                for (C37983ao aoVar : this.f99298a.mo95754b()) {
                    Map map = hashMap;
                    C7573i.m23582a((Object) aoVar, "platform");
                    String str = aoVar.f98894a;
                    C7573i.m23582a((Object) str, "platform.platformId");
                    map.put(str, Integer.valueOf(0));
                }
                ShareDatabase a = this.f99298a.mo95753a();
                if (a == null) {
                    C7573i.m23580a();
                }
                List<C45111a> a2 = a.mo107673h().mo107674a(Integer.valueOf(this.f99298a.f99294c));
                if (a2.size() >= 10) {
                    this.f99298a.f99293b = ((C45111a) a2.get(a2.size() - 1)).f115947a;
                }
                for (C45111a aVar : a2) {
                    C7573i.m23582a((Object) aVar, "record");
                    Integer num = (Integer) hashMap.get(aVar.f115949c);
                    Map map2 = hashMap;
                    String str2 = aVar.f115949c;
                    C7573i.m23582a((Object) str2, "record.channel");
                    if (num == null) {
                        i = 1;
                    } else {
                        i = num.intValue() + 1;
                    }
                    map2.put(str2, Integer.valueOf(i));
                }
                return hashMap;
            } catch (Exception unused) {
                return C7507ae.m23387a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.e.b$b */
    static final class C38174b extends Lambda implements C7561a<ShareDatabase> {

        /* renamed from: a */
        public static final C38174b f99299a = new C38174b();

        C38174b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m121936a();
        }

        /* renamed from: a */
        private static ShareDatabase m121936a() {
            return ShareDatabase.m142253a(C38159c.m121910a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.e.b$c */
    static final class C38175c extends Lambda implements C7561a<List<C37983ao>> {

        /* renamed from: a */
        public static final C38175c f99300a = new C38175c();

        C38175c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m121937a();
        }

        /* renamed from: a */
        private static List<C37983ao> m121937a() {
            C38025a a = C38025a.m121371a();
            C7573i.m23582a((Object) a, "I18nShareOrderUtil.getInstance()");
            List<C37983ao> list = a.f98975a;
            if (list == null) {
                return C7525m.m23461a();
            }
            return list;
        }
    }

    /* renamed from: c */
    private final Map<String, Integer> m121932c() {
        return (Map) this.f99297f.getValue();
    }

    /* renamed from: a */
    public final ShareDatabase mo95753a() {
        return (ShareDatabase) this.f99295d.getValue();
    }

    /* renamed from: b */
    public final List<C37983ao> mo95754b() {
        return (List) this.f99296e.getValue();
    }

    public C38172b(int i) {
        this.f99294c = i;
    }

    /* renamed from: a */
    private final int m121930a(C38343b bVar) {
        for (C37983ao aoVar : mo95754b()) {
            C7573i.m23582a((Object) aoVar, "sharePlatform");
            if (C7573i.m23585a((Object) aoVar.f98894a, (Object) bVar.mo95739b())) {
                return mo95754b().indexOf(aoVar);
            }
        }
        return Integer.MAX_VALUE;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compare(C38343b bVar, C38343b bVar2) {
        int i;
        int i2;
        C7573i.m23587b(bVar, "lhs");
        C7573i.m23587b(bVar2, "rhs");
        if (bVar instanceof C38329t) {
            return 1;
        }
        if (bVar2 instanceof C38329t) {
            return -1;
        }
        Integer num = (Integer) m121932c().get(bVar.mo95739b());
        if (num != null) {
            i = num.intValue();
        } else {
            Integer num2 = (Integer) m121932c().get(bVar2.mo95739b());
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            i = 0 - i2;
        }
        if (i != 0) {
            return -i;
        }
        return m121930a(bVar) - m121930a(bVar2);
    }
}
