package com.p280ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.C12475f;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okhttp3.MediaType;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: com.ss.android.ugc.aweme.app.api.p */
final class C22854p<T extends Message<T, ?>> implements C12475f<T, TypedOutput> {

    /* renamed from: a */
    private static final MediaType f60582a = MediaType.parse("application/x-protobuf");

    /* renamed from: b */
    private final ProtoAdapter<T> f60583b;

    C22854p(ProtoAdapter<T> protoAdapter) {
        this.f60583b = protoAdapter;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public TypedOutput mo10447a(T t) throws IOException {
        Buffer buffer = new Buffer();
        this.f60583b.encode((BufferedSink) buffer, t);
        return new TypedByteArray(f60582a.type, buffer.readByteArray(), new String[0]);
    }
}
