package com.facebook.imagepipeline.p718e;

import android.graphics.Bitmap;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13345b;
import com.facebook.datasource.C13346c;
import com.facebook.imagepipeline.p720g.C13644b;
import com.facebook.imagepipeline.p720g.C13645c;

/* renamed from: com.facebook.imagepipeline.e.b */
public abstract class C13639b extends C13345b<C13326a<C13645c>> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9161a(Bitmap bitmap);

    public void onNewResultImpl(C13346c<C13326a<C13645c>> cVar) {
        if (cVar.mo32639b()) {
            C13326a aVar = (C13326a) cVar.mo32641d();
            Bitmap bitmap = null;
            if (aVar != null && (aVar.mo32609a() instanceof C13644b)) {
                bitmap = ((C13644b) aVar.mo32609a()).mo33265d();
            }
            try {
                mo9161a(bitmap);
            } finally {
                C13326a.m39001c(aVar);
            }
        }
    }
}
