package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27014c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchHistoryItemViewHolder */
public class SearchHistoryItemViewHolder extends C1293v {

    /* renamed from: a */
    SearchHistory f69696a;

    /* renamed from: b */
    public C27014c f69697b;
    TextView mContentView;
    View mDeleteView;

    private SearchHistoryItemViewHolder(View view, C27014c cVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f69697b = cVar;
        this.mDeleteView.setOnTouchListener(new C27009an() {
            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                if (SearchHistoryItemViewHolder.this.f69697b != null) {
                    SearchHistoryItemViewHolder.this.f69697b.mo69716b(SearchHistoryItemViewHolder.this.f69696a, SearchHistoryItemViewHolder.this.getAdapterPosition());
                }
            }
        });
    }

    /* renamed from: a */
    public static SearchHistoryItemViewHolder m86990a(ViewGroup viewGroup, C27014c cVar) {
        return new SearchHistoryItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2f, viewGroup, false), cVar);
    }

    /* renamed from: a */
    public final void mo68038a(final SearchHistory searchHistory, final int i) {
        this.mContentView.setText(searchHistory.keyword);
        this.itemView.setOnTouchListener(new C27009an() {
            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                if (SearchHistoryItemViewHolder.this.f69697b != null) {
                    SearchHistoryItemViewHolder.this.f69697b.mo69713a(searchHistory, i);
                }
            }
        });
        this.f69696a = searchHistory;
    }
}
