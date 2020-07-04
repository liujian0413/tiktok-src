package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.feed.experiment.NearbySelectDistanceExperiment;
import com.p280ss.android.ugc.aweme.feed.model.nearby.NearbyDistance;
import com.p280ss.android.ugc.aweme.feed.model.nearby.NearbyDistanceSettings;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.j.w */
public final class C28508w {

    /* renamed from: a */
    public static final C28508w f75132a = new C28508w();

    private C28508w() {
    }

    /* renamed from: b */
    private static Keva m93713b() {
        Keva repo = Keva.getRepo("nearby");
        C7573i.m23582a((Object) repo, "Keva.getRepo(NEARBY_SP_NAME)");
        return repo;
    }

    /* renamed from: a */
    public static final int m93711a() {
        NearbyDistance nearbyDistance;
        int i = 0;
        if (C6384b.m19835a().mo15287a(NearbySelectDistanceExperiment.class, true, "is_select_distance", C6384b.m19835a().mo15295d().is_select_distance, 0) == 0) {
            return 0;
        }
        try {
            nearbyDistance = (NearbyDistance) C10292j.m30480a().mo25014a(NearbyDistanceSettings.class, "nearby_distance", C6384b.m19835a().mo15294c().getNearbyDistance(), "com.ss.android.ugc.aweme.feed.model.nearby.NearbyDistance", NearbyDistance.class);
            if (nearbyDistance == null) {
            }
        } catch (Throwable unused) {
        } finally {
            new NearbyDistance();
        }
        int a = m93712a(nearbyDistance.maxDistance);
        if (a < nearbyDistance.maxDistance) {
            if (a < nearbyDistance.minDistance) {
                i = nearbyDistance.minDistance;
            } else {
                i = a;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static int m93712a(int i) {
        return m93713b().getInt("nearby_distance", i);
    }
}
