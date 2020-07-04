package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26576c;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RecommendFriendsAdapter */
public class RecommendFriendsAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: a */
    public List<User> f69617a;

    /* renamed from: b */
    public C28343z<C26576c> f69618b;

    /* renamed from: c */
    private Context f69619c;

    public void onViewDetachedFromWindow(C1293v vVar) {
    }

    /* renamed from: c */
    public final int mo60557c() {
        if (this.f69617a == null) {
            return 20;
        }
        return this.f69617a.size();
    }

    /* renamed from: a */
    public final void mo68014a(final String str) {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                try {
                    DiscoverApi.m87297b(str);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: a */
    private void m86936a(final RecommendCardViewHolder recommendCardViewHolder, int i) {
        recommendCardViewHolder.closeContainer.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (RecommendFriendsAdapter.this.f69617a != null && !RecommendFriendsAdapter.this.f69617a.isEmpty()) {
                    int adapterPosition = recommendCardViewHolder.getAdapterPosition();
                    if (adapterPosition != -1) {
                        User user = (User) RecommendFriendsAdapter.this.f69617a.get(adapterPosition);
                        if (user != null) {
                            RecommendFriendsAdapter.this.mo68014a(user.getUid());
                            C6907h.onEvent(MobClick.obtain().setEventName("close_recommend").setLabelName("discovery_recommend").setValue(user.getUid()));
                        }
                        RecommendFriendsAdapter.this.f69617a.remove(adapterPosition);
                        RecommendFriendsAdapter.this.notifyItemRemoved(adapterPosition);
                        if (RecommendFriendsAdapter.this.f69617a.isEmpty()) {
                            RecommendFriendsAdapter.this.f69618b.mo64929a(new C26576c("", "empty"));
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new RecommendCardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1i, viewGroup, false), this.f69618b);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if ((vVar instanceof RecommendCardViewHolder) && this.f69617a != null) {
            RecommendCardViewHolder recommendCardViewHolder = (RecommendCardViewHolder) vVar;
            recommendCardViewHolder.mo68009a((User) this.f69617a.get(i), this.f69619c);
            m86936a(recommendCardViewHolder, i);
        }
    }
}
