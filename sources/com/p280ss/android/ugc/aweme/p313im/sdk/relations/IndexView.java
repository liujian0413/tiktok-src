package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.IndexView */
public class IndexView extends View {

    /* renamed from: a */
    private int f82745a = -1;

    /* renamed from: b */
    private C31601a f82746b;

    /* renamed from: c */
    private List<String> f82747c = new ArrayList();

    /* renamed from: d */
    private List<Integer> f82748d = new ArrayList();

    /* renamed from: e */
    private Context f82749e;

    /* renamed from: f */
    private Resources f82750f;

    /* renamed from: g */
    private int f82751g;

    /* renamed from: h */
    private int f82752h;

    /* renamed from: i */
    private int f82753i;

    /* renamed from: j */
    private int f82754j;

    /* renamed from: k */
    private int f82755k;

    /* renamed from: l */
    private TextView f82756l;

    /* renamed from: m */
    private Paint f82757m;

    /* renamed from: n */
    private Paint f82758n;

    /* renamed from: o */
    private int f82759o;

    /* renamed from: p */
    private int f82760p;

    /* renamed from: q */
    private float f82761q;

    /* renamed from: r */
    private Bitmap f82762r;

    /* renamed from: s */
    private Bitmap f82763s;

    /* renamed from: t */
    private Bitmap f82764t;

    /* renamed from: u */
    private Bitmap f82765u;

    /* renamed from: v */
    private Bitmap f82766v;

    /* renamed from: w */
    private Rect f82767w;

    /* renamed from: x */
    private Rect f82768x;

    /* renamed from: y */
    private int f82769y = 0;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.IndexView$a */
    public interface C31601a {
        /* renamed from: a */
        void mo82379a(String str, int i);
    }

