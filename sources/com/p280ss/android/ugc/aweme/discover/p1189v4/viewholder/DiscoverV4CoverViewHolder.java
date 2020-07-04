package com.p280ss.android.ugc.aweme.discover.p1189v4.viewholder;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.p612c.C12105c;
import com.bytedance.lighten.core.p612c.C12112j;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity;
import com.p280ss.android.ugc.aweme.discover.mob.C26781b;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.C27190b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4CoverViewHolder */
public final class DiscoverV4CoverViewHolder extends JediSimpleViewHolder<DiscoverPlayListStructV4> implements OnClickListener, C27190b {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f71654f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4CoverViewHolder.class), "mIvCover", "getMIvCover()Lcom/bytedance/lighten/loader/SmartImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4CoverViewHolder.class), "mTvTitle", "getMTvTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4CoverViewHolder.class), "mIvMask", "getMIvMask()Landroid/widget/ImageView;"))};

    /* renamed from: g */
    public final String f71655g;

    /* renamed from: j */
    public final String f71656j;

    /* renamed from: k */
    private final C7541d f71657k = C7546e.m23569a(new C27192b(this));

    /* renamed from: l */
    private final C7541d f71658l = C7546e.m23569a(new C27194d(this));

    /* renamed from: m */
    private final C7541d f71659m = C7546e.m23569a(new C27193c(this));

    /* renamed from: n */
    private boolean f71660n;

    /* renamed from: o */
    private boolean f71661o;

    /* renamed from: p */
    private final int f71662p;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4CoverViewHolder$a */
    public static final class C27191a extends C12105c {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4CoverViewHolder f71663a;

        /* renamed from: a */
        public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
        }

        C27191a(DiscoverV4CoverViewHolder discoverV4CoverViewHolder) {
            this.f71663a = discoverV4CoverViewHolder;
        }

        /* renamed from: a */
        public final void mo29812a(Uri uri, View view, Throwable th) {
            this.f71663a.mo62390p().setImageResource(R.drawable.a6c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4CoverViewHolder$b */
    static final class C27192b extends Lambda implements C7561a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4CoverViewHolder f71664a;

        C27192b(DiscoverV4CoverViewHolder discoverV4CoverViewHolder) {
            this.f71664a = discoverV4CoverViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SmartImageView invoke() {
            View view = this.f71664a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (SmartImageView) view.findViewById(R.id.b7x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4CoverViewHolder$c */
    static final class C27193c extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4CoverViewHolder f71665a;

        C27193c(DiscoverV4CoverViewHolder discoverV4CoverViewHolder) {
            this.f71665a = discoverV4CoverViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            View view = this.f71665a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (ImageView) view.findViewById(R.id.ba3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4CoverViewHolder$d */
    static final class C27194d extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4CoverViewHolder f71666a;

        C27194d(DiscoverV4CoverViewHolder discoverV4CoverViewHolder) {
            this.f71666a = discoverV4CoverViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            View view = this.f71666a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.e3f);
            dmtTextView.setFontType(C10834d.f29332b);
            return dmtTextView;
        }
    }

    /* renamed from: q */
    private final SmartImageView m89124q() {
        return (SmartImageView) this.f71657k.getValue();
    }

    /* renamed from: r */
    private final DmtTextView m89125r() {
        return (DmtTextView) this.f71658l.getValue();
    }

    public final void aK_() {
    }

    public final void aL_() {
    }

    public final void aM_() {
    }

    /* renamed from: p */
    public final ImageView mo62390p() {
        return (ImageView) this.f71659m.getValue();
    }

    /* renamed from: i */
    public final void mo29223i() {
        super.mo29223i();
        this.f71661o = false;
    }

    /* renamed from: u */
    private void m89128u() {
        SmartImageView q = m89124q();
        C7573i.m23582a((Object) q, "mIvCover");
        q.setVisibility(0);
    }

    /* renamed from: w */
    private final boolean m89130w() {
        return DiscoverV4PlayListDataCenter.Companion.getINSTANCE().isPageShow(this.f71655g);
    }

    /* renamed from: g */
    public final void mo29221g() {
        super.mo29221g();
        this.itemView.setOnClickListener(this);
    }

    /* renamed from: h */
    public final void mo29222h() {
        super.mo29222h();
        this.f71661o = true;
        m89129v();
    }

    public final void bA_() {
        this.f71660n = false;
        this.f71661o = false;
        m89126s();
        SmartImageView q = m89124q();
        C7573i.m23582a((Object) q, "mIvCover");
        q.getLayoutParams().height = this.f71662p;
        super.bA_();
    }

    /* renamed from: s */
    private final void m89126s() {
        SmartImageView q = m89124q();
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        q.setImageDrawable(view.getResources().getDrawable(R.color.ee));
        mo62390p().setImageResource(R.drawable.a6d);
    }

    /* renamed from: v */
    private final void m89129v() {
        if (this.f71660n && this.f71661o && m89130w()) {
            String str = null;
            if (TextUtils.equals(this.f71655g, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                String str2 = "discovery_tab";
                String str3 = this.f71655g;
                int i = this.f31526i;
                List<Aweme> list = ((DiscoverPlayListStructV4) mo29309o()).awemes;
                if (list != null) {
                    Aweme aweme = (Aweme) C7525m.m23513g(list);
                    if (aweme != null) {
                        str = aweme.getAid();
                    }
                }
                C26781b.m87967a(str2, str3, i, str, ((DiscoverPlayListStructV4) mo29309o()).logPb);
                return;
            }
            String str4 = "discovery_tab";
            String str5 = this.f71655g;
            String playListType = ((DiscoverPlayListStructV4) mo29309o()).playListType();
            String str6 = ((DiscoverPlayListStructV4) mo29309o()).cellID;
            int i2 = this.f31526i;
            List<Aweme> list2 = ((DiscoverPlayListStructV4) mo29309o()).awemes;
            if (list2 != null) {
                Aweme aweme2 = (Aweme) C7525m.m23513g(list2);
                if (aweme2 != null) {
                    str = aweme2.getAid();
                }
            }
            C26781b.m87971a(str4, str5, playListType, str6, i2, str, ((DiscoverPlayListStructV4) mo29309o()).logPb);
        }
    }

    /* renamed from: t */
    private final void m89127t() {
        Aweme aweme;
        Video video;
        SmartImageView q = m89124q();
        C7573i.m23582a((Object) q, "mIvCover");
        q.getLayoutParams().height = this.f71662p;
        m89128u();
        List<Aweme> list = ((DiscoverPlayListStructV4) mo29309o()).awemes;
        if (list != null) {
            aweme = (Aweme) C7525m.m23513g(list);
        } else {
            aweme = null;
        }
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        if (video != null) {
            Video video2 = aweme.getVideo();
            C7573i.m23582a((Object) video2, "aweme.video");
            C12133n.m35299a(C23400r.m76741a(video2.getOriginCover())).mo29853b(C43012cg.m136513a(201)).mo29846a(true).mo29845a("DiscoverV4").mo29844a((C12128i) m89124q()).mo29849a((C12112j) new C27191a(this));
        }
        mo62390p().setImageResource(R.drawable.a6d);
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        if (C43127fh.m136806a(view.getContext())) {
            DmtTextView r = m89125r();
            C7573i.m23582a((Object) r, "mTvTitle");
            r.setGravity(5);
        }
        DmtTextView r2 = m89125r();
        C7573i.m23582a((Object) r2, "mTvTitle");
        r2.setText(((DiscoverPlayListStructV4) mo29309o()).title);
        if (((DiscoverPlayListStructV4) mo29309o()).type == 2) {
            m89125r().setTextSize(1, 15.0f);
            DmtTextView r3 = m89125r();
            C7573i.m23582a((Object) r3, "mTvTitle");
            r3.setEllipsize(null);
        } else {
            m89125r().setTextSize(1, 20.0f);
            DmtTextView r4 = m89125r();
            C7573i.m23582a((Object) r4, "mTvTitle");
            r4.setEllipsize(TruncateAt.END);
        }
        int i = 8;
        if (TextUtils.equals(this.f71655g, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view2.findViewById(R.id.awr);
            if (dmtTextView != null) {
                if (this.f31526i == 1 || this.f31526i == 2) {
                    View view3 = this.itemView;
                    C7573i.m23582a((Object) view3, "itemView");
                    DmtTextView dmtTextView2 = (DmtTextView) view3.findViewById(R.id.awr);
                    if (dmtTextView2 != null) {
                        View view4 = this.itemView;
                        C7573i.m23582a((Object) view4, "itemView");
                        String string = view4.getContext().getString(R.string.asg);
                        C7573i.m23582a((Object) string, "itemView.context.getString(R.string.discover_top)");
                        String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f31526i + 1)}, 1));
                        C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
                        dmtTextView2.setText(a);
                    }
                    i = 0;
                }
                dmtTextView.setVisibility(i);
            }
            return;
        }
        View view5 = this.itemView;
        C7573i.m23582a((Object) view5, "itemView");
        DmtTextView dmtTextView3 = (DmtTextView) view5.findViewById(R.id.awr);
        if (dmtTextView3 != null) {
            dmtTextView3.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(DiscoverPlayListStructV4 discoverPlayListStructV4) {
        C7573i.m23587b(discoverPlayListStructV4, "item");
        this.f71660n = true;
        m89127t();
    }

    public final void onClick(View view) {
        String str;
        String str2;
        ClickInstrumentation.onClick(view);
        String str3 = null;
        if (TextUtils.equals(this.f71655g, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
            String str4 = "discovery_tab";
            String str5 = this.f71655g;
            List<Aweme> list = ((DiscoverPlayListStructV4) mo29309o()).awemes;
            if (list != null) {
                Aweme aweme = (Aweme) C7525m.m23513g(list);
                if (aweme != null) {
                    str2 = aweme.getAid();
                    C26781b.m87968a(str4, str5, str2, this.f31526i, ((DiscoverPlayListStructV4) mo29309o()).logPb);
                }
            }
            str2 = null;
            C26781b.m87968a(str4, str5, str2, this.f31526i, ((DiscoverPlayListStructV4) mo29309o()).logPb);
        } else {
            String str6 = "discovery_tab";
            String str7 = this.f71655g;
            String playListType = ((DiscoverPlayListStructV4) mo29309o()).playListType();
            String str8 = ((DiscoverPlayListStructV4) mo29309o()).cellID;
            List<Aweme> list2 = ((DiscoverPlayListStructV4) mo29309o()).awemes;
            if (list2 != null) {
                Aweme aweme2 = (Aweme) C7525m.m23513g(list2);
                if (aweme2 != null) {
                    str = aweme2.getAid();
                    C26781b.m87973a(str6, str7, playListType, str8, str, this.f31526i, ((DiscoverPlayListStructV4) mo29309o()).logPb);
                }
            }
            str = null;
            C26781b.m87973a(str6, str7, playListType, str8, str, this.f31526i, ((DiscoverPlayListStructV4) mo29309o()).logPb);
        }
        if (C23764b.m77913a(((DiscoverPlayListStructV4) mo29309o()).refUrl)) {
            C7195s a = C7195s.m22438a();
            C7573i.m23582a((Object) a, "RouterManager.getInstance()");
            a.f20133a.mo93887c("use_webview_title");
            C7195s.m22438a().mo18683a(((DiscoverPlayListStructV4) mo29309o()).refUrl, C7507ae.m23401c((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("use_webview_title", "true"), C7579l.m23633a("title", " ")}));
            return;
        }
        String str9 = this.f71656j;
        if (TextUtils.equals(this.f71655g, DiscoverV4PlayListDataCenter.Companion.getDISCOVER_PLAYLIST()) && ((DiscoverPlayListStructV4) mo29309o()).type != 2) {
            str9 = ((DiscoverPlayListStructV4) mo29309o()).title;
            if (str9 == null) {
                str9 = this.f71656j;
            }
        }
        String str10 = str9;
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        Context context = view2.getContext();
        int i = ((DiscoverPlayListStructV4) mo29309o()).type;
        String str11 = ((DiscoverPlayListStructV4) mo29309o()).cellID;
        List<Aweme> list3 = ((DiscoverPlayListStructV4) mo29309o()).awemes;
        if (list3 != null) {
            Aweme aweme3 = (Aweme) C7525m.m23513g(list3);
            if (aweme3 != null) {
                str3 = aweme3.getAid();
            }
        }
        DiscoverDetailActivity.m86687a(context, i, str11, str3, this.f31526i, this.f71655g, str10);
    }

    /* renamed from: a */
    public final void mo69947a(boolean z, boolean z2) {
        if (!z) {
            m89129v();
        }
    }

    public DiscoverV4CoverViewHolder(ViewGroup viewGroup, int i, String str, String str2) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(str, "tabName");
        C7573i.m23587b(str2, "tabText");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uj, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…_v4_cover, parent, false)");
        super(inflate);
        this.f71662p = i;
        this.f71655g = str;
        this.f71656j = str2;
    }
}
