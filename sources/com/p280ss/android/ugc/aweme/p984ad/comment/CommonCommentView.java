package com.p280ss.android.ugc.aweme.p984ad.comment;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.p984ad.comment.AdCommentReportBubbleView.C22389a;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22377b;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22381f;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22384i;
import com.p280ss.android.ugc.aweme.p984ad.p986b.C22386b;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.CommonCommentView */
public final class CommonCommentView extends LinearLayout implements C0053p<C23083a>, OnClickListener {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f59750a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommonCommentView.class), "downloadStatusChangeListener", "getDownloadStatusChangeListener()Lcom/ss/android/ugc/aweme/ad/comment/CommonCommentView$CommentDownloadStatusChangeListener;"))};

    /* renamed from: b */
    public LinkData f59751b;

    /* renamed from: c */
    public Aweme f59752c;

    /* renamed from: d */
    public DmtTextView f59753d;

    /* renamed from: e */
    public DmtTextView f59754e;

    /* renamed from: f */
    public C35481c f59755f;

    /* renamed from: g */
    public C22386b f59756g;

    /* renamed from: h */
    public final float f59757h;

    /* renamed from: i */
    private CircleImageView f59758i;

    /* renamed from: j */
    private DmtTextView f59759j;

    /* renamed from: k */
    private DmtTextView f59760k;

    /* renamed from: l */
    private DmtTextView f59761l;

    /* renamed from: m */
    private final C7541d f59762m;

    /* renamed from: n */
    private boolean f59763n;

    /* renamed from: o */
    private DataCenter f59764o;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommonCommentView$a */
    final class C22398a implements C19388d {
        /* renamed from: a */
        public final void mo51374a(C19387c cVar, C19384a aVar) {
            C7573i.m23587b(cVar, "downloadModel");
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003d A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo51373a() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.ad.comment.CommonCommentView r0 = com.p280ss.android.ugc.aweme.p984ad.comment.CommonCommentView.this
                com.ss.android.ugc.aweme.commercialize.model.LinkData r0 = r0.f59751b
                if (r0 == 0) goto L_0x0009
                java.lang.String r0 = r0.buttonText
                goto L_0x000a
            L_0x0009:
                r0 = 0
            L_0x000a:
                if (r0 == 0) goto L_0x0024
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r1 = r0.length()
                r2 = 1
                if (r1 <= 0) goto L_0x0017
                r1 = 1
                goto L_0x0018
            L_0x0017:
                r1 = 0
            L_0x0018:
                if (r1 != r2) goto L_0x0024
                com.ss.android.ugc.aweme.ad.comment.CommonCommentView r1 = com.p280ss.android.ugc.aweme.p984ad.comment.CommonCommentView.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.f59753d
                if (r1 == 0) goto L_0x0030
                r1.setText(r0)
                goto L_0x0030
            L_0x0024:
                com.ss.android.ugc.aweme.ad.comment.CommonCommentView r0 = com.p280ss.android.ugc.aweme.p984ad.comment.CommonCommentView.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f59753d
                if (r0 == 0) goto L_0x0030
                r1 = 2131822723(0x7f110883, float:1.9278225E38)
                r0.setText(r1)
            L_0x0030:
                com.ss.android.ugc.aweme.ad.comment.CommonCommentView r0 = com.p280ss.android.ugc.aweme.p984ad.comment.CommonCommentView.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f59753d
                if (r0 == 0) goto L_0x003d
                r1 = 2131231076(0x7f080164, float:1.8078223E38)
                r0.setBackgroundResource(r1)
                return
            L_0x003d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p984ad.comment.CommonCommentView.C22398a.mo51373a():void");
        }

        public C22398a() {
        }

        /* renamed from: a */
        public final void mo51375a(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            DmtTextView dmtTextView = CommonCommentView.this.f59753d;
            if (dmtTextView != null) {
                dmtTextView.setText(R.string.db6);
            }
        }

        /* renamed from: b */
        public final void mo51377b(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            DmtTextView dmtTextView = CommonCommentView.this.f59753d;
            if (dmtTextView != null) {
                dmtTextView.setText(R.string.e5);
            }
        }

        /* renamed from: c */
        public final void mo51379c(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            DmtTextView dmtTextView = CommonCommentView.this.f59753d;
            if (dmtTextView != null) {
                dmtTextView.setBackgroundResource(R.drawable.ix);
            }
            DmtTextView dmtTextView2 = CommonCommentView.this.f59753d;
            if (dmtTextView2 != null) {
                dmtTextView2.setText(R.string.jd);
            }
        }

        /* renamed from: b */
        public final void mo51378b(C19400e eVar, int i) {
            C7573i.m23587b(eVar, "shortInfo");
            DmtTextView dmtTextView = CommonCommentView.this.f59753d;
            if (dmtTextView != null) {
                dmtTextView.setText(R.string.css);
            }
        }

        /* renamed from: a */
        public final void mo51376a(C19400e eVar, int i) {
            C7573i.m23587b(eVar, "shortInfo");
            String a = C1642a.m8034a("%d%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), "%"}, 2));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            DmtTextView dmtTextView = CommonCommentView.this.f59753d;
            if (dmtTextView != null) {
                dmtTextView.setText(a);
            }
            DmtTextView dmtTextView2 = CommonCommentView.this.f59753d;
            if (dmtTextView2 != null) {
                dmtTextView2.setBackgroundResource(R.drawable.iz);
            }
            DmtTextView dmtTextView3 = CommonCommentView.this.f59754e;
            if (dmtTextView3 != null) {
                LayoutParams layoutParams = dmtTextView3.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (int) (((float) i) * 0.01f * CommonCommentView.this.f59757h);
                }
            }
            DmtTextView dmtTextView4 = CommonCommentView.this.f59754e;
            if (dmtTextView4 != null) {
                dmtTextView4.requestLayout();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommonCommentView$b */
    static final class C22399b extends Lambda implements C7561a<C22398a> {

        /* renamed from: a */
        final /* synthetic */ CommonCommentView f59766a;

        C22399b(CommonCommentView commonCommentView) {
            this.f59766a = commonCommentView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C22398a invoke() {
            return new C22398a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.CommonCommentView$c */
    public static final class C22400c implements C22389a {

        /* renamed from: a */
        final /* synthetic */ CommonCommentView f59767a;

        /* renamed from: a */
        public final void mo58883a() {
            C35481c cVar = this.f59767a.f59755f;
            if (cVar != null) {
                cVar.mo90261b();
            }
            C22386b bVar = this.f59767a.f59756g;
            if (bVar != null) {
                bVar.mo58878a(true);
            }
        }

        /* renamed from: b */
        public final void mo58884b() {
            String str;
            C22375a a = C22375a.m74074a();
            C7573i.m23582a((Object) a, "AdDependManager.inst()");
            C22384i iVar = a.f59714h;
            Context context = this.f59767a.getContext();
            C22375a a2 = C22375a.m74074a();
            C7573i.m23582a((Object) a2, "AdDependManager.inst()");
            C22377b bVar = a2.f59709c;
            C7573i.m23582a((Object) bVar, "AdDependManager.inst().abOrSettingDepend");
            String a3 = bVar.mo58840a();
            LinkData linkData = this.f59767a.f59751b;
            if (linkData != null) {
                str = linkData.webUrl;
            } else {
                str = null;
            }
            iVar.mo58875a(context, a3, str);
            this.f59767a.mo58904a("comment_ad", "otherclick", "plan");
        }

        /* renamed from: c */
        public final void mo58885c() {
            String str;
            C22375a a = C22375a.m74074a();
            C7573i.m23582a((Object) a, "AdDependManager.inst()");
            C22384i iVar = a.f59714h;
            Context context = this.f59767a.getContext();
            Aweme aweme = this.f59767a.f59752c;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            iVar.mo58874a(context, str);
        }

        C22400c(CommonCommentView commonCommentView) {
            this.f59767a = commonCommentView;
        }
    }

    public CommonCommentView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final C22398a getDownloadStatusChangeListener() {
        return (C22398a) this.f59762m.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m74205l();
    }

    /* renamed from: b */
    private final void m74195b() {
        m74196c();
        m74197d();
        m74198e();
        m74199f();
        m74200g();
        m74204k();
    }

    /* renamed from: e */
    private final void m74198e() {
        String str;
        DmtTextView dmtTextView = this.f59760k;
        if (dmtTextView != null) {
            LinkData linkData = this.f59751b;
            if (linkData != null) {
                str = linkData.title;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
    }

    /* renamed from: f */
    private final void m74199f() {
        String str;
        DmtTextView dmtTextView = this.f59761l;
        if (dmtTextView != null) {
            LinkData linkData = this.f59751b;
            if (linkData != null) {
                str = linkData.tipsText;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
    }

    /* renamed from: g */
    private final void m74200g() {
        String str;
        DmtTextView dmtTextView = this.f59753d;
        if (dmtTextView != null) {
            LinkData linkData = this.f59751b;
            if (linkData != null) {
                str = linkData.buttonText;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
        C34626j.m111876a(this.f59753d);
    }

    /* renamed from: h */
    private final void m74201h() {
        C22375a a = C22375a.m74074a();
        C7573i.m23582a((Object) a, "AdDependManager.inst()");
        a.f59714h.mo58872a(getContext(), this.f59751b, this.f59752c);
    }

    /* renamed from: c */
    private final void m74196c() {
        String str;
        DmtTextView dmtTextView = this.f59759j;
        if (dmtTextView != null) {
            LinkData linkData = this.f59751b;
            if (linkData != null) {
                str = linkData.source;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
        DmtTextView dmtTextView2 = this.f59759j;
        if (dmtTextView2 != null) {
            dmtTextView2.setFontType(C10834d.f29332b);
        }
        DmtTextView dmtTextView3 = this.f59759j;
        if (dmtTextView3 != null) {
            TextPaint paint = dmtTextView3.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
    }

    /* renamed from: j */
    private final boolean m74203j() {
        CharSequence charSequence;
        LinkData linkData = this.f59751b;
        String str = null;
        if (linkData != null) {
            charSequence = linkData.downloadUrl;
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            LinkData linkData2 = this.f59751b;
            if (linkData2 != null) {
                str = linkData2.type;
            }
            if (TextUtils.equals(str, "app")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    private final void m74205l() {
        String str;
        if (m74203j() && this.f59763n) {
            C22375a a = C22375a.m74074a();
            C7573i.m23582a((Object) a, "AdDependManager.inst()");
            C22381f fVar = a.f59707a;
            C7573i.m23582a((Object) fVar, "AdDependManager.inst().downloadDepend");
            C19535g a2 = fVar.mo58870a();
            LinkData linkData = this.f59751b;
            if (linkData != null) {
                str = linkData.downloadUrl;
            } else {
                str = null;
            }
            a2.mo51669a(str, hashCode());
            this.f59763n = false;
        }
    }

    /* renamed from: d */
    private final void m74197d() {
        UrlModel urlModel;
        CircleImageView circleImageView = this.f59758i;
        if (circleImageView != null) {
            C13438a aVar = (C13438a) circleImageView.getHierarchy();
            if (aVar != null) {
                RoundingParams roundingParams = aVar.f35619a;
                if (roundingParams != null) {
                    roundingParams.mo32886c((float) C23486n.m77122a(0.5d));
                }
            }
        }
        CircleImageView circleImageView2 = this.f59758i;
        if (circleImageView2 != null) {
            C13438a aVar2 = (C13438a) circleImageView2.getHierarchy();
            if (aVar2 != null) {
                RoundingParams roundingParams2 = aVar2.f35619a;
                if (roundingParams2 != null) {
                    roundingParams2.mo32885b(C0683b.m2912c(getContext(), R.color.li));
                }
            }
        }
        RemoteImageView remoteImageView = this.f59758i;
        LinkData linkData = this.f59751b;
        if (linkData != null) {
            urlModel = linkData.avatarIcon;
        } else {
            urlModel = null;
        }
        C23323e.m76524b(remoteImageView, urlModel);
    }

    /* renamed from: a */
    private final void m74193a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.u4, this);
        this.f59759j = (DmtTextView) inflate.findViewById(R.id.title);
        this.f59758i = (CircleImageView) inflate.findViewById(R.id.ic);
        this.f59760k = (DmtTextView) inflate.findViewById(R.id.a1q);
        this.f59761l = (DmtTextView) inflate.findViewById(R.id.bn0);
        this.f59753d = (DmtTextView) inflate.findViewById(R.id.dnf);
        this.f59754e = (DmtTextView) inflate.findViewById(R.id.dn9);
        DmtTextView dmtTextView = this.f59753d;
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(this);
        }
        DmtTextView dmtTextView2 = this.f59761l;
        if (dmtTextView2 != null) {
            dmtTextView2.setOnClickListener(this);
        }
        CircleImageView circleImageView = this.f59758i;
        if (circleImageView != null) {
            circleImageView.setOnClickListener(this);
        }
        DmtTextView dmtTextView3 = this.f59759j;
        if (dmtTextView3 != null) {
            dmtTextView3.setOnClickListener(this);
        }
        DmtTextView dmtTextView4 = this.f59760k;
        if (dmtTextView4 != null) {
            dmtTextView4.setOnClickListener(this);
        }
        setOnClickListener(this);
    }

    /* renamed from: i */
    private final void m74202i() {
        if (this.f59755f == null) {
            this.f59755f = new C35481c(C6405d.m19984g());
        }
        int b = (int) C9738o.m28708b(getContext(), 104.0f);
        int b2 = (int) C9738o.m28708b(getContext(), 138.0f);
        C35481c cVar = this.f59755f;
        if (cVar != null) {
            cVar.f93104l = 0;
        }
        C35481c cVar2 = this.f59755f;
        if (cVar2 != null) {
            cVar2.f93105m = 0;
        }
        C35481c cVar3 = this.f59755f;
        if (cVar3 != null) {
            cVar3.f93102j = -1;
        }
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        AdCommentReportBubbleView adCommentReportBubbleView = new AdCommentReportBubbleView(context, null, 0, 6, null);
        LinkData linkData = this.f59751b;
        if (linkData == null) {
            C7573i.m23580a();
        }
        Aweme aweme = this.f59752c;
        if (aweme == null) {
            C7573i.m23580a();
        }
        adCommentReportBubbleView.mo58880a(linkData, aweme);
        adCommentReportBubbleView.setInnerClick(new C22400c(this));
        C35481c cVar4 = this.f59755f;
        if (cVar4 != null) {
            cVar4.mo90274e(C0683b.m2912c(getContext(), R.color.cp));
        }
        C35481c cVar5 = this.f59755f;
        if (cVar5 != null) {
            cVar5.mo90254a((View) adCommentReportBubbleView);
        }
        C35481c cVar6 = this.f59755f;
        if (cVar6 != null) {
            cVar6.mo90251a(b, b2);
        }
        C35481c cVar7 = this.f59755f;
        if (cVar7 != null) {
            cVar7.mo90273e();
        }
        C35481c cVar8 = this.f59755f;
        if (cVar8 != null) {
            cVar8.mo90265b((View) this.f59761l);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m74204k() {
        /*
            r5 = this;
            r5.m74205l()
            boolean r0 = r5.m74203j()
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            boolean r0 = r5.f59763n
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            com.ss.android.c.a.a.c$a r0 = new com.ss.android.c.a.a.c$a
            r0.<init>()
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = r5.f59751b
            r2 = 0
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = r1.creativeId
            if (r1 == 0) goto L_0x0026
            long r3 = java.lang.Long.parseLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0027
        L_0x0026:
            r1 = r2
        L_0x0027:
            if (r1 != 0) goto L_0x002c
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x002c:
            long r3 = r1.longValue()
            com.ss.android.c.a.a.c$a r0 = r0.mo51019a(r3)
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = r5.f59751b
            if (r1 == 0) goto L_0x003b
            java.lang.String r1 = r1.logExtra
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            com.ss.android.c.a.a.c$a r0 = r0.mo51021a(r1)
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = r5.f59751b
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = r1.downloadUrl
            goto L_0x0048
        L_0x0047:
            r1 = r2
        L_0x0048:
            com.ss.android.c.a.a.c$a r0 = r0.mo51030d(r1)
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = r5.f59751b
            if (r1 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.clickTrackUrlList
            if (r1 == 0) goto L_0x0059
            java.util.List r1 = r1.getUrlList()
            goto L_0x005a
        L_0x0059:
            r1 = r2
        L_0x005a:
            com.ss.android.c.a.a.c$a r0 = r0.mo51022a(r1)
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = r5.f59751b
            if (r1 == 0) goto L_0x0064
            java.lang.String r2 = r1.packageName
        L_0x0064:
            com.ss.android.c.a.a.c$a r0 = r0.mo51028b(r2)
            com.ss.android.c.a.a.c r0 = r0.mo51026a()
            r1 = 1
            r5.f59763n = r1
            com.ss.android.ugc.aweme.ad.a.a r1 = com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a.m74074a()
            java.lang.String r2 = "AdDependManager.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.ad.a.f r1 = r1.f59707a
            java.lang.String r2 = "AdDependManager.inst().downloadDepend"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.downloadlib.g r1 = r1.mo58870a()
            android.content.Context r2 = r5.getContext()
            int r3 = r5.hashCode()
            com.ss.android.ugc.aweme.ad.comment.CommonCommentView$a r4 = r5.getDownloadStatusChangeListener()
            com.ss.android.download.api.b.d r4 = (com.p280ss.android.download.api.p858b.C19388d) r4
            com.ss.android.download.api.b.c r0 = (com.p280ss.android.download.api.p858b.C19387c) r0
            r1.mo51666a(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p984ad.comment.CommonCommentView.m74204k():void");
    }

    public final void setOnDislikeCommentAdListener(C22386b bVar) {
        C7573i.m23587b(bVar, "dislikeCommentAdListener");
        this.f59756g = bVar;
    }

    public final void setDataCenter(DataCenter dataCenter) {
        this.f59764o = dataCenter;
        if (dataCenter != null) {
            C0053p pVar = this;
            dataCenter.mo60133a("comment_aweme_and_link", pVar, true).mo60133a("comment_dialog_state", pVar, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            int hashCode = str.hashCode();
            if (hashCode != -2103039046) {
                if (hashCode == 1823087802 && str.equals("comment_dialog_state")) {
                    Object obj = (Integer) aVar.mo60161a();
                    if (obj == null) {
                        obj = Boolean.valueOf(false);
                    }
                    if (C7573i.m23585a(obj, (Object) Integer.valueOf(5))) {
                        C35481c cVar = this.f59755f;
                        if (cVar != null) {
                            cVar.mo90261b();
                        }
                    } else if (C7573i.m23585a(obj, (Object) Integer.valueOf(3))) {
                        C35481c cVar2 = this.f59755f;
                        if (cVar2 != null) {
                            cVar2.mo90261b();
                        }
                    } else if (C7573i.m23585a(obj, (Object) Integer.valueOf(6))) {
                        C35481c cVar3 = this.f59755f;
                        if (cVar3 != null) {
                            cVar3.mo90261b();
                        }
                    } else if (C7573i.m23585a(obj, (Object) Integer.valueOf(7))) {
                        m74204k();
                    } else if (C7573i.m23585a(obj, (Object) Integer.valueOf(8))) {
                        m74205l();
                    }
                }
            } else if (str.equals("comment_aweme_and_link")) {
                Pair pair = (Pair) aVar.mo60161a();
                if (pair != null) {
                    Aweme aweme = (Aweme) pair.getFirst();
                    if (aweme != null) {
                        this.f59752c = aweme;
                        Pair pair2 = (Pair) aVar.mo60161a();
                        if (pair2 != null) {
                            LinkData linkData = (LinkData) pair2.getSecond();
                            if (linkData != null) {
                                this.f59751b = linkData;
                                LinkData linkData2 = this.f59751b;
                                if (linkData2 == null) {
                                    C7573i.m23580a();
                                }
                                Aweme aweme2 = this.f59752c;
                                if (aweme2 == null) {
                                    C7573i.m23580a();
                                }
                                mo58903a(linkData2, aweme2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r9)
            java.lang.String r0 = "v"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            int r9 = r9.getId()
            r0 = 2131302256(0x7f091770, float:1.8222593E38)
            if (r9 != r0) goto L_0x0092
            com.ss.android.ugc.aweme.commercialize.model.LinkData r9 = r8.f59751b
            r0 = 0
            if (r9 == 0) goto L_0x0023
            java.lang.String r9 = r9.creativeId
            if (r9 == 0) goto L_0x0023
            long r1 = java.lang.Long.parseLong(r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            goto L_0x0024
        L_0x0023:
            r9 = r0
        L_0x0024:
            if (r9 != 0) goto L_0x0029
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0029:
            long r3 = r9.longValue()
            boolean r9 = r8.m74203j()
            if (r9 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r9 = new com.ss.android.ugc.aweme.feed.model.AwemeRawAd
            r9.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r9.setCreativeId(r1)
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = r8.f59751b
            if (r1 == 0) goto L_0x0046
            java.lang.String r1 = r1.logExtra
            goto L_0x0047
        L_0x0046:
            r1 = r0
        L_0x0047:
            r9.setLogExtra(r1)
            com.ss.android.ugc.aweme.ad.a.a r1 = com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a.m74074a()
            java.lang.String r2 = "AdDependManager.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.ad.a.f r1 = r1.f59707a
            java.lang.String r2 = "comment_ad"
            java.lang.String r5 = "button"
            com.ss.android.download.api.b.b r6 = r1.mo58869a(r2, r9, r5)
            com.ss.android.ugc.aweme.ad.a.a r9 = com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a.m74074a()
            java.lang.String r1 = "AdDependManager.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            com.ss.android.ugc.aweme.ad.a.f r9 = r9.f59707a
            java.lang.String r1 = "AdDependManager.inst().downloadDepend"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            com.ss.android.downloadlib.g r1 = r9.mo58870a()
            com.ss.android.ugc.aweme.commercialize.model.LinkData r9 = r8.f59751b
            if (r9 == 0) goto L_0x0077
            java.lang.String r0 = r9.downloadUrl
        L_0x0077:
            r2 = r0
            r5 = 2
            r7 = 0
            r1.mo51670a(r2, r3, r5, r6, r7)
            return
        L_0x007e:
            r8.m74201h()
            com.ss.android.ugc.aweme.poi.widget.c r9 = r8.f59755f
            if (r9 == 0) goto L_0x0088
            r9.mo90261b()
        L_0x0088:
            java.lang.String r9 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "button"
            r8.mo58904a(r9, r0, r1)
            return
        L_0x0092:
            r0 = 2131299500(0x7f090cac, float:1.8217003E38)
            if (r9 != r0) goto L_0x00a4
            r8.m74202i()
            java.lang.String r9 = "comment_ad"
            java.lang.String r0 = "otherclick"
            java.lang.String r1 = "adtag"
            r8.mo58904a(r9, r0, r1)
            return
        L_0x00a4:
            r0 = 2131296591(0x7f09014f, float:1.8211103E38)
            if (r9 != r0) goto L_0x00be
            java.lang.String r9 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "photo"
            r8.mo58904a(r9, r0, r1)
            r8.m74201h()
            com.ss.android.ugc.aweme.poi.widget.c r9 = r8.f59755f
            if (r9 == 0) goto L_0x00bd
            r9.mo90261b()
            goto L_0x0106
        L_0x00bd:
            return
        L_0x00be:
            r0 = 2131297308(0x7f09041c, float:1.8212557E38)
            if (r9 != r0) goto L_0x00d8
            java.lang.String r9 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "title"
            r8.mo58904a(r9, r0, r1)
            r8.m74201h()
            com.ss.android.ugc.aweme.poi.widget.c r9 = r8.f59755f
            if (r9 == 0) goto L_0x00d7
            r9.mo90261b()
            goto L_0x0106
        L_0x00d7:
            return
        L_0x00d8:
            r0 = 2131302118(0x7f0916e6, float:1.8222313E38)
            if (r9 != r0) goto L_0x00f2
            java.lang.String r9 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "source"
            r8.mo58904a(r9, r0, r1)
            r8.m74201h()
            com.ss.android.ugc.aweme.poi.widget.c r9 = r8.f59755f
            if (r9 == 0) goto L_0x00f1
            r9.mo90261b()
            goto L_0x0106
        L_0x00f1:
            return
        L_0x00f2:
            r8.m74201h()
            java.lang.String r9 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = ""
            r8.mo58904a(r9, r0, r1)
            com.ss.android.ugc.aweme.poi.widget.c r9 = r8.f59755f
            if (r9 == 0) goto L_0x0106
            r9.mo90261b()
            return
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p984ad.comment.CommonCommentView.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo58903a(LinkData linkData, Aweme aweme) {
        C7573i.m23587b(linkData, "linkData");
        C7573i.m23587b(aweme, "aweme");
        this.f59751b = linkData;
        this.f59752c = aweme;
        m74195b();
    }

    public CommonCommentView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f59762m = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C22399b(this));
        m74193a();
        this.f59757h = C9738o.m28708b(context, 51.5f);
    }

    /* renamed from: a */
    public final void mo58904a(String str, String str2, String str3) {
        C22375a a = C22375a.m74074a();
        C7573i.m23582a((Object) a, "AdDependManager.inst()");
        a.f59713g.mo58847a(str2, getContext(), this.f59751b, this.f59752c, str3);
    }

    private /* synthetic */ CommonCommentView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
