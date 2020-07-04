package com.p280ss.android.ugc.aweme.discover.p1187v3.viewholder;

import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.facebook.drawee.controller.C13400c;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.discover.mob.C26781b;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.p280ss.android.ugc.aweme.discover.p1187v3.p1188ui.C27122a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder */
public final class DiscoveryV3CoverViewHolder extends JediSimpleViewHolder<DiscoveryCellStructV3> implements OnClickListener, C27122a {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f71513f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoveryV3CoverViewHolder.class), "mIvCover", "getMIvCover()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoveryV3CoverViewHolder.class), "mTvDiggCount", "getMTvDiggCount()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoveryV3CoverViewHolder.class), "mIvMask", "getMIvMask()Landroid/widget/ImageView;"))};

    /* renamed from: g */
    private final C7541d f71514g = C7546e.m23569a(new C27124b(this));

    /* renamed from: j */
    private final C7541d f71515j = C7546e.m23569a(new C27126d(this));

    /* renamed from: k */
    private final C7541d f71516k = C7546e.m23569a(new C27125c(this));

    /* renamed from: l */
    private boolean f71517l;

    /* renamed from: m */
    private boolean f71518m;

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder$a */
    public static final class C27123a extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3CoverViewHolder f71519a;

        C27123a(DiscoveryV3CoverViewHolder discoveryV3CoverViewHolder) {
            this.f71519a = discoveryV3CoverViewHolder;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            super.onFinalImageSet(str, fVar, animatable);
            this.f71519a.mo62390p().setImageResource(R.drawable.a6c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder$b */
    static final class C27124b extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3CoverViewHolder f71520a;

        C27124b(DiscoveryV3CoverViewHolder discoveryV3CoverViewHolder) {
            this.f71520a = discoveryV3CoverViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            View view = this.f71520a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (RemoteImageView) view.findViewById(R.id.b7x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder$c */
    static final class C27125c extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3CoverViewHolder f71521a;

        C27125c(DiscoveryV3CoverViewHolder discoveryV3CoverViewHolder) {
            this.f71521a = discoveryV3CoverViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            View view = this.f71521a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (ImageView) view.findViewById(R.id.ba3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder$d */
    static final class C27126d extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3CoverViewHolder f71522a;

        C27126d(DiscoveryV3CoverViewHolder discoveryV3CoverViewHolder) {
            this.f71522a = discoveryV3CoverViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            View view = this.f71522a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (DmtTextView) view.findViewById(R.id.dtf);
        }
    }

    /* renamed from: q */
    private final RemoteImageView m88950q() {
        return (RemoteImageView) this.f71514g.getValue();
    }

    /* renamed from: r */
    private final DmtTextView m88951r() {
        return (DmtTextView) this.f71515j.getValue();
    }

    /* renamed from: p */
    public final ImageView mo62390p() {
        return (ImageView) this.f71516k.getValue();
    }

    /* renamed from: i */
    public final void mo29223i() {
        super.mo29223i();
        this.f71518m = false;
    }

    /* renamed from: g */
    public final void mo29221g() {
        super.mo29221g();
        this.itemView.setOnClickListener(this);
    }

    /* renamed from: h */
    public final void mo29222h() {
        super.mo29222h();
        this.f71518m = true;
        m88954u();
    }

    /* renamed from: s */
    private final void m88952s() {
        RemoteImageView q = m88950q();
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        q.setImageDrawable(view.getResources().getDrawable(R.color.ee));
        mo62390p().setImageResource(R.drawable.a6d);
    }

    public final void bA_() {
        m88952s();
        RemoteImageView q = m88950q();
        C7573i.m23582a((Object) q, "mIvCover");
        q.getLayoutParams().height = ((DiscoveryCellStructV3) mo29309o()).displayHeight;
        this.f71517l = false;
        this.f71518m = false;
        super.bA_();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m88953t() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r0 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r0
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.awemes
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = kotlin.collections.C7525m.m23513g(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r0
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r5.m88951r()
            java.lang.String r3 = "mTvDiggCount"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            if (r0 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r3 = r0.getStatistics()
            if (r3 == 0) goto L_0x002a
            int r3 = r3.getDiggCount()
            long r3 = (long) r3
            goto L_0x002c
        L_0x002a:
            r3 = 0
        L_0x002c:
            java.lang.String r3 = com.p280ss.android.ugc.aweme.i18n.C30537o.m99738a(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()
        L_0x003b:
            if (r1 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r5.m88950q()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            java.lang.String r2 = "aweme.video"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getOriginCover()
            com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder$a r2 = new com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3CoverViewHolder$a
            r2.<init>(r5)
            com.facebook.drawee.controller.d r2 = (com.facebook.drawee.controller.C13401d) r2
            com.p280ss.android.ugc.aweme.base.C23323e.m76509a(r1, r0, r2)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1187v3.viewholder.DiscoveryV3CoverViewHolder.m88953t():void");
    }

    /* renamed from: u */
    private final void m88954u() {
        String str;
        if (this.f71517l && this.f71518m) {
            String str2 = "discovery";
            String playListType = ((DiscoveryCellStructV3) mo29309o()).getPlayListType();
            String str3 = ((DiscoveryCellStructV3) mo29309o()).cellID;
            int i = this.f31526i + 1;
            List<Aweme> list = ((DiscoveryCellStructV3) mo29309o()).awemes;
            if (list != null) {
                Aweme aweme = (Aweme) C7525m.m23513g(list);
                if (aweme != null) {
                    str = aweme.getAid();
                    C26781b.m87969a(str2, playListType, str3, i, str, ((DiscoveryCellStructV3) mo29309o()).logPb);
                }
            }
            str = null;
            C26781b.m87969a(str2, playListType, str3, i, str, ((DiscoveryCellStructV3) mo29309o()).logPb);
        }
    }

    /* renamed from: a */
    public final void mo69902a(boolean z) {
        if (!z) {
            m88954u();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(DiscoveryCellStructV3 discoveryCellStructV3) {
        C7573i.m23587b(discoveryCellStructV3, "item");
        RemoteImageView q = m88950q();
        C7573i.m23582a((Object) q, "mIvCover");
        q.getLayoutParams().height = discoveryCellStructV3.displayHeight;
        m88953t();
        this.f71517l = true;
        m88954u();
    }

    public DiscoveryV3CoverViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ur, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…_v3_image, parent, false)");
        super(inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r8)
            java.lang.String r0 = "discovery"
            java.lang.Object r8 = r7.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r8 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r8
            java.lang.String r1 = r8.getPlayListType()
            java.lang.Object r8 = r7.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r8 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r8
            java.lang.String r2 = r8.cellID
            java.lang.Object r8 = r7.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r8 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r8
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r8 = r8.awemes
            r6 = 0
            if (r8 == 0) goto L_0x0030
            java.lang.Object r8 = kotlin.collections.C7525m.m23513g(r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r8
            if (r8 == 0) goto L_0x0030
            java.lang.String r8 = r8.getAid()
            r3 = r8
            goto L_0x0031
        L_0x0030:
            r3 = r6
        L_0x0031:
            int r8 = r7.f31526i
            int r4 = r8 + 1
            java.lang.Object r8 = r7.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r8 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r8
            com.ss.android.ugc.aweme.feed.model.LogPbBean r5 = r8.logPb
            com.p280ss.android.ugc.aweme.discover.mob.C26781b.m87970a(r0, r1, r2, r3, r4, r5)
            android.view.View r8 = r7.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            android.content.Context r8 = r8.getContext()
            java.lang.Object r0 = r7.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r0 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r0
            int r0 = r0.type
            java.lang.Object r1 = r7.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r1 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r1
            java.lang.String r1 = r1.cellID
            java.lang.Object r2 = r7.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r2 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r2
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.awemes
            if (r2 == 0) goto L_0x0071
            java.lang.Object r2 = kotlin.collections.C7525m.m23513g(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r2
            if (r2 == 0) goto L_0x0071
            java.lang.String r6 = r2.getAid()
        L_0x0071:
            int r2 = r7.f31526i
            com.p280ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity.m86686a(r8, r0, r1, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1187v3.viewholder.DiscoveryV3CoverViewHolder.onClick(android.view.View):void");
    }
}
