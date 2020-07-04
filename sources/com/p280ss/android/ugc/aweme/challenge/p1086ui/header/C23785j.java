package com.p280ss.android.ugc.aweme.challenge.p1086ui.header;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23755a.C23756a;
import com.p280ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.j */
public final class C23785j extends C23755a {

    /* renamed from: e */
    public static final C23786a f62784e = new C23786a(null);

    /* renamed from: f */
    private DmtTextView f62785f;

    /* renamed from: g */
    private View f62786g;

    /* renamed from: h */
    private DmtTextView f62787h;

    /* renamed from: i */
    private DmtTextView f62788i;

    /* renamed from: j */
    private DmtTextView f62789j;

    /* renamed from: k */
    private DmtTextView f62790k;

    /* renamed from: l */
    private View f62791l;

    /* renamed from: m */
    private CheckableImageView f62792m;

    /* renamed from: n */
    private DmtTextView f62793n;

    /* renamed from: o */
    private C23768e f62794o;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.j$a */
    public static final class C23786a {
        private C23786a() {
        }

        public /* synthetic */ C23786a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.j$b */
    static final class C23787b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23785j f62795a;

        /* renamed from: b */
        final /* synthetic */ ChallengeTransform f62796b;

        C23787b(C23785j jVar, ChallengeTransform challengeTransform) {
            this.f62795a = jVar;
            this.f62796b = challengeTransform;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f62795a.mo61836a("challenge_transform_button_click");
            if (C23764b.m77913a(this.f62796b.getAction())) {
                String action = this.f62796b.getAction();
                if (action == null) {
                    action = "";
                }
                String a = C23785j.m77966a(action, "ffffff");
                if (!C24671f.m80853c().mo64688a(this.f62795a.getContext(), a, true)) {
                    C24671f.m80853c().mo64687a(this.f62795a.getContext(), a, "");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int getAttrsResId() {
        return R.layout.i0;
    }

    /* access modifiers changed from: protected */
    public final int getLayoutResId() {
        return R.layout.i7;
    }

    /* renamed from: i */
    private final void m77972i() {
        C23768e eVar = this.f62794o;
        if (eVar == null) {
            C7573i.m23583a("collectButtonBlock");
        }
        eVar.mo61804a(getMChallenge(), getMHeaderParam());
    }

    /* renamed from: a */
    public final void mo61769a() {
        C23784i createCommerceHeaderDelegate = ((IChallengeDetailProvider) ServiceManager.get().getService(IChallengeDetailProvider.class)).createCommerceHeaderDelegate();
        C7573i.m23582a((Object) createCommerceHeaderDelegate, "ServiceManager.get().get…eCommerceHeaderDelegate()");
        mo61771a(createCommerceHeaderDelegate);
    }

    /* renamed from: b */
    public final void mo61773b() {
        View findViewById = findViewById(R.id.jd);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.avatar_tag)");
        this.f62785f = (DmtTextView) findViewById;
        m77968e();
        m77969f();
        super.mo61773b();
    }

    /* access modifiers changed from: protected */
    public final int getButtonResId() {
        switch (C23788k.f62797a[getMHeaderParam().f62781c.ordinal()]) {
            case 1:
                return R.layout.i2;
            case 2:
                return R.layout.i3;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: f */
    private final void m77969f() {
        View findViewById = findViewById(R.id.sg);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.button_container)");
        ViewStub viewStub = (ViewStub) findViewById;
        viewStub.setLayoutResource(getButtonResId());
        View inflate = viewStub.inflate();
        View findViewById2 = inflate.findViewById(R.id.y1);
        C7573i.m23582a((Object) findViewById2, "container.findViewById(R.id.collect_container)");
        View findViewById3 = inflate.findViewById(R.id.b7l);
        C7573i.m23582a((Object) findViewById3, "container.findViewById(R.id.iv_collect)");
        this.f62794o = new C23768e(findViewById2, (CheckableImageView) findViewById3, (DmtTextView) inflate.findViewById(R.id.ds2));
        this.f62791l = inflate.findViewById(R.id.dn_);
        if (this.f62791l != null) {
            View findViewById4 = inflate.findViewById(R.id.bd9);
            C7573i.m23582a((Object) findViewById4, "container.findViewById(R.id.iv_transform)");
            this.f62792m = (CheckableImageView) findViewById4;
            View findViewById5 = inflate.findViewById(R.id.e44);
            C7573i.m23582a((Object) findViewById5, "container.findViewById(R.id.tv_transform)");
            this.f62793n = (DmtTextView) findViewById5;
        }
    }

    /* renamed from: g */
    private final void m77970g() {
        if (C23764b.m77913a(getMChallenge().getProfileTagUrl())) {
            DmtTextView dmtTextView = this.f62785f;
            if (dmtTextView == null) {
                C7573i.m23583a("avatarTag");
            }
            dmtTextView.setVisibility(0);
            DmtTextView dmtTextView2 = this.f62785f;
            if (dmtTextView2 == null) {
                C7573i.m23583a("avatarTag");
            }
            dmtTextView2.setText(getMChallenge().getProfileTagUrl());
            return;
        }
        DmtTextView dmtTextView3 = this.f62785f;
        if (dmtTextView3 == null) {
            C7573i.m23583a("avatarTag");
        }
        dmtTextView3.setVisibility(8);
    }

    /* renamed from: h */
    private final void m77971h() {
        boolean z;
        Collection attrs = getMChallenge().getAttrs();
        if (attrs == null || attrs.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View view = this.f62786g;
            if (view == null) {
                C7573i.m23583a("attrsContainer");
            }
            view.setVisibility(4);
            return;
        }
        DmtTextView dmtTextView = this.f62787h;
        if (dmtTextView == null) {
            C7573i.m23583a("attrsFirst");
        }
        m77967a(0, dmtTextView);
        DmtTextView dmtTextView2 = this.f62788i;
        if (dmtTextView2 == null) {
            C7573i.m23583a("attrsSecond");
        }
        m77967a(1, dmtTextView2);
        DmtTextView dmtTextView3 = this.f62789j;
        if (dmtTextView3 == null) {
            C7573i.m23583a("attrsThird");
        }
        m77967a(2, dmtTextView3);
        DmtTextView dmtTextView4 = this.f62790k;
        if (dmtTextView4 == null) {
            C7573i.m23583a("attrsForth");
        }
        m77967a(3, dmtTextView4);
        View view2 = this.f62786g;
        if (view2 == null) {
            C7573i.m23583a("attrsContainer");
        }
        view2.setVisibility(0);
    }

    /* renamed from: j */
    private final void m77973j() {
        if (this.f62791l != null && C23756a.m77904a(getMChallengeDetail())) {
            ChallengeTransform transfrom = getMChallenge().getTransfrom();
            if (transfrom.getIconUrlModel() == null) {
                CheckableImageView checkableImageView = this.f62792m;
                if (checkableImageView == null) {
                    C7573i.m23583a("transformIv");
                }
                checkableImageView.setVisibility(8);
            } else {
                CheckableImageView checkableImageView2 = this.f62792m;
                if (checkableImageView2 == null) {
                    C7573i.m23583a("transformIv");
                }
                C23323e.m76524b(checkableImageView2, transfrom.getIconUrlModel());
            }
            DmtTextView dmtTextView = this.f62793n;
            if (dmtTextView == null) {
                C7573i.m23583a("transformTv");
            }
            dmtTextView.setText(transfrom.getText());
            View view = this.f62791l;
            if (view == null) {
                C7573i.m23580a();
            }
            view.setOnClickListener(new C23787b(this, transfrom));
            mo61836a("challenge_transform_button_show");
        }
    }

    /* renamed from: e */
    private final void m77968e() {
        View findViewById = findViewById(R.id.hd);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.attrs_container)");
        ViewStub viewStub = (ViewStub) findViewById;
        viewStub.setLayoutResource(getAttrsResId());
        View inflate = viewStub.inflate();
        C7573i.m23582a((Object) inflate, "containerVs.apply { layo… = attrsResId }.inflate()");
        this.f62786g = inflate;
        View view = this.f62786g;
        if (view == null) {
            C7573i.m23583a("attrsContainer");
        }
        View findViewById2 = view.findViewById(R.id.he);
        C7573i.m23582a((Object) findViewById2, "attrsContainer.findViewById(R.id.attrs_first)");
        this.f62787h = (DmtTextView) findViewById2;
        View view2 = this.f62786g;
        if (view2 == null) {
            C7573i.m23583a("attrsContainer");
        }
        View findViewById3 = view2.findViewById(R.id.hh);
        C7573i.m23582a((Object) findViewById3, "attrsContainer.findViewById(R.id.attrs_second)");
        this.f62788i = (DmtTextView) findViewById3;
        View view3 = this.f62786g;
        if (view3 == null) {
            C7573i.m23583a("attrsContainer");
        }
        View findViewById4 = view3.findViewById(R.id.hi);
        C7573i.m23582a((Object) findViewById4, "attrsContainer.findViewById(R.id.attrs_third)");
        this.f62789j = (DmtTextView) findViewById4;
        View view4 = this.f62786g;
        if (view4 == null) {
            C7573i.m23583a("attrsContainer");
        }
        View findViewById5 = view4.findViewById(R.id.hf);
        C7573i.m23582a((Object) findViewById5, "attrsContainer.findViewById(R.id.attrs_forth)");
        this.f62790k = (DmtTextView) findViewById5;
    }

    /* renamed from: a */
    public final void mo61770a(ChallengeDetail challengeDetail) {
        C7573i.m23587b(challengeDetail, "data");
        if (challengeDetail.challenge != null) {
            super.mo61770a(challengeDetail);
            m77970g();
            m77971h();
            m77972i();
            m77973j();
        }
    }

    /* renamed from: a */
    public final void mo61836a(String str) {
        C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("challenge_id", getMChallenge().getCid()).mo59970a("content_type", getMChallenge().getContentType()).f60753a);
    }

    /* renamed from: a */
    public static String m77966a(String str, String str2) {
        if (C23764b.m77913a(str)) {
            str = Uri.parse(str).buildUpon().appendQueryParameter("bundle_webview_background", str2).build().toString();
        }
        C7573i.m23582a((Object) str, "if (url.isNotNullOrEmpty… else {\n        url\n    }");
        return str;
    }

    /* renamed from: a */
    private final void m77967a(int i, DmtTextView dmtTextView) {
        List attrs = getMChallenge().getAttrs();
        int size = attrs.size() - (4 - i);
        if (size >= 0) {
            dmtTextView.setVisibility(0);
            dmtTextView.setText((CharSequence) attrs.get(size));
            return;
        }
        dmtTextView.setVisibility(4);
    }

    private C23785j(Context context, C23783h hVar, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, hVar, attributeSet);
    }

    public /* synthetic */ C23785j(Context context, C23783h hVar, AttributeSet attributeSet, int i, C7571f fVar) {
        this(context, hVar, null);
    }
}
