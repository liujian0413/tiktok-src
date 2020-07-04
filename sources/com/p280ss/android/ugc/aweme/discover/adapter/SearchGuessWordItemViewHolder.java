package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27012a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchGuessWordItemViewHolder */
public final class SearchGuessWordItemViewHolder extends C1293v {

    /* renamed from: a */
    public TextView f69691a;

    /* renamed from: b */
    public final C27012a f69692b;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchGuessWordItemViewHolder$a */
    static final class C26440a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchGuessWordItemViewHolder f69693a;

        /* renamed from: b */
        final /* synthetic */ int f69694b;

        /* renamed from: c */
        final /* synthetic */ Word f69695c;

        C26440a(SearchGuessWordItemViewHolder searchGuessWordItemViewHolder, int i, Word word) {
            this.f69693a = searchGuessWordItemViewHolder;
            this.f69694b = i;
            this.f69695c = word;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("trending_words_click", (Map) C22984d.m75611a().mo59970a("words_position", this.f69694b).mo59973a("words_source", "recom_search").mo59973a("words_content", this.f69695c.getWord()).mo59973a("group_id", this.f69695c.getId()).f60753a);
            C27012a aVar = this.f69693a.f69692b;
            if (aVar != null) {
                aVar.handleGuessWordItemClick(this.f69695c, this.f69694b);
            }
        }
    }

    /* renamed from: a */
    private final void m86988a(Word word) {
        if (!word.isShowed()) {
            word.setShowed(true);
            C6907h.m21524a("trending_words_show", (Map) C22984d.m75611a().mo59970a("words_position", getPosition()).mo59973a("words_source", "recom_search").mo59973a("words_content", word.getWord()).mo59973a("group_id", word.getId()).f60753a);
        }
    }

    public SearchGuessWordItemViewHolder(View view, C27012a aVar) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f69692b = aVar;
        View findViewById = view.findViewById(R.id.e2w);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_sug)");
        this.f69691a = (TextView) findViewById;
    }

    /* renamed from: a */
    public final void mo68036a(Word word, int i) {
        C7573i.m23587b(word, "item");
        this.f69691a.setText(word.getWord());
        m86988a(word);
        this.itemView.setOnClickListener(new C26440a(this, i, word));
    }
}
