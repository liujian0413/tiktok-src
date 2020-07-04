package com.p280ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtBubbleTextView */
public final class DmtBubbleTextView extends View {

    /* renamed from: a */
    private TextPaint f102033a;

    /* renamed from: b */
    private Path f102034b;

    /* renamed from: c */
    private Paint f102035c;

    /* renamed from: d */
    private Paint f102036d;

    /* renamed from: e */
    private String f102037e;

    /* renamed from: f */
    private int f102038f;

    /* renamed from: g */
    private int f102039g;

    /* renamed from: h */
    private int f102040h;

    /* renamed from: i */
    private int f102041i;

    /* renamed from: j */
    private int f102042j;

    /* renamed from: k */
    private int f102043k;

    /* renamed from: l */
    private int f102044l;

    /* renamed from: m */
    private int f102045m;

    /* renamed from: n */
    private int f102046n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtBubbleTextView$a */
    public static final class C39296a {

        /* renamed from: a */
        public int f102047a;

        /* renamed from: b */
        public int f102048b;

        /* renamed from: c */
        public int f102049c;

        /* renamed from: d */
        public int f102050d;

        /* renamed from: e */
        public int f102051e;

        /* renamed from: f */
        public int f102052f;

        /* renamed from: g */
        public int f102053g;

        /* renamed from: h */
        public int f102054h;

        /* renamed from: i */
        public int f102055i;
    }

    /* renamed from: a */
    private final void m125564a() {
        this.f102033a = new TextPaint();
        TextPaint textPaint = this.f102033a;
        if (textPaint == null) {
            C7573i.m23583a("textPaint");
        }
        textPaint.setAntiAlias(true);
        this.f102035c = new Paint();
        this.f102034b = new Path();
        Paint paint = this.f102035c;
        if (paint == null) {
            C7573i.m23583a("mBgPaint");
        }
        paint.setAntiAlias(true);
        this.f102036d = new Paint();
        Paint paint2 = this.f102036d;
        if (paint2 == null) {
            C7573i.m23583a("anglePaint");
        }
        paint2.setAntiAlias(true);
        Typeface a = C10832b.m31784a().mo26161a(C10834d.f29337g);
        if (a != null) {
            try {
                TextPaint textPaint2 = this.f102033a;
                if (textPaint2 == null) {
                    C7573i.m23583a("textPaint");
                }
                textPaint2.setTypeface(a);
            } catch (Exception unused) {
            }
        }
    }

    public final void setText(String str) {
        this.f102037e = str;
        invalidate();
    }

    public final void setBgColor(int i) {
        Paint paint = this.f102035c;
        if (paint == null) {
            C7573i.m23583a("mBgPaint");
        }
        paint.setColor(i);
        invalidate();
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.f102033a;
        if (textPaint == null) {
            C7573i.m23583a("textPaint");
        }
        textPaint.setColor(i);
        invalidate();
    }

    public final void setTextSize(int i) {
        TextPaint textPaint = this.f102033a;
        if (textPaint == null) {
            C7573i.m23583a("textPaint");
        }
        textPaint.setTextSize((float) i);
        invalidate();
    }

