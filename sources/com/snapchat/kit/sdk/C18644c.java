package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.google.gson.C6600e;
import com.snapchat.kit.sdk.core.controller.C18647a;
import com.snapchat.kit.sdk.core.controller.C18652b;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.metrics.C18653a;
import com.snapchat.kit.sdk.core.metrics.C18679e;
import com.snapchat.kit.sdk.core.metrics.C18680f;
import com.snapchat.kit.sdk.core.metrics.C18681g;
import com.snapchat.kit.sdk.core.metrics.C18682h;
import com.snapchat.kit.sdk.core.metrics.C18683i;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.business.C18668a;
import com.snapchat.kit.sdk.core.metrics.business.C18670b;
import com.snapchat.kit.sdk.core.metrics.business.C18671c;
import com.snapchat.kit.sdk.core.metrics.business.C18672d;
import com.snapchat.kit.sdk.core.metrics.business.C18673e;
import com.snapchat.kit.sdk.core.metrics.business.C18674f;
import com.snapchat.kit.sdk.core.metrics.business.C18675g;
import com.snapchat.kit.sdk.core.metrics.business.C18676h;
import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.p806a.C18661a;
import com.snapchat.kit.sdk.core.metrics.p806a.C18663b;
import com.snapchat.kit.sdk.core.metrics.p807b.C18665a;
import com.snapchat.kit.sdk.core.metrics.p807b.C18667b;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.C18684a;
import com.snapchat.kit.sdk.core.networking.C18686c;
import com.snapchat.kit.sdk.core.networking.C18687d;
import com.snapchat.kit.sdk.core.networking.C18688e;
import com.snapchat.kit.sdk.core.networking.C18690f;
import com.snapchat.kit.sdk.core.networking.ClientFactory;
import com.snapchat.kit.sdk.core.security.C18694c;
import com.snapchat.kit.sdk.core.security.C18701h;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import dagger.p1859a.C47371b;
import dagger.p1859a.C47372c;
import dagger.p1859a.C47375f;
import java.util.concurrent.ScheduledExecutorService;
import javax.p1876a.C47883a;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* renamed from: com.snapchat.kit.sdk.c */
public final class C18644c implements SnapKitComponent {

    /* renamed from: a */
    private C47883a<Context> f50376a;

    /* renamed from: b */
    private C47883a<C6600e> f50377b;

    /* renamed from: c */
    private C47883a<SharedPreferences> f50378c;

    /* renamed from: d */
    private C47883a<C18701h> f50379d;

    /* renamed from: e */
    private C47883a<Handler> f50380e;

    /* renamed from: f */
    private C47883a<C18647a> f50381f;

    /* renamed from: g */
    private C47883a<OkHttpClient> f50382g;

    /* renamed from: h */
    private C47883a<C18676h> f50383h;

    /* renamed from: i */
    private C47883a<Cache> f50384i;

    /* renamed from: j */
    private C47883a<String> f50385j;

    /* renamed from: k */
    private C47883a<C18688e> f50386k;

    /* renamed from: l */
    private C47883a<Fingerprint> f50387l;

    /* renamed from: m */
    private C47883a<C18686c> f50388m;

    /* renamed from: n */
    private C47883a<ClientFactory> f50389n;

    /* renamed from: o */
    private C47883a<MetricsClient> f50390o;

    /* renamed from: p */
    private C47883a<C18665a> f50391p;

    /* renamed from: q */
    private C47883a<C18668a> f50392q;

    /* renamed from: r */
    private C47883a<ScheduledExecutorService> f50393r;

    /* renamed from: s */
    private C47883a<C18653a<ServerEvent>> f50394s;

    /* renamed from: t */
    private C47883a<C18671c> f50395t;

    /* renamed from: u */
    private C47883a<KitEventBaseFactory> f50396u;

    /* renamed from: v */
    private C47883a<C18673e> f50397v;

    /* renamed from: w */
    private C47883a<C18661a> f50398w;

    /* renamed from: x */
    private C47883a<MetricQueue<OpMetric>> f50399x;

    /* renamed from: y */
    private C47883a<OAuth2Manager> f50400y;

    /* renamed from: z */
    private C18713e f50401z;

    /* renamed from: com.snapchat.kit.sdk.c$a */
    public static final class C18646a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C18713e f50402a;

        private C18646a() {
        }

