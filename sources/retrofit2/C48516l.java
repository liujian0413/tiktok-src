package retrofit2;

import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: retrofit2.l */
public final class C48516l<T> {

    /* renamed from: a */
    public final Response f123663a;

    /* renamed from: b */
    public final T f123664b;

    /* renamed from: c */
    public final ResponseBody f123665c;

    /* renamed from: a */
    public final int mo123307a() {
        return this.f123663a.code;
    }

    /* renamed from: b */
    public final String mo123308b() {
        return this.f123663a.message;
    }

    /* renamed from: c */
    public final Headers mo123309c() {
        return this.f123663a.headers;
    }

    /* renamed from: d */
    public final boolean mo123310d() {
        return this.f123663a.isSuccessful();
    }

    public final String toString() {
        return this.f123663a.toString();
    }

    /* renamed from: a */
    public static <T> C48516l<T> m150262a(T t, Response response) {
        C48522o.m150306a(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new C48516l<>(response, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public static <T> C48516l<T> m150263a(ResponseBody responseBody, Response response) {
        C48522o.m150306a(responseBody, "body == null");
        C48522o.m150306a(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new C48516l<>(response, null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    private C48516l(Response response, T t, ResponseBody responseBody) {
        this.f123663a = response;
        this.f123664b = t;
        this.f123665c = responseBody;
    }
}