    public final void setAttribute(C39296a aVar) {
        C7573i.m23587b(aVar, "attribute");
        this.f102044l = aVar.f102053g;
        this.f102045m = aVar.f102054h;
        this.f102042j = aVar.f102051e;
        this.f102041i = aVar.f102050d;
        this.f102038f = aVar.f102047a;
        this.f102039g = aVar.f102048b;
        this.f102040h = aVar.f102049c;
        this.f102046n = aVar.f102055i;
        Paint paint = this.f102035c;
        if (paint == null) {
            C7573i.m23583a("mBgPaint");
        }
        paint.setColor(this.f102045m);
        Paint paint2 = this.f102036d;
        if (paint2 == null) {
            C7573i.m23583a("anglePaint");
        }
        paint2.setColor(this.f102045m);
        TextPaint textPaint = this.f102033a;
        if (textPaint == null) {
            C7573i.m23583a("textPaint");
        }
        textPaint.setColor(this.f102044l);
        TextPaint textPaint2 = this.f102033a;
        if (textPaint2 == null) {
            C7573i.m23583a("textPaint");
        }
        textPaint2.setTextSize((float) this.f102046n);
        this.f102043k = aVar.f102052f;
        Paint paint3 = this.f102036d;
        if (paint3 == null) {
            C7573i.m23583a("anglePaint");
        }
        paint3.setPathEffect(new CornerPathEffect((float) this.f102043k));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        if (!TextUtils.isEmpty(this.f102037e)) {
            TextPaint textPaint = this.f102033a;
            if (textPaint == null) {
                C7573i.m23583a("textPaint");
            }
            if (textPaint == null) {
                C7573i.m23580a();
            }
            int measureText = ((int) textPaint.measureText(this.f102037e)) + (this.f102041i * 2);
            Rect rect = new Rect();
            TextPaint textPaint2 = this.f102033a;
            if (textPaint2 == null) {
                C7573i.m23583a("textPaint");
            }
            String str = this.f102037e;
            String str2 = this.f102037e;
            if (str2 == null) {
                C7573i.m23580a();
            }
            textPaint2.getTextBounds(str, 0, str2.length(), rect);
            int height = rect.height() + (this.f102041i * 2);
            float f = (float) height;
            RectF rectF = new RectF((float) this.f102042j, 0.0f, (float) (this.f102042j + measureText), f);
            float f2 = (float) this.f102042j;
            float f3 = (float) this.f102042j;
            Paint paint = this.f102035c;
            if (paint == null) {
                C7573i.m23583a("mBgPaint");
            }
            canvas.drawRoundRect(rectF, f2, f3, paint);
            Path path = this.f102034b;
            if (path == null) {
                C7573i.m23583a("anglePath");
            }
            path.moveTo((float) (this.f102040h + this.f102038f + this.f102042j), f);
            Path path2 = this.f102034b;
            if (path2 == null) {
                C7573i.m23583a("anglePath");
            }
            path2.lineTo((float) (this.f102040h + (this.f102038f / 2) + this.f102042j), (float) (this.f102039g + height));
            Path path3 = this.f102034b;
            if (path3 == null) {
                C7573i.m23583a("anglePath");
            }
            path3.lineTo((float) (this.f102040h + this.f102042j), f);
            Path path4 = this.f102034b;
            if (path4 == null) {
                C7573i.m23583a("anglePath");
            }
            Paint paint2 = this.f102036d;
            if (paint2 == null) {
                C7573i.m23583a("anglePaint");
            }
            canvas.drawPath(path4, paint2);
            String str3 = this.f102037e;
            if (str3 == null) {
                C7573i.m23580a();
            }
            String str4 = this.f102037e;
            if (str4 == null) {
                C7573i.m23580a();
            }
            int length = str4.length();
            float f4 = (float) (this.f102041i + this.f102042j);
            float f5 = (float) ((height - this.f102041i) - 4);
            TextPaint textPaint3 = this.f102033a;
            if (textPaint3 == null) {
                C7573i.m23583a("textPaint");
            }
            if (textPaint3 == null) {
                C7573i.m23580a();
            }
            canvas.drawText(str3, 0, length, f4, f5, textPaint3);
        }
    }

    public DmtBubbleTextView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        m125564a();
    }

    public final void onMeasure(int i, int i2) {
        if (TextUtils.isEmpty(this.f102037e)) {
            setMeasuredDimension(0, 0);
            return;
        }
        TextPaint textPaint = this.f102033a;
        if (textPaint == null) {
            C7573i.m23583a("textPaint");
        }
        if (textPaint == null) {
            C7573i.m23580a();
        }
        int measureText = ((int) textPaint.measureText(this.f102037e)) + (this.f102041i * 2) + (this.f102042j * 2);
        Rect rect = new Rect();
        TextPaint textPaint2 = this.f102033a;
        if (textPaint2 == null) {
            C7573i.m23583a("textPaint");
        }
        if (textPaint2 == null) {
            C7573i.m23580a();
        }
        String str = this.f102037e;
        String str2 = this.f102037e;
        if (str2 == null) {
            C7573i.m23580a();
        }
        textPaint2.getTextBounds(str, 0, str2.length(), rect);
        setMeasuredDimension(measureText, rect.height() + (this.f102041i * 2) + this.f102039g);
    }

    public /* synthetic */ DmtBubbleTextView(Context context, AttributeSet attributeSet, int i, C7571f fVar) {
        this(context, null);
    }
}
