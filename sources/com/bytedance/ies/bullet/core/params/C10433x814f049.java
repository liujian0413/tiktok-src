package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$12 */
public final class C10433x814f049 extends Lambda implements C48006q<Bundle, String, String, Bundle> {
    public C10433x814f049() {
        super(3);
    }

    public final Bundle invoke(Bundle bundle, String str, String str2) {
        C7573i.m23587b(bundle, "builder");
        C7573i.m23587b(str, "key");
        bundle.putString(str, str2);
        return bundle;
    }
}