        /* renamed from: a */
        public final SnapKitComponent mo48879a() {
            if (this.f50402a != null) {
                return new C18644c(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C18713e.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        public final C18646a mo48880a(C18713e eVar) {
            this.f50402a = (C18713e) C47375f.m147939a(eVar);
            return this;
        }
    }

    /* renamed from: a */
    public static C18646a m61151a() {
        return new C18646a();
    }

    public final MetricQueue<ServerEvent> analyticsEventQueue() {
        return (MetricQueue) this.f50395t.get();
    }

    public final ClientFactory apiFactory() {
        return (ClientFactory) this.f50389n.get();
    }

    public final String clientId() {
        return (String) C47375f.m147940a(this.f50401z.f50534b, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final Context context() {
        return (Context) this.f50376a.get();
    }

    public final C6600e gson() {
        return (C6600e) this.f50377b.get();
    }

    public final KitEventBaseFactory kitEventBaseFactory() {
        return C18675g.m61206a(clientId());
    }

    public final MetricQueue<OpMetric> operationalMetricsQueue() {
        return (MetricQueue) this.f50399x.get();
    }

    public final String redirectUrl() {
        return (String) C47375f.m147940a(this.f50401z.f50535c, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final SharedPreferences sharedPreferences() {
        return (SharedPreferences) this.f50378c.get();
    }

    public final AuthTokenManager authTokenManager() {
        return (AuthTokenManager) C47375f.m147940a(C18713e.m61277a((OAuth2Manager) this.f50400y.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final LoginStateController logoutController() {
        return (LoginStateController) C47375f.m147940a(C18713e.m61276a((C18647a) this.f50381f.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final void inject(SnapKitActivity snapKitActivity) {
        m61150a(snapKitActivity);
    }

    private C18644c(C18646a aVar) {
        m61152a(aVar);
    }

    /* renamed from: a */
    private SnapKitActivity m61150a(SnapKitActivity snapKitActivity) {
        C18712d.m61274a(snapKitActivity, (OAuth2Manager) this.f50400y.get());
        return snapKitActivity;
    }

    /* renamed from: a */
    private void m61152a(C18646a aVar) {
        this.f50376a = C47372c.m147937a(C18716h.m61289a(aVar.f50402a));
        this.f50377b = C47372c.m147937a(C18717i.m61291a(aVar.f50402a));
        this.f50378c = C47372c.m147937a(C18721m.m61299a(aVar.f50402a));
        this.f50379d = C47372c.m147937a(C18720l.m61297a(aVar.f50402a, this.f50377b, this.f50378c));
        this.f50380e = C18722n.m61301a(aVar.f50402a);
        this.f50381f = C47372c.m147937a(C18652b.m61165a(this.f50380e));
        this.f50382g = C47372c.m147937a(C18719k.m61294a(aVar.f50402a));
        this.f50383h = C18683i.m61225a(this.f50378c);
        this.f50384i = C47372c.m147937a(C18714f.m61284a(aVar.f50402a));
        this.f50400y = new C47371b();
        this.f50385j = C18715g.m61286a(aVar.f50402a);
        this.f50386k = C47372c.m147937a(C18690f.m61238a(this.f50400y, this.f50381f, this.f50385j));
        this.f50387l = C18694c.m61245a(this.f50376a);
        this.f50388m = C18687d.m61231a(this.f50400y, this.f50381f, this.f50385j, this.f50387l);
        this.f50389n = C47372c.m147937a(C18684a.m61228a(this.f50384i, this.f50377b, this.f50386k, this.f50388m));
        this.f50390o = C47372c.m147937a(C18680f.m61219a(this.f50389n));
        this.f50391p = C18667b.m61189a(this.f50377b);
        this.f50392q = C47372c.m147937a(C18670b.m61195a(this.f50378c, this.f50383h, this.f50390o, this.f50391p));
        this.f50393r = C47372c.m147937a(C18682h.m61222a());
        this.f50394s = C18679e.m61217a(this.f50392q, this.f50393r);
        this.f50395t = C47372c.m147937a(C18672d.m61198a(this.f50383h, this.f50394s));
        this.f50396u = C18675g.m61207a(this.f50385j);
        this.f50397v = C18674f.m61204a(this.f50396u);
        this.f50398w = C47372c.m147937a(C18663b.m61182a(this.f50378c, this.f50390o, this.f50391p));
        this.f50399x = C47372c.m147937a(C18681g.m61221a(this.f50398w, this.f50393r));
        C47371b bVar = (C47371b) this.f50400y;
        this.f50400y = C47372c.m147937a(C18718j.m61293a(aVar.f50402a, this.f50379d, this.f50381f, this.f50382g, this.f50377b, this.f50395t, this.f50397v, this.f50399x));
        bVar.mo119461a(this.f50400y);
        this.f50401z = aVar.f50402a;
    }
}
