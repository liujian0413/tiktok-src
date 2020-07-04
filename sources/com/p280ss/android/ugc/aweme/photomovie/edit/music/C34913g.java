package com.p280ss.android.ugc.aweme.photomovie.edit.music;

import android.content.Context;
import com.google.common.collect.C17795bu;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.presenter.C40216d;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41653c;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.g */
public final class C34913g implements C40216d {

    /* renamed from: a */
    private C34907a f91064a = new C34907a();

    /* renamed from: b */
    private C41654d f91065b;

    /* renamed from: c */
    private C27311c f91066c;

    /* renamed from: d */
    private Context f91067d;

    /* renamed from: a */
    public final void mo88459a() {
        this.f91065b = C41653c.m132582a(this.f91067d, this.f91067d.getResources().getString(R.string.ea5));
        this.f91065b.setIndeterminate(true);
        this.f91064a.mo56976a(new Object[0]);
    }

    /* renamed from: a */
    static final /* synthetic */ MusicModel m112518a(Music music) {
        if (music != null) {
            return music.convertToMusicModel();
        }
        return null;
    }

    public C34913g(Context context, C27311c cVar) {
        this.f91066c = cVar;
        this.f91067d = context;
        this.f91064a.mo66536a(new MusicListModel());
        this.f91064a.mo66537a(this);
    }

    /* renamed from: a */
    public final void mo83270a(MusicList musicList, String str) {
        this.f91065b.hide();
        ArrayList arrayList = new ArrayList();
        if (!(musicList == null || this.f91066c.f72034c == null)) {
            arrayList.addAll(musicList.musicList);
        }
        List a = C17795bu.m59147a((List<F>) arrayList, C34914h.f91068a);
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null) {
            iAVService.photoMovieService().startEditDraftActivity(this.f91067d, this.f91066c, a);
        }
    }

    /* renamed from: a */
    public final void mo83271a(Exception exc, String str) {
        this.f91065b.hide();
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null) {
            iAVService.photoMovieService().startEditDraftActivity(this.f91067d, this.f91066c, new ArrayList());
        }
    }
}
