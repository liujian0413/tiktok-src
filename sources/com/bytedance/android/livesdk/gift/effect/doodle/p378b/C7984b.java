package com.bytedance.android.livesdk.gift.effect.doodle.p378b;

import com.bytedance.android.livesdk.gift.effect.normal.model.C8052a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.b.b */
public final class C7984b extends C8052a {

    /* renamed from: a */
    public float f21659a;

    /* renamed from: b */
    public float f21660b;

    /* renamed from: c */
    public List<C7983a> f21661c = new ArrayList();

    /* renamed from: d */
    public float f21662d;

    /* renamed from: e */
    public float f21663e;

    /* renamed from: f */
    public float f21664f;

    /* renamed from: g */
    public float f21665g;

    /* renamed from: h */
    public int f21666h;

    public C7984b(long j) {
        super(j);
    }

    /* renamed from: a */
    public final void mo20885a(float f, float f2) {
        this.f21659a = f;
        this.f21660b = f2;
    }

    /* renamed from: b */
    public final void mo20887b(float f, float f2) {
        this.f21664f = f;
        this.f21665g = f2;
    }

    /* renamed from: a */
    public final void mo20886a(int i, int i2, String str) {
        if (str != null) {
            this.f21661c.add(new C7983a(i, i2, str));
        }
    }
}
