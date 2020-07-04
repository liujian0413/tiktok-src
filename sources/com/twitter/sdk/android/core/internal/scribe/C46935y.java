package com.twitter.sdk.android.core.internal.scribe;

import com.twitter.sdk.android.core.internal.scribe.C46923r.C46927c;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.y */
final /* synthetic */ class C46935y implements C46927c {

    /* renamed from: a */
    private final boolean[] f120354a;

    /* renamed from: b */
    private final ByteArrayOutputStream f120355b;

    C46935y(boolean[] zArr, ByteArrayOutputStream byteArrayOutputStream) {
        this.f120354a = zArr;
        this.f120355b = byteArrayOutputStream;
    }

    /* renamed from: a */
    public final void mo118073a(InputStream inputStream, int i) {
        ScribeFilesSender.m146682a(this.f120354a, this.f120355b, inputStream, i);
    }
}
