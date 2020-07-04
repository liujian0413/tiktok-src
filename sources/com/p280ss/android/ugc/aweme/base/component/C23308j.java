package com.p280ss.android.ugc.aweme.base.component;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.CircleOptions.C12089a;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditActivity;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.C43374j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.base.component.j */
public final class C23308j extends C43374j {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f61365a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23308j.class), "ivAvatar", "getIvAvatar()Lcom/bytedance/lighten/loader/SmartImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23308j.class), "ivCancel", "getIvCancel()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23308j.class), "tvUsername", "getTvUsername()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23308j.class), "btnUpdate", "getBtnUpdate()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: b */
    public final User f61366b;

    /* renamed from: c */
    private final C7541d f61367c = C7546e.m23569a(new C23313e(this));

    /* renamed from: d */
    private final C7541d f61368d = C7546e.m23569a(new C23314f(this));

    /* renamed from: e */
    private final C7541d f61369e = C7546e.m23569a(new C23315g(this));

    /* renamed from: f */
    private final C7541d f61370f = C7546e.m23569a(new C23312d(this));

    /* renamed from: com.ss.android.ugc.aweme.base.component.j$a */
    static final class C23309a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23308j f61371a;

        /* renamed from: b */
        final /* synthetic */ TextView f61372b;

        C23309a(C23308j jVar, TextView textView) {
            this.f61371a = jVar;
            this.f61372b = textView;
        }

        public final void run() {
            float a = C9738o.m28690a(this.f61371a.getContext(), 12.0f);
            float a2 = C9738o.m28690a(this.f61371a.getContext(), 1.0f);
            int width = (this.f61372b.getWidth() - this.f61372b.getPaddingLeft()) - this.f61372b.getPaddingRight();
            float measureText = this.f61372b.getPaint().measureText(this.f61372b.getText().toString());
            float textSize = this.f61372b.getTextSize();
            while (measureText > ((float) width) && textSize > a) {
                this.f61372b.setTextSize(0, textSize - a2);
                textSize = this.f61372b.getTextSize();
                measureText = this.f61372b.getPaint().measureText(this.f61372b.getText().toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.j$b */
    static final class C23310b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23308j f61373a;

        C23310b(C23308j jVar) {
            this.f61373a = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f61373a.dismiss();
            C6907h.m21524a("close_modify_username", (Map) C22984d.m75611a().mo59973a("enter_from", "modify_username_notify").mo59973a("click_method", "button").f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.j$c */
    static final class C23311c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23308j f61374a;

        C23311c(C23308j jVar) {
            this.f61374a = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f61374a.dismiss();
            Context context = this.f61374a.getContext();
            C7573i.m23582a((Object) context, "context");
            ProfileEditActivity.m117085a(C38157b.m121903a(context), C42914ab.m136242a().mo104630a("need_focus_id_input", 2).f111445a);
            C6907h.m21524a("click_modify_username", (Map) C22984d.m75611a().mo59973a("enter_from", "modify_username_notify").f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.j$d */
    static final class C23312d extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C23308j f61375a;

        C23312d(C23308j jVar) {
            this.f61375a = jVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f61375a.findViewById(R.id.pu);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.j$e */
    static final class C23313e extends Lambda implements C7561a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ C23308j f61376a;

        C23313e(C23308j jVar) {
            this.f61376a = jVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SmartImageView invoke() {
            return (SmartImageView) this.f61376a.findViewById(R.id.b74);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.j$f */
    static final class C23314f extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C23308j f61377a;

        C23314f(C23308j jVar) {
            this.f61377a = jVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f61377a.findViewById(R.id.b76);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.j$g */
    static final class C23315g extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C23308j f61378a;

        C23315g(C23308j jVar) {
            this.f61378a = jVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f61378a.findViewById(R.id.drn);
        }
    }

    /* renamed from: a */
    private final SmartImageView m76480a() {
        return (SmartImageView) this.f61367c.getValue();
    }

    /* renamed from: b */
    private final ImageView m76483b() {
        return (ImageView) this.f61368d.getValue();
    }

    /* renamed from: d */
    private final DmtTextView m76484d() {
        return (DmtTextView) this.f61369e.getValue();
    }

    /* renamed from: e */
    private final DmtTextView m76485e() {
        return (DmtTextView) this.f61370f.getValue();
    }

    /* renamed from: a */
    private final void m76481a(TextView textView) {
        textView.post(new C23309a(this, textView));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.a75);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        m76482a(this.f61366b);
    }

    /* renamed from: a */
    private void m76482a(User user) {
        UrlModel urlModel;
        if (user != null) {
            urlModel = user.getAvatarMedium();
        } else {
            urlModel = null;
        }
        C12133n.m35299a(C23400r.m76741a(urlModel)).mo29842a(new C12089a().mo29781a(true).mo29782a()).mo29844a((C12128i) m76480a()).mo29848a();
        DmtTextView d = m76484d();
        StringBuilder sb = new StringBuilder("@");
        sb.append(C43122ff.m136777h(user));
        d.setText(sb.toString());
        m76483b().setOnClickListener(new C23310b(this));
        m76481a((TextView) m76485e());
        m76485e().setOnClickListener(new C23311c(this));
    }

    public C23308j(Context context, User user) {
        C7573i.m23587b(context, "context");
        super(context, R.style.g9, true, false, false);
        this.f61366b = user;
    }
}
