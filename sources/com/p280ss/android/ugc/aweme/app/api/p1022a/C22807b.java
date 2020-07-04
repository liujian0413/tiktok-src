package com.p280ss.android.ugc.aweme.app.api.p1022a;

import com.bytedance.retrofit2.C12475f;
import com.bytedance.retrofit2.C12475f.C12476a;
import com.bytedance.retrofit2.C12516p;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.app.api.a.b */
public class C22807b<T> implements C12475f<TypedInput, T> {

    /* renamed from: g */
    private static volatile ExecutorService f60520g;

    /* renamed from: a */
    private Type f60521a;

    /* renamed from: b */
    private Annotation[] f60522b;

    /* renamed from: c */
    private C12516p f60523c;

    /* renamed from: d */
    private List<C12476a> f60524d;

    /* renamed from: e */
    private C12476a f60525e;

    /* renamed from: f */
    private volatile C12475f<TypedInput, T> f60526f;

    /* renamed from: b */
    private void m75230b() {
        m75231c();
        f60520g.submit(new C22808c(this));
    }

    /* renamed from: c */
    private static void m75231c() {
        if (f60520g == null) {
            synchronized (C22807b.class) {
                if (f60520g == null) {
                    f60520g = C7258h.m22730c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo59832a() {
        if (this.f60526f == null) {
            synchronized (this) {
                if (this.f60526f == null) {
                    this.f60526f = m75227a(this.f60525e, this.f60521a, this.f60522b);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo10447a(TypedInput typedInput) throws IOException {
        mo59832a();
        return this.f60526f.mo10447a(typedInput);
    }

    /* renamed from: a */
    private static <T> T m75229a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    private <T> C12475f<TypedInput, T> m75227a(C12476a aVar, Type type, Annotation[] annotationArr) {
        m75229a(type, "type == null");
        m75229a(annotationArr, "annotations == null");
        int indexOf = this.f60524d.indexOf(aVar) + 1;
        int size = this.f60524d.size();
        for (int i = indexOf; i < size; i++) {
            C12475f<TypedInput, T> a = ((C12476a) this.f60524d.get(i)).mo10441a(type, annotationArr, this.f60523c);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate TypeInput converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(((C12476a) this.f60524d.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f60524d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            sb.append("\n   * ");
            sb.append(((C12476a) this.f60524d.get(i3)).getClass().getName());
        }
        throw new IllegalArgumentException(sb.toString());
    }

    C22807b(Type type, Annotation[] annotationArr, C12516p pVar, List<C12476a> list, C12476a aVar) {
        this.f60521a = type;
        this.f60522b = annotationArr;
        this.f60523c = pVar;
        this.f60524d = list;
        this.f60525e = aVar;
        m75230b();
    }
}
