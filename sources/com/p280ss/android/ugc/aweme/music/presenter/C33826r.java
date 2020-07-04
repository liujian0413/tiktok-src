package com.p280ss.android.ugc.aweme.music.presenter;

import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.music.api.MusicApi;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.MusicList;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.r */
public final class C33826r implements C6310a {

    /* renamed from: a */
    protected C6309f f88208a;

    /* renamed from: b */
    public int f88209b;

    /* renamed from: c */
    public boolean f88210c = true;

    /* renamed from: d */
    private C33803e f88211d;

    /* renamed from: e */
    private MusicList f88212e;

    /* renamed from: f */
    private boolean f88213f;

    public C33826r(C33803e eVar) {
        this.f88211d = eVar;
        this.f88212e = new MusicList();
        this.f88212e.items = new ArrayList();
        this.f88208a = new C6309f(this);
    }

    /* renamed from: a */
    public final void mo86432a(final String str) {
        if (!this.f88213f) {
            this.f88213f = true;
            C23397p.m76735a().mo60807a(this.f88208a, new Callable() {
                public final Object call() throws Exception {
                    return MusicApi.m108886a(str, C33826r.this.f88209b, 16);
                }
            }, 1010);
        }
    }

    public final void handleMsg(Message message) {
        this.f88213f = false;
        if (message.what == 1010) {
            if (message.obj instanceof Exception) {
                this.f88211d.mo86421a(null);
                return;
            }
            MusicList musicList = (MusicList) message.obj;
            if (musicList != null) {
                this.f88210c &= musicList.isHasMore();
                if (!this.f88210c) {
                    this.f88211d.mo86420a();
                }
                this.f88209b = musicList.getCursor();
                if (musicList.items != null) {
                    for (Music add : musicList.items) {
                        this.f88212e.items.add(add);
                    }
                }
                if (musicList.mcInfo != null) {
                    this.f88212e.mcInfo = musicList.mcInfo;
                }
                this.f88211d.mo86421a(this.f88212e);
            }
        }
    }

    /* renamed from: a */
    public final void mo86433a(final String str, int i, int i2) {
        if (!this.f88213f) {
            this.f88213f = true;
            C23397p.m76735a().mo60807a(this.f88208a, new Callable(0, 30) {
                public final Object call() throws Exception {
                    return MusicApi.m108886a(str, 0, 30);
                }
            }, 1010);
        }
    }
}
