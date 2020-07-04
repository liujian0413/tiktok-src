package com.p280ss.ugc.live.barrage.p1824a;

import android.graphics.Bitmap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.ugc.live.barrage.a.b */
public class C46195b extends C46187a {

    /* renamed from: a */
    private final Bitmap f118768a;

    /* renamed from: b */
    public final Bitmap mo114139b() {
        return this.f118768a;
    }

    public C46195b(Bitmap bitmap) {
        C7573i.m23587b(bitmap, "bitmap");
        this.f118768a = bitmap;
        this.f118761k.right = this.f118761k.left + ((float) this.f118768a.getWidth());
        this.f118761k.bottom = this.f118761k.top + ((float) this.f118768a.getHeight());
        mo114142e();
    }
}
