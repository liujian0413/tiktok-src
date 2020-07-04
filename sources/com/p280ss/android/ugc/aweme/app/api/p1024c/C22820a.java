package com.p280ss.android.ugc.aweme.app.api.p1024c;

import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.retrofit2.C12475f;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.app.api.C22855q;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.app.api.c.a */
public final class C22820a implements C12475f<TypedInput, C22823d> {

    /* renamed from: a */
    static String f60534a = "wire_convert";

    /* renamed from: c */
    private static AtomicBoolean f60535c = new AtomicBoolean(true);

    /* renamed from: b */
    public final Type f60536b;

    /* renamed from: d */
    private final C6600e f60537d;

    /* renamed from: e */
    private final C22855q f60538e;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C22823d mo10447a(TypedInput typedInput) throws IOException {
        return C22822c.m75256a(this, typedInput);
    }

    /* renamed from: a */
    private static void m75250a(boolean z) {
        C7492s.m23301b("").mo19294a(C7333a.m23044b()).mo19325f((C7326g<? super T>) new C22821b<Object>(z));
    }

    /* renamed from: c */
    private C22823d m75253c(TypedInput typedInput) throws IOException {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.mo10444in(), str);
        try {
            return C22823d.m75258a(this.f60537d.mo15965a(C6597a.get(this.f60536b)).read(this.f60537d.mo15968a((Reader) inputStreamReader)));
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public final C22823d mo59835a(TypedInput typedInput) throws IOException {
        boolean z;
        String mimeType = typedInput.mimeType();
        if (TextUtils.isEmpty(mimeType) || !mimeType.contains("json")) {
            z = false;
        } else {
            z = true;
        }
        if (f60535c.get()) {
            f60535c.getAndSet(false);
            m75250a(z);
        }
        if (!z) {
            return C22823d.m75257a(this.f60538e.mo10447a(typedInput));
        }
        C6921a.m21562b("ComposePbAndJson", "response json");
        return m75253c(typedInput);
    }

    public C22820a(ParameterizedType parameterizedType, C6600e eVar) {
        this.f60537d = eVar;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        this.f60538e = new C22855q(ProtoAdapter.get((Class) actualTypeArguments[0]));
        this.f60536b = actualTypeArguments[1];
    }

    /* renamed from: a */
    static final /* synthetic */ void m75251a(boolean z, String str) throws Exception {
        JSONObject jSONObject = new JSONObject();
        String str2 = "proto";
        if (z) {
            str2 = "json";
        }
        try {
            jSONObject.put("service", str2);
            jSONObject.put("type", str2);
        } catch (Throwable th) {
            C6921a.m21559a(th);
        }
        C6379c.m19826a(f60534a, jSONObject);
    }
}
