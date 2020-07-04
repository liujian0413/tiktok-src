package com.p280ss.android.ugc.aweme.music.presenter;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.music.api.MusicApi;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.MusicList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.q */
public final class C33824q extends C25673a<Music, MusicList> {
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((MusicList) this.mData).items;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((MusicList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m109003a(1, 20);
    }

    public final void loadMoreList(Object... objArr) {
        m109003a((long) ((MusicList) this.mData).radioCursor, 20);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(MusicList musicList) {
        boolean z;
        boolean z2 = false;
        if (musicList == null || C6307b.m19566a((Collection<T>) musicList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = musicList;
            } else if (i == 4) {
                ((MusicList) this.mData).items.addAll(musicList.items);
                ((MusicList) this.mData).cursor = musicList.getCursor();
                ((MusicList) this.mData).radioCursor = musicList.radioCursor;
                MusicList musicList2 = (MusicList) this.mData;
                if (musicList.isHasMore() && ((MusicList) this.mData).isHasMore()) {
                    z2 = true;
                }
                musicList2.setHasMore(z2);
            }
        } else {
            if (this.mData != null) {
                ((MusicList) this.mData).setHasMore(false);
            }
        }
    }

    /* renamed from: a */
    private void m109003a(final long j, int i) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable(20) {
            public final Object call() throws Exception {
                return MusicApi.m108885a(j, 20);
            }
        }, 0);
    }
}
