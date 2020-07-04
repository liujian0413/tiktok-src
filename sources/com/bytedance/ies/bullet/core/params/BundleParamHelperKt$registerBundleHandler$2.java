package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

public final class BundleParamHelperKt$registerBundleHandler$2 extends Lambda implements C48006q<Bundle, String, T, Bundle> {
    final /* synthetic */ C48006q $valueBuilder;

    public BundleParamHelperKt$registerBundleHandler$2(C48006q qVar) {
        this.$valueBuilder = qVar;
        super(3);
    }

    public final Bundle invoke(Bundle bundle, String str, T t) {
        C7573i.m23587b(bundle, "builder");
        C7573i.m23587b(str, "key");
        this.$valueBuilder.invoke(bundle, str, t);
        return bundle;
    }
}
