package com.p280ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.C12475f;
import com.bytedance.retrofit2.mime.TypedInput;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.app.api.q */
public final class C22855q<T extends Message<T, ?>> implements C12475f<TypedInput, T> {

    /* renamed from: a */
    private final ProtoAdapter<T> f60584a;

    public C22855q(ProtoAdapter<T> protoAdapter) {
        this.f60584a = protoAdapter;
    }

    /* renamed from: a */
    public final T mo10447a(TypedInput typedInput) throws IOException {
        try {
            T t = (Message) this.f60584a.decode(typedInput.mo10444in());
            return t;
        } finally {
            typedInput.mo10444in().reset();
        }
    }
}
