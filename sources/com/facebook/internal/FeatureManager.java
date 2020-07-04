package com.facebook.internal;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.C13499h;
import com.facebook.internal.C13920m.C13923a;

public final class FeatureManager {

    public enum Feature {
        Unknown(-1),
        Core(0),
        AppEvents(256),
        CodelessEvents(257),
        RestrictiveDataFiltering(258),
        Instrument(512),
        CrashReport(513),
        ErrorReport(514),
        Login(65536),
        Share(131072),
        Places(196608);
        
        private final int code;

        public final Feature getParent() {
            if ((this.code & NormalGiftView.ALPHA_255) > 0) {
                return fromInt(this.code & 16776960);
            }
            if ((this.code & 65280) > 0) {
                return fromInt(this.code & 16711680);
            }
            return fromInt(0);
        }

        public final String toString() {
            String str = "unknown";
            switch (this) {
                case RestrictiveDataFiltering:
                    return "RestrictiveDataFiltering";
                case Instrument:
                    return "Instrument";
                case CrashReport:
                    return "CrashReport";
                case ErrorReport:
                    return "ErrorReport";
                case Core:
                    return "CoreKit";
                case AppEvents:
                    return "AppEvents";
                case CodelessEvents:
                    return "CodelessEvents";
                case Login:
                    return "LoginKit";
                case Share:
                    return "ShareKit";
                case Places:
                    return "PlacesKit";
                default:
                    return str;
            }
        }

        static Feature fromInt(int i) {
            Feature[] values;
            for (Feature feature : values()) {
                if (feature.code == i) {
                    return feature;
                }
            }
            return Unknown;
        }

        private Feature(int i) {
            this.code = i;
        }
    }

    /* renamed from: com.facebook.internal.FeatureManager$a */
    public interface C13860a {
        /* renamed from: a */
        void mo31778a(boolean z);
    }

    /* renamed from: b */
    private static boolean m40934b(Feature feature) {
        StringBuilder sb = new StringBuilder("FBSDKFeature");
        sb.append(feature.toString());
        return C13920m.m41091a(sb.toString(), C13499h.m39725k(), m40935c(feature));
    }

    /* renamed from: c */
    private static boolean m40935c(Feature feature) {
        switch (feature) {
            case RestrictiveDataFiltering:
            case Instrument:
            case CrashReport:
            case ErrorReport:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: a */
    public static boolean m40933a(Feature feature) {
        if (Feature.Unknown == feature) {
            return false;
        }
        if (Feature.Core == feature) {
            return true;
        }
        Feature parent = feature.getParent();
        if (parent == feature) {
            return m40934b(feature);
        }
        if (!m40933a(parent) || !m40934b(feature)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m40932a(final Feature feature, final C13860a aVar) {
        C13920m.m41089a((C13923a) new C13923a() {
            /* renamed from: a */
            public final void mo33494a() {
                aVar.mo31778a(FeatureManager.m40933a(feature));
            }
        });
    }
}
