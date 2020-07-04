package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FavoriteAdapter */
public class FavoriteAdapter extends C1262a {

    /* renamed from: a */
    protected List<Aweme> f89014a;

    /* renamed from: b */
    protected C34152a f89015b;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FavoriteAdapter$a */
    public interface C34152a {
    }

    public int getItemCount() {
        if (this.f89014a == null) {
            return 0;
        }
        return this.f89014a.size();
    }

    /* renamed from: a */
    private Aweme m110089a(int i) {
        return (Aweme) this.f89014a.get(i);
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        ((FavoriteViewHolder) vVar).mo66491a(m110089a(i), i);
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new FavoriteViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.v7, viewGroup, false), this.f89015b);
    }
}
