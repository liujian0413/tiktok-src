package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.support.p022v4.view.C0967d;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.event.C4456z;
import com.bytedance.android.livesdk.chatroom.event.C4456z.C4457a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.s */
public final class C5325s implements OnDoubleTapListener, OnGestureListener, OnScaleGestureListener {

    /* renamed from: a */
    private C0967d f15569a;

    /* renamed from: b */
    private ScaleGestureDetector f15570b;

    /* renamed from: c */
    private boolean f15571c;

    /* renamed from: d */
    private int f15572d;

    /* renamed from: e */
    private int f15573e;

    /* renamed from: f */
    private float f15574f = 1.0f;

    /* renamed from: g */
    private C5326a f15575g = C5326a.BEF_GESTURE_TYPE_PAN;

    /* renamed from: h */
    private boolean f15576h;

    /* renamed from: i */
    private MotionEvent f15577i;

    /* renamed from: j */
    private Context f15578j;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.s$a */
    enum C5326a {
        BEF_GESTURE_TYPE_UNKNOWN,
        BEF_GESTURE_TYPE_TAP,
        BEF_GESTURE_TYPE_PAN,
        BEF_GESTURE_TYPE_ROTATE,
        BEF_GESTURE_TYPE_SCALE,
        BEF_GESTURE_TYPE_LONG_PRESS
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: b */
    private C4457a m16994b() {
        if (this.f15577i != null) {
            return m16991a(this.f15577i, true);
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m16993a() {
        C2421c composerManager = ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).composerManager();
        if (composerManager != null) {
            List<C9355c> a = composerManager.mo8884a(C2418b.f7951b);
            if (a.size() > 0) {
                for (C9355c cVar : a) {
                    List<String> list = cVar.f25568g;
                    if (list != null && list.size() > 0) {
                        return list.contains("TouchGes");
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m16995b(MotionEvent motionEvent) {
        this.f15576h = true;
        this.f15577i = motionEvent;
    }

    /* renamed from: d */
    private C4457a m16997d(MotionEvent motionEvent) {
        return m16991a(motionEvent, true);
    }

    /* renamed from: e */
    private C4457a m16998e(MotionEvent motionEvent) {
        return m16999f(motionEvent);
    }

    /* renamed from: f */
    private C4457a m16999f(MotionEvent motionEvent) {
        return m16991a(motionEvent, false);
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f15574f = 1.0f;
    }

    /* renamed from: a */
    private static C4457a m16989a(float f) {
        C4457a aVar = new C4457a();
        aVar.f12931g = f;
        aVar.f12930f = 3.0f;
        return aVar;
    }

    /* renamed from: c */
    private void m16996c(MotionEvent motionEvent) {
        this.f15576h = false;
        m16992a(202, m16997d(motionEvent));
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f15575g = C5326a.BEF_GESTURE_TYPE_TAP;
        if (this.f15577i != null) {
            m16992a(201, m16994b());
            this.f15577i = null;
        }
        m16992a(206, m16998e(motionEvent));
        return false;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.f15575g = C5326a.BEF_GESTURE_TYPE_SCALE;
        if (this.f15577i != null) {
            m16992a(201, m16994b());
            this.f15577i = null;
        }
        m16992a(205, m16989a(scaleGestureDetector.getScaleFactor() / this.f15574f));
        this.f15574f = scaleGestureDetector.getScaleFactor();
        return false;
    }

    public C5325s(Context context) {
        this.f15578j = context;
        this.f15572d = context.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
        this.f15573e = context.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
        this.f15569a = new C0967d(context, this);
        this.f15569a.mo3751a(false);
        this.f15569a.mo3750a((OnDoubleTapListener) this);
        this.f15570b = new ScaleGestureDetector(context, this);
    }

    /* renamed from: a */
    public final boolean mo13605a(MotionEvent motionEvent) {
        if (!m16993a()) {
            return false;
        }
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        this.f15570b.onTouchEvent(motionEvent);
        if (action == 0) {
            this.f15571c = false;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f15571c = true;
        }
        if (!this.f15571c) {
            this.f15569a.mo3752a(motionEvent);
        }
        switch (action) {
            case 0:
                m16995b(motionEvent);
                break;
            case 1:
                m16996c(motionEvent);
                break;
        }
        return true;
    }

    /* renamed from: a */
    private C4457a m16991a(MotionEvent motionEvent, boolean z) {
        C4457a aVar = new C4457a();
        aVar.f12926b = motionEvent.getX() / ((float) this.f15572d);
        aVar.f12927c = motionEvent.getY() / ((float) this.f15573e);
        if (z && this.f15575g != null) {
            aVar.f12925a = this.f15575g.ordinal();
        }
        return aVar;
    }

    /* renamed from: a */
    private static void m16992a(int i, C4457a aVar) {
        if (aVar != null) {
            C9097a.m27146a().mo22267a((Object) new C4456z(i, aVar));
            return;
        }
        StringBuilder sb = new StringBuilder("notifyTouchEvent event is null, action: ");
        sb.append(i);
        C3166a.m11966e("EffectGestureDetector", sb.toString());
    }

    /* renamed from: a */
    private C4457a m16990a(MotionEvent motionEvent, float f, float f2) {
        C4457a f3 = m16999f(motionEvent);
        f3.f12928d = f / ((float) this.f15572d);
        f3.f12929e = f2 / ((float) this.f15573e);
        f3.f12930f = 1.0f;
        return f3;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f15576h) {
            this.f15576h = false;
        }
        this.f15575g = C5326a.BEF_GESTURE_TYPE_PAN;
        if (this.f15577i != null) {
            m16992a(201, m16994b());
            this.f15577i = null;
        }
        m16992a(203, m16990a(motionEvent2, f, f2));
        return true;
    }
}
