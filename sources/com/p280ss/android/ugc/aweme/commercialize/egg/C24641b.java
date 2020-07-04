package com.p280ss.android.ugc.aweme.commercialize.egg;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b */
public final class C24641b {

    /* renamed from: a */
    public final String f64975a;

    /* renamed from: b */
    public final String f64976b;

    /* renamed from: c */
    public final C24635a f64977c;

    /* renamed from: d */
    public final boolean f64978d;

    /* renamed from: e */
    public final AtomicBoolean f64979e;

    /* renamed from: f */
    public C24658g f64980f;

    /* renamed from: g */
    public C24657f f64981g;

    private C24641b(String str, String str2, C24635a aVar, boolean z, AtomicBoolean atomicBoolean, C24658g gVar, C24657f fVar) {
        C7573i.m23587b(str, "materialUrl");
        C7573i.m23587b(str2, "fileType");
        C7573i.m23587b(atomicBoolean, "preloadSuccess");
        this.f64975a = str;
        this.f64976b = str2;
        this.f64977c = aVar;
        this.f64978d = z;
        this.f64979e = atomicBoolean;
        this.f64980f = gVar;
        this.f64981g = fVar;
    }

    public /* synthetic */ C24641b(String str, String str2, C24635a aVar, boolean z, AtomicBoolean atomicBoolean, C24658g gVar, C24657f fVar, int i, C7571f fVar2) {
        this(str, str2, aVar, z, new AtomicBoolean(false), null, fVar);
    }
}
