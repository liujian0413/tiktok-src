package com.p280ss.android.ugc.aweme.following.model;

import android.os.Message;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.following.api.C29563a;
import com.p280ss.android.ugc.aweme.following.api.FollowerApi;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1192e.C27325a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.following.model.b */
public class C29565b extends C25673a<User, C29567c> {

    /* renamed from: c */
    private static final String f77895c = "b";

    /* renamed from: a */
    public C29567c f77896a;

    /* renamed from: b */
    public FollowerApi f77897b = ((FollowerApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(FollowerApi.class));

    /* renamed from: d */
    private String f77898d;

    /* renamed from: e */
    private String f77899e;

    /* renamed from: f */
    private int f77900f;

    /* renamed from: g */
    private C29571f f77901g;

    /* renamed from: h */
    private boolean f77902h = true;

    /* renamed from: i */
    private C29572g f77903i;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public /* bridge */ /* synthetic */ Object getData() {
        return this.f77896a;
    }

    public List<User> getItems() {
        if (this.f77896a == null) {
            return null;
        }
        return this.f77896a.f77906a;
    }

    public boolean isHasMore() {
        if (this.f77896a == null || !this.f77896a.f77908c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m97113a(final C29563a aVar) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return C29565b.this.f77897b.fetchFollowingList(aVar.f77881a, aVar.f77882b, aVar.f77884d, aVar.f77883c, aVar.f77886f, aVar.f77887g, aVar.f77889i, aVar.f77890j).get();
            }
        }, 0);
    }

    public void loadMoreList(Object... objArr) {
        long j;
        this.f77901g = new C29571f();
        this.f77901g.f77939b++;
        this.f77903i = null;
        C29563a a = m97112a(false);
        if (this.f77896a == null) {
            j = 0;
        } else {
            j = this.f77896a.f77910e;
        }
        a.f77884d = j;
        m97113a(a);
    }

    public void refreshList(Object... objArr) {
        this.f77900f = 0;
        this.f77902h = true;
        this.f77903i = new C29572g();
        this.f77903i.f77942b++;
        this.f77901g = null;
        C29563a a = m97112a(true);
        a.f77884d = 0;
        m97113a(a);
    }

    /* renamed from: a */
    private C29563a m97112a(boolean z) {
        int i;
        C29563a aVar = new C29563a();
        aVar.f77883c = 20;
        aVar.f77881a = this.f77898d;
        aVar.f77882b = this.f77899e;
        int i2 = 2;
        if (!C6399b.m19944t()) {
            aVar.f77886f = this.f77900f;
            if (!C7213d.m22500a().mo18786ay()) {
                i2 = 1;
            }
            aVar.f77887g = i2;
            if (C7213d.m22500a().mo18786ay() && !this.f77902h) {
                aVar.f77887g = 1;
            }
        } else {
            if ((!z || !C7213d.m22500a().mo18786ay()) && (z || !this.f77902h)) {
                i2 = 1;
            }
            aVar.f77887g = i2;
            if (z) {
                i = 0;
            } else {
                i = this.f77900f;
            }
            aVar.f77886f = i;
        }
        aVar.f77889i = C43161e.m136882a();
        aVar.f77890j = C43161e.m136884b();
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C29567c cVar) {
        boolean z;
        boolean z2;
        super.handleData(cVar);
        boolean z3 = false;
        if (cVar == null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            this.f77900f = cVar.f77912g;
            this.f77902h = cVar.f77913h;
            int i = this.mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    int size = this.f77896a.f77906a.size();
                    C27325a.m89576b(this.f77896a.f77906a, cVar.f77906a);
                    int size2 = this.f77896a.f77906a.size() - size;
                    if (this.f77901g != null) {
                        this.f77901g.f77938a += size2;
                        C29571f fVar = this.f77901g;
                        if (!cVar.f77908c || !this.f77896a.f77908c) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        fVar.f77940c = z2;
                    }
                    this.f77896a.f77909d = cVar.f77909d;
                    this.f77896a.f77910e = cVar.f77910e;
                    C29567c cVar2 = this.f77896a;
                    if (cVar.f77908c && this.f77896a.f77908c) {
                        z3 = true;
                    }
                    cVar2.f77908c = z3;
                }
            } else if (this.f77903i == null || this.f77903i.f77942b <= 1 || this.f77896a == null) {
                this.f77896a = cVar;
            } else {
                int size3 = this.f77896a.f77906a.size();
                C27325a.m89576b(this.f77896a.f77906a, cVar.f77906a);
                int size4 = this.f77896a.f77906a.size() - size3;
                this.f77903i.f77941a += size4;
                this.f77903i.f77943c = cVar.f77908c;
                this.f77896a.f77909d = cVar.f77909d;
                this.f77896a.f77910e = cVar.f77910e;
                C29567c cVar3 = this.f77896a;
                if (cVar.f77908c && this.f77896a.f77908c) {
                    z3 = true;
                }
                cVar3.f77908c = z3;
            }
        } else {
            if (this.f77896a != null) {
                this.f77896a.f77908c = false;
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
            this.f77901g = null;
            this.f77903i = null;
            return;
        }
        handleData((C29567c) message.obj);
        if (C7213d.m22500a().mo18786ay() && !C6399b.m19944t()) {
            long j = 0;
            if (this.mListQueryType == 4) {
                if (this.f77901g != null && this.f77901g.f77940c && this.f77901g.f77938a < 5 && this.f77901g.f77939b < 3) {
                    this.f77901g.f77939b++;
                    C29563a a2 = m97112a(false);
                    if (this.f77896a != null) {
                        j = this.f77896a.f77910e;
                    }
                    a2.f77884d = j;
                    m97113a(a2);
                    return;
                }
            } else if (this.mListQueryType == 1 && this.f77903i != null && this.f77903i.f77943c && this.f77903i.f77942b < 2 && this.f77903i.f77941a < 15) {
                this.f77903i.f77942b++;
                C29563a a3 = m97112a(false);
                if (this.f77896a != null) {
                    j = this.f77896a.f77910e;
                }
                a3.f77884d = j;
                m97113a(a3);
                return;
            }
        }
        this.f77901g = null;
        this.f77903i = null;
        if (this.mNotifyListeners != null) {
            for (C25678f b : this.mNotifyListeners) {
                b.mo56977b();
            }
        }
    }

    public C29565b(String str, String str2) {
        this.f77898d = str;
        this.f77899e = str2;
    }
}
