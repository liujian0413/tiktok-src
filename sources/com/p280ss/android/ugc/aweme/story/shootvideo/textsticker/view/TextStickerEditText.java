package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.p029v7.widget.AppCompatEditText;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerEditText */
public class TextStickerEditText extends AppCompatEditText {

    /* renamed from: a */
    private int f109309a;

    /* renamed from: b */
    private int f109310b;

    /* renamed from: c */
    private int f109311c;

    /* renamed from: d */
    protected int f109312d;

    /* renamed from: e */
    protected Paint f109313e;

    /* renamed from: f */
    protected Path f109314f;

    /* renamed from: g */
    protected int f109315g;

    /* renamed from: h */
    protected int f109316h;

    /* renamed from: i */
    private int f109317i;

    /* renamed from: j */
    private boolean f109318j;

    /* renamed from: k */
    private int f109319k;

    /* renamed from: l */
    private int f109320l;

    public int getAlign() {
        return this.f109310b;
    }

    public int getBgColor() {
        return this.f109320l;
    }

    public int getBgColorMode() {
        return this.f109319k;
    }

    /* access modifiers changed from: protected */
    public int getScene() {
        return 0;
    }

    /* renamed from: a */
    private void m133805a() {
        String obj = getText().toString();
        setText(obj.substring(0, obj.length() - 1));
        setSelection(getText().length());
    }

