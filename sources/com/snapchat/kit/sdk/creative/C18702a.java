package com.snapchat.kit.sdk.creative;

import android.content.Context;
import com.snapchat.kit.sdk.SnapKitComponent;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi;
import com.snapchat.kit.sdk.creative.api.SnapCreativeKitApi_Factory;
import com.snapchat.kit.sdk.creative.media.SnapMediaFactory;
import com.snapchat.kit.sdk.creative.media.SnapMediaFactory_Factory;
import com.snapchat.kit.sdk.creative.p809b.C18708a;
import com.snapchat.kit.sdk.creative.p809b.C18709b;
import com.snapchat.kit.sdk.creative.p809b.C18710c;
import com.snapchat.kit.sdk.creative.p809b.C18711d;
import dagger.p1859a.C47372c;
import dagger.p1859a.C47375f;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.creative.a */
public final class C18702a implements CreativeComponent {

    /* renamed from: a */
    private SnapKitComponent f50505a;

    /* renamed from: b */
    private C47883a<MetricQueue<OpMetric>> f50506b;

    /* renamed from: c */
    private C47883a<C18710c> f50507c;

    /* renamed from: com.snapchat.kit.sdk.creative.a$a */
    public static final class C18704a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public SnapKitComponent f50508a;

        private C18704a() {
        }

        /* renamed from: a */
        public final CreativeComponent mo49192a() {
            if (this.f50508a != null) {
                return new C18702a(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(SnapKitComponent.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        public final C18704a mo49193a(SnapKitComponent snapKitComponent) {
            this.f50508a = (SnapKitComponent) C47375f.m147939a(snapKitComponent);
            return this;
        }
    }

    /* renamed from: com.snapchat.kit.sdk.creative.a$b */
    static class C18705b implements C47883a<MetricQueue<OpMetric>> {

        /* renamed from: a */
        private final SnapKitComponent f50509a;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MetricQueue<OpMetric> get() {
            return (MetricQueue) C47375f.m147940a(this.f50509a.operationalMetricsQueue(), "Cannot return null from a non-@Nullable component method");
        }

        C18705b(SnapKitComponent snapKitComponent) {
            this.f50509a = snapKitComponent;
        }
    }

    /* renamed from: a */
    public static C18704a m61255a() {
        return new C18704a();
    }

    public final SnapMediaFactory getMediaFactory() {
        return SnapMediaFactory_Factory.newSnapMediaFactory((C18710c) this.f50507c.get());
    }

    /* renamed from: b */
    private C18708a m61257b() {
        return C18709b.m61268a((KitEventBaseFactory) C47375f.m147940a(this.f50505a.kitEventBaseFactory(), "Cannot return null from a non-@Nullable component method"));
    }

    public final SnapCreativeKitApi getApi() {
        return SnapCreativeKitApi_Factory.newSnapCreativeKitApi((Context) C47375f.m147940a(this.f50505a.context(), "Cannot return null from a non-@Nullable component method"), (String) C47375f.m147940a(this.f50505a.clientId(), "Cannot return null from a non-@Nullable component method"), (String) C47375f.m147940a(this.f50505a.redirectUrl(), "Cannot return null from a non-@Nullable component method"), (C18710c) this.f50507c.get(), (MetricQueue) C47375f.m147940a(this.f50505a.analyticsEventQueue(), "Cannot return null from a non-@Nullable component method"), m61257b());
    }

    private C18702a(C18704a aVar) {
        m61256a(aVar);
    }

    /* renamed from: a */
    private void m61256a(C18704a aVar) {
        this.f50505a = aVar.f50508a;
        this.f50506b = new C18705b(aVar.f50508a);
        this.f50507c = C47372c.m147937a(C18711d.m61273a(this.f50506b));
    }
}
