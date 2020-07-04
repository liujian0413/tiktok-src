package com.p280ss.android.ugc.aweme.challenge.p1086ui.header;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.C23747b;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.C23793i;
import com.p280ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7585d;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.l */
public final class C23789l extends C23755a {

    /* renamed from: e */
    private DmtTextView f62798e;

    /* renamed from: f */
    private DmtTextView f62799f;

    /* renamed from: g */
    private View f62800g;

    /* renamed from: h */
    private View f62801h;

    /* renamed from: i */
    private View f62802i;

    /* renamed from: j */
    private DmtTextView f62803j;

    /* renamed from: k */
    private ViewGroup f62804k;

    /* renamed from: l */
    private DmtTextView f62805l;

    /* renamed from: m */
    private DmtTextView f62806m;

    /* renamed from: n */
    private ImageView f62807n;

    /* renamed from: o */
    private View f62808o;

    /* renamed from: p */
    private C23768e f62809p;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.l$a */
    static final /* synthetic */ class C23790a extends FunctionReference implements C7561a<C7581n> {
        C23790a(C23789l lVar) {
            super(0, lVar);
        }

        public final String getName() {
            return "relayoutButton";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C23789l.class);
        }

        public final String getSignature() {
            return "relayoutButton()V";
        }

        /* renamed from: a */
        private void m77987a() {
            ((C23789l) this.receiver).mo61838e();
        }

