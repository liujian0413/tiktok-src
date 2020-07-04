package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.feed.listener.C28530l;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.LongPressLayout */
public class LongPressLayout extends View {

    /* renamed from: a */
    public float f75776a;

    /* renamed from: b */
    public float f75777b;

    /* renamed from: c */
    public boolean f75778c;

    /* renamed from: d */
    public boolean f75779d;

    /* renamed from: e */
    public C28748a f75780e;

    /* renamed from: f */
    public long f75781f;

    /* renamed from: g */
    public C28530l f75782g;

    /* renamed from: h */
    private Context f75783h;

    /* renamed from: i */
    private float f75784i;

    /* renamed from: j */
    private float f75785j;

    /* renamed from: k */
    private int f75786k;

    /* renamed from: l */
    private int f75787l;

    /* renamed from: m */
    private OnTouchListener f75788m;

    /* renamed from: n */
    private OnClickListener f75789n;

    /* renamed from: o */
    private OnClickListener f75790o;

    /* renamed from: p */
    private boolean f75791p;

    /* renamed from: q */
    private Runnable f75792q;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.LongPressLayout$a */
    public interface C28748a {
        /* renamed from: a */
        void mo71748a(float f, float f2);
    }

    public C28530l getInterceptListener() {
        return this.f75782g;
    }

    public int getTimeInterval() {
        return this.f75787l;
    }

    public void setInLongPressMode(boolean z) {
        this.f75778c = z;
    }

    public void setInterceptListener(C28530l lVar) {
        this.f75782g = lVar;
    }

    public void setListener(C28748a aVar) {
        this.f75780e = aVar;
    }

    public void setScrollMode(boolean z) {
        this.f75779d = z;
    }

    public void setTapListener(OnTouchListener onTouchListener) {
        this.f75788m = onTouchListener;
    }

    public void setTimeInterval(int i) {
        this.f75787l = i;
    }

    public LongPressLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo73901a(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void setDisabilityOnClickListener(OnClickListener onClickListener) {
        this.f75790o = onClickListener;
        super.setOnClickListener(new C28773ae(this));
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        if (this.f75790o == null) {
            super.setOnClickListener(onClickListener);
        }
        this.f75789n = onClickListener;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo73900a(View view) {
        if (this.f75789n != null) {
            this.f75789n.onClick(view);
        }
        if (!this.f75791p) {
            this.f75790o.onClick(view);
        }
        this.f75791p = false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f75791p = true;
        switch (motionEvent.getAction()) {
            case 0:
                this.f75776a = motionEvent.getX();
                this.f75777b = motionEvent.getY();
                this.f75781f = SystemClock.elapsedRealtime();
                C6726a.m20843a(this.f75792q, this.f75787l);
                if (this.f75788m != null) {
                    this.f75788m.onTouch(this, motionEvent);
                    break;
                }
                break;
            case 1:
            case 3:
                C6726a.m20845c(this.f75792q);
                if (SystemClock.elapsedRealtime() - this.f75781f < ((long) this.f75787l) && this.f75788m != null) {
                    this.f75788m.onTouch(this, motionEvent);
                    break;
                }
            case 2:
                this.f75784i = motionEvent.getX();
                this.f75785j = motionEvent.getY();
                if (m94647a(Math.abs(this.f75776a - this.f75784i), Math.abs(this.f75777b - this.f75785j))) {
                    C6726a.m20845c(this.f75792q);
                }
                if (this.f75788m != null) {
                    this.f75788m.onTouch(this, motionEvent);
                    break;
                }
                break;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public LongPressLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private boolean m94647a(float f, float f2) {
        if (f > ((float) this.f75786k) || f2 > ((float) this.f75786k)) {
            return true;
        }
        return false;
    }

    public LongPressLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75786k = -1;
        this.f75787l = VETransitionFilterParam.TransitionDuration_DEFAULT;
        this.f75792q = new Runnable() {
            public final void run() {
                if (LongPressLayout.this.f75780e != null) {
                    LongPressLayout.this.mo73901a(true);
                    if (LongPressLayout.this.f75782g == null || LongPressLayout.this.f75782g.mo71753a()) {
                        LongPressLayout.this.f75780e.mo71748a(LongPressLayout.this.f75776a, LongPressLayout.this.f75777b);
                    }
                }
            }
        };
        this.f75783h = context;
        this.f75786k = ViewConfiguration.get(this.f75783h).getScaledTouchSlop();
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
            }
        });
    }
}
