package com.p280ss.android.ugc.aweme.discover.adapter.music;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23472a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25696d;
import com.p280ss.android.ugc.aweme.discover.abtest.AsyncInflateSearchExperiment;
import com.p280ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.C26499p;
import com.p280ss.android.ugc.aweme.discover.base.C26597d;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C43018cm;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.music.NewSearchMusicViewHolder */
public final class NewSearchMusicViewHolder extends AbsSearchViewHolder implements OnClickListener, C25696d {

    /* renamed from: f */
    public static final C26494a f69872f = new C26494a(null);

    /* renamed from: c */
    public C26597d f69873c = new C26597d(this.f69876g, mo67901c(), this.f69874d, this.f69875e);

    /* renamed from: d */
    public String f69874d;

    /* renamed from: e */
    public final C26499p f69875e;

    /* renamed from: g */
    private final ImageView f69876g;

    /* renamed from: h */
    private final RemoteImageView f69877h;

    /* renamed from: i */
    private final ImageView f69878i;

    /* renamed from: j */
    private final TextView f69879j;

    /* renamed from: k */
    private final TextView f69880k;

    /* renamed from: l */
    private final TextView f69881l;

    /* renamed from: m */
    private final TextView f69882m;

    /* renamed from: n */
    private final TextView f69883n;

    /* renamed from: o */
    private Music f69884o;

    /* renamed from: p */
    private String f69885p;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.music.NewSearchMusicViewHolder$a */
    public static final class C26494a {
        private C26494a() {
        }

