package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$10 */
public final class C10431x814f047 extends Lambda implements C48006q<Bundle, String, Double, Bundle> {
    public C10431x814f047() {
        super(3);
    }

    public final Bundle invoke(Bundle bundle, String str, Double d) {
        C7573i.m23587b(bundle, "builder");
        C7573i.m23587b(str, "key");
        bundle.putDouble(str, d.doubleValue());
        return bundle;
    }
}
