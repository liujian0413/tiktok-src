package com.p280ss.android.medialib;

/* renamed from: com.ss.android.medialib.f */
public class C19721f {

    /* renamed from: b */
    private static final String f53484b = "f";

    /* renamed from: c */
    private static volatile C19721f f53485c;

    /* renamed from: a */
    public FaceBeautyInvoker f53486a;

    /* renamed from: a */
    public static C19721f m65022a() {
        synchronized (C19721f.class) {
            if (f53485c == null) {
                synchronized (C19721f.class) {
                    if (f53485c == null) {
                        f53485c = new C19721f();
                    }
                }
            }
        }
        return f53485c;
    }

    /* renamed from: a */
    public final void mo52425a(float f) {
        if (this.f53486a != null) {
            this.f53486a.updateReactionBGAlpha(f);
        }
    }

    /* renamed from: a */
    public final void mo52426a(float[] fArr) {
        if (this.f53486a != null) {
            this.f53486a.setDeviceRotation(fArr);
        }
    }
}
