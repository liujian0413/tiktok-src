package com.p280ss.android.ugc.aweme.music.presenter;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.music.api.MusicApi;
import com.p280ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.m */
public final class C33815m extends C25673a<Music, CollectedMusicList> {
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((CollectedMusicList) this.mData).items;
    }

    public C33815m() {
        CollectedMusicList collectedMusicList = new CollectedMusicList();
        collectedMusicList.items = new ArrayList();
        collectedMusicList.setHasMore(true);
        this.mData = collectedMusicList;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((CollectedMusicList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m108993a(0, 12);
    }

    public final void loadMoreList(Object... objArr) {
        m108993a(((CollectedMusicList) this.mData).cursor, 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(CollectedMusicList collectedMusicList) {
        boolean z;
        boolean z2 = false;
        if (collectedMusicList == null || C6307b.m19566a((Collection<T>) collectedMusicList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = collectedMusicList;
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = collectedMusicList;
                    return;
                }
                ((CollectedMusicList) this.mData).items.addAll(m108992a(collectedMusicList.items, ((CollectedMusicList) this.mData).items));
                ((CollectedMusicList) this.mData).cursor = collectedMusicList.cursor;
                CollectedMusicList collectedMusicList2 = (CollectedMusicList) this.mData;
                if (collectedMusicList.isHasMore() && ((CollectedMusicList) this.mData).isHasMore()) {
                    z2 = true;
                }
                collectedMusicList2.setHasMore(z2);
            }
        } else {
            if (this.mData != null) {
                ((CollectedMusicList) this.mData).setHasMore(false);
            }
        }
    }

    /* renamed from: a */
    private void m108993a(final int i, final int i2) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return MusicApi.m108884a(i, i2);
            }
        }, 0);
    }

    /* renamed from: a */
    private static List<Music> m108992a(List<Music> list, List<Music> list2) {
        ArrayList arrayList = new ArrayList();
        for (Music music : list) {
            arrayList.add(music);
            for (Music mid : list2) {
                if (music.getMid().equals(mid.getMid())) {
                    arrayList.remove(music);
                }
            }
        }
        return arrayList;
    }
}
