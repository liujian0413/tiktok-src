package com.p280ss.android.ugc.asve.p753a;

import android.graphics.Bitmap;
import com.p280ss.android.ugc.asve.p758e.C15457a;
import com.p280ss.android.vesdk.C45382z.C45391c;
import com.p280ss.android.vesdk.model.BefTextLayout;
import com.p280ss.android.vesdk.model.BefTextLayoutResult;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.a.a */
public final class C15381a implements C45391c {
    /* renamed from: a */
    public final BefTextLayoutResult mo38739a(String str, BefTextLayout befTextLayout) {
        BefTextLayoutResult befTextLayoutResult = new BefTextLayoutResult();
        C15457a aVar = new C15457a(befTextLayout);
        Bitmap a = aVar.mo39009a(str);
        befTextLayoutResult.setBitmap(a);
        befTextLayoutResult.setLineCount(aVar.f39762c);
        C7573i.m23582a((Object) a, "bitmap");
        befTextLayoutResult.setHeight(a.getHeight());
        befTextLayoutResult.setWidth(a.getWidth());
        return befTextLayoutResult;
    }
}
