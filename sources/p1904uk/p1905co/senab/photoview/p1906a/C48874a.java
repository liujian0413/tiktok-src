package p1904uk.p1905co.senab.photoview.p1906a;

import android.content.Context;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: uk.co.senab.photoview.a.a */
public class C48874a implements C48878d {

    /* renamed from: a */
    protected C48879e f124231a;

    /* renamed from: b */
    float f124232b;

    /* renamed from: c */
    float f124233c;

    /* renamed from: d */
    final float f124234d;

    /* renamed from: e */
    final float f124235e;

    /* renamed from: f */
    private VelocityTracker f124236f;

    /* renamed from: g */
    private boolean f124237g;

    /* renamed from: a */
    public boolean mo123671a() {
        return false;
    }

    /* renamed from: a */
    public final void mo123670a(C48879e eVar) {
        this.f124231a = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo123669a(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo123672b(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    public C48874a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f124235e = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f124234d = (float) viewConfiguration.getScaledTouchSlop();
    }

    /* renamed from: c */
    public boolean mo123673c(MotionEvent motionEvent) {
        boolean z = false;
        switch (motionEvent.getAction()) {
            case 0:
                this.f124236f = VelocityTracker.obtain();
                if (this.f124236f != null) {
                    this.f124236f.addMovement(motionEvent);
                }
                this.f124232b = mo123669a(motionEvent);
                this.f124233c = mo123672b(motionEvent);
                this.f124237g = false;
                break;
            case 1:
                if (this.f124237g && this.f124236f != null) {
                    this.f124232b = mo123669a(motionEvent);
                    this.f124233c = mo123672b(motionEvent);
                    this.f124236f.addMovement(motionEvent);
                    this.f124236f.computeCurrentVelocity(1000);
                    float xVelocity = this.f124236f.getXVelocity();
                    float yVelocity = this.f124236f.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f124235e) {
                        this.f124231a.mo123679a(this.f124232b, this.f124233c, -xVelocity, -yVelocity);
                    }
                }
                if (this.f124236f != null) {
                    this.f124236f.recycle();
                    this.f124236f = null;
                    break;
                }
                break;
            case 2:
                float a = mo123669a(motionEvent);
                float b = mo123672b(motionEvent);
                float f = a - this.f124232b;
                float f2 = b - this.f124233c;
                if (!this.f124237g) {
                    if (FloatMath.sqrt((f * f) + (f2 * f2)) >= this.f124234d) {
                        z = true;
                    }
                    this.f124237g = z;
                }
                if (this.f124237g) {
                    this.f124231a.mo123677a(f, f2);
                    this.f124232b = a;
                    this.f124233c = b;
                    if (this.f124236f != null) {
                        this.f124236f.addMovement(motionEvent);
                        break;
                    }
                }
                break;
            case 3:
                if (this.f124236f != null) {
                    this.f124236f.recycle();
                    this.f124236f = null;
                    break;
                }
                break;
        }
        return true;
    }
}
