package com.p280ss.android.ugc.aweme.feed.model.nearby;

import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.model.nearby.NearbyDistanceSettings */
public final class NearbyDistanceSettings {
    public static final NearbyDistanceSettings INSTANCE = new NearbyDistanceSettings();
    @C6382b
    private static final NearbyDistance NEARBY_DISTANCE = null;

    private NearbyDistanceSettings() {
    }

    public final NearbyDistance getNEARBY_DISTANCE() {
        return NEARBY_DISTANCE;
    }
}
