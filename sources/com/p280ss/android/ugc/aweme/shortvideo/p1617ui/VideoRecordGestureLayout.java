package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.graphics.Canvas;
import android.support.p022v4.view.C0967d;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39947b;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39947b.C39948a;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39949c;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39949c.C39951b;
import com.p280ss.android.ugc.aweme.utils.C43063dm;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout */
public class VideoRecordGestureLayout extends FrameLayout implements OnDoubleTapListener, OnGestureListener, OnScaleGestureListener, OnTouchListener {

    /* renamed from: a */
    C41180a f107245a;

    /* renamed from: b */
    C0967d f107246b;

    /* renamed from: c */
    ScaleGestureDetector f107247c;

    /* renamed from: d */
    C39949c f107248d;

    /* renamed from: e */
    C39947b f107249e;

    /* renamed from: f */
    float f107250f;

    /* renamed from: g */
    float f107251g;

    /* renamed from: h */
    float f107252h;

    /* renamed from: i */
    float f107253i;

    /* renamed from: j */
    boolean f107254j;

    /* renamed from: k */
    private float f107255k;

    /* renamed from: l */
    private C39951b f107256l;

    /* renamed from: m */
    private C39948a f107257m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout$a */
    public interface C41180a {
        /* renamed from: a */
        boolean mo96380a();

        /* renamed from: a */
        boolean mo96381a(float f);

        /* renamed from: a */
        boolean mo96382a(MotionEvent motionEvent);

        /* renamed from: a */
        boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        /* renamed from: a */
        boolean mo96384a(ScaleGestureDetector scaleGestureDetector);

        /* renamed from: a */
        boolean mo98458a(C39947b bVar);

        /* renamed from: a */
        boolean mo98459a(C39947b bVar, float f, float f2);

        /* renamed from: a */
        boolean mo96385a(C39949c cVar);

        /* renamed from: b */
        void mo98460b(C39947b bVar);

        /* renamed from: b */
        boolean mo96386b();

        /* renamed from: b */
        boolean mo96387b(float f);

