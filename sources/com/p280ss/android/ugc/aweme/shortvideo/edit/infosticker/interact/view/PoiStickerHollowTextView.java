package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.PoiStickerHollowTextView */
public class PoiStickerHollowTextView extends View {

    /* renamed from: a */
    private String f102995a;

    /* renamed from: b */
    private float f102996b;

    /* renamed from: c */
    private Paint f102997c;

    /* renamed from: d */
    private Paint f102998d;

    /* renamed from: e */
    private Paint f102999e;

    /* renamed from: f */
    private Paint f103000f;

    /* renamed from: g */
    private Paint f103001g;

    /* renamed from: h */
    private float f103002h;

    /* renamed from: i */
    private int f103003i;

    /* renamed from: j */
    private int f103004j;

    /* renamed from: k */
    private RectF f103005k;

    /* renamed from: l */
    private String f103006l;

    /* renamed from: m */
    private float f103007m;

    /* renamed from: n */
    private int f103008n;

    /* renamed from: o */
    private int f103009o;

    /* renamed from: p */
    private int f103010p;

    public String getText() {
        return this.f102995a;
    }

    public int getTextViewWidth() {
        return ((int) this.f102997c.measureText(this.f102995a)) + ((int) this.f103000f.measureText(this.f103006l)) + this.f103009o + getPaddingLeft() + getPaddingRight();
    }

    public void setMaxWidth(int i) {
        this.f103008n = i;
    }

    public PoiStickerHollowTextView(Context context) {
        this(context, null);
    }

    public void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f102995a = str;
            requestLayout();
            invalidate();
        }
    }

    public void setTextSize(float f) {
        this.f102996b = f;
        this.f102997c.setTextSize(this.f102996b);
        this.f102998d.setTextSize(this.f102996b);
        this.f103000f.setTextSize(this.f102996b * this.f103007m);
        this.f103001g.setTextSize(this.f102996b * this.f103007m);
        requestLayout();
        invalidate();
    }

    /* renamed from: a */
    private void m126890a(Context context) {
        this.f102996b = (float) ((int) C9738o.m28708b(context, 28.0f));
        this.f103002h = C9738o.m28708b(context, 5.0f);
        this.f103009o = (int) C9738o.m28708b(context, 10.0f);
        this.f103010p = (int) C9738o.m28708b(context, 6.0f);
        this.f102997c = new Paint();
        this.f102997c.setTextSize(this.f102996b);
        this.f102997c.setAntiAlias(true);
        this.f102997c.setFakeBoldText(true);
        this.f102997c.setColor(-16777216);
        this.f102998d = new Paint(this.f102997c);
        this.f102998d.setColor(1073741824);
        this.f102999e = new Paint(this.f102997c);
        this.f102999e.setColor(-1);
        this.f103000f = new Paint(this.f102997c);
        this.f103000f.setTextSize(this.f102996b * this.f103007m);
        this.f103001g = new Paint(this.f102998d);
        this.f103001g.setTextSize(this.f102996b * this.f103007m);
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "poi_sticker_iconfont.ttf");
            this.f103000f.setTypeface(createFromAsset);
            this.f103001g.setTypeface(createFromAsset);
        } catch (Exception unused) {
        }
        this.f103005k = new RectF();
        this.f103006l = context.getResources().getString(R.string.d0u);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        this.f103005k.set(0.0f, 0.0f, (float) this.f103003i, (float) this.f103004j);
        String a = m126889a(this.f102995a, this.f103008n);
        if (VERSION.SDK_INT >= 21) {
            i = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null);
        } else {
            i = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
        }
        this.f102997c.setXfermode(new PorterDuffXfermode(Mode.SRC));
        canvas.drawRoundRect(this.f103005k, this.f103002h, this.f103002h, this.f102999e);
        this.f102997c.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        this.f103000f.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        FontMetrics fontMetrics = this.f102997c.getFontMetrics();
        int measuredHeight = (int) ((((((float) getMeasuredHeight()) - fontMetrics.bottom) + fontMetrics.top) / 2.0f) - fontMetrics.top);
        FontMetrics fontMetrics2 = this.f103000f.getFontMetrics();
        float measuredHeight2 = (float) ((int) ((((((float) getMeasuredHeight()) - fontMetrics2.bottom) + fontMetrics2.top) / 2.0f) - fontMetrics2.top));
        canvas.drawText(this.f103006l, (float) getPaddingLeft(), measuredHeight2, this.f103000f);
        canvas.drawText(this.f103006l, (float) getPaddingLeft(), measuredHeight2, this.f103001g);
        float measureText = this.f103000f.measureText(this.f103006l);
        float f = (float) measuredHeight;
        canvas.drawText(a, ((float) getPaddingLeft()) + measureText + ((float) this.f103009o), f, this.f102997c);
        canvas.drawText(a, ((float) getPaddingLeft()) + measureText + ((float) this.f103009o), f, this.f102998d);
        canvas.restoreToCount(i);
    }

    public PoiStickerHollowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private String m126889a(String str, int i) {
        int measureText = (int) this.f102997c.measureText("...");
        int measureText2 = (int) ((((((float) i) - this.f103000f.measureText(this.f103006l)) - ((float) getPaddingLeft())) - ((float) getPaddingRight())) - ((float) this.f103009o));
        if (((int) this.f102997c.measureText(str)) <= measureText2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (((float) measureText2) - this.f102997c.measureText(sb.toString()) < ((float) measureText)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, i2));
                sb2.append("...");
                return sb2.toString();
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        String a = m126889a(this.f102995a, this.f103008n);
        Rect rect = new Rect();
        this.f102997c.getTextBounds(a, 0, a.length(), rect);
        this.f103003i = rect.width() + ((int) this.f103000f.measureText(this.f103006l)) + this.f103009o + getPaddingLeft() + getPaddingRight();
        this.f103004j = rect.height() + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(this.f103003i, this.f103004j);
    }

    public PoiStickerHollowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f102996b = 15.0f;
        this.f103007m = 0.7f;
        m126890a(context);
    }
}
