package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.AwemeAdRankAbModel */
public final class AwemeAdRankAbModel implements Serializable {
    public static final C6904a Companion = new C6904a(null);
    public static final AwemeAdRankAbModel DEFAULT_DISABLE_VERSION;
    public static final AwemeAdRankAbModel DEFAULT_ONLINE_VERSION;
    public static final AwemeAdRankAbModel DEFAULT_TEST_VERSION;
    @C6593c(mo15949a = "enabled")
    private final boolean enabled;
    @C6593c(mo15949a = "request_period")
    private final long requestPeriod;
    @C6593c(mo15949a = "visit_ad_max_interval")
    private final long visitAdMaxInterval;
    @C6593c(mo15949a = "visit_ad_min_interval")
    private final long visitAdMinInterval;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.AwemeAdRankAbModel$a */
    public static final class C6904a {
        private C6904a() {
        }

        /* renamed from: a */
        public static AwemeAdRankAbModel m21508a() {
            return AwemeAdRankAbModel.DEFAULT_DISABLE_VERSION;
        }

        /* renamed from: b */
        public static AwemeAdRankAbModel m21509b() {
            return AwemeAdRankAbModel.DEFAULT_ONLINE_VERSION;
        }

        /* renamed from: c */
        public static AwemeAdRankAbModel m21510c() {
            return AwemeAdRankAbModel.DEFAULT_TEST_VERSION;
        }

        public /* synthetic */ C6904a(C7571f fVar) {
            this();
        }
    }

    public AwemeAdRankAbModel() {
        this(false, 0, 0, 0, 15, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getRequestPeriod() {
        return this.requestPeriod;
    }

    public final long getVisitAdMaxInterval() {
        return this.visitAdMaxInterval;
    }

    public final long getVisitAdMinInterval() {
        return this.visitAdMinInterval;
    }

    static {
        AwemeAdRankAbModel awemeAdRankAbModel = new AwemeAdRankAbModel(false, 0, 0, 0, 14, null);
        DEFAULT_DISABLE_VERSION = awemeAdRankAbModel;
        AwemeAdRankAbModel awemeAdRankAbModel2 = new AwemeAdRankAbModel(true, 0, 0, 0, 14, null);
        DEFAULT_ONLINE_VERSION = awemeAdRankAbModel2;
        AwemeAdRankAbModel awemeAdRankAbModel3 = new AwemeAdRankAbModel(true, 12, 9, 6);
        DEFAULT_TEST_VERSION = awemeAdRankAbModel3;
    }

    public AwemeAdRankAbModel(boolean z, long j, long j2, long j3) {
        this.enabled = z;
        this.visitAdMaxInterval = j;
        this.visitAdMinInterval = j2;
        this.requestPeriod = j3;
    }

    public /* synthetic */ AwemeAdRankAbModel(boolean z, long j, long j2, long j3, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            j = 120;
        }
        long j4 = j;
        if ((i & 4) != 0) {
            j2 = 90;
        }
        long j5 = j2;
        if ((i & 8) != 0) {
            j3 = 60;
        }
        this(z, j4, j5, j3);
    }
}
