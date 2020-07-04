package com.p280ss.android.ugc.aweme.music.p1410ui.p1412b;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.OriginalMusicList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.ui.b.a */
public final class C33944a extends C25673a<Music, OriginalMusicList> {
    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((OriginalMusicList) this.mData).musicList;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((OriginalMusicList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m109398a(objArr[1], 0, 10);
    }

    public final void loadMoreList(Object... objArr) {
        m109398a(objArr[1], ((OriginalMusicList) this.mData).cursor, 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(OriginalMusicList originalMusicList) {
        boolean z;
        boolean z2 = false;
        if (originalMusicList == null || C6307b.m19566a((Collection<T>) originalMusicList.musicList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = originalMusicList;
            } else if (i == 4) {
                ((OriginalMusicList) this.mData).musicList.addAll(originalMusicList.musicList);
                ((OriginalMusicList) this.mData).cursor = originalMusicList.cursor;
                OriginalMusicList originalMusicList2 = (OriginalMusicList) this.mData;
                if (originalMusicList.hasMore && ((OriginalMusicList) this.mData).hasMore) {
                    z2 = true;
                }
                originalMusicList2.hasMore = z2;
            }
        } else {
            if (this.mData != null) {
                ((OriginalMusicList) this.mData).hasMore = false;
            }
        }
    }

    /* renamed from: a */
    private void m109398a(final String str, final int i, int i2) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable(10) {
            public final Object call() throws Exception {
                return MusicAwemeApi.m108893a(str, i, 10);
            }
        }, 0);
    }
}
