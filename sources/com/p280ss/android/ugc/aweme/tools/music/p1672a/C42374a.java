package com.p280ss.android.ugc.aweme.tools.music.p1672a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.framwork.core.p523b.C10233a;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.C33672a;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33951d;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41006c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41011f;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p280ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager;
import com.p280ss.android.ugc.aweme.tools.music.aichoosemusic.C42431d;
import com.p280ss.android.ugc.aweme.tools.music.aichoosemusic.C42431d.C42433b;
import com.p280ss.android.ugc.aweme.tools.music.lrc.C42450a;
import com.p280ss.android.ugc.aweme.tools.music.lrc.C42452b;
import com.p280ss.android.ugc.aweme.tools.music.lrc.C42452b.C42459b;
import com.p280ss.android.ugc.aweme.tools.music.lrc.LrcView;
import com.p280ss.android.ugc.aweme.tools.music.music.MusicItemAdapter;
import com.p280ss.android.ugc.aweme.tools.music.music.collect.C42472a.C42473a;
import com.p280ss.android.ugc.aweme.tools.music.music.collect.C42472a.C42474b;
import com.p280ss.android.ugc.aweme.tools.music.music.collect.CollectMusicItemAdapter;
import com.p280ss.android.ugc.aweme.tools.music.p1672a.C42396c.C42397a;
import com.p280ss.android.ugc.aweme.tools.music.p1673b.C42437a;
import com.p280ss.android.ugc.aweme.tools.music.p1674c.C42440b;
import com.p280ss.android.ugc.aweme.toolsport.C42600a;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42593c;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42601a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42609g;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42610h;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42612j;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42613k;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42614l;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.ugc.p1716b.C43659c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.tools.music.a.a */
public final class C42374a implements OnClickListener, C33951d, C42593c {

    /* renamed from: A */
    private View f110194A;

    /* renamed from: B */
    private View f110195B;

    /* renamed from: C */
    private View f110196C;

    /* renamed from: D */
    private boolean f110197D;

    /* renamed from: E */
    private List<MusicModel> f110198E = new ArrayList();

    /* renamed from: F */
    private final C15389d f110199F;

    /* renamed from: a */
    public C42614l f110200a;

    /* renamed from: b */
    public AVDmtTabLayout f110201b;

    /* renamed from: c */
    public int f110202c = 3;

    /* renamed from: d */
    public MusicItemAdapter f110203d;

    /* renamed from: e */
    public C42431d f110204e;

    /* renamed from: f */
    public C33672a f110205f;

    /* renamed from: g */
    public RecyclerView f110206g;

    /* renamed from: h */
    public RecyclerView f110207h;

    /* renamed from: i */
    public LrcView f110208i;

    /* renamed from: j */
    public AVDmtTextView f110209j;

    /* renamed from: k */
    public int f110210k;

    /* renamed from: l */
    public C42600a f110211l;

    /* renamed from: m */
    public MusicModel f110212m;

    /* renamed from: n */
    public TextView f110213n;

    /* renamed from: o */
    public CollectMusicItemAdapter f110214o;

    /* renamed from: p */
    public C42612j f110215p;

    /* renamed from: q */
    public C42613k f110216q;

    /* renamed from: r */
    public C42609g f110217r;

    /* renamed from: s */
    public List<String> f110218s;

    /* renamed from: t */
    public C42610h f110219t;

    /* renamed from: u */
    public final AppCompatActivity f110220u;

    /* renamed from: v */
    public final C42601a f110221v;

    /* renamed from: w */
    private List<? extends MusicModel> f110222w;

    /* renamed from: x */
    private ViewGroup f110223x;

    /* renamed from: y */
    private ViewGroup f110224y;

    /* renamed from: z */
    private FrameLayout f110225z;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$a */
    static final class C42375a<T> implements C7326g<C42600a> {

        /* renamed from: a */
        final /* synthetic */ C42374a f110226a;

        C42375a(C42374a aVar) {
            this.f110226a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C42600a aVar) {
            this.f110226a.f110211l = aVar;
            if (C10233a.m30356a(this.f110226a.f110218s)) {
                RecyclerView recyclerView = this.f110226a.f110207h;
                if (recyclerView != null) {
                    recyclerView.post(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C42375a f110228a;

                        {
                            this.f110228a = r1;
                        }

                        public final void run() {
                            MusicItemAdapter musicItemAdapter = this.f110228a.f110226a.f110203d;
                            if (musicItemAdapter != null) {
                                musicItemAdapter.mo103974f();
                            }
                            this.f110228a.f110226a.mo103895i();
                        }
                    });
                }
            } else if (this.f110226a.f110212m != null) {
                C42374a aVar2 = this.f110226a;
                C42600a aVar3 = this.f110226a.f110211l;
                MusicModel musicModel = this.f110226a.f110212m;
                if (musicModel == null) {
                    C7573i.m23580a();
                }
                aVar2.mo103882a(aVar3, musicModel);
            } else {
                C42397a.m134792a().mo103913a((C42437a) new C42437a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C42375a f110227a;

                    {
                        this.f110227a = r1;
                    }

                    /* renamed from: a */
                    public final void mo103873a(MusicModel musicModel, boolean z) {
                        C7573i.m23587b(musicModel, "musicModel");
                        this.f110227a.f110226a.mo103882a(this.f110227a.f110226a.f110211l, musicModel);
                    }
                }).mo103915a(this.f110226a.f110218s);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$b */
    static final class C42378b<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C42378b f110229a = new C42378b();

        C42378b() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m134775a((Throwable) obj);
        }

