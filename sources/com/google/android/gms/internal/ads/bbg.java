package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bbg;
import java.io.IOException;

public class bbg<M extends bbg<M>> extends bbl {

    /* renamed from: a */
    protected bbi f41361a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo40473a() {
        if (this.f41361a != null) {
            for (int i = 0; i < this.f41361a.f41364a; i++) {
                this.f41361a.mo40479a(i).mo40483a();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void mo40474a(bbf bbf) throws IOException {
        if (this.f41361a != null) {
            for (int i = 0; i < this.f41361a.f41364a; i++) {
                this.f41361a.mo40479a(i).mo40484a(bbf);
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ bbl mo40475b() throws CloneNotSupportedException {
        return (bbg) clone();
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        bbg bbg = (bbg) super.clone();
        bbk.m48380a(this, bbg);
        return bbg;
    }
}
