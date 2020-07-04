package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.tk */
final class C16060tk implements C15477afu<List<C15620dd>, C15612cw> {

    /* renamed from: a */
    private final /* synthetic */ String f45033a;

    /* renamed from: b */
    private final /* synthetic */ Integer f45034b;

    /* renamed from: c */
    private final /* synthetic */ Integer f45035c;

    /* renamed from: d */
    private final /* synthetic */ int f45036d;

    /* renamed from: e */
    private final /* synthetic */ int f45037e;

    /* renamed from: f */
    private final /* synthetic */ int f45038f;

    /* renamed from: g */
    private final /* synthetic */ int f45039g;

    /* renamed from: h */
    private final /* synthetic */ boolean f45040h;

    C16060tk(C16055tf tfVar, String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.f45033a = str;
        this.f45034b = num;
        this.f45035c = num2;
        this.f45036d = i;
        this.f45037e = i2;
        this.f45038f = i3;
        this.f45039g = i4;
        this.f45040h = z;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo39250a(Object obj) {
        List list = (List) obj;
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = this.f45033a;
        Integer num2 = this.f45034b;
        Integer num3 = this.f45035c;
        if (this.f45036d > 0) {
            num = Integer.valueOf(this.f45036d);
        }
        C15612cw cwVar = new C15612cw(str, list, num2, num3, num, this.f45037e + this.f45038f, this.f45039g, this.f45040h);
        return cwVar;
    }
}
