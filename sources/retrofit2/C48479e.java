package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: retrofit2.e */
public interface C48479e<F, T> {

    /* renamed from: retrofit2.e$a */
    public static abstract class C48480a {
        /* renamed from: a */
        public C48479e<ResponseBody, ?> mo123279a(Type type, Annotation[] annotationArr, C48517m mVar) {
            return null;
        }

        /* renamed from: a */
        public C48479e<?, RequestBody> mo123280a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C48517m mVar) {
            return null;
        }
    }

    /* renamed from: a */
    T mo123281a(F f) throws IOException;
}
