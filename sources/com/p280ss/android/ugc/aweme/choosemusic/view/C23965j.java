package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.j */
public final class C23965j extends LinearLayout {

    /* renamed from: a */
    C33746f<C23822c> f63315a;

    /* renamed from: b */
    private ArrayList<MusicItemViewHolder> f63316b = new ArrayList<>(3);

    /* renamed from: c */
    private C23963h f63317c;

    /* renamed from: d */
    private int f63318d;

    public final ArrayList<MusicItemViewHolder> getMusicItemViews() {
        return this.f63316b;
    }

    /* renamed from: a */
    private void m78650a() {
        setOrientation(1);
        for (int i = 0; i < 3; i++) {
            MusicItemViewHolder musicItemViewHolder = new MusicItemViewHolder(LayoutInflater.from(getContext()).inflate(R.layout.zc, null, false), this.f63318d);
            musicItemViewHolder.mo62209a();
            this.f63316b.add(musicItemViewHolder);
            musicItemViewHolder.mo62210a(this.f63317c, this.f63315a);
            addView(musicItemViewHolder.itemView);
        }
    }

    public C23965j(Context context, int i) {
        super(context);
        this.f63318d = i;
        m78650a();
    }

    /* renamed from: a */
    public final void mo62171a(C23963h hVar, C33746f<C23822c> fVar) {
        this.f63317c = hVar;
        this.f63315a = fVar;
        if (!this.f63316b.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                ((MusicItemViewHolder) this.f63316b.get(i)).mo62210a(this.f63317c, this.f63315a);
            }
        }
    }

    /* renamed from: a */
    public final void mo62172a(List<MusicModel> list, int i, int i2, int i3, C23819a aVar, boolean z) {
        boolean z2;
        List<MusicModel> list2 = list;
        if (list2 != null) {
            int min = Math.min(i + 3, list.size());
            for (int i4 = i; i4 < min; i4++) {
                MusicModel musicModel = (MusicModel) list2.get(i4);
                MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) getMusicItemViews().get(i4 - i);
                musicItemViewHolder.itemView.setVisibility(0);
                String str = "";
                if (i2 == i4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                musicItemViewHolder.mo62211a(musicModel, str, z, z2, false, 0, i3, i4, aVar);
            }
            for (int i5 = min - i; i5 < 3; i5++) {
                ((MusicItemViewHolder) getMusicItemViews().get(i5)).itemView.setVisibility(8);
            }
        }
    }
}
