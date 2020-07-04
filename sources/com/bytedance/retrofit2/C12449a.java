package com.bytedance.retrofit2;

import com.bytedance.retrofit2.C12475f.C12476a;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6449ab;
import com.bytedance.retrofit2.p637a.C12461b;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.a */
final class C12449a extends C12476a {

    /* renamed from: com.bytedance.retrofit2.a$a */
    static final class C12450a implements C12475f<TypedInput, TypedInput> {

        /* renamed from: a */
        static final C12450a f33086a = new C12450a();

        C12450a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo10447a(Object obj) throws IOException {
            return m36246a((TypedInput) obj);
        }

        /* renamed from: a */
        private static TypedInput m36246a(TypedInput typedInput) throws IOException {
            if (typedInput == null || (typedInput instanceof TypedByteArray)) {
                return typedInput;
            }
            String mimeType = typedInput.mimeType();
            InputStream in = typedInput.mo10444in();
            try {
                TypedByteArray typedByteArray = new TypedByteArray(mimeType, C12536v.m36441a(in), new String[0]);
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException unused) {
                    }
                }
                return typedByteArray;
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$b */
    static final class C12451b implements C12475f<C12461b, C12461b> {

        /* renamed from: a */
        static final C12451b f33087a = new C12451b();

        C12451b() {
        }

        /* renamed from: a */
        private static C12461b m36248a(C12461b bVar) throws IOException {
            return bVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo10447a(Object obj) throws IOException {
            return m36248a((C12461b) obj);
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$c */
    static final class C12452c implements C12475f<Object, Object> {

        /* renamed from: a */
        static final C12452c f33088a = new C12452c();

        C12452c() {
        }

        /* renamed from: a */
        public final Object mo10447a(Object obj) throws IOException {
            return obj;
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$d */
    static final class C12453d implements C12475f<TypedOutput, TypedOutput> {

        /* renamed from: a */
        static final C12453d f33089a = new C12453d();

        C12453d() {
        }

        /* renamed from: a */
        private static TypedOutput m36251a(TypedOutput typedOutput) throws IOException {
            return typedOutput;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo10447a(Object obj) throws IOException {
            return m36251a((TypedOutput) obj);
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$e */
    static final class C12454e implements C12475f<TypedInput, TypedInput> {

        /* renamed from: a */
        static final C12454e f33090a = new C12454e();

        C12454e() {
        }

        /* renamed from: a */
        private static TypedInput m36253a(TypedInput typedInput) throws IOException {
            return typedInput;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo10447a(Object obj) throws IOException {
            return m36253a((TypedInput) obj);
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$f */
    static final class C12455f implements C12475f<String, String> {

        /* renamed from: a */
        static final C12455f f33091a = new C12455f();

        C12455f() {
        }

        /* renamed from: a */
        private static String m36255a(String str) throws IOException {
            return str;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo10447a(Object obj) throws IOException {
            return m36255a((String) obj);
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$g */
    static final class C12456g implements C12475f<TypedInput, String> {

        /* renamed from: a */
        static final C12456g f33092a = new C12456g();

        C12456g() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo10447a(Object obj) throws IOException {
            return m36257a((TypedInput) obj);
        }

        /* renamed from: a */
        private static String m36257a(TypedInput typedInput) throws IOException {
            if (!(typedInput instanceof TypedByteArray)) {
                return null;
            }
            String str = "UTF-8";
            if (typedInput.mimeType() != null) {
                str = MimeUtil.parseCharset(typedInput.mimeType(), str);
            }
            return new String(((TypedByteArray) typedInput).getBytes(), str);
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$h */
    static final class C12457h implements C12475f<Object, String> {

        /* renamed from: a */
        static final C12457h f33093a = new C12457h();

        C12457h() {
        }

        /* renamed from: b */
        private static String m36259b(Object obj) {
            return String.valueOf(obj);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo10447a(Object obj) throws IOException {
            return m36259b(obj);
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$i */
    static final class C12458i implements C12475f<TypedInput, Void> {

        /* renamed from: a */
        static final C12458i f33094a = new C12458i();

        C12458i() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo10447a(Object obj) throws IOException {
            return m36261a((TypedInput) obj);
        }

        /* renamed from: a */
        private static Void m36261a(TypedInput typedInput) throws IOException {
            InputStream in = typedInput.mo10444in();
            if (in != null) {
                in.close();
            }
            return null;
        }
    }

    C12449a() {
    }

    /* renamed from: b */
    public final C12475f<?, Object> mo30436b(Type type, Annotation[] annotationArr, C12516p pVar) {
        if (type == Object.class) {
            return C12452c.f33088a;
        }
        return null;
    }

    /* renamed from: c */
    public final C12475f<?, String> mo30437c(Type type, Annotation[] annotationArr, C12516p pVar) {
        if (type == String.class) {
            return C12455f.f33091a;
        }
        return null;
    }

    /* renamed from: d */
    public final C12475f<?, C12461b> mo30438d(Type type, Annotation[] annotationArr, C12516p pVar) {
        if (type == C12461b.class) {
            return C12451b.f33087a;
        }
        return null;
    }

    /* renamed from: a */
    public final C12475f<TypedInput, ?> mo10441a(Type type, Annotation[] annotationArr, C12516p pVar) {
        if (type == TypedInput.class) {
            if (C12536v.m36440a(annotationArr, C6449ab.class)) {
                return C12454e.f33090a;
            }
            return C12450a.f33086a;
        } else if (type == String.class) {
            return C12456g.f33092a;
        } else {
            if (type == Void.class) {
                return C12458i.f33094a;
            }
            return null;
        }
    }

    /* renamed from: a */
    public final C12475f<?, TypedOutput> mo10442a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C12516p pVar) {
        if (TypedOutput.class.isAssignableFrom(C12536v.m36429a(type))) {
            return C12453d.f33089a;
        }
        return null;
    }
}
