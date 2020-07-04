package com.bytedance.ies.bullet.core.kit;

import android.net.Uri;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class KitNotMatchException extends Exception {
    public KitNotMatchException(C10378c<?, ?, ?, ?> cVar, Uri uri, Throwable th) {
        C7573i.m23587b(cVar, "kitApi");
        C7573i.m23587b(uri, "uri");
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.getClass().getSimpleName());
        sb.append(" won't match uri: ");
        sb.append(uri);
        super(sb.toString());
    }

    public /* synthetic */ KitNotMatchException(C10378c cVar, Uri uri, Throwable th, int i, C7571f fVar) {
        if ((i & 4) != 0) {
            th = null;
        }
        this(cVar, uri, th);
    }
}
