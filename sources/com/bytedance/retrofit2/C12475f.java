package com.bytedance.retrofit2;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p637a.C12461b;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.f */
public interface C12475f<F, T> {

    /* renamed from: com.bytedance.retrofit2.f$a */
    public static abstract class C12476a {
        /* renamed from: a */
        public C12475f<TypedInput, ?> mo10441a(Type type, Annotation[] annotationArr, C12516p pVar) {
            return null;
        }

        /* renamed from: a */
        public C12475f<?, TypedOutput> mo10442a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C12516p pVar) {
            return null;
        }

        /* renamed from: b */
        public C12475f<?, Object> mo30436b(Type type, Annotation[] annotationArr, C12516p pVar) {
            return null;
        }

        /* renamed from: c */
        public C12475f<?, String> mo30437c(Type type, Annotation[] annotationArr, C12516p pVar) {
            return null;
        }

        /* renamed from: d */
        public C12475f<?, C12461b> mo30438d(Type type, Annotation[] annotationArr, C12516p pVar) {
            return null;
        }
    }

    /* renamed from: a */
    T mo10447a(F f) throws IOException;
}