        /* renamed from: b */
        boolean mo96388b(MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo96389b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        /* renamed from: b */
        boolean mo96390b(ScaleGestureDetector scaleGestureDetector);

        /* renamed from: c */
        boolean mo96391c(float f);

        /* renamed from: c */
        boolean mo96392c(MotionEvent motionEvent);

        /* renamed from: d */
        boolean mo96393d(MotionEvent motionEvent);

        /* renamed from: e */
        boolean mo98462e(MotionEvent motionEvent);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout$b */
    public static abstract class C41181b implements C41180a {
        /* renamed from: a */
        public boolean mo96380a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo96381a(float f) {
            return false;
        }

        /* renamed from: a */
        public boolean mo96382a(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo96384a(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        /* renamed from: a */
        public boolean mo98458a(C39947b bVar) {
            return false;
        }

        /* renamed from: a */
        public boolean mo98459a(C39947b bVar, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo96385a(C39949c cVar) {
            return false;
        }

        /* renamed from: b */
        public void mo98460b(C39947b bVar) {
        }

        /* renamed from: b */
        public boolean mo96386b() {
            return false;
        }

        /* renamed from: b */
        public boolean mo96387b(float f) {
            return false;
        }

        /* renamed from: b */
        public boolean mo96388b(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo96389b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        /* renamed from: b */
        public boolean mo96390b(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        /* renamed from: c */
        public boolean mo96391c(float f) {
            return false;
        }

        /* renamed from: c */
        public boolean mo96392c(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: d */
        public boolean mo96393d(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public boolean mo98462e(MotionEvent motionEvent) {
            return false;
        }
    }

    public float getProtectY() {
        return this.f107255k;
    }

    public ScaleGestureDetector getScaleGestureDetector() {
        return this.f107247c;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public void setOnGestureListener(C41180a aVar) {
        this.f107245a = aVar;
    }

    public VideoRecordGestureLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C43063dm.m136616c();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setSloppyExtra(int i) {
        this.f107248d.f103753n = i;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.f107245a == null || !this.f107245a.mo96384a(scaleGestureDetector)) {
            return false;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if (this.f107245a != null) {
            this.f107245a.mo96381a(this.f107250f);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f107245a == null || !this.f107245a.mo98462e(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setProtectY(float f) {
        this.f107255k = (f * 17.0f) / 20.0f;
    }

    /* renamed from: a */
    private boolean m131522a(MotionEvent motionEvent) {
        float x = motionEvent.getX() - this.f107252h;
        float y = motionEvent.getY() - this.f107253i;
        if ((x * x) + (y * y) < this.f107251g) {
            return true;
        }
        return false;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.f107245a == null) {
            return false;
        }
        boolean b = this.f107245a.mo96390b(scaleGestureDetector);
        if (b) {
            this.f107250f = scaleGestureDetector.getScaleFactor();
        }
        return b;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f107252h = motionEvent.getX();
        this.f107253i = motionEvent.getY();
        if (this.f107245a == null || !this.f107245a.mo96382a(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = measuredWidth / 10;
        int i2 = measuredHeight / 10;
        if (this.f107245a != null && m131522a(motionEvent) && !m131523a(motionEvent, measuredWidth, measuredHeight, i, i2)) {
            return this.f107245a.mo96388b(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f107247c.onTouchEvent(motionEvent);
        this.f107248d.mo99364a(motionEvent);
        this.f107249e.mo99364a(motionEvent);
        if ((motionEvent.getAction() & NormalGiftView.ALPHA_255) == 0) {
            this.f107254j = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f107254j = true;
        }
        if (!this.f107254j) {
            this.f107246b.mo3752a(motionEvent);
        }
        return true;
    }

    /* renamed from: a */
    private void m131521a(Context context) {
        this.f107248d = new C39949c(context, this.f107256l);
        this.f107249e = new C39947b(context, this.f107257m);
        this.f107246b = new C0967d(context, this);
        this.f107246b.mo3751a(false);
        this.f107246b.mo3750a((OnDoubleTapListener) this);
        this.f107247c = new ScaleGestureDetector(context, this);
        float scaledDoubleTapSlop = (float) ViewConfiguration.get(getContext()).getScaledDoubleTapSlop();
        this.f107251g = scaledDoubleTapSlop * scaledDoubleTapSlop;
        setOnTouchListener(this);
        try {
            Field declaredField = this.f107247c.getClass().getDeclaredField("mSpanSlop");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(this.f107247c)).intValue();
            Field declaredField2 = this.f107247c.getClass().getDeclaredField("mMinSpan");
            declaredField2.setAccessible(true);
            declaredField2.set(this.f107247c, Integer.valueOf(intValue * 6));
        } catch (Throwable unused) {
        }
    }

    public VideoRecordGestureLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f107245a == null) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f107245a.mo96392c(motionEvent);
                break;
            case 1:
                this.f107245a.mo96393d(motionEvent);
                break;
            case 3:
                this.f107245a.mo96393d(motionEvent);
                break;
            case 5:
                this.f107245a.mo96380a();
                break;
            case 6:
                this.f107245a.mo96386b();
                break;
        }
        return false;
    }

    public VideoRecordGestureLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f107250f = 1.0f;
        this.f107255k = 1000.0f;
        this.f107256l = new C39951b() {
            /* renamed from: b */
            public final boolean mo99372b(C39949c cVar) {
                if (VideoRecordGestureLayout.this.f107245a != null) {
                    VideoRecordGestureLayout.this.f107245a.mo96385a(cVar);
                }
                return true;
            }

            /* renamed from: a */
            public final boolean mo99371a(C39949c cVar) {
                float b = cVar.mo99370b();
                if (VideoRecordGestureLayout.this.f107245a != null) {
                    VideoRecordGestureLayout.this.f107245a.mo96387b(b);
                }
                return true;
            }

            /* renamed from: c */
            public final void mo99373c(C39949c cVar) {
                float b = cVar.mo99370b();
                if (VideoRecordGestureLayout.this.f107245a != null) {
                    VideoRecordGestureLayout.this.f107245a.mo96391c(b);
                }
            }
        };
        this.f107257m = new C39948a() {
            /* renamed from: a */
            public final boolean mo99367a(C39947b bVar) {
                if (VideoRecordGestureLayout.this.f107245a != null) {
                    VideoRecordGestureLayout.this.f107245a.mo98458a(bVar);
                }
                return true;
            }

            /* renamed from: b */
            public final void mo99369b(C39947b bVar) {
                if (VideoRecordGestureLayout.this.f107245a != null) {
                    VideoRecordGestureLayout.this.f107245a.mo98460b(bVar);
                }
            }

            /* renamed from: a */
            public final boolean mo99368a(C39947b bVar, float f, float f2) {
                if (VideoRecordGestureLayout.this.f107245a != null) {
                    VideoRecordGestureLayout.this.f107245a.mo98459a(bVar, f, f2);
                }
                return true;
            }
        };
        m131521a(context);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f107245a == null || !this.f107245a.mo96389b(motionEvent, motionEvent2, f, f2)) {
            return false;
        }
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null || this.f107245a == null) {
            return false;
        }
        this.f107245a.mo96383a(motionEvent, motionEvent2, f, f2);
        return true;
    }

    /* renamed from: a */
    private static boolean m131523a(MotionEvent motionEvent, int i, int i2, int i3, int i4) {
        float f = (float) i3;
        if (motionEvent.getX() >= f && ((float) i) - motionEvent.getX() >= f) {
            float f2 = (float) i4;
            if (motionEvent.getY() >= f2 && ((float) i2) - motionEvent.getY() >= f2) {
                return false;
            }
        }
        return true;
    }
}
