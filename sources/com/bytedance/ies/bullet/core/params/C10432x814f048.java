package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.bullet.core.params.BundleParamHelperKt$registerBundleHandlers$$inlined$registerBundleHandler$11 */
public final class C10432x814f048 extends Lambda implements C7563m<Bundle, String, String> {
    public C10432x814f048() {
        super(2);
    }

    public final String invoke(Bundle bundle, String str) {
        C7573i.m23587b(bundle, "bundle");
        C7573i.m23587b(str, "key");
        return bundle.getString(str);
    }
}
