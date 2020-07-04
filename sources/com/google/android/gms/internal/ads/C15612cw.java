package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.cw */
public final class C15612cw extends C15655ek {

    /* renamed from: h */
    private static final int f44241h = Color.rgb(12, 174, 206);

    /* renamed from: i */
    private static final int f44242i;

    /* renamed from: j */
    private static final int f44243j;

    /* renamed from: k */
    private static final int f44244k = f44241h;

    /* renamed from: a */
    public final List<C15620dd> f44245a = new ArrayList();

    /* renamed from: b */
    public final int f44246b;

    /* renamed from: c */
    public final int f44247c;

    /* renamed from: d */
    public final int f44248d;

    /* renamed from: e */
    public final int f44249e;

    /* renamed from: f */
    public final int f44250f;

    /* renamed from: g */
    public final boolean f44251g;

    /* renamed from: l */
    private final String f44252l;

    /* renamed from: m */
    private final List<C15658en> f44253m = new ArrayList();

    public C15612cw(String str, List<C15620dd> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f44252l = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                C15620dd ddVar = (C15620dd) list.get(i3);
                this.f44245a.add(ddVar);
                this.f44253m.add(ddVar);
            }
        }
        this.f44246b = num != null ? num.intValue() : f44243j;
        this.f44247c = num2 != null ? num2.intValue() : f44244k;
        this.f44248d = num3 != null ? num3.intValue() : 12;
        this.f44249e = i;
        this.f44250f = i2;
        this.f44251g = z;
    }

    /* renamed from: a */
    public final String mo41472a() {
        return this.f44252l;
    }

    /* renamed from: b */
    public final List<C15658en> mo41473b() {
        return this.f44253m;
    }

    static {
        int rgb = Color.rgb(204, 204, 204);
        f44242i = rgb;
        f44243j = rgb;
    }
}
