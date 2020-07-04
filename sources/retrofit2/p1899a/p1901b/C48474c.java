package retrofit2.p1899a.p1901b;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.C48479e;

/* renamed from: retrofit2.a.b.c */
final class C48474c<T extends Message<T, ?>> implements C48479e<ResponseBody, T> {

    /* renamed from: a */
    private final ProtoAdapter<T> f123594a;

    C48474c(ProtoAdapter<T> protoAdapter) {
        this.f123594a = protoAdapter;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo123281a(ResponseBody responseBody) throws IOException {
        try {
            return (Message) this.f123594a.decode(responseBody.source());
        } finally {
            responseBody.close();
        }
    }
}