        public /* synthetic */ C26494a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static NewSearchMusicViewHolder m87161a(ViewGroup viewGroup, String str, C26499p pVar) {
            View view;
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(str, "mKeyword");
            if (!(viewGroup.getContext() instanceof C23149d) || !C6399b.m19944t() || !C6384b.m19835a().mo15292a(AsyncInflateSearchExperiment.class, true, "is_async_search", C6384b.m19835a().mo15295d().is_async_search, true)) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zx, viewGroup, false);
                C7573i.m23582a((Object) view, "LayoutInflater.from(pare…rch_music, parent, false)");
            } else {
                Context context = viewGroup.getContext();
                if (context != null) {
                    view = ((C23149d) context).getInflater().mo60290a(R.layout.zx);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.ainflate.AsyncInflaterOwner");
                }
            }
            return new NewSearchMusicViewHolder(view, str, pVar);
        }
    }

    /* renamed from: a */
    public static final NewSearchMusicViewHolder m87152a(ViewGroup viewGroup, String str, C26499p pVar) {
        return C26494a.m87161a(viewGroup, str, null);
    }

    /* renamed from: d */
    public final View mo67902d() {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        return view;
    }

    /* renamed from: g */
    private int m87156g() {
        if (this.f69875e != null) {
            C26499p pVar = this.f69875e;
            Music music = this.f69884o;
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
    public final void mo68117a(String str) {
        C7573i.m23587b(str, "enterFrom");
        this.f69885p = str;
        C26597d dVar = this.f69873c;
        if (dVar != null) {
            dVar.mo68286a(str);
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view != null) {
            if (view.getId() == R.id.e4d) {
                m87153a(view);
            } else {
                m87155b(view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r3 == null) goto L_0x0033;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m87153a(android.view.View r5) {
        /*
            r4 = this;
            boolean r5 = com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a.m89578a(r5)
            if (r5 == 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.ugc.aweme.discover.base.d r5 = r4.f69873c
            if (r5 == 0) goto L_0x0019
            android.support.v4.app.FragmentActivity r0 = r4.mo67901c()
            com.ss.android.ugc.aweme.music.model.Music r1 = r4.f69884o
            if (r1 != 0) goto L_0x0016
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0016:
            r5.mo68284a(r0, r1)
        L_0x0019:
            com.ss.android.ugc.aweme.discover.mob.z r5 = com.p280ss.android.ugc.aweme.discover.mob.C26807z.f70733a
            java.lang.String r0 = r4.f69885p
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = ""
        L_0x0021:
            com.ss.android.ugc.aweme.discover.adapter.r r1 = r4.mo67895a()
            java.lang.String r1 = r1.f69900d
            java.lang.String r2 = r4.f69874d
            com.ss.android.ugc.aweme.music.model.Music r3 = r4.f69884o
            if (r3 == 0) goto L_0x0033
            java.lang.String r3 = r3.getMid()
            if (r3 != 0) goto L_0x0035
        L_0x0033:
            java.lang.String r3 = ""
        L_0x0035:
            r5.mo68591a(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.adapter.music.NewSearchMusicViewHolder.m87153a(android.view.View):void");
    }

    /* renamed from: a */
    private final void m87154a(Music music) {
        if (TextUtils.isEmpty(music.getLyricShort())) {
            this.f69883n.setVisibility(8);
            return;
        }
        this.f69883n.setVisibility(0);
        this.f69883n.setText(C23472a.m77061a(mo67898b(), mo67898b().getResources().getString(R.string.c77, new Object[]{music.getLyricShort()}), music.getLyricShortPosition(), 3, R.color.a4e));
    }

    /* renamed from: b */
    private final void m87155b(View view) {
        int i;
        if (!C27326a.m89578a(view)) {
            int g = m87156g();
            if (this.f69884o != null) {
                IMusicService iMusicService = (IMusicService) ServiceManager.get().getService(IMusicService.class);
                Music music = this.f69884o;
                if (music == null) {
                    C7573i.m23580a();
                }
                MusicModel convertToMusicModel = music.convertToMusicModel();
                View view2 = this.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                if (!iMusicService.checkValidMusic(convertToMusicModel, view2.getContext(), true)) {
                    String str = "enter_music_detail_failed";
                    C22984d a = new C22984d().mo59973a("group_id", "").mo59973a("author_id", "");
                    String str2 = "music_id";
                    Music music2 = this.f69884o;
                    if (music2 == null) {
                        C7573i.m23580a();
                    }
                    C6907h.m21524a(str, (Map) a.mo59973a(str2, music2.getMid()).mo59973a("enter_from", this.f69885p).f60753a);
                    return;
                } else if (TextUtils.isEmpty(this.f69874d) && C6399b.m19944t()) {
                    String str3 = "click_search_music(%d-%s): %s";
                    Object[] objArr = new Object[3];
                    int i2 = g + 1;
                    objArr[0] = Integer.valueOf(i2);
                    Music music3 = this.f69884o;
                    if (music3 == null) {
                        C7573i.m23580a();
                    }
                    objArr[1] = music3.getMid();
                    Music music4 = this.f69884o;
                    if (music4 == null) {
                        C7573i.m23580a();
                    }
                    objArr[2] = music4.getMusicName();
                    C7573i.m23582a((Object) C1642a.m8034a(str3, Arrays.copyOf(objArr, 3)), "java.lang.String.format(format, *args)");
                    String str4 = "click_search_music";
                    String str5 = "music_id";
                    Music music5 = this.f69884o;
                    if (music5 == null) {
                        C7573i.m23580a();
                    }
                    C6907h.m21524a(str4, C43018cm.m136528a(str5, music5.getMid(), "client_order", String.valueOf(i2)));
                }
            }
            C7195s a2 = C7195s.m22438a();
            StringBuilder sb = new StringBuilder("aweme://music/detail/");
            Music music6 = this.f69884o;
            if (music6 == null) {
                C7573i.m23580a();
            }
            sb.append(music6.getMid());
            a2.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("extra_music_from", this.f69885p).mo18695a());
            if (this.f69405b.f69897a) {
                i = 3;
            } else {
                i = 1;
            }
            String str6 = this.f69405b.f69902f;
            if (str6 == null) {
                str6 = C26780aa.m87952a(this.f69874d);
                C7573i.m23582a((Object) str6, "SearchStatistics.getEnterMethod(keyword)");
            }
            String str7 = str6;
            View view3 = this.itemView;
            String str8 = this.f69874d;
            Music music7 = this.f69884o;
            if (music7 == null) {
                C7573i.m23580a();
            }
            String requestId = music7.getRequestId();
            Music music8 = this.f69884o;
            if (music8 == null) {
                C7573i.m23580a();
            }
            C26780aa.m87956a(view3, g, str8, i, requestId, music8, str7);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0134  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68116a(com.p280ss.android.ugc.aweme.music.model.Music r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "keyword"
            kotlin.jvm.internal.C7573i.m23587b(r12, r0)
            if (r11 != 0) goto L_0x0008
            return
        L_0x0008:
            r10.f69874d = r12
            r10.f69884o = r11
            com.ss.android.ugc.aweme.base.model.UrlModel r12 = r11.getCoverThumb()
            if (r12 == 0) goto L_0x001b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r12 = r10.f69877h
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r11.getCoverThumb()
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r12, r0)
        L_0x001b:
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment> r2 = com.p280ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment.class
            r3 = 1
            java.lang.String r4 = "remove_15s_cap_music"
            com.bytedance.ies.abmock.b r12 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r12 = r12.mo15295d()
            boolean r5 = r12.remove_15s_cap_music
            r6 = 1
            boolean r12 = r1.mo15292a(r2, r3, r4, r5, r6)
            if (r12 == 0) goto L_0x0040
            int r12 = r11.getPresenterDuration()
            int r12 = r12 * 1000
            java.lang.String r12 = com.p280ss.android.ugc.aweme.utils.C43109eu.m136730a(r12)
            goto L_0x004a
        L_0x0040:
            int r12 = r11.getDuration()
            int r12 = r12 * 1000
            java.lang.String r12 = com.p280ss.android.ugc.aweme.utils.C43109eu.m136730a(r12)
        L_0x004a:
            int r0 = r11.getUserCount()
            long r0 = (long) r0
            java.lang.String r0 = com.p280ss.android.ugc.aweme.i18n.C30537o.m99738a(r0)
            android.widget.TextView r1 = r10.f69881l
            android.content.Context r2 = r10.mo67898b()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r4 = 2131824948(0x7f111134, float:1.9282738E38)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r12
            r12 = 1
            r5[r12] = r0
            java.lang.String r12 = r2.getString(r4, r5)
            if (r12 == 0) goto L_0x0074
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            goto L_0x0078
        L_0x0074:
            java.lang.String r12 = ""
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
        L_0x0078:
            r1.setText(r12)
            java.lang.String r12 = r11.getMusicName()
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            r0 = 8
            if (r12 != 0) goto L_0x00d6
            boolean r12 = r11.isOriginMusic()
            if (r12 == 0) goto L_0x0095
            android.widget.ImageView r12 = r10.f69878i
            r12.setVisibility(r3)
            goto L_0x009a
        L_0x0095:
            android.widget.ImageView r12 = r10.f69878i
            r12.setVisibility(r0)
        L_0x009a:
            android.widget.TextView r12 = r10.f69879j
            android.content.Context r12 = r12.getContext()
            com.ss.android.ugc.aweme.music.model.Music r1 = r10.f69884o
            if (r1 != 0) goto L_0x00a7
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00a7:
            java.lang.String r1 = r1.getMusicName()
            com.ss.android.ugc.aweme.music.model.Music r2 = r10.f69884o
            if (r2 != 0) goto L_0x00b2
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00b2:
            java.util.List r2 = r2.getPositions()
            android.text.SpannableString r12 = com.p280ss.android.ugc.aweme.base.utils.C23472a.m77059a(r12, r1, r2)
            android.widget.TextView r1 = r10.f69879j
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r1.setText(r12)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r12 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.music.service.IMusicService> r1 = com.p280ss.android.ugc.aweme.music.service.IMusicService.class
            java.lang.Object r12 = r12.getService(r1)
            com.ss.android.ugc.aweme.music.service.IMusicService r12 = (com.p280ss.android.ugc.aweme.music.service.IMusicService) r12
            android.widget.TextView r1 = r10.f69879j
            boolean r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            r12.attachPartnerTag(r1, r11, r2)
        L_0x00d6:
            java.lang.String r12 = r11.getAuthorName()
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x00ee
            android.widget.TextView r12 = r10.f69880k
            java.lang.String r1 = r11.getAuthorName()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r12.setText(r1)
            goto L_0x00f3
        L_0x00ee:
            android.widget.TextView r12 = r10.f69880k
            r12.setVisibility(r0)
        L_0x00f3:
            com.ss.android.ugc.aweme.discover.base.d r12 = r10.f69873c
            if (r12 == 0) goto L_0x00fa
            r12.mo68285a(r11)
        L_0x00fa:
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.music.experiment.MusicSearchCardExperiment> r5 = com.p280ss.android.ugc.aweme.music.experiment.MusicSearchCardExperiment.class
            r6 = 1
            java.lang.String r7 = "music_card_style"
            com.bytedance.ies.abmock.b r12 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r12 = r12.mo15295d()
            int r8 = r12.music_card_style
            r9 = 0
            int r12 = r4.mo15287a(r5, r6, r7, r8, r9)
            switch(r12) {
                case 1: goto L_0x0134;
                case 2: goto L_0x0129;
                case 3: goto L_0x0120;
                default: goto L_0x0115;
            }
        L_0x0115:
            android.widget.TextView r11 = r10.f69882m
            r11.setVisibility(r0)
            android.widget.TextView r11 = r10.f69883n
            r11.setVisibility(r0)
            return
        L_0x0120:
            android.widget.TextView r12 = r10.f69882m
            r12.setVisibility(r3)
            r10.m87154a(r11)
            return
        L_0x0129:
            android.widget.TextView r11 = r10.f69883n
            r11.setVisibility(r0)
            android.widget.TextView r11 = r10.f69882m
            r11.setVisibility(r3)
            return
        L_0x0134:
            android.widget.TextView r12 = r10.f69882m
            r12.setVisibility(r0)
            r10.m87154a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.adapter.music.NewSearchMusicViewHolder.mo68116a(com.ss.android.ugc.aweme.music.model.Music, java.lang.String):void");
    }

    public NewSearchMusicViewHolder(View view, String str, C26499p pVar) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        super(view);
        this.f69874d = str;
        this.f69875e = pVar;
        View findViewById = view.findViewById(R.id.bb6);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_play_status)");
        this.f69876g = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.b64);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.iv_avatar)");
        this.f69877h = (RemoteImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bas);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.iv_original_tag)");
        this.f69878i = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.dyb);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.tv_music_title)");
        this.f69879j = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.dy8);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.tv_music_author)");
        this.f69880k = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.dtq);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.…_duration_and_used_count)");
        this.f69881l = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.e4d);
        C7573i.m23582a((Object) findViewById7, "itemView.findViewById(R.id.tv_use_to_shoot)");
        this.f69882m = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.dxg);
        C7573i.m23582a((Object) findViewById8, "itemView.findViewById(R.id.tv_lyric)");
        this.f69883n = (TextView) findViewById8;
        OnClickListener onClickListener = this;
        view.setOnClickListener(onClickListener);
        this.f69882m.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo66587a(int i, Object obj, C1293v vVar, View view, int i2, int i3) {
        if (i2 == 0 && i3 != 0 && this.f69884o != null && TextUtils.isEmpty(this.f69874d) && C6399b.m19944t()) {
            String str = "show_search_music(%d-%s): %s";
            Object[] objArr = new Object[3];
            int g = m87156g() + 1;
            objArr[0] = Integer.valueOf(g);
            Music music = this.f69884o;
            if (music == null) {
                C7573i.m23580a();
            }
            objArr[1] = music.getMid();
            Music music2 = this.f69884o;
            if (music2 == null) {
                C7573i.m23580a();
            }
            objArr[2] = music2.getMusicName();
            C7573i.m23582a((Object) C1642a.m8034a(str, Arrays.copyOf(objArr, 3)), "java.lang.String.format(format, *args)");
            String str2 = "show_search_music";
            String str3 = "music_id";
            Music music3 = this.f69884o;
            if (music3 == null) {
                C7573i.m23580a();
            }
            C6907h.m21524a(str2, C43018cm.m136528a(str3, music3.getMid(), "client_order", String.valueOf(g)));
        }
    }
}