        public final /* synthetic */ Object invoke() {
            m77987a();
            return C7581n.f20898a;
        }
    }

    /* access modifiers changed from: protected */
    public final int getLayoutResId() {
        return R.layout.i8;
    }

    /* renamed from: b */
    public final void mo61773b() {
        m77978f();
        m77979g();
        super.mo61773b();
    }

    /* renamed from: a */
    public final void mo61769a() {
        C23784i createCommerceHeaderDelegate = ((IChallengeDetailProvider) ServiceManager.get().getService(IChallengeDetailProvider.class)).createCommerceHeaderDelegate();
        C7573i.m23582a((Object) createCommerceHeaderDelegate, "ServiceManager.get().get…eCommerceHeaderDelegate()");
        mo61771a(createCommerceHeaderDelegate);
    }

    /* renamed from: j */
    private final void m77982j() {
        C23768e eVar = this.f62809p;
        if (eVar == null) {
            C7573i.m23583a("mCollectButtonBlock");
        }
        eVar.mo61804a(getMChallenge(), getMHeaderParam());
        View view = this.f62801h;
        if (view == null) {
            C7573i.m23583a("mButtonContainer");
        }
        view.post(new C23792n(new C23790a(this)));
    }

    /* access modifiers changed from: protected */
    public final int getAttrsResId() {
        switch (C23791m.f62810a[getMHeaderParam().f62780b.ordinal()]) {
            case 1:
                return R.layout.i1;
            case 2:
                return R.layout.i1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: protected */
    public final int getButtonResId() {
        switch (C23791m.f62811b[getMHeaderParam().f62781c.ordinal()]) {
            case 1:
                return R.layout.i2;
            case 2:
                return R.layout.i3;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: f */
    private final void m77978f() {
        View findViewById = findViewById(R.id.hd);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.attrs_container)");
        ViewStub viewStub = (ViewStub) findViewById;
        viewStub.setLayoutResource(getAttrsResId());
        View inflate = viewStub.inflate();
        View findViewById2 = inflate.findViewById(R.id.hg);
        C7573i.m23582a((Object) findViewById2, "container.findViewById(R.id.attrs_link)");
        this.f62798e = (DmtTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.he);
        C7573i.m23582a((Object) findViewById3, "container.findViewById(R.id.attrs_first)");
        this.f62799f = (DmtTextView) findViewById3;
        C7573i.m23582a((Object) inflate, "container");
        this.f62800g = inflate;
    }

    /* renamed from: g */
    private final void m77979g() {
        View findViewById = findViewById(R.id.sg);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.button_container)");
        ViewStub viewStub = (ViewStub) findViewById;
        viewStub.setLayoutResource(getButtonResId());
        View inflate = viewStub.inflate();
        View findViewById2 = inflate.findViewById(R.id.y1);
        C7573i.m23582a((Object) findViewById2, "container.findViewById(R.id.collect_container)");
        View findViewById3 = inflate.findViewById(R.id.b7l);
        C7573i.m23582a((Object) findViewById3, "container.findViewById(R.id.iv_collect)");
        this.f62809p = new C23768e(findViewById2, (CheckableImageView) findViewById3, (DmtTextView) inflate.findViewById(R.id.ds2));
        C7573i.m23582a((Object) inflate, "container");
        this.f62801h = inflate;
    }

    /* renamed from: h */
    private final void m77980h() {
        if (!C6399b.m19944t()) {
            Challenge mChallenge = getMChallenge();
            DmtTextView dmtTextView = this.f62798e;
            if (dmtTextView == null) {
                C7573i.m23583a("mAttrsLink");
            }
            C23793i.m77996a(mChallenge, (TextView) dmtTextView);
        }
        DmtTextView dmtTextView2 = this.f62799f;
        if (dmtTextView2 == null) {
            C7573i.m23583a("mAttrsFirst");
        }
        dmtTextView2.setText(getContext().getString(R.string.zb, new Object[]{C30537o.m99738a(getMChallenge().getDisplayCount())}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61838e() {
        /*
            r8 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.view.View r3 = r8.f62800g
            if (r3 != 0) goto L_0x0018
            java.lang.String r4 = "mAttrsContainer"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0018:
            r3.getGlobalVisibleRect(r0)
            android.view.View r3 = r8.f62801h
            if (r3 != 0) goto L_0x0024
            java.lang.String r4 = "mButtonContainer"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0024:
            r3.getGlobalVisibleRect(r1)
            com.bytedance.lighten.loader.SmartImageView r3 = r8.getMAvatar()
            r3.getGlobalVisibleRect(r2)
            int r1 = r1.top
            int r3 = r0.bottom
            int r1 = r1 - r3
            android.view.View r3 = r8.f62801h
            if (r3 != 0) goto L_0x003c
            java.lang.String r4 = "mButtonContainer"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x003c:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x009a
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            r4 = 4620693217682128896(0x4020000000000000, double:8.0)
            int r4 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r4)
            r5 = 8
            r6 = 3
            r7 = 0
            if (r1 < r4) goto L_0x0070
            int r1 = r2.bottom
            int r0 = r0.bottom
            android.view.View r2 = r8.f62801h
            if (r2 != 0) goto L_0x005d
            java.lang.String r4 = "mButtonContainer"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x005d:
            int r2 = r2.getHeight()
            int r0 = r0 + r2
            if (r1 <= r0) goto L_0x0070
            r0 = 2131296591(0x7f09014f, float:1.8211103E38)
            r3.addRule(r5, r0)
            r3.addRule(r6, r7)
            r3.topMargin = r7
            goto L_0x008b
        L_0x0070:
            android.view.View r0 = r8.f62800g
            if (r0 != 0) goto L_0x0079
            java.lang.String r1 = "mAttrsContainer"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0079:
            int r0 = r0.getId()
            r3.addRule(r6, r0)
            r3.addRule(r5, r7)
            r0 = 4625759767262920704(0x4032000000000000, double:18.0)
            int r0 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r0)
            r3.topMargin = r0
        L_0x008b:
            android.view.View r0 = r8.f62801h
            if (r0 != 0) goto L_0x0094
            java.lang.String r1 = "mButtonContainer"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0094:
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r0.setLayoutParams(r3)
            return
        L_0x009a:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23789l.mo61838e():void");
    }

    /* renamed from: i */
    private final void m77981i() {
        CharSequence charSequence;
        if (C6399b.m19944t()) {
            ChallengeAnnouncement challengeAnnouncement = getMChallenge().getChallengeAnnouncement();
            String str = null;
            if (challengeAnnouncement != null) {
                charSequence = challengeAnnouncement.getTitle();
            } else {
                charSequence = null;
            }
            if (challengeAnnouncement != null) {
                str = challengeAnnouncement.getContent();
            }
            int i = 8;
            if (challengeAnnouncement != null) {
                CharSequence charSequence2 = charSequence;
                if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(str)) {
                    if (this.f62802i == null) {
                        View inflate = ((ViewStub) findViewById(R.id.eem)).inflate();
                        if (inflate != null) {
                            this.f62802i = (ViewGroup) inflate;
                            View findViewById = findViewById(R.id.ud);
                            C7573i.m23582a((Object) findViewById, "findViewById(R.id.challenge_announcement_title)");
                            this.f62803j = (DmtTextView) findViewById;
                            View findViewById2 = findViewById(R.id.ub);
                            C7573i.m23582a((Object) findViewById2, "findViewById(R.id.challe…ncement_expand_container)");
                            this.f62804k = (ViewGroup) findViewById2;
                            View findViewById3 = findViewById(R.id.u_);
                            C7573i.m23582a((Object) findViewById3, "findViewById(R.id.challenge_announcement_desc)");
                            this.f62805l = (DmtTextView) findViewById3;
                            View findViewById4 = findViewById(R.id.ua);
                            C7573i.m23582a((Object) findViewById4, "findViewById(R.id.challenge_announcement_expand)");
                            this.f62806m = (DmtTextView) findViewById4;
                            View findViewById5 = findViewById(R.id.uc);
                            C7573i.m23582a((Object) findViewById5, "findViewById(R.id.challe…e_announcement_expand_iv)");
                            this.f62807n = (ImageView) findViewById5;
                            View findViewById6 = findViewById(R.id.bm8);
                            C7573i.m23582a((Object) findViewById6, "findViewById(R.id.line_divider)");
                            this.f62808o = findViewById6;
                            if (C6399b.m19947w()) {
                                DmtTextView dmtTextView = this.f62803j;
                                if (dmtTextView == null) {
                                    C7573i.m23583a("mAnnounceTitle");
                                }
                                dmtTextView.setTextColor(getResources().getColor(R.color.a3q));
                                View view = this.f62808o;
                                if (view == null) {
                                    C7573i.m23583a("mAnnounceDivider");
                                }
                                view.setBackgroundColor(getResources().getColor(R.color.g4));
                            } else if (C6399b.m19946v()) {
                                ImageView imageView = this.f62807n;
                                if (imageView == null) {
                                    C7573i.m23583a("mAnnounceExpandIv");
                                }
                                imageView.setImageDrawable(getResources().getDrawable(R.drawable.ar5));
                            }
                            DmtTextView dmtTextView2 = this.f62803j;
                            if (dmtTextView2 == null) {
                                C7573i.m23583a("mAnnounceTitle");
                            }
                            dmtTextView2.setFontType(C10834d.f29332b);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                    }
                    View view2 = this.f62808o;
                    if (view2 == null) {
                        C7573i.m23583a("mAnnounceDivider");
                    }
                    if (!TextUtils.isEmpty(getMChallenge().getDesc())) {
                        i = 0;
                    }
                    view2.setVisibility(i);
                    DmtTextView dmtTextView3 = this.f62803j;
                    if (dmtTextView3 == null) {
                        C7573i.m23583a("mAnnounceTitle");
                    }
                    dmtTextView3.setText(charSequence2);
                    View view3 = this.f62802i;
                    if (view3 == null) {
                        C7573i.m23580a();
                    }
                    view3.setVisibility(0);
                    Challenge mChallenge = getMChallenge();
                    DmtTextView dmtTextView4 = this.f62805l;
                    if (dmtTextView4 == null) {
                        C7573i.m23583a("mAnnounceContent");
                    }
                    TextView textView = dmtTextView4;
                    ViewGroup viewGroup = this.f62804k;
                    if (viewGroup == null) {
                        C7573i.m23583a("mAnnounceExpandContainer");
                    }
                    DmtTextView dmtTextView5 = this.f62806m;
                    if (dmtTextView5 == null) {
                        C7573i.m23583a("mAnnounceExpandTv");
                    }
                    TextView textView2 = dmtTextView5;
                    ImageView imageView2 = this.f62807n;
                    if (imageView2 == null) {
                        C7573i.m23583a("mAnnounceExpandIv");
                    }
                    C23747b.m77880a(mChallenge, textView, viewGroup, textView2, imageView2, true);
                    return;
                }
            }
            View view4 = this.f62802i;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo61770a(ChallengeDetail challengeDetail) {
        C7573i.m23587b(challengeDetail, "data");
        if (challengeDetail.challenge != null) {
            super.mo61770a(challengeDetail);
            m77980h();
            m77982j();
            m77981i();
        }
    }

    private C23789l(Context context, C23783h hVar, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, hVar, attributeSet);
    }

    public /* synthetic */ C23789l(Context context, C23783h hVar, AttributeSet attributeSet, int i, C7571f fVar) {
        this(context, hVar, null);
    }
}
