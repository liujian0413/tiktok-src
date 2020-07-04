package com.p280ss.android.ugc.aweme.feed.model.nearby;

import android.support.annotation.Keep;
import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7571f;

@Keep
/* renamed from: com.ss.android.ugc.aweme.feed.model.nearby.NearbyDistance */
public final class NearbyDistance {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_MAX_DISTANCE = 100;
    @C6593c(mo15949a = "max")
    public int maxDistance = 100;
    @C6593c(mo15949a = "min")
    public int minDistance = 2;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.nearby.NearbyDistance$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }
}
