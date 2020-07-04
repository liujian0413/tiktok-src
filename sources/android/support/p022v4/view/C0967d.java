package android.support.p022v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: android.support.v4.view.d */
public final class C0967d {

    /* renamed from: a */
    private final C0968a f3364a;

    /* renamed from: android.support.v4.view.d$a */
    interface C0968a {
        /* renamed from: a */
        void mo3753a(OnDoubleTapListener onDoubleTapListener);

        /* renamed from: a */
        void mo3754a(boolean z);

        /* renamed from: a */
        boolean mo3755a(MotionEvent motionEvent);
    }

    /* renamed from: android.support.v4.view.d$b */
    static class C0969b implements C0968a {

        /* renamed from: j */
        private static final int f3365j = ViewConfiguration.getLongPressTimeout();

        /* renamed from: k */
        private static final int f3366k = ViewConfiguration.getTapTimeout();

        /* renamed from: l */
        private static final int f3367l = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a */
        final OnGestureListener f3368a;

        /* renamed from: b */
        OnDoubleTapListener f3369b;

        /* renamed from: c */
        boolean f3370c;

        /* renamed from: d */
        boolean f3371d;

        /* renamed from: e */
        MotionEvent f3372e;

        /* renamed from: f */
        private int f3373f;

        /* renamed from: g */
        private int f3374g;

        /* renamed from: h */
        private int f3375h;

        /* renamed from: i */
        private int f3376i;

        /* renamed from: m */
        private final Handler f3377m;

        /* renamed from: n */
        private boolean f3378n;

        /* renamed from: o */
        private boolean f3379o;

        /* renamed from: p */
        private boolean f3380p;

        /* renamed from: q */
        private MotionEvent f3381q;

        /* renamed from: r */
        private boolean f3382r;

        /* renamed from: s */
        private float f3383s;

        /* renamed from: t */
        private float f3384t;

        /* renamed from: u */
        private float f3385u;

        /* renamed from: v */
        private float f3386v;

        /* renamed from: w */
        private boolean f3387w;

        /* renamed from: x */
        private VelocityTracker f3388x;

        /* renamed from: android.support.v4.view.d$b$a */
        class C0970a extends Handler {
            C0970a() {
            }

            public final void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        C0969b.this.f3368a.onShowPress(C0969b.this.f3372e);
                        return;
                    case 2:
                        C0969b.this.mo3756a();
                        return;
                    case 3:
                        if (C0969b.this.f3369b == null) {
                            return;
                        }
                        if (!C0969b.this.f3370c) {
                            C0969b.this.f3369b.onSingleTapConfirmed(C0969b.this.f3372e);
                            return;
                        } else {
                            C0969b.this.f3371d = true;
                            return;
                        }
                    default:
                        StringBuilder sb = new StringBuilder("Unknown message ");
                        sb.append(message);
                        throw new RuntimeException(sb.toString());
                }
            }

