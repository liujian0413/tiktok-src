package com.p280ss.android.ugc.aweme.discover.base;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.discover.adapter.C26499p;
import com.p280ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.discover.base.d */
public final class C26597d implements C0053p<Pair<? extends Integer, ? extends Long>> {

    /* renamed from: a */
    public MusicPlayHelper f70143a;

    /* renamed from: b */
    public Animation f70144b;

    /* renamed from: c */
    public String f70145c;

    /* renamed from: d */
    public C7561a<C7581n> f70146d;

    /* renamed from: e */
    public Music f70147e;

    /* renamed from: f */
    public ImageView f70148f;

    /* renamed from: g */
    public FragmentActivity f70149g;

    /* renamed from: h */
    public String f70150h;

    /* renamed from: a */
    private final void m87370a() {
        long j;
        this.f70148f.clearAnimation();
        MusicPlayHelper musicPlayHelper = this.f70143a;
        Music music = this.f70147e;
        long j2 = -1;
        if (music != null) {
            j = music.getId();
        } else {
            j = -1;
        }
        if (musicPlayHelper.mo68332a(j)) {
            this.f70148f.setImageResource(R.drawable.ahc);
            this.f70143a.mo68327a((C0043i) this.f70149g, (C0053p<Pair<Integer, Long>>) this);
            return;
        }
        MusicPlayHelper musicPlayHelper2 = this.f70143a;
        Music music2 = this.f70147e;
        if (music2 != null) {
            j2 = music2.getId();
        }
        if (musicPlayHelper2.mo68334b(j2)) {
            this.f70148f.setImageResource(R.drawable.ahb);
            this.f70148f.startAnimation(this.f70144b);
            return;
        }
        this.f70148f.setImageResource(R.drawable.ahd);
        this.f70143a.mo68328a((C0053p<Pair<Integer, Long>>) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(Pair<Integer, Long> pair) {
        m87370a();
    }

    /* renamed from: a */
    public final void mo68285a(Music music) {
        this.f70147e = music;
        m87370a();
    }

    /* renamed from: a */
    public final void mo68286a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f70145c = str;
    }

    /* renamed from: a */
    public final void mo68284a(FragmentActivity fragmentActivity, Music music) {
        C7573i.m23587b(fragmentActivity, "context");
        C7573i.m23587b(music, "music");
        this.f70143a.mo68330a(fragmentActivity, music, this.f70145c);
    }

    public C26597d(ImageView imageView, FragmentActivity fragmentActivity, String str, final C26499p pVar) {
        C7573i.m23587b(imageView, "playStatus");
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(str, "keyWord");
        this.f70148f = imageView;
        this.f70149g = fragmentActivity;
        this.f70150h = str;
        C0063u a = C0069x.m159a(this.f70149g).mo147a(MusicPlayHelper.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…icPlayHelper::class.java)");
        this.f70143a = (MusicPlayHelper) a;
        this.f70144b = AnimationUtils.loadAnimation(this.f70149g, R.anim.bf);
        this.f70145c = "";
        this.f70148f.setVisibility(0);
        this.f70148f.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C26597d f70151a;

            {
                this.f70151a = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x00a3  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7 A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r7) {
                /*
                    r6 = this;
                    com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r7)
                    com.ss.android.ugc.aweme.discover.base.d r7 = r6.f70151a
                    com.ss.android.ugc.aweme.music.model.Music r7 = r7.f70147e
                    if (r7 != 0) goto L_0x000a
                    return
                L_0x000a:
                    com.ss.android.ugc.aweme.discover.base.d r7 = r6.f70151a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r7 = r7.f70143a
                    com.ss.android.ugc.aweme.discover.base.d r0 = r6.f70151a
                    com.ss.android.ugc.aweme.music.model.Music r0 = r0.f70147e
                    if (r0 != 0) goto L_0x0017
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0017:
                    long r0 = r0.getId()
                    boolean r7 = r7.mo68332a(r0)
                    if (r7 != 0) goto L_0x0086
                    com.ss.android.ugc.aweme.discover.base.d r7 = r6.f70151a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r7 = r7.f70143a
                    com.ss.android.ugc.aweme.discover.base.d r0 = r6.f70151a
                    com.ss.android.ugc.aweme.music.model.Music r0 = r0.f70147e
                    if (r0 != 0) goto L_0x002e
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x002e:
                    long r0 = r0.getId()
                    boolean r7 = r7.mo68334b(r0)
                    if (r7 == 0) goto L_0x0039
                    goto L_0x0086
                L_0x0039:
                    com.ss.android.ugc.aweme.discover.base.d r7 = r6.f70151a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r7 = r7.f70143a
                    com.ss.android.ugc.aweme.discover.base.d r0 = r6.f70151a
                    android.support.v4.app.FragmentActivity r0 = r0.f70149g
                    android.arch.lifecycle.i r0 = (android.arch.lifecycle.C0043i) r0
                    com.ss.android.ugc.aweme.discover.base.d r1 = r6.f70151a
                    android.arch.lifecycle.p r1 = (android.arch.lifecycle.C0053p) r1
                    r7.mo68327a(r0, r1)
                    com.ss.android.ugc.aweme.discover.adapter.p r7 = r5
                    if (r7 == 0) goto L_0x005d
                    com.ss.android.ugc.aweme.discover.base.d r0 = r6.f70151a
                    com.ss.android.ugc.aweme.music.model.Music r0 = r0.f70147e
                    if (r0 != 0) goto L_0x0057
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0057:
                    int r7 = r7.mo68040a(r0)
                    r4 = r7
                    goto L_0x005f
                L_0x005d:
                    r7 = 0
                    r4 = 0
                L_0x005f:
                    java.lang.String r7 = "general_search"
                    java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                    com.ss.android.ugc.aweme.discover.base.d r0 = r6.f70151a
                    java.lang.String r0 = r0.f70145c
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    boolean r5 = android.text.TextUtils.equals(r7, r0)
                    com.ss.android.ugc.aweme.discover.base.d r7 = r6.f70151a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r0 = r7.f70143a
                    com.ss.android.ugc.aweme.discover.base.d r7 = r6.f70151a
                    android.support.v4.app.FragmentActivity r1 = r7.f70149g
                    com.ss.android.ugc.aweme.discover.base.d r7 = r6.f70151a
                    com.ss.android.ugc.aweme.music.model.Music r2 = r7.f70147e
                    if (r2 != 0) goto L_0x007e
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x007e:
                    com.ss.android.ugc.aweme.discover.base.d r7 = r6.f70151a
                    java.lang.String r3 = r7.f70150h
                    r0.mo68331a(r1, r2, r3, r4, r5)
                    goto L_0x008d
                L_0x0086:
                    com.ss.android.ugc.aweme.discover.base.d r7 = r6.f70151a
                    com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r7 = r7.f70143a
                    r7.mo68326a()
                L_0x008d:
                    com.ss.android.ugc.aweme.discover.base.d r7 = r6.f70151a
                    android.view.animation.Animation r7 = r7.f70144b
                    if (r7 == 0) goto L_0x009d
                    android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
                    r0.<init>()
                    android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
                    r7.setInterpolator(r0)
                L_0x009d:
                    com.ss.android.ugc.aweme.discover.base.d r7 = r6.f70151a
                    kotlin.jvm.a.a<kotlin.n> r7 = r7.f70146d
                    if (r7 == 0) goto L_0x00a7
                    r7.invoke()
                    return
                L_0x00a7:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.base.C26597d.C265981.onClick(android.view.View):void");
            }
        });
    }

    public C26597d(ImageView imageView, FragmentActivity fragmentActivity, String str, C26499p pVar, C7561a<C7581n> aVar) {
        C7573i.m23587b(imageView, "playStatus");
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(str, "keyWord");
        C7573i.m23587b(aVar, "performClick");
        this(imageView, fragmentActivity, str, pVar);
        this.f70146d = aVar;
    }
}
