package com.p280ss.android.ugc.aweme.following.model;

import android.os.Message;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.following.api.C29563a;
import com.p280ss.android.ugc.aweme.following.api.FollowingApi;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1192e.C27325a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.following.model.d */
public class C29568d extends C25673a<User, C29570e> {

    /* renamed from: b */
    private static final String f77919b = "d";

    /* renamed from: a */
    public FollowingApi f77920a = ((FollowingApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(FollowingApi.class));

    /* renamed from: c */
    private C29570e f77921c;

    /* renamed from: d */
    private String f77922d;

    /* renamed from: e */
    private String f77923e;

    /* renamed from: f */
    private int f77924f;

    /* renamed from: g */
    private boolean f77925g;

    /* renamed from: h */
    private C29571f f77926h;

    /* renamed from: i */
    private boolean f77927i = true;

    /* renamed from: j */
    private C29572g f77928j;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public List<User> getItems() {
        if (this.f77921c == null) {
            return null;
        }
        return this.f77921c.f77931a;
    }

    public boolean isHasMore() {
        if (this.f77921c == null || !this.f77921c.f77933c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m97118a() {
        if (this.f77925g || C6399b.m19944t()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m97116a(final C29563a aVar) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return C29568d.this.f77920a.fetchFollowingList(aVar.f77881a, aVar.f77882b, aVar.f77884d, aVar.f77883c, aVar.f77886f, aVar.f77887g, aVar.f77889i, aVar.f77890j).get();
            }
        }, 0);
    }

    /* renamed from: b */
    private int m97119b(boolean z) {
        if (this.f77925g) {
            return C7213d.m22500a().mo18726T();
        }
        if (z) {
            if (C7213d.m22500a().mo18786ay()) {
                return 2;
            }
            return 1;
        } else if (this.f77927i) {
            return 2;
        } else {
            return 1;
        }
    }

    public void loadMoreList(Object... objArr) {
        long j;
        this.f77926h = new C29571f();
        this.f77926h.f77939b++;
        this.f77928j = null;
        C29563a a = m97115a(false);
        if (this.f77921c == null) {
            j = 0;
        } else {
            j = this.f77921c.f77935e;
        }
        a.f77884d = j;
        m97116a(a);
    }

    public void refreshList(Object... objArr) {
        this.f77924f = 0;
        this.f77927i = true;
        this.f77928j = new C29572g();
        this.f77928j.f77942b++;
        this.f77926h = null;
        C29563a a = m97115a(true);
        a.f77884d = 0;
        m97116a(a);
    }

    /* renamed from: a */
    private C29563a m97115a(boolean z) {
        int i;
        int i2;
        C29563a aVar = new C29563a();
        aVar.f77883c = 20;
        aVar.f77881a = this.f77922d;
        aVar.f77882b = this.f77923e;
        aVar.f77885e = this.f77925g;
        if (!z || !C6399b.m19944t()) {
            i = this.f77924f;
        } else {
            i = 0;
        }
        aVar.f77886f = i;
        if (!m97118a()) {
            aVar.f77887g = m97119b(z);
        } else {
            if (C7213d.m22500a().mo18786ay()) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            aVar.f77887g = i2;
            if (C7213d.m22500a().mo18786ay() && !this.f77927i) {
                aVar.f77887g = 1;
            }
        }
        aVar.f77889i = C43161e.m136882a();
        aVar.f77890j = C43161e.m136884b();
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C29570e eVar) {
        boolean z;
        boolean z2;
        super.handleData(eVar);
        boolean z3 = false;
        if (eVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            this.f77924f = eVar.f77936f;
            this.f77927i = eVar.f77937g;
            int i = this.mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    int size = this.f77921c.f77931a.size();
                    C27325a.m89576b(this.f77921c.f77931a, eVar.f77931a);
                    int size2 = this.f77921c.f77931a.size() - size;
                    if (this.f77926h != null) {
                        this.f77926h.f77938a += size2;
                        C29571f fVar = this.f77926h;
                        if (!eVar.f77933c || !this.f77921c.f77933c) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        fVar.f77940c = z2;
                    }
                    this.f77921c.f77934d = eVar.f77934d;
                    this.f77921c.f77935e = eVar.f77935e;
                    C29570e eVar2 = this.f77921c;
                    if (eVar.f77933c && this.f77921c.f77933c) {
                        z3 = true;
                    }
                    eVar2.f77933c = z3;
                }
            } else if (this.f77928j == null || this.f77928j.f77942b <= 1 || this.f77921c == null) {
                this.f77921c = eVar;
            } else {
                int size3 = this.f77921c.f77931a.size();
                C27325a.m89576b(this.f77921c.f77931a, eVar.f77931a);
                int size4 = this.f77921c.f77931a.size() - size3;
                this.f77928j.f77941a += size4;
                this.f77928j.f77943c = eVar.f77933c;
                this.f77921c.f77934d = eVar.f77934d;
                this.f77921c.f77935e = eVar.f77935e;
                C29570e eVar3 = this.f77921c;
                if (eVar.f77933c && this.f77921c.f77933c) {
                    z3 = true;
                }
                eVar3.f77933c = z3;
            }
        } else {
            if (this.f77921c != null) {
                this.f77921c.f77933c = false;
            }
        }
    }

    public void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            if (this.mNotifyListeners != null) {
                for (C25678f a : this.mNotifyListeners) {
                    a.mo57296a((Exception) message.obj);
                }
            }
            this.f77926h = null;
            this.f77928j = null;
            return;
        }
        handleData((C29570e) message.obj);
        if (m97118a() && C7213d.m22500a().mo18786ay()) {
            long j = 0;
            if (this.mListQueryType == 4) {
                if (this.f77926h != null && this.f77926h.f77940c && this.f77926h.f77938a < 5 && this.f77926h.f77939b < 3) {
                    this.f77926h.f77939b++;
                    C29563a a2 = m97115a(false);
                    if (this.f77921c != null) {
                        j = this.f77921c.f77935e;
                    }
                    a2.f77884d = j;
                    m97116a(a2);
                    return;
                }
            } else if (this.mListQueryType == 1 && this.f77928j != null && this.f77928j.f77943c && this.f77928j.f77942b < 2 && this.f77928j.f77941a < 15) {
                this.f77928j.f77942b++;
                C29563a a3 = m97115a(false);
                if (this.f77921c != null) {
                    j = this.f77921c.f77935e;
                }
                a3.f77884d = j;
                m97116a(a3);
                return;
            }
        }
        this.f77926h = null;
        this.f77928j = null;
        if (this.mNotifyListeners != null) {
            for (C25678f b : this.mNotifyListeners) {
                b.mo56977b();
            }
        }
    }

    public C29568d(String str, String str2, boolean z) {
        this.f77922d = str;
        this.f77923e = str2;
        this.f77925g = z;
    }
}
