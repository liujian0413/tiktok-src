package com.p280ss.android.ugc.aweme.settings;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.settings.VendorBackUrlKey */
public final class VendorBackUrlKey {
    @C6382b
    private static final String DEFAULT = "";
    public static final VendorBackUrlKey INSTANCE = new VendorBackUrlKey();

    private VendorBackUrlKey() {
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
