package com.p280ss.android.ugc.aweme.commercialize.egg;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1123a.C24638b;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1124b.C24642a;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1124b.C24643b;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1124b.C24650c;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout */
public final class CommerceEggLayout extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f64939a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommerceEggLayout.class), "frescoEggController", "getFrescoEggController()Lcom/ss/android/ugc/aweme/commercialize/egg/controller/CommerceEggController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommerceEggLayout.class), "lottieEggController", "getLottieEggController()Lcom/ss/android/ugc/aweme/commercialize/egg/controller/CommerceEggController;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommerceEggLayout.class), "h5EggController", "getH5EggController()Lcom/ss/android/ugc/aweme/commercialize/egg/controller/CommerceEggController;"))};

    /* renamed from: b */
    private final C7541d f64940b;

    /* renamed from: c */
    private final C7541d f64941c;

    /* renamed from: d */
    private final C7541d f64942d;

    /* renamed from: e */
    private boolean f64943e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout$a */
    static final class C24628a extends Lambda implements C7561a<C24643b> {

        /* renamed from: a */
        final /* synthetic */ CommerceEggLayout f64944a;

        C24628a(CommerceEggLayout commerceEggLayout) {
            this.f64944a = commerceEggLayout;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C24643b invoke() {
            return new C24643b(this.f64944a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout$b */
    static final class C24629b extends Lambda implements C7561a<C24642a> {

        /* renamed from: a */
        final /* synthetic */ CommerceEggLayout f64945a;

        C24629b(CommerceEggLayout commerceEggLayout) {
            this.f64945a = commerceEggLayout;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C24642a invoke() {
            return C24671f.m80850a(this.f64945a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout$c */
    static final class C24630c extends Lambda implements C7561a<C24650c> {

        /* renamed from: a */
        final /* synthetic */ CommerceEggLayout f64946a;

        C24630c(CommerceEggLayout commerceEggLayout) {
            this.f64946a = commerceEggLayout;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C24650c invoke() {
            return new C24650c(this.f64946a);
        }
    }

    public CommerceEggLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommerceEggLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final C24642a getFrescoEggController() {
        return (C24642a) this.f64940b.getValue();
    }

    private final C24642a getH5EggController() {
        return (C24642a) this.f64942d.getValue();
    }

    private final C24642a getLottieEggController() {
        return (C24642a) this.f64941c.getValue();
    }

    /* renamed from: a */
    public final void mo64483a(C24641b bVar, C24638b bVar2) {
        mo64484a(bVar, bVar2, 1, true);
    }

    /* renamed from: a */
    public final void mo64482a() {
        if (this.f64943e) {
            getFrescoEggController().mo64513b();
            getLottieEggController().mo64513b();
            getH5EggController().mo64513b();
        }
        removeAllViews();
        setVisibility(8);
    }

    public CommerceEggLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f64940b = C7546e.m23569a(new C24628a(this));
        this.f64941c = C7546e.m23569a(new C24630c(this));
        this.f64942d = C7546e.m23569a(new C24629b(this));
    }

    /* renamed from: a */
    public final void mo64484a(C24641b bVar, C24638b bVar2, int i, boolean z) {
        C24642a aVar;
        if (bVar != null) {
            setVisibility(0);
            bringToFront();
            if (!bVar.f64978d || (bVar.f64978d && bVar.f64979e.get())) {
                String str = bVar.f64976b;
                int hashCode = str.hashCode();
                if (hashCode != 117588) {
                    if (hashCode == 120609 && str.equals("zip")) {
                        aVar = getLottieEggController();
                        aVar.f64985g = i;
                        aVar.f64986h = z;
                        aVar.f64983e = bVar;
                        aVar.f64984f = bVar2;
                        aVar.mo64511a();
                    }
                } else if (str.equals("web")) {
                    aVar = getH5EggController();
                    aVar.f64985g = i;
                    aVar.f64986h = z;
                    aVar.f64983e = bVar;
                    aVar.f64984f = bVar2;
                    aVar.mo64511a();
                }
                aVar = getFrescoEggController();
                aVar.f64985g = i;
                aVar.f64986h = z;
                aVar.f64983e = bVar;
                aVar.f64984f = bVar2;
                aVar.mo64511a();
            } else {
                if (bVar2 != null) {
                    bVar2.mo64489b();
                }
                C24671f.m80871u().mo64539a(bVar, false, "CommerceEggLayout show failed");
            }
            this.f64943e = true;
            if (C7163a.m22363a()) {
                C24656e.m80824a(Toast.makeText(C6399b.m19921a(), "commerce_egg_new_version", 0));
            }
        }
    }

    public /* synthetic */ CommerceEggLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
