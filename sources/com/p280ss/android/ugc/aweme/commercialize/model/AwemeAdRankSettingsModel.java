package com.p280ss.android.ugc.aweme.commercialize.model;

import android.support.annotation.Keep;
import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7571f;

@Keep
/* renamed from: com.ss.android.ugc.aweme.commercialize.model.AwemeAdRankSettingsModel */
public final class AwemeAdRankSettingsModel {
    public static final C24985a Companion = new C24985a(null);
    public static final AwemeAdRankSettingsModel DEFAULT_DISABLE_VERSION = new AwemeAdRankSettingsModel(false);
    @C6593c(mo15949a = "enabled")
    public final boolean enabled;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.AwemeAdRankSettingsModel$a */
    public static final class C24985a {
        private C24985a() {
        }

        /* renamed from: a */
        public static AwemeAdRankSettingsModel m82299a() {
            return AwemeAdRankSettingsModel.DEFAULT_DISABLE_VERSION;
        }

        public /* synthetic */ C24985a(C7571f fVar) {
            this();
        }
    }

    public AwemeAdRankSettingsModel() {
        this(false, 1, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public AwemeAdRankSettingsModel(boolean z) {
        this.enabled = z;
    }

    public /* synthetic */ AwemeAdRankSettingsModel(boolean z, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            z = false;
        }
        this(z);
    }
}
