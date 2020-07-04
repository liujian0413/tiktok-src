package com.bytedance.retrofit2.p637a;

import com.bytedance.retrofit2.C12520r;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.a.c */
public final class C12462c {

    /* renamed from: a */
    public final String f33097a;

    /* renamed from: b */
    public final String f33098b;

    /* renamed from: c */
    public final List<C12461b> f33099c;

    /* renamed from: d */
    public final TypedOutput f33100d;

    /* renamed from: e */
    public final int f33101e;

    /* renamed from: f */
    public final boolean f33102f;

    /* renamed from: g */
    public final int f33103g;

    /* renamed from: h */
    public final boolean f33104h;

    /* renamed from: i */
    public Object f33105i;

    /* renamed from: j */
    public String f33106j;

    /* renamed from: k */
    public C12520r f33107k;

    /* renamed from: com.bytedance.retrofit2.a.c$a */
    public static class C12463a {

        /* renamed from: a */
        String f33108a;

        /* renamed from: b */
        String f33109b;

        /* renamed from: c */
        List<C12461b> f33110c;

        /* renamed from: d */
        TypedOutput f33111d;

        /* renamed from: e */
        int f33112e;

        /* renamed from: f */
        boolean f33113f;

        /* renamed from: g */
        int f33114g;

        /* renamed from: h */
        boolean f33115h;

        /* renamed from: i */
        Object f33116i;

        /* renamed from: j */
        String f33117j;

        public C12463a() {
            this.f33108a = "GET";
        }

        /* renamed from: a */
        public final C12462c mo30449a() {
            if (this.f33109b != null) {
                return new C12462c(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: a */
        public final C12463a mo30446a(Object obj) {
            this.f33116i = obj;
            return this;
        }

        /* renamed from: a */
        public final C12463a mo30448a(List<C12461b> list) {
            this.f33110c = list;
            return this;
        }

        /* renamed from: a */
        public final C12463a mo30447a(String str) {
            if (str != null) {
                this.f33109b = str;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        C12463a(C12462c cVar) {
            this.f33108a = cVar.f33097a;
            this.f33109b = cVar.f33098b;
            this.f33110c = new LinkedList();
            this.f33110c.addAll(cVar.f33099c);
            this.f33111d = cVar.f33100d;
            this.f33112e = cVar.f33101e;
            this.f33113f = cVar.f33102f;
            this.f33114g = cVar.f33103g;
            this.f33115h = cVar.f33104h;
            this.f33116i = cVar.f33105i;
            this.f33117j = cVar.f33106j;
        }
    }

    /* renamed from: a */
    public final C12463a mo30443a() {
        return new C12463a(this);
    }

    /* renamed from: b */
    public final String mo30444b() {
        return m36265c(this.f33098b).getPath();
    }

    /* renamed from: c */
    private static URI m36265c(String str) throws RuntimeException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return m36266d(str);
            }
        }
    }

    /* renamed from: d */
    private static URI m36266d(String str) throws RuntimeException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final C12461b mo30442a(String str) {
        if (this.f33099c == null) {
            return null;
        }
        for (C12461b bVar : this.f33099c) {
            if (str.equalsIgnoreCase(bVar.f33095a)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final List<C12461b> mo30445b(String str) {
        ArrayList arrayList = null;
        if (this.f33099c == null) {
            return null;
        }
        for (C12461b bVar : this.f33099c) {
            if (str.equalsIgnoreCase(bVar.f33095a)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    C12462c(C12463a aVar) {
        if (aVar.f33109b != null) {
            this.f33098b = aVar.f33109b;
            if (aVar.f33108a != null) {
                this.f33097a = aVar.f33108a;
                if (aVar.f33110c == null) {
                    this.f33099c = Collections.emptyList();
                } else {
                    this.f33099c = Collections.unmodifiableList(new ArrayList(aVar.f33110c));
                }
                this.f33100d = aVar.f33111d;
                this.f33101e = aVar.f33112e;
                this.f33102f = aVar.f33113f;
                this.f33103g = aVar.f33114g;
                this.f33104h = aVar.f33115h;
                this.f33105i = aVar.f33116i;
                this.f33106j = aVar.f33117j;
                return;
            }
            throw new NullPointerException("Method must not be null.");
        }
        throw new NullPointerException("URL must not be null.");
    }

    public C12462c(String str, String str2, List<C12461b> list, TypedOutput typedOutput, int i, boolean z, int i2, boolean z2, Object obj) {
        this(str, str2, list, typedOutput, i, z, i2, z2, obj, "");
    }

    public C12462c(String str, String str2, List<C12461b> list, TypedOutput typedOutput, int i, boolean z, int i2, boolean z2, Object obj, String str3) {
        if (str == null) {
            throw new NullPointerException("Method must not be null.");
        } else if (str2 != null) {
            this.f33097a = str;
            this.f33098b = str2;
            if (list == null) {
                this.f33099c = Collections.emptyList();
            } else {
                this.f33099c = Collections.unmodifiableList(new ArrayList(list));
            }
            this.f33100d = typedOutput;
            this.f33101e = i;
            this.f33102f = z;
            this.f33103g = i2;
            this.f33104h = z2;
            this.f33105i = obj;
            this.f33106j = str3;
        } else {
            throw new NullPointerException("URL must not be null.");
        }
    }
}
