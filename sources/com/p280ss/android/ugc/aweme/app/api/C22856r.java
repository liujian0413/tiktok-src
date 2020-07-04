package com.p280ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.C12475f;
import com.bytedance.retrofit2.C12475f.C12476a;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.api.p1024c.C22820a;
import com.p280ss.android.ugc.aweme.app.api.p1024c.C22823d;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.app.api.r */
public final class C22856r extends C12476a {

    /* renamed from: a */
    private final C6600e f60585a;

    /* renamed from: a */
    public static C22856r m75313a(C6600e eVar) {
        return new C22856r(eVar);
    }

    private C22856r(C6600e eVar) {
        if (eVar != null) {
            this.f60585a = eVar;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: a */
    public final C12475f<TypedInput, ?> mo10441a(Type type, Annotation[] annotationArr, C12516p pVar) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getRawType() == C22823d.class) {
                return new C22820a(parameterizedType, this.f60585a);
            }
            return null;
        } else if (!(type instanceof Class)) {
            return null;
        } else {
            Class cls = (Class) type;
            if (!Message.class.isAssignableFrom(cls)) {
                return null;
            }
            return new C22855q(ProtoAdapter.get(cls));
        }
    }

    /* renamed from: a */
    public final C12475f<?, TypedOutput> mo10442a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C12516p pVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C22854p(ProtoAdapter.get(cls));
    }
}