    private String[] getTextStr() {
        if (TextUtils.isEmpty(getText())) {
            return null;
        }
        Layout layout = getLayout();
        String obj = getText().toString();
        String[] strArr = new String[getLineCount()];
        int i = 0;
        int i2 = 0;
        while (i < getLineCount()) {
            int lineEnd = layout.getLineEnd(i);
            strArr[i] = obj.substring(i2, lineEnd);
            layout.getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        return strArr;
    }

    public void setMode(int i) {
        this.f109309a = i;
    }

    public TextStickerEditText(Context context) {
        this(context, null);
    }

    private void setMaskBlurColor(int i) {
        setTextColor(-1);
        setShadowLayer(12.0f, 0.0f, 0.0f, i);
    }

    /* renamed from: a */
    public static int m133804a(int i) {
        return Color.argb(153, (16711680 & i) >> 16, (65280 & i) >> 8, i & NormalGiftView.ALPHA_255);
    }

    public void setAligin(int i) {
        this.f109310b = i;
        if (this.f109310b == 1) {
            setGravity(3);
        } else if (this.f109310b == 2) {
            setGravity(17);
        } else {
            if (this.f109310b == 3) {
                setGravity(5);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f109309a != 1 && !TextUtils.isEmpty(getText().toString())) {
            this.f109313e.setColor(this.f109315g);
            m133806a(canvas);
        }
        super.onDraw(canvas);
    }

    public void setFontType(Typeface typeface) {
        if (getTypeface() != typeface) {
            setTypeface(typeface);
        }
        this.f109318j = C42039d.m133620a().mo103238e(getScene());
        if (this.f109318j) {
            setMaskBlurColor(getCurrentTextColor());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo101545a(Context context) {
        this.f109312d = (int) C9738o.m28708b(context, 6.0f);
        this.f109316h = (int) C9738o.m28708b(context, 5.0f);
        this.f109313e = new Paint();
        this.f109313e.setColor(this.f109315g);
        this.f109313e.setStyle(Style.FILL);
        this.f109313e.setAntiAlias(true);
        this.f109313e.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        this.f109313e.setPathEffect(new CornerPathEffect((float) this.f109316h));
        this.f109314f = new Path();
        setLayerType(1, null);
        setLineSpacing((float) this.f109312d, getLineSpacingMultiplier());
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x014a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m133806a(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.String[] r1 = r19.getTextStr()
            if (r1 == 0) goto L_0x0294
            int r2 = r1.length
            if (r2 != 0) goto L_0x000d
            goto L_0x0294
        L_0x000d:
            int r2 = r1.length
            android.graphics.Point[][] r3 = new android.graphics.Point[r2][]
            android.text.TextPaint r4 = r19.getPaint()
            android.graphics.Paint$FontMetrics r4 = r4.getFontMetrics()
            float r5 = r4.descent
            float r4 = r4.ascent
            float r5 = r5 - r4
            double r4 = (double) r5
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            float r5 = r19.getTextSize()
            int r5 = (int) r5
            r6 = 4
            int r5 = r5 / r6
            int r7 = r0.f109310b
            r8 = 0
            r9 = 1
            if (r7 != r9) goto L_0x0032
            r0.f109311c = r8
        L_0x0032:
            int r7 = r0.f109310b
            r10 = 3
            if (r7 != r10) goto L_0x003d
            int r7 = r19.getMeasuredWidth()
            r0.f109311c = r7
        L_0x003d:
            int r7 = r0.f109310b
            r11 = 2
            if (r7 != r11) goto L_0x0049
            int r7 = r19.getMeasuredWidth()
            int r7 = r7 / r11
            r0.f109311c = r7
        L_0x0049:
            r7 = -1
            r7 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
        L_0x0053:
            if (r7 >= r2) goto L_0x017f
            android.text.TextPaint r8 = r19.getPaint()
            r10 = r1[r7]
            float r8 = r8.measureText(r10)
            int r8 = (int) r8
            int r10 = r0.f109311c
            int r18 = r8 / 2
            int r10 = r10 - r18
            int r6 = r0.f109312d
            int r6 = r6 * 2
            int r10 = r10 - r6
            int r6 = r0.f109311c
            int r6 = r6 + r18
            int r9 = r0.f109312d
            int r9 = r9 * 2
            int r6 = r6 + r9
            int r9 = r0.f109310b
            r11 = 1
            if (r9 != r11) goto L_0x0085
            int r10 = r0.f109311c
            int r6 = r0.f109311c
            int r6 = r6 + r8
            int r9 = r0.f109312d
            r11 = 4
            int r9 = r9 * 4
            int r6 = r6 + r9
            goto L_0x0086
        L_0x0085:
            r11 = 4
        L_0x0086:
            int r9 = r0.f109310b
            r11 = 3
            if (r9 != r11) goto L_0x0097
            int r6 = r0.f109311c
            int r6 = r6 - r8
            int r9 = r0.f109312d
            r10 = 4
            int r9 = r9 * 4
            int r10 = r6 - r9
            int r6 = r0.f109311c
        L_0x0097:
            r9 = r1[r7]
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x00ab
            r9 = r1[r7]
            java.lang.String r9 = r9.trim()
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00c7
        L_0x00ab:
            int r6 = r19.getMeasuredWidth()
            r9 = 2
            int r6 = r6 / r9
            int r9 = r0.f109310b
            r10 = 1
            if (r9 != r10) goto L_0x00b8
            int r6 = r0.f109312d
        L_0x00b8:
            r10 = r6
            int r6 = r0.f109310b
            r9 = 3
            if (r6 != r9) goto L_0x00c6
            int r6 = r19.getMeasuredWidth()
            int r9 = r0.f109312d
            int r10 = r6 - r9
        L_0x00c6:
            r6 = r10
        L_0x00c7:
            int r9 = r8 - r12
            int r9 = java.lang.Math.abs(r9)
            if (r9 >= r5) goto L_0x00e7
            int r9 = r0.f109310b
            r11 = 1
            if (r9 != r11) goto L_0x00d7
            if (r13 <= 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00d7:
            int r9 = r0.f109310b
            r11 = 3
            if (r9 != r11) goto L_0x00df
            if (r14 <= 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00df:
            int r9 = r0.f109310b
            r11 = 2
            if (r9 != r11) goto L_0x00e7
            if (r14 <= 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            r13 = r6
            r14 = r10
        L_0x00e9:
            if (r7 != 0) goto L_0x0101
            com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d.m133620a()
            int r6 = r19.getScene()
            boolean r6 = com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d.m133631g(r6)
            if (r6 != 0) goto L_0x00ff
            int r6 = r0.f109317i
            int r9 = r0.f109312d
            int r15 = r6 - r9
            goto L_0x0101
        L_0x00ff:
            int r15 = r0.f109317i
        L_0x0101:
            int r6 = r15 + r4
            r9 = 1
            if (r2 <= r9) goto L_0x012c
            if (r7 <= 0) goto L_0x0117
            android.text.TextPaint r9 = r19.getPaint()
            int r10 = r7 + -1
            r10 = r1[r10]
            float r9 = r9.measureText(r10)
            int r9 = (int) r9
            r16 = r9
        L_0x0117:
            int r9 = r2 + -1
            if (r7 >= r9) goto L_0x012c
            android.text.TextPaint r9 = r19.getPaint()
            int r10 = r7 + 1
            r10 = r1[r10]
            float r9 = r9.measureText(r10)
            int r9 = (int) r9
            r10 = r9
            r9 = r16
            goto L_0x0130
        L_0x012c:
            r9 = r16
            r10 = r17
        L_0x0130:
            if (r9 <= 0) goto L_0x0137
            if (r8 < r9) goto L_0x0137
            int r11 = r0.f109312d
            int r6 = r6 + r11
        L_0x0137:
            if (r10 <= 0) goto L_0x013e
            if (r8 <= r10) goto L_0x013e
            int r11 = r0.f109312d
            int r6 = r6 + r11
        L_0x013e:
            if (r7 != 0) goto L_0x0143
            int r11 = r0.f109312d
            int r15 = r15 - r11
        L_0x0143:
            int r11 = r2 + -1
            if (r7 != r11) goto L_0x014a
            int r11 = r0.f109312d
            int r6 = r6 + r11
        L_0x014a:
            r11 = 4
            android.graphics.Point[] r12 = new android.graphics.Point[r11]
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r14, r15)
            r16 = 0
            r12[r16] = r11
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r13, r15)
            r15 = 1
            r12[r15] = r11
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r13, r6)
            r15 = 2
            r12[r15] = r11
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r14, r6)
            r15 = 3
            r12[r15] = r11
            r3[r7] = r12
            int r7 = r7 + 1
            r15 = r6
            r12 = r8
            r16 = r9
            r17 = r10
            r6 = 4
            r8 = 0
            r9 = 1
            r10 = 3
            r11 = 2
            goto L_0x0053
        L_0x017f:
            android.graphics.Path r1 = r0.f109314f
            r1.reset()
            r1 = 0
        L_0x0185:
            if (r1 >= r2) goto L_0x01ff
            if (r1 != 0) goto L_0x019d
            android.graphics.Path r4 = r0.f109314f
            r5 = r3[r1]
            r6 = 0
            r5 = r5[r6]
            int r5 = r5.x
            float r5 = (float) r5
            r7 = r3[r1]
            r7 = r7[r6]
            int r6 = r7.y
            float r6 = (float) r6
            r4.moveTo(r5, r6)
        L_0x019d:
            android.graphics.Path r4 = r0.f109314f
            r5 = r3[r1]
            r6 = 1
            r5 = r5[r6]
            int r5 = r5.x
            float r5 = (float) r5
            r7 = r3[r1]
            r7 = r7[r6]
            int r7 = r7.y
            float r7 = (float) r7
            r4.lineTo(r5, r7)
            r4 = r3[r1]
            r5 = 0
            r4 = r4[r5]
            int r4 = r4.x
            r5 = r3[r1]
            r5 = r5[r6]
            int r5 = r5.x
            if (r4 != r5) goto L_0x01e8
            android.graphics.Path r4 = r0.f109314f
            r5 = r3[r1]
            r5 = r5[r6]
            int r5 = r5.x
            float r5 = (float) r5
            r7 = r3[r1]
            r7 = r7[r6]
            int r6 = r7.y
            float r6 = (float) r6
            r4.lineTo(r5, r6)
            android.graphics.Path r4 = r0.f109314f
            r5 = r3[r1]
            r6 = 2
            r5 = r5[r6]
            int r5 = r5.x
            float r5 = (float) r5
            r7 = r3[r1]
            r7 = r7[r6]
            int r7 = r7.y
            float r7 = (float) r7
            r4.lineTo(r5, r7)
            goto L_0x01e9
        L_0x01e8:
            r6 = 2
        L_0x01e9:
            android.graphics.Path r4 = r0.f109314f
            r5 = r3[r1]
            r5 = r5[r6]
            int r5 = r5.x
            float r5 = (float) r5
            r7 = r3[r1]
            r7 = r7[r6]
            int r7 = r7.y
            float r7 = (float) r7
            r4.lineTo(r5, r7)
            int r1 = r1 + 1
            goto L_0x0185
        L_0x01ff:
            r1 = 1
            int r2 = r2 - r1
        L_0x0201:
            if (r2 < 0) goto L_0x0275
            r4 = r3[r2]
            r5 = 0
            r4 = r4[r5]
            int r4 = r4.x
            r5 = r3[r2]
            r5 = r5[r1]
            int r1 = r5.x
            if (r4 != r1) goto L_0x0227
            android.graphics.Path r1 = r0.f109314f
            r4 = r3[r2]
            r5 = 3
            r4 = r4[r5]
            int r4 = r4.x
            float r4 = (float) r4
            r6 = r3[r2]
            r6 = r6[r5]
            int r6 = r6.y
            float r6 = (float) r6
            r1.lineTo(r4, r6)
            goto L_0x0228
        L_0x0227:
            r5 = 3
        L_0x0228:
            android.graphics.Path r1 = r0.f109314f
            r4 = r3[r2]
            r4 = r4[r5]
            int r4 = r4.x
            float r4 = (float) r4
            r6 = r3[r2]
            r6 = r6[r5]
            int r6 = r6.y
            float r6 = (float) r6
            r1.lineTo(r4, r6)
            r1 = r3[r2]
            r4 = 0
            r1 = r1[r4]
            int r1 = r1.x
            r6 = r3[r2]
            r7 = 1
            r6 = r6[r7]
            int r6 = r6.x
            if (r1 != r6) goto L_0x025e
            android.graphics.Path r1 = r0.f109314f
            r6 = r3[r2]
            r6 = r6[r4]
            int r6 = r6.x
            float r6 = (float) r6
            r7 = r3[r2]
            r7 = r7[r4]
            int r7 = r7.y
            float r7 = (float) r7
            r1.lineTo(r6, r7)
        L_0x025e:
            android.graphics.Path r1 = r0.f109314f
            r6 = r3[r2]
            r6 = r6[r4]
            int r6 = r6.x
            float r6 = (float) r6
            r7 = r3[r2]
            r7 = r7[r4]
            int r7 = r7.y
            float r7 = (float) r7
            r1.lineTo(r6, r7)
            int r2 = r2 + -1
            r1 = 1
            goto L_0x0201
        L_0x0275:
            r4 = 0
            android.graphics.Path r1 = r0.f109314f
            r2 = r3[r4]
            r5 = 1
            r2 = r2[r5]
            int r2 = r2.x
            float r2 = (float) r2
            r3 = r3[r4]
            r3 = r3[r5]
            int r3 = r3.y
            float r3 = (float) r3
            r1.lineTo(r2, r3)
            android.graphics.Path r1 = r0.f109314f
            android.graphics.Paint r2 = r0.f109313e
            r3 = r20
            r3.drawPath(r1, r2)
            return
        L_0x0294:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerEditText.m133806a(android.graphics.Canvas):void");
    }

    public TextStickerEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109315g = -1;
        this.f109309a = 1;
        this.f109310b = 2;
        mo101545a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f109311c = getMeasuredWidth() / 2;
        if (this.f109317i == 0) {
            this.f109317i = (getLineHeight() - this.f109312d) / 2;
        }
    }

    /* renamed from: a */
    public void mo101544a(int i, int i2) {
        this.f109319k = i;
        this.f109320l = i2;
        if (this.f109318j) {
            setMaskBlurColor(i2);
            this.f109309a = 1;
            return;
        }
        setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        if (i == 1) {
            this.f109309a = 1;
            this.f109315g = i2;
            setBackground(null);
            setTextColor(i2);
        } else if (i == 2) {
            this.f109309a = 2;
            this.f109315g = i2;
            if (i2 == -1) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
        } else {
            if (i == 3) {
                this.f109309a = 3;
                this.f109315g = m133804a(i2);
                setTextColor(-1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        if (getLineCount() > 20) {
            m133805a();
        }
    }
}
