package android.support.constraint;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.util.AttributeSet;
import android.view.View;

public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo374a(AttributeSet attributeSet) {
        super.mo374a(attributeSet);
        this.f405e = false;
    }

    /* renamed from: b */
    public final void mo375b(ConstraintLayout constraintLayout) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.f465al.mo545d(0);
        layoutParams.f465al.mo548e(0);
    }

    /* renamed from: a */
    public final void mo373a(ConstraintLayout constraintLayout) {
        float f;
        int visibility = getVisibility();
        if (VERSION.SDK_INT >= 21) {
            f = getElevation();
        } else {
            f = 0.0f;
        }
        for (int i = 0; i < this.f402b; i++) {
            View a = constraintLayout.mo382a(this.f401a[i]);
            if (a != null) {
                a.setVisibility(visibility);
                if (f > 0.0f && VERSION.SDK_INT >= 21) {
                    a.setElevation(f);
                }
            }
        }
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
