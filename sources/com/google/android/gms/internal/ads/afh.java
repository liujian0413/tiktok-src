package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

final /* synthetic */ class afh implements afl {

    /* renamed from: a */
    private final String f40150a;

    /* renamed from: b */
    private final String f40151b;

    /* renamed from: c */
    private final Map f40152c;

    /* renamed from: d */
    private final byte[] f40153d;

    afh(String str, String str2, Map map, byte[] bArr) {
        this.f40150a = str;
        this.f40151b = str2;
        this.f40152c = map;
        this.f40153d = bArr;
    }

    /* renamed from: a */
    public final void mo39283a(JsonWriter jsonWriter) {
        afg.m45753a(this.f40150a, this.f40151b, this.f40152c, this.f40153d, jsonWriter);
    }
}
