package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$4 */
public final class C10436x3a11310c extends Lambda implements C48006q<Bundle, String, Integer, Bundle> {
    public C10436x3a11310c() {
        super(3);
    }

    public final Bundle invoke(Bundle bundle, String str, Integer num) {
        C7573i.m23587b(bundle, "builder");
        C7573i.m23587b(str, "key");
        bundle.putInt(str, num.intValue());
        return bundle;
    }
}
