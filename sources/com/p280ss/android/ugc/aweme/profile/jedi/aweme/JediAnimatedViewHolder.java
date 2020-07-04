package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.lighten.core.p612c.C12103a;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawable.p691a.C13360a;
import com.facebook.drawee.p698c.C13386a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p280ss.android.ugc.aweme.common.adapter.C25650d;
import com.p280ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAnimatedViewHolder */
public abstract class JediAnimatedViewHolder<R extends C11501d, ITEM> extends JediBaseViewHolder<R, ITEM> implements C25650d {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f93882g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(JediAnimatedViewHolder.class), "coverView", "getCoverView()Lcom/bytedance/lighten/loader/SmartImageView;"))};

    /* renamed from: j */
    public boolean f93883j;

    /* renamed from: k */
    public boolean f93884k = true;

    /* renamed from: l */
    public C12103a f93885l = new C35831a(this);

    /* renamed from: m */
    private final C7541d f93886m = C7546e.m23569a(new C35832b(this));

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAnimatedViewHolder$a */
    public static final class C35831a implements C12103a {

        /* renamed from: a */
        final /* synthetic */ JediAnimatedViewHolder f93887a;

        /* renamed from: a */
        public final void mo29800a() {
            this.f93887a.mo69906r();
        }

        C35831a(JediAnimatedViewHolder jediAnimatedViewHolder) {
            this.f93887a = jediAnimatedViewHolder;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAnimatedViewHolder$b */
    static final class C35832b extends Lambda implements C7561a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ JediAnimatedViewHolder f93888a;

        C35832b(JediAnimatedViewHolder jediAnimatedViewHolder) {
            this.f93888a = jediAnimatedViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SmartImageView invoke() {
            return this.f93888a.mo69905q();
        }
    }

    public final boolean bx_() {
        return this.f93883j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final SmartImageView mo62390p() {
        return (SmartImageView) this.f93886m.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract SmartImageView mo69905q();

    public final void by_() {
        mo62390p().mo29861b();
    }

    public final void bz_() {
        mo62390p().mo29862c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo69906r() {
        if (!this.f93884k && C6384b.m19835a().mo15292a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", C6384b.m19835a().mo15295d().stop_main_anim_when_invisible, false)) {
            mo62390p().mo29862c();
        }
    }

    /* renamed from: j */
    public final void mo66499j() throws Exception {
        if (mo62390p() != null && mo62390p().getController() != null) {
            C13386a controller = mo62390p().getController();
            if (controller == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) controller, "coverView.controller!!");
            if (controller.mo32721j() != null) {
                C13386a controller2 = mo62390p().getController();
                if (controller2 == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) controller2, "coverView.controller!!");
                Animatable j = controller2.mo32721j();
                if (j instanceof C13360a) {
                    ((C13360a) j).mo32663a();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo90805c(boolean z) {
        this.f93884k = z;
    }

    /* renamed from: a */
    public final void mo66492a(boolean z) {
        mo62390p().setAttached(z);
    }

    /* renamed from: b */
    public final void mo66493b(boolean z) {
        mo62390p().setUserVisibleHint(z);
    }

    public JediAnimatedViewHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
    }
}
