package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.bullet.core.params.BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$3 */
public final class C10435x3a11310b extends Lambda implements C7563m<Bundle, String, Integer> {
    public C10435x3a11310b() {
        super(2);
    }

    public final Integer invoke(Bundle bundle, String str) {
        C7573i.m23587b(bundle, "bundle");
        C7573i.m23587b(str, "key");
        return Integer.valueOf(bundle.getInt(str));
    }
}
