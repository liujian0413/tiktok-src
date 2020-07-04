package com.bytedance.android.livesdk.commerce.coupon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LiveAlignTextView extends View {

    /* renamed from: a */
    private List<C5846b> f17199a;

    /* renamed from: b */
    private Paint f17200b = new Paint();

    /* renamed from: c */
    private List<Rect> f17201c;

    public LiveAlignTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private int m18303a(int i) {
        int mode = MeasureSpec.getMode(i);
        int defaultSize = View.getDefaultSize(getMinimumHeight(), i);
        if (mode == 1073741824) {
            return defaultSize;
        }
        int i2 = 0;
        if (this.f17201c == null) {
            return 0;
        }
        for (Rect rect : this.f17201c) {
            if (rect.height() > i2) {
                i2 = rect.height();
            }
        }
        if (defaultSize == 0) {
            return i2;
        }
        return Math.min(i2, defaultSize);
    }

    /* renamed from: a */
    private static List<C5846b> m18304a(List<C5846b> list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5846b bVar = (C5846b) it.next();
            if (bVar == null || TextUtils.isEmpty(bVar.f17209a)) {
                it.remove();
            }
        }
        return list;
    }

    /* renamed from: b */
    private int m18306b(int i) {
        int mode = MeasureSpec.getMode(i);
        int defaultSize = View.getDefaultSize(getMinimumWidth(), i);
        if (mode == 1073741824) {
            return defaultSize;
        }
        if (this.f17199a == null || this.f17201c == null) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17199a.size(); i3++) {
            i2 = i2 + ((C5846b) this.f17199a.get(i3)).f17212d + ((Rect) this.f17201c.get(i3)).width();
        }
        if (defaultSize == 0) {
            return i2;
        }
        return Math.min(i2, defaultSize);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        if (this.f17199a != null && this.f17201c != null) {
            int i = 0;
            for (int i2 = 0; i2 < this.f17199a.size(); i2++) {
                C5846b bVar = (C5846b) this.f17199a.get(i2);
                Rect rect = (Rect) this.f17201c.get(i2);
                m18305a(this.f17200b, bVar);
                int i3 = i + bVar.f17212d;
                canvas.drawText(bVar.f17209a, (float) (i3 - rect.left), (float) (height - rect.bottom), this.f17200b);
                i = i3 + rect.width();
            }
        }
    }

    public void setTextList(List<C5846b> list) {
        this.f17199a = m18304a(list);
        if (this.f17199a == null || this.f17199a.isEmpty()) {
            this.f17201c = null;
            return;
        }
        this.f17201c = new ArrayList();
        for (C5846b bVar : list) {
            Rect rect = new Rect();
            m18305a(this.f17200b, bVar);
            String str = bVar.f17209a;
            this.f17200b.getTextBounds(str, 0, str.length(), rect);
            this.f17201c.add(rect);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m18306b(i), m18303a(i2));
    }

    public LiveAlignTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private static void m18305a(Paint paint, C5846b bVar) {
        if (bVar != null && paint != null) {
            paint.setTextSize(bVar.f17210b);
            paint.setColor(bVar.f17211c);
            paint.setTypeface(bVar.f17213e);
        }
    }

    public LiveAlignTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
