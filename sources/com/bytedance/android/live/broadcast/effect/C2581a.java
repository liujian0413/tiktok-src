package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p368g.p370b.C7853a;
import com.bytedance.android.livesdk.sharedpref.C8946b;

/* renamed from: com.bytedance.android.live.broadcast.effect.a */
public abstract class C2581a {

    /* renamed from: g */
    private static float[] f8286g = {0.0f, 0.3f, 0.43f, 0.57f, 0.7f, 0.8f};

    /* renamed from: a */
    public float f8287a;

    /* renamed from: b */
    public float f8288b;

    /* renamed from: c */
    public float f8289c;

    /* renamed from: d */
    public float f8290d;

    /* renamed from: e */
    public float f8291e;

    /* renamed from: f */
    public int f8292f;

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract void mo9202e(float f);

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract void mo9203f(float f);

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public abstract void mo9204g(float f);

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public abstract void mo9205h(float f);

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public abstract void mo9206i(float f);

    public C2581a() {
        m10601c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo9198b() {
        mo9201d(((Float) C8946b.f24362N.mo22117a()).floatValue());
        mo9196a(((Float) C8946b.f24363O.mo22117a()).floatValue());
        mo9200c(((Float) C8946b.f24365Q.mo22117a()).floatValue());
        mo9199b(((Float) C8946b.f24364P.mo22117a()).floatValue());
    }

    /* renamed from: a */
    public static void m10600a() {
        if (((Float) C8946b.f24362N.mo22117a()).floatValue() < 0.0f) {
            C8946b.f24362N.mo22118a(Float.valueOf(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21223b));
        }
        if (((Float) C8946b.f24363O.mo22117a()).floatValue() < 0.0f) {
            C8946b.f24363O.mo22118a(Float.valueOf(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21218b.f21223b));
        }
        if (((Float) C8946b.f24364P.mo22117a()).floatValue() < 0.0f) {
            C8946b.f24364P.mo22118a(Float.valueOf(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21219c.f21223b));
        }
        if (((Float) C8946b.f24365Q.mo22117a()).floatValue() < 0.0f) {
            C8946b.f24365Q.mo22118a(Float.valueOf(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21220d.f21223b));
        }
    }

    /* renamed from: c */
    private void m10601c() {
        m10600a();
        this.f8291e = ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21221e.f21222a * ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21221e.f21223b;
        this.f8290d = ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a * ((Float) C8946b.f24362N.mo22117a()).floatValue();
        this.f8287a = ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21218b.f21222a * ((Float) C8946b.f24363O.mo22117a()).floatValue();
        this.f8288b = ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21219c.f21222a * ((Float) C8946b.f24364P.mo22117a()).floatValue();
        this.f8289c = ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21220d.f21222a * ((Float) C8946b.f24365Q.mo22117a()).floatValue();
        this.f8292f = ((Integer) C8946b.f24366R.mo22117a()).intValue();
    }

    /* renamed from: a */
    public final void mo9196a(float f) {
        if (((Float) C8946b.f24363O.mo22117a()).floatValue() != f) {
            C8946b.f24363O.mo22118a(Float.valueOf(f));
            this.f8287a = ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21218b.f21222a * f;
        }
        mo9202e(this.f8287a);
    }

    /* renamed from: c */
    public final void mo9200c(float f) {
        if (((Float) C8946b.f24365Q.mo22117a()).floatValue() != f) {
            C8946b.f24365Q.mo22118a(Float.valueOf(f));
            this.f8289c = ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21220d.f21222a * f;
        }
        mo9204g(this.f8289c);
    }

    /* renamed from: d */
    public final void mo9201d(float f) {
        if (((Float) C8946b.f24362N.mo22117a()).floatValue() != f) {
            C8946b.f24362N.mo22118a(Float.valueOf(f));
            this.f8290d = ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a * f;
        }
        mo9206i(this.f8290d);
        mo9205h(this.f8291e);
    }

    /* renamed from: a */
    public final void mo9197a(int i) {
        if (((Integer) C8946b.f24366R.mo22117a()).intValue() != i) {
            C8946b.f24366R.mo22118a(Integer.valueOf(i));
            this.f8292f = i;
        }
        mo9202e(f8286g[i]);
        mo9206i(f8286g[1]);
        mo9205h(this.f8291e);
    }

    /* renamed from: b */
    public final void mo9199b(float f) {
        if (((Float) C8946b.f24364P.mo22117a()).floatValue() != f) {
            C8946b.f24364P.mo22118a(Float.valueOf(f));
            this.f8288b = ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21219c.f21222a * f;
        }
        mo9203f(this.f8288b);
    }
}
