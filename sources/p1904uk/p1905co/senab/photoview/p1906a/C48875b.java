package p1904uk.p1905co.senab.photoview.p1906a;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: uk.co.senab.photoview.a.b */
public class C48875b extends C48874a {

    /* renamed from: f */
    private int f124238f = -1;

    /* renamed from: g */
    private int f124239g;

    public C48875b(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo123669a(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f124239g);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo123672b(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f124239g);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo123673c(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 3
            r2 = -1
            r3 = 0
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x0019
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x0041;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0043
        L_0x0012:
            int r0 = r6.getPointerId(r3)
            r5.f124238f = r0
            goto L_0x0043
        L_0x0019:
            int r0 = r6.getAction()
            int r0 = p1904uk.p1905co.senab.photoview.C48873a.m150811a(r0)
            int r1 = r6.getPointerId(r0)
            int r4 = r5.f124238f
            if (r1 != r4) goto L_0x0043
            if (r0 != 0) goto L_0x002d
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            int r1 = r6.getPointerId(r0)
            r5.f124238f = r1
            float r1 = r6.getX(r0)
            r5.f124232b = r1
            float r0 = r6.getY(r0)
            r5.f124233c = r0
            goto L_0x0043
        L_0x0041:
            r5.f124238f = r2
        L_0x0043:
            int r0 = r5.f124238f
            if (r0 == r2) goto L_0x0049
            int r3 = r5.f124238f
        L_0x0049:
            int r0 = r6.findPointerIndex(r3)
            r5.f124239g = r0
            boolean r6 = super.mo123673c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p1904uk.p1905co.senab.photoview.p1906a.C48875b.mo123673c(android.view.MotionEvent):boolean");
    }
}
