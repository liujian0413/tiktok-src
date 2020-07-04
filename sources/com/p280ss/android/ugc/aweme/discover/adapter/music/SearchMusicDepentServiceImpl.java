package com.p280ss.android.ugc.aweme.discover.adapter.music;

import android.support.p029v7.widget.RecyclerView;
import android.view.View.OnClickListener;
import bolts.C1592h;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.adapter.C26475aa;
import com.p280ss.android.ugc.aweme.music.model.MusicTag;
import com.p280ss.android.ugc.aweme.music.service.ISearchMusicDepentService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.music.SearchMusicDepentServiceImpl */
public class SearchMusicDepentServiceImpl implements ISearchMusicDepentService {
    public void showSearchMusicTags(RecyclerView recyclerView, List<MusicTag> list, OnClickListener onClickListener) {
        C26475aa.m87143a(recyclerView.getContext(), recyclerView, list, onClickListener);
    }

    public void mobShowMusicCardEvent(final String str, final MusicModel musicModel, final int i) {
        C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                String imprId = musicModel.getLogPb().getImprId();
                String imprId2 = musicModel.getLogPb().getImprId();
                String b = C10944e.m32113a().mo15979b((Object) musicModel.getLogPb());
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                C22984d a = C22984d.m75611a().mo59973a("enter_from", "general_search").mo59973a("search_id", imprId).mo59973a("search_keyword", musicModel.getSearchKeyWords()).mo59973a("log_pb", b).mo59973a("impr_id", imprId2).mo59973a("enter_from", str).mo59973a("is_aladdin", "1").mo59973a("search_result_id", musicModel.getMusicId()).mo59973a("token_type", "music").mo59973a("is_aladdin", "0").mo59973a("rank", sb.toString());
                if (!(musicModel == null || musicModel.getMusic() == null || musicModel.getMusic().getMusicTags() == null)) {
                    a.mo59973a("music_tag_info", C10944e.m32113a().mo15979b((Object) musicModel.getMusic().getMusicTags()));
                }
                C6907h.m21524a("search_result_show", (Map) a.f60753a);
                return null;
            }
        }, (Executor) C6907h.m21516a());
    }

    public void mobClickMusicCardEvent(String str, MusicModel musicModel, int i, String str2) {
        final MusicModel musicModel2 = musicModel;
        final String str3 = str;
        final String str4 = str2;
        final int i2 = i;
        C264962 r0 = new Callable<Object>() {
            public final Object call() throws Exception {
                String imprId = musicModel2.getLogPb().getImprId();
                String imprId2 = musicModel2.getLogPb().getImprId();
                String b = C10944e.m32113a().mo15979b((Object) musicModel2.getLogPb());
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                C22984d a = C22984d.m75611a().mo59973a("enter_from", "general_search").mo59973a("search_id", imprId).mo59973a("search_keyword", musicModel2.getSearchKeyWords()).mo59973a("log_pb", b).mo59973a("impr_id", imprId2).mo59973a("enter_from", str3).mo59973a("button_type", str4).mo59973a("is_aladdin", "1").mo59973a("search_result_id", musicModel2.getMusicId()).mo59973a("token_type", "music").mo59973a("is_aladdin", "0").mo59973a("rank", sb.toString());
                if (!(musicModel2 == null || musicModel2.getMusic() == null || musicModel2.getMusic().getMusicTags() == null)) {
                    a.mo59973a("music_tag_info", C10944e.m32113a().mo15979b((Object) musicModel2.getMusic().getMusicTags()));
                }
                C6907h.m21524a("search_result_click", (Map) a.f60753a);
                return null;
            }
        };
        C1592h.m7855a((Callable<TResult>) r0, (Executor) C6907h.m21516a());
    }
}
