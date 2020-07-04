package com.p280ss.android.ugc.aweme.story.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Message;
import android.support.p029v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.collection.C6309f.C6310a;

/* renamed from: com.ss.android.ugc.aweme.story.widget.ShootButton */
public class ShootButton extends AppCompatImageView implements OnTouchListener, C6310a {

    /* renamed from: a */
    public static final String f109485a = "ShootButton";

    /* renamed from: f */
    private static final long f109486f = ((long) ViewConfiguration.getLongPressTimeout());

    /* renamed from: b */
    public boolean f109487b;

    /* renamed from: c */
    public int f109488c;

    /* renamed from: d */
    public Paint f109489d;

    /* renamed from: e */
    public C42097d f109490e;

    /* renamed from: g */
    private boolean f109491g;

    /* renamed from: h */
    private Paint f109492h;

    /* renamed from: i */
    private Paint f109493i;

    /* renamed from: j */
    private RectF f109494j;

    /* renamed from: k */
    private float f109495k;

    /* renamed from: l */
    private int f109496l;

    /* renamed from: m */
    private int f109497m;

    /* renamed from: n */
    private float f109498n;

    /* renamed from: o */
    private int f109499o;

    /* renamed from: p */
    private int f109500p;

    /* renamed from: q */
    private float f109501q;

    /* renamed from: r */
    private String f109502r;

    /* renamed from: s */
    private boolean f109503s;

    /* renamed from: t */
    private C42099a f109504t;

    /* renamed from: u */
    private C42096c f109505u;

    /* renamed from: v */
    private C42094a f109506v;

    /* renamed from: w */
    private C42095b f109507w;

    /* renamed from: x */
    private GestureDetector f109508x;

    /* renamed from: y */
    private long f109509y;

    /* renamed from: z */
    private boolean f109510z;

    /* renamed from: com.ss.android.ugc.aweme.story.widget.ShootButton$a */
    public interface C42094a {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.widget.ShootButton$b */
    public interface C42095b {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.widget.ShootButton$c */
    public interface C42096c {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.widget.ShootButton$d */
    public interface C42097d {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.widget.ShootButton$e */
    public interface C42098e {

        /* renamed from: com.ss.android.ugc.aweme.story.widget.ShootButton$e$a */
        public interface C42099a {
        }
    }

    public void handleMsg(Message message) {
    }

    /* renamed from: a */
    private void m133963a() {
        this.f109494j.left = this.f109498n / 2.0f;
        this.f109494j.top = this.f109498n / 2.0f;
        this.f109494j.right = ((float) this.f109496l) - (this.f109498n / 2.0f);
        this.f109494j.bottom = ((float) this.f109497m) - (this.f109498n / 2.0f);
    }

    /* renamed from: b */
    private void m133967b() {
        this.f109496l = getWidth();
        this.f109497m = getHeight();
        if (this.f109496l != this.f109497m) {
            int min = Math.min(this.f109496l, this.f109497m);
            this.f109496l = min;
            this.f109497m = min;
        }
    }

    private void setState(int i) {
        this.f109499o = i;
    }

    public void setLiveHandle(C42094a aVar) {
        this.f109506v = aVar;
    }

    public void setMotionEventWapper(C42099a aVar) {
        this.f109504t = aVar;
    }

    public void setOnShootListener(C42097d dVar) {
        this.f109490e = dVar;
    }

    public void setOnVisibilityChangedListener(C42095b bVar) {
        this.f109507w = bVar;
    }

    public void setPublishHandle(C42096c cVar) {
        this.f109505u = cVar;
    }

    public void setText(String str) {
        this.f109502r = str;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void setCancel(boolean z) {
        this.f109491g = z;
        invalidate();
    }

    /* renamed from: a */
    private int m133962a(int i) {
        return (int) ((((float) i) - this.f109489d.measureText(this.f109502r)) / 2.0f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f109499o == 0 || this.f109499o == 2) {
            m133968b(canvas);
        }
    }

    public void setRefreshingProgress(float f) {
        if (this.f109501q != f) {
            this.f109501q = f;
            this.f109495k = f;
            postInvalidate();
        }
    }

    public void setTextEnable(boolean z) {
        this.f109503s = z;
        if (this.f109503s) {
            setState(2);
        }
    }

    /* renamed from: b */
    private int m133966b(int i) {
        return (int) ((((float) i) / 2.0f) - ((this.f109489d.descent() + this.f109489d.ascent()) / 2.0f));
    }

    /* renamed from: c */
    private void m133970c(Canvas canvas) {
        canvas.drawCircle((float) (this.f109496l / 2), (float) (this.f109497m / 2), ((float) (this.f109496l / 2)) - this.f109498n, this.f109493i);
    }

    /* renamed from: a */
    private void m133964a(Canvas canvas) {
        if (this.f109503s && !TextUtils.isEmpty(this.f109502r)) {
            canvas.drawText(this.f109502r, (float) m133962a(canvas.getWidth()), (float) m133966b(canvas.getHeight()), this.f109489d);
        }
    }

    /* renamed from: b */
    private void m133968b(Canvas canvas) {
        if (!this.f109510z) {
            m133967b();
            m133963a();
            this.f109492h.setStrokeWidth(this.f109498n);
            this.f109510z = true;
        }
        m133970c(canvas);
        if (this.f109491g) {
            this.f109492h.setColor(0);
            canvas.drawArc(this.f109494j, -90.0f, 360.0f, false, this.f109492h);
            this.f109491g = false;
            return;
        }
        m133972d(canvas);
        m133964a(canvas);
    }

    /* renamed from: c */
    private boolean m133971c(MotionEvent motionEvent) {
        this.f109508x.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    animate().scaleY(1.2f).scaleX(1.2f).setDuration(150).start();
                    break;
                case 1:
                    break;
            }
        }
        animate().scaleY(1.0f).scaleX(1.0f).setDuration(150).start();
        if (this.f109490e != null && this.f109487b) {
            this.f109487b = false;
        }
        return true;
    }

    /* renamed from: d */
    private void m133972d(Canvas canvas) {
        if (this.f109495k > 0.0f && this.f109495k < ((float) this.f109488c)) {
            this.f109492h.setColor(getResources().getColor(this.f109500p));
            canvas.drawArc(this.f109494j, -90.0f, (this.f109495k / ((float) this.f109488c)) * 360.0f, false, this.f109492h);
        } else if (this.f109495k == 0.0f) {
            this.f109492h.setColor(0);
            canvas.drawArc(this.f109494j, -90.0f, 360.0f, false, this.f109492h);
        } else {
            if (this.f109495k >= ((float) this.f109488c)) {
                canvas.drawArc(this.f109494j, -90.0f, 360.0f, false, this.f109492h);
            }
        }
    }

    /* renamed from: a */
    private void m133965a(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                animate().scaleY(1.2f).scaleX(1.2f).setDuration(100).start();
                return;
            case 1:
                animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f109509y >= 1500) {
                    this.f109509y = currentTimeMillis;
                    break;
                }
                break;
            case 2:
                return;
            case 3:
                animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                return;
        }
    }

    /* renamed from: b */
    private void m133969b(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                animate().scaleY(1.2f).scaleX(1.2f).setDuration(100).start();
                return;
            case 1:
                animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                break;
            case 2:
                return;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f109499o == 0) {
            return m133971c(motionEvent);
        }
        if (this.f109499o == 1) {
            m133969b(motionEvent);
        } else if (this.f109499o == 2) {
            m133965a(motionEvent);
        }
        return true;
    }
}
