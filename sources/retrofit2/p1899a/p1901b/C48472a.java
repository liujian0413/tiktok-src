package retrofit2.p1899a.p1901b;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.C48479e;
import retrofit2.C48479e.C48480a;
import retrofit2.C48517m;

/* renamed from: retrofit2.a.b.a */
public final class C48472a extends C48480a {
    private C48472a() {
    }

    /* renamed from: a */
    public static C48472a m150174a() {
        return new C48472a();
    }

    /* renamed from: a */
    public final C48479e<ResponseBody, ?> mo123279a(Type type, Annotation[] annotationArr, C48517m mVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C48474c(ProtoAdapter.get(cls));
    }

    /* renamed from: a */
    public final C48479e<?, RequestBody> mo123280a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C48517m mVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C48473b(ProtoAdapter.get(cls));
    }
}
