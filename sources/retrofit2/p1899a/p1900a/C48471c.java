package retrofit2.p1899a.p1900a;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.C48479e;

/* renamed from: retrofit2.a.a.c */
final class C48471c<T> implements C48479e<ResponseBody, T> {

    /* renamed from: a */
    private final C6600e f123590a;

    /* renamed from: b */
    private final C6715r<T> f123591b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo123281a(ResponseBody responseBody) throws IOException {
        try {
            return this.f123591b.read(this.f123590a.mo15968a(responseBody.charStream()));
        } finally {
            responseBody.close();
        }
    }

    C48471c(C6600e eVar, C6715r<T> rVar) {
        this.f123590a = eVar;
        this.f123591b = rVar;
    }
}
