package com.p280ss.android.ugc.aweme.discover.delegate.intermedaite;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder.C26456a;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder.C26457b;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.C26632g.C26633a;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestMusic;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.f */
public final class C26631f extends C26633a implements C26457b {
    public C26631f(SearchSquareAdapter<?> searchSquareAdapter) {
        C7573i.m23587b(searchSquareAdapter, "adapter");
        super(searchSquareAdapter);
    }

    /* renamed from: a */
    public final C1293v mo68320a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        SearchMusicViewHolder a = C26456a.m87041a(viewGroup, "", this, null);
        a.mo68054a("search_for_you_list");
        return a;
    }

    /* renamed from: a */
    public final void mo68059a(Music music, int i) {
        C7573i.m23587b(music, "music");
        C6907h.m21524a("enter_music_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "search_for_you_list").mo59973a("music_id", music.getMid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(music.getRequestId())).mo59970a(POIService.KEY_ORDER, mo68324a((Object) music)).f60753a);
    }

    /* renamed from: a */
    public final void mo68321a(List<? extends Object> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        Object obj = list.get(i);
        if (obj != null) {
            ((SearchMusicViewHolder) vVar).mo68052a((SuggestMusic) obj, "");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.SuggestMusic");
    }
}
