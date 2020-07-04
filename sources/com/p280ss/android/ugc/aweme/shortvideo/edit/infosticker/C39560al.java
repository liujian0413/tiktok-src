package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.al */
public final class C39560al {
    /* renamed from: a */
    public static final int[] m126372a(View view, int i, int i2) {
        int i3;
        C7573i.m23587b(view, "view");
        int a = C39804em.m127430a(view, view.getContext(), i, i2);
        LayoutParams layoutParams = view.getLayoutParams();
        double d = (double) (i * 16);
        double d2 = (double) i2;
        Double.isNaN(d2);
        if (d > d2 * 9.01d) {
            return new int[]{0, (((C39805en.m127452e(view.getContext()) - C39804em.m127429a(view.getContext(), a)) - layoutParams.height) / 2) + C39804em.m127438b(view.getContext(), a)};
        }
        int b = (C39805en.m127447b(view.getContext()) - layoutParams.width) >> 1;
        if (C39804em.m127436a()) {
            i3 = C39804em.f103459c;
        } else {
            i3 = 0;
        }
        return new int[]{b, i3};
    }

    /* renamed from: a */
    public static final int[] m126373a(View view, int i, int i2, boolean z) {
        C7573i.m23587b(view, "parentView");
        if (C39805en.m127445a()) {
            return m126372a(view, i, i2);
        }
        return m126374a(z, view, i, i2);
    }

    /* renamed from: a */
    private static int[] m126374a(boolean z, View view, int i, int i2) {
        C7573i.m23587b(view, "view");
        if (!z) {
            C39804em.m127434a(view, i, i2);
        } else if (Math.abs(C39805en.m127443a(view.getContext()) - i2) < 5 || i2 > C39805en.m127443a(view.getContext())) {
            C39804em.m127434a(view, i, i2);
        } else {
            C39804em.m127441c(view, i, i2);
        }
        LayoutParams layoutParams = view.getLayoutParams();
        int b = (C39805en.m127447b(view.getContext()) - layoutParams.width) >> 1;
        int e = (C39805en.m127452e(view.getContext()) - layoutParams.height) >> 1;
        if (i > i2) {
            b = 0;
        } else if (i < i2) {
            e = 0;
        }
        return new int[]{b, e};
    }
}
