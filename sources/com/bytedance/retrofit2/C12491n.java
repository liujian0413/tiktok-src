package com.bytedance.retrofit2;

import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p637a.C12461b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.retrofit2.n */
abstract class C12491n<T> {

    /* renamed from: com.bytedance.retrofit2.n$a */
    static final class C12494a<T> extends C12491n<T> {

        /* renamed from: a */
        private final C12475f<T, String> f33148a;

        C12494a(C12475f<T, String> fVar) {
            this.f33148a = (C12475f) C12536v.m36431a(fVar, "converter == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30482a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                try {
                    requestBuilder.f33070j = Boolean.parseBoolean((String) this.f33148a.mo10447a(t));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to AddCommonParam");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$b */
    static final class C12495b<T> extends C12491n<T> {

        /* renamed from: a */
        private final boolean f33149a;

        /* renamed from: b */
        private final C12475f<T, TypedOutput> f33150b;

        C12495b(boolean z, C12475f<T, TypedOutput> fVar) {
            this.f33149a = z;
            this.f33150b = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30482a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.f33065e = (TypedOutput) this.f33150b.mo10447a(t);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to TypedOutput");
                    throw new RuntimeException(sb.toString(), e);
                }
            } else if (!this.f33149a) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$c */
    static final class C12496c<T> extends C12491n<T> {

        /* renamed from: a */
        private final C12475f<T, Object> f33151a;

        C12496c(C12475f<T, Object> fVar) {
            this.f33151a = (C12475f) C12536v.m36431a(fVar, "converter == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30482a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                try {
                    requestBuilder.f33071k = this.f33151a.mo10447a(t);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to ExtraInfo");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$d */
    static final class C12497d<T> extends C12491n<T> {

        /* renamed from: a */
        private final String f33152a;

        /* renamed from: b */
        private final C12475f<T, String> f33153b;

        /* renamed from: c */
        private final boolean f33154c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30482a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.mo30412c(this.f33152a, (String) this.f33153b.mo10447a(t), this.f33154c);
            }
        }

        C12497d(String str, C12475f<T, String> fVar, boolean z) {
            this.f33152a = (String) C12536v.m36431a(str, "name == null");
            this.f33153b = fVar;
            this.f33154c = z;
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$e */
    static final class C12498e<T> extends C12491n<Map<String, T>> {

        /* renamed from: a */
        private final C12475f<T, String> f33155a;

        /* renamed from: b */
        private final boolean f33156b;

        C12498e(C12475f<T, String> fVar, boolean z) {
            this.f33155a = fVar;
            this.f33156b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo30482a(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.mo30412c(str, (String) this.f33155a.mo10447a(value), this.f33156b);
                        } else {
                            StringBuilder sb = new StringBuilder("Field map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$f */
    static final class C12499f<T> extends C12491n<T> {

        /* renamed from: a */
        private final String f33157a;

        /* renamed from: b */
        private final C12475f<T, String> f33158b;

        C12499f(String str, C12475f<T, String> fVar) {
            this.f33157a = (String) C12536v.m36431a(str, "name == null");
            this.f33158b = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30482a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.mo30407a(this.f33157a, (String) this.f33158b.mo10447a(t));
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$g */
    static final class C12500g<T> extends C12491n<List<T>> {

        /* renamed from: a */
        private final C12475f<T, C12461b> f33159a;

        C12500g(C12475f<T, C12461b> fVar) {
            this.f33159a = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo30482a(RequestBuilder requestBuilder, List<T> list) throws IOException {
            if (list != null) {
                for (T a : list) {
                    C12461b bVar = (C12461b) this.f33159a.mo10447a(a);
                    requestBuilder.mo30407a(bVar.f33095a, bVar.f33096b);
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$h */
    static final class C12501h<T> extends C12491n<Map<String, T>> {

        /* renamed from: a */
        private final C12475f<T, String> f33160a;

        C12501h(C12475f<T, String> fVar) {
            this.f33160a = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo30482a(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.mo30407a(str, (String) this.f33160a.mo10447a(value));
                        } else {
                            StringBuilder sb = new StringBuilder("Header map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$i */
    static final class C12502i<T> extends C12491n<T> {

        /* renamed from: a */
        private final C12475f<T, String> f33161a;

        C12502i(C12475f<T, String> fVar) {
            this.f33161a = (C12475f) C12536v.m36431a(fVar, "converter == null");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30482a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                try {
                    requestBuilder.f33069i = Integer.parseInt((String) this.f33161a.mo10447a(t));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to MaxLength");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$j */
    static final class C12503j<T> extends C12491n<T> {

        /* renamed from: a */
        private final String f33162a;

        /* renamed from: b */
        private final C12475f<T, String> f33163b;

        C12503j(String str, C12475f<T, String> fVar) {
            this.f33162a = (String) C12536v.m36431a(str, "name == null");
            this.f33163b = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30482a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.mo30410b(this.f33162a, (String) this.f33163b.mo10447a(t));
                return;
            }
            StringBuilder sb = new StringBuilder("Method parameter \"");
            sb.append(this.f33162a);
            sb.append("\" value must not be null.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$k */
    static final class C12504k<T> extends C12491n<T> {

        /* renamed from: a */
        private final String f33164a;

        /* renamed from: b */
        private final C12475f<T, TypedOutput> f33165b;

        C12504k(String str, C12475f<T, TypedOutput> fVar) {
            this.f33164a = str;
            this.f33165b = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30482a(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.mo30406a(this.f33164a, (TypedOutput) this.f33165b.mo10447a(t));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$l */
    static final class C12505l<T> extends C12491n<Map<String, T>> {

        /* renamed from: a */
        private final C12475f<T, TypedOutput> f33166a;

        /* renamed from: b */
        private final String f33167b;

        C12505l(C12475f<T, TypedOutput> fVar, String str) {
            this.f33166a = fVar;
            this.f33167b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo30482a(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.mo30408a(str, this.f33167b, (TypedOutput) this.f33166a.mo10447a(value));
                        } else {
                            StringBuilder sb = new StringBuilder("Part map contained null value for key '");
                            sb.append(str);
                            sb.append("'.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$m */
    static final class C12506m<T> extends C12491n<T> {

        /* renamed from: a */
        private final String f33168a;

        /* renamed from: b */
        private final C12475f<T, String> f33169b;

        /* renamed from: c */
        private final boolean f33170c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30482a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.mo30409a(this.f33168a, (String) this.f33169b.mo10447a(t), this.f33170c);
                return;
            }
            StringBuilder sb = new StringBuilder("Path parameter \"");
            sb.append(this.f33168a);
            sb.append("\" value must not be null.");
            throw new IllegalArgumentException(sb.toString());
        }

        C12506m(String str, C12475f<T, String> fVar, boolean z) {
            this.f33168a = (String) C12536v.m36431a(str, "name == null");
            this.f33169b = fVar;
            this.f33170c = z;
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$n */
    static final class C12507n<T> extends C12491n<T> {

        /* renamed from: a */
        private final String f33171a;

        /* renamed from: b */
        private final C12475f<T, String> f33172b;

        /* renamed from: c */
        private final boolean f33173c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30482a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.mo30411b(this.f33171a, (String) this.f33172b.mo10447a(t), this.f33173c);
            }
        }

        C12507n(String str, C12475f<T, String> fVar, boolean z) {
            this.f33171a = (String) C12536v.m36431a(str, "name == null");
            this.f33172b = fVar;
            this.f33173c = z;
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$o */
    static final class C12508o<T> extends C12491n<Map<String, T>> {

        /* renamed from: a */
        private final C12475f<T, String> f33174a;

        /* renamed from: b */
        private final boolean f33175b;

        C12508o(C12475f<T, String> fVar, boolean z) {
            this.f33174a = fVar;
            this.f33175b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo30482a(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.mo30411b(str, (String) this.f33174a.mo10447a(value), this.f33175b);
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$p */
    static final class C12509p<T> extends C12491n<T> {

        /* renamed from: a */
        private final C12475f<T, String> f33176a;

        /* renamed from: b */
        private final boolean f33177b;

        C12509p(C12475f<T, String> fVar, boolean z) {
            this.f33176a = fVar;
            this.f33177b = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30482a(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.mo30411b((String) this.f33176a.mo10447a(t), null, this.f33177b);
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.n$q */
    static final class C12510q extends C12491n<Object> {
        C12510q() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30482a(RequestBuilder requestBuilder, Object obj) {
            requestBuilder.mo30405a(obj);
        }
    }

    C12491n() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo30482a(RequestBuilder requestBuilder, T t) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C12491n<Iterable<T>> mo30481a() {
        return new C12491n<Iterable<T>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo30482a(RequestBuilder requestBuilder, Iterable<T> iterable) throws IOException {
                if (iterable != null) {
                    for (T a : iterable) {
                        C12491n.this.mo30482a(requestBuilder, a);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C12491n<Object> mo30483b() {
        return new C12491n<Object>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo30482a(RequestBuilder requestBuilder, Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        C12491n.this.mo30482a(requestBuilder, Array.get(obj, i));
                    }
                }
            }
        };
    }
}
