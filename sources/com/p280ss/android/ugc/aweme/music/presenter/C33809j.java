package com.p280ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.p280ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.j */
public final class C33809j extends C25673a<Aweme, MusicAwemeList> {

    /* renamed from: a */
    private int f88183a;

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((MusicAwemeList) this.mData).items;
    }

    public final boolean isDataEmpty() {
        if ((this.mData == null || !((MusicAwemeList) this.mData).isHasMore()) && C6307b.m19566a((Collection<T>) getItems())) {
            return true;
        }
        return false;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((MusicAwemeList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean deleteItem(Aweme aweme) {
        return C28482e.m93607a(getItems(), aweme, this.mNotifyListeners);
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 3) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m108986a((String) objArr[1], 0, 20, objArr[2].intValue());
    }

    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new MusicAwemeList();
        }
        ((MusicAwemeList) this.mData).hasMore = 1;
        ((MusicAwemeList) this.mData).items = list;
    }

    /* renamed from: a */
    private static void m108985a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, PreloadTask.BYTE_UNIT_NUMBER);
            }
            jSONObject.put("error_stack", stackTraceString);
            jSONObject.put("music_id", str);
        } catch (Exception unused) {
        }
        C6893q.m21447a("music_id_has_space", jSONObject);
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((MusicAwemeList) this.mData).cursor;
        }
        m108986a(str, j, 20, objArr[2].intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(MusicAwemeList musicAwemeList) {
        boolean z;
        C28199ae.m92689a().mo71792a(musicAwemeList.getRequestId(), musicAwemeList.logPb);
        if (musicAwemeList == null || (C6307b.m19566a((Collection<T>) musicAwemeList.items) && !musicAwemeList.isHasMore())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (musicAwemeList.items != null) {
                int size = musicAwemeList.items.size();
                for (int i = 0; i < size; i++) {
                    Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) musicAwemeList.items.get(i));
                    IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                    StringBuilder sb = new StringBuilder();
                    sb.append(updateAweme.getAid());
                    sb.append(this.f88183a + 4000);
                    iRequestIdService.setRequestIdAndIndex(sb.toString(), musicAwemeList.getRequestId(), i);
                    musicAwemeList.items.set(i, updateAweme);
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = musicAwemeList;
            } else if (i2 == 4) {
                if (musicAwemeList.items != null) {
                    if (C6307b.m19566a((Collection<T>) ((MusicAwemeList) this.mData).items)) {
                        ((MusicAwemeList) this.mData).items = musicAwemeList.items;
                    } else {
                        C33800b.m108971a(((MusicAwemeList) this.mData).items, musicAwemeList.items, C33811k.f88189a);
                    }
                }
                ((MusicAwemeList) this.mData).cursor = musicAwemeList.cursor;
                ((MusicAwemeList) this.mData).hasMore = musicAwemeList.hasMore & ((MusicAwemeList) this.mData).hasMore;
            }
        } else {
            if (this.mData == null) {
                this.mData = new MusicAwemeList();
            }
            if (musicAwemeList == null) {
                ((MusicAwemeList) this.mData).hasMore = 0;
                return;
            }
            ((MusicAwemeList) this.mData).cursor = musicAwemeList.cursor;
            ((MusicAwemeList) this.mData).hasMore = musicAwemeList.hasMore;
        }
    }

    /* renamed from: a */
    public final void mo86426a(List<Aweme> list) {
        setItems(new ArrayList(list));
        ((MusicAwemeList) this.mData).cursor = (long) list.size();
    }

    /* renamed from: a */
    private void m108986a(String str, long j, int i, int i2) {
        this.f88183a = i2;
        if (!TextUtils.isEmpty(str) && str.endsWith(" ")) {
            m108985a(str);
        }
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final String str2 = str;
        final long j2 = j;
        final int i3 = i2;
        C338101 r1 = new Callable(20) {
            public final Object call() throws Exception {
                return MusicAwemeApi.m108892a(str2, j2, 20, i3);
            }
        };
        a.mo60807a(fVar, r1, 0);
    }
}
