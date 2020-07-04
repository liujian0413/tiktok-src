package com.p280ss.android.ugc.aweme.shortvideo.music;

import android.support.p029v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.filter.C29231b;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1605g.C40582c;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42593c;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42601a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42609g;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42610h;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42612j;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42613k;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42614l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.music.a */
public final class C40079a implements OnClickListener {

    /* renamed from: A */
    private static final int f104087A = 1;

    /* renamed from: B */
    private static final int f104088B = 2;

    /* renamed from: s */
    public static final C40080a f104089s = new C40080a(null);

    /* renamed from: a */
    public AppCompatActivity f104090a;

    /* renamed from: b */
    public FrameLayout f104091b;

    /* renamed from: c */
    public C23258e f104092c;

    /* renamed from: d */
    public List<String> f104093d;

    /* renamed from: e */
    public C42609g f104094e;

    /* renamed from: f */
    public C42593c f104095f;

    /* renamed from: g */
    public C42614l f104096g;

    /* renamed from: h */
    public boolean f104097h;

    /* renamed from: i */
    public C40081b f104098i;

    /* renamed from: j */
    public boolean f104099j;

    /* renamed from: k */
    public boolean f104100k;

    /* renamed from: l */
    public View f104101l;

    /* renamed from: m */
    public C34860g f104102m;

    /* renamed from: n */
    public ViewGroup f104103n;

    /* renamed from: o */
    public C42613k f104104o;

    /* renamed from: p */
    public C42612j f104105p;

    /* renamed from: q */
    public C15389d f104106q;

    /* renamed from: r */
    public AVMusic f104107r;

    /* renamed from: t */
    private final C23254a f104108t = new C40086g(this);

    /* renamed from: u */
    private DmtTextView f104109u;

    /* renamed from: v */
    private DmtTextView f104110v;

    /* renamed from: w */
    private RelativeLayout f104111w;

    /* renamed from: x */
    private C29231b f104112x;

    /* renamed from: y */
    private int f104113y;

    /* renamed from: z */
    private FrameLayout f104114z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.a$a */
    public static final class C40080a {
        private C40080a() {
        }

        public /* synthetic */ C40080a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.a$b */
    public interface C40081b {
        /* renamed from: a */
        void mo99780a();

        /* renamed from: a */
        void mo99781a(String str, AVMusic aVMusic, boolean z);

        /* renamed from: b */
        void mo99782b();

        /* renamed from: c */
        void mo99783c();

        /* renamed from: d */
        void mo99784d();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.a$c */
    public static final class C40082c extends C34861a {

        /* renamed from: a */
        final /* synthetic */ C40079a f104115a;

        /* renamed from: a */
        public final void mo74767a() {
            this.f104115a.f104099j = true;
            C34860g gVar = this.f104115a.f104102m;
            if (gVar != null) {
                gVar.mo74767a();
            }
        }

        /* renamed from: d */
        public final void mo74768d() {
            this.f104115a.f104099j = false;
            C34860g gVar = this.f104115a.f104102m;
            if (gVar != null) {
                gVar.mo74768d();
            }
        }

        /* renamed from: b */
        public final void mo74847b() {
            C42593c cVar = this.f104115a.f104095f;
            if (cVar != null) {
                cVar.mo103884a(true);
            }
            C34860g gVar = this.f104115a.f104102m;
            if (gVar != null) {
                gVar.mo74847b();
            }
        }

        /* renamed from: c */
        public final void mo74769c() {
            C34860g gVar = this.f104115a.f104102m;
            if (gVar != null) {
                gVar.mo74769c();
            }
            C42593c cVar = this.f104115a.f104095f;
            if (cVar != null) {
                cVar.mo103894h();
            }
        }

        C40082c(C40079a aVar) {
            this.f104115a = aVar;
        }

        /* renamed from: b */
        public final void mo74848b(float f, int i, int i2) {
            C34860g gVar = this.f104115a.f104102m;
            if (gVar != null) {
                gVar.mo74848b(f, i, i2);
            }
        }

