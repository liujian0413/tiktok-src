package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.vast.model.Creative;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.VastUtils$flatMapCreative$1 */
public final class VastUtils$flatMapCreative$1 extends Lambda implements C7562b<Creative, C7604g<? extends R>> {

    /* renamed from: $f */
    final /* synthetic */ C7562b f66427$f;

    public VastUtils$flatMapCreative$1(C7562b bVar) {
        this.f66427$f = bVar;
        super(1);
    }

    public final C7604g<R> invoke(Creative creative) {
        if (creative != null) {
            C7604g<R> gVar = (C7604g) this.f66427$f.invoke(creative);
            if (gVar != null) {
                return gVar;
            }
        }
        return C7605h.m23635a();
    }
}
