package android.support.p029v7.widget;

import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: android.support.v7.widget.ao */
final class C1354ao {
    /* renamed from: a */
    static int m6700a(C1290s sVar, C1343ah ahVar, View view, View view2, C1273i iVar, boolean z) {
        if (iVar.mo5800s() == 0 || sVar.mo5870b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(C1273i.m6060c(view) - C1273i.m6060c(view2)) + 1;
        }
        return Math.min(ahVar.mo6274f(), ahVar.mo6267b(view2) - ahVar.mo6263a(view));
    }

    /* renamed from: b */
    static int m6702b(C1290s sVar, C1343ah ahVar, View view, View view2, C1273i iVar, boolean z) {
        if (iVar.mo5800s() == 0 || sVar.mo5870b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return sVar.mo5870b();
        }
        return (int) ((((float) (ahVar.mo6267b(view2) - ahVar.mo6263a(view))) / ((float) (Math.abs(C1273i.m6060c(view) - C1273i.m6060c(view2)) + 1))) * ((float) sVar.mo5870b()));
    }

    /* renamed from: a */
    static int m6701a(C1290s sVar, C1343ah ahVar, View view, View view2, C1273i iVar, boolean z, boolean z2) {
        int i;
        if (iVar.mo5800s() == 0 || sVar.mo5870b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(C1273i.m6060c(view), C1273i.m6060c(view2));
        int max = Math.max(C1273i.m6060c(view), C1273i.m6060c(view2));
        if (z2) {
            i = Math.max(0, (sVar.mo5870b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(ahVar.mo6267b(view2) - ahVar.mo6263a(view))) / ((float) (Math.abs(C1273i.m6060c(view) - C1273i.m6060c(view2)) + 1)))) + ((float) (ahVar.mo6268c() - ahVar.mo6263a(view))));
    }
}
