package com.toutiao.proxyserver.net;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.toutiao.proxyserver.net.d */
public final class C46514d {

    /* renamed from: a */
    public final String f119835a;

    /* renamed from: b */
    public final String f119836b;

    /* renamed from: c */
    public final List<C46513c> f119837c;

    /* renamed from: d */
    public final long f119838d;

    /* renamed from: e */
    public final long f119839e;

    /* renamed from: f */
    public final long f119840f;

    /* renamed from: com.toutiao.proxyserver.net.d$a */
    public static final class C46516a {

        /* renamed from: a */
        public String f119841a;

        /* renamed from: b */
        public String f119842b;

        /* renamed from: c */
        public final List<C46513c> f119843c = new ArrayList();

        /* renamed from: d */
        public long f119844d;

        /* renamed from: e */
        public long f119845e;

        /* renamed from: f */
        public long f119846f;

        /* renamed from: a */
        public final C46514d mo115664a() {
            if (this.f119841a != null) {
                if (this.f119842b == null) {
                    this.f119842b = "GET";
                }
                return new C46514d(this);
            }
            throw new IllegalStateException("url is null");
        }

        /* renamed from: a */
        public final C46516a mo115661a(long j) {
            this.f119844d = j;
            return this;
        }

        /* renamed from: b */
        public final C46516a mo115665b(long j) {
            this.f119845e = j;
            return this;
        }

        /* renamed from: c */
        public final C46516a mo115667c(long j) {
            this.f119846f = j;
            return this;
        }

        /* renamed from: a */
        public final C46516a mo115662a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("url is null");
            } else if (str.startsWith("http://") || str.startsWith("https://")) {
                this.f119841a = str;
                return this;
            } else {
                StringBuilder sb = new StringBuilder("url should start with http:// or https://, url: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: b */
        public final C46516a mo115666b(String str) {
            if (str != null) {
                String upperCase = str.toUpperCase();
                if ("GET".equals(upperCase) || "HEAD".equals(upperCase)) {
                    this.f119842b = upperCase;
                    return this;
                }
                throw new IllegalArgumentException("for now only GET and HEAD is support");
            }
            throw new IllegalArgumentException("method is null");
        }

        /* renamed from: a */
        public final C46516a mo115663a(String str, String str2) {
            if (str == null || str2 == null) {
                return this;
            }
            this.f119843c.add(new C46513c(str, str2));
            return this;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest{url='");
        sb.append(this.f119835a);
        sb.append('\'');
        sb.append(", method='");
        sb.append(this.f119836b);
        sb.append('\'');
        sb.append(", headers=");
        sb.append(this.f119837c);
        sb.append(", connectTimeout=");
        sb.append(this.f119838d);
        sb.append(", readTimeout=");
        sb.append(this.f119839e);
        sb.append(", writeTimeout=");
        sb.append(this.f119840f);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo115659a(String str) {
        return m146209a(str, null);
    }

    private C46514d(C46516a aVar) {
        this.f119835a = aVar.f119841a;
        this.f119836b = aVar.f119842b;
        this.f119837c = aVar.f119843c;
        this.f119838d = aVar.f119844d;
        this.f119839e = aVar.f119845e;
        this.f119840f = aVar.f119846f;
    }

    /* renamed from: a */
    private String m146209a(String str, String str2) {
        for (C46513c cVar : this.f119837c) {
            if (cVar.f119833a.equalsIgnoreCase(str)) {
                return cVar.f119834b;
            }
        }
        return null;
    }
}
