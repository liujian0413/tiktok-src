package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.GameInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.GameElementsAdapter */
public class GameElementsAdapter extends ElementAdapter<GameInfo, C1293v> {

    /* renamed from: c */
    public C33334i f87007c;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.GameElementsAdapter$GameInfoViewHolder */
    public static class GameInfoViewHolder extends C1293v {

        /* renamed from: a */
        public Button f87008a;

        /* renamed from: b */
        private RemoteImageView f87009b;

        /* renamed from: c */
        private DmtTextView f87010c;

        /* renamed from: d */
        private DmtTextView f87011d;

        public GameInfoViewHolder(View view) {
            super(view);
            this.f87009b = (RemoteImageView) view.findViewById(R.id.axm);
            this.f87010c = (DmtTextView) view.findViewById(R.id.e6s);
            this.f87011d = (DmtTextView) view.findViewById(R.id.e6t);
            this.f87008a = (Button) view.findViewById(R.id.pp);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo85454a(GameInfo gameInfo) {
            if (gameInfo != null) {
                C23323e.m76514a(this.f87009b, gameInfo.getIcon());
                this.f87010c.setText(gameInfo.getName());
                this.f87011d.setText(gameInfo.getDescription());
                C6907h.m21524a("gc_label_game_show", (Map) C22984d.m75611a().mo59973a("game_name", gameInfo.getName()).mo59973a("game_id", gameInfo.getId()).mo59973a("position", "enter_page").f60753a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.GameElementsAdapter$RecommendHeaderViewHolder */
    public static class RecommendHeaderViewHolder extends C1293v {
        public RecommendHeaderViewHolder(View view) {
            super(view);
        }
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public int getItemCount() {
        if (this.f86998a == null) {
            return 1;
        }
        return this.f86998a.size() + 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85452a(GameInfo gameInfo, View view) {
        if (this.f86999b != null) {
            this.f86999b.mo85483a(gameInfo);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo85453b(GameInfo gameInfo, View view) {
        if (this.f87007c != null) {
            this.f87007c.mo85482a(gameInfo);
        }
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        if (i >= 0 && i <= getItemCount() - 1 && (vVar instanceof GameInfoViewHolder)) {
            GameInfo gameInfo = (GameInfo) this.f86998a.get(i - 1);
            GameInfoViewHolder gameInfoViewHolder = (GameInfoViewHolder) vVar;
            gameInfoViewHolder.f87008a.setOnClickListener(new C33327b(this, gameInfo));
            gameInfoViewHolder.mo85454a(gameInfo);
            gameInfoViewHolder.itemView.setOnClickListener(new C33328c(this, gameInfo));
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new RecommendHeaderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.t2, viewGroup, false));
            case 1:
                return new GameInfoViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sz, viewGroup, false));
            default:
                return null;
        }
    }
}
