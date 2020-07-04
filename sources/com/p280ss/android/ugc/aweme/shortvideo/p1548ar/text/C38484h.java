package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.util.SparseArray;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.h */
public final class C38484h {

    /* renamed from: a */
    private SparseArray<C38490n> f100069a;

    /* renamed from: b */
    private C38489m f100070b;

    /* renamed from: c */
    private C38489m f100071c;

    /* renamed from: d */
    private FragmentActivity f100072d;

    /* renamed from: b */
    private boolean m123025b() {
        return C40496bh.m129459f(m123026c());
    }

    /* renamed from: c */
    private Effect m123026c() {
        if (this.f100072d != null) {
            return (Effect) ((CurUseStickerViewModel) C0069x.m159a(this.f100072d).mo147a(CurUseStickerViewModel.class)).mo101274a().getValue();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo96445a() {
        if (this.f100071c != null) {
            this.f100070b = this.f100071c;
            this.f100071c = null;
            m123027c(this.f100070b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96446a(C38489m mVar) {
        this.f100071c = mVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo96447b(C38489m mVar) {
        this.f100070b = mVar;
        if (mVar != null) {
            m123027c(mVar);
        }
    }

    /* renamed from: c */
    private void m123027c(C38489m mVar) {
        C38490n nVar = (C38490n) this.f100069a.get(mVar.f100079c);
        if (mVar.f100077a != 32) {
            if (mVar.f100077a == 33) {
                nVar.mo96456c();
            }
        } else if (m123025b() && nVar != null) {
            nVar.f100084d = this.f100070b;
            nVar.mo96455b(mVar.f100078b, mVar.f100080d);
            nVar.mo96454b();
            nVar.mo96453a(mVar.f100080d, mVar.f100078b);
        }
    }

    public C38484h(SparseArray<C38490n> sparseArray, FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            this.f100069a = sparseArray;
            this.f100072d = fragmentActivity;
            ((ARTextResultModule) C0069x.m159a(fragmentActivity).mo147a(ARTextResultModule.class)).mo96414a().observe(fragmentActivity, new C38485i(this));
            ((ARTextResultModule) C0069x.m159a(fragmentActivity).mo147a(ARTextResultModule.class)).mo96415b().observe(fragmentActivity, new C38486j(this));
        }
    }
}
