package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicClusterViewHolder */
public final class SearchMusicClusterViewHolder extends C1293v {

    /* renamed from: b */
    public static final C26449a f69716b = new C26449a(null);

    /* renamed from: a */
    public ClusterButtonData f69717a;

    /* renamed from: c */
    private final DmtTextView f69718c;

    /* renamed from: d */
    private String f69719d;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicClusterViewHolder$a */
    public static final class C26449a {
        private C26449a() {
        }

        public /* synthetic */ C26449a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchMusicClusterViewHolder m87017a(ViewGroup viewGroup, C26450b bVar) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(bVar, "listener");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2l, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new SearchMusicClusterViewHolder(inflate, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicClusterViewHolder$b */
    public interface C26450b {
        /* renamed from: a */
        void mo68041a(ClusterButtonData clusterButtonData);
    }

    public SearchMusicClusterViewHolder(View view, final C26450b bVar) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(bVar, "listener");
        super(view);
        View findViewById = view.findViewById(R.id.dxn);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_matched_count)");
        this.f69718c = (DmtTextView) findViewById;
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ SearchMusicClusterViewHolder f69720a;

            {
                this.f69720a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89578a(view) && this.f69720a.f69717a != null) {
                    SearchMusicClusterViewHolder searchMusicClusterViewHolder = this.f69720a;
                    String str = "matched_sounds_click";
                    ClusterButtonData clusterButtonData = this.f69720a.f69717a;
                    if (clusterButtonData == null) {
                        C7573i.m23580a();
                    }
                    searchMusicClusterViewHolder.mo68046a(str, clusterButtonData);
                    C26450b bVar = bVar;
                    ClusterButtonData clusterButtonData2 = this.f69720a.f69717a;
                    if (clusterButtonData2 == null) {
                        C7573i.m23580a();
                    }
                    bVar.mo68041a(clusterButtonData2);
                }
            }
        });
    }

    /* renamed from: a */
    private static C22984d m87013a(C22984d dVar, ClusterButtonData clusterButtonData) {
        C22984d a = dVar.mo59973a("log_pb", C28199ae.m92689a().mo71791a(((Music) clusterButtonData.getClusterList().get(0)).getRequestId()));
        C7573i.m23582a((Object) a, "appendParam(Mob.Key.LOG_PB, logPb)");
        return a;
    }

    /* renamed from: a */
    private static C22984d m87014a(C22984d dVar, List<Music> list) {
        StringBuilder sb = new StringBuilder();
        for (Music mid : list) {
            sb.append(mid.getMid());
            sb.append(",");
        }
        C22984d a = dVar.mo59973a("music_list", C7634n.m23735a((CharSequence) sb, (CharSequence) ",").toString());
        C7573i.m23582a((Object) a, "appendParam(Mob.Key.MUSI…veSuffix(\",\").toString())");
        return a;
    }

    /* renamed from: a */
    public final void mo68045a(SearchMusic searchMusic, String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        if (searchMusic instanceof ClusterButtonData) {
            ClusterButtonData clusterButtonData = (ClusterButtonData) searchMusic;
            int size = clusterButtonData.getClusterList().size();
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            Context context = view.getContext();
            C7573i.m23582a((Object) context, "itemView.context");
            String string = context.getResources().getString(R.string.dk3);
            DmtTextView dmtTextView = this.f69718c;
            C7573i.m23582a((Object) string, "format");
            String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            dmtTextView.setText(a);
            this.f69717a = clusterButtonData;
            this.f69719d = str;
            if (!clusterButtonData.isMobShowSent()) {
                mo68046a("matched_sounds_show", clusterButtonData);
                clusterButtonData.setMobShowSent(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo68046a(String str, ClusterButtonData clusterButtonData) {
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "search_result").mo59973a("search_keyword", this.f69719d);
        C7573i.m23582a((Object) a, "EventMapBuilder.newBuild…SEARCH_KEYWORD, mKeyword)");
        C6907h.m21524a(str, (Map) m87013a(m87014a(a, clusterButtonData.getClusterList()), clusterButtonData).f60753a);
    }
}
