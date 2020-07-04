package com.bytedance.frameworks.baselib.network.http.retrofit.p514a.p515a;

import com.bytedance.retrofit2.C12475f;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.C6600e;
import com.google.gson.C6715r;
import com.google.gson.stream.C6720b;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a.a.b */
final class C10177b<T> implements C12475f<T, TypedOutput> {

    /* renamed from: a */
    private static final Charset f27707a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final C6600e f27708b;

    /* renamed from: c */
    private final C6715r<T> f27709c;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public TypedOutput mo10447a(T t) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(PreloadTask.BYTE_UNIT_NUMBER);
        C6720b a = this.f27708b.mo15969a((Writer) new OutputStreamWriter(byteArrayOutputStream, f27707a));
        this.f27709c.write(a, t);
        a.close();
        return new TypedByteArray("application/json; charset=UTF-8", byteArrayOutputStream.toByteArray(), new String[0]);
    }

    C10177b(C6600e eVar, C6715r<T> rVar) {
        this.f27708b = eVar;
        this.f27709c = rVar;
    }
}
