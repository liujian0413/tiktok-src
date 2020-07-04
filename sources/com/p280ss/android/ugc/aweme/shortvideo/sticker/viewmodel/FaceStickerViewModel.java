package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.LiveData;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FaceStickerViewModel */
public final class FaceStickerViewModel extends C0063u {

    /* renamed from: a */
    public final C0052o<C40993i> f106541a = new C0052o<>();

    /* renamed from: b */
    private final C0052o<C40991g> f106542b = new C0052o<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FaceStickerViewModel$a */
    static final class C40982a<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ FaceStickerViewModel f106543a;

        /* renamed from: b */
        final /* synthetic */ int f106544b;

        /* renamed from: c */
        final /* synthetic */ int f106545c;

        /* renamed from: d */
        final /* synthetic */ int f106546d;

        /* renamed from: e */
        final /* synthetic */ String f106547e;

        C40982a(FaceStickerViewModel faceStickerViewModel, int i, int i2, int i3, String str) {
            this.f106543a = faceStickerViewModel;
            this.f106544b = i;
            this.f106545c = i2;
            this.f106546d = i3;
            this.f106547e = str;
        }

        public final /* synthetic */ Object call() {
            m130901a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m130901a() {
            this.f106543a.f106541a.setValue(new C40993i(this.f106544b, this.f106545c, this.f106546d, this.f106547e));
        }
    }

    /* renamed from: a */
    public final LiveData<C40991g> mo101292a() {
        return this.f106542b;
    }

    /* renamed from: a */
    public final void mo101294a(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceStickerBean");
        this.f106542b.setValue(new C40992h(faceStickerBean));
    }

    /* renamed from: b */
    public final void mo101295b(FaceStickerBean faceStickerBean) {
        C7573i.m23587b(faceStickerBean, "faceStickerBean");
        this.f106542b.setValue(new C40985a(faceStickerBean));
    }

    /* renamed from: a */
    public final void mo101293a(int i, int i2, int i3, String str) {
        C40982a aVar = new C40982a(this, i, i2, i3, str);
        C1592h.m7855a((Callable<TResult>) aVar, C1592h.f5958b);
    }
}
