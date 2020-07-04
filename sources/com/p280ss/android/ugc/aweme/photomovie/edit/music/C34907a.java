package com.p280ss.android.ugc.aweme.photomovie.edit.music;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import com.p280ss.android.ugc.aweme.shortvideo.presenter.C40216d;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.a */
public final class C34907a extends C25652b<MusicListModel, C40216d> {
    /* renamed from: b */
    public final void mo56977b() {
        super.mo56977b();
        if (((MusicListModel) this.f67571b).getData() == null) {
            mo57296a(new Exception());
        } else if (C6307b.m19566a((Collection<T>) ((MusicList) ((MusicListModel) this.f67571b).getData()).musicList)) {
            mo57296a(new Exception());
        } else {
            if (this.f67572c != null) {
                ((C40216d) this.f67572c).mo83270a((MusicList) ((MusicListModel) this.f67571b).getData(), "");
            }
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        super.mo57296a(exc);
        if (this.f67572c != null) {
            ((C40216d) this.f67572c).mo83271a(exc, "");
        }
    }
}
