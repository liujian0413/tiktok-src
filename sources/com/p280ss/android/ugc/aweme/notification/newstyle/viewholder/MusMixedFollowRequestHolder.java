package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity.C34470a;
import com.p280ss.android.ugc.aweme.notification.newstyle.model.C34558c;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusMixedFollowRequestHolder */
public final class MusMixedFollowRequestHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    static final /* synthetic */ C7595j[] f90260d = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MusMixedFollowRequestHolder.class), "mRoot", "getMRoot()Landroid/widget/RelativeLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MusMixedFollowRequestHolder.class), "mCount", "getMCount()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: e */
    private final C7541d f90261e;

    /* renamed from: f */
    private final C7541d f90262f;

    /* renamed from: g */
    private int f90263g;

    /* renamed from: k */
    private final Fragment f90264k;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusMixedFollowRequestHolder$a */
    static final class C34579a extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f90265a;

        C34579a(View view) {
            this.f90265a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f90265a.findViewById(R.id.dsr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusMixedFollowRequestHolder$b */
    static final class C34580b extends Lambda implements C7561a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ View f90266a;

        C34580b(View view) {
            this.f90266a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RelativeLayout invoke() {
            return (RelativeLayout) this.f90266a.findViewById(R.id.c7r);
        }
    }

    /* renamed from: d */
    private final RelativeLayout m111795d() {
        return (RelativeLayout) this.f90261e.getValue();
    }

    /* renamed from: e */
    private final DmtTextView m111796e() {
        return (DmtTextView) this.f90262f.getValue();
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C34593i.m111824a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
        } else {
            C34470a.m111463a(this.f90264k, this.f90263g);
        }
    }

    /* renamed from: a */
    public final void mo87879a(C34558c cVar, int i) {
        C7573i.m23587b(cVar, "notice");
        this.f90263g = i;
        DmtTextView e = m111796e();
        C7573i.m23582a((Object) e, "mCount");
        e.setText(C30537o.m99738a((long) cVar.f90152a));
    }

    public MusMixedFollowRequestHolder(View view, Fragment fragment) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(fragment, "fragment");
        super(view);
        this.f90264k = fragment;
        this.f90261e = C7546e.m23569a(new C34580b(view));
        this.f90262f = C7546e.m23569a(new C34579a(view));
        C34615d.m111861a((View) m111795d());
        m111795d().setOnClickListener(this);
    }
}
