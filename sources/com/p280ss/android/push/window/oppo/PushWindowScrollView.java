package com.p280ss.android.push.window.oppo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.ss.android.push.window.oppo.PushWindowScrollView */
public class PushWindowScrollView extends FrameLayout {

    /* renamed from: a */
    protected VelocityTracker f54162a;

    /* renamed from: b */
    protected int f54163b = -1;

    /* renamed from: c */
    boolean f54164c;

    /* renamed from: d */
    private C20022a f54165d;

    /* renamed from: e */
    private int f54166e;

    /* renamed from: f */
    private int f54167f;

    /* renamed from: g */
    private int f54168g;

    /* renamed from: h */
    private float f54169h;

    /* renamed from: i */
    private float f54170i;

    /* renamed from: j */
    private float f54171j;

    /* renamed from: k */
    private float f54172k;

    /* renamed from: l */
    private boolean f54173l;

    /* renamed from: m */
    private int f54174m;

    /* renamed from: n */
    private boolean f54175n;

    /* renamed from: o */
    private boolean f54176o;

    /* renamed from: p */
    private int f54177p;

    /* renamed from: com.ss.android.push.window.oppo.PushWindowScrollView$a */
    public interface C20022a {
        /* renamed from: a */
        void mo53602a();

        /* renamed from: a */
        void mo53603a(float f, float f2);

        /* renamed from: a */
        void mo53604a(boolean z);
    }

    /* renamed from: b */
    private void m65954b() {
        this.f54175n = true;
        this.f54176o = false;
        this.f54164c = false;
    }

    /* renamed from: c */
    private void m65955c() {
        this.f54176o = false;
        this.f54175n = false;
        this.f54173l = false;
        this.f54163b = -1;
        if (this.f54162a != null) {
            this.f54162a.recycle();
            this.f54162a = null;
        }
    }

    /* renamed from: a */
    private void m65952a() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f54166e = viewConfiguration.getScaledTouchSlop();
        this.f54167f = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f54168g = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f54174m = (int) (getContext().getResources().getDisplayMetrics().density * 25.0f);
    }

    public void setOnScrollListener(C20022a aVar) {
        this.f54165d = aVar;
    }

    public PushWindowScrollView(Context context) {
        super(context);
        m65952a();
    }

    /* renamed from: a */
    private void m65953a(MotionEvent motionEvent) {
        int i = this.f54163b;
        int a = m65951a(motionEvent, i);
        if (i != -1 && a != -1) {
            float x = motionEvent.getX(a);
            float abs = Math.abs(x - this.f54169h);
            float y = motionEvent.getY(a);
            float abs2 = Math.abs(y - this.f54170i);
            if (abs2 <= ((float) this.f54166e) || abs2 <= abs) {
                if (abs > ((float) this.f54166e)) {
                    this.f54173l = true;
                }
                return;
            }
            m65954b();
            this.f54169h = x;
            this.f54170i = y;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 1 || (action != 0 && this.f54173l)) {
            m65955c();
            return false;
        }
        int i = action & NormalGiftView.ALPHA_255;
        if (i == 0) {
            int actionIndex = motionEvent.getActionIndex();
            this.f54163b = motionEvent.getPointerId(actionIndex);
            if (this.f54163b != -1) {
                float x = motionEvent.getX(actionIndex);
                this.f54172k = x;
                this.f54169h = x;
                float y = motionEvent.getY(actionIndex);
                this.f54170i = y;
                this.f54171j = y;
                this.f54175n = false;
                this.f54173l = false;
            }
        } else if (i == 2) {
            int a = m65951a(motionEvent, this.f54163b);
            if (this.f54163b != -1) {
                motionEvent.getY(a);
                m65953a(motionEvent);
            }
        }
        if (!this.f54175n) {
            if (this.f54162a == null) {
                this.f54162a = VelocityTracker.obtain();
            }
            this.f54162a.addMovement(motionEvent);
        }
        if (this.f54175n || this.f54176o) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f54162a == null) {
            this.f54162a = VelocityTracker.obtain();
        }
        this.f54162a.addMovement(motionEvent);
        switch (motionEvent.getAction() & NormalGiftView.ALPHA_255) {
            case 0:
                this.f54163b = motionEvent.getPointerId(motionEvent.getActionIndex());
                float y = motionEvent.getY();
                this.f54171j = y;
                this.f54170i = y;
                float x = motionEvent.getX();
                this.f54172k = x;
                this.f54169h = x;
                break;
            case 1:
            case 3:
                if (this.f54175n) {
                    VelocityTracker velocityTracker = this.f54162a;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f54168g);
                    int yVelocity = (int) velocityTracker.getYVelocity(this.f54163b);
                    int a = m65951a(motionEvent, this.f54163b);
                    if (this.f54163b != -1) {
                        int y2 = (int) (motionEvent.getY(a) - this.f54171j);
                        if (Math.abs(y2) <= this.f54174m || Math.abs(yVelocity) <= this.f54167f) {
                            if (this.f54165d != null) {
                                this.f54165d.mo53602a();
                            }
                        } else if (yVelocity <= 0 || y2 <= 0) {
                            if (yVelocity >= 0 || y2 >= 0) {
                                if (this.f54165d != null) {
                                    this.f54165d.mo53602a();
                                }
                            } else if (this.f54165d != null) {
                                this.f54165d.mo53604a(true);
                            }
                        } else if (this.f54165d != null) {
                            this.f54165d.mo53604a(false);
                        }
                    }
                    this.f54163b = -1;
                    m65955c();
                    break;
                }
                break;
            case 2:
                if (!this.f54175n) {
                    m65953a(motionEvent);
                    if (this.f54173l) {
                        return false;
                    }
                }
                if (this.f54175n) {
                    int a2 = m65951a(motionEvent, this.f54163b);
                    if (this.f54163b != -1) {
                        float y3 = motionEvent.getY(a2);
                        float f = this.f54170i - y3;
                        this.f54170i = y3;
                        float f2 = ((float) this.f54177p) + f;
                        int i = (int) f2;
                        this.f54169h += f2 - ((float) i);
                        this.f54177p = i;
                        if (this.f54165d != null) {
                            this.f54165d.mo53603a(0.0f, f);
                            break;
                        }
                    }
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f54170i = motionEvent.getY(actionIndex);
                this.f54169h = motionEvent.getX(actionIndex);
                this.f54163b = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                int a3 = m65951a(motionEvent, this.f54163b);
                if (this.f54163b != -1) {
                    this.f54170i = motionEvent.getY(a3);
                    this.f54169h = motionEvent.getX(a3);
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    private int m65951a(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex == -1) {
            this.f54163b = -1;
        }
        return findPointerIndex;
    }

    public PushWindowScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65952a();
    }

    public PushWindowScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65952a();
    }
}
