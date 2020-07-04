package com.p280ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.support.p022v4.widget.C1060q;
import android.support.p022v4.widget.C1060q.C1063a;
import android.support.p022v4.widget.DrawerLayout;
import android.support.p022v4.widget.DrawerLayout.C1009c;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.live.LiveDrawerLayout */
public class LiveDrawerLayout extends DrawerLayout {

    /* renamed from: a */
    public boolean f84560a;

    /* renamed from: b */
    public boolean f84561b;

    /* renamed from: c */
    private int f84562c;

    /* renamed from: d */
    private int f84563d;

    /* renamed from: e */
    private float f84564e;

    /* renamed from: f */
    private float f84565f;

    public LiveDrawerLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m105012a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = context.getResources().getDisplayMetrics().density;
        this.f84563d = viewConfiguration.getScaledTouchSlop();
        this.f84562c = (int) ((f * 20.0f) + 0.5f);
        addDrawerListener(new C1009c() {
            public final void onDrawerOpened(View view) {
                LiveDrawerLayout.this.f84560a = true;
            }

            public final void onDrawerStateChanged(int i) {
                if (i == 0) {
                    LiveDrawerLayout.this.f84561b = false;
                }
            }

            public final void onDrawerClosed(View view) {
                LiveDrawerLayout.this.f84560a = false;
                LiveDrawerLayout.this.f84561b = false;
            }

            public final void onDrawerSlide(View view, float f) {
                LiveDrawerLayout.this.f84561b = true;
            }
        });
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f84564e = x;
                this.f84565f = y;
            } else if (action == 2) {
                if (x > this.f84564e && !this.f84560a) {
                    return false;
                }
                int abs = (int) Math.abs(x - this.f84564e);
                int abs2 = (int) Math.abs(y - this.f84565f);
                if ((abs * abs) + (abs2 * abs2) > this.f84563d * this.f84563d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !this.f84560a && abs < abs2 * 4) {
                    return false;
                }
                if (z && this.f84560a) {
                    if (abs > abs2 * 4) {
                        return true;
                    }
                    return false;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public LiveDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo83649a(Activity activity, float f) {
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField("mRightDragger");
            declaredField.setAccessible(true);
            C1060q qVar = (C1060q) declaredField.get(this);
            Field declaredField2 = qVar.getClass().getDeclaredField("mEdgeSize");
            declaredField2.setAccessible(true);
            int i = declaredField2.getInt(qVar);
            Point point = new Point();
            activity.getWindowManager().getDefaultDisplay().getSize(point);
            declaredField2.setInt(qVar, Math.max(i, (int) (((float) point.x) * 1.0f)));
            Field declaredField3 = getClass().getSuperclass().getDeclaredField("mRightCallback");
            declaredField3.setAccessible(true);
            C1063a aVar = (C1063a) declaredField3.get(this);
            Field declaredField4 = aVar.getClass().getDeclaredField("mPeekRunnable");
            declaredField4.setAccessible(true);
            declaredField4.set(aVar, null);
        } catch (Exception unused) {
        }
    }

    public LiveDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m105012a(context);
    }
}
