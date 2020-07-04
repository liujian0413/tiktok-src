package com.p280ss.android.ugc.aweme.shortvideo.countdown;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtRadioButton;
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
import com.bytedance.scene.group.C12604b;
import com.bytedance.scene.navigation.C12667g;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.imagepipeline.p720g.C13644b;
import com.facebook.imagepipeline.p720g.C13645c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23323e.C23328a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29962c;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.countdown.CountDownModule.C38590a;
import com.p280ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView;
import com.p280ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView.C41673a;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.DecimalFormat;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d */
public final class C38597d extends C12629j implements C11592h {

    /* renamed from: x */
    public static final C38598a f100274x = new C38598a(null);

    /* renamed from: A */
    private C38599b f100275A;

    /* renamed from: i */
    public VolumeTapsView f100276i;

    /* renamed from: j */
    public C38624i f100277j;

    /* renamed from: k */
    public TextView f100278k;

    /* renamed from: l */
    public TextView f100279l;

    /* renamed from: m */
    public TextView f100280m;

    /* renamed from: n */
    public TextView f100281n;

    /* renamed from: o */
    public final CountdownViewModel f100282o;

    /* renamed from: p */
    public boolean f100283p;

    /* renamed from: q */
    public int f100284q;

    /* renamed from: r */
    public ViewGroup f100285r;

    /* renamed from: s */
    public TextView f100286s;

    /* renamed from: t */
    public RadioGroup f100287t;

    /* renamed from: u */
    public DmtRadioButton f100288u;

    /* renamed from: v */
    public DmtRadioButton f100289v;

    /* renamed from: w */
    public C29962c f100290w;

    /* renamed from: y */
    private C38590a f100291y;

    /* renamed from: z */
    private SafeHandler f100292z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$a */
    public static final class C38598a {
        private C38598a() {
        }

        public /* synthetic */ C38598a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m123365a(float f) {
            String format = new DecimalFormat("0.0").format(Float.valueOf(f));
            C7573i.m23582a((Object) format, "DecimalFormat(\"0.0\").format(this)");
            return format;
        }

