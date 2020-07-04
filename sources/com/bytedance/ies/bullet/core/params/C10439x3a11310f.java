package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.bullet.core.params.BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$7 */
public final class C10439x3a11310f extends Lambda implements C7563m<Bundle, String, Float> {
    public C10439x3a11310f() {
        super(2);
    }

    public final Float invoke(Bundle bundle, String str) {
        C7573i.m23587b(bundle, "bundle");
        C7573i.m23587b(str, "key");
        return Float.valueOf(bundle.getFloat(str));
    }
}
