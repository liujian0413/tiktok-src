package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.arch.C23073b;
import com.p280ss.android.ugc.aweme.arch.C23074c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23843a;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.view.BaseMusicListView;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23962g;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23969n.C23971a;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y.C34026a;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.CollectMusicFragment */
public class CollectMusicFragment extends BaseMusicListFragment implements C23843a<Music>, C6905a, C25766a {

    /* renamed from: l */
    public C23844b f63088l;

    /* renamed from: m */
    private C23819a f63089m;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo61917a(Object obj, int i) {
    }

    /* renamed from: b */
    public final String mo60114b() {
        return "user_collected_music_list";
    }

    /* renamed from: c */
    public final String mo60115c() {
        return "refresh_status_user_collected_music";
    }

    /* renamed from: d */
    public final String mo60116d() {
        return "loadmore_status_user_collected_music";
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo62004n() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final String mo62005o() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo62007p() {
        return R.layout.p7;
    }

    /* renamed from: s */
    public final void mo61919s() {
    }

    /* renamed from: a */
    public final void mo60113a() {
        super.mo60113a();
        this.f63049h.mo61948d(0, 20);
    }

    /* renamed from: j */
    public final View mo61750j() {
        if (this.f63051j == null) {
            return null;
        }
        return ((BaseMusicListView) this.f63051j).mRecyclerView;
    }

    /* renamed from: q */
    public final MusicAdapter mo62003m() {
        if (this.f63051j != null) {
            return (MusicAdapter) this.f63051j.mo60125d();
        }
        return null;
    }

    /* renamed from: r */
    public final void mo61918r() {
        if (this.f63049h != null) {
            this.f63049h.mo61948d(0, 20);
        }
    }

    /* renamed from: e */
    public final DataCenter mo60117e() {
        this.f63050i = super.mo60117e();
        this.f63050i.mo60132a("music_collect_status", (C0053p<C23083a>) this).mo60132a("music_index", (C0053p<C23083a>) this);
        return this.f63050i;
    }

    public final void bd_() {
        if (this.f63049h != null && this.f63050i != null) {
            C23073b bVar = (C23073b) this.f63050i.mo60135a(mo60114b());
            if ((this.f63051j instanceof BaseMusicListView) && ((BaseMusicListView) this.f63051j).f63262e) {
                if (this.f63051j != null) {
                    this.f63051j.mo60120a();
                }
                this.f63049h.mo61950e(((Integer) bVar.mo60119a("list_cursor")).intValue(), 20);
            }
        }
    }

    /* renamed from: t */
    private void m78284t() {
        if (mo61750j() instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) mo61750j();
            if (recyclerView != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int l = linearLayoutManager.mo5447l();
                BaseAdapter d = this.f63051j.mo60125d();
                if (d != null) {
                    List a = d.mo62312a();
                    if (!C6307b.m19566a((Collection<T>) a)) {
                        for (int j = linearLayoutManager.mo5445j(); j < l; j++) {
                            if (j >= 0 && j < a.size()) {
                                MusicModel musicModel = (MusicModel) a.get(j);
                                if (musicModel != null) {
                                    C23888c.m78185a(this.f63089m, musicModel.getMusicId(), j, true);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @C7709l
    public void onEvent(C33769d dVar) {
        if (this.f63050i != null && dVar != null) {
            C23820a aVar = new C23820a(0, dVar.f88124a, -1, -1, dVar.f88125b);
            this.f63050i.mo60134a("music_collect_status", (Object) aVar);
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            m78284t();
        }
        if (this.f63051j instanceof C23962g) {
            ((C23962g) this.f63051j).mo62167a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23074c mo61998b(View view) {
        C23962g gVar = new C23962g(getContext(), view, this, this, this, this.f63052k);
        gVar.mo62166a((C23844b) new C23844b() {
            /* renamed from: a */
            public final void mo61920a(C34026a aVar) {
                if (CollectMusicFragment.this.f63088l != null) {
                    CollectMusicFragment.this.f63088l.mo61920a(aVar);
                }
            }

            /* renamed from: b */
            public final void mo61923b(MusicModel musicModel) {
                if (CollectMusicFragment.this.f63088l != null) {
                    CollectMusicFragment.this.f63088l.mo61923b(musicModel);
                }
            }

            /* renamed from: a */
            public final void mo61921a(MusicModel musicModel) {
                if (CollectMusicFragment.this.f63088l != null) {
                    CollectMusicFragment.this.f63088l.mo61921a(musicModel);
                }
            }

            /* renamed from: a */
            public final void mo61922a(MusicModel musicModel, C23819a aVar) {
                if (CollectMusicFragment.this.f63088l != null) {
                    CollectMusicFragment.this.f63088l.mo61922a(musicModel, aVar);
                }
                if (((Integer) CollectMusicFragment.this.f63050i.mo60136b("music_position", Integer.valueOf(-1))).intValue() == -2) {
                    CollectMusicFragment.this.f63050i.mo60134a("music_position", (Object) Integer.valueOf(-1));
                    CollectMusicFragment.this.f63050i.mo60134a("music_index", (Object) Integer.valueOf(-1));
                }
            }
        });
        this.f63089m = new C23819a("change_music_page", "favorite_song", "", C23888c.m78180a());
        gVar.mo62165a(this.f63089m);
        gVar.mo62167a(false);
        gVar.mo62112a((C23971a) new C23930f(this), 10);
        return gVar;
    }

    /* renamed from: c */
    private void m78282c(MusicModel musicModel) {
        if (this.f63051j != null && this.f63051j.mo60125d() != null) {
            List a = this.f63051j.mo60125d().mo62312a();
            if (a == null) {
                a = new ArrayList();
            }
            int i = 0;
            while (i < a.size()) {
                if (!musicModel.getMusicId().equals(((MusicModel) a.get(i)).getMusicId())) {
                    i++;
                } else {
                    return;
                }
            }
            if (a.size() == 0) {
                a.add(musicModel);
                this.f63051j.mo60121a(a, false);
                return;
            }
            a.add(0, musicModel);
            this.f63051j.mo60125d().notifyItemInserted(0);
            if ((this.f63051j instanceof BaseMusicListView) && ((BaseMusicListView) this.f63051j).mRecyclerView != null) {
                ((BaseMusicListView) this.f63051j).mRecyclerView.mo5541b(0);
            }
        }
    }

    /* renamed from: d */
    private void m78283d(MusicModel musicModel) {
        if (this.f63051j != null && this.f63051j.mo60125d() != null && this.f63051j.mo60125d().mo62312a() != null) {
            List a = this.f63051j.mo60125d().mo62312a();
            for (int i = 0; i < a.size(); i++) {
                if (musicModel.getMusicId().equals(((MusicModel) a.get(i)).getMusicId())) {
                    a.remove(i);
                    this.f63051j.mo60125d().notifyItemRemoved(i);
                    if (a.size() == 0) {
                        this.f63051j.mo60124c();
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61993a(com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a r6) {
        /*
            r5 = this;
            super.onChanged(r6)
            boolean r0 = r5.isViewValid()
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r0 = r6.f60948a
            int r1 = r0.hashCode()
            r2 = -1635157503(0xffffffff9e897a01, float:-1.4555899E-20)
            r3 = 1
            r4 = -1
            if (r1 == r2) goto L_0x0027
            r2 = 1579846200(0x5e2a8a38, float:3.07217403E18)
            if (r1 == r2) goto L_0x001d
            goto L_0x0031
        L_0x001d:
            java.lang.String r1 = "music_index"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0031
            r0 = 0
            goto L_0x0032
        L_0x0027:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = -1
        L_0x0032:
            switch(r0) {
                case 0: goto L_0x0050;
                case 1: goto L_0x0036;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x006d
        L_0x0036:
            java.lang.Object r6 = r6.mo60161a()
            com.ss.android.ugc.aweme.choosemusic.a.a r6 = (com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a) r6
            int r0 = r6.f62878a
            if (r0 != 0) goto L_0x006d
            int r0 = r6.f62881d
            if (r0 != r3) goto L_0x004a
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r6 = r6.f62882e
            r5.m78282c(r6)
            return
        L_0x004a:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r6 = r6.f62882e
            r5.m78283d(r6)
            goto L_0x006d
        L_0x0050:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r6 = r5.f63050i
            java.lang.String r0 = "music_position"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r6.mo60136b(r0, r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0 = -2
            if (r6 != r0) goto L_0x006d
            com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter r6 = r5.mo62003m()
            r6.al_()
            return
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.choosemusic.fragment.CollectMusicFragment.mo61993a(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62029a(int i, int i2) {
        bd_();
    }

    /* renamed from: a */
    public static CollectMusicFragment m78281a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("challenge", str);
        }
        CollectMusicFragment collectMusicFragment = new CollectMusicFragment();
        collectMusicFragment.setArguments(bundle);
        return collectMusicFragment;
    }
}
