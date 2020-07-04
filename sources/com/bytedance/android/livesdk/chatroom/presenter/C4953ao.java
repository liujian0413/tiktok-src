package com.bytedance.android.livesdk.chatroom.presenter;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.base.model.C2341d;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.FansClubApi;
import com.bytedance.android.livesdk.chatroom.model.C4910i;
import com.bytedance.android.livesdk.chatroom.model.C4910i.C4911a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.user.C8976b.C8977a;
import com.bytedance.android.livesdk.user.C8976b.C8978b;
import com.bytedance.android.livesdk.user.C8985f;
import com.bytedance.android.livesdk.user.C8991j.C8993b;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdk.utils.p426b.C9058c;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.bytedance.ies.p533a.C10290a;
import com.bytedance.ies.p533a.C10291b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ao */
public final class C4953ao extends C10291b<C4955b> implements C9302a {

    /* renamed from: a */
    public C4954a f14159a;

    /* renamed from: b */
    private C7321c f14160b;

    /* renamed from: c */
    private Handler f14161c = new C9301a(this);

    /* renamed from: d */
    private boolean f14162d;

    /* renamed from: e */
    private boolean f14163e;

    /* renamed from: f */
    private List<C2341d> f14164f = new ArrayList();

    /* renamed from: g */
    private int f14165g = 0;

    /* renamed from: h */
    private int f14166h = 20;

    /* renamed from: i */
    private boolean f14167i;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ao$a */
    public interface C4954a {
        /* renamed from: a */
        void mo12951a(FollowPair followPair);

        /* renamed from: a */
        void mo12952a(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ao$b */
    public interface C4955b extends C10290a {
        /* renamed from: a */
        void mo12953a();

        /* renamed from: a */
        void mo12954a(IUser iUser);

        /* renamed from: a */
        void mo12955a(Throwable th);

        /* renamed from: a */
        void mo12956a(List<C2341d> list);

        /* renamed from: b */
        void mo12957b(Throwable th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo12949e() throws Exception {
        this.f14167i = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo12950f() throws Exception {
        this.f14163e = false;
    }

    /* renamed from: a */
    public final void mo12941a(HashMap<String, String> hashMap) {
        if (!this.f14162d) {
            TTLiveSDKContext.getHostService().mo22367h().mo22166a(hashMap).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C4956ap<Object>(this), (C7326g<? super Throwable>) new C4957aq<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12942a(List list) throws Exception {
        this.f14164f.addAll(list);
        if (mo9140c() != null) {
            ((C4955b) mo9140c()).mo12956a(this.f14164f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12940a(Throwable th) throws Exception {
        if (this.f14159a != null) {
            this.f14159a.mo12952a(th);
        }
    }

    /* renamed from: d */
    public final void mo12947d() {
        if (mo9140c() != null) {
            ((C4955b) mo9140c()).mo12953a();
        }
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        if (this.f14160b != null && !this.f14160b.isDisposed()) {
            this.f14160b.dispose();
        }
    }

    /* renamed from: b */
    public final void mo12943b() {
        if (!this.f14163e) {
            this.f14163e = true;
            this.f14160b = ((C9057b) ((FansClubApi) C9178j.m27302j().mo22373b().mo10440a(FansClubApi.class)).get(this.f14165g, this.f14166h).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22249a(3).mo19294a(C47549a.m148327a()).mo19304b(C7333a.m23044b()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19281a((C7326g<? super T>) new C4962av<Object>(this), (C7326g<? super Throwable>) new C4963aw<Object>(this), (C7323a) new C4964ax(this));
        }
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m15949b(C4911a aVar) throws Exception {
        if (aVar.f14040b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12935a(User user) throws Exception {
        if (mo9140c() != null) {
            ((C4955b) mo9140c()).mo12954a((IUser) user);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12944b(FollowPair followPair) throws Exception {
        this.f14167i = false;
        if (this.f14159a != null) {
            this.f14159a.mo12951a(followPair);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12945b(Throwable th) throws Exception {
        this.f14167i = false;
        if (this.f14159a != null) {
            this.f14159a.mo12952a(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12946c(Throwable th) throws Exception {
        this.f14163e = false;
        if (mo9140c() != null) {
            ((C4955b) mo9140c()).mo12957b(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo12948d(Throwable th) throws Exception {
        if (mo9140c() != null) {
            ((C4955b) mo9140c()).mo12955a(th);
        }
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 100) {
                mo12943b();
            }
            return;
        }
        this.f14162d = false;
        if (mo9140c() != null) {
            if (message.obj instanceof Exception) {
                ((C4955b) mo9140c()).mo12955a((Throwable) (Exception) message.obj);
            } else if (message.obj instanceof User) {
                ((C4955b) mo9140c()).mo12954a((IUser) (User) message.obj);
            } else {
                ((C4955b) mo9140c()).mo12955a((Throwable) new Exception("unknown msg.what"));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12936a(C3479d dVar) throws Exception {
        if (dVar != null && dVar.data != null && ((C4910i) dVar.data).f14038b != null) {
            List<C4911a> list = ((C4910i) dVar.data).f14038b;
            if (list.size() > 0) {
                C7492s.m23300b((Iterable<? extends T>) list).mo19291a(C4958ar.f14170a).mo19317d(C4959as.f14171a).mo19334m().mo19127a(C47549a.m148327a()).mo19135b(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C4960at<Object>(this), C4961au.f14173a);
                if (((C4910i) dVar.data).f14037a) {
                    this.f14165g += this.f14166h;
                    Message message = new Message();
                    message.what = 100;
                    this.f14161c.sendMessageDelayed(message, 1000);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9142a(C4955b bVar) {
        super.mo9142a(bVar);
        this.f14164f.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12938a(FollowPair followPair) throws Exception {
        if (this.f14159a != null) {
            this.f14159a.mo12951a(followPair);
        }
    }

    /* renamed from: a */
    public final void mo12934a(Activity activity, int i, long j, String str, long j2) {
        TTLiveSDKContext.getHostService().mo22367h().mo22170a(((C8993b) ((C8993b) ((C8993b) ((C8993b) ((C8993b) C8985f.m26863c().mo22196a(activity)).mo22153a(j)).mo22195a(i)).mo22197a(str)).mo22199b(j2)).mo22200c()).mo19280a((C7326g<? super T>) new C4971bb<Object>(this), (C7326g<? super Throwable>) new C4972bc<Object>(this));
    }

    /* renamed from: a */
    public final void mo12939a(String str, long j, String str2, long j2, String str3) {
        if (!this.f14167i) {
            this.f14167i = true;
            TTLiveSDKContext.getHostService().mo22367h().mo22168a(((C8978b) ((C8978b) ((C8978b) ((C8978b) ((C8978b) ((C8977a) C8985f.m26861a().mo22153a(j)).mo22154a(str)).mo22157b("live_detail")).mo22158c(str2)).mo22156b(j2)).mo22159d(str3)).mo22160c()).mo19281a((C7326g<? super T>) new C4965ay<Object>(this), (C7326g<? super Throwable>) new C4966az<Object>(this), (C7323a) new C4970ba(this));
        }
    }
}
