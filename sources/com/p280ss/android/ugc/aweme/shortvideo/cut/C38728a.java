package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a */
public final class C38728a implements C38746b<Bitmap> {
    /* renamed from: a */
    public final C38795r<Bitmap> mo96819a(InputStream inputStream) {
        C7573i.m23587b(inputStream, "inputStream");
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        C7573i.m23582a((Object) decodeStream, "bitmap");
        return new C38795r<>(decodeStream.getWidth(), decodeStream.getHeight(), decodeStream);
    }

    /* renamed from: a */
    public final void mo96820a(OutputStream outputStream, C38795r<Bitmap> rVar) {
        C7573i.m23587b(outputStream, "outputStream");
        C7573i.m23587b(rVar, "cacheData");
        ((Bitmap) rVar.f100818c).compress(CompressFormat.PNG, 100, outputStream);
    }
}
