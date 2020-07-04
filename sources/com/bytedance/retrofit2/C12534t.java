package com.bytedance.retrofit2;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12464d;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.t */
public final class C12534t<T> {

    /* renamed from: a */
    public final C12464d f33301a;

    /* renamed from: b */
    public final T f33302b;

    /* renamed from: c */
    public final TypedInput f33303c;

    /* renamed from: d */
    public C12520r f33304d;

    /* renamed from: a */
    public final int mo30510a() {
        return this.f33301a.f33119b;
    }

    /* renamed from: b */
    public final List<C12461b> mo30511b() {
        return this.f33301a.f33121d;
    }

    /* renamed from: c */
    public final boolean mo30512c() {
        return this.f33301a.mo30451a();
    }

    /* renamed from: a */
    public static <T> C12534t<T> m36420a(T t, C12464d dVar) {
        if (dVar == null) {
            throw new NullPointerException("rawResponse == null");
        } else if (dVar.mo30451a()) {
            return new C12534t<>(dVar, t, null);
        } else {
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
    }

    /* renamed from: a */
    public static <T> C12534t<T> m36419a(TypedInput typedInput, C12464d dVar) {
        if (typedInput == null) {
            throw new NullPointerException("body == null");
        } else if (dVar == null) {
            throw new NullPointerException("rawResponse == null");
        } else if (!dVar.mo30451a()) {
            return new C12534t<>(dVar, null, typedInput);
        } else {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
    }

    private C12534t(C12464d dVar, T t, TypedInput typedInput) {
        this.f33301a = dVar;
        this.f33302b = t;
        this.f33303c = typedInput;
    }
}
