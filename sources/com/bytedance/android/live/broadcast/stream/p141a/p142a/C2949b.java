package com.bytedance.android.live.broadcast.stream.p141a.p142a;

import com.bytedance.android.live.broadcast.stream.C2979e;
import java.io.FileNotFoundException;

/* renamed from: com.bytedance.android.live.broadcast.stream.a.a.b */
public final class C2949b extends C2948a {

    /* renamed from: c */
    private String f9186c;

    /* renamed from: a */
    public final void mo9688a() {
        this.f9184a.mo9698a((String) null, 1.0f);
    }

    /* renamed from: a */
    public final void mo9689a(String str) throws FileNotFoundException {
        if (!C2979e.m11576a(str)) {
            StringBuilder sb = new StringBuilder("Filter file not exits:");
            sb.append(str);
            throw new FileNotFoundException(sb.toString());
        } else if (this.f9184a != null) {
            this.f9186c = str;
            this.f9184a.mo9698a(this.f9186c, 1.0f);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }

    /* renamed from: a */
    public final int mo9687a(String str, String str2, float f) throws FileNotFoundException {
        if (!C2979e.m11576a(str)) {
            StringBuilder sb = new StringBuilder("Filter file not exits:");
            sb.append(str);
            throw new FileNotFoundException(sb.toString());
        } else if (!C2979e.m11576a(str2)) {
            StringBuilder sb2 = new StringBuilder("Filter file not exits:");
            sb2.append(str2);
            throw new FileNotFoundException(sb2.toString());
        } else if (this.f9184a != null) {
            return this.f9184a.mo9691a(str, str2, f);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }
}
