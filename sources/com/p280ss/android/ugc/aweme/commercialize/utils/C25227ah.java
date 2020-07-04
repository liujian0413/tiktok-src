package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.abtest.AwemeAdRankAb;
import com.p280ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi;
import com.p280ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.C24538a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.AwemeAdRank;
import com.p280ss.android.ugc.aweme.commercialize.model.AwemeAdRankAbModel;
import com.p280ss.android.ugc.aweme.commercialize.model.AwemeAdRankSettingsModel;
import com.p280ss.android.ugc.aweme.commercialize.settings.AwemeAdRankSettings;
import com.p280ss.android.ugc.aweme.feed.adapter.C28198z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.panel.C28598b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7506ac;
import kotlin.collections.C7507ae;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.p356e.C7549c;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ah */
public final class C25227ah implements C25262ba {

    /* renamed from: a */
    public static final C25227ah f66553a = new C25227ah();

    /* renamed from: b */
    private static Timer f66554b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static WeakReference<C28598b> f66555c;

    /* renamed from: d */
    private static volatile int f66556d = -1;

    /* renamed from: e */
    private static volatile int f66557e = -1;

    /* renamed from: f */
    private static final Set<Integer> f66558f = new LinkedHashSet();

    /* renamed from: g */
    private static volatile long f66559g;

    /* renamed from: h */
    private static volatile boolean f66560h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ah$a */
    static final class C25228a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        public static final C25228a f66561a = new C25228a();

