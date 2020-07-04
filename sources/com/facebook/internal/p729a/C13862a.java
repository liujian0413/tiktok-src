package com.facebook.internal.p729a;

import com.facebook.C13499h;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FeatureManager.C13860a;
import com.facebook.internal.FeatureManager.Feature;
import com.facebook.internal.p729a.p730a.C13865a;
import com.facebook.internal.p729a.p731b.C13872b;

/* renamed from: com.facebook.internal.a.a */
public final class C13862a {
    /* renamed from: a */
    public static void m40942a() {
        if (C13499h.m39728n()) {
            FeatureManager.m40932a(Feature.CrashReport, new C13860a() {
                /* renamed from: a */
                public final void mo31778a(boolean z) {
                    if (z) {
                        C13865a.m40945a();
                    }
                }
            });
            FeatureManager.m40932a(Feature.ErrorReport, new C13860a() {
                /* renamed from: a */
                public final void mo31778a(boolean z) {
                    if (z) {
                        C13872b.m40969a();
                    }
                }
            });
        }
    }
}
