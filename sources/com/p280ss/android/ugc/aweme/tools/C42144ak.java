package com.p280ss.android.ugc.aweme.tools;

/* renamed from: com.ss.android.ugc.aweme.tools.ak */
public class C42144ak extends C42249c {

    /* renamed from: c */
    private static C42144ak f109666c;

    /* renamed from: d */
    private static int f109667d;

    /* renamed from: a */
    public float f109668a;

    /* renamed from: b */
    public float f109669b;

    /* renamed from: e */
    private int f109670e;

    /* renamed from: f */
    private C42144ak f109671f;

    /* renamed from: b */
    private boolean m134106b() {
        if ((this.f109670e & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo103580a() {
        if (!m134106b()) {
            m134107c();
        }
    }

    /* renamed from: c */
    private void m134107c() {
        this.f109670e = 0;
        this.f109669b = 0.0f;
        this.f109668a = 0.0f;
        if (f109667d < 20) {
            this.f109671f = f109666c;
            f109666c = this;
            f109667d++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RecordingScaleRatioEvent{flags=");
        sb.append(this.f109670e);
        sb.append(", next=");
        sb.append(this.f109671f);
        sb.append(", mCurrentY=");
        sb.append(this.f109668a);
        sb.append(", mBottom=");
        sb.append(this.f109669b);
        sb.append('}');
        return sb.toString();
    }

    private C42144ak(float f, float f2) {
        this.f109668a = f;
        this.f109669b = f2;
    }

    /* renamed from: a */
    public static C42144ak m134105a(float f, float f2) {
        if (f109666c == null) {
            return new C42144ak(f, f2);
        }
        C42144ak akVar = f109666c;
        f109666c = akVar.f109671f;
        akVar.f109671f = null;
        akVar.f109670e = 1;
        f109667d--;
        akVar.f109668a = f;
        akVar.f109669b = f2;
        return akVar;
    }
}
