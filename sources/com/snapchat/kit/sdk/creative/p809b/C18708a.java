package com.snapchat.kit.sdk.creative.p809b;

import com.bytedance.sysoptimizer.BuildConfig;
import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.CreativeKitEventBase.Builder;
import com.snapchat.kit.sdk.core.metrics.model.CreativeKitShareStart;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;

/* renamed from: com.snapchat.kit.sdk.creative.b.a */
public final class C18708a {

    /* renamed from: a */
    private final KitEventBaseFactory f50512a;

    /* renamed from: b */
    private CreativeKitEventBase m61265b() {
        return new Builder().kit_event_base(this.f50512a.createKitEventBase(KitType.CREATIVE_KIT, BuildConfig.VERSION_NAME)).build();
    }

    /* renamed from: a */
    public final ServerEvent mo49199a() {
        return m61264a(new ServerEventData.Builder().creative_kit_share_start(new CreativeKitShareStart.Builder().creative_kit_event_base(m61265b()).build()).build());
    }

    C18708a(KitEventBaseFactory kitEventBaseFactory) {
        this.f50512a = kitEventBaseFactory;
    }

    /* renamed from: a */
    private static ServerEvent m61264a(ServerEventData serverEventData) {
        return new ServerEvent.Builder().event_data(serverEventData).build();
    }
}