        /* renamed from: a */
        public static C38597d m123364a(String str, AVMusicWaveBean aVMusicWaveBean, UrlModel urlModel, long j, long j2, long j3, long j4) {
            CountdownState countdownState = new CountdownState(str, urlModel, j, j3, j2, j4, aVMusicWaveBean);
            return new C38597d(countdownState);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$b */
    public interface C38599b {
        /* renamed from: a */
        void mo96567a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$c */
    static final class C38600c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38597d f100293a;

        C38600c(C38597d dVar) {
            this.f100293a = dVar;
        }

        public final void run() {
            if (((float) C38597d.m123331f(this.f100293a).getMeasuredWidth()) < ((float) (C38597d.m123333g(this.f100293a).getMeasuredWidth() + C38597d.m123334h(this.f100293a).getMeasuredWidth())) + C9738o.m28708b((Context) this.f100293a.f33526d_, 8.0f)) {
                this.f100293a.mo96611a(C38597d.m123335i(this.f100293a));
                this.f100293a.mo96611a(C38597d.m123336j(this.f100293a));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$d */
    static final class C38601d extends Lambda implements C7562b<CountdownState, CountdownState> {

        /* renamed from: a */
        public static final C38601d f100294a = new C38601d();

        C38601d() {
            super(1);
        }

        /* renamed from: a */
        private static CountdownState m123367a(CountdownState countdownState) {
            C7573i.m23587b(countdownState, "$receiver");
            return countdownState;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m123367a((CountdownState) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$e */
    static final class C38602e implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C38597d f100295a;

        C38602e(C38597d dVar) {
            this.f100295a = dVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == R.id.co0) {
                if (this.f100295a.f100284q != 3) {
                    this.f100295a.mo96615e(3);
                }
            } else if (i == R.id.cnz && this.f100295a.f100284q != 10) {
                this.f100295a.mo96615e(10);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$f */
    static final class C38603f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38597d f100296a;

        C38603f(C38597d dVar) {
            this.f100296a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Activity activity = this.f100296a.f33526d_;
            if (activity != null) {
                C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(ShortVideoContextViewModel.class);
                C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
                C6907h.m21524a("count_down_start", (Map) C22984d.m75611a().mo59973a("creation_id", shortVideoContext.f99787w).mo59973a("shoot_way", shortVideoContext.f99788x).mo59970a("draft_id", shortVideoContext.f99790z).mo59973a("countdown_type", this.f100296a.mo30921H()).f60753a);
                if (this.f100296a.f100277j != null) {
                    this.f100296a.mo29066a(this.f100296a.f100282o, (C7562b<? super S1, ? extends R>) new C7562b<CountdownState, Boolean>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C38603f f100297a;

                        {
                            this.f100297a = r1;
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            return Boolean.valueOf(m123368a((CountdownState) obj));
                        }

                        /* renamed from: a */
                        private boolean m123368a(final CountdownState countdownState) {
                            C7573i.m23587b(countdownState, "state");
                            return C38597d.m123324a(this.f100297a.f100296a).post(new Runnable(this) {

                                /* renamed from: a */
                                final /* synthetic */ C386041 f100298a;

                                {
                                    this.f100298a = r1;
                                }

                                public final void run() {
                                    C38624i iVar = this.f100298a.f100297a.f100296a.f100277j;
                                    if (iVar != null) {
                                        iVar.mo96569a(C38597d.m123327b(this.f100298a.f100297a.f100296a).getStopPosition() - ((int) countdownState.getStartTime()), this.f100298a.f100297a.f100296a.f100284q);
                                    }
                                    this.f100298a.f100297a.f100296a.f100283p = true;
                                    this.f100298a.f100297a.f100296a.mo30920G();
                                }
                            });
                        }
                    });
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$g */
    static final class C38606g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38597d f100300a;

        C38606g(C38597d dVar) {
            this.f100300a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f100300a.mo30920G();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$h */
    static final class C38607h implements C12667g {

        /* renamed from: a */
        final /* synthetic */ C38597d f100301a;

        C38607h(C38597d dVar) {
            this.f100301a = dVar;
        }

        /* renamed from: a */
        public final boolean mo31072a() {
            this.f100301a.mo30920G();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$i */
    static final class C38608i extends Lambda implements C7563m<C11585f, CountdownState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38597d f100302a;

        C38608i(C38597d dVar) {
            this.f100302a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m123370a((C11585f) obj, (CountdownState) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m123370a(C11585f fVar, CountdownState countdownState) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(countdownState, "state");
            C38597d.m123327b(this.f100302a).mo102426a((int) countdownState.getStartTime(), (int) (countdownState.getStartTime() + countdownState.getMaxDuration()));
            C38597d.m123327b(this.f100302a).mo102427a(countdownState.getWaveInfo(), C35563c.f93246i.mo103862b(countdownState.getMusicPath()));
            C38597d.m123327b(this.f100302a).setTotalTime(countdownState.getTotalTime());
            C38597d.m123327b(this.f100302a).setPastPosition((int) (Math.max(0, countdownState.getSdkRecordTime()) + countdownState.getStartTime()));
            C38597d.m123327b(this.f100302a).setStopPosition((int) (Math.max(0, countdownState.getMaxDuration()) + countdownState.getStartTime()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$j */
    static final class C38609j extends Lambda implements C7563m<C11585f, UrlModel, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38597d f100303a;

        C38609j(C38597d dVar) {
            this.f100303a = dVar;
            super(2);
        }

        /* renamed from: a */
        private void m123371a(C11585f fVar, UrlModel urlModel) {
            C7573i.m23587b(fVar, "$receiver");
            C23323e.m76502a(urlModel, (C23328a) new C23328a(this) {

                /* renamed from: a */
                final /* synthetic */ C38609j f100304a;

                /* renamed from: a */
                public final void mo60610a(Exception exc) {
                    C7573i.m23587b(exc, "e");
                }

                {
                    this.f100304a = r1;
                }

                /* renamed from: a */
                public final void mo60609a(C13346c<C13326a<C13645c>> cVar) {
                    C7573i.m23587b(cVar, "dataSource");
                    if (cVar.mo32639b()) {
                        C13326a aVar = (C13326a) cVar.mo32641d();
                        Bitmap bitmap = null;
                        if (aVar != null && (aVar.mo32609a() instanceof C13644b)) {
                            Object a = aVar.mo32609a();
                            if (a != null) {
                                bitmap = ((C13644b) a).mo33265d();
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableBitmap");
                            }
                        }
                        try {
                            C38597d.m123327b(this.f100304a.f100303a).setWavForm(bitmap);
                        } finally {
                            C13326a.m39001c(aVar);
                        }
                    }
                }
            });
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m123371a((C11585f) obj, (UrlModel) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$k */
    public static final class C38611k implements C41673a {

        /* renamed from: a */
        final /* synthetic */ C38597d f100305a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$k$a */
        static final class C38612a extends Lambda implements C7562b<CountdownState, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C38611k f100306a;

            /* renamed from: b */
            final /* synthetic */ int f100307b;

            C38612a(C38611k kVar, int i) {
                this.f100306a = kVar;
                this.f100307b = i;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m123376a((CountdownState) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m123376a(CountdownState countdownState) {
                C7573i.m23587b(countdownState, "state");
                this.f100306a.f100305a.mo96610a((long) this.f100307b, countdownState.getStartTime(), countdownState.getMaxDuration());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$k$b */
        static final class C38613b extends Lambda implements C7562b<CountdownState, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C38611k f100308a;

            /* renamed from: b */
            final /* synthetic */ int f100309b;

            /* renamed from: c */
            final /* synthetic */ int f100310c;

            C38613b(C38611k kVar, int i, int i2) {
                this.f100308a = kVar;
                this.f100309b = i;
                this.f100310c = i2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m123377a((CountdownState) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m123377a(CountdownState countdownState) {
                C7573i.m23587b(countdownState, "state");
                C38624i iVar = this.f100308a.f100305a.f100277j;
                if (iVar != null) {
                    iVar.mo96570a(countdownState.getMusicPath(), this.f100309b, this.f100310c);
                }
                C6907h.onEvent(MobClick.obtain().setEventName("change_beat").setLabelName("beat_page"));
                this.f100308a.f100305a.mo96610a((long) this.f100310c, countdownState.getStartTime(), countdownState.getMaxDuration());
            }
        }

        C38611k(C38597d dVar) {
            this.f100305a = dVar;
        }

        /* renamed from: a */
        public final void mo96621a(int i) {
            this.f100305a.mo29066a(this.f100305a.f100282o, (C7562b<? super S1, ? extends R>) new C38612a<Object,Object>(this, i));
        }

        /* renamed from: a */
        public final void mo96622a(int i, int i2) {
            this.f100305a.mo29066a(this.f100305a.f100282o, (C7562b<? super S1, ? extends R>) new C38613b<Object,Object>(this, i, i2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$l */
    static final class C38614l extends Lambda implements C7563m<C11585f, Long, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38597d f100311a;

        C38614l(C38597d dVar) {
            this.f100311a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m123378a((C11585f) obj, ((Number) obj2).longValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m123378a(C11585f fVar, long j) {
            C7573i.m23587b(fVar, "$receiver");
            TextView c = C38597d.m123328c(this.f100311a);
            StringBuilder sb = new StringBuilder();
            sb.append(j / 1000);
            sb.append('s');
            c.setText(sb.toString());
            TextView d = C38597d.m123329d(this.f100311a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C38598a.m123365a(((float) j) / 1000.0f));
            sb2.append('s');
            d.setText(sb2.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$m */
    public static final class C38615m implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C38597d f100312a;

        /* renamed from: b */
        final /* synthetic */ View f100313b;

        /* renamed from: c */
        final /* synthetic */ View f100314c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$m$a */
        static final class C38616a extends Lambda implements C7562b<CountdownState, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C38615m f100315a;

            C38616a(C38615m mVar) {
                this.f100315a = mVar;
                super(1);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C7581n invoke(CountdownState countdownState) {
                C7573i.m23587b(countdownState, "state");
                this.f100315a.f100312a.mo96610a((long) C38597d.m123327b(this.f100315a.f100312a).getStopPosition(), countdownState.getStartTime(), countdownState.getMaxDuration());
                this.f100315a.f100313b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f100315a);
                C38624i iVar = this.f100315a.f100312a.f100277j;
                if (iVar == null) {
                    return null;
                }
                iVar.mo96570a(countdownState.getMusicPath(), (int) (countdownState.getStartTime() + countdownState.getSdkRecordTime()), (int) (countdownState.getStartTime() + countdownState.getMaxDuration()));
                return C7581n.f20898a;
            }
        }

        public final void onGlobalLayout() {
            this.f100312a.mo29066a(this.f100312a.f100282o, (C7562b<? super S1, ? extends R>) new C38616a<Object,Object>(this));
            ObjectAnimator.ofFloat(this.f100314c, "translationY", new float[]{(float) this.f100314c.getMeasuredHeight(), 0.0f}).start();
        }

        C38615m(C38597d dVar, View view, View view2) {
            this.f100312a = dVar;
            this.f100313b = view;
            this.f100314c = view2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$n */
    static final class C38617n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38597d f100316a;

        /* renamed from: b */
        final /* synthetic */ int f100317b;

        C38617n(C38597d dVar, int i) {
            this.f100316a = dVar;
            this.f100317b = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void run() {
            if (this.f100316a.f100290w == null) {
                Activity activity = this.f100316a.f33526d_;
                if (activity != null) {
                    C7573i.m23582a((Object) activity, "activity ?: return@showToast");
                    this.f100316a.f100290w = new C29962c(activity);
                } else {
                    return;
                }
            }
            C29962c cVar = this.f100316a.f100290w;
            if (cVar != null) {
                C38597d dVar = this.f100316a;
                Object[] objArr = new Object[1];
                int i = 3;
                if (this.f100317b != 3) {
                    i = 10;
                }
                objArr[0] = Integer.valueOf(i);
                cVar.mo76120a(dVar.mo31000a((int) R.string.ahm, objArr));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d$o */
    static final class C38618o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38597d f100318a;

        /* renamed from: b */
        final /* synthetic */ long f100319b;

        /* renamed from: c */
        final /* synthetic */ long f100320c;

        /* renamed from: d */
        final /* synthetic */ long f100321d;

        C38618o(C38597d dVar, long j, long j2, long j3) {
            this.f100318a = dVar;
            this.f100319b = j;
            this.f100320c = j2;
            this.f100321d = j3;
        }

        public final void run() {
            float b = this.f100318a.mo96613b(this.f100319b, this.f100320c, this.f100321d);
            TextView d = C38597d.m123329d(this.f100318a);
            StringBuilder sb = new StringBuilder();
            sb.append(C38598a.m123365a(((float) (this.f100319b - this.f100320c)) / 1000.0f));
            sb.append('s');
            d.setText(sb.toString());
            C38597d.m123329d(this.f100318a).setTranslationX((b / ((float) C38597d.m123327b(this.f100318a).getMeasuredWidth())) * ((float) (C38597d.m123327b(this.f100318a).getMeasuredWidth() - C38597d.m123329d(this.f100318a).getMeasuredWidth())));
            C38597d.m123328c(this.f100318a).setAlpha(this.f100318a.mo96606a(b));
            C38597d.m123330e(this.f100318a).setAlpha(this.f100318a.mo96606a(((float) C38597d.m123327b(this.f100318a).getMeasuredWidth()) - b));
        }
    }

    /* renamed from: a */
    public static final C38597d m123325a(String str, AVMusicWaveBean aVMusicWaveBean, UrlModel urlModel, long j, long j2, long j3, long j4) {
        return C38598a.m123364a(str, aVMusicWaveBean, urlModel, j, j2, j3, j4);
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
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C11593a.m34071a(this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
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

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C11593a.m34074a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo96612a(C12604b bVar, int i, String str) {
        C7573i.m23587b(bVar, "root");
        C7573i.m23587b(str, "tag");
        bVar.mo30925a(i, (C12629j) this, str);
    }

    /* renamed from: a */
    public final void mo96610a(long j, long j2, long j3) {
        SafeHandler safeHandler = this.f100292z;
        if (safeHandler == null) {
            C7573i.m23583a("safeHandler");
        }
        C38618o oVar = new C38618o(this, j, j2, j3);
        safeHandler.post(oVar);
    }

    /* renamed from: a */
    public final void mo96611a(DmtRadioButton dmtRadioButton) {
        LayoutParams layoutParams = dmtRadioButton.getLayoutParams();
        if (!(layoutParams instanceof RadioGroup.LayoutParams)) {
            layoutParams = null;
        }
        RadioGroup.LayoutParams layoutParams2 = (RadioGroup.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.width = (int) C9738o.m28708b((Context) this.f33526d_, 32.0f);
            dmtRadioButton.setLayoutParams(layoutParams2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public C11585f mo29191e() {
        return C11593a.m34077d(this);
    }

    /* renamed from: A */
    public final void mo30993A() {
        super.mo30993A();
        m123320J();
    }

    /* renamed from: C */
    public final void mo30995C() {
        super.mo30995C();
        m123322L();
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

    /* renamed from: L */
    private final void m123322L() {
        C29962c cVar = this.f100290w;
        if (cVar != null) {
            cVar.mo76126d();
        }
    }

    /* renamed from: H */
    public final String mo30921H() {
        if (this.f100284q == 3) {
            return "3s";
        }
        return "10s";
    }

    /* renamed from: J */
    private final void m123320J() {
        ViewGroup viewGroup = this.f100285r;
        if (viewGroup == null) {
            C7573i.m23583a("countDownTitleView");
        }
        viewGroup.post(new C38600c(this));
    }

    /* renamed from: G */
    public final void mo30920G() {
        C12629j jVar = this.f33524c;
        if (!(jVar instanceof C12604b)) {
            jVar = null;
        }
        C12604b bVar = (C12604b) jVar;
        if (bVar != null) {
            bVar.mo30935b((C12629j) this);
        }
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C11593a.m34068a(this);
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        C38624i iVar = this.f100277j;
        if (iVar != null) {
            iVar.mo96568a();
        }
        C38590a aVar = this.f100291y;
        if (aVar != null) {
            aVar.mo96573a(this.f100283p);
        }
    }

    /* renamed from: I */
    private final void m123319I() {
        this.f100284q = ((C35622l) C25682d.m84426a(this.f33526d_, C35622l.class)).mo60370e(3);
        if (this.f100284q == 3) {
            DmtRadioButton dmtRadioButton = this.f100288u;
            if (dmtRadioButton == null) {
                C7573i.m23583a("countDownShortView");
            }
            dmtRadioButton.setChecked(true);
            return;
        }
        DmtRadioButton dmtRadioButton2 = this.f100289v;
        if (dmtRadioButton2 == null) {
            C7573i.m23583a("countDownLongView");
        }
        dmtRadioButton2.setChecked(true);
    }

    /* renamed from: K */
    private final void m123321K() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(ShortVideoContextViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
            C6907h.m21524a("select_countdown_type", (Map) C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").mo59973a("shoot_way", shortVideoContext.f99788x).mo59973a("creation_id", shortVideoContext.f99787w).mo59973a("content_type", "video").mo59973a("to_status", mo30921H()).f60753a);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final C38597d mo96607a(C38590a aVar) {
        this.f100291y = aVar;
        return this;
    }

    public C38597d(CountdownState countdownState) {
        C7573i.m23587b(countdownState, "initState");
        this.f100282o = new CountdownViewModel(countdownState);
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m123324a(C38597d dVar) {
        TextView textView = dVar.f100281n;
        if (textView == null) {
            C7573i.m23583a("record");
        }
        return textView;
    }

    /* renamed from: b */
    public static final /* synthetic */ VolumeTapsView m123327b(C38597d dVar) {
        VolumeTapsView volumeTapsView = dVar.f100276i;
        if (volumeTapsView == null) {
            C7573i.m23583a("volumeTapsView");
        }
        return volumeTapsView;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m123328c(C38597d dVar) {
        TextView textView = dVar.f100279l;
        if (textView == null) {
            C7573i.m23583a("endTextView");
        }
        return textView;
    }

    /* renamed from: d */
    public static final /* synthetic */ TextView m123329d(C38597d dVar) {
        TextView textView = dVar.f100280m;
        if (textView == null) {
            C7573i.m23583a("anchorTextView");
        }
        return textView;
    }

    /* renamed from: e */
    public static final /* synthetic */ TextView m123330e(C38597d dVar) {
        TextView textView = dVar.f100278k;
        if (textView == null) {
            C7573i.m23583a("startTextView");
        }
        return textView;
    }

    /* renamed from: f */
    public static final /* synthetic */ ViewGroup m123331f(C38597d dVar) {
        ViewGroup viewGroup = dVar.f100285r;
        if (viewGroup == null) {
            C7573i.m23583a("countDownTitleView");
        }
        return viewGroup;
    }

    /* renamed from: g */
    public static final /* synthetic */ TextView m123333g(C38597d dVar) {
        TextView textView = dVar.f100286s;
        if (textView == null) {
            C7573i.m23583a("countDownTitleTextView");
        }
        return textView;
    }

    /* renamed from: h */
    public static final /* synthetic */ RadioGroup m123334h(C38597d dVar) {
        RadioGroup radioGroup = dVar.f100287t;
        if (radioGroup == null) {
            C7573i.m23583a("countDownSwitchView");
        }
        return radioGroup;
    }

    /* renamed from: i */
    public static final /* synthetic */ DmtRadioButton m123335i(C38597d dVar) {
        DmtRadioButton dmtRadioButton = dVar.f100288u;
        if (dmtRadioButton == null) {
            C7573i.m23583a("countDownShortView");
        }
        return dmtRadioButton;
    }

    /* renamed from: j */
    public static final /* synthetic */ DmtRadioButton m123336j(C38597d dVar) {
        DmtRadioButton dmtRadioButton = dVar.f100289v;
        if (dmtRadioButton == null) {
            C7573i.m23583a("countDownLongView");
        }
        return dmtRadioButton;
    }

    /* renamed from: f */
    private final void m123332f(int i) {
        SafeHandler safeHandler = this.f100292z;
        if (safeHandler == null) {
            C7573i.m23583a("safeHandler");
        }
        safeHandler.post(new C38617n(this, i));
    }

    /* renamed from: d */
    public final void mo96614d(int i) {
        VolumeTapsView volumeTapsView = this.f100276i;
        if (volumeTapsView == null) {
            C7573i.m23583a("volumeTapsView");
        }
        volumeTapsView.setProgress(i);
    }

    /* renamed from: a */
    public final float mo96606a(float f) {
        VolumeTapsView volumeTapsView = this.f100276i;
        if (volumeTapsView == null) {
            C7573i.m23583a("volumeTapsView");
        }
        float measuredWidth = ((float) volumeTapsView.getMeasuredWidth()) - f;
        TextView textView = this.f100279l;
        if (textView == null) {
            C7573i.m23583a("endTextView");
        }
        return Math.min(1.0f, (measuredWidth - ((float) textView.getMeasuredWidth())) / 100.0f);
    }

    /* renamed from: e */
    public final void mo96615e(int i) {
        Activity activity = this.f33526d_;
        if (activity != null) {
            C7573i.m23582a((Object) activity, "activity ?: return");
            this.f100284q = i;
            m123321K();
            m123332f(i);
            ((C35622l) C25682d.m84426a(activity, C35622l.class)).mo60368d(i);
            C38599b bVar = this.f100275A;
            if (bVar != null) {
                bVar.mo96567a(i);
            }
        }
    }

    /* renamed from: a */
    public final C38597d mo96608a(C38599b bVar) {
        this.f100275A = bVar;
        return this;
    }

    /* renamed from: a */
    public final C38597d mo96609a(C38624i iVar) {
        this.f100277j = iVar;
        return this;
    }

    /* renamed from: a */
    private final void m123326a(View view, View view2) {
        mo29061a(this.f100282o, C11640h.m34110a(), new C38608i(this));
        mo29062a(this.f100282o, C38619e.f100322a, C11640h.m34110a(), new C38609j(this));
        VolumeTapsView volumeTapsView = this.f100276i;
        if (volumeTapsView == null) {
            C7573i.m23583a("volumeTapsView");
        }
        volumeTapsView.setOnProgressChangeListener(new C38611k(this));
        TextView textView = this.f100278k;
        if (textView == null) {
            C7573i.m23583a("startTextView");
        }
        textView.setText("0s");
        mo29062a(this.f100282o, C38620f.f100323a, C11640h.m34110a(), new C38614l(this));
        view.getViewTreeObserver().addOnGlobalLayoutListener(new C38615m(this, view, view2));
    }

    /* renamed from: b */
    public final float mo96613b(long j, long j2, long j3) {
        float f = ((float) (j - j2)) * 1.0f;
        VolumeTapsView volumeTapsView = this.f100276i;
        if (volumeTapsView == null) {
            C7573i.m23583a("volumeTapsView");
        }
        return Math.max(0.0f, (f * ((float) volumeTapsView.getMeasuredWidth())) / ((float) j3));
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        C0043i iVar = this;
        this.f100292z = new SafeHandler(iVar);
        this.f100282o.mo29034a((C7562b<? super S, ? extends S>) C38601d.f100294a);
        View inflate = layoutInflater.inflate(R.layout.qg, viewGroup, false);
        C7573i.m23582a((Object) inflate, "contentView");
        inflate.setMinimumWidth(100000);
        View findViewById = inflate.findViewById(R.id.ee7);
        C7573i.m23582a((Object) findViewById, "contentView.findViewById(R.id.volume_taps_view)");
        this.f100276i = (VolumeTapsView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.di9);
        C7573i.m23582a((Object) findViewById2, "contentView.findViewById(R.id.text_start)");
        this.f100278k = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.dho);
        C7573i.m23582a((Object) findViewById3, "contentView.findViewById(R.id.text_end)");
        this.f100279l = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.di1);
        C7573i.m23582a((Object) findViewById4, "contentView.findViewById(R.id.text_progress)");
        this.f100280m = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.da5);
        C7573i.m23582a((Object) findViewById5, "contentView.findViewById(R.id.start_record)");
        this.f100281n = (TextView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.dka);
        C7573i.m23582a((Object) findViewById6, "contentView.findViewById(R.id.title_countDown)");
        this.f100285r = (ViewGroup) findViewById6;
        View findViewById7 = inflate.findViewById(R.id.dhj);
        C7573i.m23582a((Object) findViewById7, "contentView.findViewById(R.id.text_countdown)");
        this.f100286s = (TextView) findViewById7;
        View findViewById8 = inflate.findViewById(R.id.csq);
        C7573i.m23582a((Object) findViewById8, "contentView.findViewById(R.id.rg_countdown_switch)");
        this.f100287t = (RadioGroup) findViewById8;
        View findViewById9 = inflate.findViewById(R.id.co0);
        C7573i.m23582a((Object) findViewById9, "contentView.findViewById(R.id.rb_countdown_3)");
        this.f100288u = (DmtRadioButton) findViewById9;
        View findViewById10 = inflate.findViewById(R.id.cnz);
        C7573i.m23582a((Object) findViewById10, "contentView.findViewById(R.id.rb_countdown_10)");
        this.f100289v = (DmtRadioButton) findViewById10;
        DmtRadioButton dmtRadioButton = this.f100288u;
        if (dmtRadioButton == null) {
            C7573i.m23583a("countDownShortView");
        }
        TextPaint paint = dmtRadioButton.getPaint();
        C7573i.m23582a((Object) paint, "countDownShortView.paint");
        paint.setFakeBoldText(true);
        DmtRadioButton dmtRadioButton2 = this.f100289v;
        if (dmtRadioButton2 == null) {
            C7573i.m23583a("countDownLongView");
        }
        TextPaint paint2 = dmtRadioButton2.getPaint();
        C7573i.m23582a((Object) paint2, "countDownLongView.paint");
        paint2.setFakeBoldText(true);
        if (C43127fh.m136806a(this.f33526d_)) {
            DmtRadioButton dmtRadioButton3 = this.f100288u;
            if (dmtRadioButton3 == null) {
                C7573i.m23583a("countDownShortView");
            }
            dmtRadioButton3.setBackgroundResource(R.drawable.e8);
            DmtRadioButton dmtRadioButton4 = this.f100289v;
            if (dmtRadioButton4 == null) {
                C7573i.m23583a("countDownLongView");
            }
            dmtRadioButton4.setBackgroundResource(R.drawable.e5);
        }
        RadioGroup radioGroup = this.f100287t;
        if (radioGroup == null) {
            C7573i.m23583a("countDownSwitchView");
        }
        radioGroup.setOnCheckedChangeListener(new C38602e(this));
        m123319I();
        TextView textView = this.f100281n;
        if (textView == null) {
            C7573i.m23583a("record");
        }
        textView.setOnClickListener(new C38603f(this));
        inflate.findViewById(R.id.a3h).setOnClickListener(new C38606g(this));
        mo31018y().mo31057a(iVar, (C12667g) new C38607h(this));
        View findViewById11 = inflate.findViewById(R.id.a3g);
        C7573i.m23582a((Object) findViewById11, "contentView.findViewById(R.id.count_down_panel)");
        m123326a(inflate, findViewById11);
        C38590a aVar = this.f100291y;
        if (aVar != null) {
            aVar.mo96572a();
        }
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34069a(this, jediViewModel, vVar, mVar);
    }
}
