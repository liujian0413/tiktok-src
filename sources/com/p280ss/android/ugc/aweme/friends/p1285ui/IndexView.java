package com.p280ss.android.ugc.aweme.friends.p1285ui;

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

/* renamed from: com.ss.android.ugc.aweme.friends.ui.IndexView */
public class IndexView extends View {

    /* renamed from: a */
    private int f79176a = -1;

    /* renamed from: b */
    private C30109a f79177b;

    /* renamed from: c */
    private List<String> f79178c = new ArrayList();

    /* renamed from: d */
    private List<Integer> f79179d = new ArrayList();

    /* renamed from: e */
    private Context f79180e;

    /* renamed from: f */
    private Resources f79181f;

    /* renamed from: g */
    private int f79182g;

    /* renamed from: h */
    private int f79183h;

    /* renamed from: i */
    private int f79184i;

    /* renamed from: j */
    private int f79185j;

    /* renamed from: k */
    private int f79186k;

    /* renamed from: l */
    private TextView f79187l;

    /* renamed from: m */
    private Paint f79188m;

    /* renamed from: n */
    private Paint f79189n;

    /* renamed from: o */
    private float f79190o;

    /* renamed from: p */
    private int f79191p;

    /* renamed from: q */
    private int f79192q;

    /* renamed from: r */
    private float f79193r;

    /* renamed from: s */
    private Bitmap f79194s;

    /* renamed from: t */
    private Bitmap f79195t;

    /* renamed from: u */
    private Bitmap f79196u;

    /* renamed from: v */
    private Bitmap f79197v;

    /* renamed from: w */
    private Rect f79198w;

    /* renamed from: x */
    private Rect f79199x;

    /* renamed from: y */
    private int f79200y = 0;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.IndexView$a */
    public interface C30109a {
        /* renamed from: a */
        void mo76471a(String str, int i);
    }

