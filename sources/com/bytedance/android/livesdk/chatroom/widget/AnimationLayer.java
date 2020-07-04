package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class AnimationLayer extends FrameLayout {

    /* renamed from: a */
    public static final C5758a f16871a = new C5758a(null);

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.AnimationLayer$a */
    public static final class C5758a {
        private C5758a() {
        }

        public /* synthetic */ C5758a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m18124a(View view, int i) {
            LayoutParams layoutParams;
            C7573i.m23587b(view, "view");
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new LayoutParams(-2, -2);
            }
            if (layoutParams2 instanceof LayoutParams) {
                layoutParams = (LayoutParams) layoutParams2;
            } else {
                layoutParams = new LayoutParams(layoutParams2);
            }
            layoutParams.gravity = 51;
            view.setLayoutParams(layoutParams);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static void m18125a(View view, int i, int i2, int i3, int i4) {
            C7573i.m23587b(view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LayoutParams(-2, -2);
            }
            if (layoutParams instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.topMargin = i2;
                marginLayoutParams.rightMargin = i3;
                marginLayoutParams.bottomMargin = i4;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public AnimationLayer(Context context) {
        this(context, null, 0, 6, null);
    }

    public AnimationLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo14186a(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(i, this, false);
        addView(inflate);
        C7573i.m23582a((Object) inflate, "v");
        return inflate;
    }

    /* renamed from: a */
    public final void mo14187a(View view, View view2) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(view2, "anchor");
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int min = Math.min(2, 2);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(Integer.valueOf(iArr[i] - iArr2[i]));
        }
        List list = arrayList;
        C5758a.m18125a(view, ((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), 0, 0);
        C5758a.m18124a(view, 51);
    }

    public AnimationLayer(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "ctx");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AnimationLayer(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
