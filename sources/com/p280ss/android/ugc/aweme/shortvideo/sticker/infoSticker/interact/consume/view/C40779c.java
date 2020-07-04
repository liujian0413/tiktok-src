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
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.c */
public final class C40779c extends View {

    /* renamed from: a */
    private List<float[]> f106037a;

    /* renamed from: b */
    private final Paint f106038b = new Paint();

    /* renamed from: c */
    private final Path f106039c = new Path();

    public final List<float[]> getPoints() {
        return this.f106037a;
    }

    public final void setPoints(List<float[]> list) {
        this.f106037a = list;
    }

    public C40779c(Context context) {
        super(context);
        if (C7163a.m22363a()) {
            Paint paint = this.f106038b;
            Context context2 = getContext();
            C7573i.m23582a((Object) context2, "context");
            paint.setColor(context2.getResources().getColor(R.color.a3t));
            this.f106038b.setStyle(Style.STROKE);
            this.f106038b.setStrokeWidth(10.0f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        if (C40707a.m130163a(context) && this.f106037a != null) {
            List<float[]> list = this.f106037a;
            if (list != null) {
                for (float[] fArr : list) {
                    if (fArr != null) {
                        this.f106039c.reset();
                        this.f106039c.moveTo(fArr[0], fArr[1]);
                        this.f106039c.lineTo(fArr[2], fArr[3]);
                        this.f106039c.lineTo(fArr[6], fArr[7]);
                        this.f106039c.lineTo(fArr[4], fArr[5]);
                        this.f106039c.close();
                        if (canvas != null) {
                            canvas.drawPath(this.f106039c, this.f106038b);
                        }
                    }
                }
            }
        }
    }
}
