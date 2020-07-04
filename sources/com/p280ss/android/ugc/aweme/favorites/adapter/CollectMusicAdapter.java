package com.p280ss.android.ugc.aweme.favorites.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27747d;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27748e;
import com.p280ss.android.ugc.aweme.favorites.viewholder.MusicCollectViewHolder;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter */
public class CollectMusicAdapter extends BaseAdapter<Music> {

    /* renamed from: a */
    public C27748e f73084a;

    /* renamed from: b */
    public int f73085b = -1;

    /* renamed from: c */
    private RecyclerView f73086c;

    /* renamed from: d */
    private C27747d f73087d = new C27747d() {
        /* JADX WARNING: type inference failed for: r5v19, types: [android.content.Context] */
        /* JADX WARNING: type inference failed for: r5v20, types: [android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo71177a(final android.support.p029v7.widget.RecyclerView.C1293v r4, android.view.View r5, final com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel r6) {
            /*
                r3 = this;
                if (r6 == 0) goto L_0x00c9
                if (r5 == 0) goto L_0x00c9
                android.content.Context r0 = r5.getContext()
                if (r0 != 0) goto L_0x000c
                goto L_0x00c9
            L_0x000c:
                android.content.Context r0 = r5.getContext()
                boolean r0 = com.p280ss.android.ugc.aweme.favorites.adapter.C27732a.m90934a(r0)
                if (r0 != 0) goto L_0x0025
                android.content.Context r4 = r5.getContext()
                r5 = 2131825043(0x7f111193, float:1.928293E38)
                com.bytedance.ies.dmt.ui.c.a r4 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r4, r5)
                r4.mo25750a()
                return
            L_0x0025:
                int r0 = r5.getId()
                r1 = 2131301152(0x7f091320, float:1.8220354E38)
                r2 = 1
                if (r0 != r1) goto L_0x0070
                com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.music.service.IMusicService> r1 = com.p280ss.android.ugc.aweme.music.service.IMusicService.class
                java.lang.Object r0 = r0.getService(r1)
                com.ss.android.ugc.aweme.music.service.IMusicService r0 = (com.p280ss.android.ugc.aweme.music.service.IMusicService) r0
                android.content.Context r5 = r5.getContext()
                boolean r5 = r0.checkValidMusic(r6, r5, r2)
                if (r5 != 0) goto L_0x0046
                return
            L_0x0046:
                android.app.Activity r5 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()
                if (r5 == 0) goto L_0x0053
                boolean r0 = r5.isFinishing()
                if (r0 != 0) goto L_0x0053
                goto L_0x0057
            L_0x0053:
                android.content.Context r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            L_0x0057:
                com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r1 = com.p280ss.android.ugc.aweme.services.IAVServiceProxy.class
                java.lang.Object r0 = r0.getService(r1)
                com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = (com.p280ss.android.ugc.aweme.services.IAVServiceProxy) r0
                com.ss.android.ugc.aweme.port.in.al r0 = r0.getShortVideoPluginService()
                com.ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter$1$1 r1 = new com.ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter$1$1
                r1.<init>(r4, r6)
                r0.mo90366a(r5, r2, r1)
                return
            L_0x0070:
                r5 = 2131299714(0x7f090d82, float:1.8217437E38)
                if (r0 != r5) goto L_0x00c8
                com.ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter r5 = com.p280ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter.this
                int r5 = r5.f73085b
                int r0 = r4.getAdapterPosition()
                if (r5 != r0) goto L_0x008b
                com.ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter r4 = com.p280ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter.this
                com.ss.android.ugc.aweme.favorites.c.e r4 = r4.f73084a
                if (r4 == 0) goto L_0x00ab
                com.ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter r4 = com.p280ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter.this
                r4.mo71176f()
                goto L_0x00ab
            L_0x008b:
                com.ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter r5 = com.p280ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter.this
                com.ss.android.ugc.aweme.favorites.c.e r5 = r5.f73084a
                if (r5 == 0) goto L_0x00ab
                com.ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter r5 = com.p280ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter.this
                r5.mo71176f()
                com.ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter r5 = com.p280ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter.this
                com.ss.android.ugc.aweme.favorites.c.e r5 = r5.f73084a
                r5.mo71227a(r6)
                r5 = r4
                com.ss.android.ugc.aweme.favorites.viewholder.MusicCollectViewHolder r5 = (com.p280ss.android.ugc.aweme.favorites.viewholder.MusicCollectViewHolder) r5
                r5.mo71307a(r2)
                com.ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter r5 = com.p280ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter.this
                int r4 = r4.getAdapterPosition()
                r5.f73085b = r4
            L_0x00ab:
                java.lang.String r4 = "click_music"
                com.ss.android.ugc.aweme.app.g.d r5 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r0 = "enter_from"
                java.lang.String r1 = "collection_music"
                com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r0, r1)
                java.lang.String r0 = "music_id"
                java.lang.String r6 = r6.getMusicId()
                com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r0, r6)
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r5)
            L_0x00c8:
                return
            L_0x00c9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter.C277141.mo71177a(android.support.v7.widget.RecyclerView$v, android.view.View, com.ss.android.ugc.aweme.shortvideo.model.MusicModel):void");
        }
    };

    /* renamed from: f */
    public final void mo71176f() {
        if (this.f73085b != -1) {
            C1293v f = this.f73086c.mo5575f(this.f73085b);
            if (f instanceof MusicCollectViewHolder) {
                ((MusicCollectViewHolder) f).mo71307a(false);
            }
            this.f73085b = -1;
        }
        this.f73084a.mo71229b(null);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f73086c = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f73086c = null;
    }

    public CollectMusicAdapter(C27748e eVar) {
        this.f73084a = eVar;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new MusicCollectViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tu, viewGroup, false), this.f73087d);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        boolean z;
        Music music = (Music) mo62312a().get(i);
        MusicCollectViewHolder musicCollectViewHolder = (MusicCollectViewHolder) vVar;
        if (i == this.f73085b) {
            z = true;
        } else {
            z = false;
        }
        musicCollectViewHolder.mo71306a(music, z);
    }
}
