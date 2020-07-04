package retrofit2.p1899a.p1900a;

import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.stream.C6720b;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.C48479e;

/* renamed from: retrofit2.a.a.b */
final class C48470b<T> implements C48479e<T, RequestBody> {

    /* renamed from: a */
    private static final MediaType f123586a = MediaType.parse("application/json; charset=UTF-8");

    /* renamed from: b */
    private static final Charset f123587b = Charset.forName("UTF-8");

    /* renamed from: c */
    private final C6600e f123588c;

    /* renamed from: d */
    private final C6715r<T> f123589d;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public RequestBody mo123281a(T t) throws IOException {
        Buffer buffer = new Buffer();
        C6720b a = this.f123588c.mo15969a((Writer) new OutputStreamWriter(buffer.outputStream(), f123587b));
        this.f123589d.write(a, t);
        a.close();
        return RequestBody.create(f123586a, buffer.readByteString());
    }

    C48470b(C6600e eVar, C6715r<T> rVar) {
        this.f123588c = eVar;
        this.f123589d = rVar;
    }
}
