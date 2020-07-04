package retrofit2.p1899a.p1900a;

import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.C48479e;
import retrofit2.C48479e.C48480a;
import retrofit2.C48517m;

/* renamed from: retrofit2.a.a.a */
public final class C48469a extends C48480a {

    /* renamed from: a */
    private final C6600e f123585a;

    /* renamed from: a */
    public static C48469a m150166a() {
        return m150167a(new C6600e());
    }

    private C48469a(C6600e eVar) {
        this.f123585a = eVar;
    }

    /* renamed from: a */
    public static C48469a m150167a(C6600e eVar) {
        if (eVar != null) {
            return new C48469a(eVar);
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: a */
    public final C48479e<ResponseBody, ?> mo123279a(Type type, Annotation[] annotationArr, C48517m mVar) {
        return new C48471c(this.f123585a, this.f123585a.mo15965a(C6597a.get(type)));
    }

    /* renamed from: a */
    public final C48479e<?, RequestBody> mo123280a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C48517m mVar) {
        return new C48470b(this.f123585a, this.f123585a.mo15965a(C6597a.get(type)));
    }
}