    private int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : this.f82747c) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        double measureText = (double) this.f82758n.measureText(str);
        Double.isNaN(measureText);
        return (int) (measureText + 0.5d);
    }

    /* renamed from: a */
    private void m102703a() {
        this.f82750f = this.f82749e.getResources();
        this.f82758n = new Paint(1);
        this.f82758n.setTextSize(C9738o.m28708b(this.f82749e, 11.0f));
        this.f82758n.setTextAlign(Align.CENTER);
        this.f82758n.setColor(this.f82750f.getColor(R.color.uo));
        this.f82757m = new Paint(1);
        this.f82757m.setTextSize(C9738o.m28708b(this.f82749e, 11.0f));
        this.f82757m.setTextAlign(Align.CENTER);
        this.f82757m.setColor(this.f82750f.getColor(R.color.u0));
        this.f82766v = ((BitmapDrawable) this.f82750f.getDrawable(R.drawable.b66)).getBitmap();
        this.f82762r = ((BitmapDrawable) this.f82750f.getDrawable(R.drawable.b65)).getBitmap();
        this.f82763s = ((BitmapDrawable) this.f82750f.getDrawable(R.drawable.b64)).getBitmap();
        this.f82764t = ((BitmapDrawable) this.f82750f.getDrawable(R.drawable.b6c)).getBitmap();
        this.f82765u = ((BitmapDrawable) this.f82750f.getDrawable(R.drawable.b6b)).getBitmap();
        this.f82761q = C9738o.m28708b(this.f82749e, 2.0f);
        this.f82759o = (int) C9738o.m28708b(this.f82749e, 16.0f);
        this.f82760p = (int) (C9738o.m28708b(this.f82749e, 16.0f) + this.f82761q);
        this.f82767w = new Rect(0, 0, this.f82759o, this.f82759o);
        this.f82768x = new Rect();
    }

    public void setIndexLetterTv(TextView textView) {
        this.f82756l = textView;
    }

    public void setOnLetterTouchListener(C31601a aVar) {
        this.f82746b = aVar;
    }

    public void setCurrentIndex(int i) {
        this.f82745a = i;
        invalidate();
    }

    public void setIndexLetters(List<String> list) {
        this.f82747c.clear();
        this.f82747c.addAll(list);
        requestLayout();
    }

    public IndexView(Context context) {
        super(context);
        this.f82749e = context;
        m102703a();
    }

    /* renamed from: b */
    private int m102704b(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int suggestedMinWidth = getSuggestedMinWidth();
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(suggestedMinWidth, size);
            } else {
                size = suggestedMinWidth;
            }
        }
        this.f82752h = size;
        return size;
    }

    /* renamed from: a */
    public final int mo82367a(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f82748d.size() && i2 < i) {
            i3 += ((Integer) this.f82748d.get(i2)).intValue();
            i2++;
        }
        return i3;
    }

    /* renamed from: c */
    private int m102705c(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            FontMetrics fontMetrics = this.f82758n.getFontMetrics();
            int size2 = (int) (((float) this.f82747c.size()) * (fontMetrics.bottom - fontMetrics.top) * 1.2f);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(size2, size);
            } else {
                size = size2;
            }
        }
        this.f82753i = size;
        return size;
    }

    public void setCurrentIndex(String str) {
        int i = 0;
        while (true) {
            if (i >= this.f82747c.size()) {
                break;
            } else if (TextUtils.equals(str, (CharSequence) this.f82747c.get(i))) {
                this.f82745a = i;
                break;
            } else {
                i++;
            }
        }
        invalidate();
    }

    public void setRecycleViewPos(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= this.f82748d.size()) {
                break;
            }
            i3 += ((Integer) this.f82748d.get(i2)).intValue();
            if (i >= i3) {
                i2++;
            } else if (this.f82745a != i2) {
                this.f82745a = i2;
                invalidate();
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
            case 2:
                float y = motionEvent.getY();
                if (y <= ((float) (this.f82753i + this.f82755k))) {
                    this.f82745a = (int) (y / ((float) this.f82760p));
                    if (this.f82745a >= this.f82769y) {
                        this.f82745a = ((int) ((y - ((float) (this.f82760p * this.f82769y))) / ((float) this.f82755k))) + this.f82769y;
                    }
                    if (this.f82745a != this.f82751g && this.f82746b != null && this.f82745a >= 0 && this.f82745a < this.f82747c.size()) {
                        String str = (String) this.f82747c.get(this.f82745a);
                        if (str.equals("recent") || str.equals("Friend")) {
                            this.f82756l.setVisibility(8);
                        } else {
                            this.f82756l.setText(str);
                            this.f82756l.setVisibility(0);
                        }
                        this.f82746b.mo82379a(str, this.f82745a);
                    }
                    this.f82756l.setTranslationY((float) ((int) (((((y + ((float) this.f82756l.getTop())) + (((float) this.f82756l.getHeight()) / 2.0f)) - ((float) getTop())) - ((float) this.f82753i)) + (((float) this.f82755k) / 2.0f))));
                    this.f82751g = this.f82745a;
                    break;
                } else {
                    this.f82756l.setVisibility(8);
                    this.f82751g = -1;
                    return true;
                }
                break;
            case 1:
                this.f82756l.setVisibility(8);
                this.f82751g = -1;
                break;
        }
        invalidate();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f82747c != null && this.f82747c.size() != 0) {
            this.f82754j = this.f82752h;
            this.f82769y = 0;
            for (int i = 0; i < this.f82747c.size(); i++) {
                if (((String) this.f82747c.get(i)).equals("recent")) {
                    this.f82769y++;
                    this.f82767w.set(0, 0, this.f82759o, this.f82759o);
                    if (this.f82745a == i) {
                        canvas.drawBitmap(this.f82763s, null, this.f82767w, this.f82758n);
                    } else {
                        canvas.drawBitmap(this.f82762r, null, this.f82767w, this.f82758n);
                    }
                } else if (((String) this.f82747c.get(i)).equals("Friend")) {
                    this.f82769y++;
                    this.f82767w.set(0, this.f82760p * i, this.f82759o, (this.f82760p * i) + this.f82759o);
                    if (this.f82745a == i) {
                        canvas.drawBitmap(this.f82765u, null, this.f82767w, this.f82758n);
                    } else {
                        canvas.drawBitmap(this.f82764t, null, this.f82767w, this.f82758n);
                    }
                } else {
                    this.f82755k = (this.f82753i - (this.f82760p * this.f82769y)) / (this.f82747c.size() - this.f82769y);
                    this.f82758n.getTextBounds((String) this.f82747c.get(i), 0, ((String) this.f82747c.get(i)).length(), this.f82768x);
                    float f = ((float) this.f82754j) / 2.0f;
                    float height = ((float) ((this.f82760p * this.f82769y) + (this.f82755k * ((i + 1) - this.f82769y)))) - (((float) this.f82768x.height()) / 2.0f);
                    if (this.f82745a == i) {
                        canvas.drawText((String) this.f82747c.get(i), f, height, this.f82758n);
                    } else {
                        canvas.drawText((String) this.f82747c.get(i), f, height, this.f82757m);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(m102704b(i), m102705c(i2));
    }

    public IndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82749e = context;
        m102703a();
    }

    /* renamed from: a */
    public final void mo82368a(List<String> list, List<Integer> list2) {
        this.f82747c.clear();
        this.f82747c.addAll(list);
        this.f82748d.clear();
        this.f82748d.addAll(list2);
        requestLayout();
    }

    public IndexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f82749e = context;
        m102703a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
