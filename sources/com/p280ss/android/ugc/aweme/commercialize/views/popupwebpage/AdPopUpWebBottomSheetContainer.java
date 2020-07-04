package com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.p280ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.commercialize.views.AdPopUpWebBottomSheetBehavior.C25442a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer */
public final class AdPopUpWebBottomSheetContainer extends CoordinatorLayout {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f67423f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdPopUpWebBottomSheetContainer.class), "actionMode", "getActionMode()Lcom/ss/android/ugc/aweme/commercialize/views/popupwebpage/ActionMode;"))};

    /* renamed from: g */
    public static final C25597c f67424g = new C25597c(null);

    /* renamed from: h */
    private boolean f67425h;

    /* renamed from: i */
    private AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> f67426i;

    /* renamed from: j */
    private final C7541d f67427j;

    /* renamed from: k */
    private C25596b f67428k;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer$a */
    public static final class C25595a extends C25442a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebBottomSheetBehavior f67429a;

        /* renamed from: b */
        final /* synthetic */ AdPopUpWebBottomSheetContainer f67430b;

        C25595a(AdPopUpWebBottomSheetBehavior adPopUpWebBottomSheetBehavior, AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer) {
            this.f67429a = adPopUpWebBottomSheetBehavior;
            this.f67430b = adPopUpWebBottomSheetContainer;
        }

        /* renamed from: a */
        public final void mo66063a(View view, float f) {
            C7573i.m23587b(view, "bottomSheet");
            C25596b callback = this.f67430b.getCallback();
            if (callback != null) {
                callback.mo66392a(view, f);
            }
        }

        /* renamed from: a */
        public final void mo66064a(View view, int i) {
            C7573i.m23587b(view, "bottomSheet");
            if (i != 1) {
                switch (i) {
                    case 3:
                        if (this.f67430b.getActionMode().f67488b != 0) {
                            this.f67429a.mo66053a(this.f67430b.getActionMode().f67488b);
                        }
                        C25596b callback = this.f67430b.getCallback();
                        if (callback != null) {
                            callback.mo66391a();
                        }
                        return;
                    case 4:
                        C25596b callback2 = this.f67430b.getCallback();
                        if (callback2 != null) {
                            callback2.mo66393b();
                        }
                        return;
                    case 5:
                        C25596b callback3 = this.f67430b.getCallback();
                        if (callback3 != null) {
                            callback3.mo66395d();
                            return;
                        }
                        break;
                }
                return;
            }
            if (!this.f67430b.getCollapsible()) {
                this.f67429a.mo66056b(3);
            }
            C25596b callback4 = this.f67430b.getCallback();
            if (callback4 != null) {
                callback4.mo66394c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer$b */
    public interface C25596b {
        /* renamed from: a */
        void mo66391a();

        /* renamed from: a */
        void mo66392a(View view, float f);

        /* renamed from: b */
        void mo66393b();

        /* renamed from: c */
        void mo66394c();

        /* renamed from: d */
        void mo66395d();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer$c */
    public static final class C25597c {
        private C25597c() {
        }

        public /* synthetic */ C25597c(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer$d */
    static final class C25598d extends Lambda implements C7561a<C25625a> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebBottomSheetContainer f67431a;

        /* renamed from: b */
        final /* synthetic */ Context f67432b;

        C25598d(AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer, Context context) {
            this.f67431a = adPopUpWebBottomSheetContainer;
            this.f67432b = context;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C25625a invoke() {
            C25625a aVar = new C25625a(this.f67432b, this.f67431a, 0, 4, null);
            return aVar;
        }
    }

    public AdPopUpWebBottomSheetContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C25625a getActionMode() {
        return (C25625a) this.f67427j.getValue();
    }

    public final AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> getBehavior() {
        return this.f67426i;
    }

    public final C25596b getCallback() {
        return this.f67428k;
    }

    public final boolean getCollapsible() {
        return this.f67425h;
    }

    /* renamed from: a */
    public final void mo1011a() {
        this.f67426i.mo66056b(3);
    }

    /* renamed from: b */
    public final void mo1013b() {
        this.f67426i.mo66056b(4);
    }

    /* renamed from: e */
    private boolean m84141e() {
        if (this.f67426i.f66936f == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m84142f() {
        if (this.f67426i.f66936f == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo1014c() {
        if (mo66383d()) {
            this.f67426i.mo66056b(5);
        }
    }

    /* renamed from: d */
    public final boolean mo66383d() {
        if (m84141e() || m84142f()) {
            return true;
        }
        return false;
    }

    public final void setCallback(C25596b bVar) {
        this.f67428k = bVar;
    }

    public final void setCollapsible(boolean z) {
        this.f67425h = z;
    }

    public final void setBehavior(AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> adPopUpWebBottomSheetBehavior) {
        C7573i.m23587b(adPopUpWebBottomSheetBehavior, "<set-?>");
        this.f67426i = adPopUpWebBottomSheetBehavior;
    }

    /* renamed from: b */
    public final void mo66382b(int i) {
        getActionMode().mo66444a(i);
        this.f67426i.mo66053a(getActionMode().f67487a);
    }

    /* renamed from: d */
    public final void mo65949d(View view) {
        C7573i.m23587b(view, "view");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ((C0355d) layoutParams).mo1454a((Behavior) this.f67426i);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.design.widget.CoordinatorLayout.LayoutParams");
    }

    public AdPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f67425h = true;
        AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> adPopUpWebBottomSheetBehavior = new AdPopUpWebBottomSheetBehavior<>();
        adPopUpWebBottomSheetBehavior.f66941k = new C25595a(adPopUpWebBottomSheetBehavior, this);
        this.f67426i = adPopUpWebBottomSheetBehavior;
        this.f67427j = C7546e.m23569a(new C25598d(this, context));
        this.f67426i.f66934d = true;
        this.f67425h = true;
        this.f67426i.mo66056b(5);
        this.f67426i.mo66053a(getActionMode().f67487a);
    }

    public /* synthetic */ AdPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
