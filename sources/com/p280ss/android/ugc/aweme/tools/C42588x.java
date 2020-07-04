package com.p280ss.android.ugc.aweme.tools;

/* renamed from: com.ss.android.ugc.aweme.tools.x */
public class C42588x implements C42155av {

    /* renamed from: a */
    public float f110742a = -1.0f;

    /* renamed from: b */
    public boolean f110743b;

    /* renamed from: c */
    public Object f110744c;

    /* renamed from: d */
    public int f110745d;

    private C42588x() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GesturePresenterStateEvent{fraction=");
        sb.append(this.f110742a);
        sb.append(", animationRunning=");
        sb.append(this.f110743b);
        sb.append(", listener=");
        sb.append(this.f110744c);
        sb.append(", type=");
        sb.append(this.f110745d);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C42588x m135308a(float f) {
        C42588x xVar = new C42588x();
        xVar.f110742a = 0.0f;
        xVar.f110745d = 1;
        return xVar;
    }

    /* renamed from: a */
    public static C42588x m135309a(Object obj) {
        C42588x xVar = new C42588x();
        xVar.f110744c = obj;
        xVar.f110745d = 3;
        return xVar;
    }

    /* renamed from: a */
    public static C42588x m135310a(boolean z) {
        C42588x xVar = new C42588x();
        xVar.f110743b = z;
        xVar.f110745d = 2;
        return xVar;
    }
}
