package com.snapchat.kit.sdk.core.metrics.business;

import com.snapchat.kit.sdk.core.metrics.model.KitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.KitEventBase.Builder;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.networking.C18685b;
import java.util.Locale;

public class KitEventBaseFactory {

    /* renamed from: a */
    private final String f50443a;

    /* renamed from: a */
    private static String m61190a() {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return "";
        }
        return locale.toString();
    }

    KitEventBaseFactory(String str) {
        this.f50443a = str;
    }

    public KitEventBase createKitEventBase(KitType kitType, String str) {
        return new Builder().kit_variant(kitType).kit_variant_version(str).oauth_client_id(this.f50443a).kit_user_agent(C18685b.f50478a).locale(m61190a()).kit_client_timestamp_millis(Long.valueOf(System.currentTimeMillis())).build();
    }
}
