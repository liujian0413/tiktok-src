package com.p280ss.android.medialib.camera;

import android.content.Context;
import android.graphics.Point;

/* renamed from: com.ss.android.medialib.camera.e */
public final class C19663e {

    /* renamed from: a */
    public static final String[] f53252a = {"auto", "portrait", "party", "sunset", "candlelight", "night", "hdr", "action", "landscape", "snow"};

    /* renamed from: b */
    public Context f53253b;

    /* renamed from: c */
    public int f53254c = 1;

    /* renamed from: d */
    public int f53255d = 7;

    /* renamed from: e */
    public int f53256e = 30;

    /* renamed from: f */
    public int f53257f = 1280;

    /* renamed from: g */
    public int f53258g = 720;

    /* renamed from: h */
    public boolean f53259h;

    /* renamed from: i */
    public int f53260i = -1;

    /* renamed from: j */
    public int f53261j = -1;

    /* renamed from: k */
    public boolean f53262k;

    /* renamed from: l */
    public boolean f53263l;

    /* renamed from: m */
    public boolean f53264m;

    /* renamed from: n */
    public Point f53265n;

    /* renamed from: o */
    public int f53266o = 1;

    /* renamed from: p */
    public int f53267p = 1;

    /* renamed from: q */
    public byte f53268q = 1;

    /* renamed from: r */
    public String f53269r = "auto";

    /* renamed from: s */
    public boolean f53270s = true;

    /* renamed from: a */
    public final boolean mo52306a() {
        if (this.f53253b == null || this.f53257f <= 0 || this.f53258g <= 0 || this.f53255d <= 0 || this.f53256e < this.f53255d) {
            return false;
        }
        return true;
    }

    public C19663e(Context context, int i) {
        this.f53253b = context;
        this.f53254c = i;
    }
}
