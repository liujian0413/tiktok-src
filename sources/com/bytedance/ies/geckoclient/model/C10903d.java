package com.bytedance.ies.geckoclient.model;

/* renamed from: com.bytedance.ies.geckoclient.model.d */
public final class C10903d {

    /* renamed from: a */
    public int f29506a;

    /* renamed from: b */
    public int f29507b;

    /* renamed from: c */
    public String f29508c;

    /* renamed from: d */
    public String f29509d;

    /* renamed from: e */
    public String f29510e;

    /* renamed from: f */
    public String f29511f;

    /* renamed from: g */
    public int f29512g;

    /* renamed from: h */
    public String f29513h;

    /* renamed from: i */
    public boolean f29514i;

    /* renamed from: j */
    public C10909j f29515j;

    /* renamed from: k */
    public Exception f29516k;

    /* renamed from: l */
    public int f29517l;

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeckoPackage{version=");
        sb.append(this.f29506a);
        sb.append(", updateWhenLaunch=");
        sb.append(this.f29507b);
        sb.append(", channel='");
        sb.append(this.f29508c);
        sb.append('\'');
        sb.append(", dir='");
        sb.append(this.f29509d);
        sb.append('\'');
        sb.append(", zipName='");
        sb.append(this.f29510e);
        sb.append('\'');
        sb.append(", patchName='");
        sb.append(this.f29511f);
        sb.append('\'');
        sb.append(", packageType=");
        sb.append(this.f29512g);
        sb.append(", extra='");
        sb.append(this.f29513h);
        sb.append('\'');
        sb.append(", isLocalInfoStored=");
        sb.append(this.f29514i);
        sb.append(", updatePackage=");
        sb.append(this.f29515j);
        sb.append(", e=");
        sb.append(this.f29516k);
        sb.append(", errorCode=");
        sb.append(this.f29517l);
        sb.append('}');
        return sb.toString();
    }

    public C10903d(String str) {
        this.f29508c = str;
    }

    /* renamed from: a */
    public final void mo26307a(C10909j jVar) {
        this.f29515j = jVar;
        if (jVar != null) {
            this.f29512g = jVar.f29542c;
        }
    }
}
