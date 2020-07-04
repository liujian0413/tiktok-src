package com.p280ss.android.ugc.aweme.tools;

import android.view.ScaleGestureDetector;

/* renamed from: com.ss.android.ugc.aweme.tools.i */
public class C42344i extends C42249c {

    /* renamed from: a */
    public ScaleGestureDetector f110142a;

    /* renamed from: b */
    public float f110143b;

    /* renamed from: c */
    public float f110144c;

    /* renamed from: d */
    public int f110145d;

    /* renamed from: e */
    public boolean f110146e;

    private C42344i() {
    }

    /* renamed from: a */
    public static C42344i m134637a() {
        C42344i iVar = new C42344i();
        iVar.f110145d = 2;
        return iVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CameraStateEvent{detector=");
        sb.append(this.f110142a);
        sb.append(", x=");
        sb.append(this.f110143b);
        sb.append(", y=");
        sb.append(this.f110144c);
        sb.append(", type=");
        sb.append(this.f110145d);
        sb.append(", result=");
        sb.append(this.f110146e);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C42344i m134639a(ScaleGestureDetector scaleGestureDetector) {
        C42344i iVar = new C42344i();
        iVar.f110142a = scaleGestureDetector;
        iVar.f110145d = 1;
        return iVar;
    }

    /* renamed from: a */
    public static C42344i m134638a(float f, float f2) {
        C42344i iVar = new C42344i();
        iVar.f110143b = f;
        iVar.f110144c = f2;
        iVar.f110145d = 0;
        return iVar;
    }
}
