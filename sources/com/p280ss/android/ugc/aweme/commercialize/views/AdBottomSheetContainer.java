package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0343a;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer */
public final class AdBottomSheetContainer extends CoordinatorLayout {

    /* renamed from: f */
    private boolean f66814f;

    /* renamed from: g */
    private BottomSheetBehavior<AdBottomSheetContainer> f66815g;

    /* renamed from: h */
    private C25389b f66816h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer$a */
    public static final class C25388a extends C0343a {

        /* renamed from: a */
        final /* synthetic */ BottomSheetBehavior f66817a;

        /* renamed from: b */
        final /* synthetic */ AdBottomSheetContainer f66818b;

        /* renamed from: a */
        public final void mo1372a(View view, float f) {
            C7573i.m23587b(view, "bottomSheet");
        }

        C25388a(BottomSheetBehavior bottomSheetBehavior, AdBottomSheetContainer adBottomSheetContainer) {
            this.f66817a = bottomSheetBehavior;
            this.f66818b = adBottomSheetContainer;
        }

        /* renamed from: a */
        public final void mo1373a(View view, int i) {
            C7573i.m23587b(view, "bottomSheet");
            if (i != 1) {
                switch (i) {
                    case 3:
                        C25389b callback = this.f66818b.getCallback();
                        if (callback != null) {
                            callback.mo65956a();
                        }
                        return;
                    case 4:
                        C25389b callback2 = this.f66818b.getCallback();
                        if (callback2 != null) {
                            callback2.mo65957b();
                            return;
                        }
                        break;
                }
                return;
            }
            if (!this.f66818b.getHideable()) {
                this.f66817a.mo1357b(3);
            }
            C25389b callback3 = this.f66818b.getCallback();
            if (callback3 != null) {
                callback3.mo65958c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer$b */
    public interface C25389b {
        /* renamed from: a */
        void mo65956a();

        /* renamed from: b */
        void mo65957b();

        /* renamed from: c */
        void mo65958c();
    }

    public AdBottomSheetContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdBottomSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final BottomSheetBehavior<AdBottomSheetContainer> getBehavior() {
        return this.f66815g;
    }

    public final C25389b getCallback() {
        return this.f66816h;
    }

    public final boolean getHideable() {
        return this.f66814f;
    }

    /* renamed from: a */
    public final void mo1011a() {
        this.f66815g.mo1357b(3);
    }

    /* renamed from: b */
    public final void mo1013b() {
        if (mo1014c()) {
            this.f66815g.mo1357b(4);
        }
    }

    /* renamed from: c */
    public final boolean mo1014c() {
        if (this.f66815g.f1342h == 3) {
            return true;
        }
        return false;
    }

    public final void setCallback(C25389b bVar) {
        this.f66816h = bVar;
    }

    public final void setHideable(boolean z) {
        this.f66814f = z;
    }

    public final void setBehavior(BottomSheetBehavior<AdBottomSheetContainer> bottomSheetBehavior) {
        C7573i.m23587b(bottomSheetBehavior, "<set-?>");
        this.f66815g = bottomSheetBehavior;
    }

    /* renamed from: d */
    public final void mo65949d(View view) {
        C7573i.m23587b(view, "view");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ((C0355d) layoutParams).mo1454a((Behavior) this.f66815g);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.design.widget.CoordinatorLayout.LayoutParams");
    }

    public AdBottomSheetContainer(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f66814f = true;
        BottomSheetBehavior<AdBottomSheetContainer> bottomSheetBehavior = new BottomSheetBehavior<>();
        bottomSheetBehavior.f1347m = new C25388a(bottomSheetBehavior, this);
        this.f66814f = true;
        bottomSheetBehavior.mo1352a(0);
        this.f66815g = bottomSheetBehavior;
    }

    public /* synthetic */ AdBottomSheetContainer(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
