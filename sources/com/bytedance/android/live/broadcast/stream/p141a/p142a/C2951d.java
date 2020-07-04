package com.bytedance.android.live.broadcast.stream.p141a.p142a;

import com.bytedance.android.live.broadcast.stream.C2979e;
import java.io.FileNotFoundException;

/* renamed from: com.bytedance.android.live.broadcast.stream.a.a.d */
public final class C2951d extends C2948a {
    /* renamed from: a */
    public final void mo9706a() {
        if (this.f9184a != null) {
            this.f9184a.mo9697a((String) null);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    /* renamed from: a */
    public final void mo9711a(boolean z) {
        if (this.f9184a != null) {
            this.f9184a.mo9701a(z);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    /* renamed from: a */
    public final void mo9712a(String[] strArr) {
        int i;
        if (this.f9184a != null) {
            C2950c cVar = this.f9184a;
            if (strArr != null) {
                i = strArr.length;
            } else {
                i = 0;
            }
            cVar.mo9692a(strArr, i);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    /* renamed from: a */
    public final void mo9707a(int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder("mode is ");
            sb.append(i);
            sb.append("order type is 0");
            throw new IllegalStateException(sb.toString());
        } else if (this.f9184a != null) {
            this.f9184a.mo9690a(i, 0);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }

    /* renamed from: a */
    public final void mo9710a(String str, boolean z) throws FileNotFoundException {
        if (!C2979e.m11576a(str)) {
            StringBuilder sb = new StringBuilder("Filter file not exists:");
            sb.append(str);
            throw new FileNotFoundException(sb.toString());
        } else if (this.f9184a != null) {
            this.f9184a.mo9700a(str, z);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }

    /* renamed from: a */
    public final void mo9708a(String str, String str2, float f) throws FileNotFoundException {
        if (!C2979e.m11576a(str)) {
            StringBuilder sb = new StringBuilder("Filter file not exists:");
            sb.append(str);
            throw new FileNotFoundException(sb.toString());
        } else if (this.f9184a != null) {
            this.f9184a.mo9702b(str, str2, f);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }

    /* renamed from: a */
    public final void mo9709a(String str, String str2, boolean z) {
        if ("".equals(str)) {
            throw new RuntimeException("renderCacheKey is Null");
        } else if ("".equals(str2)) {
            throw new RuntimeException("resPath is Null");
        } else if (this.f9184a != null) {
            this.f9184a.mo9699a(str, str2, z);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }
}
