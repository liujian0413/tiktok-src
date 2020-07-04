package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartRoundImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23472a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25696d;
import com.p280ss.android.ugc.aweme.discover.abtest.AsyncInflateSearchExperiment;
import com.p280ss.android.ugc.aweme.discover.base.C26597d;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestMusic;
import com.p280ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.music.service.ISearchMusicDepentService;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43018cm;
import com.p280ss.android.ugc.aweme.utils.C43109eu;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder */
public final class SearchMusicViewHolder extends AbsSearchViewHolder implements C25696d {

    /* renamed from: j */
    public static final C26456a f69734j = new C26456a(null);

    /* renamed from: c */
    public Music f69735c;

    /* renamed from: d */
    public String f69736d;

    /* renamed from: e */
    public C26597d f69737e;

    /* renamed from: f */
    public boolean f69738f;

    /* renamed from: g */
    public String f69739g;

    /* renamed from: h */
    public final C26457b f69740h;

    /* renamed from: i */
    public final C26499p f69741i;

    /* renamed from: k */
    private final ImageView f69742k;

    /* renamed from: l */
    private final SmartRoundImageView f69743l;

    /* renamed from: m */
    private final ImageView f69744m;

    /* renamed from: n */
    private final TextView f69745n;

    /* renamed from: o */
    private final TextView f69746o;

    /* renamed from: p */
    private final TextView f69747p;

    /* renamed from: q */
    private final TextView f69748q;

    /* renamed from: r */
    private final RecyclerView f69749r;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$a */
    public static final class C26456a {
        private C26456a() {
        }

