package com.p280ss.android.ugc.aweme.feed.p1234j;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.p022v4.util.C0902i;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.ugc.aweme.feed.j.j */
public final class C28487j {

    /* renamed from: com.ss.android.ugc.aweme.feed.j.j$a */
    public interface C28490a {
        /* renamed from: a */
        void mo72220a(View view, MotionEvent motionEvent);

        /* renamed from: a */
        void mo72221a(boolean z);
    }

    /* renamed from: a */
    private static GestureDetector m93630a(Context context, final C28490a aVar, boolean z) {
        if (!z) {
            return null;
        }
        return new GestureDetector(context, new OnGestureListener() {
            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            public final void onLongPress(MotionEvent motionEvent) {
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            public final void onShowPress(MotionEvent motionEvent) {
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (motionEvent.getX() - motionEvent2.getX() > 20.0f && Math.abs(motionEvent2.getX() - motionEvent.getX()) > Math.abs(motionEvent2.getY() - motionEvent.getY()) && Math.abs(f) > 200.0f && aVar != null) {
                    aVar.mo72221a(true);
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    public static OnTouchListener m93631a(final Activity activity, final Handler handler, boolean z, final C28490a aVar) {
        final GestureDetector a = m93630a(activity, aVar, z);
        return new OnTouchListener() {

            /* renamed from: a */
            float f75095a;

            /* renamed from: b */
            float f75096b;

            /* renamed from: c */
            int f75097c = ViewConfiguration.get(activity).getScaledDoubleTapSlop();

            /* renamed from: d */
            int f75098d = (ViewConfiguration.get(activity).getScaledTouchSlop() * 3);

            /* renamed from: e */
            int f75099e = (this.f75098d * this.f75098d);

            /* renamed from: f */
            int f75100f = (this.f75097c * this.f75097c);

            /* renamed from: g */
            boolean f75101g;

            /* renamed from: h */
            boolean f75102h;

            /* renamed from: i */
            boolean f75103i;

            /* renamed from: j */
            MotionEvent f75104j;

            /* renamed from: k */
            MotionEvent f75105k;

            /* renamed from: a */
            private boolean m93632a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                if (motionEvent == null || motionEvent2 == null) {
                    return false;
                }
                return this.f75102h;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (a != null) {
                    a.onTouchEvent(motionEvent);
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        if (handler.hasMessages(0)) {
                            handler.removeMessages(0);
                        }
                        this.f75103i = false;
                        if (m93633a(this.f75104j, this.f75105k, motionEvent)) {
                            this.f75103i = true;
                            aVar.mo72220a(view, this.f75104j);
                        }
                        if (this.f75104j != null) {
                            this.f75104j.recycle();
                        }
                        this.f75104j = MotionEvent.obtain(motionEvent);
                        this.f75102h = true;
                        this.f75101g = true;
                        this.f75095a = motionEvent.getX();
                        this.f75096b = motionEvent.getY();
                        break;
                    case 1:
                        if (this.f75102h) {
                            if (!this.f75103i && m93632a(this.f75104j, motionEvent)) {
                                handler.sendMessageDelayed(handler.obtainMessage(0, new C0902i(Float.valueOf(this.f75095a), Float.valueOf(this.f75096b))), (((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime()) + this.f75104j.getEventTime());
                            }
                            if (this.f75105k != null) {
                                this.f75105k.recycle();
                            }
                            this.f75105k = MotionEvent.obtain(motionEvent);
                            break;
                        }
                        break;
                    case 2:
                        int x = (int) (motionEvent.getX() - this.f75095a);
                        int y = (int) (motionEvent.getY() - this.f75096b);
                        int i = (x * x) + (y * y);
                        if (i > this.f75099e || Math.abs(x) >= this.f75098d) {
                            this.f75102h = false;
                            handler.removeMessages(0);
                        }
                        if (i > this.f75100f) {
                            this.f75101g = false;
                            break;
                        }
                        break;
                }
                return false;
            }

            /* renamed from: a */
            private boolean m93633a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
                if (motionEvent == null || motionEvent2 == null || motionEvent3 == null || !this.f75101g) {
                    return false;
                }
                long eventTime = motionEvent3.getEventTime() - motionEvent2.getEventTime();
                if (eventTime > ((long) ViewConfiguration.getDoubleTapTimeout()) || eventTime < 40) {
                    return false;
                }
                int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
                int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
                if ((x * x) + (y * y) < this.f75100f) {
                    return true;
                }
                return false;
            }
        };
    }
}
