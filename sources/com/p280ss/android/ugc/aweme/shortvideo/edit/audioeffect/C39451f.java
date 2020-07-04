package com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.support.p022v4.util.C0894f;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f */
public final class C39451f {

    /* renamed from: a */
    private C0894f<String, byte[]> f102410a;

    public C39451f() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public final void mo98277a() {
        this.f102410a.mo3344a(-1);
    }

    /* renamed from: a */
    public final void mo98278a(int i) {
        this.f102410a.mo3344a(i);
    }

    private C39451f(int i) {
        int min = Math.min((int) (Runtime.getRuntime().maxMemory() / 8), i);
        this.f102410a = new AudioPreprocessCache$1(min, min);
    }

    /* renamed from: a */
    public final byte[] mo98280a(String str) {
        if (str == null) {
            return null;
        }
        return (byte[]) this.f102410a.mo3341a(str);
    }

    /* renamed from: a */
    public final void mo98279a(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            this.f102410a.mo3342a(str, bArr);
        }
    }

    public /* synthetic */ C39451f(int i, int i2, C7571f fVar) {
        this(1048576);
    }
}
