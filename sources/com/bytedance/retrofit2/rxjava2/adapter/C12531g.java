package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.C12467c;
import com.bytedance.retrofit2.C12467c.C12468a;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.C12534t;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p346io.reactivex.C7318a;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7490k;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7499z;

/* renamed from: com.bytedance.retrofit2.rxjava2.adapter.g */
public final class C12531g extends C12468a {

    /* renamed from: a */
    private final C7499z f33243a = null;

    /* renamed from: b */
    private final boolean f33244b;

    /* renamed from: a */
    public static C12531g m36395a() {
        return new C12531g(null, false);
    }

    /* renamed from: b */
    public static C12531g m36396b() {
        return new C12531g(null, true);
    }

    private C12531g(C7499z zVar, boolean z) {
        this.f33244b = z;
    }

    /* renamed from: a */
    public final C12467c<?> mo30455a(Type type, Annotation[] annotationArr, C12516p pVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Type type2;
        String str;
        Class<C7492s> a = m36282a(type);
        if (a == C7318a.class) {
            C12530f fVar = new C12530f(Void.class, this.f33243a, this.f33244b, false, true, false, false, false, true);
            return fVar;
        }
        if (a == C7329e.class) {
            z = true;
        } else {
            z = false;
        }
        if (a == C7319aa.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a == C7490k.class) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (a != C7492s.class && !z && !z2 && !z3) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z) {
                str = "Flowable";
            } else if (z2) {
                str = "Single";
            } else if (z3) {
                str = "Maybe";
            } else {
                str = "Observable";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" return type must be parameterized as ");
            sb.append(str);
            sb.append("<Foo> or ");
            sb.append(str);
            sb.append("<? extends Foo>");
            throw new IllegalStateException(sb.toString());
        }
        Type a2 = m36283a(0, (ParameterizedType) type);
        Class<C12527d> a3 = m36282a(a2);
        if (a3 == C12534t.class) {
            if (a2 instanceof ParameterizedType) {
                type2 = m36283a(0, (ParameterizedType) a2);
                z5 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (a3 != C12527d.class) {
            type2 = a2;
            z5 = false;
            z4 = true;
            C12530f fVar2 = new C12530f(type2, this.f33243a, this.f33244b, z5, z4, z, z2, z3, false);
            return fVar2;
        } else if (a2 instanceof ParameterizedType) {
            type2 = m36283a(0, (ParameterizedType) a2);
            z5 = true;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        z4 = false;
        C12530f fVar22 = new C12530f(type2, this.f33243a, this.f33244b, z5, z4, z, z2, z3, false);
        return fVar22;
    }
}
