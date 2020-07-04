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

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.GameSearchAdapter */
public class GameSearchAdapter extends ElementAdapter<GameInfo, GameSearchViewHolder> {

    /* renamed from: c */
    public C33334i f87012c;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.GameSearchAdapter$GameSearchViewHolder */
    public static class GameSearchViewHolder extends C1293v {

        /* renamed from: a */
        public Button f87013a;

        /* renamed from: b */
        private RemoteImageView f87014b;

        /* renamed from: c */
        private DmtTextView f87015c;

        /* renamed from: d */
        private DmtTextView f87016d;

        public GameSearchViewHolder(View view) {
            super(view);
            this.f87014b = (RemoteImageView) view.findViewById(R.id.ad1);
            this.f87015c = (DmtTextView) view.findViewById(R.id.ad5);
            this.f87016d = (DmtTextView) view.findViewById(R.id.ad7);
            this.f87013a = (Button) view.findViewById(R.id.pp);
        }

        /* renamed from: a */
        public final void mo85456a(GameInfo gameInfo) {
            if (gameInfo != null) {
                C23323e.m76514a(this.f87014b, gameInfo.getIcon());
                this.f87015c.setText(gameInfo.getName());
                this.f87016d.setText(gameInfo.getDescription());
                C6907h.m21524a("gc_label_game_show", (Map) C22984d.m75611a().mo59973a("game_name", gameInfo.getName()).mo59973a("game_id", gameInfo.getId()).mo59973a("position", "search_result").f60753a);
            }
        }
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m107751a(viewGroup, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85455a(GameInfo gameInfo, View view) {
        if (this.f87012c != null) {
            this.f87012c.mo85482a(gameInfo);
        }
    }

    /* renamed from: a */
    private static GameSearchViewHolder m107751a(ViewGroup viewGroup, int i) {
        return new GameSearchViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sz, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(GameSearchViewHolder gameSearchViewHolder, int i) {
        super.onBindViewHolder(gameSearchViewHolder, i);
        GameInfo gameInfo = (GameInfo) this.f86998a.get(i);
        gameSearchViewHolder.f87013a.setOnClickListener(new C33329d(this, gameInfo));
        gameSearchViewHolder.mo85456a(gameInfo);
    }
}
