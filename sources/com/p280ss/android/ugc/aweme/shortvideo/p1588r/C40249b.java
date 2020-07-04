package com.p280ss.android.ugc.aweme.shortvideo.p1588r;

import com.google.common.base.C17427g;
import com.p280ss.android.ugc.aweme.location.model.AVLocationBundle;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.poi.utils.C35440a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.r.b */
public final class C40249b implements C17427g<LocationBundle, AVLocationBundle> {
    /* renamed from: b */
    public final /* synthetic */ Object mo44914b(Object obj) {
        return m128596a((LocationBundle) obj);
    }

    /* renamed from: a */
    public static AVLocationBundle m128596a(LocationBundle locationBundle) {
        if (locationBundle == null) {
            return null;
        }
        double[] c = C35440a.m114455c(locationBundle.longitude, locationBundle.latitude);
        AVLocationBundle aVLocationBundle = new AVLocationBundle(c[1], c[0], locationBundle.time, locationBundle.accuracy);
        return aVLocationBundle;
    }
}
