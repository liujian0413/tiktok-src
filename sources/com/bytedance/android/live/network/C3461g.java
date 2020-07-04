package com.bytedance.android.live.network;

import com.bytedance.retrofit2.C12475f;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.mime.TypedInput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.android.live.network.g */
final /* synthetic */ class C3461g implements C12475f {

    /* renamed from: a */
    private final C3459f f10272a;

    /* renamed from: b */
    private final Class f10273b;

    /* renamed from: c */
    private final Class[] f10274c;

    /* renamed from: d */
    private final String f10275d;

    /* renamed from: e */
    private final Type f10276e;

    /* renamed from: f */
    private final Annotation[] f10277f;

    /* renamed from: g */
    private final C12516p f10278g;

    C3461g(C3459f fVar, Class cls, Class[] clsArr, String str, Type type, Annotation[] annotationArr, C12516p pVar) {
        this.f10272a = fVar;
        this.f10273b = cls;
        this.f10274c = clsArr;
        this.f10275d = str;
        this.f10276e = type;
        this.f10277f = annotationArr;
        this.f10278g = pVar;
    }

    /* renamed from: a */
    public final Object mo10447a(Object obj) {
        return this.f10272a.mo10443a(this.f10273b, this.f10274c, this.f10275d, this.f10276e, this.f10277f, this.f10278g, (TypedInput) obj);
    }
}
