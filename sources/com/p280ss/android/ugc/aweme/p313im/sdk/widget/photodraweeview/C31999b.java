package com.p280ss.android.ugc.aweme.p313im.sdk.widget.photodraweeview;

import android.graphics.RectF;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import com.facebook.drawee.view.DraweeView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.b */
public final class C31999b implements OnDoubleTapListener {

    /* renamed from: a */
    public C31995a f83722a;

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public C31999b(C31995a aVar) {
        this.f83722a = aVar;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f83722a == null) {
            return false;
        }
        try {
            float f = this.f83722a.mo82964f();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (f < this.f83722a.mo82961d()) {
                this.f83722a.mo82948a(this.f83722a.mo82961d(), x, y, true);
            } else if (f < this.f83722a.mo82961d() || f >= this.f83722a.mo82963e()) {
                this.f83722a.mo82948a(this.f83722a.mo82959c(), x, y, true);
            } else {
                this.f83722a.mo82948a(this.f83722a.mo82963e(), x, y, true);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f83722a == null) {
            return false;
        }
        DraweeView b = this.f83722a.mo82957b();
        if (b == null) {
            return false;
        }
        if (this.f83722a.mo82965g() != null) {
            RectF i = this.f83722a.mo82967i();
            if (i != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (i.contains(x, y)) {
                    this.f83722a.mo82965g().mo51756a(b, (x - i.left) / i.width(), (y - i.top) / i.height());
                    return true;
                }
            }
        }
        if (this.f83722a.mo82966h() == null) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        return true;
    }
}