    private int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : this.f79178c) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        double measureText = (double) this.f79189n.measureText(str);
        Double.isNaN(measureText);
        return (int) (measureText + 0.5d);
    }

    /* renamed from: a */
    private void m98650a() {
        this.f79181f = this.f79180e.getResources();
        this.f79189n = new Paint(1);
        this.f79189n.setTextSize(C9738o.m28708b(this.f79180e, 11.0f));
        this.f79189n.setTextAlign(Align.CENTER);
        this.f79189n.setColor(this.f79181f.getColor(R.color.a4x));
        this.f79188m = new Paint(1);
        this.f79188m.setTextSize(C9738o.m28708b(this.f79180e, 11.0f));
        this.f79188m.setTextAlign(Align.CENTER);
        this.f79188m.setColor(this.f79181f.getColor(R.color.ab5));
        this.f79194s = ((BitmapDrawable) this.f79181f.getDrawable(R.drawable.a5o)).getBitmap();
        this.f79195t = ((BitmapDrawable) this.f79181f.getDrawable(R.drawable.a5q)).getBitmap();
        this.f79197v = ((BitmapDrawable) this.f79181f.getDrawable(R.drawable.a9p)).getBitmap();
        this.f79196u = ((BitmapDrawable) this.f79181f.getDrawable(R.drawable.a9o)).getBitmap();
        this.f79193r = C9738o.m28708b(this.f79180e, 2.0f);
        this.f79191p = (int) C9738o.m28708b(this.f79180e, 16.0f);
        this.f79192q = (int) (C9738o.m28708b(this.f79180e, 16.0f) + this.f79193r);
        this.f79198w = new Rect(0, 0, this.f79191p, this.f79192q);
        this.f79199x = new Rect();
    }

    public void setIndexLetterTv(TextView textView) {
        this.f79187l = textView;
    }

    public void setOnLetterTouchListener(C30109a aVar) {
        this.f79177b = aVar;
    }

    public IndexView(Context context) {
        super(context);
        this.f79180e = context;
        m98650a();
    }

    /* renamed from: b */
    private int m98651b(int i) {
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
        this.f79183h = size;
        return size;
    }

    /* renamed from: a */
    public final int mo76519a(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f79179d.size() && i2 < i) {
            i3 += ((Integer) this.f79179d.get(i2)).intValue();
            i2++;
        }
        return i3;
    }

    /* renamed from: c */
    private int m98652c(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            FontMetrics fontMetrics = this.f79189n.getFontMetrics();
            float f = fontMetrics.bottom - fontMetrics.top;
            this.f79190o = fontMetrics.bottom * 1.2f;
            int size2 = (int) (((float) this.f79178c.size()) * f * 1.2f);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(size2, size);
            } else {
                size = size2;
            }
        }
        this.f79184i = size;
        return size;
    }

    public void setCurrentIndex(String str) {
        int i = 0;
        while (true) {
            if (i >= this.f79178c.size()) {
                break;
            } else if (TextUtils.equals(str, (CharSequence) this.f79178c.get(i))) {
                this.f79176a = i;
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
            if (i2 >= this.f79179d.size()) {
                break;
            }
            i3 += ((Integer) this.f79179d.get(i2)).intValue();
            if (i >= i3) {
                i2++;
            } else if (this.f79176a != i2) {
                this.f79176a = i2;
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
                if (y <= ((float) (this.f79184i + this.f79186k))) {
                    this.f79176a = (int) (y / ((float) this.f79192q));
                    if (this.f79176a >= this.f79200y) {
                        this.f79176a = ((int) ((y - ((float) (this.f79192q * this.f79200y))) / ((float) this.f79186k))) + this.f79200y;
                    }
                    if (this.f79176a != this.f79182g && this.f79177b != null && this.f79176a >= 0 && this.f79176a < this.f79178c.size()) {
                        String str = (String) this.f79178c.get(this.f79176a);
                        this.f79177b.mo76471a(str, this.f79176a);
                        if (str.equals("Recent") || str.equals("Friend")) {
                            this.f79187l.setVisibility(8);
                        } else {
                            this.f79187l.setText(str);
                            this.f79187l.setVisibility(0);
                        }
                    }
                    this.f79187l.setTranslationY((float) ((int) (((((y + ((float) this.f79187l.getTop())) + (((float) this.f79187l.getHeight()) / 2.0f)) - ((float) getTop())) - ((float) this.f79184i)) + (((float) this.f79186k) / 2.0f))));
                    this.f79182g = this.f79176a;
                    break;
                } else {
                    this.f79187l.setVisibility(8);
                    this.f79182g = -1;
                    return true;
                }
            case 1:
                this.f79187l.setVisibility(8);
                this.f79182g = -1;
                break;
        }
        invalidate();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f79178c != null && this.f79178c.size() != 0) {
            this.f79185j = this.f79183h;
            this.f79200y = 0;
            for (int i = 0; i < this.f79178c.size(); i++) {
                if (((String) this.f79178c.get(i)).equals("Recent")) {
                    this.f79200y++;
                    this.f79198w.set(0, 0, this.f79191p, this.f79191p);
                    if (this.f79176a == i) {
                        canvas.drawBitmap(this.f79195t, null, this.f79198w, this.f79189n);
                    } else {
                        canvas.drawBitmap(this.f79194s, null, this.f79198w, this.f79189n);
                    }
                } else if (((String) this.f79178c.get(i)).equals("Friend")) {
                    this.f79200y++;
                    this.f79198w.set(0, this.f79192q * i, this.f79191p, (this.f79192q * i) + this.f79191p);
                    if (this.f79176a == i) {
                        canvas.drawBitmap(this.f79197v, null, this.f79198w, this.f79189n);
                    } else {
                        canvas.drawBitmap(this.f79196u, null, this.f79198w, this.f79189n);
                    }
                } else {
                    this.f79186k = (this.f79184i - (this.f79192q * this.f79200y)) / (this.f79178c.size() - this.f79200y);
                    this.f79189n.getTextBounds((String) this.f79178c.get(i), 0, ((String) this.f79178c.get(i)).length(), this.f79199x);
                    float f = ((float) this.f79185j) / 2.0f;
                    float height = ((float) ((this.f79192q * this.f79200y) + (this.f79186k * ((i + 1) - this.f79200y)))) - (((float) this.f79199x.height()) / 2.0f);
                    if (this.f79176a == i) {
                        canvas.drawText((String) this.f79178c.get(i), f, height, this.f79189n);
                    } else {
                        canvas.drawText((String) this.f79178c.get(i), f, height, this.f79188m);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(m98651b(i), m98652c(i2));
    }

    public IndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f79180e = context;
        m98650a();
    }

    /* renamed from: a */
    public final void mo76520a(List<String> list, List<Integer> list2) {
        this.f79178c.clear();
        this.f79179d.clear();
        this.f79178c.addAll(list);
        this.f79179d.addAll(list2);
        requestLayout();
    }

    public IndexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f79180e = context;
        m98650a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
