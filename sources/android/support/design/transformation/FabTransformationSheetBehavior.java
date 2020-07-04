package android.support.design.transformation;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.design.p015a.C0241h;
import android.support.design.p015a.C0243j;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: c */
    private Map<View, Integer> f1263c;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0312a mo1211a(Context context, boolean z) {
        int i;
        if (z) {
            i = R.animator.j;
        } else {
            i = R.animator.i;
        }
        C0312a aVar = new C0312a();
        aVar.f1256a = C0241h.m842a(context, i);
        aVar.f1257b = new C0243j(17, 0.0f, 0.0f);
        return aVar;
    }

    /* renamed from: a */
    private void m1237a(View view, boolean z) {
        boolean z2;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (VERSION.SDK_INT >= 16 && z) {
                this.f1263c = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (!(childAt.getLayoutParams() instanceof C0355d) || !(((C0355d) childAt.getLayoutParams()).f1407a instanceof FabTransformationScrimBehavior)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (childAt != view && !z2) {
                    if (z) {
                        if (VERSION.SDK_INT >= 16) {
                            this.f1263c.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C0991u.m4206c(childAt, 4);
                    } else if (this.f1263c != null && this.f1263c.containsKey(childAt)) {
                        C0991u.m4206c(childAt, ((Integer) this.f1263c.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.f1263c = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1206a(View view, View view2, boolean z, boolean z2) {
        m1237a(view2, z);
        return super.mo1206a(view, view2, z, z2);
    }
}
