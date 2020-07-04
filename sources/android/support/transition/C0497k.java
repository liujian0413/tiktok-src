package android.support.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: android.support.transition.k */
public final class C0497k extends C0471ak {

    /* renamed from: a */
    public int f1998a = 80;

    /* renamed from: b */
    private float f1999b = 3.0f;

    /* renamed from: a */
    private int m2098a(ViewGroup viewGroup) {
        int i = this.f1998a;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }

    /* renamed from: a */
    public final long mo2111a(ViewGroup viewGroup, C0508m mVar, C0524s sVar, C0524s sVar2) {
        int i;
        C0524s sVar3;
        int i2;
        int i3;
        if (sVar == null && sVar2 == null) {
            return 0;
        }
        Rect e = mVar.mo2140e();
        if (sVar2 == null || m2057b(sVar) == 0) {
            sVar3 = sVar;
            i = -1;
        } else {
            sVar3 = sVar2;
            i = 1;
        }
        int c = m2058c(sVar3);
        int d = m2059d(sVar3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = viewGroup.getHeight() + round2;
        if (e != null) {
            i3 = e.centerX();
            i2 = e.centerY();
        } else {
            i3 = (round + width) / 2;
            i2 = (round2 + height) / 2;
        }
        float a = ((float) m2097a(viewGroup, c, d, i3, i2, round, round2, width, height)) / ((float) m2098a(viewGroup));
        long j = mVar.f2024d;
        if (j < 0) {
            j = 300;
        }
        return (long) Math.round((((float) (j * ((long) i))) / this.f1999b) * a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r4 != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r4 != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r7 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m2097a(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.f1998a
            r1 = 5
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 != r5) goto L_0x0019
            int r7 = android.support.p022v4.view.C0991u.m4220h(r7)
            if (r7 != r4) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            if (r4 == 0) goto L_0x0017
        L_0x0015:
            r7 = 5
            goto L_0x002d
        L_0x0017:
            r7 = 3
            goto L_0x002d
        L_0x0019:
            int r0 = r6.f1998a
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r5) goto L_0x002b
            int r7 = android.support.p022v4.view.C0991u.m4220h(r7)
            if (r7 != r4) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            if (r4 == 0) goto L_0x0015
            goto L_0x0017
        L_0x002b:
            int r7 = r6.f1998a
        L_0x002d:
            if (r7 == r2) goto L_0x0055
            if (r7 == r1) goto L_0x004c
            r11 = 48
            if (r7 == r11) goto L_0x0043
            r11 = 80
            if (r7 == r11) goto L_0x003a
            goto L_0x005d
        L_0x003a:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r9 + r7
            goto L_0x005d
        L_0x0043:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r15 + r7
            goto L_0x005d
        L_0x004c:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r8 + r7
            goto L_0x005d
        L_0x0055:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r14 + r7
        L_0x005d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0497k.m2097a(android.view.View, int, int, int, int, int, int, int, int):int");
    }
}