        /* renamed from: a */
        private static void m134775a(Throwable th) {
            StringBuilder sb = new StringBuilder("Get AI Recommend Music Failed. Reason:");
            sb.append(th.getMessage());
            C42880h.m136156a(sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$c */
    public static final class C42379c implements C42612j {

        /* renamed from: a */
        final /* synthetic */ C42374a f110230a;

        C42379c(C42374a aVar) {
            this.f110230a = aVar;
        }

        /* renamed from: a */
        public final void mo97305a(View view, int i) {
            MusicModel musicModel;
            Object obj;
            Object obj2;
            boolean z;
            C7573i.m23587b(view, "view");
            CollectMusicItemAdapter collectMusicItemAdapter = this.f110230a.f110214o;
            MusicModel musicModel2 = null;
            if (collectMusicItemAdapter != null) {
                musicModel = collectMusicItemAdapter.mo103994b(i);
            } else {
                musicModel = null;
            }
            if (musicModel != null) {
                CollectMusicItemAdapter collectMusicItemAdapter2 = this.f110230a.f110214o;
                if (collectMusicItemAdapter2 != null) {
                    obj = Integer.valueOf(collectMusicItemAdapter2.f110413d);
                } else {
                    obj = null;
                }
                CollectMusicItemAdapter collectMusicItemAdapter3 = this.f110230a.f110214o;
                if (collectMusicItemAdapter3 != null) {
                    obj2 = Integer.valueOf(collectMusicItemAdapter3.f110414e);
                } else {
                    obj2 = null;
                }
                if (C7573i.m23585a(obj, obj2)) {
                    CollectMusicItemAdapter collectMusicItemAdapter4 = this.f110230a.f110214o;
                    if (collectMusicItemAdapter4 != null && collectMusicItemAdapter4.f110413d == i) {
                        if (C10233a.m30356a(this.f110230a.f110218s)) {
                            this.f110230a.mo103890c(false);
                            CollectMusicItemAdapter collectMusicItemAdapter5 = this.f110230a.f110214o;
                            if (collectMusicItemAdapter5 != null) {
                                collectMusicItemAdapter5.mo103995b(-1, false);
                            }
                            CollectMusicItemAdapter collectMusicItemAdapter6 = this.f110230a.f110214o;
                            if (collectMusicItemAdapter6 != null) {
                                collectMusicItemAdapter6.f110413d = -1;
                            }
                            C42431d dVar = this.f110230a.f110204e;
                            if (dVar != null) {
                                dVar.mo103942b();
                            }
                            C42610h hVar = this.f110230a.f110219t;
                            if (hVar != null) {
                                hVar.mo99789a(null, null, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                C42612j jVar = this.f110230a.f110215p;
                if (jVar != null) {
                    jVar.mo97305a(view, i);
                }
                CollectMusicItemAdapter collectMusicItemAdapter7 = this.f110230a.f110214o;
                if (collectMusicItemAdapter7 != null) {
                    musicModel2 = collectMusicItemAdapter7.mo103994b(i);
                }
                String a = C42374a.m134732a(musicModel2);
                CharSequence charSequence = a;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    CollectMusicItemAdapter collectMusicItemAdapter8 = this.f110230a.f110214o;
                    if (collectMusicItemAdapter8 != null) {
                        collectMusicItemAdapter8.mo103993a(i, false);
                    }
                    this.f110230a.mo61996a(a, musicModel2, "");
                    return;
                }
                CollectMusicItemAdapter collectMusicItemAdapter9 = this.f110230a.f110214o;
                if (collectMusicItemAdapter9 != null) {
                    collectMusicItemAdapter9.mo103993a(i, true);
                }
                C33672a aVar = this.f110230a.f110205f;
                if (aVar != null) {
                    aVar.mo86085b(musicModel2, this.f110230a.f110202c, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$d */
    static final class C42380d implements C6905a {

        /* renamed from: a */
        final /* synthetic */ C42374a f110231a;

        C42380d(C42374a aVar) {
            this.f110231a = aVar;
        }

        public final void bd_() {
            CollectMusicItemAdapter collectMusicItemAdapter = this.f110231a.f110214o;
            if (collectMusicItemAdapter != null) {
                collectMusicItemAdapter.ag_();
            }
            C42473a.m134989a().mo104012c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$e */
    public static final class C42381e implements C42474b {

        /* renamed from: a */
        final /* synthetic */ C42374a f110232a;

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$e$a */
        static final class C42382a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C42381e f110233a;

            C42382a(C42381e eVar) {
                this.f110233a = eVar;
            }

            public final void run() {
                CollectMusicItemAdapter collectMusicItemAdapter = this.f110233a.f110232a.f110214o;
                if (collectMusicItemAdapter != null) {
                    collectMusicItemAdapter.mo104000k();
                }
                RecyclerView recyclerView = this.f110233a.f110232a.f110206g;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                TextView textView = this.f110233a.f110232a.f110213n;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f110233a.f110232a.f110213n;
                if (textView2 != null) {
                    textView2.setText(this.f110233a.f110232a.f110220u.getResources().getString(R.string.b23));
                }
                TextView textView3 = this.f110233a.f110232a.f110213n;
                if (textView3 != null) {
                    textView3.setOnClickListener(C423831.f110234a);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$e$b */
        static final class C42384b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C42381e f110235a;

            C42384b(C42381e eVar) {
                this.f110235a = eVar;
            }

            public final void run() {
                RecyclerView recyclerView = this.f110235a.f110232a.f110206g;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                CollectMusicItemAdapter collectMusicItemAdapter = this.f110235a.f110232a.f110214o;
                if (collectMusicItemAdapter != null) {
                    collectMusicItemAdapter.mo103999j();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$e$c */
        static final class C42385c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C42381e f110236a;

            C42385c(C42381e eVar) {
                this.f110236a = eVar;
            }

            public final void run() {
                CollectMusicItemAdapter collectMusicItemAdapter = this.f110236a.f110232a.f110214o;
                if (collectMusicItemAdapter != null) {
                    collectMusicItemAdapter.mo104000k();
                }
                RecyclerView recyclerView = this.f110236a.f110232a.f110206g;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                TextView textView = this.f110236a.f110232a.f110213n;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f110236a.f110232a.f110213n;
                if (textView2 != null) {
                    textView2.setText(this.f110236a.f110232a.f110220u.getResources().getString(R.string.a61));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$e$d */
        static final class C42386d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C42381e f110237a;

            /* renamed from: b */
            final /* synthetic */ List f110238b;

            /* renamed from: c */
            final /* synthetic */ boolean f110239c;

            C42386d(C42381e eVar, List list, boolean z) {
                this.f110237a = eVar;
                this.f110238b = list;
                this.f110239c = z;
            }

            public final void run() {
                RecyclerView recyclerView = this.f110237a.f110232a.f110206g;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                TextView textView = this.f110237a.f110232a.f110213n;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                CollectMusicItemAdapter collectMusicItemAdapter = this.f110237a.f110232a.f110214o;
                if (collectMusicItemAdapter != null) {
                    collectMusicItemAdapter.mo104000k();
                }
                CollectMusicItemAdapter collectMusicItemAdapter2 = this.f110237a.f110232a.f110214o;
                if (collectMusicItemAdapter2 != null) {
                    collectMusicItemAdapter2.mo58045a(this.f110238b);
                }
                CollectMusicItemAdapter collectMusicItemAdapter3 = this.f110237a.f110232a.f110214o;
                if (collectMusicItemAdapter3 != null) {
                    collectMusicItemAdapter3.mo66516d(true);
                }
                if (!this.f110239c) {
                    CollectMusicItemAdapter collectMusicItemAdapter4 = this.f110237a.f110232a.f110214o;
                    if (collectMusicItemAdapter4 != null) {
                        collectMusicItemAdapter4.ah_();
                    }
                    CollectMusicItemAdapter collectMusicItemAdapter5 = this.f110237a.f110232a.f110214o;
                    if (collectMusicItemAdapter5 != null) {
                        collectMusicItemAdapter5.mo66516d(false);
                    }
                    return;
                }
                CollectMusicItemAdapter collectMusicItemAdapter6 = this.f110237a.f110232a.f110214o;
                if (collectMusicItemAdapter6 != null) {
                    collectMusicItemAdapter6.ai_();
                }
            }
        }

        /* renamed from: a */
        public final void mo103899a() {
            RecyclerView recyclerView = this.f110232a.f110206g;
            if (recyclerView != null) {
                recyclerView.post(new C42385c(this));
            }
        }

        /* renamed from: b */
        public final void mo103901b() {
            RecyclerView recyclerView = this.f110232a.f110206g;
            if (recyclerView != null) {
                recyclerView.post(new C42384b(this));
            }
        }

        /* renamed from: c */
        public final void mo103902c() {
            RecyclerView recyclerView = this.f110232a.f110206g;
            if (recyclerView != null) {
                recyclerView.post(new C42382a(this));
            }
        }

        C42381e(C42374a aVar) {
            this.f110232a = aVar;
        }

        /* renamed from: a */
        public final void mo103900a(List<? extends MusicModel> list, boolean z) {
            C7573i.m23587b(list, "musicList");
            RecyclerView recyclerView = this.f110232a.f110206g;
            if (recyclerView != null) {
                recyclerView.post(new C42386d(this, list, z));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$f */
    public static final class C42387f implements C42612j {

        /* renamed from: a */
        final /* synthetic */ C42374a f110240a;

        C42387f(C42374a aVar) {
            this.f110240a = aVar;
        }

        /* renamed from: a */
        public final void mo97305a(View view, int i) {
            MusicModel musicModel;
            Object obj;
            Object obj2;
            boolean z;
            CharSequence charSequence;
            C7573i.m23587b(view, "view");
            if (i == -1) {
                this.f110240a.f110221v.mo99786a();
                C42610h hVar = this.f110240a.f110219t;
                if (hVar != null) {
                    hVar.mo99788a();
                    return;
                }
                return;
            }
            MusicItemAdapter musicItemAdapter = this.f110240a.f110203d;
            MusicModel musicModel2 = null;
            if (musicItemAdapter != null) {
                musicModel = musicItemAdapter.mo103971c(i);
            } else {
                musicModel = null;
            }
            if (musicModel != null) {
                MusicItemAdapter musicItemAdapter2 = this.f110240a.f110203d;
                if (musicItemAdapter2 != null) {
                    obj = Integer.valueOf(musicItemAdapter2.mo103962a());
                } else {
                    obj = null;
                }
                MusicItemAdapter musicItemAdapter3 = this.f110240a.f110203d;
                if (musicItemAdapter3 != null) {
                    obj2 = Integer.valueOf(musicItemAdapter3.mo103967b());
                } else {
                    obj2 = null;
                }
                if (C7573i.m23585a(obj, obj2)) {
                    MusicItemAdapter musicItemAdapter4 = this.f110240a.f110203d;
                    if (musicItemAdapter4 != null && musicItemAdapter4.mo103962a() == i) {
                        if (C10233a.m30356a(this.f110240a.f110218s)) {
                            this.f110240a.mo103890c(false);
                            MusicItemAdapter musicItemAdapter5 = this.f110240a.f110203d;
                            if (musicItemAdapter5 != null) {
                                musicItemAdapter5.mo103969b(-1, false);
                            }
                            MusicItemAdapter musicItemAdapter6 = this.f110240a.f110203d;
                            if (musicItemAdapter6 != null) {
                                musicItemAdapter6.mo103963a(-1);
                            }
                            AVDmtTextView aVDmtTextView = this.f110240a.f110209j;
                            if (aVDmtTextView != null) {
                                aVDmtTextView.setSelected(false);
                            }
                            AVDmtTextView aVDmtTextView2 = this.f110240a.f110209j;
                            if (aVDmtTextView2 != null) {
                                AVDmtTextView aVDmtTextView3 = this.f110240a.f110209j;
                                if (aVDmtTextView3 != null) {
                                    Context context = aVDmtTextView3.getContext();
                                    if (context != null) {
                                        Resources resources = context.getResources();
                                        if (resources != null) {
                                            charSequence = resources.getString(R.string.oc);
                                            aVDmtTextView2.setText(charSequence);
                                        }
                                    }
                                }
                                charSequence = null;
                                aVDmtTextView2.setText(charSequence);
                            }
                            LrcView lrcView = this.f110240a.f110208i;
                            if (lrcView != null) {
                                lrcView.setVisibility(8);
                            }
                            C42431d dVar = this.f110240a.f110204e;
                            if (dVar != null) {
                                dVar.mo103942b();
                            }
                            C42610h hVar2 = this.f110240a.f110219t;
                            if (hVar2 != null) {
                                hVar2.mo99789a(null, null, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                C42612j jVar = this.f110240a.f110215p;
                if (jVar != null) {
                    jVar.mo97305a(view, i);
                }
                MusicItemAdapter musicItemAdapter7 = this.f110240a.f110203d;
                if (musicItemAdapter7 != null) {
                    musicModel2 = musicItemAdapter7.mo103971c(i);
                }
                String a = C42374a.m134732a(musicModel2);
                CharSequence charSequence2 = a;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || (musicModel2 != null && musicModel2.isMvThemeMusic())) {
                    MusicItemAdapter musicItemAdapter8 = this.f110240a.f110203d;
                    if (musicItemAdapter8 != null) {
                        musicItemAdapter8.mo103964a(i, false);
                    }
                    this.f110240a.mo61996a(a, musicModel2, "");
                } else {
                    this.f110240a.mo103890c(false);
                    MusicItemAdapter musicItemAdapter9 = this.f110240a.f110203d;
                    if (musicItemAdapter9 != null) {
                        musicItemAdapter9.mo103964a(i, true);
                    }
                    C33672a aVar = this.f110240a.f110205f;
                    if (aVar != null) {
                        aVar.mo86085b(musicModel2, this.f110240a.f110202c, false);
                    }
                }
                if (musicModel2 != null && musicModel2.isMvThemeMusic()) {
                    this.f110240a.mo103890c(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$g */
    public static final class C42388g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42374a f110241a;

        C42388g(C42374a aVar) {
            this.f110241a = aVar;
        }

        public final void onClick(View view) {
            C41011f fVar;
            ClickInstrumentation.onClick(view);
            C42614l lVar = this.f110241a.f110200a;
            if (lVar != null) {
                lVar.mo104209a(true);
            }
            this.f110241a.mo103887b(true);
            AVDmtTabLayout aVDmtTabLayout = this.f110241a.f110201b;
            if (aVDmtTabLayout != null) {
                AVDmtTabLayout aVDmtTabLayout2 = this.f110241a.f110201b;
                if (aVDmtTabLayout2 != null) {
                    fVar = aVDmtTabLayout2.mo101330a(0);
                } else {
                    fVar = null;
                }
                aVDmtTabLayout.mo101345b(fVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$h */
    public static final class C42389h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42374a f110242a;

        C42389h(C42374a aVar) {
            this.f110242a = aVar;
        }

        public final void onClick(View view) {
            C41011f fVar;
            ClickInstrumentation.onClick(view);
            C42614l lVar = this.f110242a.f110200a;
            if (lVar != null) {
                lVar.mo104209a(true);
            }
            this.f110242a.mo103887b(true);
            AVDmtTabLayout aVDmtTabLayout = this.f110242a.f110201b;
            if (aVDmtTabLayout != null) {
                AVDmtTabLayout aVDmtTabLayout2 = this.f110242a.f110201b;
                if (aVDmtTabLayout2 != null) {
                    fVar = aVDmtTabLayout2.mo101330a(1);
                } else {
                    fVar = null;
                }
                aVDmtTabLayout.mo101345b(fVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$i */
    public static final class C42390i implements C41006c {

        /* renamed from: a */
        final /* synthetic */ C42374a f110243a;

        /* renamed from: b */
        public final void mo74744b(C41011f fVar) {
        }

        /* renamed from: c */
        public final void mo74745c(C41011f fVar) {
        }

        C42390i(C42374a aVar) {
            this.f110243a = aVar;
        }

        /* renamed from: a */
        public final void mo74743a(C41011f fVar) {
            boolean z;
            C42614l lVar = this.f110243a.f110200a;
            boolean z2 = false;
            if (lVar != null) {
                if (fVar == null || fVar.f106702e != 0) {
                    z = false;
                } else {
                    z = true;
                }
                lVar.mo104209a(z);
            }
            C42374a aVar = this.f110243a;
            if (fVar != null && fVar.f106702e == 0) {
                z2 = true;
            }
            aVar.mo103887b(z2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$j */
    public static final class C42391j implements C42459b {

        /* renamed from: a */
        final /* synthetic */ C42374a f110244a;

        C42391j(C42374a aVar) {
            this.f110244a = aVar;
        }

        /* renamed from: a */
        public final void mo103910a(String str, List<C42450a> list) {
            String str2;
            MusicModel j = this.f110244a.mo103896j();
            if (j != null) {
                str2 = j.getLrcUrl();
            } else {
                str2 = null;
            }
            if (!(!C7573i.m23585a((Object) str, (Object) str2)) && !C6307b.m19566a((Collection<T>) list)) {
                LrcView lrcView = this.f110244a.f110208i;
                if (lrcView != null) {
                    lrcView.setVisibility(0);
                }
                LrcView lrcView2 = this.f110244a.f110208i;
                if (lrcView2 != null) {
                    if (list == null) {
                        C7573i.m23580a();
                    }
                    lrcView2.setLrcInfos(list);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$k */
    public static final class C42392k implements C42433b {

        /* renamed from: a */
        final /* synthetic */ C42374a f110245a;

        C42392k(C42374a aVar) {
            this.f110245a = aVar;
        }

        /* renamed from: a */
        public final void mo103911a(int i) {
            LrcView lrcView = this.f110245a.f110208i;
            if (lrcView != null) {
                lrcView.setCurrentTime(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$l */
    public static final class C42393l implements C42459b {

        /* renamed from: a */
        final /* synthetic */ C42374a f110246a;

        C42393l(C42374a aVar) {
            this.f110246a = aVar;
        }

        /* renamed from: a */
        public final void mo103910a(String str, List<C42450a> list) {
            String str2;
            MusicModel j = this.f110246a.mo103896j();
            if (j != null) {
                str2 = j.getLrcUrl();
            } else {
                str2 = null;
            }
            if (!(!C7573i.m23585a((Object) str, (Object) str2)) && !C6307b.m19566a((Collection<T>) list)) {
                LrcView lrcView = this.f110246a.f110208i;
                if (lrcView != null) {
                    lrcView.setVisibility(0);
                }
                LrcView lrcView2 = this.f110246a.f110208i;
                if (lrcView2 != null) {
                    if (list == null) {
                        C7573i.m23580a();
                    }
                    lrcView2.setLrcInfos(list);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$m */
    static final class C42394m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42374a f110247a;

        C42394m(C42374a aVar) {
            this.f110247a = aVar;
        }

        public final void run() {
            MusicItemAdapter musicItemAdapter = this.f110247a.f110203d;
            if (musicItemAdapter != null) {
                musicItemAdapter.mo103974f();
            }
            this.f110247a.mo103895i();
        }
    }

    /* renamed from: d */
    public final int mo103891d() {
        return this.f110210k;
    }

    /* renamed from: a */
    public final void mo103883a(List<String> list) {
        this.f110218s = list;
    }

    /* renamed from: a */
    public final void mo103881a(C42614l lVar) {
        this.f110200a = lVar;
    }

    /* renamed from: a */
    public final void mo103880a(C42613k kVar) {
        this.f110216q = kVar;
    }

    /* renamed from: a */
    public final void mo103884a(boolean z) {
        RecyclerView recyclerView = this.f110207h;
        if (recyclerView != null) {
            recyclerView.setEnabled(true);
        }
    }

    /* renamed from: a */
    public final void mo103882a(C42600a aVar, MusicModel musicModel) {
        C7573i.m23587b(musicModel, "it");
        if (!(aVar == null || this.f110211l == null)) {
            C42600a aVar2 = this.f110211l;
            if (aVar2 != null) {
                aVar2.f110750a = m134733a(aVar.f110750a, musicModel);
            }
        }
        RecyclerView recyclerView = this.f110207h;
        if (recyclerView != null) {
            recyclerView.post(new C42394m(this));
        }
    }

    /* renamed from: a */
    public final void mo61996a(String str, MusicModel musicModel, String str2) {
        if (this.f110210k == 0) {
            m134735b(str, musicModel, str2);
        } else {
            m134737c(str, musicModel, str2);
        }
    }

    /* renamed from: k */
    public final Activity mo62001k() {
        return this.f110220u;
    }

    /* renamed from: l */
    public final boolean mo62002l() {
        if (this.f110196C != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo103875a() {
        CollectMusicItemAdapter collectMusicItemAdapter = this.f110214o;
        if (collectMusicItemAdapter != null) {
            collectMusicItemAdapter.mo104003n();
        }
    }

    /* renamed from: b */
    public final void mo103886b() {
        MusicItemAdapter musicItemAdapter = this.f110203d;
        if (musicItemAdapter != null) {
            musicItemAdapter.mo103977i();
        }
    }

    /* renamed from: c */
    public final void mo103888c() {
        MusicItemAdapter musicItemAdapter = this.f110203d;
        if (musicItemAdapter != null) {
            musicItemAdapter.mo103976h();
        }
    }

    /* renamed from: f */
    public final MusicModel mo61999f() {
        MusicItemAdapter musicItemAdapter = this.f110203d;
        if (musicItemAdapter != null) {
            return musicItemAdapter.mo103978j();
        }
        return null;
    }

    /* renamed from: g */
    public final void mo103893g() {
        C42431d dVar = this.f110204e;
        if (dVar != null) {
            dVar.mo103943c();
        }
    }

    /* renamed from: h */
    public final void mo103894h() {
        C42431d dVar = this.f110204e;
        if (dVar != null) {
            dVar.mo103942b();
        }
    }

    /* renamed from: j */
    public final MusicModel mo103896j() {
        MusicItemAdapter musicItemAdapter = this.f110203d;
        if (musicItemAdapter != null) {
            return musicItemAdapter.mo103978j();
        }
        return null;
    }

    /* renamed from: p */
    private final void m134741p() {
        Context context;
        RecyclerView recyclerView = this.f110207h;
        if (recyclerView != null) {
            RecyclerView recyclerView2 = this.f110207h;
            if (recyclerView2 != null) {
                context = recyclerView2.getContext();
            } else {
                context = null;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        }
    }

    /* renamed from: e */
    public final void mo103892e() {
        C42473a.m134989a().f110428a = null;
        C42397a.m134792a().mo103913a((C42437a) null);
        C42431d dVar = this.f110204e;
        if (dVar != null) {
            dVar.mo103944d();
        }
        C33672a aVar = this.f110205f;
        if (aVar != null) {
            aVar.mo61976d();
        }
    }

    /* renamed from: r */
    private final void m134743r() {
        AIChooseMusicManager.m134808a(false);
        if (!this.f110197D) {
            MusicItemAdapter musicItemAdapter = this.f110203d;
            if (musicItemAdapter != null) {
                musicItemAdapter.mo103972d();
            }
            C42609g gVar = this.f110217r;
            if (gVar != null) {
                gVar.mo104206a();
            }
        }
        AIChooseMusicManager.m134823j().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C42375a<Object>(this), (C7326g<? super Throwable>) C42378b.f110229a);
    }

    /* renamed from: o */
    private final void m134740o() {
        View view = this.f110196C;
        if (view == null) {
            C7573i.m23580a();
        }
        this.f110213n = (TextView) view.findViewById(R.id.abn);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this.f110220u, 0, false);
        RecyclerView recyclerView = this.f110206g;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(wrapLinearLayoutManager);
        }
        this.f110214o = new CollectMusicItemAdapter(new C42379c(this));
        CollectMusicItemAdapter collectMusicItemAdapter = this.f110214o;
        if (collectMusicItemAdapter != null) {
            collectMusicItemAdapter.f110420k = this.f110216q;
        }
        CollectMusicItemAdapter collectMusicItemAdapter2 = this.f110214o;
        if (collectMusicItemAdapter2 != null) {
            collectMusicItemAdapter2.mo66504a((C6905a) new C42380d(this));
        }
        RecyclerView recyclerView2 = this.f110206g;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f110214o);
        }
        C42473a.m134989a().f110428a = new C42381e(this);
    }

    /* renamed from: q */
    private final void m134742q() {
        this.f110205f = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).provideMusicDownloadPlayHelper(this);
        this.f110204e = new C42431d();
        C42431d dVar = this.f110204e;
        if (dVar != null) {
            dVar.f110325a = this.f110199F;
        }
        C42431d dVar2 = this.f110204e;
        if (dVar2 != null) {
            dVar2.f110327c = 10;
        }
        this.f110203d = new MusicItemAdapter(this.f110198E, new C42387f(this));
        MusicItemAdapter musicItemAdapter = this.f110203d;
        if (musicItemAdapter != null) {
            musicItemAdapter.f110376b = this.f110216q;
        }
        RecyclerView recyclerView = this.f110207h;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f110203d);
        }
        m134743r();
    }

    /* renamed from: m */
    private final void m134738m() {
        if (C42395b.m134788a() == 0) {
            View view = this.f110196C;
            if (view == null) {
                C7573i.m23580a();
            }
            this.f110195B = view.findViewById(R.id.bt8);
            View view2 = this.f110196C;
            if (view2 == null) {
                C7573i.m23580a();
            }
            this.f110209j = (AVDmtTextView) view2.findViewById(R.id.e58);
            View view3 = this.f110196C;
            if (view3 == null) {
                C7573i.m23580a();
            }
            this.f110208i = (LrcView) view3.findViewById(R.id.e51);
        }
        View view4 = this.f110196C;
        if (view4 == null) {
            C7573i.m23580a();
        }
        this.f110201b = (AVDmtTabLayout) view4.findViewById(R.id.dfx);
        View view5 = this.f110196C;
        if (view5 == null) {
            C7573i.m23580a();
        }
        this.f110194A = view5.findViewById(R.id.bdq);
        View view6 = this.f110194A;
        if (view6 != null) {
            view6.setVisibility(0);
        }
        View view7 = this.f110196C;
        if (view7 == null) {
            C7573i.m23580a();
        }
        this.f110207h = (RecyclerView) view7.findViewById(R.id.cxt);
        View view8 = this.f110196C;
        if (view8 == null) {
            C7573i.m23580a();
        }
        this.f110225z = (FrameLayout) view8.findViewById(R.id.dk_);
        View view9 = this.f110196C;
        if (view9 == null) {
            C7573i.m23580a();
        }
        this.f110224y = (ViewGroup) view9.findViewById(R.id.cp2);
        View view10 = this.f110196C;
        if (view10 == null) {
            C7573i.m23580a();
        }
        this.f110223x = (ViewGroup) view10.findViewById(R.id.y1);
        View view11 = this.f110196C;
        if (view11 == null) {
            C7573i.m23580a();
        }
        this.f110206g = (RecyclerView) view11.findViewById(R.id.cxr);
        View view12 = this.f110194A;
        if (view12 == null) {
            C7573i.m23580a();
        }
        view12.setOnClickListener(this);
        m134739n();
        m134741p();
        if (C42395b.m134788a() == 2) {
            m134740o();
        }
    }

    /* renamed from: s */
    private final void m134744s() {
        Object obj;
        CharSequence charSequence;
        List<? extends MusicModel> list;
        this.f110198E.clear();
        C42600a aVar = this.f110211l;
        if (aVar != null) {
            List<? extends MusicModel> list2 = aVar.f110750a;
            if (list2 != null) {
                this.f110198E.addAll(list2);
            }
        }
        List<? extends MusicModel> list3 = this.f110222w;
        C42600a aVar2 = this.f110211l;
        if (aVar2 != null) {
            obj = aVar2.f110750a;
        } else {
            obj = null;
        }
        if (!C7573i.m23585a((Object) list3, obj)) {
            MusicItemAdapter musicItemAdapter = this.f110203d;
            if (musicItemAdapter != null) {
                Map<String, Boolean> map = musicItemAdapter.f110381g;
                if (map != null) {
                    map.clear();
                }
            }
            MusicItemAdapter musicItemAdapter2 = this.f110203d;
            if (musicItemAdapter2 != null) {
                Set<String> set = musicItemAdapter2.f110382h;
                if (set != null) {
                    set.clear();
                }
            }
            C42600a aVar3 = this.f110211l;
            if (aVar3 != null) {
                list = aVar3.f110750a;
            } else {
                list = null;
            }
            this.f110222w = list;
        }
        mo103890c(false);
        MusicItemAdapter musicItemAdapter3 = this.f110203d;
        if (musicItemAdapter3 != null) {
            musicItemAdapter3.mo103969b(-1, false);
        }
        MusicItemAdapter musicItemAdapter4 = this.f110203d;
        if (musicItemAdapter4 != null) {
            musicItemAdapter4.mo103963a(-1);
        }
        MusicItemAdapter musicItemAdapter5 = this.f110203d;
        if (musicItemAdapter5 != null) {
            musicItemAdapter5.mo103968b(-1);
        }
        MusicItemAdapter musicItemAdapter6 = this.f110203d;
        if (musicItemAdapter6 != null) {
            musicItemAdapter6.notifyDataSetChanged();
        }
        AVDmtTextView aVDmtTextView = this.f110209j;
        if (aVDmtTextView != null) {
            aVDmtTextView.setSelected(false);
        }
        AVDmtTextView aVDmtTextView2 = this.f110209j;
        if (aVDmtTextView2 != null) {
            AVDmtTextView aVDmtTextView3 = this.f110209j;
            if (aVDmtTextView3 != null) {
                Context context = aVDmtTextView3.getContext();
                if (context != null) {
                    Resources resources = context.getResources();
                    if (resources != null) {
                        charSequence = resources.getString(R.string.oc);
                        aVDmtTextView2.setText(charSequence);
                    }
                }
            }
            charSequence = null;
            aVDmtTextView2.setText(charSequence);
        }
        LrcView lrcView = this.f110208i;
        if (lrcView != null) {
            lrcView.setDuration(0.0f);
        }
        LrcView lrcView2 = this.f110208i;
        if (lrcView2 != null) {
            lrcView2.setStartTime(0);
        }
        LrcView lrcView3 = this.f110208i;
        if (lrcView3 != null) {
            lrcView3.setPreviewStartTime(0.0f);
        }
        LrcView lrcView4 = this.f110208i;
        if (lrcView4 != null) {
            lrcView4.setVisibility(8);
        }
        C42431d dVar = this.f110204e;
        if (dVar != null) {
            dVar.mo103942b();
        }
        C42610h hVar = this.f110219t;
        if (hVar != null) {
            hVar.mo99789a(null, null, false);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f] */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String, com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f]
      uses: [com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f, java.lang.String]
      mth insns count: 141
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m134739n() {
        /*
            r8 = this;
            int r0 = com.p280ss.android.ugc.aweme.tools.music.p1672a.C42395b.m134788a()
            r1 = 8
            r2 = 0
            if (r0 != 0) goto L_0x001f
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r8.f110201b
            if (r0 == 0) goto L_0x0010
            r0.setVisibility(r1)
        L_0x0010:
            android.view.View r0 = r8.f110195B
            if (r0 == 0) goto L_0x0017
            r0.setVisibility(r2)
        L_0x0017:
            android.widget.FrameLayout r0 = r8.f110225z
            if (r0 == 0) goto L_0x001e
            r0.setVisibility(r1)
        L_0x001e:
            return
        L_0x001f:
            int r0 = com.p280ss.android.ugc.aweme.tools.music.p1672a.C42395b.m134788a()
            r3 = 2
            r4 = 1
            if (r0 != r3) goto L_0x0044
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r5 = com.p280ss.android.ugc.aweme.services.IAVServiceProxy.class
            java.lang.Object r0 = r0.getService(r5)
            java.lang.String r5 = "ServiceManager.get().get…ServiceProxy::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r5)
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = (com.p280ss.android.ugc.aweme.services.IAVServiceProxy) r0
            com.ss.android.ugc.aweme.account.d r0 = r0.getAccountService()
            boolean r0 = r0.mo57090c()
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r5 = r8.f110201b
            if (r5 == 0) goto L_0x004c
            r5.setVisibility(r1)
        L_0x004c:
            android.view.View r5 = r8.f110195B
            if (r5 == 0) goto L_0x0053
            r5.setVisibility(r1)
        L_0x0053:
            android.widget.FrameLayout r5 = r8.f110225z
            if (r5 == 0) goto L_0x005a
            r5.setVisibility(r2)
        L_0x005a:
            r5 = 2131822652(0x7f11083c, float:1.9278081E38)
            r6 = 0
            if (r0 != 0) goto L_0x00a9
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r8.f110201b
            if (r0 == 0) goto L_0x0067
            r0.setVisibility(r1)
        L_0x0067:
            android.widget.FrameLayout r0 = r8.f110225z
            if (r0 == 0) goto L_0x006e
            r0.setVisibility(r2)
        L_0x006e:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r8.f110201b
            if (r0 == 0) goto L_0x0077
            android.content.Context r0 = r0.getContext()
            goto L_0x0078
        L_0x0077:
            r0 = r6
        L_0x0078:
            int r1 = com.p280ss.android.ugc.aweme.tools.music.p1672a.C42395b.m134788a()
            if (r1 != 0) goto L_0x007f
            r2 = 1
        L_0x007f:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r0 = com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C42107a.m134029a(r0, r2)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r1 = r8.f110201b
            if (r1 == 0) goto L_0x0097
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L_0x0097
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x0097
            java.lang.String r6 = r1.getString(r5)
        L_0x0097:
            r0.setText(r6)
            r0.mo103524a(r4)
            android.widget.FrameLayout r1 = r8.f110225z
            if (r1 == 0) goto L_0x00a8
            android.view.View r0 = (android.view.View) r0
            r1.addView(r0)
            goto L_0x0176
        L_0x00a8:
            return
        L_0x00a9:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r8.f110201b
            if (r0 == 0) goto L_0x00b0
            r0.setVisibility(r2)
        L_0x00b0:
            android.widget.FrameLayout r0 = r8.f110225z
            if (r0 == 0) goto L_0x00b7
            r0.setVisibility(r1)
        L_0x00b7:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r8.f110201b
            if (r0 == 0) goto L_0x0176
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r1 = r8.f110201b
            if (r1 == 0) goto L_0x00c2
            r1.setMaxTabModeForCount(r3)
        L_0x00c2:
            android.content.Context r1 = r0.getContext()
            int r3 = com.p280ss.android.ugc.aweme.tools.music.p1672a.C42395b.m134788a()
            if (r3 != 0) goto L_0x00ce
            r3 = 1
            goto L_0x00cf
        L_0x00ce:
            r3 = 0
        L_0x00cf:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r1 = com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C42107a.m134029a(r1, r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r3 = r0.mo101329a()
            r7 = r1
            android.view.View r7 = (android.view.View) r7
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r3 = r3.mo101401a(r7)
            r0.mo101336a(r3)
            com.ss.android.ugc.aweme.tools.music.a.a$g r3 = new com.ss.android.ugc.aweme.tools.music.a.a$g
            r3.<init>(r8)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r1.setOnClickListener(r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r1 = r0.mo101330a(r2)
            if (r1 == 0) goto L_0x00f4
            android.view.View r1 = r1.f106703f
            goto L_0x00f5
        L_0x00f4:
            r1 = r6
        L_0x00f5:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r1 = (com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabItemView) r1
            if (r1 == 0) goto L_0x010d
            android.content.Context r3 = r0.getContext()
            java.lang.String r7 = "context"
            kotlin.jvm.internal.C7573i.m23582a(r3, r7)
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r5)
            r1.setText(r3)
        L_0x010d:
            android.content.Context r1 = r0.getContext()
            int r3 = com.p280ss.android.ugc.aweme.tools.music.p1672a.C42395b.m134788a()
            if (r3 != 0) goto L_0x0119
            r3 = 1
            goto L_0x011a
        L_0x0119:
            r3 = 0
        L_0x011a:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r1 = com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C42107a.m134029a(r1, r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r3 = r0.mo101329a()
            r5 = r1
            android.view.View r5 = (android.view.View) r5
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r3 = r3.mo101401a(r5)
            r0.mo101336a(r3)
            com.ss.android.ugc.aweme.tools.music.a.a$h r3 = new com.ss.android.ugc.aweme.tools.music.a.a$h
            r3.<init>(r8)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r1.setOnClickListener(r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r1 = r0.mo101330a(r4)
            if (r1 == 0) goto L_0x013f
            android.view.View r1 = r1.f106703f
            goto L_0x0140
        L_0x013f:
            r1 = r6
        L_0x0140:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r1 = (com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabItemView) r1
            if (r1 == 0) goto L_0x015b
            android.content.Context r3 = r0.getContext()
            java.lang.String r4 = "context"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131822651(0x7f11083b, float:1.927808E38)
            java.lang.String r3 = r3.getString(r4)
            r1.setText(r3)
        L_0x015b:
            com.ss.android.ugc.aweme.tools.music.a.a$i r1 = new com.ss.android.ugc.aweme.tools.music.a.a$i
            r1.<init>(r8)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$c r1 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41006c) r1
            r0.mo101335a(r1)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r8.f110201b
            if (r0 == 0) goto L_0x0175
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r1 = r8.f110201b
            if (r1 == 0) goto L_0x0171
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r6 = r1.mo101330a(r2)
        L_0x0171:
            r0.mo101345b(r6)
            goto L_0x0176
        L_0x0175:
            return
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.music.p1672a.C42374a.m134739n():void");
    }

    /* renamed from: i */
    public final void mo103895i() {
        Object obj;
        boolean z;
        C1273i iVar;
        MusicModel musicModel;
        Object obj2;
        List<? extends MusicModel> list;
        IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
        C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
        AVMusic curMusic = publishService.getCurMusic();
        if (curMusic == null) {
            m134744s();
            return;
        }
        this.f110198E.clear();
        C42600a aVar = this.f110211l;
        if (aVar != null) {
            List<? extends MusicModel> list2 = aVar.f110750a;
            if (list2 != null) {
                this.f110198E.addAll(list2);
            }
        }
        List<? extends MusicModel> list3 = this.f110222w;
        C42600a aVar2 = this.f110211l;
        String str = null;
        if (aVar2 != null) {
            obj = aVar2.f110750a;
        } else {
            obj = null;
        }
        if (!C7573i.m23585a((Object) list3, obj)) {
            MusicItemAdapter musicItemAdapter = this.f110203d;
            if (musicItemAdapter != null) {
                Map<String, Boolean> map = musicItemAdapter.f110381g;
                if (map != null) {
                    map.clear();
                }
            }
            MusicItemAdapter musicItemAdapter2 = this.f110203d;
            if (musicItemAdapter2 != null) {
                Set<String> set = musicItemAdapter2.f110382h;
                if (set != null) {
                    set.clear();
                }
            }
            C42600a aVar3 = this.f110211l;
            if (aVar3 != null) {
                list = aVar3.f110750a;
            } else {
                list = null;
            }
            this.f110222w = list;
        }
        int size = this.f110198E.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                String musicId = curMusic.getMusicId();
                MusicModel musicModel2 = (MusicModel) this.f110198E.get(i);
                if (musicModel2 != null) {
                    obj2 = musicModel2.getMusicId();
                } else {
                    obj2 = null;
                }
                if (!C7573i.m23585a((Object) musicId, obj2)) {
                    if (i == size) {
                        break;
                    }
                    i++;
                } else {
                    if (i != 0) {
                        this.f110198E.add(0, (MusicModel) this.f110198E.remove(i));
                    }
                    z = true;
                }
            }
        }
        z = false;
        if (!z) {
            MusicModel a = m134731a(curMusic);
            this.f110198E.add(0, a);
            MusicItemAdapter musicItemAdapter3 = this.f110203d;
            if (musicItemAdapter3 != null) {
                musicItemAdapter3.mo103966a(a);
            }
            mo103890c(this.f110221v.mo99787b());
        }
        MusicItemAdapter musicItemAdapter4 = this.f110203d;
        if (musicItemAdapter4 != null) {
            musicItemAdapter4.mo103968b(0);
        }
        MusicItemAdapter musicItemAdapter5 = this.f110203d;
        if (musicItemAdapter5 != null) {
            musicItemAdapter5.mo103963a(0);
        }
        MusicItemAdapter musicItemAdapter6 = this.f110203d;
        if (musicItemAdapter6 != null) {
            musicItemAdapter6.notifyDataSetChanged();
        }
        RecyclerView recyclerView = this.f110207h;
        if (recyclerView != null) {
            iVar = recyclerView.getLayoutManager();
        } else {
            iVar = null;
        }
        if (iVar instanceof LinearLayoutManager) {
            ((LinearLayoutManager) iVar).mo5417a(0, 0);
        }
        MusicItemAdapter musicItemAdapter7 = this.f110203d;
        if (musicItemAdapter7 != null) {
            musicModel = musicItemAdapter7.mo103978j();
        } else {
            musicModel = null;
        }
        if (!z) {
            LrcView lrcView = this.f110208i;
            if (lrcView != null) {
                lrcView.setVisibility(8);
            }
            LrcView lrcView2 = this.f110208i;
            if (lrcView2 != null) {
                lrcView2.setPreviewStartTime(0.0f);
            }
        }
        if (musicModel != null) {
            C42452b.m134910a().mo103958a(musicModel.getLrcUrl(), musicModel.getLrcType(), (C42459b) new C42393l(this));
        }
        MusicItemAdapter musicItemAdapter8 = this.f110203d;
        if (musicItemAdapter8 != null) {
            musicItemAdapter8.mo103976h();
        }
        if (((MusicModel) this.f110198E.get(0)) != null) {
            mo103890c(this.f110221v.mo99787b());
        }
        if (musicModel != null) {
            AVDmtTextView aVDmtTextView = this.f110209j;
            if (aVDmtTextView != null) {
                aVDmtTextView.setSelected(true);
            }
            AVDmtTextView aVDmtTextView2 = this.f110209j;
            if (aVDmtTextView2 != null) {
                AVDmtTextView aVDmtTextView3 = this.f110209j;
                if (aVDmtTextView3 != null) {
                    Context context = aVDmtTextView3.getContext();
                    if (context != null) {
                        Resources resources = context.getResources();
                        if (resources != null) {
                            str = resources.getString(R.string.of, new Object[]{musicModel.getName()});
                        }
                    }
                }
                aVDmtTextView2.setText(str);
            }
            C42431d dVar = this.f110204e;
            if (dVar != null) {
                dVar.mo103940a();
            }
        }
    }

    /* renamed from: a */
    public final void mo103877a(C42609g gVar) {
        this.f110217r = gVar;
    }

    /* renamed from: a */
    public final void mo103878a(C42610h hVar) {
        C7573i.m23587b(hVar, "onMusicViewClickListener");
        this.f110219t = hVar;
    }

    /* renamed from: a */
    public final AVMusic mo103874a(int i) {
        MusicModel musicModel;
        new C42440b();
        CollectMusicItemAdapter collectMusicItemAdapter = this.f110214o;
        if (collectMusicItemAdapter != null) {
            musicModel = collectMusicItemAdapter.mo103994b(i);
        } else {
            musicModel = null;
        }
        return C42440b.m134896a(musicModel);
    }

    /* renamed from: b */
    public final AVMusic mo103885b(int i) {
        MusicModel musicModel;
        new C42440b();
        C42600a aVar = this.f110211l;
        if (aVar != null) {
            List<? extends MusicModel> list = aVar.f110750a;
            if (list != null) {
                musicModel = (MusicModel) C7525m.m23504c(list, i);
                return C42440b.m134896a(musicModel);
            }
        }
        musicModel = null;
        return C42440b.m134896a(musicModel);
    }

    /* renamed from: c */
    public final void mo103889c(int i) {
        LrcView lrcView = this.f110208i;
        if (lrcView != null) {
            lrcView.setStartTime(i);
        }
    }

    /* renamed from: b */
    public final void mo103887b(boolean z) {
        int i;
        ViewGroup viewGroup = this.f110224y;
        int i2 = 4;
        if (viewGroup != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            viewGroup.setVisibility(i);
        }
        ViewGroup viewGroup2 = this.f110223x;
        if (viewGroup2 != null) {
            if (!z) {
                i2 = 0;
            }
            viewGroup2.setVisibility(i2);
        }
        if (!z) {
            C42473a.m134989a().mo104011b();
            this.f110210k = 1;
            return;
        }
        this.f110210k = 0;
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.bdq) {
            RecyclerView recyclerView = this.f110207h;
            if (recyclerView != null) {
                recyclerView.setEnabled(false);
            }
            C42610h hVar = this.f110219t;
            if (hVar != null) {
                hVar.mo99790b();
            }
        }
    }

    /* renamed from: a */
    public static String m134732a(MusicModel musicModel) {
        String str;
        boolean z;
        if (musicModel != null) {
            str = musicModel.getPath();
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String a = C43659c.m138324a().mo105612a(str);
        if (TextUtils.isEmpty(a) || !C7276d.m22812b(a) || new File(a).length() <= 0) {
            return null;
        }
        return a;
    }

    /* renamed from: c */
    public final void mo103890c(boolean z) {
        float f;
        View view = this.f110194A;
        if (view != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            view.setAlpha(f);
        }
        View view2 = this.f110194A;
        if (view2 != null) {
            view2.setEnabled(z);
        }
    }

    /* renamed from: a */
    private static MusicModel m134731a(AVMusic aVMusic) {
        C7573i.m23587b(aVMusic, "avMusic");
        MusicModel musicModel = new MusicModel();
        musicModel.setMusicId(aVMusic.getMusicId());
        musicModel.setId(aVMusic.getId());
        musicModel.setAlbum(aVMusic.getAlbum());
        musicModel.setName(aVMusic.getMusicName());
        musicModel.setAlbum(aVMusic.getAlbum());
        if (aVMusic.getCoverMedium() != null) {
            UrlModel coverMedium = aVMusic.getCoverMedium();
            C7573i.m23582a((Object) coverMedium, "avMusic.getCoverMedium()");
            if (!C6307b.m19566a((Collection<T>) coverMedium.getUrlList())) {
                UrlModel coverMedium2 = aVMusic.getCoverMedium();
                C7573i.m23582a((Object) coverMedium2, "avMusic.getCoverMedium()");
                musicModel.setPicPremium((String) coverMedium2.getUrlList().get(0));
            }
        }
        if (aVMusic.getCoverThumb() != null) {
            UrlModel coverThumb = aVMusic.getCoverThumb();
            C7573i.m23582a((Object) coverThumb, "avMusic.getCoverThumb()");
            if (!C6307b.m19566a((Collection<T>) coverThumb.getUrlList())) {
                UrlModel coverMedium3 = aVMusic.getCoverMedium();
                C7573i.m23582a((Object) coverMedium3, "avMusic.getCoverMedium()");
                musicModel.setPicSmall((String) coverMedium3.getUrlList().get(0));
            }
        }
        musicModel.setPath(aVMusic.getPath());
        musicModel.setSinger(aVMusic.getSinger());
        if (aVMusic.getMusicType() == MusicType.ONLINE.ordinal()) {
            UrlModel playUrl = aVMusic.getPlayUrl();
            C7573i.m23582a((Object) playUrl, "avMusic.getPlayUrl()");
            musicModel.setPath((String) playUrl.getUrlList().get(0));
        }
        musicModel.setDuration(aVMusic.duration);
        musicModel.setShootDuration(Integer.valueOf(aVMusic.shootDuration));
        musicModel.setAuditionDuration(Integer.valueOf(aVMusic.auditionDuration));
        if (aVMusic.getMusicType() == MusicType.BAIDU.ordinal()) {
            musicModel.setMusicType(MusicType.BAIDU);
        }
        if (aVMusic.getMusicType() == MusicType.LOCAL.ordinal()) {
            musicModel.setMusicType(MusicType.LOCAL);
        }
        if (aVMusic.getMusicType() == MusicType.ONLINE.ordinal()) {
            musicModel.setMusicType(MusicType.ONLINE);
        }
        musicModel.setOfflineDesc(aVMusic.getOfflineDesc());
        musicModel.setMusicStatus(aVMusic.getMusicStatus());
        musicModel.setStrongBeatUrl(aVMusic.getStrongBeatUrl());
        musicModel.setLrcUrl(aVMusic.getLrcUrl());
        musicModel.setLrcType(aVMusic.getLrcType());
        musicModel.setPreviewStartTime(aVMusic.getPreviewStartTime());
        return musicModel;
    }

    /* renamed from: a */
    public final void mo103879a(C42612j jVar) {
        this.f110215p = jVar;
    }

    /* renamed from: c */
    private void m134736c(MusicModel musicModel, Exception exc) {
        MusicModel musicModel2;
        Object obj;
        int i;
        C7573i.m23587b(exc, "e");
        CollectMusicItemAdapter collectMusicItemAdapter = this.f110214o;
        String str = null;
        if (collectMusicItemAdapter != null) {
            musicModel2 = collectMusicItemAdapter.mo103998f();
        } else {
            musicModel2 = null;
        }
        if (musicModel2 != null) {
            obj = musicModel2.getMusicId();
        } else {
            obj = null;
        }
        if (musicModel != null) {
            str = musicModel.getMusicId();
        }
        if (!(!C7573i.m23585a(obj, (Object) str))) {
            CollectMusicItemAdapter collectMusicItemAdapter2 = this.f110214o;
            if (collectMusicItemAdapter2 != null) {
                collectMusicItemAdapter2.mo104002m();
            }
            CollectMusicItemAdapter collectMusicItemAdapter3 = this.f110214o;
            if (collectMusicItemAdapter3 != null) {
                CollectMusicItemAdapter collectMusicItemAdapter4 = this.f110214o;
                if (collectMusicItemAdapter4 != null) {
                    i = collectMusicItemAdapter4.f110413d;
                } else {
                    i = -1;
                }
                collectMusicItemAdapter3.f110414e = i;
            }
            mo103890c(true);
        }
    }

    /* renamed from: a */
    public final void mo103876a(AppCompatActivity appCompatActivity, FrameLayout frameLayout) {
        int i;
        C7573i.m23587b(appCompatActivity, "activity");
        if (this.f110196C == null) {
            LayoutInflater from = LayoutInflater.from(appCompatActivity);
            if (C42395b.m134788a() == 0) {
                i = R.layout.gn;
            } else {
                i = R.layout.go;
            }
            this.f110196C = from.inflate(i, frameLayout, true);
            m134738m();
            m134742q();
            return;
        }
        this.f110197D = true;
        m134743r();
    }

    /* renamed from: b */
    private void m134734b(MusicModel musicModel, Exception exc) {
        MusicModel musicModel2;
        Object obj;
        int i;
        C7573i.m23587b(exc, "e");
        MusicItemAdapter musicItemAdapter = this.f110203d;
        String str = null;
        if (musicItemAdapter != null) {
            musicModel2 = musicItemAdapter.mo103970c();
        } else {
            musicModel2 = null;
        }
        if (musicModel2 != null) {
            obj = musicModel2.getMusicId();
        } else {
            obj = null;
        }
        if (musicModel != null) {
            str = musicModel.getMusicId();
        }
        if (!(!C7573i.m23585a(obj, (Object) str))) {
            MusicItemAdapter musicItemAdapter2 = this.f110203d;
            if (musicItemAdapter2 != null) {
                musicItemAdapter2.mo103975g();
            }
            MusicItemAdapter musicItemAdapter3 = this.f110203d;
            if (musicItemAdapter3 != null) {
                MusicItemAdapter musicItemAdapter4 = this.f110203d;
                if (musicItemAdapter4 != null) {
                    i = musicItemAdapter4.mo103962a();
                } else {
                    i = -1;
                }
                musicItemAdapter3.mo103968b(i);
            }
            mo103890c(true);
        }
    }

    /* renamed from: a */
    private static List<MusicModel> m134733a(List<? extends MusicModel> list, MusicModel musicModel) {
        boolean z;
        if (list == null || list.isEmpty()) {
            return C7525m.m23466c(musicModel);
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((MusicModel) next).getId() != musicModel.getId()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List<MusicModel> d = C7525m.m23509d((Collection<? extends T>) (List) arrayList);
        d.add(0, musicModel);
        return d;
    }

    /* renamed from: a */
    public final void mo61994a(MusicModel musicModel, Exception exc) {
        C7573i.m23587b(exc, "e");
        if (this.f110210k == 0) {
            m134734b(musicModel, exc);
        } else {
            m134736c(musicModel, exc);
        }
    }

    public C42374a(AppCompatActivity appCompatActivity, C15389d dVar, C42601a aVar) {
        C7573i.m23587b(appCompatActivity, "mActivity");
        C7573i.m23587b(aVar, "aiMusicConfig");
        this.f110220u = appCompatActivity;
        this.f110199F = dVar;
        this.f110221v = aVar;
    }

    /* renamed from: c */
    private void m134737c(String str, MusicModel musicModel, String str2) {
        MusicModel musicModel2;
        Object obj;
        int i;
        CollectMusicItemAdapter collectMusicItemAdapter = this.f110214o;
        String str3 = null;
        if (collectMusicItemAdapter != null) {
            musicModel2 = collectMusicItemAdapter.mo103998f();
        } else {
            musicModel2 = null;
        }
        if (musicModel2 != null) {
            obj = musicModel2.getMusicId();
        } else {
            obj = null;
        }
        if (musicModel != null) {
            str3 = musicModel.getMusicId();
        }
        if (!(!C7573i.m23585a(obj, (Object) str3))) {
            C42610h hVar = this.f110219t;
            if (hVar != null) {
                new C42440b();
                hVar.mo99789a(str, C42440b.m134896a(musicModel2), false);
            }
            CollectMusicItemAdapter collectMusicItemAdapter2 = this.f110214o;
            if (collectMusicItemAdapter2 != null) {
                collectMusicItemAdapter2.mo104002m();
            }
            CollectMusicItemAdapter collectMusicItemAdapter3 = this.f110214o;
            if (collectMusicItemAdapter3 != null) {
                CollectMusicItemAdapter collectMusicItemAdapter4 = this.f110214o;
                if (collectMusicItemAdapter4 != null) {
                    i = collectMusicItemAdapter4.f110414e;
                } else {
                    i = -1;
                }
                collectMusicItemAdapter3.mo103995b(i, true);
            }
            MusicItemAdapter musicItemAdapter = this.f110203d;
            if (musicItemAdapter != null) {
                musicItemAdapter.mo103979k();
            }
            C42431d dVar = this.f110204e;
            if (dVar != null) {
                dVar.mo103940a();
            }
            mo103890c(this.f110221v.mo99787b());
            if (musicModel != null && musicModel.isMvThemeMusic()) {
                mo103890c(true);
            }
        }
    }

    /* renamed from: b */
    private void m134735b(String str, MusicModel musicModel, String str2) {
        MusicModel musicModel2;
        Object obj;
        Object obj2;
        int i;
        float f;
        MusicItemAdapter musicItemAdapter = this.f110203d;
        String str3 = null;
        if (musicItemAdapter != null) {
            musicModel2 = musicItemAdapter.mo103970c();
        } else {
            musicModel2 = null;
        }
        if (musicModel2 != null) {
            obj = musicModel2.getMusicId();
        } else {
            obj = null;
        }
        if (musicModel != null) {
            obj2 = musicModel.getMusicId();
        } else {
            obj2 = null;
        }
        if (!(!C7573i.m23585a(obj, obj2))) {
            AVDmtTextView aVDmtTextView = this.f110209j;
            if (aVDmtTextView != null) {
                aVDmtTextView.setSelected(true);
            }
            AVDmtTextView aVDmtTextView2 = this.f110209j;
            if (aVDmtTextView2 != null) {
                AVDmtTextView aVDmtTextView3 = this.f110209j;
                if (aVDmtTextView3 != null) {
                    Context context = aVDmtTextView3.getContext();
                    if (context != null) {
                        Resources resources = context.getResources();
                        if (resources != null) {
                            Object[] objArr = new Object[1];
                            if (musicModel2 != null) {
                                str3 = musicModel2.getName();
                            }
                            objArr[0] = str3;
                            str3 = resources.getString(R.string.of, objArr);
                        }
                    }
                }
                aVDmtTextView2.setText(str3);
            }
            LrcView lrcView = this.f110208i;
            if (lrcView != null) {
                lrcView.setVisibility(8);
            }
            LrcView lrcView2 = this.f110208i;
            if (lrcView2 != null) {
                lrcView2.setStartTime(0);
            }
            Object service = ServiceManager.get().getService(IAVServiceProxy.class);
            C7573i.m23582a(service, "ServiceManager.get().get…ServiceProxy::class.java)");
            int b = ((IAVServiceProxy) service).getMusicService().mo83267b(str);
            LrcView lrcView3 = this.f110208i;
            if (lrcView3 != null) {
                lrcView3.setDuration(((float) b) / 1000.0f);
            }
            LrcView lrcView4 = this.f110208i;
            if (lrcView4 != null) {
                if (musicModel2 != null) {
                    f = musicModel2.getPreviewStartTime();
                } else {
                    f = 0.0f;
                }
                lrcView4.setPreviewStartTime(f);
            }
            C42610h hVar = this.f110219t;
            if (hVar != null) {
                new C42440b();
                hVar.mo99789a(str, C42440b.m134896a(musicModel2), true);
            }
            MusicItemAdapter musicItemAdapter2 = this.f110203d;
            if (musicItemAdapter2 != null) {
                musicItemAdapter2.mo103975g();
            }
            MusicItemAdapter musicItemAdapter3 = this.f110203d;
            if (musicItemAdapter3 != null) {
                MusicItemAdapter musicItemAdapter4 = this.f110203d;
                if (musicItemAdapter4 != null) {
                    i = musicItemAdapter4.mo103967b();
                } else {
                    i = -1;
                }
                musicItemAdapter3.mo103969b(i, true);
            }
            CollectMusicItemAdapter collectMusicItemAdapter = this.f110214o;
            if (collectMusicItemAdapter != null) {
                collectMusicItemAdapter.mo104003n();
            }
            C42452b a = C42452b.m134910a();
            if (musicModel2 == null) {
                C7573i.m23580a();
            }
            a.mo103958a(musicModel2.getLrcUrl(), musicModel2.getLrcType(), (C42459b) new C42391j(this));
            C42431d dVar = this.f110204e;
            if (dVar != null) {
                dVar.mo103941a(new C42392k(this));
            }
            C42431d dVar2 = this.f110204e;
            if (dVar2 != null) {
                dVar2.mo103940a();
            }
            mo103890c(this.f110221v.mo99787b());
            if (musicModel != null && musicModel.isMvThemeMusic()) {
                mo103890c(true);
            }
        }
    }
}
