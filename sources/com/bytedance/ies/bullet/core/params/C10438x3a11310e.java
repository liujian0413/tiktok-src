package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$6 */
public final class C10438x3a11310e extends Lambda implements C48006q<Bundle, String, Long, Bundle> {
    public C10438x3a11310e() {
        super(3);
    }

    public final Bundle invoke(Bundle bundle, String str, Long l) {
        C7573i.m23587b(bundle, "builder");
        C7573i.m23587b(str, "key");
        bundle.putLong(str, l.longValue());
        return bundle;
    }
}
