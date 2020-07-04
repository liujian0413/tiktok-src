package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.live.broadcast.LiveCameraResManager;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6319n;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.d */
public final class C2615d extends C2581a {

    /* renamed from: g */
    private final String f8391g = "smooth/frag/whitenIntensity";

    /* renamed from: h */
    private final String f8392h = "smooth/frag/smoothIntensity";

    /* renamed from: i */
    private final String f8393i = "";

    /* renamed from: j */
    private final String f8394j = "FaceDistortionEyeIntensity";

    /* renamed from: k */
    private final String f8395k = "FaceDistortionCheekIntensity";

    /* renamed from: l */
    private C9355c f8396l;

    /* renamed from: m */
    private C9355c f8397m;

    public C2615d() {
        m10702c();
        mo9198b();
    }

    /* renamed from: e */
    private void m10704e() {
        C2515f.m10417f().mo9074a().mo8892a("beauty", this.f8397m);
        m10700a(this.f8394j, this.f8288b);
        m10700a(this.f8395k, this.f8289c);
    }

    /* renamed from: d */
    private void m10703d() {
        C2515f.m10417f().mo9074a().mo8892a("beauty", this.f8396l);
        m10700a(this.f8393i, this.f8291e);
        m10700a(this.f8392h, this.f8287a);
        m10700a(this.f8391g, this.f8290d);
    }

    /* renamed from: c */
    private void m10702c() {
        this.f8396l = new C9355c();
        this.f8396l.f25566e = 1111;
        this.f8396l.f25572k.addAll(Arrays.asList(new String[]{this.f8393i, this.f8392h, this.f8391g}));
        this.f8396l.f25581t = LiveCameraResManager.INST.getBeautyComposerFilePath();
        this.f8397m = new C9355c();
        this.f8397m.f25566e = 1112;
        this.f8397m.f25572k.addAll(Arrays.asList(new String[]{this.f8395k, this.f8394j}));
        this.f8397m.f25581t = LiveCameraResManager.INST.getReshapeComposerFilePath();
    }

    /* renamed from: f */
    public final void mo9203f(float f) {
        if (!m10701a(C2515f.m10417f().mo9074a().mo8884a("beauty"), this.f8397m)) {
            m10704e();
        } else {
            m10700a(this.f8394j, f);
        }
    }

    /* renamed from: g */
    public final void mo9204g(float f) {
        if (!m10701a(C2515f.m10417f().mo9074a().mo8884a("beauty"), this.f8397m)) {
            m10704e();
        } else {
            m10700a(this.f8395k, f);
        }
    }

    /* renamed from: h */
    public final void mo9205h(float f) {
        if (!m10701a(C2515f.m10417f().mo9074a().mo8884a("beauty"), this.f8396l)) {
            m10703d();
        } else {
            m10700a(this.f8393i, f);
        }
    }

    /* renamed from: e */
    public final void mo9202e(float f) {
        if (!m10701a(C2515f.m10417f().mo9074a().mo8884a("beauty"), this.f8396l)) {
            m10703d();
        } else {
            m10700a(this.f8392h, f);
        }
    }

    /* renamed from: i */
    public final void mo9206i(float f) {
        if (!m10701a(C2515f.m10417f().mo9074a().mo8884a("beauty"), this.f8396l)) {
            m10703d();
        } else {
            m10700a(this.f8391g, 0.0f);
        }
    }

    /* renamed from: a */
    private static void m10700a(String str, float f) {
        C2515f.m10417f().mo9074a().mo8891a(str, f);
    }

    /* renamed from: a */
    private static boolean m10701a(List<C9355c> list, C9355c cVar) {
        for (C9355c cVar2 : list) {
            if (C6319n.m19594a(cVar2.f25581t, cVar.f25581t)) {
                return true;
            }
        }
        return false;
    }
}
