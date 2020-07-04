package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.bullet.core.params.BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$9 */
public final class C10441x3a113111 extends Lambda implements C7563m<Bundle, String, Double> {
    public C10441x3a113111() {
        super(2);
    }

    public final Double invoke(Bundle bundle, String str) {
        C7573i.m23587b(bundle, "bundle");
        C7573i.m23587b(str, "key");
        return Double.valueOf(bundle.getDouble(str));
    }
}
