package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$8 */
public final class C10440x3a113110 extends Lambda implements C48006q<Bundle, String, Float, Bundle> {
    public C10440x3a113110() {
        super(3);
    }

    public final Bundle invoke(Bundle bundle, String str, Float f) {
        C7573i.m23587b(bundle, "builder");
        C7573i.m23587b(str, "key");
        bundle.putFloat(str, f.floatValue());
        return bundle;
    }
}
