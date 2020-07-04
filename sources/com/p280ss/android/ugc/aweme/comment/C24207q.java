package com.p280ss.android.ugc.aweme.comment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.text.style.ReplacementSpan;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.q */
final class C24207q extends ReplacementSpan {

    /* renamed from: a */
    public static final C24208a f63919a = new C24208a(null);

    /* renamed from: b */
    private final Context f63920b = C6399b.m19921a();

    /* renamed from: c */
    private final Drawable f63921c;

    /* renamed from: d */
    private final String f63922d;

    /* renamed from: e */
    private final int f63923e;

    /* renamed from: f */
    private final float f63924f;

    /* renamed from: g */
    private final float f63925g;

    /* renamed from: com.ss.android.ugc.aweme.comment.q$a */
    static final class C24208a {
        private C24208a() {
        }

        public /* synthetic */ C24208a(C7571f fVar) {
            this();
        }
    }

    public C24207q() {
        Drawable a = C0683b.m2903a(this.f63920b, (int) R.drawable.asg);
        if (a != null) {
            a.setBounds(new Rect(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight()));
        } else {
            a = null;
        }
        this.f63921c = a;
        this.f63922d = this.f63920b.getString(R.string.b04);
        this.f63923e = C0683b.m2912c(this.f63920b, R.color.h7);
        this.f63924f = C9738o.m28708b(this.f63920b, 2.0f);
        this.f63925g = C9738o.m28690a(this.f63920b, 13.0f);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        int i3;
        C7573i.m23587b(paint, "paint");
        Drawable drawable = this.f63921c;
        if (drawable != null) {
            i3 = drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        return i3 + ((int) paint.measureText(this.f63922d)) + ((int) (this.f63924f * 2.0f));
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C7573i.m23587b(canvas, "canvas");
        C7573i.m23587b(paint, "paint");
        float textSize = ((float) i4) - ((paint.getTextSize() - this.f63925g) / 2.0f);
        Drawable drawable = this.f63921c;
        if (drawable != null) {
            canvas.save();
            canvas.translate(this.f63924f + f, ((float) i3) + (((float) ((i5 - i3) - drawable.getIntrinsicHeight())) / 2.0f));
            drawable.draw(canvas);
            f += ((float) drawable.getIntrinsicWidth()) + (this.f63924f * 2.0f);
            canvas.restore();
        }
        paint.setColor(this.f63923e);
        paint.setTextSize(this.f63925g);
        canvas.drawText(this.f63922d, f, textSize, paint);
    }
}
