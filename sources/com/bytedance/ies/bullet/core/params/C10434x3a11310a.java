package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$2 */
public final class C10434x3a11310a extends Lambda implements C48006q<Bundle, String, Boolean, Bundle> {
    public C10434x3a11310a() {
        super(3);
    }

    public final Bundle invoke(Bundle bundle, String str, Boolean bool) {
        C7573i.m23587b(bundle, "builder");
        C7573i.m23587b(str, "key");
        bundle.putBoolean(str, bool.booleanValue());
        return bundle;
    }
}
