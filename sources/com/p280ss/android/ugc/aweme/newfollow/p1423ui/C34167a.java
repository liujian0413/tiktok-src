package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import com.p280ss.android.ugc.aweme.app.C6877n;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.a */
public final class C34167a extends BitmapDrawable {

    /* renamed from: a */
    private Bitmap f89079a;

    public C34167a(Bitmap bitmap) {
        super(bitmap);
        this.f89079a = bitmap;
    }

    public final void draw(Canvas canvas) {
        if (this.f89079a != null) {
            if (this.f89079a.isRecycled()) {
                C6877n.m21407a("bitmap_draw_after_recycled", "bitmap recycled", null);
                return;
            }
            try {
                super.draw(canvas);
            } catch (Exception e) {
                C6877n.m21407a("bitmap_draw_after_recycled", e.getMessage(), null);
            }
        }
    }
}
