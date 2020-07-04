package retrofit2.p1899a.p1901b;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import retrofit2.C48479e;

/* renamed from: retrofit2.a.b.b */
final class C48473b<T extends Message<T, ?>> implements C48479e<T, RequestBody> {

    /* renamed from: a */
    private static final MediaType f123592a = MediaType.parse("application/x-protobuf");

    /* renamed from: b */
    private final ProtoAdapter<T> f123593b;

    C48473b(ProtoAdapter<T> protoAdapter) {
        this.f123593b = protoAdapter;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public RequestBody mo123281a(T t) throws IOException {
        Buffer buffer = new Buffer();
        this.f123593b.encode((BufferedSink) buffer, t);
        return RequestBody.create(f123592a, buffer.snapshot());
    }
}
