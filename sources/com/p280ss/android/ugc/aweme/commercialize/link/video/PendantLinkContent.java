package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.PendantLinkContent */
public final class PendantLinkContent extends RelativeLayout implements C24814k {

    /* renamed from: a */
    public C24815l f65326a;

    /* renamed from: b */
    private HashMap f65327b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.PendantLinkContent$a */
    static final class C24801a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommerceTagLayout f65328a;

        /* renamed from: b */
        final /* synthetic */ C24815l f65329b;

        C24801a(CommerceTagLayout commerceTagLayout, C24815l lVar) {
            this.f65328a = commerceTagLayout;
            this.f65329b = lVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            CommerceTagLayout commerceTagLayout = this.f65328a;
            if (commerceTagLayout != null) {
                ViewPropertyAnimator animate = commerceTagLayout.animate();
                if (animate != null) {
                    ViewPropertyAnimator alpha = animate.alpha(0.0f);
                    if (alpha != null) {
                        ViewPropertyAnimator duration = alpha.setDuration(200);
                        if (duration != null) {
                            duration.withEndAction(new Runnable(this) {

                                /* renamed from: a */
                                final /* synthetic */ C24801a f65330a;

                                {
                                    this.f65330a = r1;
                                }

                                public final void run() {
                                    this.f65330a.f65328a.setVisibility(8);
                                    this.f65330a.f65328a.setAlpha(1.0f);
                                    C24815l lVar = this.f65330a.f65329b;
                                    if (lVar != null) {
                                        lVar.mo64612c();
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.PendantLinkContent$b */
    static final class C24803b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PendantLinkContent f65331a;

        C24803b(PendantLinkContent pendantLinkContent) {
            this.f65331a = pendantLinkContent;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C24815l lVar = this.f65331a.f65326a;
            if (lVar != null) {
                lVar.mo64611b();
            }
        }
    }

    public PendantLinkContent(Context context) {
        this(context, null, 0, 6, null);
    }

    /* renamed from: a */
    private View m81419a(int i) {
        if (this.f65327b == null) {
            this.f65327b = new HashMap();
        }
        View view = (View) this.f65327b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f65327b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final View mo64859c() {
        return this;
    }

    /* renamed from: a */
    public final void mo64855a() {
        C24815l lVar = this.f65326a;
        if (lVar != null) {
            lVar.mo64610a();
        }
    }

    /* renamed from: b */
    public final void mo64858b() {
        C24815l lVar = this.f65326a;
        if (lVar != null) {
            lVar.mo64613d();
        }
    }

    /* renamed from: d */
    private final void m81421d() {
        LayoutInflater.from(getContext()).inflate(R.layout.a7y, this, true);
        ((RemoteImageView) m81419a((int) R.id.bmw)).setOnClickListener(new C24803b(this));
    }

    public final void setLinkTagCallBack(C24815l lVar) {
        this.f65326a = lVar;
    }

    /* renamed from: a */
    private static boolean m81420a(LinkData linkData) {
        if (linkData == null || linkData.feedShowType != 4 || C6307b.m19566a((Collection<T>) linkData.getImageList()) || ((UrlModel) linkData.getImageList().get(0)) == null) {
            return false;
        }
        return true;
    }

    public PendantLinkContent(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m81421d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64857a(com.p280ss.android.ugc.aweme.commercialize.model.LinkData r7, com.p280ss.android.ugc.aweme.commercialize.link.video.C24815l r8, com.p280ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout r9) {
        /*
            r6 = this;
            boolean r0 = m81420a(r7)
            r1 = 8
            if (r0 != 0) goto L_0x000c
            r9.setVisibility(r1)
            return
        L_0x000c:
            r0 = 2131299496(0x7f090ca8, float:1.8216995E38)
            android.view.View r2 = r6.m81419a(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r2
            java.lang.String r3 = "link_pendant_img"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r3 = 0
            r2.setVisibility(r3)
            r2 = 2131299495(0x7f090ca7, float:1.8216993E38)
            if (r7 == 0) goto L_0x0047
            boolean r4 = r7.showCloseTips
            r5 = 1
            if (r4 != r5) goto L_0x0047
            android.view.View r1 = r6.m81419a(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r4 = "link_pendant_close_img"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            r1.setVisibility(r3)
            android.view.View r1 = r6.m81419a(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.ss.android.ugc.aweme.commercialize.link.video.PendantLinkContent$a r2 = new com.ss.android.ugc.aweme.commercialize.link.video.PendantLinkContent$a
            r2.<init>(r9, r8)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            goto L_0x0055
        L_0x0047:
            android.view.View r8 = r6.m81419a(r2)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            java.lang.String r9 = "link_pendant_close_img"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            r8.setVisibility(r1)
        L_0x0055:
            r8 = 2131299497(0x7f090ca9, float:1.8216997E38)
            android.view.View r9 = r6.m81419a(r8)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            java.lang.String r1 = "link_pendant_root"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            r1 = 1117782016(0x42a00000, float:80.0)
            if (r7 == 0) goto L_0x007e
            java.util.List r2 = r7.getImageList()
            if (r2 == 0) goto L_0x007e
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = (com.p280ss.android.ugc.aweme.base.model.UrlModel) r2
            if (r2 == 0) goto L_0x007e
            int r2 = r2.getHeight()
            goto L_0x0087
        L_0x007e:
            android.content.Context r2 = r6.getContext()
            float r2 = com.bytedance.common.utility.C9738o.m28708b(r2, r1)
            int r2 = (int) r2
        L_0x0087:
            r9.height = r2
            if (r7 == 0) goto L_0x009e
            java.util.List r2 = r7.getImageList()
            if (r2 == 0) goto L_0x009e
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = (com.p280ss.android.ugc.aweme.base.model.UrlModel) r2
            if (r2 == 0) goto L_0x009e
            int r1 = r2.getWidth()
            goto L_0x00a7
        L_0x009e:
            android.content.Context r2 = r6.getContext()
            float r1 = com.bytedance.common.utility.C9738o.m28708b(r2, r1)
            int r1 = (int) r1
        L_0x00a7:
            r9.width = r1
            android.view.View r8 = r6.m81419a(r8)
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            java.lang.String r1 = "link_pendant_root"
            kotlin.jvm.internal.C7573i.m23582a(r8, r1)
            r8.setLayoutParams(r9)
            android.view.View r8 = r6.m81419a(r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r8 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r8
            if (r7 == 0) goto L_0x00cc
            java.util.List r7 = r7.getImageList()
            if (r7 == 0) goto L_0x00cc
            java.lang.Object r7 = r7.get(r3)
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = (com.p280ss.android.ugc.aweme.base.model.UrlModel) r7
            goto L_0x00cd
        L_0x00cc:
            r7 = 0
        L_0x00cd:
            com.p280ss.android.ugc.aweme.commercialize.utils.C25354g.m83373a(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.link.video.PendantLinkContent.mo64857a(com.ss.android.ugc.aweme.commercialize.model.LinkData, com.ss.android.ugc.aweme.commercialize.link.video.l, com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout):void");
    }

    private /* synthetic */ PendantLinkContent(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
