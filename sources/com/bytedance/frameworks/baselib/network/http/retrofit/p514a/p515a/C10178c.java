package com.bytedance.frameworks.baselib.network.http.retrofit.p514a.p515a;

import com.bytedance.retrofit2.C12475f;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.C6600e;
import com.google.gson.C6715r;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a.a.c */
final class C10178c<T> implements C12475f<TypedInput, T> {

    /* renamed from: a */
    private final C6600e f27710a;

    /* renamed from: b */
    private final C6715r<T> f27711b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo10447a(TypedInput typedInput) throws IOException {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.mo10444in(), str);
        try {
            return this.f27711b.read(this.f27710a.mo15968a((Reader) inputStreamReader));
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    C10178c(C6600e eVar, C6715r<T> rVar) {
        this.f27710a = eVar;
        this.f27711b = rVar;
    }
}
