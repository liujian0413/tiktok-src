package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Space;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity.C26366a;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder.C26456a;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicianCard */
public final class SearchMusicianCard extends C1293v implements C26499p {

    /* renamed from: c */
    public static final C26461a f69759c = new C26461a(null);

    /* renamed from: a */
    public final Context f69760a;

    /* renamed from: b */
    public SearchMusic f69761b;

    /* renamed from: d */
    private final DmtTextView f69762d;

    /* renamed from: e */
    private final ViewGroup f69763e;

    /* renamed from: f */
    private final View f69764f;

    /* renamed from: g */
    private final View f69765g;

    /* renamed from: h */
    private final Space f69766h;

    /* renamed from: i */
    private String f69767i;

    /* renamed from: j */
    private final C26499p f69768j;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicianCard$a */
    public static final class C26461a {
        private C26461a() {
        }

        public /* synthetic */ C26461a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchMusicianCard m87050a(ViewGroup viewGroup, C26499p pVar) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(pVar, "provider");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aa0, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new SearchMusicianCard(inflate, pVar);
        }
    }

    /* renamed from: b */
    private final void m87046b() {
        String str = "artist_card_show";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "search_result");
        String str2 = "music_num";
        SearchMusic searchMusic = this.f69761b;
        if (searchMusic == null) {
            C7573i.m23580a();
        }
        List musicList = searchMusic.getMusicList();
        if (musicList == null) {
            C7573i.m23580a();
        }
        C22984d a2 = a.mo59970a(str2, musicList.size());
        String str3 = "music_list";
        SearchMusic searchMusic2 = this.f69761b;
        if (searchMusic2 == null) {
            C7573i.m23580a();
        }
        C22984d a3 = a2.mo59973a(str3, m87045a(searchMusic2));
        String str4 = "is_more_sounds";
        SearchMusic searchMusic3 = this.f69761b;
        if (searchMusic3 == null) {
            C7573i.m23580a();
        }
        C22984d a4 = a3.mo59970a(str4, searchMusic3.getHasMore() ? 1 : 0).mo59973a("search_keyword", this.f69767i);
        String str5 = "log_pb";
        C28199ae a5 = C28199ae.m92689a();
        SearchMusic searchMusic4 = this.f69761b;
        if (searchMusic4 == null) {
            C7573i.m23580a();
        }
        List musicList2 = searchMusic4.getMusicList();
        if (musicList2 == null) {
            C7573i.m23580a();
        }
        C6907h.m21524a(str, (Map) a4.mo59973a(str5, a5.mo71791a(((Music) musicList2.get(0)).getRequestId())).f60753a);
    }

    /* renamed from: a */
    public final void mo68062a() {
        String str = "enter_artist_card_detail";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "search_result");
        String str2 = "music_num";
        SearchMusic searchMusic = this.f69761b;
        if (searchMusic == null) {
            C7573i.m23580a();
        }
        List musicList = searchMusic.getMusicList();
        if (musicList == null) {
            C7573i.m23580a();
        }
        C22984d a2 = a.mo59970a(str2, musicList.size());
        String str3 = "music_list";
        SearchMusic searchMusic2 = this.f69761b;
        if (searchMusic2 == null) {
            C7573i.m23580a();
        }
        C22984d a3 = a2.mo59973a(str3, m87045a(searchMusic2)).mo59973a("search_keyword", this.f69767i);
        String str4 = "log_pb";
        C28199ae a4 = C28199ae.m92689a();
        SearchMusic searchMusic3 = this.f69761b;
        if (searchMusic3 == null) {
            C7573i.m23580a();
        }
        List musicList2 = searchMusic3.getMusicList();
        if (musicList2 == null) {
            C7573i.m23580a();
        }
        C6907h.m21524a(str, (Map) a3.mo59973a(str4, a4.mo71791a(((Music) musicList2.get(0)).getRequestId())).f60753a);
    }

    /* renamed from: a */
    public final int mo68040a(Music music) {
        C7573i.m23587b(music, "music");
        C26499p pVar = this.f69768j;
        SearchMusic searchMusic = this.f69761b;
        if (searchMusic == null) {
            C7573i.m23580a();
        }
        List musicList = searchMusic.getMusicList();
        if (musicList == null) {
            C7573i.m23580a();
        }
        int a = pVar.mo68040a((Music) C7525m.m23511f(musicList));
        SearchMusic searchMusic2 = this.f69761b;
        if (searchMusic2 == null) {
            C7573i.m23580a();
        }
        List musicList2 = searchMusic2.getMusicList();
        if (musicList2 == null) {
            C7573i.m23580a();
        }
        return a + musicList2.indexOf(music);
    }

    /* renamed from: a */
    private static String m87045a(SearchMusic searchMusic) {
        StringBuilder sb = new StringBuilder();
        List<Music> musicList = searchMusic.getMusicList();
        if (musicList == null) {
            C7573i.m23580a();
        }
        for (Music mid : musicList) {
            sb.append(mid.getMid());
            sb.append(",");
        }
        C7634n.m23735a((CharSequence) sb, (CharSequence) ",");
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "musicIdList.toString()");
        return sb2;
    }

    public SearchMusicianCard(View view, C26499p pVar) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(pVar, "provider");
        super(view);
        this.f69768j = pVar;
        View findViewById = view.findViewById(R.id.title);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.title)");
        this.f69762d = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.a1q);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.content)");
        this.f69763e = (ViewGroup) findViewById2;
        View findViewById3 = view.findViewById(R.id.ec_);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.viewMore)");
        this.f69764f = findViewById3;
        View findViewById4 = view.findViewById(R.id.dlh);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.topDivider)");
        this.f69765g = findViewById4;
        View findViewById5 = view.findViewById(R.id.nm);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.bottomGap)");
        this.f69766h = (Space) findViewById5;
        this.f69760a = view.getContext();
        this.f69764f.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ SearchMusicianCard f69769a;

            {
                this.f69769a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SearchMusic searchMusic = this.f69769a.f69761b;
                if (searchMusic != null) {
                    List musicList = searchMusic.getMusicList();
                    if (musicList != null && !C6307b.m19566a((Collection<T>) musicList)) {
                        int a = this.f69769a.mo68040a((Music) C7525m.m23515h(musicList)) + 1;
                        Context context = this.f69769a.f69760a;
                        C7573i.m23582a((Object) context, "context");
                        String authorName = ((Music) C7525m.m23511f(musicList)).getAuthorName();
                        C7573i.m23582a((Object) authorName, "musicList.first().authorName");
                        C26366a.m86702a(context, authorName, a);
                        this.f69769a.mo68062a();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo68063a(SearchMusic searchMusic, String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        if (searchMusic != null) {
            List<Music> musicList = searchMusic.getMusicList();
            if (musicList != null && !C6307b.m19566a((Collection<T>) musicList)) {
                DmtTextView dmtTextView = this.f69762d;
                String string = this.f69760a.getString(R.string.cha, new Object[]{((Music) C7525m.m23511f(musicList)).getAuthorName()});
                C7573i.m23582a((Object) string, "context.getString(R.stri…cList.first().authorName)");
                String a = C1642a.m8034a(string, Arrays.copyOf(new Object[0], 0));
                C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
                dmtTextView.setText(a);
                this.f69763e.removeAllViews();
                C26501r rVar = new C26501r(false);
                rVar.f69902f = "artist_card";
                for (Music music : musicList) {
                    SearchMusicViewHolder a2 = C26456a.m87041a(this.f69763e, str, null, this);
                    a2.mo68054a("search_result");
                    a2.mo67899b(rVar);
                    a2.mo68053a(music, str);
                    this.f69763e.addView(a2.mo67902d());
                }
                int i = 8;
                if (searchMusic.getHasMore()) {
                    this.f69764f.setVisibility(0);
                    this.f69766h.setVisibility(8);
                } else {
                    this.f69764f.setVisibility(8);
                    this.f69766h.setVisibility(0);
                }
                View view = this.f69765g;
                if (!(getAdapterPosition() == 0 || getAdapterPosition() == 1)) {
                    i = 0;
                }
                view.setVisibility(i);
                this.f69761b = searchMusic;
                this.f69767i = str;
                if (!searchMusic.getHasMobShow()) {
                    m87046b();
                    searchMusic.setHasMobShow(true);
                }
            }
        }
    }
}
