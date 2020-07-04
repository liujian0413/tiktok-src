package android.support.p022v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v4.view.w */
public final class C0996w {
    /* renamed from: b */
    public static int m4264b(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.getNestedScrollAxes();
        }
        return ((C0981m) viewGroup).getNestedScrollAxes();
    }

    /* renamed from: a */
    public static boolean m4263a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(R.id.dg_);
        if ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0991u.m4241t(viewGroup) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m4262a(ViewGroup viewGroup, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            viewGroup.setTransitionGroup(false);
        } else {
            viewGroup.setTag(R.id.dg_, Boolean.valueOf(false));
        }
    }
}
