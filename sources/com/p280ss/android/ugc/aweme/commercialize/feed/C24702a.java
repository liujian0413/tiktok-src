package com.p280ss.android.ugc.aweme.commercialize.feed;

import android.arch.persistence.room.C0160e;
import android.content.Context;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p854d.C19294c;
import com.p280ss.android.ugc.aweme.antiaddic.p1010a.C22555a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.commercialize.dao.C24615a;
import com.p280ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25054b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.IFeedItemList;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.a */
public class C24702a implements C24714ah {

    /* renamed from: b */
    private static final String f65148b = "a";

    /* renamed from: e */
    private static volatile C24702a f65149e;

    /* renamed from: f */
    private static C19294c<ShowAdDataBase> f65150f = new C19294c<ShowAdDataBase>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo29755a() {
            return m81044c();
        }

        /* renamed from: c */
        private static ShowAdDataBase m81044c() {
            return (ShowAdDataBase) C0160e.m441a(C6399b.m19921a(), ShowAdDataBase.class, "showAd.db").mo318a().mo322c();
        }
    };

    /* renamed from: a */
    private C22555a f65151a = new C22555a(0) {
        /* renamed from: a */
        public final C22903bl<Long> mo59195a() {
            return SharePrefCache.inst().getLastFilterTime();
        }
    };

    /* renamed from: c */
    private IFeedItemList f65152c;

    /* renamed from: d */
    private List<String> f65153d = new ArrayList();

    /* renamed from: c */
    private static void m81039c() {
        C1592h.m7855a(C24721c.f65163a, (Executor) C1592h.f5957a);
    }

    private C24702a() {
    }

    /* renamed from: a */
    public static C24702a m81035a() {
        if (f65149e == null) {
            synchronized (C7213d.class) {
                if (f65149e == null) {
                    f65149e = new C24702a();
                }
            }
        }
        return f65149e;
    }

    /* renamed from: b */
    static final /* synthetic */ Object m81037b() throws Exception {
        try {
            ShowAdDataBase showAdDataBase = (ShowAdDataBase) f65150f.mo51193b();
            if (showAdDataBase != null) {
                showAdDataBase.mo64464h().mo64468a();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: c */
    private static void m81040c(String str) {
        C1592h.m7855a((Callable<TResult>) new C24720b<TResult>(str), (Executor) C1592h.f5957a);
    }

    /* renamed from: a */
    private boolean m81036a(Aweme aweme) {
        if (!C6399b.m19944t() || !aweme.isAd()) {
            return false;
        }
        String aid = aweme.getAid();
        if (TextUtils.isEmpty(aid) || aweme.getAwemeRawAd().isDiableAdShowFilter()) {
            return false;
        }
        if (this.f65153d.contains(aid)) {
            return true;
        }
        return m81041d(aid);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object m81038b(java.lang.String r2) throws java.lang.Exception {
        /*
            com.ss.android.d.c<com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase> r0 = f65150f     // Catch:{  }
            java.lang.Object r0 = r0.mo51193b()     // Catch:{  }
            com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase r0 = (com.p280ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase) r0     // Catch:{  }
            if (r0 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.commercialize.dao.b r0 = r0.mo64464h()     // Catch:{  }
            com.ss.android.ugc.aweme.commercialize.dao.a r1 = new com.ss.android.ugc.aweme.commercialize.dao.a     // Catch:{ Exception -> 0x0016 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0016 }
            r0.mo64469a(r1)     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.feed.C24702a.m81038b(java.lang.String):java.lang.Object");
    }

    /* renamed from: d */
    private static boolean m81041d(String str) {
        try {
            ShowAdDataBase showAdDataBase = (ShowAdDataBase) f65150f.mo51193b();
            if (showAdDataBase != null) {
                List a = showAdDataBase.mo64464h().mo64467a(str);
                if (C6307b.m19566a((Collection<T>) a)) {
                    return false;
                }
                return a.contains(new C24615a(str));
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final void mo64649a(String str) {
        if (!this.f65153d.contains(str)) {
            this.f65153d.add(str);
        }
        m81040c(str);
    }

    /* renamed from: a */
    public final void mo64648a(IFeedItemList iFeedItemList) {
        int i;
        if (C6399b.m19944t() && iFeedItemList != null && !C6307b.m19566a((Collection<T>) iFeedItemList.getItems())) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f65151a.mo59197b(currentTimeMillis)) {
                    this.f65153d.clear();
                    m81039c();
                }
                this.f65151a.mo59196a(currentTimeMillis);
                Iterator it = iFeedItemList.getItems().iterator();
                Context a = C6399b.m19921a();
                while (it.hasNext()) {
                    Aweme aweme = (Aweme) it.next();
                    if (aweme != null && aweme.isAd()) {
                        if (m81036a(aweme)) {
                            it.remove();
                            if (C25352e.m83200B(aweme)) {
                                C24976t.m82057a(a, aweme, C25054b.m82490a().mo65549a("8", (String) null));
                            }
                            C24976t.m82045a(a, aweme, 1);
                        } else if (this.f65152c != null && !aweme.getAwemeRawAd().isDiableAdShowFilter()) {
                            String aid = aweme.getAid();
                            for (Aweme aweme2 : this.f65152c.getItems()) {
                                if (aweme2 != null && TextUtils.equals(aid, aweme2.getAid())) {
                                    it.remove();
                                    if (C25352e.m83200B(aweme)) {
                                        C24976t.m82057a(a, aweme, C25054b.m82490a().mo65549a("8", (String) null));
                                    }
                                    if (aweme2.isAd()) {
                                        i = 1;
                                    } else {
                                        i = 2;
                                    }
                                    C24976t.m82045a(a, aweme, i);
                                }
                            }
                        }
                    }
                }
                this.f65152c = iFeedItemList;
            } catch (Exception unused) {
            }
        }
    }
}
