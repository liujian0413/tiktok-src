package com.bytedance.ies.bullet.core.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

public final class BundleParamHelperKt$registerBundleHandler$1 extends Lambda implements C7563m<Bundle, String, T> {
    final /* synthetic */ C7563m $valueParser;

    public BundleParamHelperKt$registerBundleHandler$1(C7563m mVar) {
        this.$valueParser = mVar;
        super(2);
    }

    public final T invoke(Bundle bundle, String str) {
        C7573i.m23587b(bundle, "bundle");
        C7573i.m23587b(str, "key");
        return this.$valueParser.invoke(bundle, str);
    }
}