            C0970a(Handler handler) {
                super(handler.getLooper());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3756a() {
            this.f3377m.removeMessages(3);
            this.f3371d = false;
            this.f3378n = true;
            this.f3368a.onLongPress(this.f3372e);
        }

        /* renamed from: b */
        private void m4100b() {
            this.f3377m.removeMessages(1);
            this.f3377m.removeMessages(2);
            this.f3377m.removeMessages(3);
            this.f3388x.recycle();
            this.f3388x = null;
            this.f3382r = false;
            this.f3370c = false;
            this.f3379o = false;
            this.f3380p = false;
            this.f3371d = false;
            if (this.f3378n) {
                this.f3378n = false;
            }
        }

        /* renamed from: c */
        private void m4101c() {
            this.f3377m.removeMessages(1);
            this.f3377m.removeMessages(2);
            this.f3377m.removeMessages(3);
            this.f3382r = false;
            this.f3379o = false;
            this.f3380p = false;
            this.f3371d = false;
            if (this.f3378n) {
                this.f3378n = false;
            }
        }

        /* renamed from: a */
        public final void mo3753a(OnDoubleTapListener onDoubleTapListener) {
            this.f3369b = onDoubleTapListener;
        }

        /* renamed from: a */
        public final void mo3754a(boolean z) {
            this.f3387w = z;
        }

        /* renamed from: a */
        private void m4098a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f3368a != null) {
                this.f3387w = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f3375h = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f3376i = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f3373f = scaledTouchSlop * scaledTouchSlop;
                this.f3374g = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:93:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x021d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo3755a(android.view.MotionEvent r12) {
            /*
                r11 = this;
                int r0 = r12.getAction()
                android.view.VelocityTracker r1 = r11.f3388x
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r11.f3388x = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r11.f3388x
                r1.addMovement(r12)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r1 = 1
                goto L_0x001d
            L_0x001c:
                r1 = 0
            L_0x001d:
                if (r1 == 0) goto L_0x0024
                int r4 = r12.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r4 = -1
            L_0x0025:
                int r5 = r12.getPointerCount()
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
            L_0x002d:
                if (r7 >= r5) goto L_0x003e
                if (r4 == r7) goto L_0x003b
                float r10 = r12.getX(r7)
                float r8 = r8 + r10
                float r10 = r12.getY(r7)
                float r9 = r9 + r10
            L_0x003b:
                int r7 = r7 + 1
                goto L_0x002d
            L_0x003e:
                if (r1 == 0) goto L_0x0043
                int r1 = r5 + -1
                goto L_0x0044
            L_0x0043:
                r1 = r5
            L_0x0044:
                float r1 = (float) r1
                float r8 = r8 / r1
                float r9 = r9 / r1
                r1 = 1000(0x3e8, float:1.401E-42)
                r4 = 2
                r7 = 3
                switch(r0) {
                    case 0: goto L_0x01b7;
                    case 1: goto L_0x0123;
                    case 2: goto L_0x00ae;
                    case 3: goto L_0x00a9;
                    case 4: goto L_0x004e;
                    case 5: goto L_0x009c;
                    case 6: goto L_0x0050;
                    default: goto L_0x004e;
                }
            L_0x004e:
                goto L_0x024c
            L_0x0050:
                r11.f3383s = r8
                r11.f3385u = r8
                r11.f3384t = r9
                r11.f3386v = r9
                android.view.VelocityTracker r0 = r11.f3388x
                int r2 = r11.f3376i
                float r2 = (float) r2
                r0.computeCurrentVelocity(r1, r2)
                int r0 = r12.getActionIndex()
                int r1 = r12.getPointerId(r0)
                android.view.VelocityTracker r2 = r11.f3388x
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r11.f3388x
                float r1 = r4.getYVelocity(r1)
                r4 = 0
            L_0x0075:
                if (r4 >= r5) goto L_0x024c
                if (r4 == r0) goto L_0x0099
                int r7 = r12.getPointerId(r4)
                android.view.VelocityTracker r8 = r11.f3388x
                float r8 = r8.getXVelocity(r7)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r11.f3388x
                float r7 = r9.getYVelocity(r7)
                float r7 = r7 * r1
                float r8 = r8 + r7
                int r7 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r7 >= 0) goto L_0x0099
                android.view.VelocityTracker r12 = r11.f3388x
                r12.clear()
                goto L_0x024c
            L_0x0099:
                int r4 = r4 + 1
                goto L_0x0075
            L_0x009c:
                r11.f3383s = r8
                r11.f3385u = r8
                r11.f3384t = r9
                r11.f3386v = r9
                r11.m4101c()
                goto L_0x024c
            L_0x00a9:
                r11.m4100b()
                goto L_0x024c
            L_0x00ae:
                boolean r0 = r11.f3378n
                if (r0 != 0) goto L_0x024c
                float r0 = r11.f3383s
                float r0 = r0 - r8
                float r1 = r11.f3384t
                float r1 = r1 - r9
                boolean r5 = r11.f3382r
                if (r5 == 0) goto L_0x00c5
                android.view.GestureDetector$OnDoubleTapListener r0 = r11.f3369b
                boolean r12 = r0.onDoubleTapEvent(r12)
                r3 = r3 | r12
                goto L_0x024c
            L_0x00c5:
                boolean r5 = r11.f3379o
                if (r5 == 0) goto L_0x0103
                float r5 = r11.f3385u
                float r5 = r8 - r5
                int r5 = (int) r5
                float r6 = r11.f3386v
                float r6 = r9 - r6
                int r6 = (int) r6
                int r5 = r5 * r5
                int r6 = r6 * r6
                int r5 = r5 + r6
                int r6 = r11.f3373f
                if (r5 <= r6) goto L_0x00fa
                android.view.GestureDetector$OnGestureListener r6 = r11.f3368a
                android.view.MotionEvent r10 = r11.f3372e
                boolean r12 = r6.onScroll(r10, r12, r0, r1)
                r11.f3383s = r8
                r11.f3384t = r9
                r11.f3379o = r3
                android.os.Handler r0 = r11.f3377m
                r0.removeMessages(r7)
                android.os.Handler r0 = r11.f3377m
                r0.removeMessages(r2)
                android.os.Handler r0 = r11.f3377m
                r0.removeMessages(r4)
                goto L_0x00fb
            L_0x00fa:
                r12 = 0
            L_0x00fb:
                int r0 = r11.f3373f
                if (r5 <= r0) goto L_0x01b4
                r11.f3380p = r3
                goto L_0x01b4
            L_0x0103:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x0115
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x024c
            L_0x0115:
                android.view.GestureDetector$OnGestureListener r2 = r11.f3368a
                android.view.MotionEvent r3 = r11.f3372e
                boolean r3 = r2.onScroll(r3, r12, r0, r1)
                r11.f3383s = r8
                r11.f3384t = r9
                goto L_0x024c
            L_0x0123:
                r11.f3370c = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r12)
                boolean r5 = r11.f3382r
                if (r5 == 0) goto L_0x0135
                android.view.GestureDetector$OnDoubleTapListener r1 = r11.f3369b
                boolean r12 = r1.onDoubleTapEvent(r12)
                r12 = r12 | r3
                goto L_0x018f
            L_0x0135:
                boolean r5 = r11.f3378n
                if (r5 == 0) goto L_0x0141
                android.os.Handler r12 = r11.f3377m
                r12.removeMessages(r7)
                r11.f3378n = r3
                goto L_0x0185
            L_0x0141:
                boolean r5 = r11.f3379o
                if (r5 == 0) goto L_0x015a
                android.view.GestureDetector$OnGestureListener r1 = r11.f3368a
                boolean r1 = r1.onSingleTapUp(r12)
                boolean r5 = r11.f3371d
                if (r5 == 0) goto L_0x0158
                android.view.GestureDetector$OnDoubleTapListener r5 = r11.f3369b
                if (r5 == 0) goto L_0x0158
                android.view.GestureDetector$OnDoubleTapListener r5 = r11.f3369b
                r5.onSingleTapConfirmed(r12)
            L_0x0158:
                r12 = r1
                goto L_0x018f
            L_0x015a:
                android.view.VelocityTracker r5 = r11.f3388x
                int r6 = r12.getPointerId(r3)
                int r7 = r11.f3376i
                float r7 = (float) r7
                r5.computeCurrentVelocity(r1, r7)
                float r1 = r5.getYVelocity(r6)
                float r5 = r5.getXVelocity(r6)
                float r6 = java.lang.Math.abs(r1)
                int r7 = r11.f3375h
                float r7 = (float) r7
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 > 0) goto L_0x0187
                float r6 = java.lang.Math.abs(r5)
                int r7 = r11.f3375h
                float r7 = (float) r7
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x0185
                goto L_0x0187
            L_0x0185:
                r12 = 0
                goto L_0x018f
            L_0x0187:
                android.view.GestureDetector$OnGestureListener r6 = r11.f3368a
                android.view.MotionEvent r7 = r11.f3372e
                boolean r12 = r6.onFling(r7, r12, r5, r1)
            L_0x018f:
                android.view.MotionEvent r1 = r11.f3381q
                if (r1 == 0) goto L_0x0198
                android.view.MotionEvent r1 = r11.f3381q
                r1.recycle()
            L_0x0198:
                r11.f3381q = r0
                android.view.VelocityTracker r0 = r11.f3388x
                if (r0 == 0) goto L_0x01a6
                android.view.VelocityTracker r0 = r11.f3388x
                r0.recycle()
                r0 = 0
                r11.f3388x = r0
            L_0x01a6:
                r11.f3382r = r3
                r11.f3371d = r3
                android.os.Handler r0 = r11.f3377m
                r0.removeMessages(r2)
                android.os.Handler r0 = r11.f3377m
                r0.removeMessages(r4)
            L_0x01b4:
                r3 = r12
                goto L_0x024c
            L_0x01b7:
                android.view.GestureDetector$OnDoubleTapListener r0 = r11.f3369b
                if (r0 == 0) goto L_0x01f7
                android.os.Handler r0 = r11.f3377m
                boolean r0 = r0.hasMessages(r7)
                if (r0 == 0) goto L_0x01c8
                android.os.Handler r1 = r11.f3377m
                r1.removeMessages(r7)
            L_0x01c8:
                android.view.MotionEvent r1 = r11.f3372e
                if (r1 == 0) goto L_0x01ef
                android.view.MotionEvent r1 = r11.f3381q
                if (r1 == 0) goto L_0x01ef
                if (r0 == 0) goto L_0x01ef
                android.view.MotionEvent r0 = r11.f3372e
                android.view.MotionEvent r1 = r11.f3381q
                boolean r0 = r11.m4099a(r0, r1, r12)
                if (r0 == 0) goto L_0x01ef
                r11.f3382r = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r11.f3369b
                android.view.MotionEvent r1 = r11.f3372e
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r11.f3369b
                boolean r1 = r1.onDoubleTapEvent(r12)
                r0 = r0 | r1
                goto L_0x01f8
            L_0x01ef:
                android.os.Handler r0 = r11.f3377m
                int r1 = f3367l
                long r5 = (long) r1
                r0.sendEmptyMessageDelayed(r7, r5)
            L_0x01f7:
                r0 = 0
            L_0x01f8:
                r11.f3383s = r8
                r11.f3385u = r8
                r11.f3384t = r9
                r11.f3386v = r9
                android.view.MotionEvent r1 = r11.f3372e
                if (r1 == 0) goto L_0x0209
                android.view.MotionEvent r1 = r11.f3372e
                r1.recycle()
            L_0x0209:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r12)
                r11.f3372e = r1
                r11.f3379o = r2
                r11.f3380p = r2
                r11.f3370c = r2
                r11.f3378n = r3
                r11.f3371d = r3
                boolean r1 = r11.f3387w
                if (r1 == 0) goto L_0x0235
                android.os.Handler r1 = r11.f3377m
                r1.removeMessages(r4)
                android.os.Handler r1 = r11.f3377m
                android.view.MotionEvent r3 = r11.f3372e
                long r5 = r3.getDownTime()
                int r3 = f3366k
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = f3365j
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L_0x0235:
                android.os.Handler r1 = r11.f3377m
                android.view.MotionEvent r3 = r11.f3372e
                long r3 = r3.getDownTime()
                int r5 = f3366k
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r11.f3368a
                boolean r12 = r1.onDown(r12)
                r3 = r0 | r12
            L_0x024c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.view.C0967d.C0969b.mo3755a(android.view.MotionEvent):boolean");
        }

        C0969b(Context context, OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f3377m = new C0970a(handler);
            } else {
                this.f3377m = new C0970a();
            }
            this.f3368a = onGestureListener;
            if (onGestureListener instanceof OnDoubleTapListener) {
                mo3753a((OnDoubleTapListener) onGestureListener);
            }
            m4098a(context);
        }

        /* renamed from: a */
        private boolean m4099a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f3380p || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f3367l)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f3374g) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.view.d$c */
    static class C0971c implements C0968a {

