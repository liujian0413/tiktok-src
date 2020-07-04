package com.p280ss.android.ugc.aweme.bullet.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ies.bullet.base.C10299a;
import com.bytedance.ies.bullet.base.C10299a.C10300a;
import com.bytedance.ies.bullet.base.C10316c;
import com.bytedance.ies.bullet.base.C10317d;
import com.bytedance.ies.bullet.core.C10331b.C10333b;
import com.bytedance.ies.bullet.core.common.C10348b;
import com.bytedance.ies.bullet.core.kit.C10382g;
import com.bytedance.ies.bullet.core.monitor.C10425c;
import com.bytedance.ies.bullet.core.p539b.C10334a;
import com.bytedance.ies.bullet.p551ui.common.C10689d;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10680b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p280ss.android.ugc.aweme.bullet.p1075b.C23564a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService */
public final class BulletService implements IBulletService {
    static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BulletService.class), "coreProvider", "getCoreProvider()Lcom/bytedance/ies/bullet/core/IBulletCore$IBulletCoreProvider;"))};
    public final C10300a builder;
    private final C7541d coreProvider$delegate = C7546e.m23569a(new C23615a(this));

    /* renamed from: com.ss.android.ugc.aweme.bullet.impl.BulletService$a */
    static final class C23615a extends Lambda implements C7561a<C10299a> {

        /* renamed from: a */
        final /* synthetic */ BulletService f62284a;

        C23615a(BulletService bulletService) {
            this.f62284a = bulletService;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C10299a invoke() {
            return this.f62284a.builder.mo25034a();
        }
    }

    private final C10333b getCoreProvider() {
        return (C10333b) this.coreProvider$delegate.getValue();
    }

    public final C10333b getBulletCoreProvider() {
        return getCoreProvider();
    }

    public BulletService() {
        C10300a aVar = new C10300a();
        String serverDeviceId = TeaAgent.getServerDeviceId();
        C7573i.m23582a((Object) serverDeviceId, "TeaAgent.getServerDeviceId()");
        aVar.mo25031a(new C10348b(serverDeviceId, C6399b.m19934j()));
        this.builder = aVar;
    }

    public final void registerDefaultPackageBundle(C10317d dVar) {
        C7573i.m23587b(dVar, "wrapper");
        this.builder.mo25029a(dVar);
    }

    public final void registerGlobalSettingsBundle(C10316c cVar) {
        C7573i.m23587b(cVar, "globalSettingsBundle");
        this.builder.mo25028a(cVar);
    }

    public final void setApplication(Application application) {
        C7573i.m23587b(application, "application");
        this.builder.mo25027a(application);
    }

    public final void setReporter(C10425c cVar) {
        C7573i.m23587b(cVar, "reporter");
        this.builder.mo25032a(cVar);
    }

    public final void setResourceLoader(C10334a aVar) {
        C7573i.m23587b(aVar, "resourceLoader");
        this.builder.mo25030a(aVar);
    }

    public final Activity getActivityById(String str) {
        C7573i.m23587b(str, "reactId");
        C10382g a = getCoreProvider().mo25026a().mo25068a(str);
        if (a != null) {
            if (!(a instanceof C10680b)) {
                a = null;
            }
            C10680b bVar = (C10680b) a;
            if (bVar != null) {
                C10689d v = bVar.mo25556v();
                if (v != null) {
                    return v.mo25551a();
                }
            }
        }
        return null;
    }

    public final void registerPackageBundle(String str, C10317d dVar) {
        C7573i.m23587b(str, "name");
        C7573i.m23587b(dVar, "wrapper");
        this.builder.mo25033a(str, dVar);
    }

    public final void open(Context context, Class<?> cls, String str, String str2, Bundle bundle) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(cls, "clazz");
        C7573i.m23587b(str, "schema");
        Intent intent = new Intent(context, cls);
        intent.setData(C23564a.m77366a(str, str2));
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