        C25228a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m82952a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m82952a() {
            WeakReference a = C25227ah.f66555c;
            if (a != null) {
                C28598b bVar = (C28598b) a.get();
                if (bVar != null && C25227ah.m82943b() > C25227ah.m82939a().getRequestPeriod()) {
                    C25227ah ahVar = C25227ah.f66553a;
                    C7573i.m23582a((Object) bVar, "it");
                    int ak = bVar.mo71905ak();
                    C28198z W = bVar.mo71886W();
                    C7573i.m23582a((Object) W, "it.adapter");
                    if (ahVar.mo65842a(ak, new ArrayList(W.mo71593b()))) {
                        C25227ah.m82945d();
                        C25227ah.f66553a.mo65843c();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ah$b */
    public static final class C25229b implements C24538a {

        /* renamed from: a */
        final /* synthetic */ List f66562a;

        /* renamed from: b */
        final /* synthetic */ Map f66563b;

        /* renamed from: c */
        final /* synthetic */ int f66564c;

        /* renamed from: d */
        final /* synthetic */ long f66565d;

        /* renamed from: e */
        final /* synthetic */ int f66566e;

        /* renamed from: f */
        final /* synthetic */ List f66567f;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ah$b$a */
        static final class C25230a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C25229b f66568a;

            /* renamed from: b */
            final /* synthetic */ List f66569b;

            C25230a(C25229b bVar, List list) {
                this.f66568a = bVar;
                this.f66569b = list;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m82956a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m82956a() {
                C28598b bVar;
                WeakReference a = C25227ah.f66555c;
                if (a != null) {
                    bVar = (C28598b) a.get();
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    if (this.f66568a.f66566e == bVar.mo71905ak()) {
                        C28198z W = bVar.mo71886W();
                        C7573i.m23582a((Object) W, "panel.adapter");
                        List b = W.mo71593b();
                        C7573i.m23582a((Object) b, "panel.adapter.items");
                        while (b.size() > this.f66568a.f66564c) {
                            b.remove(b.size() - 1);
                        }
                        for (Aweme add : this.f66569b) {
                            b.add(add);
                        }
                        bVar.mo71886W().notifyDataSetChanged();
                        String str = "success";
                        String str2 = "";
                        Iterable<Aweme> iterable = this.f66568a.f66567f;
                        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                        for (Aweme aid : iterable) {
                            arrayList.add(aid.getAid());
                        }
                        String obj = ((List) arrayList).toString();
                        Iterable<Aweme> iterable2 = b;
                        Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable2, 10));
                        for (Aweme aid2 : iterable2) {
                            arrayList2.add(aid2.getAid());
                        }
                        C25232ai.m82957a(str, str2, obj, ((List) arrayList2).toString());
                        return;
                    }
                    String str3 = "fail";
                    String str4 = "current_item_changed";
                    Iterable<Aweme> iterable3 = this.f66568a.f66567f;
                    Collection arrayList3 = new ArrayList(C7525m.m23469a(iterable3, 10));
                    for (Aweme aid3 : iterable3) {
                        arrayList3.add(aid3.getAid());
                    }
                    C25232ai.m82957a(str3, str4, ((List) arrayList3).toString(), null);
                }
            }
        }

        /* renamed from: a */
        public final void mo64341a(String str) {
            C7573i.m23587b(str, "msg");
            String str2 = "fail";
            Iterable<Aweme> iterable = this.f66567f;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (Aweme aid : iterable) {
                arrayList.add(aid.getAid());
            }
            C25232ai.m82957a(str2, str, ((List) arrayList).toString(), null);
        }

        /* renamed from: a */
        public final void mo64343a(List<AwemeAdRank> list) {
            C7573i.m23587b(list, "awemeAdRankList");
            List<Aweme> d = C7525m.m23509d((Collection<? extends T>) this.f66562a);
            Iterable<AwemeAdRank> iterable = list;
            for (AwemeAdRank awemeAdRank : iterable) {
                Aweme repackAweme = awemeAdRank.getRepackAweme();
                if (repackAweme != null && repackAweme.isAd()) {
                    C25227ah.m82941a(awemeAdRank.getRepackAweme());
                }
            }
            Collection arrayList = new ArrayList();
            for (AwemeAdRank awemeAdRank2 : iterable) {
                Aweme repackAweme2 = awemeAdRank2.getRepackAweme();
                if (repackAweme2 == null) {
                    repackAweme2 = (Aweme) this.f66563b.get(awemeAdRank2.getAwemeId());
                }
                if (repackAweme2 != null) {
                    arrayList.add(repackAweme2);
                }
            }
            List list2 = (List) arrayList;
            int i = 0;
            for (Object next : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                Aweme aweme = (Aweme) next;
                aweme.awemePosition = this.f66564c + i;
                aweme.setFeedCount(this.f66565d);
                if (aweme.isAd()) {
                    d.remove(aweme);
                }
                i = i2;
            }
            for (Aweme b : d) {
                C25227ah.m82944b(b);
            }
            C24671f.m80864n().mo64727a(list2);
            C25233aj.m82958a((C7561a<C7581n>) new C25230a<C7581n>(this, list2));
        }

        /* renamed from: a */
        public final void mo64342a(String str, Exception exc) {
            String str2;
            C7573i.m23587b(str, "msg");
            String str3 = "fail";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(' ');
            if (exc != null) {
                str2 = exc.getMessage();
            } else {
                str2 = null;
            }
            sb.append(str2);
            String sb2 = sb.toString();
            Iterable<Aweme> iterable = this.f66567f;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (Aweme aid : iterable) {
                arrayList.add(aid.getAid());
            }
            C25232ai.m82957a(str3, sb2, ((List) arrayList).toString(), null);
        }

        C25229b(List list, Map map, int i, long j, int i2, List list2) {
            this.f66562a = list;
            this.f66563b = map;
            this.f66564c = i;
            this.f66565d = j;
            this.f66566e = i2;
            this.f66567f = list2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ah$c */
    public static final class C25231c extends TimerTask {
        C25231c() {
        }

        public final void run() {
            WeakReference a = C25227ah.f66555c;
            if (a != null) {
                C28598b bVar = (C28598b) a.get();
                if (bVar != null) {
                    C25227ah ahVar = C25227ah.f66553a;
                    C7573i.m23582a((Object) bVar, "it");
                    int ak = bVar.mo71905ak();
                    C28198z W = bVar.mo71886W();
                    C7573i.m23582a((Object) W, "it.adapter");
                    ahVar.mo65842a(ak, new ArrayList(W.mo71593b()));
                }
            }
        }
    }

    private C25227ah() {
    }

    /* renamed from: a */
    public static AwemeAdRankAbModel m82939a() {
        return AwemeAdRankAb.get();
    }

    /* renamed from: f */
    private static AwemeAdRankSettingsModel m82946f() {
        return AwemeAdRankSettings.get();
    }

    /* renamed from: d */
    public static void m82945d() {
        Timer timer = f66554b;
        if (timer != null) {
            timer.cancel();
        }
        f66554b = null;
    }

    /* renamed from: e */
    public final void mo65844e() {
        if (m82947g() && f66560h) {
            m82945d();
        }
    }

    /* renamed from: b */
    public static long m82943b() {
        if (f66559g != 0) {
            return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - f66559g);
        }
        return 0;
    }

    /* renamed from: g */
    private final boolean m82947g() {
        if (!m82946f().getEnabled() || !m82939a().getEnabled()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo65843c() {
        long millis = TimeUnit.SECONDS.toMillis(m82939a().getRequestPeriod());
        f66554b = new Timer();
        C25231c cVar = new C25231c();
        Timer timer = f66554b;
        if (timer != null) {
            timer.schedule(cVar, millis, millis);
        }
    }

    /* renamed from: b */
    public static void m82944b(Aweme aweme) {
        C24976t.m82146b(C6399b.m19921a(), aweme);
    }

    /* renamed from: a */
    public static void m82941a(Aweme aweme) {
        C24976t.m82234i(C6399b.m19921a(), aweme);
    }

    /* renamed from: a */
    private static boolean m82942a(Object obj) {
        if (!(obj instanceof C28598b)) {
            return false;
        }
        f66555c = new WeakReference<>(obj);
        return true;
    }

    /* renamed from: a */
    public final boolean mo65842a(int i, List<? extends Aweme> list) {
        boolean z;
        boolean z2;
        int i2 = i;
        List<? extends Aweme> list2 = list;
        C7573i.m23587b(list2, "items");
        if (i2 == f66556d || i2 < f66557e || f66558f.contains(Integer.valueOf(i)) || (list.size() - i2) - 1 <= 2) {
            return false;
        }
        long b = C25344d.m83280b();
        if (C25233aj.m82959a((Aweme) list2.get(i2 + 1)) || C25233aj.m82959a((Aweme) list2.get(i2 + 2)) || b < m82939a().getVisitAdMaxInterval() - 1) {
            z = false;
        } else {
            z = true;
        }
        int i3 = i2 + 2;
        if (!C25233aj.m82959a((Aweme) list2.get(i3)) || b > m82939a().getVisitAdMinInterval() + 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            f66556d = i2;
            f66558f.add(Integer.valueOf(i));
            f66559g = System.currentTimeMillis();
            int size = list.size() - 1;
            long feedCount = ((Aweme) list2.get(i3)).getFeedCount();
            Iterable<Aweme> iterable = list2;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (Aweme aweme : iterable) {
                arrayList.add(C7579l.m23633a(aweme.getAid(), aweme));
            }
            Map a = C7507ae.m23388a((Iterable<? extends Pair<? extends K, ? extends V>>) (List) arrayList);
            Iterable cVar = new C7549c(i3, size);
            Collection arrayList2 = new ArrayList(C7525m.m23469a(cVar, 10));
            Iterator it = cVar.iterator();
            while (it.hasNext()) {
                arrayList2.add((Aweme) list2.get(((C7506ac) it).mo19392a()));
            }
            List list3 = (List) arrayList2;
            Iterable iterable2 = list3;
            Collection arrayList3 = new ArrayList();
            for (Object next : iterable2) {
                if (((Aweme) next).isAd()) {
                    arrayList3.add(next);
                }
            }
            List list4 = (List) arrayList3;
            AwemeAdRankApi awemeAdRankApi = AwemeAdRankApi.f64773a;
            C25229b bVar = new C25229b(list4, a, i3, feedCount, i, list);
            awemeAdRankApi.mo64339a(list3, b, (C24538a) bVar);
            return true;
        }
        StringBuilder sb = new StringBuilder("condition not satisfied: tooLongToSeeAds=");
        sb.append(false);
        sb.append(", tooShortToSeeAds=false");
        return false;
    }

    /* renamed from: a */
    public final void mo65841a(Object obj, int i, Aweme aweme) {
        C7573i.m23587b(obj, "fragmentPanel");
        f66557e = Math.max(f66557e, i);
        if (m82947g()) {
            if (!f66560h) {
                boolean a = m82942a(obj);
                f66560h = a;
                if (a) {
                    mo65843c();
                } else {
                    return;
                }
            }
            C25233aj.m82960b(C25228a.f66561a);
        }
    }
}
