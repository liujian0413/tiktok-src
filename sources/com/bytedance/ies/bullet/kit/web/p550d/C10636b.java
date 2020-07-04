package com.bytedance.ies.bullet.kit.web.p550d;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.ies.bullet.kit.web.p550d.C10636b;
import com.bytedance.ies.bullet.kit.web.p550d.C10637c;
import com.bytedance.ies.bullet.p551ui.common.params.C10698b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.kit.web.d.b */
public abstract class C10636b<T extends C10636b<T, S>, S extends C10637c> extends C10698b<T, S> {
    public C10636b(Uri uri) {
        C7573i.m23587b(uri, "uri");
        Builder buildUpon = uri.buildUpon();
        C7573i.m23582a((Object) buildUpon, "uri.buildUpon()");
        super(buildUpon);
    }
}
