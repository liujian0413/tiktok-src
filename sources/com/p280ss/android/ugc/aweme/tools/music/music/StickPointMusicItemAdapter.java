package com.p280ss.android.ugc.aweme.tools.music.music;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.tools.music.p1674c.C42440b.C42441a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42612j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.music.StickPointMusicItemAdapter */
public final class StickPointMusicItemAdapter extends MusicItemAdapter {

    /* renamed from: l */
    private List<MusicModel> f110405l;

    /* renamed from: a */
    public final void mo103991a(AVMusic aVMusic) {
        if (C6292i.m19525a(this.f110405l)) {
            this.f110405l = new ArrayList();
        }
        if (aVMusic != null) {
            List<MusicModel> list = this.f110405l;
            if (list == null) {
                C7573i.m23580a();
            }
            list.add(0, C42441a.m134898a(aVMusic));
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo103992a(List<AVMusic> list) {
        if (!C6292i.m19525a(list) && C6292i.m19525a(this.f110405l)) {
            if (list == null) {
                C7573i.m23580a();
            }
            for (AVMusic aVMusic : list) {
                List<MusicModel> list2 = this.f110405l;
                if (list2 == null) {
                    C7573i.m23580a();
                }
                list2.add(C42441a.m134898a(aVMusic));
            }
            notifyDataSetChanged();
        }
    }

    public StickPointMusicItemAdapter(List<MusicModel> list, C42612j jVar) {
        C7573i.m23587b(jVar, "onItemClickListener");
        super(list, jVar);
        this.f110405l = list;
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (getItemViewType(i) == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ge, viewGroup, false);
            C7573i.m23582a((Object) inflate, "contentView");
            return new MusicLibViewHolder(inflate, this);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gc, viewGroup, false);
        C7573i.m23582a((Object) inflate2, "contentView");
        return new StickPointMusicItemViewHolder(inflate2, this);
    }
}
