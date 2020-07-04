package com.p280ss.android.ugc.aweme.music.p1410ui.viewholder;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27746c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView.C33833a;
import com.p280ss.android.ugc.aweme.music.p1410ui.adapter.C33927a;
import com.p280ss.android.ugc.aweme.music.p1410ui.adapter.SimilarMusicListAdapter.C33924a;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1414d.C33952a.C33953a;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34015d;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p280ss.android.ugc.aweme.utils.C43086eb;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.aweme.video.C43200c;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder */
public final class SimilarMusicListViewHolder extends JediSimpleViewHolder<C34015d> implements OnClickListener, C27746c, C33927a {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f88641f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicListViewHolder.class), "mMusicLayout", "getMMusicLayout()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicListViewHolder.class), "tvMusicName", "getTvMusicName()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicListViewHolder.class), "mMusicUsedCount", "getMMusicUsedCount()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicListViewHolder.class), "mTitileMask", "getMTitileMask()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicListViewHolder.class), "mMusicCover", "getMMusicCover()Lcom/bytedance/lighten/loader/SmartImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicListViewHolder.class), "mIvMusicCollect", "getMIvMusicCollect()Lcom/ss/android/ugc/aweme/music/ui/CheckableImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicListViewHolder.class), "mIvShoot", "getMIvShoot()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicListViewHolder.class), "mVideoView", "getMVideoView()Lcom/ss/android/ugc/aweme/music/ui/viewholder/SimilarMusicVideoView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicListViewHolder.class), "mVideoView2", "getMVideoView2()Lcom/ss/android/ugc/aweme/music/ui/viewholder/SimilarMusicVideoView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicListViewHolder.class), "mOperationListener", "getMOperationListener()Lcom/ss/android/ugc/aweme/music/ui/adapter/SimilarMusicListAdapter$OnItemOperationListener;"))};

    /* renamed from: n */
    public static final C33986a f88642n = new C33986a(null);

    /* renamed from: A */
    private boolean f88643A;

    /* renamed from: B */
    private final C7541d f88644B;

    /* renamed from: C */
    private C33993h f88645C;

    /* renamed from: D */
    private C33994i f88646D;

    /* renamed from: g */
    public Aweme f88647g;

    /* renamed from: j */
    public Aweme f88648j;

    /* renamed from: k */
    public final int f88649k;

    /* renamed from: l */
    public int f88650l;

    /* renamed from: m */
    public HashMap<Integer, Integer> f88651m;

    /* renamed from: o */
    private final C7541d f88652o = C7546e.m23569a(new C33991f(this));

    /* renamed from: p */
    private final C7541d f88653p = C7546e.m23569a(new C34001p(this));

    /* renamed from: q */
    private final C7541d f88654q = C7546e.m23569a(new C33992g(this));

    /* renamed from: r */
    private final C7541d f88655r = C7546e.m23569a(new C33996k(this));

    /* renamed from: s */
    private final C7541d f88656s = C7546e.m23569a(new C33990e(this));

    /* renamed from: t */
    private final C7541d f88657t = C7546e.m23569a(new C33988c(this));

    /* renamed from: u */
    private final C7541d f88658u = C7546e.m23569a(new C33989d(this));

    /* renamed from: v */
    private final C7541d f88659v = C7546e.m23569a(new C33997l(this));

    /* renamed from: w */
    private final C7541d f88660w = C7546e.m23569a(new C33998m(this));

    /* renamed from: x */
    private boolean f88661x;

    /* renamed from: y */
    private MusicModel f88662y;

    /* renamed from: z */
    private C27743a f88663z;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$a */
    public static final class C33986a {
        private C33986a() {
        }

        public /* synthetic */ C33986a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$b */
    static final class C33987b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88664a;

        C33987b(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88664a = similarMusicListViewHolder;
        }

        public final void run() {
            this.f88664a.mo69905q().mo86645a();
            this.f88664a.mo69906r().mo86645a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$c */
    static final class C33988c extends Lambda implements C7561a<CheckableImageView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88665a;

        C33988c(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88665a = similarMusicListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CheckableImageView invoke() {
            View view = this.f88665a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (CheckableImageView) view.findViewById(R.id.b96);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$d */
    static final class C33989d extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88666a;

        C33989d(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88666a = similarMusicListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            View view = this.f88666a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (ImageView) view.findViewById(R.id.bc9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$e */
    static final class C33990e extends Lambda implements C7561a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88667a;

        C33990e(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88667a = similarMusicListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SmartImageView invoke() {
            View view = this.f88667a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (SmartImageView) view.findViewById(R.id.baf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$f */
    static final class C33991f extends Lambda implements C7561a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88668a;

        C33991f(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88668a = similarMusicListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RelativeLayout invoke() {
            View view = this.f88668a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (RelativeLayout) view.findViewById(R.id.bs0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$g */
    static final class C33992g extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88669a;

        C33992g(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88669a = similarMusicListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            View view = this.f88669a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (DmtTextView) view.findViewById(R.id.e4e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$h */
    public static final class C33993h extends C43200c {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88670a;

        /* renamed from: b */
        public final void mo64944b(float f) {
            super.mo64944b(f);
        }

        C33993h(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88670a = similarMusicListViewHolder;
        }

        /* renamed from: e */
        public final void mo64953e(String str) {
            String str2;
            super.mo64953e(str);
            Aweme aweme = this.f88670a.f88647g;
            String str3 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            Aweme aweme2 = this.f88670a.f88647g;
            if (aweme2 != null) {
                str3 = aweme2.getAuthorUid();
            }
            C33953a.m109416b(str2, str3);
        }

        /* renamed from: a */
        public final void mo63043a(C44919c cVar) {
            Object obj;
            Object obj2;
            StringBuilder sb = new StringBuilder("onPlayCompletedFirstTime play onPlayFailed：");
            Object obj3 = null;
            if (cVar != null) {
                obj = Integer.valueOf(cVar.f115525d);
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(' ');
            if (cVar != null) {
                obj2 = Integer.valueOf(cVar.f115526e);
            } else {
                obj2 = null;
            }
            sb.append(obj2);
            sb.append("  ");
            if (cVar != null) {
                obj3 = cVar.f115527f;
            }
            sb.append(obj3);
            super.mo63043a(cVar);
            this.f88670a.mo69905q().mo86652f();
            this.f88670a.mo69905q().setIvPlayingVisibility(false);
        }

        /* renamed from: a */
        public final void mo63045a(C44921e eVar) {
            String str;
            super.mo63045a(eVar);
            if (!this.f88670a.mo69905q().f88680b) {
                this.f88670a.mo69905q().mo86650d();
                this.f88670a.mo69905q().setIvPlayingVisibility(true);
            }
            this.f88670a.mo69905q().mo86653g();
            this.f88670a.mo69905q().setStartPlayTime(System.currentTimeMillis());
            Aweme aweme = this.f88670a.f88647g;
            String str2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = this.f88670a.f88647g;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            C33953a.m109412a(str, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$i */
    public static final class C33994i extends C43200c {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88671a;

        C33994i(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88671a = similarMusicListViewHolder;
        }

        /* renamed from: e */
        public final void mo64953e(String str) {
            String str2;
            super.mo64953e(str);
            Aweme aweme = this.f88671a.f88648j;
            String str3 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            Aweme aweme2 = this.f88671a.f88648j;
            if (aweme2 != null) {
                str3 = aweme2.getAuthorUid();
            }
            C33953a.m109416b(str2, str3);
        }

        /* renamed from: a */
        public final void mo63043a(C44919c cVar) {
            Object obj;
            Object obj2;
            StringBuilder sb = new StringBuilder("onPlayCompletedFirstTime play onPlayFailed：");
            Object obj3 = null;
            if (cVar != null) {
                obj = Integer.valueOf(cVar.f115525d);
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(' ');
            if (cVar != null) {
                obj2 = Integer.valueOf(cVar.f115526e);
            } else {
                obj2 = null;
            }
            sb.append(obj2);
            sb.append("  ");
            if (cVar != null) {
                obj3 = cVar.f115527f;
            }
            sb.append(obj3);
            super.mo63043a(cVar);
            this.f88671a.mo69906r().mo86652f();
            this.f88671a.mo69906r().setIvPlayingVisibility(false);
        }

        /* renamed from: a */
        public final void mo63045a(C44921e eVar) {
            String str;
            super.mo63045a(eVar);
            if (!this.f88671a.mo69906r().f88680b) {
                this.f88671a.mo69906r().mo86650d();
                this.f88671a.mo69906r().setIsNeedPlay(true);
            }
            this.f88671a.mo69906r().mo86653g();
            this.f88671a.mo69906r().setStartPlayTime(System.currentTimeMillis());
            Aweme aweme = this.f88671a.f88648j;
            String str2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = this.f88671a.f88648j;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            C33953a.m109412a(str, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$j */
    static final class C33995j extends Lambda implements C7561a<C33924a> {

        /* renamed from: a */
        final /* synthetic */ C33924a f88672a;

        C33995j(C33924a aVar) {
            this.f88672a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C33924a invoke() {
            return this.f88672a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$k */
    static final class C33996k extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88673a;

        C33996k(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88673a = similarMusicListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            View view = this.f88673a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return view.findViewById(R.id.edl);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$l */
    static final class C33997l extends Lambda implements C7561a<SimilarMusicVideoView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88674a;

        C33997l(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88674a = similarMusicListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SimilarMusicVideoView invoke() {
            View view = this.f88674a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (SimilarMusicVideoView) view.findViewById(R.id.ec4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$m */
    static final class C33998m extends Lambda implements C7561a<SimilarMusicVideoView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88675a;

        C33998m(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88675a = similarMusicListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SimilarMusicVideoView invoke() {
            View view = this.f88675a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (SimilarMusicVideoView) view.findViewById(R.id.ec5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$n */
    public static final class C33999n implements C33833a {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88676a;

        /* renamed from: a */
        public final void mo61810a() {
        }

        C33999n(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88676a = similarMusicListViewHolder;
        }

        /* renamed from: a */
        public final void mo61811a(int i) {
            if (i == 1) {
                this.f88676a.mo69908t();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$o */
    static final /* synthetic */ class C34000o extends FunctionReference implements C7561a<C7581n> {
        C34000o(SimilarMusicListViewHolder similarMusicListViewHolder) {
            super(0, similarMusicListViewHolder);
        }

        public final String getName() {
            return "handleCollectMusic";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(SimilarMusicListViewHolder.class);
        }

        public final String getSignature() {
            return "handleCollectMusic()V";
        }

        /* renamed from: a */
        private void m109517a() {
            ((SimilarMusicListViewHolder) this.receiver).mo69907s();
        }

        public final /* synthetic */ Object invoke() {
            m109517a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$p */
    static final class C34001p extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f88677a;

        C34001p(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f88677a = similarMusicListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            View view = this.f88677a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (DmtTextView) view.findViewById(R.id.dya);
        }
    }

    /* renamed from: A */
    private final ImageView m109466A() {
        return (ImageView) this.f88658u.getValue();
    }

    /* renamed from: B */
    private final C33924a m109467B() {
        return (C33924a) this.f88644B.getValue();
    }

    /* renamed from: u */
    private final View m109480u() {
        return (View) this.f88652o.getValue();
    }

    /* renamed from: v */
    private final TextView m109481v() {
        return (TextView) this.f88653p.getValue();
    }

    /* renamed from: w */
    private final TextView m109482w() {
        return (TextView) this.f88654q.getValue();
    }

    /* renamed from: x */
    private final View m109483x() {
        return (View) this.f88655r.getValue();
    }

    /* renamed from: y */
    private final SmartImageView m109484y() {
        return (SmartImageView) this.f88656s.getValue();
    }

    /* renamed from: z */
    private final CheckableImageView m109485z() {
        return (CheckableImageView) this.f88657t.getValue();
    }

    public final void bA_() {
        super.bA_();
    }

    /* renamed from: q */
    public final SimilarMusicVideoView mo69905q() {
        return (SimilarMusicVideoView) this.f88659v.getValue();
    }

    /* renamed from: r */
    public final SimilarMusicVideoView mo69906r() {
        return (SimilarMusicVideoView) this.f88660w.getValue();
    }

    /* renamed from: J */
    private final void m109475J() {
        this.f88643A = !this.f88643A;
    }

    public final void br_() {
        mo69905q().mo86651e();
        mo69906r().mo86651e();
    }

    /* renamed from: F */
    private final int m109471F() {
        Integer num = (Integer) this.f88651m.get(Integer.valueOf(this.f31526i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: G */
    private final void m109472G() {
        Music music;
        C33924a B = m109467B();
        if (B != null) {
            C34015d dVar = (C34015d) mo29309o();
            if (dVar != null) {
                music = dVar.f88717a;
            } else {
                music = null;
            }
            B.mo86572e(music, this.f31526i);
        }
    }

    /* renamed from: L */
    private final void m109477L() {
        Music music;
        C33924a B = m109467B();
        if (B != null) {
            C34015d dVar = (C34015d) mo29309o();
            if (dVar != null) {
                music = dVar.f88717a;
            } else {
                music = null;
            }
            B.mo86571d(music, this.f31526i);
        }
    }

    /* renamed from: g */
    public final void mo29221g() {
        super.mo29221g();
        mo69905q().mo86646a(this.f88649k);
        mo69906r().mo86646a(this.f88649k);
    }

    /* renamed from: h */
    public final void mo29222h() {
        super.mo29222h();
        this.f88661x = true;
        C33924a B = m109467B();
        if (B != null) {
            B.mo86570c(((C34015d) mo29309o()).f88717a, this.f31526i);
        }
    }

    /* renamed from: i */
    public final void mo29223i() {
        super.mo29223i();
        this.f88661x = false;
        mo69905q().mo86651e();
        mo69906r().mo86651e();
    }

    /* renamed from: m */
    public final void mo29226m() {
        super.mo29226m();
        mo69905q().mo86651e();
        mo69906r().mo86651e();
        if (this.f88663z != null) {
            C27743a aVar = this.f88663z;
            if (aVar != null) {
                aVar.mo59134U_();
            }
            this.f88663z = null;
        }
    }

    /* renamed from: t */
    public final void mo69908t() {
        int i;
        CheckableImageView z = m109485z();
        if (this.f88643A) {
            i = R.drawable.alg;
        } else {
            i = R.drawable.ali;
        }
        z.setImageResource(i);
    }

    /* renamed from: C */
    private final void m109468C() {
        OnClickListener onClickListener = this;
        m109485z().setOnClickListener(onClickListener);
        m109466A().setOnClickListener(onClickListener);
        mo69905q().setOnClickListener(onClickListener);
        mo69906r().setOnClickListener(onClickListener);
        m109480u().setOnClickListener(onClickListener);
    }

    /* renamed from: E */
    private final void m109470E() {
        CollectionType collectionType;
        boolean z;
        MusicModel musicModel = this.f88662y;
        CollectionType collectionType2 = null;
        if (musicModel != null) {
            collectionType = musicModel.getCollectionType();
        } else {
            collectionType = null;
        }
        if (collectionType != null) {
            CollectionType collectionType3 = CollectionType.COLLECTED;
            MusicModel musicModel2 = this.f88662y;
            if (musicModel2 != null) {
                collectionType2 = musicModel2.getCollectionType();
            }
            if (collectionType3 == collectionType2) {
                z = true;
            } else {
                z = false;
            }
            this.f88643A = z;
        }
        mo69908t();
    }

    /* renamed from: H */
    private final void m109473H() {
        mo69905q().setIsNeedPlay(true);
        if (mo69905q().getVideoView().mo107438d()) {
            mo69905q().mo86650d();
            C33924a B = m109467B();
            if (B != null) {
                B.mo86566a(true);
            }
        } else {
            mo69905q().mo86648b();
            mo69906r().mo86650d();
            mo69906r().setIsNeedPlay(false);
        }
    }

    /* renamed from: I */
    private final void m109474I() {
        mo69906r().setIsNeedPlay(true);
        if (mo69906r().getVideoView().mo107438d()) {
            mo69906r().mo86650d();
            C33924a B = m109467B();
            if (B != null) {
                B.mo86566a(true);
            }
        } else {
            mo69906r().mo86648b();
            mo69905q().mo86650d();
            mo69905q().setIsNeedPlay(false);
        }
    }

    /* renamed from: K */
    private final void m109476K() {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (!f.isLogin()) {
            C32656f.m105744a(C6405d.m19984g(), "single_song", "click_favorite_music", (Bundle) null, (C23305g) new C34004a(new C34000o(this)));
        } else {
            mo69907s();
        }
    }

    public final void bs_() {
        switch (m109471F()) {
            case 0:
                mo69905q().mo86648b();
                mo69905q().setIsNeedPlay(true);
                return;
            case 1:
                mo69906r().mo86648b();
                mo69906r().setIsNeedPlay(true);
                break;
        }
    }

    /* renamed from: p */
    public final void mo62390p() {
        switch (m109471F()) {
            case 0:
                mo69905q().mo86650d();
                mo69905q().setIsNeedPlay(false);
                return;
            case 1:
                mo69906r().mo86650d();
                mo69906r().setIsNeedPlay(false);
                break;
        }
    }

    /* renamed from: s */
    public final void mo69907s() {
        String str;
        if (this.f88662y != null) {
            if (!this.f88643A) {
                MusicModel musicModel = this.f88662y;
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                if (!C33784d.m108931a(musicModel, view.getContext(), true)) {
                    return;
                }
            }
            C27743a aVar = this.f88663z;
            if (aVar != null) {
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(1);
                MusicModel musicModel2 = this.f88662y;
                if (musicModel2 != null) {
                    str = musicModel2.getMusicId();
                } else {
                    str = null;
                }
                objArr[1] = str;
                objArr[2] = Integer.valueOf(true ^ this.f88643A ? 1 : 0);
                aVar.mo56976a(objArr);
            }
            m109475J();
            m109485z().mo86446b();
        }
    }

    /* renamed from: D */
    private final void m109469D() {
        CharSequence charSequence;
        int i;
        int i2;
        Video video;
        Video video2;
        String str;
        String str2;
        Aweme aweme;
        Aweme aweme2;
        TextView v = m109481v();
        Music music = ((C34015d) mo29309o()).f88717a;
        UrlModel urlModel = null;
        if (music != null) {
            charSequence = music.getMusicName();
        } else {
            charSequence = null;
        }
        v.setText(charSequence);
        Music music2 = ((C34015d) mo29309o()).f88717a;
        int i3 = 0;
        if (music2 != null) {
            i = music2.getUserCount();
        } else {
            i = 0;
        }
        String a = C30537o.m99738a((long) i);
        TextView w = m109482w();
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(' ');
        w.setText(sb.toString());
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        if (C43127fh.m136806a(view.getContext())) {
            m109483x().setBackgroundResource(R.drawable.bip);
        }
        List<Aweme> list = ((C34015d) mo29309o()).f88718b;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i2 > 0) {
            List<Aweme> list2 = ((C34015d) mo29309o()).f88718b;
            if (list2 != null) {
                aweme2 = (Aweme) list2.get(0);
            } else {
                aweme2 = null;
            }
            this.f88647g = aweme2;
        }
        List<Aweme> list3 = ((C34015d) mo29309o()).f88718b;
        if (list3 != null) {
            i3 = list3.size();
        }
        if (i3 >= 2) {
            List<Aweme> list4 = ((C34015d) mo29309o()).f88718b;
            if (list4 != null) {
                aweme = (Aweme) list4.get(1);
            } else {
                aweme = null;
            }
            this.f88648j = aweme;
        }
        Aweme aweme3 = this.f88647g;
        if (aweme3 != null) {
            video = aweme3.getVideo();
        } else {
            video = null;
        }
        if (video != null) {
            Aweme aweme4 = this.f88647g;
            if (aweme4 != null) {
                Video video3 = aweme4.getVideo();
                if (video3 != null) {
                    Aweme aweme5 = this.f88647g;
                    if (aweme5 != null) {
                        str2 = aweme5.getAid();
                    } else {
                        str2 = null;
                    }
                    video3.setSourceId(str2);
                }
            }
            mo69905q().mo86647a(this.f88647g, this.f31526i, this.f88645C, m109467B(), this.f88651m, 0);
        }
        Aweme aweme6 = this.f88648j;
        if (aweme6 != null) {
            video2 = aweme6.getVideo();
        } else {
            video2 = null;
        }
        if (video2 != null) {
            Aweme aweme7 = this.f88648j;
            if (aweme7 != null) {
                Video video4 = aweme7.getVideo();
                if (video4 != null) {
                    Aweme aweme8 = this.f88648j;
                    if (aweme8 != null) {
                        str = aweme8.getAid();
                    } else {
                        str = null;
                    }
                    video4.setSourceId(str);
                }
            }
            mo69906r().mo86647a(this.f88648j, this.f31526i, this.f88646D, m109467B(), this.f88651m, 1);
        }
        SmartImageView y = m109484y();
        C7573i.m23582a((Object) y, "mMusicCover");
        Music music3 = ((C34015d) mo29309o()).f88717a;
        if (music3 != null) {
            urlModel = music3.getCoverMedium();
        }
        m109478a(y, urlModel);
        m109470E();
        this.itemView.post(new C33987b(this));
        mo69905q().mo86652f();
        mo69906r().mo86652f();
    }

    /* renamed from: a */
    public final void mo61805a(Exception exc) {
        m109475J();
        mo69908t();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(C34015d dVar) {
        MusicModel musicModel;
        C7573i.m23587b(dVar, "item");
        Music music = dVar.f88717a;
        if (music != null) {
            musicModel = music.convertToMusicModel();
        } else {
            musicModel = null;
        }
        this.f88662y = musicModel;
        m109485z().setOnStateChangeListener(new C33999n(this));
        if (this.f88663z == null) {
            this.f88663z = new C27743a();
            C27743a aVar = this.f88663z;
            if (aVar != null) {
                aVar.f73180e = "similar_song";
            }
            C27743a aVar2 = this.f88663z;
            if (aVar2 != null) {
                aVar2.mo66537a(this);
            }
        }
        m109469D();
        m109468C();
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C27326a.m89578a(view)) {
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.bc9) {
                m109477L();
            } else if (num != null && num.intValue() == R.id.b96) {
                m109476K();
            } else if (num != null && num.intValue() == R.id.ec4) {
                m109473H();
            } else if (num != null && num.intValue() == R.id.ec5) {
                m109474I();
            } else {
                if (num != null && num.intValue() == R.id.bs0) {
                    m109472G();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61803a(BaseResponse baseResponse) {
        Music music = null;
        if (this.f88643A) {
            Music music2 = ((C34015d) mo29309o()).f88717a;
            if (music2 != null) {
                music2.setCollectStatus(1);
            }
            MusicModel musicModel = this.f88662y;
            if (musicModel != null) {
                musicModel.setCollectionType(CollectionType.COLLECTED);
            }
            C33924a B = m109467B();
            if (B != null) {
                C34015d dVar = (C34015d) mo29309o();
                if (dVar != null) {
                    music = dVar.f88717a;
                }
                B.mo86568b(music, this.f31526i);
            }
        } else {
            Music music3 = ((C34015d) mo29309o()).f88717a;
            if (music3 != null) {
                music3.setCollectStatus(0);
            }
            MusicModel musicModel2 = this.f88662y;
            if (musicModel2 != null) {
                musicModel2.setCollectionType(CollectionType.NOT_COLLECTED);
            }
            C33924a B2 = m109467B();
            if (B2 != null) {
                C34015d dVar2 = (C34015d) mo29309o();
                if (dVar2 != null) {
                    music = dVar2.f88717a;
                }
                B2.mo86565a(music, this.f31526i);
            }
        }
    }

    /* renamed from: a */
    private static void m109478a(SmartImageView smartImageView, UrlModel urlModel) {
        if (urlModel != null && smartImageView != null) {
            C12133n.m35299a(C23400r.m76741a(urlModel)).mo29853b(C43086eb.f111705c.mo104750a((View) smartImageView)).mo29845a("SimilarMusicListViewHolder").mo29844a((C12128i) smartImageView).mo29848a();
        }
    }

    /* renamed from: a */
    public final void mo86587a(int i, int i2) {
        if (i != this.f31526i) {
            mo69905q().mo86651e();
            mo69906r().mo86651e();
            mo69905q().setIsNeedPlay(false);
            mo69906r().setIsNeedPlay(false);
        } else if (i2 == 0) {
            mo69906r().mo86650d();
            mo69906r().setIsNeedPlay(false);
        } else {
            if (i2 == 1) {
                mo69905q().mo86650d();
                mo69905q().setIsNeedPlay(false);
            }
        }
    }

    public SimilarMusicListViewHolder(View view, int i, int i2, C33924a aVar, HashMap<Integer, Integer> hashMap) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(hashMap, "mLastplayingPosMap");
        super(view);
        this.f88649k = i;
        this.f88650l = i2;
        this.f88651m = hashMap;
        this.f88644B = C7546e.m23569a(new C33995j(aVar));
        this.f88645C = new C33993h(this);
        this.f88646D = new C33994i(this);
    }
}
