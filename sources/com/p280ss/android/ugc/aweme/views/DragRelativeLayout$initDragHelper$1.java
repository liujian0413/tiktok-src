package com.p280ss.android.ugc.aweme.views;

import android.support.p022v4.widget.C1060q.C1063a;
import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.views.DragRelativeLayout$initDragHelper$1 */
public final class DragRelativeLayout$initDragHelper$1 extends C1063a {

    /* renamed from: a */
    final /* synthetic */ C43363d f112242a;

    /* renamed from: a */
    public final int mo1362a(View view) {
        C7573i.m23587b(view, "child");
        return this.f112242a.getMeasuredHeight() - view.getMeasuredHeight();
    }

    /* renamed from: b */
    public final int mo1578b(View view) {
        C7573i.m23587b(view, "child");
        return this.f112242a.getMeasuredWidth() - view.getMeasuredWidth();
    }

    /* renamed from: a */
    public final boolean mo1367a(View view, int i) {
        C7573i.m23587b(view, "view");
        if (view == this.f112242a.f112332f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo1363a(View view, int i, int i2) {
        C7573i.m23587b(view, "child");
        if (i > this.f112242a.getHeight() - view.getHeight()) {
            return this.f112242a.getHeight() - view.getHeight();
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: b */
    public final int mo1368b(View view, int i, int i2) {
        C7573i.m23587b(view, "child");
        if (i > this.f112242a.getWidth() - view.getWidth()) {
            return this.f112242a.getWidth() - view.getWidth();
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f5, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1365a(android.view.View r8, float r9, float r10) {
        /*
            r7 = this;
            java.lang.String r0 = "releasedChild"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            android.view.View r0 = r0.f112332f
            if (r8 == r0) goto L_0x000c
            return
        L_0x000c:
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            int r0 = r0.f112327a
            r2 = 3
            if (r0 != r2) goto L_0x0014
            return
        L_0x0014:
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            int r0 = r0.getWidth()
            int r2 = r8.getWidth()
            int r0 = r0 - r2
            com.ss.android.ugc.aweme.views.d r2 = r7.f112242a
            int r2 = r2.getHeight()
            int r3 = r8.getHeight()
            int r2 = r2 - r3
            int r3 = r8.getLeft()
            int r4 = r8.getTop()
            com.ss.android.ugc.aweme.views.d r5 = r7.f112242a
            int r5 = r5.getWidth()
            int r5 = r5 / 2
            int r6 = r8.getWidth()
            int r6 = r6 / 2
            int r5 = r5 - r6
            if (r3 >= r5) goto L_0x00f6
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            int r5 = r8.getWidth()
            int r5 = r5 / 2
            int r0 = r0 - r5
            if (r4 >= r0) goto L_0x00a1
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            int r0 = r0.f112330d
            int r0 = r4 - r0
            com.ss.android.ugc.aweme.views.d r2 = r7.f112242a
            int r2 = r2.f112328b
            int r2 = r3 - r2
            com.ss.android.ugc.aweme.views.d r5 = r7.f112242a
            int r5 = r5.f112327a
            switch(r5) {
                case 0: goto L_0x0083;
                case 1: goto L_0x0073;
                case 2: goto L_0x0068;
                default: goto L_0x0067;
            }
        L_0x0067:
            goto L_0x00a0
        L_0x0068:
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            int r2 = -r2
            r3 = 0
            r4 = 4
            r5 = 0
            r1 = r8
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            goto L_0x00a0
        L_0x0073:
            com.ss.android.ugc.aweme.views.d r2 = r7.f112242a
            r3 = 0
            int r4 = -r0
            r5 = 2
            r6 = 0
            r0 = r2
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            return
        L_0x0083:
            if (r3 <= r4) goto L_0x0095
            com.ss.android.ugc.aweme.views.d r2 = r7.f112242a
            r3 = 0
            int r4 = -r0
            r5 = 2
            r6 = 0
            r0 = r2
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            return
        L_0x0095:
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            int r2 = -r2
            r3 = 0
            r4 = 4
            r5 = 0
            r1 = r8
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            return
        L_0x00a0:
            return
        L_0x00a1:
            int r2 = r2 - r4
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            int r0 = r0.f112331e
            int r4 = r2 - r0
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            int r0 = r0.f112328b
            int r0 = r3 - r0
            com.ss.android.ugc.aweme.views.d r5 = r7.f112242a
            int r5 = r5.f112327a
            switch(r5) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00b6;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            goto L_0x00f5
        L_0x00b6:
            com.ss.android.ugc.aweme.views.d r2 = r7.f112242a
            int r3 = -r0
            r4 = 0
            r5 = 4
            r6 = 0
            r0 = r2
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            goto L_0x00f5
        L_0x00c6:
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            r2 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            goto L_0x01a7
        L_0x00d4:
            if (r3 <= r2) goto L_0x00e4
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            r2 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            goto L_0x01a7
        L_0x00e4:
            com.ss.android.ugc.aweme.views.d r2 = r7.f112242a
            int r3 = -r0
            r4 = 0
            r5 = 4
            r6 = 0
            r0 = r2
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            goto L_0x01a7
        L_0x00f5:
            return
        L_0x00f6:
            com.ss.android.ugc.aweme.views.d r5 = r7.f112242a
            int r5 = r5.getHeight()
            int r5 = r5 / 2
            int r6 = r8.getWidth()
            int r6 = r6 / 2
            int r5 = r5 - r6
            if (r4 >= r5) goto L_0x0159
            com.ss.android.ugc.aweme.views.d r2 = r7.f112242a
            int r2 = r2.f112330d
            int r2 = r4 - r2
            int r0 = r0 - r3
            com.ss.android.ugc.aweme.views.d r3 = r7.f112242a
            int r3 = r3.f112329c
            int r3 = r0 - r3
            com.ss.android.ugc.aweme.views.d r5 = r7.f112242a
            int r5 = r5.f112327a
            switch(r5) {
                case 0: goto L_0x0139;
                case 1: goto L_0x012a;
                case 2: goto L_0x011c;
                default: goto L_0x011b;
            }
        L_0x011b:
            goto L_0x0158
        L_0x011c:
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            goto L_0x0158
        L_0x012a:
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            r3 = 0
            int r4 = -r2
            r5 = 2
            r6 = 0
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            return
        L_0x0139:
            if (r0 <= r4) goto L_0x014a
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            r3 = 0
            int r4 = -r2
            r5 = 2
            r6 = 0
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            return
        L_0x014a:
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            return
        L_0x0158:
            return
        L_0x0159:
            int r2 = r2 - r4
            com.ss.android.ugc.aweme.views.d r4 = r7.f112242a
            int r4 = r4.f112331e
            int r4 = r2 - r4
            int r0 = r0 - r3
            com.ss.android.ugc.aweme.views.d r3 = r7.f112242a
            int r3 = r3.f112329c
            int r3 = r0 - r3
            com.ss.android.ugc.aweme.views.d r5 = r7.f112242a
            int r5 = r5.f112327a
            switch(r5) {
                case 0: goto L_0x018a;
                case 1: goto L_0x017d;
                case 2: goto L_0x016f;
                default: goto L_0x016e;
            }
        L_0x016e:
            goto L_0x01a7
        L_0x016f:
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            goto L_0x01a7
        L_0x017d:
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            r2 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            return
        L_0x018a:
            if (r0 <= r2) goto L_0x0199
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            r2 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            return
        L_0x0199:
            com.ss.android.ugc.aweme.views.d r0 = r7.f112242a
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            com.p280ss.android.ugc.aweme.views.C43363d.m137647a(r0, r1, r2, r3, r4, r5)
            return
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.views.DragRelativeLayout$initDragHelper$1.mo1365a(android.view.View, float, float):void");
    }
}
