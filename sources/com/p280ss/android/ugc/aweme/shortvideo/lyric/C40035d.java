package com.p280ss.android.ugc.aweme.shortvideo.lyric;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.util.C1143a;
import android.support.p029v7.util.C1143a.C1146b;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.effect.C27431j;
import com.p280ss.android.ugc.aweme.effect.EffectDiff;
import com.p280ss.android.ugc.aweme.effect.EffectModel;
import com.p280ss.android.ugc.aweme.effect.p1194a.C27359a;
import com.p280ss.android.ugc.aweme.effect.p1194a.C27359a.C27361b;
import com.p280ss.android.ugc.aweme.effect.p1194a.p1195a.C27370b;
import com.p280ss.android.ugc.aweme.effect.p1194a.p1195a.C27371c;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.shortvideo.music.collect.LyricEffectItemAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.music.collect.LyricEffectItemAdapter.C40091b;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.editor.C44298ct;
import com.p280ss.android.ugc.gamora.editor.EditLyricStickerViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.d */
public final class C40035d implements C27370b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f103958a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C40035d.class), "mDownloadController", "getMDownloadController()Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController;"))};

    /* renamed from: b */
    public C40027c f103959b;

    /* renamed from: c */
    public EditLyricStickerViewModel f103960c;

    /* renamed from: d */
    public final C40040e f103961d = new C40040e(this);

    /* renamed from: e */
    private View f103962e;

    /* renamed from: f */
    private AppCompatActivity f103963f;

    /* renamed from: g */
    private AVDmtPanelRecyleView f103964g;

    /* renamed from: h */
    private LyricEffectItemAdapter f103965h;

    /* renamed from: i */
    private DmtStatusView f103966i;

    /* renamed from: j */
    private long f103967j;

    /* renamed from: k */
    private List<EffectModel> f103968k = new ArrayList();

    /* renamed from: l */
    private LyricEffectViewModel f103969l;

    /* renamed from: m */
    private String f103970m;

    /* renamed from: n */
    private final C7541d f103971n = C7546e.m23569a(new C40039d(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.d$a */
    static final class C40036a<T> implements C0053p<LiveDataWrapper<List<? extends Effect>>> {

        /* renamed from: a */
        final /* synthetic */ C40035d f103972a;

        C40036a(C40035d dVar) {
            this.f103972a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveDataWrapper<List<Effect>> liveDataWrapper) {
            STATUS status;
            if (liveDataWrapper != null) {
                status = liveDataWrapper.f88768b;
            } else {
                status = null;
            }
            if (status != null && C40041e.f103977a[status.ordinal()] == 1) {
                List list = (List) liveDataWrapper.f88767a;
                if (list != null) {
                    C7573i.m23582a((Object) list, "it");
                    if (!(!list.isEmpty())) {
                        list = null;
                    }
                    if (list != null) {
                        C7573i.m23582a((Object) list, "effectList");
                        int i = 0;
                        for (Object next : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                C7525m.m23465b();
                            }
                            Effect effect = (Effect) next;
                            C40035d dVar = this.f103972a;
                            EffectModel a = C27431j.m89891a(i, effect, "");
                            C7573i.m23582a((Object) a, "EffectDataProvider.cover…tModel(index, effect, \"\")");
                            dVar.mo99474a(a);
                            i = i2;
                        }
                        this.f103972a.mo99471a().mo70462a(C7525m.m23461a());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.d$b */
    static final class C40037b<T> implements C0053p<LiveDataWrapper<List<? extends Effect>>> {

        /* renamed from: a */
        final /* synthetic */ C40035d f103973a;

        C40037b(C40035d dVar) {
            this.f103973a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveDataWrapper<List<Effect>> liveDataWrapper) {
            STATUS status;
            if (liveDataWrapper != null) {
                status = liveDataWrapper.f88768b;
            } else {
                status = null;
            }
            if (status != null && C40041e.f103978b[status.ordinal()] == 1) {
                List list = (List) liveDataWrapper.f88767a;
                if (list != null) {
                    C7573i.m23582a((Object) list, "it");
                    if (!(!list.isEmpty())) {
                        list = null;
                    }
                    if (list != null) {
                        this.f103973a.mo99471a().mo70462a(C7525m.m23461a());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.d$c */
    public static final class C40038c implements C40091b {

        /* renamed from: a */
        final /* synthetic */ C40035d f103974a;

        C40038c(C40035d dVar) {
            this.f103974a = dVar;
        }

        /* renamed from: a */
        public final void mo99479a(EffectModel effectModel, int i, int i2) {
            C7573i.m23587b(effectModel, "model");
            if (i == 1) {
                C40027c cVar = this.f103974a.f103959b;
                if (cVar == null) {
                    C7573i.m23580a();
                }
                if (i2 <= cVar.f103943b.size()) {
                    C40027c cVar2 = this.f103974a.f103959b;
                    if (cVar2 == null) {
                        C7573i.m23580a();
                    }
                    Effect effect = (Effect) cVar2.f103943b.get(i2);
                    Effect b = this.f103974a.mo99476b(effect);
                    if (this.f103974a.mo99471a() != null) {
                        EffectPlatform a = C27359a.m89722a();
                        if (a != null && a.mo70640a(effect)) {
                            if (this.f103974a.mo99471a() != null) {
                                EffectPlatform a2 = C27359a.m89722a();
                                if (a2 != null && a2.mo70640a(b)) {
                                    C40035d.m127967a(this.f103974a).mo106271a(new C44298ct(effect, b));
                                }
                            }
                            C27359a a3 = this.f103974a.mo99471a();
                            if (a3 != null) {
                                a3.mo70459a(effect);
                                return;
                            }
                            return;
                        }
                    }
                    C27359a a4 = this.f103974a.mo99471a();
                    if (a4 != null) {
                        a4.mo70459a(effect);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.d$d */
    static final class C40039d extends Lambda implements C7561a<C27359a> {

        /* renamed from: a */
        final /* synthetic */ C40035d f103975a;

        C40039d(C40035d dVar) {
            this.f103975a = dVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C27359a invoke() {
            return new C27361b().mo70469a(Integer.valueOf(3)).mo70468a((C27371c) this.f103975a.f103961d).mo70470a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.d$e */
    public static final class C40040e implements C27371c {

        /* renamed from: a */
        final /* synthetic */ C40035d f103976a;

        /* renamed from: a */
        public final boolean mo70395a() {
            return true;
        }

        C40040e(C40035d dVar) {
            this.f103976a = dVar;
        }

        /* renamed from: a */
        public final Effect mo70394a(Queue<Effect> queue) {
            C7573i.m23587b(queue, "queue");
            C40027c cVar = this.f103976a.f103959b;
            if (cVar == null) {
                C7573i.m23580a();
            }
            int size = cVar.f103943b.size();
            for (int i = 0; i < size; i++) {
                C40027c cVar2 = this.f103976a.f103959b;
                if (cVar2 == null) {
                    C7573i.m23580a();
                }
                Effect effect = (Effect) cVar2.f103943b.get(i);
                this.f103976a.mo99471a();
                EffectPlatform a = C27359a.m89722a();
                if (a == null) {
                    C7573i.m23580a();
                }
                boolean a2 = a.mo70640a(effect);
                boolean contains = queue.contains(effect);
                Effect b = this.f103976a.mo99476b(effect);
                this.f103976a.mo99471a();
                EffectPlatform a3 = C27359a.m89722a();
                if (a3 == null) {
                    C7573i.m23580a();
                }
                boolean a4 = a3.mo70640a(b);
                boolean contains2 = queue.contains(b);
                if (!a2 && !contains) {
                    return effect;
                }
                if (!a4 && !contains2) {
                    return b;
                }
                if (a2 && a4) {
                    this.f103976a.mo99471a().mo70461a(effect, effect, false);
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final C27359a mo99471a() {
        return (C27359a) this.f103971n.getValue();
    }

    /* renamed from: a */
    public final void mo99475a(String str) {
        this.f103970m = str;
        LyricEffectItemAdapter lyricEffectItemAdapter = this.f103965h;
        if (lyricEffectItemAdapter != null) {
            lyricEffectItemAdapter.mo99792a(this.f103970m);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70398a(com.p280ss.android.ugc.effectmanager.effect.model.Effect r8, com.p280ss.android.ugc.effectmanager.effect.model.Effect r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r10 = "rawEffect"
            kotlin.jvm.internal.C7573i.m23587b(r8, r10)
            int r8 = r7.m127970c(r8)
            r7.mo99471a()
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r10 = com.p280ss.android.ugc.aweme.effect.p1194a.C27359a.m89722a()
            if (r10 != 0) goto L_0x0015
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0015:
            com.ss.android.ugc.aweme.shortvideo.lyric.c r0 = r7.f103959b
            if (r0 != 0) goto L_0x001c
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x001c:
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r0.f103943b
            java.lang.Object r0 = r0.get(r8)
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r0
            boolean r10 = r10.mo70640a(r0)
            r0 = 0
            if (r10 == 0) goto L_0x005c
            r7.mo99471a()
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r10 = com.p280ss.android.ugc.aweme.effect.p1194a.C27359a.m89722a()
            if (r10 != 0) goto L_0x0037
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0037:
            com.ss.android.ugc.aweme.shortvideo.lyric.c r1 = r7.f103959b
            if (r1 != 0) goto L_0x003e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x003e:
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r1.f103943b
            java.lang.Object r1 = r1.get(r8)
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r1
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r7.mo99476b(r1)
            boolean r10 = r10.mo70640a(r1)
            if (r10 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.shortvideo.music.collect.LyricEffectItemAdapter r10 = r7.f103965h
            if (r10 != 0) goto L_0x0057
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0057:
            r1 = 3
            r10.mo70493a(r8, r1)
            goto L_0x0075
        L_0x005c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "lyric effect is not ready, effect_id:"
            r8.<init>(r10)
            if (r9 == 0) goto L_0x006a
            java.lang.String r10 = r9.getEffectId()
            goto L_0x006b
        L_0x006a:
            r10 = r0
        L_0x006b:
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132283b(r8)
        L_0x0075:
            java.lang.String r8 = "aweme_type_download_font_rate"
            r10 = 0
            com.ss.android.ugc.aweme.shortvideo.bb r1 = com.p280ss.android.ugc.aweme.shortvideo.C38510bb.m123095a()
            java.lang.String r2 = "duration"
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.f103967j
            long r3 = r3 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.ss.android.ugc.aweme.shortvideo.bb r1 = r1.mo96480a(r2, r3)
            java.lang.String r2 = "effect_id"
            if (r9 == 0) goto L_0x0096
            java.lang.String r3 = r9.getEffectId()
            goto L_0x0097
        L_0x0096:
            r3 = r0
        L_0x0097:
            com.ss.android.ugc.aweme.shortvideo.bb r1 = r1.mo96481a(r2, r3)
            java.lang.String r2 = "id"
            if (r9 == 0) goto L_0x00a3
            java.lang.String r0 = r9.getId()
        L_0x00a3:
            com.ss.android.ugc.aweme.shortvideo.bb r9 = r1.mo96481a(r2, r0)
            org.json.JSONObject r9 = r9.mo96482b()
            com.p280ss.android.ugc.aweme.base.C6893q.m21444a(r8, r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.lyric.C40035d.mo70398a(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.effect.model.Effect, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70397a(com.p280ss.android.ugc.effectmanager.effect.model.Effect r11, com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0013
            int r0 = r10.m127970c(r11)
            if (r0 < 0) goto L_0x0013
            com.ss.android.ugc.aweme.shortvideo.music.collect.LyricEffectItemAdapter r1 = r10.f103965h
            if (r1 != 0) goto L_0x000f
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x000f:
            r2 = 4
            r1.mo70493a(r0, r2)
        L_0x0013:
            r0 = 0
            if (r12 == 0) goto L_0x001a
            java.lang.String r1 = r12.f113221b
            if (r1 != 0) goto L_0x003c
        L_0x001a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r12 == 0) goto L_0x0031
            int r2 = r12.f113220a
            r3 = -1
            if (r2 != r3) goto L_0x0031
            java.lang.Exception r2 = r12.f113222c
            if (r2 == 0) goto L_0x002f
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            goto L_0x0033
        L_0x002f:
            r2 = r0
            goto L_0x0033
        L_0x0031:
            java.lang.String r2 = ""
        L_0x0033:
            java.io.Serializable r2 = (java.io.Serializable) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x003c:
            java.lang.String r2 = "aweme_type_download_font_rate"
            r3 = 1
            com.ss.android.ugc.aweme.shortvideo.bb r4 = com.p280ss.android.ugc.aweme.shortvideo.C38510bb.m123095a()
            java.lang.String r5 = "duration"
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f103967j
            long r6 = r6 - r8
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            com.ss.android.ugc.aweme.shortvideo.bb r4 = r4.mo96480a(r5, r6)
            java.lang.String r5 = "effect_id"
            if (r11 == 0) goto L_0x005d
            java.lang.String r6 = r11.getEffectId()
            goto L_0x005e
        L_0x005d:
            r6 = r0
        L_0x005e:
            com.ss.android.ugc.aweme.shortvideo.bb r4 = r4.mo96481a(r5, r6)
            java.lang.String r5 = "id"
            if (r11 == 0) goto L_0x006b
            java.lang.String r11 = r11.getId()
            goto L_0x006c
        L_0x006b:
            r11 = r0
        L_0x006c:
            com.ss.android.ugc.aweme.shortvideo.bb r11 = r4.mo96481a(r5, r11)
            java.lang.String r4 = "errorCode"
            if (r12 == 0) goto L_0x007a
            int r12 = r12.f113220a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
        L_0x007a:
            java.lang.String r12 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.shortvideo.bb r11 = r11.mo96481a(r4, r12)
            java.lang.String r12 = "errorMsg"
            com.ss.android.ugc.aweme.shortvideo.bb r11 = r11.mo96481a(r12, r1)
            org.json.JSONObject r11 = r11.mo96482b()
            com.p280ss.android.ugc.aweme.base.C6893q.m21444a(r2, r3, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.lyric.C40035d.mo70397a(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.common.d.c):void");
    }

    /* renamed from: c */
    public final Effect mo99478c() {
        C40027c cVar = this.f103959b;
        if (cVar != null) {
            return cVar.mo99470c();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo99477b() {
        m127969a(true);
        if (this.f103959b == null) {
            AppCompatActivity appCompatActivity = this.f103963f;
            if (appCompatActivity == null) {
                C7573i.m23583a("mActivity");
            }
            this.f103959b = new C40027c(appCompatActivity);
        }
        C40027c cVar = this.f103959b;
        if (cVar == null) {
            C7573i.m23580a();
        }
        cVar.mo99467b();
    }

    /* renamed from: e */
    private final void m127972e() {
        LyricEffectViewModel lyricEffectViewModel = this.f103969l;
        if (lyricEffectViewModel == null) {
            C7573i.m23583a("lyricViewModel");
        }
        C0052o<LiveDataWrapper<List<Effect>>> oVar = lyricEffectViewModel.f103934a;
        AppCompatActivity appCompatActivity = this.f103963f;
        if (appCompatActivity == null) {
            C7573i.m23583a("mActivity");
        }
        oVar.observe(appCompatActivity, new C40036a(this));
        LyricEffectViewModel lyricEffectViewModel2 = this.f103969l;
        if (lyricEffectViewModel2 == null) {
            C7573i.m23583a("lyricViewModel");
        }
        C0052o<LiveDataWrapper<List<Effect>>> oVar2 = lyricEffectViewModel2.f103935b;
        AppCompatActivity appCompatActivity2 = this.f103963f;
        if (appCompatActivity2 == null) {
            C7573i.m23583a("mActivity");
        }
        oVar2.observe(appCompatActivity2, new C40037b(this));
    }

    /* renamed from: d */
    private final void m127971d() {
        View view = this.f103962e;
        if (view == null) {
            C7573i.m23580a();
        }
        View findViewById = view.findViewById(R.id.bw9);
        C7573i.m23582a((Object) findViewById, "mView!!.findViewById(R.id.lyric_effect_container)");
        this.f103964g = (AVDmtPanelRecyleView) findViewById;
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f103964g;
        if (aVDmtPanelRecyleView == null) {
            C7573i.m23583a("mLyricEffectRecyclerView");
        }
        AppCompatActivity appCompatActivity = this.f103963f;
        if (appCompatActivity == null) {
            C7573i.m23583a("mActivity");
        }
        aVDmtPanelRecyleView.setLayoutManager(new LinearLayoutManager(appCompatActivity, 0, false));
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.f103964g;
        if (aVDmtPanelRecyleView2 == null) {
            C7573i.m23583a("mLyricEffectRecyclerView");
        }
        this.f103965h = new LyricEffectItemAdapter(aVDmtPanelRecyleView2, mo99471a());
        AVDmtPanelRecyleView aVDmtPanelRecyleView3 = this.f103964g;
        if (aVDmtPanelRecyleView3 == null) {
            C7573i.m23583a("mLyricEffectRecyclerView");
        }
        aVDmtPanelRecyleView3.setAdapter(this.f103965h);
        LyricEffectItemAdapter lyricEffectItemAdapter = this.f103965h;
        if (lyricEffectItemAdapter == null) {
            C7573i.m23580a();
        }
        lyricEffectItemAdapter.mo70494a(this.f103968k);
        LyricEffectItemAdapter lyricEffectItemAdapter2 = this.f103965h;
        if (lyricEffectItemAdapter2 == null) {
            C7573i.m23580a();
        }
        lyricEffectItemAdapter2.mo99792a(this.f103970m);
        LyricEffectItemAdapter lyricEffectItemAdapter3 = this.f103965h;
        if (lyricEffectItemAdapter3 == null) {
            C7573i.m23580a();
        }
        lyricEffectItemAdapter3.mo99791a((C40091b) new C40038c(this));
        View view2 = this.f103962e;
        if (view2 == null) {
            C7573i.m23580a();
        }
        View findViewById2 = view2.findViewById(R.id.bu0);
        C7573i.m23582a((Object) findViewById2, "mView!!.findViewById(R.id.loading_status)");
        this.f103966i = (DmtStatusView) findViewById2;
        DmtStatusView dmtStatusView = this.f103966i;
        if (dmtStatusView == null) {
            C7573i.m23583a("mStatusView");
        }
        AppCompatActivity appCompatActivity2 = this.f103963f;
        if (appCompatActivity2 == null) {
            C7573i.m23583a("mActivity");
        }
        dmtStatusView.setBuilder(C10803a.m31631a((Context) appCompatActivity2).mo25965c(1));
    }

    /* renamed from: a */
    public static final /* synthetic */ EditLyricStickerViewModel m127967a(C40035d dVar) {
        EditLyricStickerViewModel editLyricStickerViewModel = dVar.f103960c;
        if (editLyricStickerViewModel == null) {
            C7573i.m23583a("editLyricStickerViewModel");
        }
        return editLyricStickerViewModel;
    }

    /* renamed from: b */
    public final Effect mo99476b(Effect effect) {
        C7573i.m23587b(effect, "lyricEffect");
        C40027c cVar = this.f103959b;
        if (cVar != null) {
            return cVar.mo99463a(effect);
        }
        return null;
    }

    /* renamed from: a */
    private final void m127969a(boolean z) {
        if (z) {
            View view = this.f103962e;
            if (view == null) {
                C7573i.m23580a();
            }
            View findViewById = view.findViewById(R.id.btf);
            C7573i.m23582a((Object) findViewById, "mView!!.findViewById<View>(R.id.loading_area)");
            findViewById.setVisibility(0);
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f103964g;
            if (aVDmtPanelRecyleView == null) {
                C7573i.m23583a("mLyricEffectRecyclerView");
            }
            aVDmtPanelRecyleView.setVisibility(8);
            DmtStatusView dmtStatusView = this.f103966i;
            if (dmtStatusView == null) {
                C7573i.m23583a("mStatusView");
            }
            dmtStatusView.mo25942f();
            return;
        }
        DmtStatusView dmtStatusView2 = this.f103966i;
        if (dmtStatusView2 == null) {
            C7573i.m23583a("mStatusView");
        }
        dmtStatusView2.mo25939d();
        View view2 = this.f103962e;
        if (view2 == null) {
            C7573i.m23580a();
        }
        View findViewById2 = view2.findViewById(R.id.btf);
        C7573i.m23582a((Object) findViewById2, "mView!!.findViewById<View>(R.id.loading_area)");
        findViewById2.setVisibility(8);
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.f103964g;
        if (aVDmtPanelRecyleView2 == null) {
            C7573i.m23583a("mLyricEffectRecyclerView");
        }
        aVDmtPanelRecyleView2.setVisibility(0);
    }

    /* renamed from: c */
    private final int m127970c(Effect effect) {
        C40027c cVar = this.f103959b;
        if (cVar == null) {
            C7573i.m23580a();
        }
        int indexOf = cVar.f103943b.indexOf(effect);
        if (indexOf >= 0) {
            return indexOf;
        }
        C40027c cVar2 = this.f103959b;
        if (cVar2 == null) {
            C7573i.m23580a();
        }
        int size = cVar2.f103943b.size();
        for (int i = 0; i < size; i++) {
            String extra = effect.getExtra();
            C40027c cVar3 = this.f103959b;
            if (cVar3 == null) {
                C7573i.m23580a();
            }
            if (C7573i.m23585a((Object) extra, (Object) ((Effect) cVar3.f103943b.get(i)).getExtra())) {
                return i;
            }
        }
        return indexOf;
    }

    /* renamed from: a */
    public final void mo99472a(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "context");
        if (this.f103959b == null) {
            this.f103959b = new C40027c(fragmentActivity);
        }
        C40027c cVar = this.f103959b;
        if (cVar == null) {
            C7573i.m23580a();
        }
        cVar.mo99464a();
    }

    /* renamed from: a */
    public final void mo99474a(EffectModel effectModel) {
        List<EffectModel> list = this.f103968k;
        List d = C7525m.m23509d((Collection<? extends T>) this.f103968k);
        if (!this.f103968k.contains(effectModel)) {
            d.add(effectModel);
        }
        boolean z = true;
        C1146b a = C1143a.m5067a(new EffectDiff(list, d), true);
        C7573i.m23582a((Object) a, "DiffUtil.calculateDiff(E…(oldList, newList), true)");
        m127968a(a, d);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f103964g;
        if (aVDmtPanelRecyleView == null) {
            C7573i.m23583a("mLyricEffectRecyclerView");
        }
        if (aVDmtPanelRecyleView.getVisibility() != 8) {
            z = false;
        }
        if (!z) {
            aVDmtPanelRecyleView = null;
        }
        if (aVDmtPanelRecyleView != null) {
            m127969a(false);
        }
    }

    /* renamed from: a */
    public final void mo70396a(Effect effect) {
        C7573i.m23587b(effect, "rawEffect");
        this.f103967j = System.currentTimeMillis();
        int c = m127970c(effect);
        if (c >= 0) {
            LyricEffectItemAdapter lyricEffectItemAdapter = this.f103965h;
            if (lyricEffectItemAdapter == null) {
                C7573i.m23580a();
            }
            lyricEffectItemAdapter.mo70493a(c, 2);
        }
    }

    /* renamed from: a */
    private final void m127968a(C1146b bVar, List<EffectModel> list) {
        LyricEffectItemAdapter lyricEffectItemAdapter = this.f103965h;
        if (lyricEffectItemAdapter == null) {
            C7573i.m23580a();
        }
        bVar.mo4548a((C1262a) lyricEffectItemAdapter);
        this.f103968k = list;
        LyricEffectItemAdapter lyricEffectItemAdapter2 = this.f103965h;
        if (lyricEffectItemAdapter2 == null) {
            C7573i.m23580a();
        }
        lyricEffectItemAdapter2.mo70494a(this.f103968k);
        LyricEffectItemAdapter lyricEffectItemAdapter3 = this.f103965h;
        if (lyricEffectItemAdapter3 == null) {
            C7573i.m23580a();
        }
        lyricEffectItemAdapter3.mo99792a(this.f103970m);
    }

    /* renamed from: a */
    public final void mo99473a(AppCompatActivity appCompatActivity, FrameLayout frameLayout) {
        C7573i.m23587b(appCompatActivity, "activity");
        this.f103963f = appCompatActivity;
        AppCompatActivity appCompatActivity2 = this.f103963f;
        if (appCompatActivity2 == null) {
            C7573i.m23583a("mActivity");
        }
        C0063u a = C0069x.m159a((FragmentActivity) appCompatActivity2).mo147a(LyricEffectViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(mA…ectViewModel::class.java]");
        this.f103969l = (LyricEffectViewModel) a;
        AppCompatActivity appCompatActivity3 = this.f103963f;
        if (appCompatActivity3 == null) {
            C7573i.m23583a("mActivity");
        }
        JediViewModel a2 = C36113b.m116288a(appCompatActivity3).mo91871a(EditLyricStickerViewModel.class);
        C7573i.m23582a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java]");
        this.f103960c = (EditLyricStickerViewModel) a2;
        if (this.f103962e == null) {
            this.f103962e = LayoutInflater.from(appCompatActivity).inflate(R.layout.h5, frameLayout, true);
            m127971d();
            m127972e();
            C27359a a3 = mo99471a();
            if (a3 != null) {
                a3.mo70458a((C27370b) this);
            }
        }
    }
}