        /* renamed from: a */
        private final GestureDetector f3390a;

        /* renamed from: a */
        public final void mo3753a(OnDoubleTapListener onDoubleTapListener) {
            this.f3390a.setOnDoubleTapListener(onDoubleTapListener);
        }

        /* renamed from: a */
        public final void mo3754a(boolean z) {
            this.f3390a.setIsLongpressEnabled(z);
        }

        /* renamed from: a */
        public final boolean mo3755a(MotionEvent motionEvent) {
            return this.f3390a.onTouchEvent(motionEvent);
        }

        C0971c(Context context, OnGestureListener onGestureListener, Handler handler) {
            this.f3390a = new GestureDetector(context, onGestureListener, handler);
        }
    }

    /* renamed from: a */
    public final void mo3750a(OnDoubleTapListener onDoubleTapListener) {
        this.f3364a.mo3753a(onDoubleTapListener);
    }

    /* renamed from: a */
    public final void mo3751a(boolean z) {
        this.f3364a.mo3754a(false);
    }

    /* renamed from: a */
    public final boolean mo3752a(MotionEvent motionEvent) {
        return this.f3364a.mo3755a(motionEvent);
    }

    public C0967d(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    private C0967d(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (VERSION.SDK_INT > 17) {
            this.f3364a = new C0971c(context, onGestureListener, null);
        } else {
            this.f3364a = new C0969b(context, onGestureListener, null);
        }
    }
}
