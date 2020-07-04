package com.p280ss.android.ugc.aweme.shortvideo.cut.p1552a;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.os.Handler;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.scene.C37299a;
import com.p280ss.android.ugc.aweme.services.cutvideo.CutVideoView;
import com.p280ss.android.ugc.aweme.services.cutvideo.ICutVideo;
import com.p280ss.android.ugc.aweme.services.cutvideo.IDisplayVideo;
import com.p280ss.android.ugc.aweme.services.cutvideo.IDisplayVideoInternal;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38776l;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.C39293a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.b */
public final class C38742b implements OnClickListener, IDisplayVideo, IDisplayVideoInternal, C38776l {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f100679a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38742b.class), "presenter", "getPresenter()Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoPresenter;"))};

    /* renamed from: b */
    public C38729a f100680b;

    /* renamed from: c */
    public ImageView f100681c;

    /* renamed from: d */
    public final Handler f100682d = new Handler();

    /* renamed from: e */
    public final C38745c f100683e = new C38745c(this);

    /* renamed from: f */
    private Context f100684f;

    /* renamed from: g */
    private SurfaceView f100685g;

    /* renamed from: h */
    private int f100686h;

    /* renamed from: i */
    private final C7541d f100687i = C7546e.m23569a(new C38744b(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.b$a */
    static final class C38743a<T> implements C0053p<C39293a> {

        /* renamed from: a */
        final /* synthetic */ C38742b f100688a;

        C38743a(C38742b bVar) {
            this.f100688a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C39293a aVar) {
            Integer num;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f102021c);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                if (this.f100688a.mo96826a().mo96748c()) {
                    C38742b.m123728a(this.f100688a).setVisibility(8);
                    this.f100688a.f100682d.post(this.f100688a.f100683e);
                }
            } else if (num != null && num.intValue() == 2) {
                if (aVar.f102022d) {
                    C38742b.m123728a(this.f100688a).setVisibility(0);
                }
                this.f100688a.f100682d.removeCallbacks(this.f100688a.f100683e);
            } else if (num != null && num.intValue() == 3) {
                this.f100688a.f100682d.removeCallbacks(this.f100688a.f100683e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.b$b */
    static final class C38744b extends Lambda implements C7561a<VECutVideoPresenter> {

        /* renamed from: a */
        final /* synthetic */ C38742b f100689a;

        C38744b(C38742b bVar) {
            this.f100689a = bVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public VECutVideoPresenter invoke() {
            String b = Workspace.m122805b();
            C7573i.m23582a((Object) b, "Workspace.getImportDir()");
            return new VECutVideoPresenter(b, this.f100689a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.b$c */
    public static final class C38745c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38742b f100690a;

        public final void run() {
            long b = this.f100690a.mo96826a().mo96747b();
            if (b > 0) {
                C38742b.m123729b(this.f100690a).mo96823c().mo96666a(b, C38742b.m123729b(this.f100690a).mo96824d().mo97720m(), C38742b.m123729b(this.f100690a).mo96824d().mo97722o());
            }
            this.f100690a.f100682d.postDelayed(this, 30);
        }

        C38745c(C38742b bVar) {
            this.f100690a = bVar;
        }
    }

    /* renamed from: a */
    public final VECutVideoPresenter mo96826a() {
        return (VECutVideoPresenter) this.f100687i.getValue();
    }

    /* renamed from: a */
    public final void mo96691a(C15389d dVar) {
    }

    public final IDisplayVideo getProxy() {
        return this;
    }

    /* renamed from: p */
    public final void mo96707p() {
    }

    /* renamed from: q */
    public final void mo96708q() {
    }

    /* renamed from: r */
    public final void mo96709r() {
    }

    /* renamed from: s */
    public final int mo96710s() {
        return this.f100686h;
    }

    public final void setProxy(IDisplayVideo iDisplayVideo) {
        C7573i.m23587b(iDisplayVideo, "proxy");
    }

    /* renamed from: b */
    public final VECutVideoPresenter mo96827b() {
        return mo96826a();
    }

    /* renamed from: K */
    public final SurfaceView mo96766K() {
        SurfaceView surfaceView = this.f100685g;
        if (surfaceView == null) {
            C7573i.m23583a("surfaceView");
        }
        return surfaceView;
    }

    /* renamed from: n */
    public final Context mo96704n() {
        Context context = this.f100684f;
        if (context == null) {
            C7573i.m23583a("context");
        }
        return context;
    }

    /* renamed from: o */
    public final C0043i mo96705o() {
        Context context = this.f100684f;
        if (context == null) {
            C7573i.m23583a("context");
        }
        Activity a = C37299a.m119788a(context);
        if (a != null) {
            return (FragmentActivity) a;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: t */
    public final long mo96711t() {
        C38729a aVar = this.f100680b;
        if (aVar == null) {
            C7573i.m23583a("cutVideoView");
        }
        return aVar.mo96821a().getMaxCutDuration();
    }

    /* renamed from: u */
    public final C0902i<Long, Long> mo96712u() {
        C38729a aVar = this.f100680b;
        if (aVar == null) {
            C7573i.m23583a("cutVideoView");
        }
        C0902i<Long, Long> playBoundary = aVar.mo96821a().getPlayBoundary();
        C7573i.m23582a((Object) playBoundary, "cutVideoView.getVideoEditView().playBoundary");
        return playBoundary;
    }

    /* renamed from: v */
    public final void mo96713v() {
        C38729a aVar = this.f100680b;
        if (aVar == null) {
            C7573i.m23583a("cutVideoView");
        }
        aVar.mo96821a().mo97635b();
    }

    /* renamed from: c */
    private final void m123730c() {
        C38729a aVar = this.f100680b;
        if (aVar == null) {
            C7573i.m23583a("cutVideoView");
        }
        C0052o a = aVar.mo96822b().mo97801a();
        Context context = this.f100684f;
        if (context == null) {
            C7573i.m23583a("context");
        }
        Activity a2 = C37299a.m119788a(context);
        if (a2 != null) {
            a.observe((FragmentActivity) a2, new C38743a(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m123728a(C38742b bVar) {
        ImageView imageView = bVar.f100681c;
        if (imageView == null) {
            C7573i.m23583a("ivPlay");
        }
        return imageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ C38729a m123729b(C38742b bVar) {
        C38729a aVar = bVar.f100680b;
        if (aVar == null) {
            C7573i.m23583a("cutVideoView");
        }
        return aVar;
    }

    public final void setCutVideoView(CutVideoView cutVideoView) {
        C7573i.m23587b(cutVideoView, "cutVideoView");
        ICutVideo proxy = cutVideoView.getProxy();
        if (proxy != null) {
            this.f100680b = (C38729a) proxy;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.cover.CutVideoViewProxy");
    }

    public final void init(ViewGroup viewGroup) {
        if (viewGroup == null) {
            C7573i.m23580a();
        }
        Context context = viewGroup.getContext();
        C7573i.m23582a((Object) context, "parent!!.context");
        this.f100684f = context;
        Context context2 = this.f100684f;
        if (context2 == null) {
            C7573i.m23583a("context");
        }
        View inflate = LayoutInflater.from(context2).inflate(R.layout.b32, null, true);
        View findViewById = inflate.findViewById(R.id.ea6);
        C7573i.m23582a((Object) findViewById, "contentView.findViewById(R.id.videoSurface)");
        this.f100685g = (SurfaceView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.b5k);
        C7573i.m23582a((Object) findViewById2, "contentView.findViewById(R.id.ivPlay)");
        this.f100681c = (ImageView) findViewById2;
        SurfaceView surfaceView = this.f100685g;
        if (surfaceView == null) {
            C7573i.m23583a("surfaceView");
        }
        surfaceView.setOnClickListener(this);
        viewGroup.addView(inflate);
        VECutVideoPresenter a = mo96826a();
        Context context3 = viewGroup.getContext();
        C7573i.m23582a((Object) context3, "parent.context");
        Activity a2 = C37299a.m119788a(context3);
        if (a2 != null) {
            a.mo96737a((FragmentActivity) a2);
            m123730c();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void onClick(View view) {
        Integer num;
        C39293a aVar;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.ea6) {
            C38729a aVar2 = this.f100680b;
            if (aVar2 == null) {
                C7573i.m23583a("cutVideoView");
            }
            VEVideoCutterViewModel b = aVar2.mo96822b();
            if (mo96826a().mo96748c()) {
                aVar = new C39293a(2, false, 2, null);
            } else {
                aVar = new C39293a(1, false, 2, null);
            }
            b.mo97802a(aVar);
        }
    }
}
