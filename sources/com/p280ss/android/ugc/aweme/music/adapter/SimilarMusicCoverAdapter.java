package com.p280ss.android.ugc.aweme.music.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.music.model.SimilarMusicInfo;
import com.p280ss.android.ugc.aweme.utils.C43086eb;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.SimilarMusicCoverAdapter */
public final class SimilarMusicCoverAdapter extends BaseAdapter<SimilarMusicInfo> {

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.SimilarMusicCoverAdapter$ViewHolder */
    public final class ViewHolder extends C1293v {

        /* renamed from: a */
        public final SmartImageView f88067a;

        /* renamed from: b */
        final /* synthetic */ SimilarMusicCoverAdapter f88068b;

        public ViewHolder(SimilarMusicCoverAdapter similarMusicCoverAdapter, View view) {
            C7573i.m23587b(view, "itemView");
            this.f88068b = similarMusicCoverAdapter;
            super(view);
            View findViewById = view.findViewById(R.id.bc_);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_similar_music_cover)");
            this.f88067a = (SmartImageView) findViewById;
        }

        /* renamed from: a */
        public final void mo86159a(List<SimilarMusicInfo> list, int i) {
            UrlModel urlModel;
            C7573i.m23587b(list, "items");
            SimilarMusicInfo similarMusicInfo = (SimilarMusicInfo) list.get(i);
            if (similarMusicInfo != null) {
                urlModel = similarMusicInfo.getThumbnail();
            } else {
                urlModel = null;
            }
            if (urlModel != null) {
                C12133n.m35299a(C23400r.m76741a(similarMusicInfo.getThumbnail())).mo29853b(C43086eb.f111705c.mo104750a((View) this.f88067a)).mo29845a("similar_muisc_cover").mo29844a((C12128i) this.f88067a).mo29848a();
            } else {
                this.f88067a.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar instanceof ViewHolder) {
            ViewHolder viewHolder = (ViewHolder) vVar;
            List a = mo62312a();
            C7573i.m23582a((Object) a, "data");
            viewHolder.mo86159a(a, i);
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.a37, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new ViewHolder(this, inflate);
    }
}