        public /* synthetic */ C26456a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchMusicViewHolder m87041a(ViewGroup viewGroup, String str, C26457b bVar, C26499p pVar) {
            View view;
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(str, "mKeyword");
            if (!(viewGroup.getContext() instanceof C23149d) || !C6399b.m19944t() || !C6384b.m19835a().mo15292a(AsyncInflateSearchExperiment.class, true, "is_async_search", C6384b.m19835a().mo15295d().is_async_search, true)) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_music, viewGroup, false);
                C7573i.m23582a((Object) view, "LayoutInflater.from(pare…rch_music, parent, false)");
            } else {
                Context context = viewGroup.getContext();
                if (context != null) {
                    view = ((C23149d) context).getInflater().mo60290a(R.layout.item_search_music);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.ainflate.AsyncInflaterOwner");
                }
            }
            return new SearchMusicViewHolder(view, str, bVar, pVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$b */
    public interface C26457b {
        /* renamed from: a */
        void mo68059a(Music music, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$c */
    public static final class C26458c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchMusicViewHolder f69756a;

        C26458c(SearchMusicViewHolder searchMusicViewHolder) {
            this.f69756a = searchMusicViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69756a.itemView.performClick();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$d */
    static final class C26459d<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchMusicViewHolder f69757a;

        /* renamed from: b */
        final /* synthetic */ Music f69758b;

        C26459d(SearchMusicViewHolder searchMusicViewHolder, Music music) {
            this.f69757a = searchMusicViewHolder;
            this.f69758b = music;
        }

        public final /* synthetic */ Object call() {
            m87044a();
            return C7581n.f20898a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
            if (r4 == null) goto L_0x0025;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m87044a() {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r0 = r6.f69757a
                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r1 = r6.f69757a
                java.util.Map r1 = r1.mo67903e()
                r2 = 0
                if (r1 == 0) goto L_0x007b
                java.lang.String r3 = "token_type"
                java.lang.String r4 = "music"
                r1.put(r3, r4)
                java.lang.String r3 = "enter_from"
                java.lang.String r4 = "search_result"
                r1.put(r3, r4)
                java.lang.String r3 = "search_result_id"
                com.ss.android.ugc.aweme.music.model.Music r4 = r6.f69758b
                if (r4 == 0) goto L_0x0025
                java.lang.String r4 = r4.getMid()
                if (r4 != 0) goto L_0x0027
            L_0x0025:
                java.lang.String r4 = ""
            L_0x0027:
                r1.put(r3, r4)
                java.lang.String r3 = "is_aladdin"
                java.lang.String r4 = "0"
                r1.put(r3, r4)
                java.lang.String r3 = "rank"
                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r4 = r6.f69757a
                int r4 = r4.getAdapterPosition()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r1.put(r3, r4)
                com.ss.android.ugc.aweme.music.model.Music r3 = r6.f69758b
                if (r3 == 0) goto L_0x0049
                java.util.List r3 = r3.getMusicTags()
                goto L_0x004a
            L_0x0049:
                r3 = r2
            L_0x004a:
                if (r3 == 0) goto L_0x007c
                com.ss.android.ugc.aweme.music.model.Music r3 = r6.f69758b
                if (r3 == 0) goto L_0x0055
                java.util.List r3 = r3.getMusicTags()
                goto L_0x0056
            L_0x0055:
                r3 = r2
            L_0x0056:
                int r3 = r3.size()
                if (r3 <= 0) goto L_0x007c
                java.lang.String r3 = "music_tag_info"
                com.google.gson.e r4 = com.bytedance.ies.ugc.aweme.network.C10944e.m32113a()
                com.ss.android.ugc.aweme.music.model.Music r5 = r6.f69758b
                if (r5 == 0) goto L_0x006a
                java.util.List r2 = r5.getMusicTags()
            L_0x006a:
                if (r2 != 0) goto L_0x006f
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x006f:
                java.lang.String r2 = r4.mo15979b(r2)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.put(r3, r2)
                goto L_0x007c
            L_0x007b:
                r1 = r2
            L_0x007c:
                r0.mo67897a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder.C26459d.m87044a():void");
        }
    }

    /* renamed from: a */
    public static final SearchMusicViewHolder m87031a(ViewGroup viewGroup, String str, C26457b bVar, C26499p pVar) {
        return C26456a.m87041a(viewGroup, str, null, null);
    }

    /* renamed from: d */
    public final View mo67902d() {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        return view;
    }

    /* renamed from: g */
    public final int mo68055g() {
        if (!(this.f69741i == null || this.f69735c == null)) {
            C26499p pVar = this.f69741i;
            Music music = this.f69735c;
            if (music == null) {
                C7573i.m23580a();
            }
            int a = pVar.mo68040a(music);
            if (a >= 0) {
                return a;
            }
        }
        return getAdapterPosition();
    }

    /* renamed from: a */
    public final void mo68054a(String str) {
        C7573i.m23587b(str, "enterFrom");
        this.f69736d = str;
        C26597d dVar = this.f69737e;
        if (dVar != null) {
            dVar.mo68286a(str);
        }
    }

    /* renamed from: a */
    public final void mo68052a(SuggestMusic suggestMusic, String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        if (suggestMusic != null) {
            mo68053a(suggestMusic.music, str);
        }
    }

    /* renamed from: a */
    public final void mo68053a(Music music, String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        if (music != null) {
            this.f69739g = str;
            this.f69735c = music;
            if (music.getCoverThumb() != null) {
                C12133n.m35299a(C23400r.m76741a(music.getCoverThumb())).mo29853b(C43012cg.m136513a(301)).mo29845a("SearchMusicViewHolder").mo29844a((C12128i) this.f69743l).mo29848a();
            }
            if (C6384b.m19835a().mo15292a(RemoveMusic15sCapExperiment.class, true, "remove_15s_cap_music", C6384b.m19835a().mo15295d().remove_15s_cap_music, true)) {
                this.f69748q.setText(C43109eu.m136730a(music.getPresenterDuration() * 1000));
            } else {
                this.f69748q.setText(C43109eu.m136730a(music.getDuration() * 1000));
            }
            this.f69747p.setText(C30537o.m99738a((long) music.getUserCount()));
            if (!TextUtils.isEmpty(music.getMusicName())) {
                if (music.isOriginMusic()) {
                    this.f69744m.setVisibility(0);
                } else {
                    this.f69744m.setVisibility(8);
                }
                Context context = this.f69745n.getContext();
                Music music2 = this.f69735c;
                if (music2 == null) {
                    C7573i.m23580a();
                }
                String musicName = music2.getMusicName();
                Music music3 = this.f69735c;
                if (music3 == null) {
                    C7573i.m23580a();
                }
                this.f69745n.setText(C23472a.m77059a(context, musicName, music3.getPositions()));
                ((IMusicService) ServiceManager.get().getService(IMusicService.class)).attachPartnerTag(this.f69745n, music, C6399b.m19946v());
            }
            if (!TextUtils.isEmpty(music.getAuthorName())) {
                this.f69746o.setText(music.getAuthorName());
            } else {
                this.f69746o.setVisibility(8);
            }
            C26597d dVar = this.f69737e;
            if (dVar != null) {
                dVar.mo68285a(music);
            }
            if (music.getMusicTags() == null || music.getMusicTags().size() <= 0) {
                this.f69749r.setVisibility(8);
                RecyclerView recyclerView = this.f69749r;
                if (recyclerView != null) {
                    recyclerView.removeAllViews();
                }
            } else {
                ISearchMusicDepentService iSearchMusicDepentService = (ISearchMusicDepentService) ServiceManager.get().getService(ISearchMusicDepentService.class);
                RecyclerView recyclerView2 = this.f69749r;
                List musicTags = music.getMusicTags();
                if (musicTags == null) {
                    C7573i.m23580a();
                }
                iSearchMusicDepentService.showSearchMusicTags(recyclerView2, musicTags, new C26458c(this));
            }
            if (!C6399b.m19945u()) {
                C1592h.m7855a((Callable<TResult>) new C26459d<TResult>(this, music), (Executor) C6907h.m21516a());
            }
        }
    }

    public SearchMusicViewHolder(final View view, String str, C26457b bVar, C26499p pVar) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        super(view);
        this.f69739g = str;
        this.f69740h = bVar;
        this.f69741i = pVar;
        View findViewById = view.findViewById(R.id.bb6);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_play_status)");
        this.f69742k = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.b64);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.iv_avatar)");
        this.f69743l = (SmartRoundImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bas);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.iv_original_tag)");
        this.f69744m = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.dyb);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.tv_music_title)");
        this.f69745n = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.dy8);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.tv_music_author)");
        this.f69746o = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.e4e);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.tv_used_count)");
        this.f69747p = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.dy_);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.id.tv_music_duration)");
        this.f69748q = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.c23);
        C7573i.m23582a((Object) findViewById8, "itemView.findViewById(R.id.music_tags_container)");
        this.f69749r = (RecyclerView) findViewById8;
        C26597d dVar = new C26597d(this.f69742k, mo67901c(), this.f69739g, this.f69741i, new C7561a<C7581n>(this) {

            /* renamed from: a */
            final /* synthetic */ SearchMusicViewHolder f69750a;

            {
                this.f69750a = r1;
            }

            public final /* synthetic */ Object invoke() {
                m87038a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m87038a() {
                final String str;
                if (!C6399b.m19945u()) {
                    if (this.f69750a.f69738f) {
                        str = "click_pause_music";
                    } else {
                        str = "click_play_music";
                    }
                    C1592h.m7855a((Callable<TResult>) new Callable<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C264521 f69751a;

                        {
                            this.f69751a = r1;
                        }

                        public final /* synthetic */ Object call() {
                            m87039a();
                            return C7581n.f20898a;
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
                            if (r4 == null) goto L_0x0026;
                         */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        private void m87039a() {
                            /*
                                r6 = this;
                                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$1 r0 = r6.f69751a
                                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r0 = r0.f69750a
                                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$1 r1 = r6.f69751a
                                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r1 = r1.f69750a
                                java.util.Map r1 = r1.mo67903e()
                                r2 = 0
                                if (r1 == 0) goto L_0x007d
                                java.lang.String r3 = "token_type"
                                java.lang.String r4 = "music"
                                r1.put(r3, r4)
                                java.lang.String r3 = "search_result_id"
                                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$1 r4 = r6.f69751a
                                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r4 = r4.f69750a
                                com.ss.android.ugc.aweme.music.model.Music r4 = r4.f69735c
                                if (r4 == 0) goto L_0x0026
                                java.lang.String r4 = r4.getMid()
                                if (r4 != 0) goto L_0x0028
                            L_0x0026:
                                java.lang.String r4 = ""
                            L_0x0028:
                                r1.put(r3, r4)
                                java.lang.String r3 = "is_aladdin"
                                java.lang.String r4 = "0"
                                r1.put(r3, r4)
                                java.lang.String r3 = "rank"
                                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$1 r4 = r6.f69751a
                                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r4 = r4.f69750a
                                int r4 = r4.getAdapterPosition()
                                java.lang.String r4 = java.lang.String.valueOf(r4)
                                r1.put(r3, r4)
                                java.lang.String r3 = "button_type"
                                java.lang.String r4 = r0
                                r1.put(r3, r4)
                                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$1 r3 = r6.f69751a
                                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r3 = r3.f69750a
                                com.ss.android.ugc.aweme.music.model.Music r3 = r3.f69735c
                                if (r3 == 0) goto L_0x0057
                                java.util.List r3 = r3.getMusicTags()
                                goto L_0x0058
                            L_0x0057:
                                r3 = r2
                            L_0x0058:
                                if (r3 == 0) goto L_0x007e
                                java.lang.String r3 = "music_tag_info"
                                com.google.gson.e r4 = com.bytedance.ies.ugc.aweme.network.C10944e.m32113a()
                                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$1 r5 = r6.f69751a
                                com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r5 = r5.f69750a
                                com.ss.android.ugc.aweme.music.model.Music r5 = r5.f69735c
                                if (r5 == 0) goto L_0x006c
                                java.util.List r2 = r5.getMusicTags()
                            L_0x006c:
                                if (r2 != 0) goto L_0x0071
                                kotlin.jvm.internal.C7573i.m23580a()
                            L_0x0071:
                                java.lang.String r2 = r4.mo15979b(r2)
                                java.lang.String r2 = java.lang.String.valueOf(r2)
                                r1.put(r3, r2)
                                goto L_0x007e
                            L_0x007d:
                                r1 = r2
                            L_0x007e:
                                r0.mo67900b(r1)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder.C264521.C264531.m87039a():void");
                        }
                    }, (Executor) C6907h.m21516a());
                    this.f69750a.f69738f = !this.f69750a.f69738f;
                }
            }
        });
        this.f69737e = dVar;
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ SearchMusicViewHolder f69753a;

            {
                this.f69753a = r1;
            }

            public final void onClick(View view) {
                int i;
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89578a(view)) {
                    int g = this.f69753a.mo68055g();
                    if (this.f69753a.f69735c != null) {
                        IMusicService iMusicService = (IMusicService) ServiceManager.get().getService(IMusicService.class);
                        Music music = this.f69753a.f69735c;
                        if (music == null) {
                            C7573i.m23580a();
                        }
                        if (!iMusicService.checkValidMusic(music.convertToMusicModel(), view.getContext(), true)) {
                            String str = "enter_music_detail_failed";
                            C22984d a = new C22984d().mo59973a("group_id", "").mo59973a("author_id", "");
                            String str2 = "music_id";
                            Music music2 = this.f69753a.f69735c;
                            if (music2 == null) {
                                C7573i.m23580a();
                            }
                            C6907h.m21524a(str, (Map) a.mo59973a(str2, music2.getMid()).mo59973a("enter_from", this.f69753a.f69736d).f60753a);
                            return;
                        }
                        if (TextUtils.isEmpty(this.f69753a.f69739g) && C6399b.m19944t()) {
                            String str3 = "click_search_music(%d-%s): %s";
                            Object[] objArr = new Object[3];
                            int i2 = g + 1;
                            objArr[0] = Integer.valueOf(i2);
                            Music music3 = this.f69753a.f69735c;
                            if (music3 == null) {
                                C7573i.m23580a();
                            }
                            objArr[1] = music3.getMid();
                            Music music4 = this.f69753a.f69735c;
                            if (music4 == null) {
                                C7573i.m23580a();
                            }
                            objArr[2] = music4.getMusicName();
                            C7573i.m23582a((Object) C1642a.m8034a(str3, Arrays.copyOf(objArr, 3)), "java.lang.String.format(format, *args)");
                            String str4 = "click_search_music";
                            String str5 = "music_id";
                            Music music5 = this.f69753a.f69735c;
                            if (music5 == null) {
                                C7573i.m23580a();
                            }
                            C6907h.m21524a(str4, C43018cm.m136528a(str5, music5.getMid(), "client_order", Integer.toString(i2)));
                        }
                        if (!C6399b.m19945u()) {
                            C1592h.m7855a((Callable<TResult>) new Callable<C7581n>(this) {

                                /* renamed from: a */
                                final /* synthetic */ C264542 f69755a;

                                {
                                    this.f69755a = r1;
                                }

                                public final /* synthetic */ Object call() {
                                    m87040a();
                                    return C7581n.f20898a;
                                }

                                /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
                                    if (r4 == null) goto L_0x002d;
                                 */
                                /* renamed from: a */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                private void m87040a() {
                                    /*
                                        r6 = this;
                                        com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$2 r0 = r6.f69755a
                                        com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r0 = r0.f69753a
                                        com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$2 r1 = r6.f69755a
                                        com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r1 = r1.f69753a
                                        java.util.Map r1 = r1.mo67903e()
                                        r2 = 0
                                        if (r1 == 0) goto L_0x0084
                                        java.lang.String r3 = "token_type"
                                        java.lang.String r4 = "music"
                                        r1.put(r3, r4)
                                        java.lang.String r3 = "enter_from"
                                        java.lang.String r4 = "search_result"
                                        r1.put(r3, r4)
                                        java.lang.String r3 = "search_result_id"
                                        com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$2 r4 = r6.f69755a
                                        com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r4 = r4.f69753a
                                        com.ss.android.ugc.aweme.music.model.Music r4 = r4.f69735c
                                        if (r4 == 0) goto L_0x002d
                                        java.lang.String r4 = r4.getMid()
                                        if (r4 != 0) goto L_0x002f
                                    L_0x002d:
                                        java.lang.String r4 = ""
                                    L_0x002f:
                                        r1.put(r3, r4)
                                        java.lang.String r3 = "is_aladdin"
                                        java.lang.String r4 = "0"
                                        r1.put(r3, r4)
                                        java.lang.String r3 = "rank"
                                        com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$2 r4 = r6.f69755a
                                        com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r4 = r4.f69753a
                                        int r4 = r4.getAdapterPosition()
                                        java.lang.String r4 = java.lang.String.valueOf(r4)
                                        r1.put(r3, r4)
                                        java.lang.String r3 = "button_type"
                                        java.lang.String r4 = "click_info"
                                        r1.put(r3, r4)
                                        com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$2 r3 = r6.f69755a
                                        com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r3 = r3.f69753a
                                        com.ss.android.ugc.aweme.music.model.Music r3 = r3.f69735c
                                        if (r3 == 0) goto L_0x005e
                                        java.util.List r3 = r3.getMusicTags()
                                        goto L_0x005f
                                    L_0x005e:
                                        r3 = r2
                                    L_0x005f:
                                        if (r3 == 0) goto L_0x0085
                                        java.lang.String r3 = "music_tag_info"
                                        com.google.gson.e r4 = com.bytedance.ies.ugc.aweme.network.C10944e.m32113a()
                                        com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder$2 r5 = r6.f69755a
                                        com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder r5 = r5.f69753a
                                        com.ss.android.ugc.aweme.music.model.Music r5 = r5.f69735c
                                        if (r5 == 0) goto L_0x0073
                                        java.util.List r2 = r5.getMusicTags()
                                    L_0x0073:
                                        if (r2 != 0) goto L_0x0078
                                        kotlin.jvm.internal.C7573i.m23580a()
                                    L_0x0078:
                                        java.lang.String r2 = r4.mo15979b(r2)
                                        java.lang.String r2 = java.lang.String.valueOf(r2)
                                        r1.put(r3, r2)
                                        goto L_0x0085
                                    L_0x0084:
                                        r1 = r2
                                    L_0x0085:
                                        r0.mo67900b(r1)
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder.C264542.C264551.m87040a():void");
                                }
                            }, (Executor) C6907h.m21516a());
                        }
                    }
                    C7195s a2 = C7195s.m22438a();
                    StringBuilder sb = new StringBuilder("aweme://music/detail/");
                    Music music6 = this.f69753a.f69735c;
                    if (music6 == null) {
                        C7573i.m23580a();
                    }
                    sb.append(music6.getMid());
                    a2.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("extra_music_from", this.f69753a.f69736d).mo18695a());
                    if (this.f69753a.f69740h == null) {
                        if (this.f69753a.f69405b.f69897a) {
                            i = 3;
                        } else {
                            i = 1;
                        }
                        String str6 = this.f69753a.f69405b.f69902f;
                        if (str6 == null) {
                            str6 = C26780aa.m87952a(this.f69753a.f69739g);
                            C7573i.m23582a((Object) str6, "SearchStatistics.getEnterMethod(keyword)");
                        }
                        String str7 = str6;
                        View view2 = view;
                        String str8 = this.f69753a.f69739g;
                        Music music7 = this.f69753a.f69735c;
                        if (music7 == null) {
                            C7573i.m23580a();
                        }
                        String requestId = music7.getRequestId();
                        Music music8 = this.f69753a.f69735c;
                        if (music8 == null) {
                            C7573i.m23580a();
                        }
                        C26780aa.m87956a(view2, g, str8, i, requestId, music8, str7);
                        return;
                    }
                    C26457b bVar = this.f69753a.f69740h;
                    Music music9 = this.f69753a.f69735c;
                    if (music9 == null) {
                        C7573i.m23580a();
                    }
                    bVar.mo68059a(music9, g);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo66587a(int i, Object obj, C1293v vVar, View view, int i2, int i3) {
        if (i2 == 0 && i3 != 0 && this.f69735c != null && TextUtils.isEmpty(this.f69739g) && C6399b.m19944t()) {
            String str = "show_search_music(%d-%s): %s";
            Object[] objArr = new Object[3];
            int g = mo68055g() + 1;
            objArr[0] = Integer.valueOf(g);
            Music music = this.f69735c;
            if (music == null) {
                C7573i.m23580a();
            }
            objArr[1] = music.getMid();
            Music music2 = this.f69735c;
            if (music2 == null) {
                C7573i.m23580a();
            }
            objArr[2] = music2.getMusicName();
            C7573i.m23582a((Object) C1642a.m8034a(str, Arrays.copyOf(objArr, 3)), "java.lang.String.format(format, *args)");
            String str2 = "show_search_music";
            String str3 = "music_id";
            Music music3 = this.f69735c;
            if (music3 == null) {
                C7573i.m23580a();
            }
            C6907h.m21524a(str2, C43018cm.m136528a(str3, music3.getMid(), "client_order", Integer.toString(g)));
        }
    }
}
