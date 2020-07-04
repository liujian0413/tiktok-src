package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.bullet.core.params.BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$5 */
public final class C10437x3a11310d extends Lambda implements C7563m<Bundle, String, Long> {
    public C10437x3a11310d() {
        super(2);
    }

    public final Long invoke(Bundle bundle, String str) {
        C7573i.m23587b(bundle, "bundle");
        C7573i.m23587b(str, "key");
        return Long.valueOf(bundle.getLong(str));
    }
}
