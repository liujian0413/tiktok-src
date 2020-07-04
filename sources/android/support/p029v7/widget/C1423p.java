package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: android.support.v7.widget.p */
final class C1423p implements C1427s {
    C1423p() {
    }

    /* renamed from: a */
    public final void mo6579a() {
    }

    /* renamed from: j */
    private static C1350al m7068j(C1426r rVar) {
        return (C1350al) rVar.mo5310c();
    }

    /* renamed from: a */
    public final float mo6580a(C1426r rVar) {
        return m7068j(rVar).f5254b;
    }

    /* renamed from: d */
    public final float mo6588d(C1426r rVar) {
        return m7068j(rVar).f5253a;
    }

    /* renamed from: g */
    public final void mo6591g(C1426r rVar) {
        mo6585b(rVar, mo6580a(rVar));
    }

    /* renamed from: h */
    public final void mo6592h(C1426r rVar) {
        mo6585b(rVar, mo6580a(rVar));
    }

    /* renamed from: i */
    public final ColorStateList mo6593i(C1426r rVar) {
        return m7068j(rVar).f5255c;
    }

    /* renamed from: b */
    public final float mo6584b(C1426r rVar) {
        return mo6588d(rVar) * 2.0f;
    }

    /* renamed from: c */
    public final float mo6586c(C1426r rVar) {
        return mo6588d(rVar) * 2.0f;
    }

    /* renamed from: e */
    public final float mo6589e(C1426r rVar) {
        return rVar.mo5311d().getElevation();
    }

    /* renamed from: f */
    public final void mo6590f(C1426r rVar) {
        if (!rVar.mo5308a()) {
            rVar.mo5306a(0, 0, 0, 0);
            return;
        }
        float a = mo6580a(rVar);
        float d = mo6588d(rVar);
        int ceil = (int) Math.ceil((double) C1351am.m6681b(a, d, rVar.mo5309b()));
        int ceil2 = (int) Math.ceil((double) C1351am.m6678a(a, d, rVar.mo5309b()));
        rVar.mo5306a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: c */
    public final void mo6587c(C1426r rVar, float f) {
        rVar.mo5311d().setElevation(f);
    }

    /* renamed from: a */
    public final void mo6581a(C1426r rVar, float f) {
        m7068j(rVar).mo6324a(f);
    }

    /* renamed from: b */
    public final void mo6585b(C1426r rVar, float f) {
        m7068j(rVar).mo6325a(f, rVar.mo5308a(), rVar.mo5309b());
        mo6590f(rVar);
    }

    /* renamed from: a */
    public final void mo6583a(C1426r rVar, ColorStateList colorStateList) {
        m7068j(rVar).mo6326a(colorStateList);
    }

    /* renamed from: a */
    public final void mo6582a(C1426r rVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        rVar.mo5307a(new C1350al(colorStateList, f));
        View d = rVar.mo5311d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        mo6585b(rVar, f3);
    }
}
