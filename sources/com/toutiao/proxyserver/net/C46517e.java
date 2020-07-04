package com.toutiao.proxyserver.net;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12461b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.toutiao.proxyserver.net.e */
public final class C46517e implements Closeable {

    /* renamed from: a */
    public final C46514d f119847a;

    /* renamed from: b */
    public final int f119848b;

    /* renamed from: c */
    public final List<C46513c> f119849c = new ArrayList();

    /* renamed from: d */
    final C12534t<?> f119850d;

    /* renamed from: e */
    final Response f119851e;

    /* renamed from: a */
    public final boolean mo115670a() {
        if (this.f119848b < 200 || this.f119848b >= 300) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final String mo115671b() {
        if (this.f119850d != null) {
            return "HTTP/1.1";
        }
        return this.f119851e.protocol.toString();
    }

    /* renamed from: c */
    public final String mo115672c() {
        if (this.f119850d != null) {
            return this.f119850d.f33301a.f33120c;
        }
        return this.f119851e.message;
    }

    /* renamed from: d */
    public final InputStream mo115674d() {
        if (this.f119850d != null) {
            TypedInput typedInput = this.f119850d.f33301a.f33122e;
            if (typedInput == null) {
                return null;
            }
            try {
                return typedInput.mo10444in();
            } catch (IOException unused) {
                return null;
            }
        } else {
            ResponseBody responseBody = this.f119851e.body;
            if (responseBody == null) {
                return null;
            }
            return responseBody.byteStream();
        }
    }

    public final void close() throws IOException {
        InputStream inputStream;
        if (this.f119850d != null) {
            TypedInput typedInput = this.f119850d.f33301a.f33122e;
            if (typedInput == null) {
                inputStream = null;
            } else {
                inputStream = typedInput.mo10444in();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return;
        }
        if (this.f119851e != null) {
            this.f119851e.close();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse{request=");
        sb.append(this.f119847a);
        sb.append(", code=");
        sb.append(this.f119848b);
        sb.append(", headers=");
        sb.append(this.f119849c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo115668a(String str) {
        return mo115669a(str, null);
    }

    /* renamed from: a */
    public final String mo115669a(String str, String str2) {
        for (C46513c cVar : this.f119849c) {
            if (cVar.f119833a.equalsIgnoreCase(str)) {
                return cVar.f119834b;
            }
        }
        return str2;
    }

    C46517e(C12534t<?> tVar, C46514d dVar) {
        this.f119847a = dVar;
        this.f119850d = tVar;
        this.f119851e = null;
        this.f119848b = tVar.mo30510a();
        List<C12461b> list = tVar.f33301a.f33121d;
        if (list != null) {
            for (C12461b bVar : list) {
                if (!(bVar.f33095a.length() == 0 || bVar.f33096b.length() == 0)) {
                    this.f119849c.add(new C46513c(bVar.f33095a, bVar.f33096b));
                }
            }
        }
    }

    C46517e(Response response, C46514d dVar) {
        this.f119847a = dVar;
        this.f119851e = response;
        this.f119850d = null;
        this.f119848b = response.code;
        Headers headers = response.headers;
        if (headers != null) {
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                if (!(headers.name(i).length() == 0 || headers.value(i).length() == 0)) {
                    this.f119849c.add(new C46513c(headers.name(i), headers.value(i)));
                }
            }
        }
    }
}
