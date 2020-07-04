package com.airbnb.lottie.p051a.p052a;

import android.graphics.Path;
import android.graphics.Path.FillType;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.content.C1815k;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p056d.C1751f;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.p */
public final class C1684p implements C1679l, C1688a {

    /* renamed from: a */
    private final Path f6216a = new Path();

    /* renamed from: b */
    private final String f6217b;

    /* renamed from: c */
    private final C1767h f6218c;

    /* renamed from: d */
    private final C1687a<?, Path> f6219d;

    /* renamed from: e */
    private boolean f6220e;

    /* renamed from: f */
    private C1686r f6221f;

    /* renamed from: a */
    public final void mo7131a() {
        m8181c();
    }

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6217b;
    }

    /* renamed from: c */
    private void m8181c() {
        this.f6220e = false;
        this.f6218c.invalidateSelf();
    }

    /* renamed from: e */
    public final Path mo7140e() {
        if (this.f6220e) {
            return this.f6216a;
        }
        this.f6216a.reset();
        this.f6216a.set((Path) this.f6219d.mo7151e());
        this.f6216a.setFillType(FillType.EVEN_ODD);
        C1751f.m8372a(this.f6216a, this.f6221f);
        this.f6220e = true;
        return this.f6216a;
    }

    /* renamed from: a */
    public final void mo7136a(List<C1668b> list, List<C1668b> list2) {
        for (int i = 0; i < list.size(); i++) {
            C1668b bVar = (C1668b) list.get(i);
            if (bVar instanceof C1686r) {
                C1686r rVar = (C1686r) bVar;
                if (rVar.f6226a == Type.Simultaneously) {
                    this.f6221f = rVar;
                    this.f6221f.mo7142a(this);
                }
            }
        }
    }

    public C1684p(C1767h hVar, C1821a aVar, C1815k kVar) {
        this.f6217b = kVar.f6544a;
        this.f6218c = hVar;
        this.f6219d = kVar.f6545b.mo7288a();
        aVar.mo7326a(this.f6219d);
        this.f6219d.mo7146a((C1688a) this);
    }
}
