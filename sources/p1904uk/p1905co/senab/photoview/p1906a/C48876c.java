package p1904uk.p1905co.senab.photoview.p1906a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;

/* renamed from: uk.co.senab.photoview.a.c */
public final class C48876c extends C48875b {

    /* renamed from: f */
    protected final ScaleGestureDetector f124240f;

    /* renamed from: a */
    public final boolean mo123671a() {
        return this.f124240f.isInProgress();
    }

    public C48876c(Context context) {
        super(context);
        this.f124240f = new ScaleGestureDetector(context, new OnScaleGestureListener() {
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                C48876c.this.f124231a.mo123678a(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
        });
    }

    /* renamed from: c */
    public final boolean mo123673c(MotionEvent motionEvent) {
        this.f124240f.onTouchEvent(motionEvent);
        return super.mo123673c(motionEvent);
    }
}
