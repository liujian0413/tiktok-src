package com.bytedance.frameworks.baselib.network.http.retrofit.p514a.p515a;

import com.bytedance.retrofit2.C12475f;
import com.bytedance.retrofit2.C12475f.C12476a;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a.a.a */
public final class C10176a extends C12476a {

    /* renamed from: a */
    private final C6600e f27706a;

    /* renamed from: a */
    public static C10176a m30237a() {
        return m30238a(new C6600e());
    }

    /* renamed from: a */
    public static C10176a m30238a(C6600e eVar) {
        return new C10176a(eVar);
    }

    private C10176a(C6600e eVar) {
        if (eVar != null) {
            this.f27706a = eVar;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: a */
    public final C12475f<TypedInput, ?> mo10441a(Type type, Annotation[] annotationArr, C12516p pVar) {
        return new C10178c(this.f27706a, this.f27706a.mo15965a(C6597a.get(type)));
    }

    /* renamed from: a */
    public final C12475f<?, TypedOutput> mo10442a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C12516p pVar) {
        return new C10177b(this.f27706a, this.f27706a.mo15965a(C6597a.get(type)));
    }
}
