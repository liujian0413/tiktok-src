package com.p280ss.android.ugc.aweme.photo;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.photo.LocalViewPagerBottomSheetBehavior */
public final class LocalViewPagerBottomSheetBehavior<V extends View> extends ViewPagerBottomSheetBehavior<V> {

    /* renamed from: n */
    public static final C34723a f90524n = new C34723a(null);

    /* renamed from: o */
    private Integer f90525o;

    /* renamed from: com.ss.android.ugc.aweme.photo.LocalViewPagerBottomSheetBehavior$a */
    public static final class C34723a {
        private C34723a() {
        }

        public /* synthetic */ C34723a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static <V extends View> LocalViewPagerBottomSheetBehavior<V> m112047a(V v) {
            C7573i.m23587b(v, "view");
            LayoutParams layoutParams = v.getLayoutParams();
            if (!(layoutParams instanceof C0355d)) {
                layoutParams = null;
            }
            C0355d dVar = (C0355d) layoutParams;
            if (dVar != null) {
                Behavior behavior = dVar.f1407a;
                if (!(behavior instanceof LocalViewPagerBottomSheetBehavior)) {
                    behavior = null;
                }
                LocalViewPagerBottomSheetBehavior<V> localViewPagerBottomSheetBehavior = (LocalViewPagerBottomSheetBehavior) behavior;
                if (localViewPagerBottomSheetBehavior == null) {
                    throw new IllegalArgumentException("The view is not associated with LocalViewPagerBottomSheetBehavior");
                } else if (localViewPagerBottomSheetBehavior != null) {
                    return localViewPagerBottomSheetBehavior;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.photo.LocalViewPagerBottomSheetBehavior<V>");
                }
            } else {
                throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
            }
        }
    }

    /* renamed from: e */
    public final void mo88143e(int i) {
        this.f90525o = Integer.valueOf(R.id.dmd);
    }

    public LocalViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo1441a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        C7573i.m23587b(coordinatorLayout, "coordinatorLayout");
        C7573i.m23587b(v, "child");
        C7573i.m23587b(view, "target");
        C7573i.m23587b(iArr, "consumed");
        if (Integer.valueOf(view.getId()) == this.f90525o) {
            super.mo1441a(coordinatorLayout, v, view, i, i2, iArr);
        }
    }
}
