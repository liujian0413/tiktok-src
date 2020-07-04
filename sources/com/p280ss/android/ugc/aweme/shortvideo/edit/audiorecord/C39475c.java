package com.p280ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import bolts.C1592h;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p280ss.android.ugc.aweme.audiorecord.Point;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.effect.C27439r;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover.C40154a;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover.C40161f;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.widget.C41706n;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.Adapter;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.ugc.gamora.editor.EditAudioRecordModel;
import com.p280ss.android.ugc.gamora.editor.EditPreviewViewModel;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47516v;
import dmt.p1861av.video.C47518x;
import dmt.p1861av.video.C47518x.C47519a;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c */
public final class C39475c extends C12629j implements C6310a {

    /* renamed from: J */
    public static final C39476a f102476J = new C39476a(null);

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f102477i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C39475c.class), "processTimeLiveData", "getProcessTimeLiveData()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C39475c.class), "needOriginalSoundLiveData", "getNeedOriginalSoundLiveData()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: A */
    public AVDmtTextView f102478A;

    /* renamed from: B */
    public C39499e f102479B;

    /* renamed from: C */
    public AudioRecorderParam f102480C;

    /* renamed from: D */
    public volatile boolean f102481D;

    /* renamed from: E */
    public final C6309f f102482E;

    /* renamed from: F */
    public final int f102483F;

    /* renamed from: G */
    public final int f102484G;

    /* renamed from: H */
    public final int f102485H;

    /* renamed from: I */
    public final C39491p f102486I;

    /* renamed from: K */
    private final float f102487K = 52.0f;

    /* renamed from: L */
    private final float f102488L = 224.0f;

    /* renamed from: M */
    private final float f102489M = 16.0f;

    /* renamed from: N */
    private final C7541d f102490N = C7546e.m23569a(C39492q.f102546a);

    /* renamed from: O */
    private final C7541d f102491O = C7546e.m23569a(C39488m.f102542a);

    /* renamed from: P */
    private int f102492P = -1;

    /* renamed from: Q */
    private C23258e f102493Q;

    /* renamed from: R */
    private VEVideoPublishEditViewModel f102494R;

    /* renamed from: S */
    private EditAudioRecordModel f102495S;

    /* renamed from: T */
    private EditPreviewViewModel f102496T;

    /* renamed from: U */
    private View f102497U;

    /* renamed from: V */
    private DmtStatusView f102498V;

    /* renamed from: W */
    private View f102499W;

    /* renamed from: X */
    private EditViewModel f102500X;

    /* renamed from: Y */
    private FrameLayout f102501Y;

    /* renamed from: Z */
    private ChooseVideoCoverView f102502Z;

    /* renamed from: aa */
    private View f102503aa;

    /* renamed from: ab */
    private ViewGroup f102504ab;

    /* renamed from: ac */
    private LottieAnimationView f102505ac;

    /* renamed from: ad */
    private CheckBox f102506ad;

    /* renamed from: ae */
    private VEVideoCoverGeneratorImpl f102507ae;

    /* renamed from: af */
    private C41706n f102508af;

    /* renamed from: ag */
    private C0052o<Bitmap> f102509ag;

    /* renamed from: ah */
    private C0052o<Boolean> f102510ah;

    /* renamed from: ai */
    private final C39487l f102511ai;

    /* renamed from: aj */
    private final C39479d f102512aj;

    /* renamed from: j */
    public C15389d f102513j;

    /* renamed from: k */
    public int f102514k = 1;

    /* renamed from: l */
    public float f102515l;

    /* renamed from: m */
    public final ValueAnimator f102516m;

    /* renamed from: n */
    public boolean f102517n;

    /* renamed from: o */
    public boolean f102518o;

    /* renamed from: p */
    public Point f102519p;

    /* renamed from: q */
    public VideoPublishEditModel f102520q;

    /* renamed from: r */
    public C0052o<C47516v> f102521r;

    /* renamed from: s */
    public View f102522s;

    /* renamed from: t */
    public View f102523t;

    /* renamed from: u */
    public View f102524u;

    /* renamed from: v */
    public C39472b f102525v;

    /* renamed from: w */
    public AudioRecordStartButton f102526w;

    /* renamed from: x */
    public boolean f102527x;

    /* renamed from: y */
    public boolean f102528y;

    /* renamed from: z */
    public View f102529z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$a */
    public static final class C39476a {
        private C39476a() {
        }

        public /* synthetic */ C39476a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$b */
    static final class C39477b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Runnable f102530a;

        C39477b(Runnable runnable) {
            this.f102530a = runnable;
        }

        /* renamed from: a */
        private void m126110a() {
            this.f102530a.run();
        }

        public final /* synthetic */ Object call() {
            m126110a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$c */
    static final class C39478c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39475c f102531a;

        /* renamed from: b */
        final /* synthetic */ String f102532b;

        C39478c(C39475c cVar, String str) {
            this.f102531a = cVar;
            this.f102532b = str;
        }

        public final void run() {
            this.f102531a.f102481D = false;
            this.f102531a.f102482E.sendEmptyMessage(this.f102531a.f102483F);
            if (!C7634n.m23723c(this.f102532b, "df", false)) {
                C7276d.m22816c(this.f102532b);
            }
            this.f102531a.f102482E.sendEmptyMessage(this.f102531a.f102485H);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$d */
    public static final class C39479d extends C42939as {

        /* renamed from: a */
        final /* synthetic */ C39475c f102533a;

        C39479d(C39475c cVar) {
            this.f102533a = cVar;
        }

        /* renamed from: a */
        public final void mo70606a(View view) {
            C7573i.m23587b(view, "v");
            if (this.f102533a.f102481D) {
                int id = view.getId();
                if (id == R.id.dr7) {
                    this.f102533a.mo98334d();
                } else if (id == R.id.e15) {
                    this.f102533a.mo98335e();
                } else if (id == R.id.ec1) {
                    C39475c.m126082a(this.f102533a, false, 0, 3, null);
                } else if (id == R.id.k4) {
                    this.f102533a.mo30920G();
                } else {
                    if (id == R.id.bb4) {
                        this.f102533a.mo98332b(false);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$e */
    public static final class C39480e extends C42939as {

        /* renamed from: a */
        final /* synthetic */ C39475c f102534a;

        C39480e(C39475c cVar) {
            this.f102534a = cVar;
        }

        /* renamed from: a */
        public final void mo70606a(View view) {
            C7573i.m23587b(view, "v");
            if (this.f102534a.f102528y) {
                this.f102534a.f102528y = false;
                C39475c.m126084b(this.f102534a).mo98287d();
                C39475c.m126082a(this.f102534a, false, 0, 3, null);
                this.f102534a.mo98331b("click");
                return;
            }
            this.f102534a.f102528y = true;
            C39475c.m126084b(this.f102534a).mo98286c();
            this.f102534a.mo98332b(true);
            this.f102534a.mo98327a("click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$f */
    public static final class C39481f implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C39475c f102535a;

        C39481f(C39475c cVar) {
            this.f102535a = cVar;
        }

        public final boolean onLongClick(View view) {
            this.f102535a.f102527x = true;
            C39475c.m126084b(this.f102535a).mo98284a();
            this.f102535a.mo98332b(true);
            this.f102535a.mo98327a("long_press");
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$g */
    public static final class C39482g implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C39475c f102536a;

        C39482g(C39475c cVar) {
            this.f102536a = cVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (((motionEvent != null && motionEvent.getAction() == 3) || (motionEvent != null && motionEvent.getAction() == 1)) && this.f102536a.f102527x) {
                this.f102536a.f102527x = false;
                C39475c.m126084b(this.f102536a).mo98285b();
                C39475c.m126082a(this.f102536a, false, 0, 3, null);
                this.f102536a.mo98331b("long_press");
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$h */
    static final class C39483h implements C40161f {

        /* renamed from: a */
        final /* synthetic */ MvChooseCoverAdapter f102537a;

        C39483h(MvChooseCoverAdapter mvChooseCoverAdapter) {
            this.f102537a = mvChooseCoverAdapter;
        }

        /* renamed from: a */
        public final void mo70479a(List<Bitmap> list) {
            this.f102537a.mo99897a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$i */
    static final class C39484i<T> implements C0053p<Long> {

        /* renamed from: a */
        final /* synthetic */ C39475c f102538a;

        C39484i(C39475c cVar) {
            this.f102538a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Long l) {
            if (l != null) {
                if (-1 == C39475c.m126081a(this.f102538a).mo98319c((int) l.longValue())) {
                    C39475c.m126084b(this.f102538a).mo98289f();
                    C39475c.m126085c(this.f102538a).setText(R.string.akb);
                } else if (!this.f102538a.f102517n) {
                    C39475c.m126084b(this.f102538a).mo98288e();
                    C39475c.m126085c(this.f102538a).setText(R.string.aj9);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$j */
    static final class C39485j<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C39475c f102539a;

        C39485j(C39475c cVar) {
            this.f102539a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                if (bool.booleanValue()) {
                    C39475c.m126087d(this.f102539a).voiceVolume = this.f102539a.f102480C.getVoiceVolume();
                } else {
                    C39475c.m126087d(this.f102539a).voiceVolume = 0.0f;
                }
                this.f102539a.f102480C.setNeedOriginalSound(bool.booleanValue());
                if (this.f102539a.f102518o && !this.f102539a.f102517n) {
                    this.f102539a.mo98326a(-1.0f, C39475c.m126087d(this.f102539a).voiceVolume);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$k */
    static final class C39486k implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C39475c f102540a;

        C39486k(C39475c cVar) {
            this.f102540a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C15389d dVar = this.f102540a.f102513j;
            if (dVar != null) {
                this.f102540a.mo98325a().setValue(Long.valueOf((long) dVar.mo38862m()));
                C39475c.m126081a(this.f102540a).mo98313a(((float) dVar.mo38862m()) / ((float) dVar.mo38860l()));
                if (this.f102540a.f102517n) {
                    int a = C39475c.m126081a(this.f102540a).mo98311a(dVar.mo38862m(), this.f102540a.f102519p);
                    C39475c.m126081a(this.f102540a).mo98318b();
                    if (a == -1) {
                        Point point = this.f102540a.f102519p;
                        if (point != null) {
                            point.setY(dVar.mo38862m());
                        }
                        C39475c.m126081a(this.f102540a).mo98318b();
                    } else {
                        Point point2 = this.f102540a.f102519p;
                        if (point2 != null) {
                            point2.setY(a);
                        }
                        C39475c.m126081a(this.f102540a).mo98318b();
                        this.f102540a.mo98329a(false, a);
                    }
                } else {
                    this.f102540a.f102519p = null;
                }
                if (dVar.mo38862m() >= this.f102540a.f102514k) {
                    if (this.f102540a.f102517n) {
                        C39475c.m126082a(this.f102540a, true, 0, 2, null);
                        return;
                    }
                    this.f102540a.f102516m.cancel();
                    this.f102540a.f102486I.mo98343a(0.0f, true);
                    C39475c.m126081a(this.f102540a).mo98313a(0.0f);
                    this.f102540a.f102480C.setMStack(C39475c.m126081a(this.f102540a).getStack());
                    if (this.f102540a.f102480C.getMStack().isEmpty()) {
                        C39475c.m126089e(this.f102540a).setVisibility(8);
                        return;
                    }
                    C39475c.m126089e(this.f102540a).setVisibility(0);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$l */
    public static final class C39487l implements C23254a {

        /* renamed from: a */
        final /* synthetic */ C39475c f102541a;

        C39487l(C39475c cVar) {
            this.f102541a = cVar;
        }

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f102541a.mo30996D()) {
                return false;
            }
            View g = C39475c.m126091g(this.f102541a);
            if (g != null) {
                g.performClick();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$m */
    static final class C39488m extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C39488m f102542a = new C39488m();

        C39488m() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m126117a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m126117a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$n */
    static final class C39489n implements OnClickListener {

        /* renamed from: a */
        public static final C39489n f102543a = new C39489n();

        C39489n() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$o */
    static final class C39490o implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C39475c f102544a;

        C39490o(C39475c cVar) {
            this.f102544a = cVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f102544a.mo98330b().setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$p */
    public static final class C39491p implements C39498d {

        /* renamed from: a */
        final /* synthetic */ C39475c f102545a;

        C39491p(C39475c cVar) {
            this.f102545a = cVar;
        }

        /* renamed from: a */
        public final void mo98343a(float f, boolean z) {
            long j = (long) (((float) this.f102545a.f102514k) * f);
            this.f102545a.f102515l = f;
            if (z) {
                this.f102545a.f102519p = null;
                C39475c.m126092h(this.f102545a).setValue(C47516v.m148298b(j));
                C39475c.m126093i(this.f102545a).setVisibility(0);
            } else {
                C39475c.m126092h(this.f102545a).setValue(C47516v.m148296a(j));
                C39475c.m126093i(this.f102545a).setVisibility(4);
            }
            this.f102545a.mo98325a().setValue(Long.valueOf(j));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$q */
    static final class C39492q extends Lambda implements C7561a<C0052o<Long>> {

        /* renamed from: a */
        public static final C39492q f102546a = new C39492q();

        C39492q() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Long> m126119a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m126119a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$r */
    static final class C39493r<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Runnable f102547a;

        C39493r(Runnable runnable) {
            this.f102547a = runnable;
        }

        /* renamed from: a */
        private void m126120a() {
            this.f102547a.run();
        }

        public final /* synthetic */ Object call() {
            m126120a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$s */
    static final class C39494s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39475c f102548a;

        C39494s(C39475c cVar) {
            this.f102548a = cVar;
        }

        public final void run() {
            this.f102548a.f102482E.sendEmptyMessage(this.f102548a.f102483F);
            new File(C39811er.f103479o).mkdirs();
            StringBuilder sb = new StringBuilder();
            sb.append(C39811er.f103479o);
            sb.append(System.currentTimeMillis());
            sb.append(".wav");
            String sb2 = sb.toString();
            String str = C39811er.f103479o;
            C7573i.m23582a((Object) str, "ShortVideoConfig2.sAudioRecordWorkSpace");
            C39475c.m126083a(str, this.f102548a.f102480C.getAudioUrl());
            if (this.f102548a.f102480C.hasRecord()) {
                C7276d.m22820d(this.f102548a.f102480C.getAudioUrl(), sb2);
                C39499e eVar = this.f102548a.f102479B;
                if (eVar != null) {
                    C39499e.m126124a(eVar, sb2, null, 2, null);
                }
                AudioRecorderParam audioRecorderParam = this.f102548a.f102480C;
                C39499e eVar2 = this.f102548a.f102479B;
                if (eVar2 == null) {
                    C7573i.m23580a();
                }
                audioRecorderParam.setAudioUrl(eVar2.mo98351b());
            } else {
                C15389d dVar = this.f102548a.f102513j;
                if (dVar != null) {
                    new File(C39811er.f103479o).mkdirs();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(C39811er.f103479o);
                    sb3.append(System.currentTimeMillis());
                    sb3.append(".wav");
                    String sb4 = sb3.toString();
                    C39499e eVar3 = this.f102548a.f102479B;
                    if (eVar3 != null) {
                        C39499e.m126123a(eVar3, sb4, dVar.mo38860l(), null, 4, null);
                    }
                    AudioRecorderParam audioRecorderParam2 = this.f102548a.f102480C;
                    C39499e eVar4 = this.f102548a.f102479B;
                    if (eVar4 == null) {
                        C7573i.m23580a();
                    }
                    audioRecorderParam2.setAudioUrl(eVar4.mo98351b());
                }
            }
            this.f102548a.f102482E.sendEmptyMessage(this.f102548a.f102484G);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$t */
    static final class C39495t implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final C39495t f102549a = new C39495t();

        C39495t() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$u */
    static final class C39496u implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39475c f102550a;

        C39496u(C39475c cVar) {
            this.f102550a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f102550a.mo98333c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c$v */
    static final class C39497v<T> implements C6892b<Void> {

        /* renamed from: a */
        final /* synthetic */ C39475c f102551a;

        /* renamed from: b */
        final /* synthetic */ boolean f102552b;

        C39497v(C39475c cVar, boolean z) {
            this.f102551a = cVar;
            this.f102552b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void run(Void voidR) {
            if (this.f102552b) {
                C39475c.m126090f(this.f102551a).setVisibility(0);
                C39475c.m126091g(this.f102551a).setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final C0052o<Long> mo98325a() {
        return (C0052o) this.f102490N.getValue();
    }

    /* renamed from: b */
    public final C0052o<Boolean> mo98330b() {
        return (C0052o) this.f102491O.getValue();
    }

    /* renamed from: a */
    public final void mo98329a(boolean z, int i) {
        C0052o<C47516v> oVar = this.f102521r;
        if (oVar == null) {
            C7573i.m23583a("mPreviewControlOpLiveData");
        }
        oVar.setValue(C47516v.m148297b());
        C15389d dVar = this.f102513j;
        if (dVar != null) {
            dVar.mo38881x();
            mo98325a().setValue(Long.valueOf((long) dVar.mo38862m()));
        }
        this.f102516m.cancel();
        View view = this.f102524u;
        if (view == null) {
            C7573i.m23583a("mPlayView");
        }
        view.setVisibility(0);
        if (this.f102527x) {
            this.f102527x = false;
            AudioRecordStartButton audioRecordStartButton = this.f102526w;
            if (audioRecordStartButton == null) {
                C7573i.m23583a("audioRecordStartButton");
            }
            audioRecordStartButton.mo98285b();
        }
        if (this.f102528y) {
            this.f102528y = false;
            AudioRecordStartButton audioRecordStartButton2 = this.f102526w;
            if (audioRecordStartButton2 == null) {
                C7573i.m23583a("audioRecordStartButton");
            }
            audioRecordStartButton2.mo98287d();
        }
        if (this.f102517n) {
            C39499e eVar = this.f102479B;
            if (eVar != null) {
                if (z) {
                    Point point = this.f102519p;
                    if (point != null) {
                        point.setY(this.f102514k);
                    }
                    eVar.mo98349a();
                } else {
                    int a = (int) eVar.mo98349a();
                    if (i != -1) {
                        a = i;
                    }
                    Point point2 = this.f102519p;
                    if (point2 != null) {
                        point2.setY(a);
                    }
                    C0052o<C47516v> oVar2 = this.f102521r;
                    if (oVar2 == null) {
                        C7573i.m23583a("mPreviewControlOpLiveData");
                    }
                    oVar2.setValue(C47516v.m148298b((long) a));
                    C39472b bVar = this.f102525v;
                    if (bVar == null) {
                        C7573i.m23583a("audioRecordSeekBar");
                    }
                    bVar.mo98313a(((float) a) / ((float) this.f102514k));
                }
                C39472b bVar2 = this.f102525v;
                if (bVar2 == null) {
                    C7573i.m23583a("audioRecordSeekBar");
                }
                bVar2.mo98318b();
            }
            this.f102517n = false;
            Point point3 = this.f102519p;
            if (point3 != null) {
                mo98325a().setValue(Long.valueOf((long) point3.getY()));
            }
        }
        this.f102518o = false;
        AudioRecorderParam audioRecorderParam = this.f102480C;
        C39472b bVar3 = this.f102525v;
        if (bVar3 == null) {
            C7573i.m23583a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar3.getStack());
        if (this.f102480C.getMStack().isEmpty()) {
            View view2 = this.f102529z;
            if (view2 == null) {
                C7573i.m23583a("backView");
            }
            view2.setVisibility(8);
        } else {
            View view3 = this.f102529z;
            if (view3 == null) {
                C7573i.m23583a("backView");
            }
            view3.setVisibility(0);
        }
        AVDmtTextView aVDmtTextView = this.f102478A;
        if (aVDmtTextView == null) {
            C7573i.m23583a("tvMsg");
        }
        aVDmtTextView.setVisibility(0);
        LottieAnimationView lottieAnimationView = this.f102505ac;
        if (lottieAnimationView == null) {
            C7573i.m23583a("lottieAnimationView");
        }
        lottieAnimationView.setVisibility(4);
        LottieAnimationView lottieAnimationView2 = this.f102505ac;
        if (lottieAnimationView2 == null) {
            C7573i.m23583a("lottieAnimationView");
        }
        lottieAnimationView2.mo7085f();
    }

    /* renamed from: B */
    public final void mo30994B() {
        super.mo30994B();
        m126075P();
    }

    /* renamed from: P */
    private final void m126075P() {
        if (this.f102517n) {
            m126082a(this, false, 0, 3, null);
        }
    }

    /* renamed from: R */
    private final void m126077R() {
        C6907h.m21524a("click_dub", (Map) m126080U().f60753a);
    }

    /* renamed from: S */
    private final void m126078S() {
        C6907h.m21524a("delete_dub", (Map) m126080U().f60753a);
    }

    /* renamed from: T */
    private final void m126079T() {
        C6907h.m21524a("cancel_dub", (Map) m126080U().f60753a);
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        this.f102516m.cancel();
        this.f102482E.removeCallbacksAndMessages(null);
    }

    /* renamed from: H */
    private final void m126067H() {
        C0043i iVar = this;
        mo98325a().observe(iVar, new C39484i(this));
        mo98330b().observe(iVar, new C39485j(this));
    }

    /* renamed from: I */
    private final void m126068I() {
        this.f102516m.setDuration(1000);
        this.f102516m.setRepeatCount(-1);
        this.f102516m.addUpdateListener(new C39486k(this));
    }

    /* renamed from: J */
    private final void m126069J() {
        Runnable sVar = new C39494s(this);
        this.f102479B = new C39499e();
        C1592h.m7855a((Callable<TResult>) new C39493r<TResult>(sVar), (Executor) C7258h.m22730c());
    }

    /* renamed from: K */
    private final void m126070K() {
        AudioRecorderParam audioRecorderParam = this.f102480C;
        C39472b bVar = this.f102525v;
        if (bVar == null) {
            C7573i.m23583a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar.getStack());
        if (mo98330b().getValue() != null) {
            AudioRecorderParam audioRecorderParam2 = this.f102480C;
            Object value = mo98330b().getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            audioRecorderParam2.setNeedOriginalSound(((Boolean) value).booleanValue());
        }
    }

    /* renamed from: L */
    private final void m126071L() {
        C10741a aVar = new C10741a(this.f33526d_);
        aVar.mo25649a((int) R.string.aj_).mo25658b((int) R.string.aje, (DialogInterface.OnClickListener) C39495t.f102549a).mo25650a((int) R.string.ajd, (DialogInterface.OnClickListener) new C39496u(this));
        aVar.mo25656a().mo25637a();
    }

    /* renamed from: O */
    private final int m126074O() {
        return ((C39805en.m127452e(this.f33526d_) - ((int) C9738o.m28708b((Context) this.f33526d_, this.f102487K + this.f102488L))) - C39805en.m127450c(this.f33526d_)) - C39805en.m127451d(this.f33526d_);
    }

    /* renamed from: Q */
    private final boolean m126076Q() {
        AudioRecorderParam audioRecorderParam = this.f102480C;
        C39472b bVar = this.f102525v;
        if (bVar == null) {
            C7573i.m23583a("audioRecordSeekBar");
        }
        audioRecorderParam.setMStack(bVar.getStack());
        if (!this.f102480C.getMStack().isEmpty()) {
            return true;
        }
        return false;
    }

    public C39475c() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1, 10});
        C7573i.m23582a((Object) ofInt, "ValueAnimator.ofInt(1, 10)");
        this.f102516m = ofInt;
        this.f102480C = new AudioRecorderParam();
        this.f102481D = true;
        this.f102482E = new C6309f(this);
        this.f102483F = 1;
        this.f102484G = 2;
        this.f102485H = 4;
        this.f102486I = new C39491p(this);
        this.f102511ai = new C39487l(this);
        this.f102512aj = new C39479d(this);
    }

    /* renamed from: U */
    private final C22984d m126080U() {
        C22984d dVar = new C22984d();
        String str = "content_source";
        VideoPublishEditModel videoPublishEditModel = this.f102520q;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mVideoPublishEditModel");
        }
        C22984d a = dVar.mo59973a(str, C39500av.m126142b(videoPublishEditModel)).mo59973a("enter_from", "video_edit_page");
        String str2 = "shoot_way";
        VideoPublishEditModel videoPublishEditModel2 = this.f102520q;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("mVideoPublishEditModel");
        }
        C22984d a2 = a.mo59973a(str2, videoPublishEditModel2.mShootWay);
        String str3 = "creation_id";
        VideoPublishEditModel videoPublishEditModel3 = this.f102520q;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("mVideoPublishEditModel");
        }
        C22984d a3 = a2.mo59973a(str3, videoPublishEditModel3.creationId).mo59973a("content_type", "video");
        C7573i.m23582a((Object) a3, "EventMapBuilder()\n      …YPE, AVMob.Content.VIDEO)");
        return a3;
    }

    /* renamed from: d */
    public final void mo98334d() {
        if (this.f102517n || this.f102518o) {
            m126082a(this, false, 0, 3, null);
        }
        m126079T();
        m126070K();
        AudioRecorderParam audioRecorderParam = this.f102480C;
        VideoPublishEditModel videoPublishEditModel = this.f102520q;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mVideoPublishEditModel");
        }
        if (audioRecorderParam.hasChange(videoPublishEditModel.veAudioRecorderParam)) {
            m126071L();
            return;
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f102520q;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("mVideoPublishEditModel");
        }
        float f = videoPublishEditModel2.musicVolume;
        VideoPublishEditModel videoPublishEditModel3 = this.f102520q;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("mVideoPublishEditModel");
        }
        mo98326a(f, videoPublishEditModel3.voiceVolume);
        m126086c(this.f102480C.getAudioUrl());
    }

    /* renamed from: M */
    private final void m126072M() {
        View view = this.f102522s;
        if (view == null) {
            C7573i.m23583a("mSaveView");
        }
        view.setOnClickListener(this.f102512aj);
        View view2 = this.f102523t;
        if (view2 == null) {
            C7573i.m23583a("mCancelView");
        }
        view2.setOnClickListener(this.f102512aj);
        View view3 = this.f102524u;
        if (view3 == null) {
            C7573i.m23583a("mPlayView");
        }
        view3.setOnClickListener(this.f102512aj);
        View view4 = this.f102503aa;
        if (view4 == null) {
            C7573i.m23583a("videoLayout");
        }
        view4.setOnClickListener(this.f102512aj);
        View view5 = this.f102529z;
        if (view5 == null) {
            C7573i.m23583a("backView");
        }
        view5.setOnClickListener(this.f102512aj);
        AudioRecordStartButton audioRecordStartButton = this.f102526w;
        if (audioRecordStartButton == null) {
            C7573i.m23583a("audioRecordStartButton");
        }
        audioRecordStartButton.setOnClickListener(new C39480e(this));
        AudioRecordStartButton audioRecordStartButton2 = this.f102526w;
        if (audioRecordStartButton2 == null) {
            C7573i.m23583a("audioRecordStartButton");
        }
        audioRecordStartButton2.setOnLongClickListener(new C39481f(this));
        AudioRecordStartButton audioRecordStartButton3 = this.f102526w;
        if (audioRecordStartButton3 == null) {
            C7573i.m23583a("audioRecordStartButton");
        }
        audioRecordStartButton3.setOnTouchListener(new C39482g(this));
    }

    /* renamed from: G */
    public final void mo30920G() {
        if (this.f102517n || this.f102518o) {
            m126082a(this, false, 0, 3, null);
        }
        m126078S();
        this.f102480C.setNeedDel(true);
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f102494R;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("mVEVideoPublishEditViewModel");
        }
        C0052o b = vEVideoPublishEditViewModel.mo119510b();
        C7573i.m23582a((Object) b, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
        b.setValue(this.f102480C);
        C39472b bVar = this.f102525v;
        if (bVar == null) {
            C7573i.m23583a("audioRecordSeekBar");
        }
        Point c = bVar.mo98320c();
        if (c != null) {
            float x = ((float) c.getX()) / ((float) this.f102514k);
            c.setY(c.getY() + 100);
            if (c.getY() > this.f102514k) {
                c.setY(this.f102514k);
            }
            C39499e eVar = this.f102479B;
            if (eVar != null) {
                eVar.mo98350a(c.getX(), c.getY());
            }
            this.f102486I.mo98343a(x, true);
            C39472b bVar2 = this.f102525v;
            if (bVar2 == null) {
                C7573i.m23583a("audioRecordSeekBar");
            }
            bVar2.mo98313a(x);
            AudioRecorderParam audioRecorderParam = this.f102480C;
            C39472b bVar3 = this.f102525v;
            if (bVar3 == null) {
                C7573i.m23583a("audioRecordSeekBar");
            }
            audioRecorderParam.setMStack(bVar3.getStack());
            if (this.f102480C.getMStack().isEmpty()) {
                View view = this.f102529z;
                if (view == null) {
                    C7573i.m23583a("backView");
                }
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public final void mo98333c() {
        VideoPublishEditModel videoPublishEditModel = this.f102520q;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mVideoPublishEditModel");
        }
        AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
        if (this.f102480C.getAudioRecordIndex() >= 0 && this.f102480C.hasRecord()) {
            this.f102480C.setNeedDel(true);
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f102494R;
            if (vEVideoPublishEditViewModel == null) {
                C7573i.m23583a("mVEVideoPublishEditViewModel");
            }
            C0052o b = vEVideoPublishEditViewModel.mo119510b();
            C7573i.m23582a((Object) b, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
            b.setValue(this.f102480C);
        }
        if (audioRecorderParam != null) {
            if (audioRecorderParam.getAudioRecordIndex() < 0 && this.f102480C.hasRecord()) {
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f102494R;
                if (vEVideoPublishEditViewModel2 == null) {
                    C7573i.m23583a("mVEVideoPublishEditViewModel");
                }
                C0052o b2 = vEVideoPublishEditViewModel2.mo119510b();
                C7573i.m23582a((Object) b2, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
                b2.setValue(audioRecorderParam);
            }
            if (audioRecorderParam.getNeedOriginalSound()) {
                VideoPublishEditModel videoPublishEditModel2 = this.f102520q;
                if (videoPublishEditModel2 == null) {
                    C7573i.m23583a("mVideoPublishEditModel");
                }
                videoPublishEditModel2.voiceVolume = audioRecorderParam.getVoiceVolume();
            } else {
                VideoPublishEditModel videoPublishEditModel3 = this.f102520q;
                if (videoPublishEditModel3 == null) {
                    C7573i.m23583a("mVideoPublishEditModel");
                }
                videoPublishEditModel3.voiceVolume = 0.0f;
            }
        } else {
            VideoPublishEditModel videoPublishEditModel4 = this.f102520q;
            if (videoPublishEditModel4 == null) {
                C7573i.m23583a("mVideoPublishEditModel");
            }
            videoPublishEditModel4.voiceVolume = this.f102480C.getVoiceVolume();
        }
        VideoPublishEditModel videoPublishEditModel5 = this.f102520q;
        if (videoPublishEditModel5 == null) {
            C7573i.m23583a("mVideoPublishEditModel");
        }
        float f = videoPublishEditModel5.musicVolume;
        VideoPublishEditModel videoPublishEditModel6 = this.f102520q;
        if (videoPublishEditModel6 == null) {
            C7573i.m23583a("mVideoPublishEditModel");
        }
        mo98326a(f, videoPublishEditModel6.voiceVolume);
        m126086c(this.f102480C.getAudioUrl());
    }

    /* renamed from: e */
    public final void mo98335e() {
        if (this.f102517n || this.f102518o) {
            m126082a(this, false, 0, 3, null);
        }
        String str = "";
        m126070K();
        if (this.f102479B != null) {
            VideoPublishEditModel videoPublishEditModel = this.f102520q;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("mVideoPublishEditModel");
            }
            float f = videoPublishEditModel.musicVolume;
            VideoPublishEditModel videoPublishEditModel2 = this.f102520q;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mVideoPublishEditModel");
            }
            mo98326a(f, videoPublishEditModel2.voiceVolume);
            if (this.f102480C.getAudioRecordIndex() < 0 && this.f102480C.hasRecord()) {
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f102494R;
                if (vEVideoPublishEditViewModel == null) {
                    C7573i.m23583a("mVEVideoPublishEditViewModel");
                }
                C0052o b = vEVideoPublishEditViewModel.mo119510b();
                C7573i.m23582a((Object) b, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
                b.setValue(this.f102480C);
            }
        }
        VideoPublishEditModel videoPublishEditModel3 = this.f102520q;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("mVideoPublishEditModel");
        }
        if (videoPublishEditModel3.veAudioRecorderParam == null) {
            VideoPublishEditModel videoPublishEditModel4 = this.f102520q;
            if (videoPublishEditModel4 == null) {
                C7573i.m23583a("mVideoPublishEditModel");
            }
            videoPublishEditModel4.veAudioRecorderParam = new AudioRecorderParam();
        } else {
            VideoPublishEditModel videoPublishEditModel5 = this.f102520q;
            if (videoPublishEditModel5 == null) {
                C7573i.m23583a("mVideoPublishEditModel");
            }
            str = videoPublishEditModel5.veAudioRecorderParam.getAudioUrl();
        }
        VideoPublishEditModel videoPublishEditModel6 = this.f102520q;
        if (videoPublishEditModel6 == null) {
            C7573i.m23583a("mVideoPublishEditModel");
        }
        videoPublishEditModel6.veAudioRecorderParam.copyFrom(this.f102480C);
        if (C7634n.m23723c(str, "df", false)) {
            VideoPublishEditModel videoPublishEditModel7 = this.f102520q;
            if (videoPublishEditModel7 == null) {
                C7573i.m23583a("mVideoPublishEditModel");
            }
            videoPublishEditModel7.veAudioRecorderParam.setExtraUrl(str);
            str = "";
        }
        m126088d(this.f102480C.getNeedOriginalSound() ? 1 : 0);
        m126086c(str);
    }

    /* renamed from: N */
    private final void m126073N() {
        C15389d dVar = this.f102513j;
        if (dVar != null) {
            ChooseVideoCoverView chooseVideoCoverView = this.f102502Z;
            if (chooseVideoCoverView == null) {
                C7573i.m23583a("mChooseVideoCoverView");
            }
            chooseVideoCoverView.mo102316a(false);
            ChooseVideoCoverView chooseVideoCoverView2 = this.f102502Z;
            if (chooseVideoCoverView2 == null) {
                C7573i.m23583a("mChooseVideoCoverView");
            }
            chooseVideoCoverView2.setLayoutManager(new WrapLinearLayoutManager(this.f33526d_, 0, false));
            ChooseVideoCoverView chooseVideoCoverView3 = this.f102502Z;
            if (chooseVideoCoverView3 == null) {
                C7573i.m23583a("mChooseVideoCoverView");
            }
            int frameHeight = chooseVideoCoverView3.getFrameHeight();
            ChooseVideoCoverView chooseVideoCoverView4 = this.f102502Z;
            if (chooseVideoCoverView4 == null) {
                C7573i.m23583a("mChooseVideoCoverView");
            }
            int frameWidth = chooseVideoCoverView4.getFrameWidth();
            int ceil = (int) Math.ceil((double) (((float) (C9738o.m28691a((Context) this.f33526d_) - (Math.round(C9738o.m28708b((Context) this.f33526d_, this.f102489M)) * 2))) / (((float) frameWidth) * 1.0f)));
            ChooseVideoCoverView chooseVideoCoverView5 = this.f102502Z;
            if (chooseVideoCoverView5 == null) {
                C7573i.m23583a("mChooseVideoCoverView");
            }
            chooseVideoCoverView5.setCoverSize(ceil);
            Activity activity = this.f33526d_;
            if (activity != null) {
                C0043i iVar = (FragmentActivity) activity;
                ChooseVideoCoverView chooseVideoCoverView6 = this.f102502Z;
                if (chooseVideoCoverView6 == null) {
                    C7573i.m23583a("mChooseVideoCoverView");
                }
                this.f102507ae = new VEVideoCoverGeneratorImpl(dVar, iVar, chooseVideoCoverView6.getCoverSize());
                VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f102507ae;
                if (vEVideoCoverGeneratorImpl == null) {
                    C7573i.m23583a("mEffectVideoCoverGenerator");
                }
                this.f102508af = new C41706n(vEVideoCoverGeneratorImpl, frameWidth, frameHeight, ceil);
                VideoPublishEditModel videoPublishEditModel = this.f102520q;
                if (videoPublishEditModel == null) {
                    C7573i.m23583a("mVideoPublishEditModel");
                }
                if (videoPublishEditModel.isMvThemeVideoType()) {
                    MvChooseCoverAdapter mvChooseCoverAdapter = new MvChooseCoverAdapter(frameWidth, frameHeight);
                    ChooseVideoCoverView chooseVideoCoverView7 = this.f102502Z;
                    if (chooseVideoCoverView7 == null) {
                        C7573i.m23583a("mChooseVideoCoverView");
                    }
                    C1262a aVar = mvChooseCoverAdapter;
                    chooseVideoCoverView7.setAdapter(aVar);
                    C40154a aVar2 = new C40154a();
                    C0052o<Boolean> oVar = this.f102510ah;
                    if (oVar == null) {
                        C7573i.m23583a("firstFrameVisible");
                    }
                    C40154a b = aVar2.mo99907b(oVar);
                    C0052o<Bitmap> oVar2 = this.f102509ag;
                    if (oVar2 == null) {
                        C7573i.m23583a("firstFrameBitmap");
                    }
                    b.mo99899a(oVar2).mo99898a(frameWidth, frameHeight).mo99904a((Context) this.f33526d_, this.f102513j, ceil, (C40161f) new C39483h(mvChooseCoverAdapter));
                    ChooseVideoCoverView chooseVideoCoverView8 = this.f102502Z;
                    if (chooseVideoCoverView8 == null) {
                        C7573i.m23583a("mChooseVideoCoverView");
                    }
                    chooseVideoCoverView8.setAdapter(aVar);
                    return;
                }
                C41706n nVar = this.f102508af;
                if (nVar == null) {
                    C7573i.m23583a("mSharedVideoCoverDataSource");
                }
                Adapter adapter = new Adapter(nVar, frameWidth, frameHeight);
                ChooseVideoCoverView chooseVideoCoverView9 = this.f102502Z;
                if (chooseVideoCoverView9 == null) {
                    C7573i.m23583a("mChooseVideoCoverView");
                }
                chooseVideoCoverView9.setAdapter(adapter);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C39472b m126081a(C39475c cVar) {
        C39472b bVar = cVar.f102525v;
        if (bVar == null) {
            C7573i.m23583a("audioRecordSeekBar");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ AudioRecordStartButton m126084b(C39475c cVar) {
        AudioRecordStartButton audioRecordStartButton = cVar.f102526w;
        if (audioRecordStartButton == null) {
            C7573i.m23583a("audioRecordStartButton");
        }
        return audioRecordStartButton;
    }

    /* renamed from: c */
    public static final /* synthetic */ AVDmtTextView m126085c(C39475c cVar) {
        AVDmtTextView aVDmtTextView = cVar.f102478A;
        if (aVDmtTextView == null) {
            C7573i.m23583a("tvMsg");
        }
        return aVDmtTextView;
    }

    /* renamed from: d */
    public static final /* synthetic */ VideoPublishEditModel m126087d(C39475c cVar) {
        VideoPublishEditModel videoPublishEditModel = cVar.f102520q;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mVideoPublishEditModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m126089e(C39475c cVar) {
        View view = cVar.f102529z;
        if (view == null) {
            C7573i.m23583a("backView");
        }
        return view;
    }

    /* renamed from: f */
    public static final /* synthetic */ View m126090f(C39475c cVar) {
        View view = cVar.f102522s;
        if (view == null) {
            C7573i.m23583a("mSaveView");
        }
        return view;
    }

    /* renamed from: g */
    public static final /* synthetic */ View m126091g(C39475c cVar) {
        View view = cVar.f102523t;
        if (view == null) {
            C7573i.m23583a("mCancelView");
        }
        return view;
    }

    /* renamed from: h */
    public static final /* synthetic */ C0052o m126092h(C39475c cVar) {
        C0052o<C47516v> oVar = cVar.f102521r;
        if (oVar == null) {
            C7573i.m23583a("mPreviewControlOpLiveData");
        }
        return oVar;
    }

    /* renamed from: i */
    public static final /* synthetic */ View m126093i(C39475c cVar) {
        View view = cVar.f102524u;
        if (view == null) {
            C7573i.m23583a("mPlayView");
        }
        return view;
    }

    /* renamed from: c */
    private final void m126086c(String str) {
        C39499e eVar = this.f102479B;
        if (eVar != null) {
            eVar.mo98352c();
        }
        C1592h.m7855a((Callable<TResult>) new C39477b<TResult>(new C39478c(this, str)), (Executor) C7258h.m22730c());
    }

    /* renamed from: d */
    private final void m126088d(int i) {
        C6907h.m21524a("save_dub", (Map) m126080U().mo59970a("original_sound", i).f60753a);
    }

    /* renamed from: b */
    public final void mo98331b(String str) {
        C6907h.m21524a("record_dub_end", (Map) m126080U().mo59973a("enter_method", str).f60753a);
    }

    public final void handleMsg(Message message) {
        C7573i.m23587b(message, "msg");
        int i = message.what;
        if (i == this.f102483F) {
            this.f102481D = false;
            View view = this.f102499W;
            if (view == null) {
                C7573i.m23583a("mLoadingStatusViewLayout");
            }
            view.setVisibility(0);
            DmtStatusView dmtStatusView = this.f102498V;
            if (dmtStatusView == null) {
                C7573i.m23583a("mLoadingStatusView");
            }
            dmtStatusView.setBuilder(C10803a.m31631a((Context) this.f33526d_).mo25965c(1));
            DmtStatusView dmtStatusView2 = this.f102498V;
            if (dmtStatusView2 == null) {
                C7573i.m23583a("mLoadingStatusView");
            }
            dmtStatusView2.mo25942f();
        } else if (i == this.f102484G) {
            this.f102481D = true;
            DmtStatusView dmtStatusView3 = this.f102498V;
            if (dmtStatusView3 == null) {
                C7573i.m23583a("mLoadingStatusView");
            }
            dmtStatusView3.mo25938c(true);
            View view2 = this.f102499W;
            if (view2 == null) {
                C7573i.m23583a("mLoadingStatusViewLayout");
            }
            view2.setVisibility(8);
        } else {
            if (i == this.f102485H) {
                this.f102481D = true;
                DmtStatusView dmtStatusView4 = this.f102498V;
                if (dmtStatusView4 == null) {
                    C7573i.m23583a("mLoadingStatusView");
                }
                dmtStatusView4.mo25938c(true);
                View view3 = this.f102499W;
                if (view3 == null) {
                    C7573i.m23583a("mLoadingStatusViewLayout");
                }
                view3.setVisibility(8);
                EditViewModel editViewModel = this.f102500X;
                if (editViewModel == null) {
                    C7573i.m23583a("editViewModel");
                }
                editViewModel.mo106454o().setValue(Boolean.valueOf(false));
                C0052o<C47516v> oVar = this.f102521r;
                if (oVar == null) {
                    C7573i.m23583a("mPreviewControlOpLiveData");
                }
                oVar.setValue(C47516v.m148295a());
            }
        }
    }

    /* renamed from: b */
    public final void mo98332b(boolean z) {
        float f;
        C15389d dVar = this.f102513j;
        if (dVar != null) {
            View view = this.f102524u;
            if (view == null) {
                C7573i.m23583a("mPlayView");
            }
            view.setVisibility(4);
            float f2 = 0.0f;
            if (z) {
                this.f102480C.setNeedDel(true);
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f102494R;
                if (vEVideoPublishEditViewModel == null) {
                    C7573i.m23583a("mVEVideoPublishEditViewModel");
                }
                C0052o b = vEVideoPublishEditViewModel.mo119510b();
                C7573i.m23582a((Object) b, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
                b.setValue(this.f102480C);
                AVDmtTextView aVDmtTextView = this.f102478A;
                if (aVDmtTextView == null) {
                    C7573i.m23583a("tvMsg");
                }
                aVDmtTextView.setVisibility(4);
                View view2 = this.f102529z;
                if (view2 == null) {
                    C7573i.m23583a("backView");
                }
                view2.setVisibility(4);
                LottieAnimationView lottieAnimationView = this.f102505ac;
                if (lottieAnimationView == null) {
                    C7573i.m23583a("lottieAnimationView");
                }
                lottieAnimationView.mo7078b();
                LottieAnimationView lottieAnimationView2 = this.f102505ac;
                if (lottieAnimationView2 == null) {
                    C7573i.m23583a("lottieAnimationView");
                }
                lottieAnimationView2.setVisibility(0);
                f = 0.0f;
            } else {
                this.f102518o = true;
                if (m126076Q() && this.f102479B != null && this.f102480C.getAudioRecordIndex() < 0) {
                    VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f102494R;
                    if (vEVideoPublishEditViewModel2 == null) {
                        C7573i.m23583a("mVEVideoPublishEditViewModel");
                    }
                    C0052o b2 = vEVideoPublishEditViewModel2.mo119510b();
                    C7573i.m23582a((Object) b2, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
                    b2.setValue(this.f102480C);
                }
                VideoPublishEditModel videoPublishEditModel = this.f102520q;
                if (videoPublishEditModel == null) {
                    C7573i.m23583a("mVideoPublishEditModel");
                }
                f2 = videoPublishEditModel.voiceVolume;
                VideoPublishEditModel videoPublishEditModel2 = this.f102520q;
                if (videoPublishEditModel2 == null) {
                    C7573i.m23583a("mVideoPublishEditModel");
                }
                f = videoPublishEditModel2.musicVolume;
            }
            mo98326a(f, f2);
            if (z) {
                if (this.f102519p != null) {
                    C0052o<C47516v> oVar = this.f102521r;
                    if (oVar == null) {
                        C7573i.m23583a("mPreviewControlOpLiveData");
                    }
                    Point point = this.f102519p;
                    if (point == null) {
                        C7573i.m23580a();
                    }
                    oVar.setValue(C47516v.m148298b((long) point.getY()));
                    C39472b bVar = this.f102525v;
                    if (bVar == null) {
                        C7573i.m23583a("audioRecordSeekBar");
                    }
                    Point point2 = this.f102519p;
                    if (point2 == null) {
                        C7573i.m23580a();
                    }
                    this.f102519p = bVar.mo98317b(point2.getY());
                } else {
                    int m = dVar.mo38862m();
                    if (m < 50) {
                        m = 0;
                    }
                    C39472b bVar2 = this.f102525v;
                    if (bVar2 == null) {
                        C7573i.m23583a("audioRecordSeekBar");
                    }
                    this.f102519p = bVar2.mo98317b(m);
                }
                this.f102517n = true;
                C39499e eVar = this.f102479B;
                if (eVar != null) {
                    eVar.mo98348a(1.0f, dVar.mo38862m() + 50, this.f102514k);
                }
            }
            C0052o<C47516v> oVar2 = this.f102521r;
            if (oVar2 == null) {
                C7573i.m23583a("mPreviewControlOpLiveData");
            }
            oVar2.setValue(C47516v.m148295a());
            this.f102516m.start();
        }
    }

    /* renamed from: a */
    public final void mo98327a(String str) {
        C6907h.m21524a("record_dub_start", (Map) m126080U().mo59973a("enter_method", str).f60753a);
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f102500X = (EditViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                C0063u a2 = C0069x.m159a((FragmentActivity) activity2).mo147a(VEVideoPublishEditViewModel.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                this.f102494R = (VEVideoPublishEditViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditAudioRecordModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…oRecordModel::class.java)");
                    this.f102495S = (EditAudioRecordModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(EditPreviewViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…iewViewModel::class.java)");
                        this.f102496T = (EditPreviewViewModel) a4;
                        EditViewModel editViewModel = this.f102500X;
                        if (editViewModel == null) {
                            C7573i.m23583a("editViewModel");
                        }
                        this.f102520q = editViewModel.mo29069f();
                        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f102494R;
                        if (vEVideoPublishEditViewModel == null) {
                            C7573i.m23583a("mVEVideoPublishEditViewModel");
                        }
                        C0052o<C47516v> k = vEVideoPublishEditViewModel.mo119519k();
                        C7573i.m23582a((Object) k, "mVEVideoPublishEditViewM…el.previewControlLiveData");
                        this.f102521r = k;
                        EditViewModel editViewModel2 = this.f102500X;
                        if (editViewModel2 == null) {
                            C7573i.m23583a("editViewModel");
                        }
                        this.f102513j = (C15389d) editViewModel2.mo106448i().getValue();
                        if (this.f102513j != null) {
                            C15389d dVar = this.f102513j;
                            if (dVar == null) {
                                C7573i.m23580a();
                            }
                            this.f102514k = dVar.mo38860l();
                        }
                        View b = mo31002b((int) R.id.e15);
                        if (b == null) {
                            C7573i.m23580a();
                        }
                        this.f102522s = b;
                        View b2 = mo31002b((int) R.id.dr7);
                        if (b2 == null) {
                            C7573i.m23580a();
                        }
                        this.f102523t = b2;
                        View b3 = mo31002b((int) R.id.bb4);
                        if (b3 == null) {
                            C7573i.m23580a();
                        }
                        this.f102524u = b3;
                        View b4 = mo31002b((int) R.id.d21);
                        if (b4 == null) {
                            C7573i.m23580a();
                        }
                        this.f102501Y = (FrameLayout) b4;
                        View b5 = mo31002b((int) R.id.ec1);
                        if (b5 == null) {
                            C7573i.m23580a();
                        }
                        this.f102503aa = b5;
                        View b6 = mo31002b((int) R.id.a24);
                        if (b6 == null) {
                            C7573i.m23580a();
                        }
                        this.f102504ab = (ViewGroup) b6;
                        View b7 = mo31002b((int) R.id.da1);
                        if (b7 == null) {
                            C7573i.m23580a();
                        }
                        this.f102526w = (AudioRecordStartButton) b7;
                        View b8 = mo31002b((int) R.id.k4);
                        if (b8 == null) {
                            C7573i.m23580a();
                        }
                        this.f102529z = b8;
                        View b9 = mo31002b((int) R.id.dy4);
                        if (b9 == null) {
                            C7573i.m23580a();
                        }
                        this.f102478A = (AVDmtTextView) b9;
                        AVDmtTextView aVDmtTextView = this.f102478A;
                        if (aVDmtTextView == null) {
                            C7573i.m23583a("tvMsg");
                        }
                        aVDmtTextView.mo103533b();
                        View b10 = mo31002b((int) R.id.tk);
                        if (b10 == null) {
                            C7573i.m23580a();
                        }
                        this.f102506ad = (CheckBox) b10;
                        CheckBox checkBox = this.f102506ad;
                        if (checkBox == null) {
                            C7573i.m23583a("checkBox");
                        }
                        StringBuilder sb = new StringBuilder("  ");
                        sb.append(mo30999a((int) R.string.aja));
                        checkBox.setText(sb.toString());
                        View b11 = mo31002b((int) R.id.bu0);
                        if (b11 == null) {
                            C7573i.m23580a();
                        }
                        this.f102498V = (DmtStatusView) b11;
                        View b12 = mo31002b((int) R.id.bu1);
                        if (b12 == null) {
                            C7573i.m23580a();
                        }
                        this.f102499W = b12;
                        View view = this.f102499W;
                        if (view == null) {
                            C7573i.m23583a("mLoadingStatusViewLayout");
                        }
                        view.setOnClickListener(C39489n.f102543a);
                        View b13 = mo31002b((int) R.id.bw6);
                        if (b13 == null) {
                            C7573i.m23580a();
                        }
                        this.f102505ac = (LottieAnimationView) b13;
                        LottieAnimationView lottieAnimationView = this.f102505ac;
                        if (lottieAnimationView == null) {
                            C7573i.m23583a("lottieAnimationView");
                        }
                        lottieAnimationView.setAnimation("tool_recording_dark_lottie.json");
                        LottieAnimationView lottieAnimationView2 = this.f102505ac;
                        if (lottieAnimationView2 == null) {
                            C7573i.m23583a("lottieAnimationView");
                        }
                        lottieAnimationView2.setRepeatCount(-1);
                        if (C6399b.m19944t()) {
                            View b14 = mo31002b((int) R.id.abv);
                            if (b14 == null) {
                                C7573i.m23580a();
                            }
                            b14.setVisibility(8);
                        } else {
                            View b15 = mo31002b((int) R.id.c0j);
                            if (b15 == null) {
                                C7573i.m23580a();
                            }
                            b15.setVisibility(8);
                        }
                        View view2 = this.f102529z;
                        if (view2 == null) {
                            C7573i.m23583a("backView");
                        }
                        view2.setBackgroundResource(R.drawable.ct);
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            this.f102525v = new C39472b((FragmentActivity) activity5, this);
                            C39472b bVar = this.f102525v;
                            if (bVar == null) {
                                C7573i.m23583a("audioRecordSeekBar");
                            }
                            bVar.mo98315a((int) C9738o.m28708b((Context) this.f33526d_, this.f102489M), (int) C9738o.m28708b((Context) this.f33526d_, 6.0f), (int) C9738o.m28708b((Context) this.f33526d_, 4.0f), this.f102514k, this.f102486I);
                            FrameLayout frameLayout = this.f102501Y;
                            if (frameLayout == null) {
                                C7573i.m23583a("seekLayout");
                            }
                            C39472b bVar2 = this.f102525v;
                            if (bVar2 == null) {
                                C7573i.m23583a("audioRecordSeekBar");
                            }
                            frameLayout.addView(bVar2, new LayoutParams(-1, -1));
                            View b16 = mo31002b((int) R.id.vx);
                            if (b16 == null) {
                                C7573i.m23580a();
                            }
                            this.f102502Z = (ChooseVideoCoverView) b16;
                            if (this.f33526d_ instanceof C23258e) {
                                Activity activity6 = this.f33526d_;
                                if (activity6 != null) {
                                    this.f102493Q = (C23258e) activity6;
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ListenableActivityRegistry");
                                }
                            }
                            EditPreviewViewModel editPreviewViewModel = this.f102496T;
                            if (editPreviewViewModel == null) {
                                C7573i.m23583a("mEditPreviewViewModel");
                            }
                            this.f102510ah = editPreviewViewModel.mo106323h();
                            EditPreviewViewModel editPreviewViewModel2 = this.f102496T;
                            if (editPreviewViewModel2 == null) {
                                C7573i.m23583a("mEditPreviewViewModel");
                            }
                            this.f102509ag = editPreviewViewModel2.mo106324i();
                            m126068I();
                            m126072M();
                            m126067H();
                            CheckBox checkBox2 = this.f102506ad;
                            if (checkBox2 == null) {
                                C7573i.m23583a("checkBox");
                            }
                            checkBox2.setOnCheckedChangeListener(new C39490o(this));
                            EditViewModel editViewModel3 = this.f102500X;
                            if (editViewModel3 == null) {
                                C7573i.m23583a("editViewModel");
                            }
                            if (editViewModel3 != null && (editViewModel3.mo106461w() || editViewModel3.mo106463y() || editViewModel3.mo106462x() || editViewModel3.mo106464z() || editViewModel3.mo106428A())) {
                                CheckBox checkBox3 = this.f102506ad;
                                if (checkBox3 == null) {
                                    C7573i.m23583a("checkBox");
                                }
                                checkBox3.setVisibility(8);
                            }
                            m126073N();
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo98328a(boolean z) {
        ViewGroup viewGroup = this.f102504ab;
        if (viewGroup == null) {
            C7573i.m23583a("contentLayout");
        }
        C27439r.m89908a((View) viewGroup, z, (int) C9738o.m28708b((Context) this.f33526d_, this.f102488L), mo31002b((int) R.id.app), (C6892b<Void>) new C39497v<Void>(this, z));
        if (z) {
            m126077R();
            VideoPublishEditModel videoPublishEditModel = this.f102520q;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("mVideoPublishEditModel");
            }
            if (videoPublishEditModel.veAudioRecorderParam != null) {
                VideoPublishEditModel videoPublishEditModel2 = this.f102520q;
                if (videoPublishEditModel2 == null) {
                    C7573i.m23583a("mVideoPublishEditModel");
                }
                videoPublishEditModel2.veAudioRecorderParam.setNeedDel(true);
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f102494R;
                if (vEVideoPublishEditViewModel == null) {
                    C7573i.m23583a("mVEVideoPublishEditViewModel");
                }
                C0052o b = vEVideoPublishEditViewModel.mo119510b();
                C7573i.m23582a((Object) b, "mVEVideoPublishEditViewM…udioRecorderParamLiveData");
                VideoPublishEditModel videoPublishEditModel3 = this.f102520q;
                if (videoPublishEditModel3 == null) {
                    C7573i.m23583a("mVideoPublishEditModel");
                }
                b.setValue(videoPublishEditModel3.veAudioRecorderParam);
            } else {
                this.f102480C = new AudioRecorderParam();
            }
            AudioRecorderParam audioRecorderParam = this.f102480C;
            VideoPublishEditModel videoPublishEditModel4 = this.f102520q;
            if (videoPublishEditModel4 == null) {
                C7573i.m23583a("mVideoPublishEditModel");
            }
            audioRecorderParam.copyFrom(videoPublishEditModel4.veAudioRecorderParam);
            if (this.f102480C.getNeedOriginalSound()) {
                AudioRecorderParam audioRecorderParam2 = this.f102480C;
                VideoPublishEditModel videoPublishEditModel5 = this.f102520q;
                if (videoPublishEditModel5 == null) {
                    C7573i.m23583a("mVideoPublishEditModel");
                }
                audioRecorderParam2.setVoiceVolume(videoPublishEditModel5.voiceVolume);
            }
            this.f102519p = null;
            CheckBox checkBox = this.f102506ad;
            if (checkBox == null) {
                C7573i.m23583a("checkBox");
            }
            checkBox.setChecked(this.f102480C.getNeedOriginalSound());
            mo98330b().setValue(Boolean.valueOf(this.f102480C.getNeedOriginalSound()));
            View view = this.f102524u;
            if (view == null) {
                C7573i.m23583a("mPlayView");
            }
            view.setVisibility(0);
            C39491p pVar = this.f102486I;
            if (pVar != null) {
                pVar.mo98343a(0.0f, true);
            }
            C39472b bVar = this.f102525v;
            if (bVar == null) {
                C7573i.m23583a("audioRecordSeekBar");
            }
            bVar.setStack(this.f102480C.getMStack());
            C39472b bVar2 = this.f102525v;
            if (bVar2 == null) {
                C7573i.m23583a("audioRecordSeekBar");
            }
            if (bVar2 != null) {
                bVar2.mo98313a(0.0f);
            }
            mo98325a().setValue(Long.valueOf(0));
            if (this.f102480C.getMStack().isEmpty()) {
                View view2 = this.f102529z;
                if (view2 == null) {
                    C7573i.m23583a("backView");
                }
                view2.setVisibility(8);
            } else {
                View view3 = this.f102529z;
                if (view3 == null) {
                    C7573i.m23583a("backView");
                }
                view3.setVisibility(0);
            }
            C23258e eVar = this.f102493Q;
            if (eVar != null) {
                eVar.mo60525a(this.f102511ai);
            }
            m126069J();
            VideoPublishEditModel videoPublishEditModel6 = this.f102520q;
            if (videoPublishEditModel6 == null) {
                C7573i.m23583a("mVideoPublishEditModel");
            }
            if (videoPublishEditModel6.veAudioEffectParam != null) {
                C10761a.m31399c((Context) this.f33526d_, (int) R.string.akg).mo25750a();
            }
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f102494R;
            if (vEVideoPublishEditViewModel2 == null) {
                C7573i.m23583a("mVEVideoPublishEditViewModel");
            }
            vEVideoPublishEditViewModel2.mo119515g().setValue(C47519a.m148313a(C47518x.f121983l, C42111b.f109618a.mo103542a(true, false, false, false, false), ((int) C9738o.m28708b((Context) this.f33526d_, this.f102487K)) + C39805en.m127450c(this.f33526d_), (int) C9738o.m28708b((Context) this.f33526d_, this.f102488L), m126074O(), C39804em.m127438b(this.f33526d_, C39804em.f103457a), 0, false, false, false, false, 960, null));
            return;
        }
        View view4 = this.f102522s;
        if (view4 == null) {
            C7573i.m23583a("mSaveView");
        }
        view4.setVisibility(8);
        View view5 = this.f102523t;
        if (view5 == null) {
            C7573i.m23583a("mCancelView");
        }
        view5.setVisibility(8);
        C23258e eVar2 = this.f102493Q;
        if (eVar2 != null) {
            eVar2.mo60526b(this.f102511ai);
        }
        this.f102516m.cancel();
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel3 = this.f102494R;
        if (vEVideoPublishEditViewModel3 == null) {
            C7573i.m23583a("mVEVideoPublishEditViewModel");
        }
        vEVideoPublishEditViewModel3.mo119515g().setValue(C47519a.m148310a(mo31017x().getColor(R.color.l3), ((int) C9738o.m28708b((Context) this.f33526d_, this.f102487K)) + C39805en.m127450c(this.f33526d_), (int) C9738o.m28708b((Context) this.f33526d_, this.f102488L), m126074O(), C39804em.m127438b(this.f33526d_, C39804em.f103457a), 0));
    }

    /* renamed from: a */
    public static void m126083a(String str, String str2) {
        File[] listFiles;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    C7573i.m23582a((Object) file2, "child");
                    String path = file2.getPath();
                    C7573i.m23582a((Object) path, "s");
                    if (!C7634n.m23723c(path, "df", false) && !path.equals(str2)) {
                        file2.delete();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r0.getWavFile() != null) goto L_0x001e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98326a(float r4, float r5) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.f102520q
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mVideoPublishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            boolean r0 = r0.isFastImport
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L_0x001e
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.f102520q
            if (r0 != 0) goto L_0x0018
            java.lang.String r2 = "mVideoPublishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0018:
            java.lang.String r0 = r0.getWavFile()
            if (r0 == 0) goto L_0x002b
        L_0x001e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.f102520q
            if (r0 != 0) goto L_0x0027
            java.lang.String r2 = "mVideoPublishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0027:
            boolean r0 = r0.isMuted
            if (r0 == 0) goto L_0x0044
        L_0x002b:
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x008b
            dmt.av.video.VEVideoPublishEditViewModel r5 = r3.f102494R
            if (r5 != 0) goto L_0x0038
            java.lang.String r0 = "mVEVideoPublishEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0038:
            android.arch.lifecycle.o r5 = r5.mo119521m()
            com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r4 = com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofMusic(r4)
            r5.setValue(r4)
            return
        L_0x0044:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            dmt.av.video.VEVideoPublishEditViewModel r0 = r3.f102494R
            if (r0 != 0) goto L_0x0051
            java.lang.String r2 = "mVEVideoPublishEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0051:
            android.arch.lifecycle.o r0 = r0.mo119521m()
            java.lang.String r2 = "mVEVideoPublishEditViewM…el.volumeChangeOpLiveData"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r5 = com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofVoice(r5)
            r0.setValue(r5)
        L_0x0061:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r3.f102520q
            if (r5 != 0) goto L_0x006a
            java.lang.String r0 = "mVideoPublishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x006a:
            java.lang.String r5 = r5.mMusicPath
            if (r5 == 0) goto L_0x008b
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x008b
            dmt.av.video.VEVideoPublishEditViewModel r5 = r3.f102494R
            if (r5 != 0) goto L_0x007b
            java.lang.String r0 = "mVEVideoPublishEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x007b:
            android.arch.lifecycle.o r5 = r5.mo119521m()
            java.lang.String r0 = "mVEVideoPublishEditViewM…el.volumeChangeOpLiveData"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r4 = com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofMusic(r4)
            r5.setValue(r4)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.audiorecord.C39475c.mo98326a(float, float):void");
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aie, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…record, container, false)");
        this.f102497U = inflate;
        View view = this.f102497U;
        if (view == null) {
            C7573i.m23583a("parentLayout");
        }
        return view;
    }

    /* renamed from: a */
    static /* synthetic */ void m126082a(C39475c cVar, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        cVar.mo98329a(z, i);
    }
}