        /* renamed from: a */
        public final void mo74844a(float f, int i, int i2) {
            C34860g gVar = this.f104115a.f104102m;
            if (gVar != null) {
                gVar.mo74844a(f, i, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.a$d */
    static final class C40083d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40079a f104116a;

        C40083d(C40079a aVar) {
            this.f104116a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f104116a.mo99776d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.a$e */
    public static final class C40084e implements C42601a {

        /* renamed from: a */
        final /* synthetic */ C40079a f104117a;

        /* renamed from: a */
        public final void mo99786a() {
            this.f104117a.mo99776d();
        }

        /* renamed from: b */
        public final boolean mo99787b() {
            return this.f104117a.f104097h;
        }

        C40084e(C40079a aVar) {
            this.f104117a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.a$f */
    public static final class C40085f implements C42610h {

        /* renamed from: a */
        final /* synthetic */ C40079a f104118a;

        /* renamed from: a */
        public final void mo99788a() {
            C40081b bVar = this.f104118a.f104098i;
            if (bVar != null) {
                bVar.mo99780a();
            }
        }

        /* renamed from: b */
        public final void mo99790b() {
            C40081b bVar = this.f104118a.f104098i;
            if (bVar != null) {
                bVar.mo99784d();
            }
        }

        C40085f(C40079a aVar) {
            this.f104118a = aVar;
        }

        /* renamed from: a */
        public final void mo99789a(String str, AVMusic aVMusic, boolean z) {
            C40081b bVar = this.f104118a.f104098i;
            if (bVar != null) {
                bVar.mo99781a(str, aVMusic, z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.a$g */
    static final class C40086g implements C23254a {

        /* renamed from: a */
        final /* synthetic */ C40079a f104119a;

        C40086g(C40079a aVar) {
            this.f104119a = aVar;
        }

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f104119a.mo99776d();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.a$h */
    public static final class C40087h extends C40582c {

        /* renamed from: a */
        final /* synthetic */ C40079a f104120a;

        /* renamed from: a */
        public final void mo74767a() {
            View view = this.f104120a.f104101l;
            if (view != null) {
                view.setVisibility(0);
            }
            super.mo74767a();
        }

        C40087h(C40079a aVar) {
            this.f104120a = aVar;
        }
    }

    /* renamed from: b */
    public final void mo99774b() {
        C42593c cVar = this.f104095f;
        if (cVar != null) {
            cVar.mo103892e();
        }
    }

    /* renamed from: e */
    public final void mo99777e() {
        C42593c cVar = this.f104095f;
        if (cVar != null) {
            cVar.mo103875a();
        }
    }

    /* renamed from: a */
    public static int m128072a() {
        Integer b = C35563c.f93246i.mo103867e().mo103929p().mo103934b();
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo99776d() {
        C29231b bVar = this.f104112x;
        if (bVar != null) {
            bVar.mo74849b(new C40582c());
        }
        C23258e eVar = this.f104092c;
        if (eVar != null) {
            eVar.mo60526b(this.f104108t);
        }
    }

    /* renamed from: f */
    public final int mo99778f() {
        if (this.f104095f == null) {
            return 0;
        }
        C42593c cVar = this.f104095f;
        if (cVar == null) {
            C7573i.m23580a();
        }
        return cVar.mo103891d();
    }

    /* renamed from: c */
    public final void mo99775c() {
        FrameLayout frameLayout = this.f104091b;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            AppCompatActivity appCompatActivity = this.f104090a;
            if (appCompatActivity == null) {
                C7573i.m23583a("mActivity");
            }
            m128074a(appCompatActivity, frameLayout);
            View view = this.f104101l;
            if (view != null) {
                view.setVisibility(4);
            }
            C29231b bVar = this.f104112x;
            if (bVar != null) {
                bVar.mo74845a((C34856c) new C40087h(this));
            }
            C23258e eVar = this.f104092c;
            if (eVar != null) {
                eVar.mo60525a(this.f104108t);
            }
        }
    }

    /* renamed from: g */
    private final void m128075g() {
        View view = this.f104101l;
        if (view == null) {
            C7573i.m23580a();
        }
        this.f104111w = (RelativeLayout) view.findViewById(R.id.c1b);
        View view2 = this.f104101l;
        if (view2 == null) {
            C7573i.m23580a();
        }
        view2.findViewById(R.id.c26).setOnClickListener(new C40083d(this));
        View view3 = this.f104101l;
        if (view3 == null) {
            C7573i.m23580a();
        }
        this.f104110v = (DmtTextView) view3.findViewById(R.id.e52);
        View view4 = this.f104101l;
        if (view4 == null) {
            C7573i.m23580a();
        }
        this.f104109u = (DmtTextView) view4.findViewById(R.id.e59);
        View view5 = this.f104101l;
        if (view5 == null) {
            C7573i.m23580a();
        }
        this.f104103n = (ViewGroup) view5.findViewById(R.id.bqs);
        View view6 = this.f104101l;
        if (view6 == null) {
            C7573i.m23580a();
        }
        this.f104114z = (FrameLayout) view6.findViewById(R.id.cvd);
        DmtTextView dmtTextView = this.f104109u;
        if (dmtTextView == null) {
            C7573i.m23580a();
        }
        OnClickListener onClickListener = this;
        dmtTextView.setOnClickListener(onClickListener);
        DmtTextView dmtTextView2 = this.f104110v;
        if (dmtTextView2 == null) {
            C7573i.m23580a();
        }
        dmtTextView2.setOnClickListener(onClickListener);
        IAVMusicService iAVMusicService = C35563c.f93246i;
        AppCompatActivity appCompatActivity = this.f104090a;
        if (appCompatActivity == null) {
            C7573i.m23583a("mActivity");
        }
        this.f104095f = iAVMusicService.mo103846a(appCompatActivity, this.f104106q, (C42601a) new C40084e(this));
        C42593c cVar = this.f104095f;
        if (cVar != null) {
            cVar.mo103883a(this.f104093d);
        }
        C42593c cVar2 = this.f104095f;
        if (cVar2 != null) {
            AppCompatActivity appCompatActivity2 = this.f104090a;
            if (appCompatActivity2 == null) {
                C7573i.m23583a("mActivity");
            }
            cVar2.mo103876a(appCompatActivity2, this.f104114z);
        }
        C42593c cVar3 = this.f104095f;
        if (cVar3 != null) {
            cVar3.mo103877a(this.f104094e);
        }
        C42593c cVar4 = this.f104095f;
        if (cVar4 != null) {
            cVar4.mo103881a(this.f104096g);
        }
        C42593c cVar5 = this.f104095f;
        if (cVar5 != null) {
            cVar5.mo103880a(this.f104104o);
        }
        C42593c cVar6 = this.f104095f;
        if (cVar6 != null) {
            cVar6.mo103879a(this.f104105p);
        }
        C42593c cVar7 = this.f104095f;
        if (cVar7 != null) {
            cVar7.mo103878a((C42610h) new C40085f(this));
        }
    }

    /* renamed from: a */
    public final void mo99770a(AppCompatActivity appCompatActivity) {
        C7573i.m23587b(appCompatActivity, "<set-?>");
        this.f104090a = appCompatActivity;
    }

    /* renamed from: a */
    public final void mo99769a(int i) {
        C42593c cVar = this.f104095f;
        if (cVar != null) {
            cVar.mo103889c(i);
        }
    }

    /* renamed from: a */
    public final void mo99771a(C34860g gVar) {
        C7573i.m23587b(gVar, "transitionListener");
        this.f104102m = gVar;
    }

    /* renamed from: b */
    public final AVMusic mo99773b(int i) {
        if (C40088b.m128104a() == 2 && mo99778f() == 1) {
            C42593c cVar = this.f104095f;
            if (cVar != null) {
                return cVar.mo103874a(i);
            }
            return null;
        }
        C42593c cVar2 = this.f104095f;
        if (cVar2 != null) {
            return cVar2.mo103885b(i);
        }
        return null;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        int id = view.getId();
        if (id == R.id.e52) {
            m128073a(f104087A, true);
            return;
        }
        if (id == R.id.e59) {
            m128073a(f104088B, true);
        }
    }

    /* renamed from: a */
    public final void mo99772a(List<String> list) {
        this.f104093d = list;
        C42593c cVar = this.f104095f;
        if (cVar != null) {
            cVar.mo103883a(list);
        }
    }

    /* renamed from: a */
    private final void m128073a(int i, boolean z) {
        if (i != this.f104113y) {
            this.f104113y = i;
            if (this.f104113y == f104087A) {
                DmtTextView dmtTextView = this.f104110v;
                if (dmtTextView != null) {
                    dmtTextView.setSelected(true);
                }
                DmtTextView dmtTextView2 = this.f104109u;
                if (dmtTextView2 != null) {
                    dmtTextView2.setSelected(false);
                }
                ViewGroup viewGroup = this.f104103n;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                FrameLayout frameLayout = this.f104114z;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                DmtTextView dmtTextView3 = this.f104110v;
                if (dmtTextView3 != null) {
                    dmtTextView3.setSelected(false);
                }
                DmtTextView dmtTextView4 = this.f104109u;
                if (dmtTextView4 != null) {
                    dmtTextView4.setSelected(true);
                }
                ViewGroup viewGroup2 = this.f104103n;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                FrameLayout frameLayout2 = this.f104114z;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            }
            if (z) {
                if (this.f104113y == f104088B) {
                    C40081b bVar = this.f104098i;
                    if (bVar != null) {
                        bVar.mo99782b();
                    }
                } else {
                    C40081b bVar2 = this.f104098i;
                    if (bVar2 != null) {
                        bVar2.mo99783c();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m128074a(AppCompatActivity appCompatActivity, FrameLayout frameLayout) {
        int i;
        if (this.f104101l == null) {
            LayoutInflater from = LayoutInflater.from(appCompatActivity);
            if (C40088b.m128104a() == 0) {
                i = R.layout.gu;
            } else {
                i = R.layout.gv;
            }
            this.f104101l = from.inflate(i, frameLayout, false);
            m128075g();
            View view = this.f104101l;
            if (view == null) {
                C7573i.m23580a();
            }
            RelativeLayout relativeLayout = this.f104111w;
            if (relativeLayout == null) {
                C7573i.m23580a();
            }
            this.f104112x = new C29231b(frameLayout, view, relativeLayout);
            C29231b bVar = this.f104112x;
            if (bVar == null) {
                C7573i.m23580a();
            }
            bVar.mo74846a((C34860g) new C40082c(this));
            m128073a(f104087A, false);
            return;
        }
        C42593c cVar = this.f104095f;
        if (cVar != null) {
            AppCompatActivity appCompatActivity2 = this.f104090a;
            if (appCompatActivity2 == null) {
                C7573i.m23583a("mActivity");
            }
            cVar.mo103876a(appCompatActivity2, this.f104114z);
        }
    }
}
