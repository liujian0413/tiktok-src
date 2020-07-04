package com.bytedance.ies.bullet.core.params;

import android.net.Uri.Builder;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.UriParamHelperKt$registerUriHandlers$$inlined$registerUriQueryHandler$14 */
public final class C10447x4309149b extends Lambda implements C48006q<Builder, String, List<? extends String>, Builder> {
    public C10447x4309149b() {
        super(3);
    }

    public final Builder invoke(Builder builder, String str, List<? extends String> list) {
        C7573i.m23587b(builder, "builder");
        C7573i.m23587b(str, "key");
        String a = C7525m.m23492a(list, ",", null, null, 0, null, null, 62, null);
        if (a != null) {
            builder.appendQueryParameter(str, a);
        }
        return builder;
    }
}
