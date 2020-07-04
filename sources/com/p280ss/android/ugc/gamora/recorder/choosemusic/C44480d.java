package com.p280ss.android.ugc.gamora.recorder.choosemusic;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11592h;
import com.bytedance.jedi.arch.C11592h.C11593a;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.shortvideo.C39348dm;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
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
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d */
public abstract class C44480d extends C12629j implements C11592h {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f114753i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44480d.class), "uiHandler", "getUiHandler()Lcom/ss/android/ugc/aweme/shortvideo/SafeHandler;"))};

    /* renamed from: p */
    public static final C44481a f114754p = new C44481a(null);

    /* renamed from: j */
    public boolean f114755j = true;

    /* renamed from: k */
    public C10751a f114756k;

    /* renamed from: l */
    public ImageView f114757l;

    /* renamed from: m */
    protected TextView f114758m;

    /* renamed from: n */
    protected RelativeLayout f114759n;

    /* renamed from: o */
    protected RecordChooseMusicViewModel f114760o;

    /* renamed from: q */
    private C44474a f114761q;

    /* renamed from: r */
    private final C7541d f114762r = C7546e.m23569a(new C44499r(this));

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$a */
    public static final class C44481a {
        private C44481a() {
        }

        public /* synthetic */ C44481a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$b */
    static final class C44482b implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C44480d f114763a;

        C44482b(C44480d dVar) {
            this.f114763a = dVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f114763a.mo106940P();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$c */
    static final class C44483c extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44480d f114764a;

        C44483c(C44480d dVar) {
            this.f114764a = dVar;
            super(2);
        }

        /* renamed from: a */
        private void m140700a(C11585f fVar, int i) {
            C7573i.m23587b(fVar, "$receiver");
            C44480d.m140673a(this.f114764a).setImageAlpha(i);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140700a((C11585f) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$d */
    static final class C44484d extends Lambda implements C7563m<C11585f, Float, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44480d f114765a;

        C44484d(C44480d dVar) {
            this.f114765a = dVar;
            super(2);
        }

        /* renamed from: a */
        private void m140701a(C11585f fVar, float f) {
            C7573i.m23587b(fVar, "$receiver");
            this.f114765a.mo30920G().setAlpha(f);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140701a((C11585f) obj, ((Number) obj2).floatValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$e */
    static final class C44485e extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44480d f114766a;

        C44485e(C44480d dVar) {
            this.f114766a = dVar;
            super(2);
        }

        /* renamed from: a */
        private void m140702a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            this.f114766a.mo106936L().setClickable(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140702a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$f */
    static final class C44486f<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C44480d f114767a;

        C44486f(C44480d dVar) {
            this.f114767a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f114767a.mo106940P();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$g */
    static final class C44487g<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ C44480d f114768a;

        C44487g(C44480d dVar) {
            this.f114768a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                C44480d dVar = this.f114768a;
                C7573i.m23582a((Object) num, "type");
                dVar.mo106943d(num.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$h */
    static final class C44488h<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C44480d f114769a;

        C44488h(C44480d dVar) {
            this.f114769a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f114769a.mo106941Q();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$i */
    static final class C44489i<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44480d f114770a;

        C44489i(C44480d dVar) {
            this.f114770a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C44480d dVar = this.f114770a;
                C7573i.m23582a((Object) bool, "it");
                dVar.mo106942a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$j */
    static final class C44490j extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44480d f114771a;

        C44490j(C44480d dVar) {
            this.f114771a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140707a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140707a(C11585f fVar, boolean z) {
            int i;
            C7573i.m23587b(fVar, "$receiver");
            ImageView a = C44480d.m140673a(this.f114771a);
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            a.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$k */
    static final class C44491k extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44480d f114772a;

        C44491k(C44480d dVar) {
            this.f114772a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140708a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140708a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (!z || !this.f114772a.f114755j) {
                this.f114772a.mo30920G().setVisibility(8);
                return;
            }
            this.f114772a.mo30920G().setVisibility(0);
            this.f114772a.mo106935J().post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C44491k f114773a;

                {
                    this.f114773a = r1;
                }

                public final void run() {
                    this.f114773a.f114772a.mo30920G().requestFocus();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$l */
    static final class C44493l extends Lambda implements C7563m<C11585f, Drawable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44480d f114774a;

        C44493l(C44480d dVar) {
            this.f114774a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140709a((C11585f) obj, (Drawable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140709a(C11585f fVar, Drawable drawable) {
            C7573i.m23587b(fVar, "$receiver");
            if (drawable != null) {
                C44480d.m140673a(this.f114774a).setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$m */
    static final class C44494m extends Lambda implements C7563m<C11585f, String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44480d f114775a;

        C44494m(C44480d dVar) {
            this.f114775a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140710a((C11585f) obj, (String) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140710a(C11585f fVar, String str) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(str, "it");
            this.f114775a.mo30920G().setText(str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$n */
    static final class C44495n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44480d f114776a;

        C44495n(C44480d dVar) {
            this.f114776a = dVar;
        }

        public final void run() {
            this.f114776a.mo30920G().requestFocus();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$o */
    static final class C44496o implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44480d f114777a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f114778b;

        C44496o(C44480d dVar, ShortVideoContext shortVideoContext) {
            this.f114777a = dVar;
            this.f114778b = shortVideoContext;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C27326a.m89578a(view)) {
                C6907h.m21524a("change_music", (Map) C22984d.m75611a().mo59973a("creation_id", this.f114778b.f99787w).mo59973a("shoot_way", this.f114778b.f99788x).mo59970a("draft_id", this.f114778b.f99790z).mo59973a("enter_from", "video_shoot_page").f60753a);
                RecordChooseMusicViewModel I = this.f114777a.mo30922I();
                Activity activity = this.f114777a.f33526d_;
                if (activity != null) {
                    I.mo106926a((Activity) (FragmentActivity) activity);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$p */
    static final class C44497p implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContext f114779a;

        C44497p(ShortVideoContext shortVideoContext) {
            this.f114779a = shortVideoContext;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("change_music_grey", (Map) C22984d.m75611a().mo59973a("creation_id", this.f114779a.f99787w).mo59973a("shoot_way", this.f114779a.f99788x).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$q */
    static final class C44498q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10751a f114780a;

        /* renamed from: b */
        final /* synthetic */ C44480d f114781b;

        C44498q(C10751a aVar, C44480d dVar) {
            this.f114780a = aVar;
            this.f114781b = dVar;
        }

        public final void run() {
            if (this.f114781b.f33526d_ != null) {
                Activity activity = this.f114781b.f33526d_;
                if (activity == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) activity, "activity!!");
                if (!activity.isFinishing()) {
                    Pair N = this.f114781b.mo106938N();
                    this.f114780a.mo25718a(this.f114781b.mo30920G(), ((Number) N.getFirst()).intValue(), ((int[]) N.getSecond())[0], ((int[]) N.getSecond())[1], (float) ((int[]) N.getSecond())[2]);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$r */
    static final class C44499r extends Lambda implements C7561a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ C44480d f114782a;

        C44499r(C44480d dVar) {
            this.f114782a = dVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SafeHandler invoke() {
            return new SafeHandler(this.f114782a);
        }
    }

    /* renamed from: J */
    public final SafeHandler mo106935J() {
        return (SafeHandler) this.f114762r.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public abstract int mo96987K();

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public abstract View mo106936L();

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public abstract boolean mo106937M();

    /* renamed from: a */
    public void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        View h_ = mo31004h_(R.id.cun);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.rl_music_container)");
        this.f114759n = (RelativeLayout) h_;
        View h_2 = mo31004h_(R.id.b7a);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.iv_choose_music)");
        this.f114757l = (ImageView) h_2;
        View h_3 = mo31004h_(R.id.drt);
        C7573i.m23582a((Object) h_3, "requireViewById(R.id.tv_choose_music)");
        this.f114758m = (TextView) h_3;
        mo106935J().post(new C44495n(this));
        if (C6399b.m19944t() && mo106937M()) {
            Typeface a = C10832b.m31784a().mo26161a(C10834d.f29337g);
            if (a != null) {
                TextView textView = this.f114758m;
                if (textView == null) {
                    C7573i.m23583a("tvChooseMusic");
                }
                textView.setTypeface(a);
            }
        }
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity).mo91871a(RecordChooseMusicViewModel.class);
            C7573i.m23582a((Object) a2, "JediViewModelProviders.o…sicViewModel::class.java)");
            this.f114760o = (RecordChooseMusicViewModel) a2;
            mo106939O();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo106942a(boolean z) {
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(ShortVideoContextViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
            if (z) {
                mo106936L().setOnClickListener(new C44496o(this, shortVideoContext));
            } else {
                mo106936L().setOnClickListener(new C44497p(shortVideoContext));
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public C11585f mo29191e() {
        return C11593a.m34077d(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C11593a.m34068a(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C11593a.m34075b(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C11593a.m34078e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C11593a.m34076c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final TextView mo30920G() {
        TextView textView = this.f114758m;
        if (textView == null) {
            C7573i.m23583a("tvChooseMusic");
        }
        return textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final RelativeLayout mo30921H() {
        RelativeLayout relativeLayout = this.f114759n;
        if (relativeLayout == null) {
            C7573i.m23583a("chooseMusicContainer");
        }
        return relativeLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final RecordChooseMusicViewModel mo30922I() {
        RecordChooseMusicViewModel recordChooseMusicViewModel = this.f114760o;
        if (recordChooseMusicViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        return recordChooseMusicViewModel;
    }

    /* renamed from: P */
    public final void mo106940P() {
        C10751a aVar = this.f114756k;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: Q */
    public final void mo106941Q() {
        m140670R();
        C44474a aVar = this.f114761q;
        if (aVar != null) {
            aVar.mo97916a(true);
        }
    }

    /* renamed from: R */
    private final void m140670R() {
        if (this.f114761q == null) {
            Activity activity = this.f33526d_;
            if (activity != null) {
                this.f114761q = new C39348dm((FragmentActivity) activity);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: S */
    private final void m140671S() {
        TextView textView = this.f114758m;
        if (textView == null) {
            C7573i.m23583a("tvChooseMusic");
        }
        textView.setOnTouchListener(new C44482b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public Pair<Integer, int[]> mo106938N() {
        int i;
        int i2;
        int[] iArr = new int[2];
        TextView textView = this.f114758m;
        if (textView == null) {
            C7573i.m23583a("tvChooseMusic");
        }
        textView.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        TextView textView2 = this.f114758m;
        if (textView2 == null) {
            C7573i.m23583a("tvChooseMusic");
        }
        int measuredWidth = textView2.getMeasuredWidth();
        C10751a aVar = this.f114756k;
        if (aVar != null) {
            i = aVar.mo25724d();
        } else {
            i = 0;
        }
        int i4 = i3 + ((measuredWidth - i) / 2);
        float f = (float) iArr[1];
        TextView textView3 = this.f114758m;
        if (textView3 == null) {
            C7573i.m23583a("tvChooseMusic");
        }
        float measuredHeight = (float) textView3.getMeasuredHeight();
        Activity activity = this.f33526d_;
        if (activity == null) {
            C7573i.m23580a();
        }
        int b = (int) (f + (measuredHeight - C9738o.m28708b((Context) activity, 10.0f)));
        C10751a aVar2 = this.f114756k;
        if (aVar2 != null) {
            i2 = aVar2.mo25724d();
        } else {
            i2 = 0;
        }
        int i5 = i2 / 2;
        return new Pair<>(Integer.valueOf(80), new int[]{i4, b, i5});
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo106939O() {
        RecordChooseMusicViewModel recordChooseMusicViewModel = this.f114760o;
        if (recordChooseMusicViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        mo29062a(recordChooseMusicViewModel, C44500e.f114783a, C11640h.m34110a(), new C44490j(this));
        RecordChooseMusicViewModel recordChooseMusicViewModel2 = this.f114760o;
        if (recordChooseMusicViewModel2 == null) {
            C7573i.m23583a("viewModel");
        }
        mo29062a(recordChooseMusicViewModel2, C44503h.f114786a, C11640h.m34110a(), new C44491k(this));
        RecordChooseMusicViewModel recordChooseMusicViewModel3 = this.f114760o;
        if (recordChooseMusicViewModel3 == null) {
            C7573i.m23583a("viewModel");
        }
        mo29062a(recordChooseMusicViewModel3, C44504i.f114787a, C11640h.m34110a(), new C44493l(this));
        RecordChooseMusicViewModel recordChooseMusicViewModel4 = this.f114760o;
        if (recordChooseMusicViewModel4 == null) {
            C7573i.m23583a("viewModel");
        }
        mo29062a(recordChooseMusicViewModel4, C44505j.f114788a, C11640h.m34110a(), new C44494m(this));
        RecordChooseMusicViewModel recordChooseMusicViewModel5 = this.f114760o;
        if (recordChooseMusicViewModel5 == null) {
            C7573i.m23583a("viewModel");
        }
        mo29062a(recordChooseMusicViewModel5, C44506k.f114789a, C11640h.m34110a(), new C44483c(this));
        RecordChooseMusicViewModel recordChooseMusicViewModel6 = this.f114760o;
        if (recordChooseMusicViewModel6 == null) {
            C7573i.m23583a("viewModel");
        }
        mo29062a(recordChooseMusicViewModel6, C44501f.f114784a, C11640h.m34110a(), new C44484d(this));
        RecordChooseMusicViewModel recordChooseMusicViewModel7 = this.f114760o;
        if (recordChooseMusicViewModel7 == null) {
            C7573i.m23583a("viewModel");
        }
        mo29062a(recordChooseMusicViewModel7, C44502g.f114785a, C11640h.m34110a(), new C44485e(this));
        RecordChooseMusicViewModel recordChooseMusicViewModel8 = this.f114760o;
        if (recordChooseMusicViewModel8 == null) {
            C7573i.m23583a("viewModel");
        }
        C0043i iVar = this;
        recordChooseMusicViewModel8.f114732d.observe(iVar, new C44486f(this));
        RecordChooseMusicViewModel recordChooseMusicViewModel9 = this.f114760o;
        if (recordChooseMusicViewModel9 == null) {
            C7573i.m23583a("viewModel");
        }
        recordChooseMusicViewModel9.f114733e.observe(iVar, new C44487g(this));
        RecordChooseMusicViewModel recordChooseMusicViewModel10 = this.f114760o;
        if (recordChooseMusicViewModel10 == null) {
            C7573i.m23583a("viewModel");
        }
        recordChooseMusicViewModel10.f114734f.observe(iVar, new C44488h(this));
        RecordChooseMusicViewModel recordChooseMusicViewModel11 = this.f114760o;
        if (recordChooseMusicViewModel11 == null) {
            C7573i.m23583a("viewModel");
        }
        recordChooseMusicViewModel11.f114735g.observe(iVar, new C44489i(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m140673a(C44480d dVar) {
        ImageView imageView = dVar.f114757l;
        if (imageView == null) {
            C7573i.m23583a("ivChooseMusic");
        }
        return imageView;
    }

    /* renamed from: d */
    public final void mo106943d(int i) {
        m140670R();
        C10751a aVar = null;
        if (i == 1) {
            C44474a aVar2 = this.f114761q;
            if (aVar2 != null) {
                aVar = aVar2.mo97915a();
            }
        } else {
            C44474a aVar3 = this.f114761q;
            if (aVar3 != null) {
                aVar = aVar3.mo97917b();
            }
        }
        this.f114756k = aVar;
        C10751a aVar4 = this.f114756k;
        if (aVar4 != null) {
            mo106935J().post(new C44498q(aVar4, this));
        }
        m140671S();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C11593a.m34074a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(mo96987K(), viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(getLayo…esId(), container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34069a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34070a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C11593a.m34072a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C11593a.m34071a(this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
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
        return C11593a.m34073a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
