package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.or */
public final class C15932or {

    /* renamed from: a */
    public final int f44829a;

    /* renamed from: b */
    public final int f44830b;

    /* renamed from: c */
    public final InputStream f44831c;

    /* renamed from: d */
    private final List<bky> f44832d;

    public C15932or(int i, List<bky> list) {
        this(i, list, -1, null);
    }

    public C15932or(int i, List<bky> list, int i2, InputStream inputStream) {
        this.f44829a = i;
        this.f44832d = list;
        this.f44830b = i2;
        this.f44831c = inputStream;
    }

    /* renamed from: a */
    public final List<bky> mo41814a() {
        return Collections.unmodifiableList(this.f44832d);
    }
}
