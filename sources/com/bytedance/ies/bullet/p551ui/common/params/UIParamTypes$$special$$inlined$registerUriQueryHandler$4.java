package com.bytedance.ies.bullet.p551ui.common.params;

import android.net.Uri.Builder;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.ui.common.params.UIParamTypes$$special$$inlined$registerUriQueryHandler$4 */
public final class UIParamTypes$$special$$inlined$registerUriQueryHandler$4 extends Lambda implements C48006q<Builder, String, TopBarType, Builder> {
    public UIParamTypes$$special$$inlined$registerUriQueryHandler$4() {
        super(3);
    }

    public final Builder invoke(Builder builder, String str, TopBarType topBarType) {
        C7573i.m23587b(builder, "builder");
        C7573i.m23587b(str, "key");
        String valueOf = String.valueOf(topBarType.getVALUE());
        if (valueOf != null) {
            builder.appendQueryParameter(str, valueOf);
        }
        return builder;
    }
}
