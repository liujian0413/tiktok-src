package com.facebook.drawee.view;

import com.facebook.common.internal.C13307g;
import com.facebook.drawee.p698c.C13387b;
import java.util.ArrayList;

/* renamed from: com.facebook.drawee.view.c */
public final class C13446c<DH extends C13387b> {

    /* renamed from: a */
    boolean f35657a;

    /* renamed from: b */
    ArrayList<C13445b<DH>> f35658b = new ArrayList<>();

    /* renamed from: b */
    public final void mo32942b() {
        if (this.f35657a) {
            this.f35657a = false;
            for (int i = 0; i < this.f35658b.size(); i++) {
                ((C13445b) this.f35658b.get(i)).mo32935c();
            }
        }
    }

    /* renamed from: a */
    public final void mo32940a() {
        if (!this.f35657a) {
            this.f35657a = true;
            for (int i = 0; i < this.f35658b.size(); i++) {
                ((C13445b) this.f35658b.get(i)).mo32934b();
            }
        }
    }

    /* renamed from: c */
    public final void mo32943c() {
        if (this.f35657a) {
            for (int i = 0; i < this.f35658b.size(); i++) {
                ((C13445b) this.f35658b.get(i)).mo32935c();
            }
        }
        this.f35658b.clear();
    }

    /* renamed from: a */
    public final void mo32941a(C13445b<DH> bVar) {
        m39509a(this.f35658b.size(), bVar);
    }

    /* renamed from: a */
    private void m39509a(int i, C13445b<DH> bVar) {
        C13307g.m38940a(bVar);
        C13307g.m38938a(i, this.f35658b.size() + 1);
        this.f35658b.add(i, bVar);
        if (this.f35657a) {
            bVar.mo32934b();
        }
    }
}
