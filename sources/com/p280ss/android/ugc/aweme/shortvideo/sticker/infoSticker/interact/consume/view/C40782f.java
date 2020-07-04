package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.view.View;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.f */
public final class C40782f extends View {

    /* renamed from: a */
    private float[] f106042a;

    /* renamed from: b */
    private final Paint f106043b = new Paint();

    /* renamed from: c */
    private final Path f106044c = new Path();

    public final Path getPath() {
        return this.f106044c;
    }

    public final float[] getPoints() {
        return this.f106042a;
    }

    public final void setPoints(float[] fArr) {
        this.f106042a = fArr;
    }

    public C40782f(Context context) {
        super(context);
        if (C7163a.m22363a()) {
            Paint paint = this.f106043b;
            Context context2 = getContext();
            C7573i.m23582a((Object) context2, "context");
            paint.setColor(context2.getResources().getColor(R.color.a3t));
            this.f106043b.setStyle(Style.STROKE);
            this.f106043b.setStrokeWidth(10.0f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        if (C40707a.m130163a(context) && this.f106042a != null) {
            this.f106044c.reset();
            Path path = this.f106044c;
            float[] fArr = this.f106042a;
            if (fArr == null) {
                C7573i.m23580a();
            }
            float f = fArr[0];
            float[] fArr2 = this.f106042a;
            if (fArr2 == null) {
                C7573i.m23580a();
            }
            path.moveTo(f, fArr2[1]);
            Path path2 = this.f106044c;
            float[] fArr3 = this.f106042a;
            if (fArr3 == null) {
                C7573i.m23580a();
            }
            float f2 = fArr3[2];
            float[] fArr4 = this.f106042a;
            if (fArr4 == null) {
                C7573i.m23580a();
            }
            path2.lineTo(f2, fArr4[3]);
            Path path3 = this.f106044c;
            float[] fArr5 = this.f106042a;
            if (fArr5 == null) {
                C7573i.m23580a();
            }
            float f3 = fArr5[6];
            float[] fArr6 = this.f106042a;
            if (fArr6 == null) {
                C7573i.m23580a();
            }
            path3.lineTo(f3, fArr6[7]);
            Path path4 = this.f106044c;
            float[] fArr7 = this.f106042a;
            if (fArr7 == null) {
                C7573i.m23580a();
            }
            float f4 = fArr7[4];
            float[] fArr8 = this.f106042a;
            if (fArr8 == null) {
                C7573i.m23580a();
            }
            path4.lineTo(f4, fArr8[5]);
            this.f106044c.close();
            if (canvas != null) {
                canvas.drawPath(this.f106044c, this.f106043b);
            }
        }
    }
}
