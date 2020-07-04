package com.p280ss.android.ugc.gamora.recorder.control;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.scene.group.C12604b;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.p280ss.android.ugc.aweme.shortvideo.C39363dz;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39700b;
import com.p280ss.android.ugc.aweme.shortvideo.local.UploadButton;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41514ab;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41545b;
import com.p280ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.p280ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout;
import com.p280ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout.C41672a;
import com.p280ss.android.ugc.aweme.tools.C42151ar;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42583s;
import com.p280ss.android.ugc.aweme.tools.C42589y;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43058dj;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.recorder.C44456ah;
import com.p280ss.android.ugc.gamora.recorder.C44607d;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.localmedia.C44671a;
import com.p280ss.android.ugc.gamora.recorder.localmedia.C44671a.C44672a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.recorder.control.a */
public class C44535a extends C12604b implements C44396a {

    /* renamed from: j */
    static final /* synthetic */ C7595j[] f114815j = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44535a.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44535a.class), "recordControlViewModel", "getRecordControlViewModel()Lcom/ss/android/ugc/gamora/recorder/control/RecordControlViewModel;"))};

    /* renamed from: v */
    public static final C44536a f114816v = new C44536a(null);

    /* renamed from: A */
    private Dialog f114817A;

    /* renamed from: k */
    public C39382ed f114818k;

    /* renamed from: l */
    public ShortVideoContext f114819l;

    /* renamed from: m */
    public RecordLayout f114820m;

    /* renamed from: n */
    public TouchSensitiveRelativeLayout f114821n;

    /* renamed from: o */
    public ViewGroup f114822o;

    /* renamed from: p */
    public View f114823p;

    /* renamed from: q */
    public View f114824q;

    /* renamed from: r */
    protected ImageView f114825r;

    /* renamed from: s */
    protected UploadButton f114826s;

    /* renamed from: t */
    public int f114827t = C23486n.m77122a(40.0d);

    /* renamed from: u */
    public C44607d f114828u;

    /* renamed from: w */
    private final C7541d f114829w;

    /* renamed from: x */
    private SafeHandler f114830x;

    /* renamed from: y */
    private final C7541d f114831y;

    /* renamed from: z */
    private C43868d f114832z;

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$a */
    public static final class C44536a {
        private C44536a() {
        }

        public /* synthetic */ C44536a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$b */
    static final class C44537b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44535a f114833a;

        /* renamed from: b */
        final /* synthetic */ View f114834b;

        C44537b(C44535a aVar, View view) {
            this.f114833a = aVar;
            this.f114834b = view;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Lifecycle lifecycle = this.f114833a.mo29173d().getLifecycle();
            C7573i.m23582a((Object) lifecycle, "lifecycleOwner.lifecycle");
            if (lifecycle.mo54a() != State.DESTROYED) {
                C19282c.m63184a(C44535a.m140771b(this.f114833a).mo97961N(), "take_video_delete_popup", "confirm", 0, 0, C44535a.m140771b(this.f114833a).mo97966S());
                C22984d a = C22984d.m75611a().mo59973a("creation_id", C44535a.m140770a(this.f114833a).f99787w).mo59973a("shoot_way", C44535a.m140770a(this.f114833a).f99788x).mo59970a("draft_id", C44535a.m140770a(this.f114833a).f99790z);
                if (C44535a.m140770a(this.f114833a).f99779o) {
                    a.mo59973a("action_type", "reshoot");
                }
                C6907h.m21524a("delete_clip", (Map) a.f60753a);
                C42155av sVar = new C42583s();
                C44535a.m140771b(this.f114833a).mo97963P().mo103594a((Object) this.f114834b, sVar);
                C42156aw J = C44535a.m140771b(this.f114833a).mo97896J();
                if (J == null) {
                    C7573i.m23580a();
                }
                J.mo103594a((Object) this.f114834b, sVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$c */
    static final class C44538c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44535a f114835a;

        C44538c(C44535a aVar) {
            this.f114835a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Lifecycle lifecycle = this.f114835a.mo29173d().getLifecycle();
            C7573i.m23582a((Object) lifecycle, "lifecycleOwner.lifecycle");
            if (lifecycle.mo54a() != State.DESTROYED) {
                C19282c.m63184a(C44535a.m140771b(this.f114835a).mo97961N(), "take_video_delete_popup", "cancel", 0, 0, C44535a.m140771b(this.f114835a).mo97966S());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$d */
    static final class C44539d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44535a f114836a;

        C44539d(C44535a aVar) {
            this.f114836a = aVar;
        }

        public final void run() {
            C44607d dVar = this.f114836a.f114828u;
            if (dVar != null) {
                dVar.mo107043a(C44535a.m140776g(this.f114836a), 48);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$e */
    static final class C44540e extends Lambda implements C7562b<C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114837a;

        C44540e(C44535a aVar) {
            this.f114837a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m140807a((C7581n) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140807a(C7581n nVar) {
            C7573i.m23587b(nVar, "it");
            C44607d dVar = this.f114837a.f114828u;
            if (dVar != null && dVar.isShowing()) {
                C44607d dVar2 = this.f114837a.f114828u;
                if (dVar2 != null) {
                    dVar2.dismiss();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$f */
    static final class C44541f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44535a f114838a;

        C44541f(C44535a aVar) {
            this.f114838a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f114838a.mo96987K().mo106964i();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$g */
    static final class C44542g extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114839a;

        C44542g(C44535a aVar) {
            this.f114839a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140808a((C11585f) obj, (Boolean) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140808a(C11585f fVar, Boolean bool) {
            C7573i.m23587b(fVar, "$receiver");
            if (bool != null) {
                bool.booleanValue();
                C44535a.m140772c(this.f114839a).setEnabled(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$h */
    static final class C44543h extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114840a;

        C44543h(C44535a aVar) {
            this.f114840a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140809a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140809a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            C44535a.m140772c(this.f114840a).mo102362b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$i */
    static final class C44544i extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114841a;

        C44544i(C44535a aVar) {
            this.f114841a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140810a((C11585f) obj, (Integer) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140810a(C11585f fVar, Integer num) {
            C7573i.m23587b(fVar, "$receiver");
            if (num != null) {
                num.intValue();
                C44535a.m140772c(this.f114841a).setVisibility(num.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$j */
    static final class C44545j extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114842a;

        C44545j(C44535a aVar) {
            this.f114842a = aVar;
            super(2);
        }

        /* renamed from: a */
        private void m140811a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C44535a.m140772c(this.f114842a).f108367w = z;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140811a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$k */
    static final class C44546k extends Lambda implements C7563m<C11585f, Animation, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114843a;

        C44546k(C44535a aVar) {
            this.f114843a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140812a((C11585f) obj, (Animation) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140812a(C11585f fVar, Animation animation) {
            C7573i.m23587b(fVar, "$receiver");
            if (animation != null) {
                C9738o.m28713b((View) C44535a.m140772c(this.f114843a));
                C44535a.m140772c(this.f114843a).startAnimation(animation);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$l */
    static final class C44547l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44535a f114844a;

        C44547l(C44535a aVar) {
            this.f114844a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C44535a aVar = this.f114844a;
            C7573i.m23582a((Object) view, "it");
            aVar.mo107014a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$m */
    static final class C44548m extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114845a;

        C44548m(C44535a aVar) {
            this.f114845a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140813a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140813a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            C44535a.m140772c(this.f114845a).mo102359a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$n */
    static final class C44549n extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114846a;

        C44549n(C44535a aVar) {
            this.f114846a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140814a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140814a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                i = C23486n.m77122a(33.0d) + this.f114846a.f114827t;
            } else {
                i = this.f114846a.f114827t;
            }
            LayoutParams layoutParams = C44535a.m140772c(this.f114846a).getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = i;
                C44535a.m140772c(this.f114846a).setLayoutParams(layoutParams2);
                LayoutParams layoutParams3 = C44535a.m140773d(this.f114846a).getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.bottomMargin = i;
                    C44535a.m140773d(this.f114846a).setLayoutParams(layoutParams4);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$o */
    static final class C44550o extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114847a;

        C44550o(C44535a aVar) {
            this.f114847a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140815a((C11585f) obj, (Integer) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140815a(C11585f fVar, Integer num) {
            C7573i.m23587b(fVar, "$receiver");
            if (num != null) {
                num.intValue();
                C44535a.m140774e(this.f114847a).setVisibility(num.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$p */
    static final class C44551p extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114848a;

        C44551p(C44535a aVar) {
            this.f114848a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140816a((C11585f) obj, (Boolean) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140816a(C11585f fVar, Boolean bool) {
            C7573i.m23587b(fVar, "$receiver");
            if (bool != null) {
                bool.booleanValue();
                this.f114848a.mo107007L().setSelected(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$q */
    static final class C44552q extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114849a;

        C44552q(C44535a aVar) {
            this.f114849a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140817a((C11585f) obj, (Integer) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140817a(C11585f fVar, Integer num) {
            C7573i.m23587b(fVar, "$receiver");
            if (num != null) {
                num.intValue();
                this.f114849a.mo107007L().setVisibility(num.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$r */
    public static final class C44553r extends C42939as {

        /* renamed from: a */
        final /* synthetic */ C44535a f114850a;

        C44553r(C44535a aVar) {
            this.f114850a = aVar;
        }

        /* renamed from: a */
        public final void mo70606a(View view) {
            C7573i.m23587b(view, "v");
            if (!C44535a.m140770a(this.f114850a).f99779o || C44535a.m140770a(this.f114850a).mo96150k() >= C44535a.m140770a(this.f114850a).mo96155p()) {
                if (C44535a.m140770a(this.f114850a).f99779o) {
                    C39700b.m127033c(C44535a.m140770a(this.f114850a).mo96152m().size());
                }
                C41545b.m132307a().mo102188a("av_video_edit");
                C44535a.m140770a(this.f114850a).f99750ak = System.currentTimeMillis();
                C44535a.m140771b(this.f114850a).mo97963P().mo103594a((Object) C44535a.m140771b(this.f114850a), (C42155av) new C42151ar());
                C44535a.m140771b(this.f114850a).mo97896J().mo103594a((Object) this.f114850a.mo107007L(), (C42155av) new C42589y("click_next"));
                C41514ab a = C41514ab.m132244a();
                C7573i.m23582a((Object) a, "MemoryUtil.getInstance()");
                C41514ab a2 = C41514ab.m132244a();
                C7573i.m23582a((Object) a2, "MemoryUtil.getInstance()");
                C41514ab a3 = C41514ab.m132244a();
                C7573i.m23582a((Object) a3, "MemoryUtil.getInstance()");
                C41514ab a4 = C41514ab.m132244a();
                C7573i.m23582a((Object) a4, "MemoryUtil.getInstance()");
                C6907h.m21524a("av_memory_log", (Map) C22984d.m75611a().mo59973a("creation_id", C44535a.m140770a(this.f114850a).f99787w).mo59973a("enter_from", C44535a.m140770a(this.f114850a).f99789y).mo59971a("dalvikPss", a.f107964b).mo59971a("nativePss", a2.f107965c).mo59971a("otherPss", a3.f107967e).mo59971a("totalPss", a4.f107966d).f60753a);
                C43058dj.m136602a();
                return;
            }
            C10761a.m31409e((Context) this.f114850a.f33526d_, (int) R.string.axs).mo25750a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$s */
    static final class C44554s extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114851a;

        C44554s(C44535a aVar) {
            this.f114851a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140819a((C11585f) obj, (Integer) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140819a(C11585f fVar, Integer num) {
            C7573i.m23587b(fVar, "$receiver");
            if (num != null) {
                num.intValue();
                C44535a.m140775f(this.f114851a).setVisibility(num.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$t */
    static final class C44555t extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114852a;

        C44555t(C44535a aVar) {
            this.f114852a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140820a((C11585f) obj, (Integer) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140820a(C11585f fVar, Integer num) {
            C7573i.m23587b(fVar, "$receiver");
            if (num != null) {
                num.intValue();
                this.f114852a.mo107008M().setVisibility(num.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$u */
    static final class C44556u extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114853a;

        C44556u(C44535a aVar) {
            this.f114853a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140821a((C11585f) obj, (Boolean) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140821a(C11585f fVar, Boolean bool) {
            C7573i.m23587b(fVar, "$receiver");
            C44535a.m140773d(this.f114853a).setNoBlockTouchListener(new C41672a(this) {

                /* renamed from: a */
                final /* synthetic */ C44556u f114854a;

                {
                    this.f114854a = r1;
                }

                /* renamed from: a */
                public final void mo102417a() {
                    this.f114854a.f114853a.mo96987K().mo106963h();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$v */
    static final class C44558v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44535a f114855a;

        C44558v(C44535a aVar) {
            this.f114855a = aVar;
        }

        public final void run() {
            this.f114855a.mo107008M().mo99462b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$w */
    static final class C44559w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44535a f114856a;

        C44559w(C44535a aVar) {
            this.f114856a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Activity activity = C44535a.m140771b(this.f114856a).f33526d_;
            if (!(activity instanceof VideoRecordNewActivity)) {
                activity = null;
            }
            VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) activity;
            if (videoRecordNewActivity != null) {
                ASCameraView aSCameraView = videoRecordNewActivity.f107334t;
                if (aSCameraView != null) {
                    C20749b effectController = aSCameraView.getEffectController();
                    if (effectController != null) {
                        effectController.mo56116f(true);
                    }
                }
            }
            this.f114856a.mo31018y().mo31064a(C44671a.class, C44672a.m141058a(this.f114856a.mo107011P()));
            C6907h.m21519a(C44535a.m140771b(this.f114856a).mo97961N(), "upload_click", "shoot_page", "0", 0, new C6909j().mo16966a("enter_from", C44535a.m140770a(this.f114856a).f99788x).mo16967a());
            C6907h.m21524a("click_upload_entrance", (Map) C22984d.m75611a().mo59973a("creation_id", C44535a.m140770a(this.f114856a).f99787w).mo59973a("shoot_way", C44535a.m140770a(this.f114856a).f99788x).mo59970a("draft_id", C44535a.m140770a(this.f114856a).f99790z).mo59973a("enter_from", "video_shoot_page").f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$x */
    static final class C44560x extends Lambda implements C7563m<C11585f, Pair<? extends Integer, ? extends Boolean>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114857a;

        C44560x(C44535a aVar) {
            this.f114857a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140823a((C11585f) obj, (Pair) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140823a(C11585f fVar, Pair<Integer, Boolean> pair) {
            C7573i.m23587b(fVar, "$receiver");
            if (pair != null) {
                C44535a.m140772c(this.f114857a).mo102361a(((Number) pair.getFirst()).intValue(), ((Boolean) pair.getSecond()).booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.control.a$y */
    static final class C44561y extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44535a f114858a;

        C44561y(C44535a aVar) {
            this.f114858a = aVar;
            super(2);
        }

        /* renamed from: a */
        private void m140824a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            C44535a.m140772c(this.f114858a).mo102360a(i);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140824a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final RecordViewModel mo107006J() {
        return (RecordViewModel) this.f114829w.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final RecordControlViewModel mo96987K() {
        return (RecordControlViewModel) this.f114831y.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public int mo107009N() {
        return R.layout.b22;
    }

    /* renamed from: a */
    public final void mo107014a(View view) {
        if (this.f114817A != null) {
            Dialog dialog = this.f114817A;
            if (dialog == null) {
                C7573i.m23580a();
            }
            if (dialog.isShowing()) {
                return;
            }
        }
        Context context = view.getContext();
        String str = "take_video_delete_popup";
        String str2 = "show";
        C39382ed edVar = this.f114818k;
        if (edVar == null) {
            C7573i.m23583a("ownerHost");
        }
        C19282c.m63184a(context, str, str2, 0, 0, edVar.mo97966S());
        C39382ed edVar2 = this.f114818k;
        if (edVar2 == null) {
            C7573i.m23583a("ownerHost");
        }
        C10741a aVar = new C10741a(edVar2.mo97961N());
        C39382ed edVar3 = this.f114818k;
        if (edVar3 == null) {
            C7573i.m23583a("ownerHost");
        }
        aVar.mo25660b(edVar3.mo31017x().getString(R.string.any));
        C39382ed edVar4 = this.f114818k;
        if (edVar4 == null) {
            C7573i.m23583a("ownerHost");
        }
        C10741a a = aVar.mo25654a(edVar4.mo31017x().getString(R.string.anl), (OnClickListener) new C44537b(this, view));
        C39382ed edVar5 = this.f114818k;
        if (edVar5 == null) {
            C7573i.m23583a("ownerHost");
        }
        a.mo25661b(edVar5.mo31017x().getString(R.string.w_), (OnClickListener) new C44538c(this));
        this.f114817A = aVar.mo25656a().mo25637a();
        if (!C39805en.m127445a()) {
            C39382ed edVar6 = this.f114818k;
            if (edVar6 == null) {
                C7573i.m23583a("ownerHost");
            }
            if (!C22911a.m75401a(edVar6.f33526d_)) {
                C23487o.m77138a(this.f114817A);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: A */
    public final void mo30993A() {
        super.mo30993A();
        RecordLayout recordLayout = this.f114820m;
        if (recordLayout == null) {
            C7573i.m23583a("recordLayout");
        }
        recordLayout.mo102364c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final ImageView mo107007L() {
        ImageView imageView = this.f114825r;
        if (imageView == null) {
            C7573i.m23583a("goNextButton");
        }
        return imageView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final UploadButton mo107008M() {
        UploadButton uploadButton = this.f114826s;
        if (uploadButton == null) {
            C7573i.m23583a("uploadButton");
        }
        return uploadButton;
    }

    /* renamed from: Q */
    public final boolean mo107012Q() {
        RecordLayout recordLayout = this.f114820m;
        if (recordLayout == null) {
            C7573i.m23583a("recordLayout");
        }
        return recordLayout.f108367w;
    }

    /* renamed from: R */
    public final int mo107013R() {
        RecordLayout recordLayout = this.f114820m;
        if (recordLayout == null) {
            C7573i.m23583a("recordLayout");
        }
        return recordLayout.getCurrentScaleMode();
    }

    /* renamed from: C */
    public final void mo30995C() {
        super.mo30995C();
        if (this.f114817A != null) {
            Dialog dialog = this.f114817A;
            if (dialog == null) {
                C7573i.m23580a();
            }
            if (dialog.isShowing()) {
                Dialog dialog2 = this.f114817A;
                if (dialog2 == null) {
                    C7573i.m23580a();
                }
                C44562b.m140825a(dialog2);
            }
        }
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    public C44535a() {
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f114829w = C7546e.m23569a(new RecordControlScene$$special$$inlined$activityViewModel$1(this, a, a));
        C7584c a2 = C7575l.m23595a(RecordControlViewModel.class);
        this.f114831y = C7546e.m23569a(new RecordControlScene$$special$$inlined$activityViewModel$2(this, a2, a2));
    }

    /* renamed from: S */
    private final void mo107023S() {
        C44456ah ahVar = C44456ah.f114724a;
        Activity activity = this.f33526d_;
        if (activity != null) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            C0043i iVar = this;
            C43868d dVar = this.f114832z;
            if (dVar == null) {
                C7573i.m23583a("recordEnv");
            }
            Object value = dVar.mo106149h().getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            View view = this.f33523b;
            C7573i.m23582a((Object) view, "view");
            C44456ah.m140629a(ahVar, appCompatActivity, iVar, (C40994w) value, "default", view, null, 32, null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    /* renamed from: T */
    private final void mo107024T() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("extra_super_entrance_pop");
                if (!TextUtils.isEmpty(stringExtra)) {
                    if (this.f114828u == null) {
                        this.f114828u = new C44607d(this.f33526d_);
                    }
                    C44607d dVar = this.f114828u;
                    if (dVar != null) {
                        dVar.mo107044a(stringExtra);
                    }
                    C44607d dVar2 = this.f114828u;
                    if (dVar2 != null) {
                        dVar2.f114926j = -1;
                    }
                    C44607d dVar3 = this.f114828u;
                    if (dVar3 != null) {
                        dVar3.f114925i = true;
                    }
                    C44607d dVar4 = this.f114828u;
                    if (dVar4 != null) {
                        dVar4.mo107045a(true);
                    }
                    View view = this.f114823p;
                    if (view == null) {
                        C7573i.m23583a("ivTool");
                    }
                    view.postDelayed(new C44539d(this), 1000);
                    C42961az.m136380a(new SuperEntranceEvent(false));
                    mo96987K().m140469c(this, C44563c.f114859a, new C11672v(), new C44540e(this));
                }
            }
        }
    }

    /* renamed from: O */
    public final void mo107010O() {
        Activity activity = this.f33526d_;
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "activity!!");
        C10751a a = new C10752a(activity).mo25738b((int) R.string.e1f).mo25731a(3000).mo25737a();
        View view = this.f114823p;
        if (view == null) {
            C7573i.m23583a("ivTool");
        }
        View view2 = this.f114823p;
        if (view2 == null) {
            C7573i.m23583a("ivTool");
        }
        float measuredWidth = (float) (view2.getMeasuredWidth() / 2);
        Activity activity2 = this.f33526d_;
        if (activity2 == null) {
            C7573i.m23580a();
        }
        float b = measuredWidth - C9738o.m28708b((Context) activity2, 6.0f);
        View view3 = this.f114823p;
        if (view3 == null) {
            C7573i.m23583a("ivTool");
        }
        a.mo25717a(view, 48, b, (-view3.getMeasuredWidth()) / 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a3  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument mo107011P() {
        /*
            r14 = this;
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r14.f114819l
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            boolean r0 = r0.f99763ax
            r1 = 4
            if (r0 == 0) goto L_0x0013
            r0 = 1002(0x3ea, float:1.404E-42)
            r4 = 1002(0x3ea, float:1.404E-42)
            goto L_0x002a
        L_0x0013:
            java.lang.String r0 = "from_chat"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r14.f114819l
            if (r2 != 0) goto L_0x001e
            java.lang.String r3 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x001e:
            java.lang.String r2 = r2.f99789y
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r0 == 0) goto L_0x0028
            r4 = 4
            goto L_0x002a
        L_0x0028:
            r0 = -1
            r4 = -1
        L_0x002a:
            java.lang.String r0 = "single_song"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r14.f114819l
            if (r2 != 0) goto L_0x0035
            java.lang.String r3 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0035:
            java.lang.String r2 = r2.f99788x
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "task_platform"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r14.f114819l
            if (r5 != 0) goto L_0x004a
            java.lang.String r6 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x004a:
            java.lang.String r5 = r5.f99717V
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r5)
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "challenge"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r14.f114819l
            if (r5 != 0) goto L_0x005d
            java.lang.String r6 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r6)
        L_0x005d:
            java.lang.String r5 = r5.f99717V
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r5)
            if (r0 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r0 = 0
            goto L_0x0069
        L_0x0068:
            r0 = 1
        L_0x0069:
            if (r0 != 0) goto L_0x0073
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 != 0) goto L_0x0073
            r0 = 1
            goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            boolean r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r5 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.property.AVAB r5 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r6 = com.p280ss.android.ugc.aweme.property.AVAB.Property.PhotoMovieEnabled
            int r5 = r5.mo93306b(r6)
            if (r5 == 0) goto L_0x008b
            boolean r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r5 == 0) goto L_0x008b
        L_0x008a:
            r2 = 1
        L_0x008b:
            if (r0 == 0) goto L_0x008f
            r0 = 5
            goto L_0x0090
        L_0x008f:
            r0 = 4
        L_0x0090:
            if (r2 == 0) goto L_0x0094
            r0 = r0 | 2
        L_0x0094:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r14.f114819l
            if (r2 != 0) goto L_0x009d
            java.lang.String r5 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x009d:
            com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r2 = r2.f99762aw
            if (r2 == 0) goto L_0x00a3
            r5 = 4
            goto L_0x00a4
        L_0x00a3:
            r5 = r0
        L_0x00a4:
            int r0 = com.p280ss.android.ugc.gamora.recorder.localmedia.C44673b.m141059a()
            r1 = r5 & 1
            if (r1 != 0) goto L_0x00b5
            r1 = r5 & 2
            if (r1 == 0) goto L_0x00b5
            int r0 = com.p280ss.android.ugc.gamora.recorder.localmedia.C44673b.m141059a()
            int r0 = r0 + r3
        L_0x00b5:
            r10 = r0
            com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument r0 = new com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument
            r3 = 1
            r6 = 1
            r7 = 0
            long r8 = com.p280ss.android.ugc.aweme.shortvideo.C39810eq.m127460a()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d r1 = com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d.f104443a
            int r11 = r1.mo99941b()
            int r12 = com.p280ss.android.ugc.gamora.recorder.localmedia.C44673b.m141059a()
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e r1 = com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e.f101552a
            int r13 = r1.mo97469d()
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.recorder.control.C44535a.mo107011P():com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument");
    }

    /* renamed from: a */
    public static final /* synthetic */ ShortVideoContext m140770a(C44535a aVar) {
        ShortVideoContext shortVideoContext = aVar.f114819l;
        if (shortVideoContext == null) {
            C7573i.m23583a("shortVideoContext");
        }
        return shortVideoContext;
    }

    /* renamed from: b */
    public static final /* synthetic */ C39382ed m140771b(C44535a aVar) {
        C39382ed edVar = aVar.f114818k;
        if (edVar == null) {
            C7573i.m23583a("ownerHost");
        }
        return edVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ RecordLayout m140772c(C44535a aVar) {
        RecordLayout recordLayout = aVar.f114820m;
        if (recordLayout == null) {
            C7573i.m23583a("recordLayout");
        }
        return recordLayout;
    }

    /* renamed from: d */
    public static final /* synthetic */ TouchSensitiveRelativeLayout m140773d(C44535a aVar) {
        TouchSensitiveRelativeLayout touchSensitiveRelativeLayout = aVar.f114821n;
        if (touchSensitiveRelativeLayout == null) {
            C7573i.m23583a("recordTool");
        }
        return touchSensitiveRelativeLayout;
    }

    /* renamed from: e */
    public static final /* synthetic */ ViewGroup m140774e(C44535a aVar) {
        ViewGroup viewGroup = aVar.f114822o;
        if (viewGroup == null) {
            C7573i.m23583a("effectContainer");
        }
        return viewGroup;
    }

    /* renamed from: f */
    public static final /* synthetic */ View m140775f(C44535a aVar) {
        View view = aVar.f114824q;
        if (view == null) {
            C7573i.m23583a("deleteLast");
        }
        return view;
    }

    /* renamed from: g */
    public static final /* synthetic */ View m140776g(C44535a aVar) {
        View view = aVar.f114823p;
        if (view == null) {
            C7573i.m23583a("ivTool");
        }
        return view;
    }

    /* renamed from: e */
    public final void mo107015e(int i) {
        RecordLayout recordLayout = this.f114820m;
        if (recordLayout == null) {
            C7573i.m23583a("recordLayout");
        }
        recordLayout.setCurrentScaleMode(0);
    }

    /* renamed from: e */
    public void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Object b = mo30998F().mo31126b((Object) "owner");
        if (b == null) {
            C7573i.m23580a();
        }
        this.f114818k = (C39382ed) b;
        Object b2 = mo30998F().mo31126b((Object) "safe_handler");
        if (b2 == null) {
            C7573i.m23580a();
        }
        this.f114830x = (SafeHandler) b2;
        C39382ed edVar = this.f114818k;
        if (edVar == null) {
            C7573i.m23583a("ownerHost");
        }
        C0063u a = C0069x.m159a(edVar.mo97962O()).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ow…extViewModel::class.java)");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
        C7573i.m23582a((Object) shortVideoContext, "ViewModelProviders.of(ow…s.java).shortVideoContext");
        this.f114819l = shortVideoContext;
        Object b3 = mo30998F().mo31126b((Object) "record_env_context");
        if (b3 == null) {
            C7573i.m23580a();
        }
        this.f114832z = (C43868d) b3;
        View h_ = mo31004h_(R.id.co_);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.rdl_record)");
        this.f114820m = (RecordLayout) h_;
        View h_2 = mo31004h_(R.id.cut);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.rl_record_tool_bottom)");
        this.f114821n = (TouchSensitiveRelativeLayout) h_2;
        View h_3 = mo31004h_(R.id.acw);
        C7573i.m23582a((Object) h_3, "requireViewById(R.id.effect_container)");
        this.f114822o = (ViewGroup) h_3;
        View h_4 = mo31004h_(R.id.bd4);
        C7573i.m23582a((Object) h_4, "requireViewById(R.id.iv_tool)");
        this.f114823p = h_4;
        View h_5 = mo31004h_(R.id.b8b);
        C7573i.m23582a((Object) h_5, "requireViewById(R.id.iv_deleteLast)");
        this.f114824q = h_5;
        View h_6 = mo31004h_(R.id.qz);
        C7573i.m23582a((Object) h_6, "requireViewById(R.id.btn_next)");
        this.f114825r = (ImageView) h_6;
        View h_7 = mo31004h_(R.id.rw);
        C7573i.m23582a((Object) h_7, "requireViewById(R.id.btn_upload)");
        this.f114826s = (UploadButton) h_7;
        mo107023S();
        RecordLayout recordLayout = this.f114820m;
        if (recordLayout == null) {
            C7573i.m23583a("recordLayout");
        }
        recordLayout.setScaleGestureDetector((ScaleGestureDetector) mo30998F().mo31126b((Object) "scale_gesture_detector"));
        Activity activity = this.f33526d_;
        if (activity != null) {
            VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) activity;
            C39382ed edVar2 = this.f114818k;
            if (edVar2 == null) {
                C7573i.m23583a("ownerHost");
            }
            RecordLayout recordLayout2 = this.f114820m;
            if (recordLayout2 == null) {
                C7573i.m23583a("recordLayout");
            }
            new C39363dz(videoRecordNewActivity, edVar2, recordLayout2, new C44541f(this));
            View view = this.f114824q;
            if (view == null) {
                C7573i.m23583a("deleteLast");
            }
            view.setOnClickListener(new C44547l(this));
            ImageView imageView = this.f114825r;
            if (imageView == null) {
                C7573i.m23583a("goNextButton");
            }
            imageView.setOnClickListener(new C44553r(this));
            ShortVideoContext shortVideoContext2 = this.f114819l;
            if (shortVideoContext2 == null) {
                C7573i.m23583a("shortVideoContext");
            }
            if (!shortVideoContext2.mo96142d()) {
                ShortVideoContext shortVideoContext3 = this.f114819l;
                if (shortVideoContext3 == null) {
                    C7573i.m23583a("shortVideoContext");
                }
                if (!shortVideoContext3.mo96144e()) {
                    SafeHandler safeHandler = this.f114830x;
                    if (safeHandler == null) {
                        C7573i.m23583a("handler");
                    }
                    safeHandler.post(new C44558v(this));
                    UploadButton uploadButton = this.f114826s;
                    if (uploadButton == null) {
                        C7573i.m23583a("uploadButton");
                    }
                    uploadButton.setOnClickListener(new C44559w(this));
                    mo29062a(mo96987K(), C44577q.f114873a, C11640h.m34110a(), new C44560x(this));
                    mo91869c(mo96987K(), C44578r.f114874a, new C11672v(), new C44561y(this));
                    mo29062a(mo96987K(), C44564d.f114860a, C11640h.m34110a(), new C44542g(this));
                    mo91869c(mo96987K(), C44565e.f114861a, new C11672v(), new C44543h(this));
                    mo29062a(mo96987K(), C44566f.f114862a, C11640h.m34110a(), new C44544i(this));
                    mo91869c(mo96987K(), C44567g.f114863a, new C11672v(), new C44545j(this));
                    mo29062a(mo96987K(), C44568h.f114864a, C11640h.m34110a(), new C44546k(this));
                    mo91869c(mo96987K(), C44569i.f114865a, new C11672v(), new C44548m(this));
                    mo91870d(mo107006J(), C44570j.f114866a, new C11672v(), new C44549n(this));
                    mo29062a(mo96987K(), C44571k.f114867a, C11640h.m34110a(), new C44550o(this));
                    mo29062a(mo96987K(), C44572l.f114868a, C11640h.m34110a(), new C44551p(this));
                    mo29062a(mo96987K(), C44573m.f114869a, C11640h.m34110a(), new C44552q(this));
                    mo29062a(mo96987K(), C44574n.f114870a, C11640h.m34110a(), new C44554s(this));
                    mo29062a(mo96987K(), C44575o.f114871a, C11640h.m34110a(), new C44555t(this));
                    mo29062a(mo96987K(), C44576p.f114872a, C11640h.m34110a(), new C44556u(this));
                    mo107024T();
                    return;
                }
            }
            UploadButton uploadButton2 = this.f114826s;
            if (uploadButton2 == null) {
                C7573i.m23583a("uploadButton");
            }
            uploadButton2.setVisibility(4);
            mo29062a(mo96987K(), C44577q.f114873a, C11640h.m34110a(), new C44560x(this));
            mo91869c(mo96987K(), C44578r.f114874a, new C11672v(), new C44561y(this));
            mo29062a(mo96987K(), C44564d.f114860a, C11640h.m34110a(), new C44542g(this));
            mo91869c(mo96987K(), C44565e.f114861a, new C11672v(), new C44543h(this));
            mo29062a(mo96987K(), C44566f.f114862a, C11640h.m34110a(), new C44544i(this));
            mo91869c(mo96987K(), C44567g.f114863a, new C11672v(), new C44545j(this));
            mo29062a(mo96987K(), C44568h.f114864a, C11640h.m34110a(), new C44546k(this));
            mo91869c(mo96987K(), C44569i.f114865a, new C11672v(), new C44548m(this));
            mo91870d(mo107006J(), C44570j.f114866a, new C11672v(), new C44549n(this));
            mo29062a(mo96987K(), C44571k.f114867a, C11640h.m34110a(), new C44550o(this));
            mo29062a(mo96987K(), C44572l.f114868a, C11640h.m34110a(), new C44551p(this));
            mo29062a(mo96987K(), C44573m.f114869a, C11640h.m34110a(), new C44552q(this));
            mo29062a(mo96987K(), C44574n.f114870a, C11640h.m34110a(), new C44554s(this));
            mo29062a(mo96987K(), C44575o.f114871a, C11640h.m34110a(), new C44555t(this));
            mo29062a(mo96987K(), C44576p.f114872a, C11640h.m34110a(), new C44556u(this));
            mo107024T();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: b */
    public final ViewGroup mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(mo107009N(), viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
