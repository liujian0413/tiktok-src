package com.bytedance.ies.bullet.core.kit;

import android.net.Uri.Builder;
import com.bytedance.ies.bullet.core.kit.C10354a;
import com.bytedance.ies.bullet.core.kit.C10359b;
import com.bytedance.ies.bullet.core.params.C10462e;
import com.bytedance.ies.bullet.core.params.C10482q;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.kit.b */
public abstract class C10359b<T extends C10359b<T, S>, S extends C10354a> extends C10482q<T, S> {
    public C10359b(Builder builder) {
        C7573i.m23587b(builder, "uriBuilder");
        super(builder);
    }

    /* renamed from: a */
    public final T mo25124a(C10462e<Builder> eVar) {
        C7573i.m23587b(eVar, "builder");
        ((C10354a) mo25109a()).f28066a.mo25250a(((Builder) eVar.mo25247b()).build());
        return this;
    }
}
