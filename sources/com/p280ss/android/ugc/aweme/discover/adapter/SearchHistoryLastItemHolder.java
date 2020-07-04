package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.res.Resources;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.C26533a;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryLastDelegate.HistoryLast;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27014c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchHistoryLastItemHolder */
public class SearchHistoryLastItemHolder extends C1293v {

    /* renamed from: a */
    public long f69703a;

    /* renamed from: b */
    public C27014c f69704b;

    /* renamed from: c */
    public HistoryLast f69705c;
    View mLineView;
    DmtTextView mTipView;

    /* renamed from: a */
    public final void mo68039a(HistoryLast historyLast) {
        int i;
        int i2;
        this.f69705c = historyLast;
        if (C6399b.m19944t() && C26654b.m87579g() && !C26654b.m87580h() && C26533a.m87229a()) {
            this.mLineView.setVisibility(0);
        } else if (!C6399b.m19945u() || !C26654b.m87573a() || !C26533a.m87229a()) {
            this.mLineView.setVisibility(8);
        } else {
            this.mLineView.setVisibility(0);
        }
        switch (historyLast) {
            case TYPE_NONE:
                this.mTipView.setVisibility(8);
                return;
            case TYPE_SHOW_MORE:
                this.mTipView.setVisibility(0);
                DmtTextView dmtTextView = this.mTipView;
                Resources resources = this.itemView.getResources();
                if (C6399b.m19944t()) {
                    i = R.string.ase;
                } else {
                    i = R.string.hy;
                }
                dmtTextView.setText(resources.getString(i));
                return;
            case TYPE_CLEAR_ALL:
                this.mTipView.setVisibility(0);
                DmtTextView dmtTextView2 = this.mTipView;
                Resources resources2 = this.itemView.getResources();
                if (C6399b.m19944t()) {
                    i2 = R.string.are;
                } else {
                    i2 = R.string.a57;
                }
                dmtTextView2.setText(resources2.getString(i2));
                return;
            default:
                this.itemView.setVisibility(8);
                return;
        }
    }

    private SearchHistoryLastItemHolder(View view, C27014c cVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f69704b = cVar;
        view.setOnTouchListener(new C27009an() {
            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                if (System.currentTimeMillis() - SearchHistoryLastItemHolder.this.f69703a >= 500) {
                    SearchHistoryLastItemHolder.this.f69703a = System.currentTimeMillis();
                    if (SearchHistoryLastItemHolder.this.f69704b != null) {
                        if (SearchHistoryLastItemHolder.this.f69705c == HistoryLast.TYPE_SHOW_MORE) {
                            SearchHistoryLastItemHolder.this.f69704b.mo69717c();
                            return;
                        }
                        if (SearchHistoryLastItemHolder.this.f69705c == HistoryLast.TYPE_CLEAR_ALL) {
                            SearchHistoryLastItemHolder.this.f69704b.mo69718l();
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static SearchHistoryLastItemHolder m86994a(ViewGroup viewGroup, C27014c cVar) {
        return new SearchHistoryLastItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2e, viewGroup, false), cVar);
    }
}
