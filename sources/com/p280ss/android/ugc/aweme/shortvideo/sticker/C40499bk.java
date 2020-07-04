package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.app.Activity;
import android.support.p022v4.app.FragmentActivity;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.C38475a;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.C38480e;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.C38484h;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.C38490n;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.C38490n.C38492b;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.EffectTextInputView;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.bk */
public final class C40499bk {

    /* renamed from: a */
    private SparseArray<C38490n> f105246a = new SparseArray<>();

    /* renamed from: b */
    private C38484h f105247b;

    /* renamed from: c */
    public final void mo100552c() {
        for (int i = 0; i < this.f105246a.size(); i++) {
            this.f105246a.get(this.f105246a.keyAt(i));
        }
    }

    /* renamed from: a */
    public final void mo100548a() {
        for (int i = 0; i < this.f105246a.size(); i++) {
            m129478a(this.f105246a.keyAt(i));
        }
    }

    /* renamed from: b */
    public final void mo100551b() {
        for (int i = 0; i < this.f105246a.size(); i++) {
            C38490n nVar = (C38490n) this.f105246a.get(this.f105246a.keyAt(i));
            if (nVar != null && nVar.f100091k) {
                nVar.mo96441a();
            }
        }
    }

    /* renamed from: a */
    public final void mo100550a(FaceStickerBean faceStickerBean) {
        if (m129479b(faceStickerBean) != -1) {
            this.f105247b.mo96445a();
        }
    }

    /* renamed from: a */
    private void m129478a(int i) {
        ((C38490n) this.f105246a.get(i)).mo96457d();
        ((C38490n) this.f105246a.get(i)).f100091k = false;
    }

    /* renamed from: b */
    private static int m129479b(FaceStickerBean faceStickerBean) {
        if (faceStickerBean.getTags().contains("AR")) {
            return 0;
        }
        return faceStickerBean.getTags().contains("text2d") ? 1 : 1;
    }

    public C40499bk(FragmentActivity fragmentActivity, ASCameraView aSCameraView) {
        this.f105246a.put(0, new C38475a(fragmentActivity, aSCameraView).mo96450a(0));
        this.f105246a.put(1, new C38480e(fragmentActivity, aSCameraView).mo96450a(1));
        this.f105247b = new C38484h(this.f105246a, fragmentActivity);
    }

    /* renamed from: a */
    public final void mo100549a(int i, C38492b bVar, Activity activity, ViewGroup viewGroup) {
        EffectTextInputView a = EffectTextInputView.m122999a(i, activity);
        viewGroup.addView(a);
        ((C38490n) this.f105246a.get(i)).mo96437a(a);
        ((C38490n) this.f105246a.get(i)).mo96451a(bVar);
        ((C38490n) this.f105246a.get(i)).mo96458e();
        ((C38490n) this.f105246a.get(i)).f100091k = true;
    }
}
