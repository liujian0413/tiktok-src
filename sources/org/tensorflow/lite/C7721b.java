package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: org.tensorflow.lite.b */
public final class C7721b implements AutoCloseable {

    /* renamed from: a */
    NativeInterpreterWrapper f20968a;

    /* renamed from: org.tensorflow.lite.b$a */
    public static class C7722a {

        /* renamed from: a */
        int f20969a = -1;

        /* renamed from: b */
        Boolean f20970b;

        /* renamed from: c */
        Boolean f20971c;

        /* renamed from: d */
        Boolean f20972d;

        /* renamed from: e */
        final List<C7720a> f20973e = new ArrayList();

        /* renamed from: a */
        public final C7722a mo20410a(int i) {
            this.f20969a = i;
            return this;
        }

        /* renamed from: a */
        public final C7722a mo20411a(C7720a aVar) {
            this.f20973e.add(aVar);
            return this;
        }

        /* renamed from: a */
        public final C7722a mo20412a(boolean z) {
            this.f20970b = Boolean.valueOf(true);
            return this;
        }
    }

    /* renamed from: a */
    private void m23830a() {
        if (this.f20968a == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    public final void close() {
        if (this.f20968a != null) {
            this.f20968a.close();
            this.f20968a = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public C7721b(ByteBuffer byteBuffer, C7722a aVar) {
        this.f20968a = new NativeInterpreterWrapper(byteBuffer, aVar);
    }

    /* renamed from: a */
    private void m23831a(Object[] objArr, Map<Integer, Object> map) {
        m23830a();
        this.f20968a.mo122244a(objArr, map);
    }

    /* renamed from: a */
    public final void mo20407a(Object obj, Object obj2) {
        Object[] objArr = {obj};
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), obj2);
        m23831a(objArr, (Map<Integer, Object>) hashMap);
    }
}
