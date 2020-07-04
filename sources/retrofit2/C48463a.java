package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.C48479e.C48480a;
import retrofit2.p363b.C7747w;

/* renamed from: retrofit2.a */
final class C48463a extends C48480a {

    /* renamed from: retrofit2.a$a */
    static final class C48464a implements C48479e<ResponseBody, ResponseBody> {

        /* renamed from: a */
        static final C48464a f123580a = new C48464a();

        C48464a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo123281a(Object obj) throws IOException {
            return m150156a((ResponseBody) obj);
        }

        /* renamed from: a */
        private static ResponseBody m150156a(ResponseBody responseBody) throws IOException {
            try {
                return C48522o.m150311a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* renamed from: retrofit2.a$b */
    static final class C48465b implements C48479e<RequestBody, RequestBody> {

        /* renamed from: a */
        static final C48465b f123581a = new C48465b();

        C48465b() {
        }

        /* renamed from: a */
        private static RequestBody m150158a(RequestBody requestBody) throws IOException {
            return requestBody;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo123281a(Object obj) throws IOException {
            return m150158a((RequestBody) obj);
        }
    }

    /* renamed from: retrofit2.a$c */
    static final class C48466c implements C48479e<ResponseBody, ResponseBody> {

        /* renamed from: a */
        static final C48466c f123582a = new C48466c();

        C48466c() {
        }

        /* renamed from: a */
        private static ResponseBody m150160a(ResponseBody responseBody) throws IOException {
            return responseBody;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo123281a(Object obj) throws IOException {
            return m150160a((ResponseBody) obj);
        }
    }

    /* renamed from: retrofit2.a$d */
    static final class C48467d implements C48479e<Object, String> {

        /* renamed from: a */
        static final C48467d f123583a = new C48467d();

        C48467d() {
        }

        /* renamed from: b */
        private static String m150162b(Object obj) {
            return obj.toString();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo123281a(Object obj) throws IOException {
            return m150162b(obj);
        }
    }

    /* renamed from: retrofit2.a$e */
    static final class C48468e implements C48479e<ResponseBody, Void> {

        /* renamed from: a */
        static final C48468e f123584a = new C48468e();

        C48468e() {
        }

        /* renamed from: a */
        private static Void m150164a(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return null;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo123281a(Object obj) throws IOException {
            return m150164a((ResponseBody) obj);
        }
    }

    C48463a() {
    }

    /* renamed from: a */
    public final C48479e<ResponseBody, ?> mo123279a(Type type, Annotation[] annotationArr, C48517m mVar) {
        if (type == ResponseBody.class) {
            if (C48522o.m150315a(annotationArr, C7747w.class)) {
                return C48466c.f123582a;
            }
            return C48464a.f123580a;
        } else if (type == Void.class) {
            return C48468e.f123584a;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final C48479e<?, RequestBody> mo123280a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C48517m mVar) {
        if (RequestBody.class.isAssignableFrom(C48522o.m150304a(type))) {
            return C48465b.f123581a;
        }
        return null;
    }
}
