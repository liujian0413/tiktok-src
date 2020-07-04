package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.C13310j;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.p685b.C13285i;
import com.facebook.drawee.components.C13390a;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p716c.C13585p;
import com.facebook.imagepipeline.p717d.C13606i;
import com.facebook.imagepipeline.p717d.C13622l;
import com.facebook.imagepipeline.p719f.C13642a;
import com.facebook.imagepipeline.p720g.C13645c;
import java.util.Set;

/* renamed from: com.facebook.drawee.backends.pipeline.f */
public final class C13384f implements C13310j<C13382e> {

    /* renamed from: a */
    private final Context f35414a;

    /* renamed from: b */
    private final C13606i f35415b;

    /* renamed from: c */
    private final C13385g f35416c;

    /* renamed from: d */
    private final Set<C13401d> f35417d;

    /* renamed from: a */
    public final C13382e mo29879b() {
        return new C13382e(this.f35414a, this.f35416c, this.f35415b, this.f35417d);
    }

    public C13384f(Context context, C13368b bVar) {
        this(context, C13622l.m40095a(), bVar);
    }

    private C13384f(Context context, C13622l lVar, C13368b bVar) {
        this(context, lVar, null, bVar);
    }

    private C13384f(Context context, C13622l lVar, Set<C13401d> set, C13368b bVar) {
        ImmutableList immutableList;
        C13310j jVar;
        this.f35414a = context;
        this.f35415b = lVar.mo33208d();
        if (bVar == null || bVar.f35330b == null) {
            this.f35416c = new C13385g();
        } else {
            this.f35416c = bVar.f35330b;
        }
        C13385g gVar = this.f35416c;
        Resources resources = context.getResources();
        C13390a a = C13390a.m39233a();
        C13642a b = lVar.mo33206b(context);
        C13285i b2 = C13285i.m38830b();
        C13585p<C13265a, C13645c> pVar = this.f35415b.f36039a;
        if (bVar != null) {
            immutableList = bVar.f35329a;
        } else {
            immutableList = null;
        }
        if (bVar != null) {
            jVar = bVar.f35331c;
        } else {
            jVar = null;
        }
        gVar.mo32716a(resources, a, b, b2, pVar, immutableList, jVar);
        this.f35417d = null;
    }
}
