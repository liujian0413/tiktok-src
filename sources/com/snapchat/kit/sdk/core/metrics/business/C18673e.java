package com.snapchat.kit.sdk.core.metrics.business;

import com.bytedance.sysoptimizer.BuildConfig;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.Builder;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.e */
public final class C18673e {

    /* renamed from: a */
    private final KitEventBaseFactory f50458a;

    /* renamed from: b */
    private LoginKitEventBase m61200b() {
        return new Builder().kit_event_base(this.f50458a.createKitEventBase(KitType.LOGIN_KIT, BuildConfig.VERSION_NAME)).build();
    }

    /* renamed from: a */
    public final ServerEvent mo48921a() {
        return m61199a(new ServerEventData.Builder().login_kit_auth_start(new LoginKitAuthStart.Builder().log_kit_event_base(m61200b()).build()).build());
    }

    C18673e(KitEventBaseFactory kitEventBaseFactory) {
        this.f50458a = kitEventBaseFactory;
    }

    /* renamed from: a */
    private static ServerEvent m61199a(ServerEventData serverEventData) {
        return new ServerEvent.Builder().event_data(serverEventData).build();
    }

    /* renamed from: a */
    public final ServerEvent mo48922a(boolean z) {
        return m61199a(new ServerEventData.Builder().login_kit_auth_complete(new LoginKitAuthComplete.Builder().log_kit_event_base(m61200b()).is_success(Boolean.valueOf(z)).build()).build());
    }
}
