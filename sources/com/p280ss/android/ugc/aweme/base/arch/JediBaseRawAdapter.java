package com.p280ss.android.ugc.aweme.base.arch;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.ext.adapter.C11713f;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.C11738c;
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.base.arch.JediBaseRawAdapter */
public abstract class JediBaseRawAdapter<VH extends JediViewHolder<? extends C11501d, ?>> extends MultiTypeAdapter<VH, C11713f<VH>> {

    /* renamed from: a */
    public final C11713f<VH> f61299a;

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C11738c mo29202b() {
        return this.f61299a;
    }

    public JediBaseRawAdapter(C0043i iVar) {
        C7573i.m23587b(iVar, "parent");
        C11713f<VH> fVar = new C11713f<>(iVar);
        mo60560a((C11743d<VH>) fVar);
        this.f61299a = fVar;
    }
}
