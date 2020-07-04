package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import com.facebook.common.references.C13326a;
import com.facebook.common.references.C13329c;
import com.facebook.imagepipeline.p715b.C13553g;
import com.facebook.imagepipeline.p720g.C13644b;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13649g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38782a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.C38787f;
import kotlin.Pair;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.a */
public final class C41674a implements C38787f {

    /* renamed from: a */
    C41706n f108445a;

    /* renamed from: a */
    public final void mo96758a(String str) {
    }

    /* renamed from: b */
    public final void mo96759b() {
    }

    public C41674a(C41706n nVar) {
        this.f108445a = nVar;
    }

    /* renamed from: a */
    private static C13326a<C13644b> m132712a(Bitmap bitmap) {
        return C13326a.m38995a(new C13646d(bitmap, (C13329c<Bitmap>) C13553g.m39883a(), C13649g.f36269a, 0));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102444a(C38782a aVar, Pair pair) throws Exception {
        Bitmap bitmap = (Bitmap) pair.getSecond();
        if (bitmap != null && !bitmap.isRecycled()) {
            aVar.mo96916a(m132712a(bitmap));
        }
    }

    /* renamed from: a */
    public final void mo96756a(int i, String str, int i2, int i3, C38782a aVar) {
        this.f108445a.mo102481a().mo19291a((C7328l<? super T>) new C41685b<Object>(i)).mo19325f((C7326g<? super T>) new C41690c<Object>(this, aVar));
    }
}
