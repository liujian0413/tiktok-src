package com.bytedance.android.livesdk.user;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.C2379k;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.IUser.Status;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p145a.C3144a;
import com.bytedance.android.live.core.p145a.C3147c;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3386f;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.dialog.C3533b;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C4454x;
import com.bytedance.android.livesdk.p406m.C8450a;
import com.bytedance.android.livesdk.p414p.C8749b;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.p439b.C9298a;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.p455c.C9460a;
import com.bytedance.android.livesdkapi.host.p455c.C9461b;
import com.bytedance.android.livesdkapi.p451g.C9409a;
import com.bytedance.common.utility.C6319n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p1869g.C47582b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p351i.C7333a;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.bytedance.android.livesdk.user.l */
public final class C8998l implements C8984e {

    /* renamed from: a */
    public IUser f24614a = new C8990i();

    /* renamed from: b */
    public final C47582b<C2379k> f24615b = C47582b.m148367h();

    /* renamed from: c */
    public C7486b<IUser> f24616c;

    /* renamed from: d */
    private C3144a<Long, IUser> f24617d = new C3147c();

    /* renamed from: e */
    private IHostUser f24618e;

    /* renamed from: f */
    private UserApi f24619f;

    /* renamed from: g */
    private FollowApi f24620g;

    /* renamed from: h */
    private final C7486b<IUser> f24621h = C7486b.m23223a();

    /* renamed from: i */
    private final C7486b<FollowPair> f24622i = C7486b.m23223a();

    /* renamed from: j */
    private C9460a f24623j = new C9460a() {
        /* renamed from: a */
        public final void mo22216a(final IUser iUser) {
            if (C8998l.this.f24616c != null) {
                C8998l.this.f24614a = iUser;
                C8998l.this.mo22185e().mo19137b((C47557ad<? super T>) new C47557ad<IUser>() {
                    public final void onError(Throwable th) {
                    }

                    public final void onSubscribe(C7321c cVar) {
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onSuccess(IUser iUser) {
                        if (C8998l.this.f24616c != null) {
                            C8998l.this.f24616c.onNext(iUser);
                            C8998l.this.f24616c.onComplete();
                            C8998l.this.f24616c = null;
                        }
                        C4454x xVar = new C4454x();
                        xVar.f12917a = true;
                        xVar.f12918b = iUser;
                        C9097a.m27146a().mo22267a((Object) xVar);
                        C8998l.this.f24615b.onNext(new C2379k(Status.Login, iUser));
                        C8998l.this.mo22211b(iUser);
                    }
                });
            }
        }
    };

    /* renamed from: d */
    public final C7329e<C2379k> mo22183d() {
        return this.f24615b;
    }

    /* renamed from: g */
    public final C7492s<FollowPair> mo22187g() {
        return this.f24622i;
    }

    /* renamed from: a */
    public final void mo22174a(IUser iUser) {
        if (iUser != null) {
            this.f24617d.mo9983a(Long.valueOf(iUser.getId()), iUser);
        }
    }

    /* renamed from: a */
    public final boolean mo22178a(LiveInteractFunction liveInteractFunction) {
        return this.f24618e.interceptOperation(liveInteractFunction.getFunc());
    }

    /* renamed from: a */
    public final void mo22175a(FollowPair followPair) {
        IUser iUser = (IUser) this.f24617d.mo9984b(Long.valueOf(followPair.f25593a));
        if (iUser != null) {
            iUser.setFollowStatus(followPair.mo22844a());
        }
        this.f24622i.onNext(followPair);
    }

    /* renamed from: a */
    public final void mo22177a(boolean z) {
        this.f24618e.markAsOutOfDate(true);
    }

    /* renamed from: a */
    public final String mo22172a(long j) {
        IUser iUser = (IUser) this.f24617d.mo9984b(Long.valueOf(j));
        if (iUser != null) {
            return iUser.getSecUid();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo22176a(String str, OnClickListener onClickListener, Context context, String str2, String str3, long j, boolean z) {
        m26898a(str, onClickListener, context, str2, str3, j, false, false, "", "");
    }

    /* renamed from: a */
    public final void mo22173a(int i) {
        this.f24618e.setRoomAttrsAdminFlag(i);
    }

    /* renamed from: a */
    public final C7492s<IUser> mo22167a(Context context, C8987h hVar) {
        if (context.getResources().getConfiguration().orientation == 2) {
            C9097a.m27146a().mo22267a((Object) new C9409a(1, "login"));
        }
        FragmentActivity fragmentActivity = null;
        if (context instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) context;
        } else if (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) contextWrapper.getBaseContext();
            }
        }
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (fragmentActivity2 != null) {
            this.f24618e.login(fragmentActivity2, this.f24623j, hVar.f24590a, hVar.f24591b, hVar.f24592c, hVar.f24593d, hVar.f24594e, hVar.f24595f);
            this.f24616c = C7486b.m23223a();
            return this.f24616c.mo19294a(C47549a.m148327a());
        }
        throw new IllegalArgumentException("Argument \"context\" cannot be transformed to FragmentActivity in UserCenter.login() method. ");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo22208a(User user) throws Exception {
        this.f24621h.onNext(user);
        mo22174a((IUser) user);
    }

    /* renamed from: a */
    public final C7492s<FollowPair> mo22168a(C8976b bVar) {
        return mo22205a(1, bVar.f24567a, bVar.f24575e);
    }

    /* renamed from: a */
    public final C7492s<FollowPair> mo22170a(C8991j jVar) {
        return m26895a((T) jVar);
    }

    /* renamed from: a */
    public final C7492s<FollowPair> mo22169a(C8980d dVar) {
        return mo22205a(1, dVar.f24567a, dVar.f24575e);
    }

    /* renamed from: a */
    public final C7492s<FollowPair> mo22171a(C8994k kVar) {
        return m26895a((T) kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo22210a(IHostUser iHostUser, boolean z) {
        if (z) {
            mo22211b(iHostUser.getCurUser());
            mo22185e().mo19137b((C47557ad<? super T>) new C47557ad<IUser>() {
                public final void onError(Throwable th) {
                }

                public final void onSubscribe(C7321c cVar) {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(IUser iUser) {
                    C8998l.this.mo22211b(iUser);
                }
            });
            return;
        }
        mo22211b((IUser) new C8990i());
        this.f24615b.onNext(new C2379k(Status.Logout, mo22165a()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo22209a(final C8991j jVar, final C8971a aVar, final C47870u uVar) throws Exception {
        this.f24618e.unFollowWithConfirm(jVar.f24604d, jVar.f24602b, jVar.f24567a, new C9461b() {
            /* renamed from: a */
            public final void mo22217a() {
                C8998l.this.mo22205a(0, aVar.f24567a, jVar.f24605e).mo19189a((C7498y<? super T>) new C7498y<FollowPair>() {
                    public final void onSubscribe(C7321c cVar) {
                    }

                    public final void onComplete() {
                        uVar.mo19238a();
                    }

                    public final void onError(Throwable th) {
                        uVar.mo19240a(th);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onNext(FollowPair followPair) {
                        uVar.mo19239a((Object) followPair);
                        uVar.mo19238a();
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public final C7492s<FollowPair> mo22205a(int i, long j, long j2) {
        C7492s sVar;
        if (i == 1) {
            sVar = this.f24620g.follow(i, j, j2, mo22165a().getSecUid(), mo22172a(j));
        } else {
            sVar = this.f24620g.unfollow(i, mo22165a().getSecUid(), j, mo22172a(j), j2);
        }
        C7492s<FollowPair> d = sVar.mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19317d((C7327h<? super T, ? extends R>) new C9010s<Object,Object>(j));
        C8749b bVar = (C8749b) C9178j.m27302j().mo22378g().mo22355a(C8749b.class);
        if (bVar != null) {
            d = bVar.mo21754a(d);
        } else {
            C3166a.m11966e("UserCenter", "IObservableService is null!");
        }
        int i2 = i;
        long j3 = j;
        long j4 = j2;
        C9011t tVar = new C9011t(this, i2, j3, j4);
        C9012u uVar = new C9012u(this, i2, j3, j4);
        d.mo19280a((C7326g<? super T>) tVar, (C7326g<? super Throwable>) uVar);
        C8749b bVar2 = (C8749b) C9178j.m27302j().mo22378g().mo22355a(C8749b.class);
        if (bVar2 != null) {
            return bVar2.mo21754a(d);
        }
        C3166a.m11966e("UserCenter", "IObservableService is null!");
        return d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo22206a(int i, long j, long j2, FollowPair followPair) throws Exception {
        this.f24618e.onFollowStatusChanged(followPair.f25597e, followPair.f25593a);
        this.f24622i.onNext(followPair);
        if (this.f24614a != null) {
            C8450a.m25691a(i, this.f24614a.getId(), j, j2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo22207a(int i, long j, long j2, Throwable th) throws Exception {
        if (this.f24614a != null) {
            C8450a.m25692a(i, this.f24614a.getId(), j, j2, th);
        }
    }

    /* renamed from: b */
    public final long mo22179b() {
        return this.f24614a.getId();
    }

    /* renamed from: f */
    public final C7492s<IUser> mo22186f() {
        return this.f24621h.mo19291a((C7328l<? super T>) new C8975ac<Object>(this));
    }

    /* renamed from: c */
    public final boolean mo22182c() {
        if (this.f24614a.getId() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final C7319aa<IUser> mo22185e() {
        long curUserId = this.f24618e.getCurUserId();
        return this.f24619f.queryUser(curUserId, 2, mo22172a(curUserId)).mo19135b(C7333a.m23044b()).mo19134b(C9017z.f24661a).mo19127a(C47549a.m148327a()).mo19138c((C7326g<? super T>) new C8973aa<Object>(this));
    }

    /* renamed from: a */
    public final IUser mo22165a() {
        return this.f24614a;
    }

    /* renamed from: a */
    static final /* synthetic */ IUser m26893a(C3479d dVar) throws Exception {
        return (IUser) dVar.data;
    }

    /* renamed from: b */
    static final /* synthetic */ User m26901b(C3479d dVar) throws Exception {
        return (User) dVar.data;
    }

    /* renamed from: c */
    static final /* synthetic */ User m26902c(C3479d dVar) throws Exception {
        return (User) dVar.data;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo22215d(IUser iUser) throws Exception {
        this.f24621h.onNext(iUser);
        this.f24614a = iUser;
    }

    /* renamed from: a */
    private <T extends C8971a> C7492s<FollowPair> m26895a(T t) {
        return C7492s.m23282a((C7495v<T>) new C9009r<T>(this, (C8991j) t, t));
    }

    /* renamed from: c */
    public final C7492s<IUser> mo22181c(long j) {
        return this.f24621h.mo19291a((C7328l<? super T>) new C8974ab<Object>(j));
    }

    /* renamed from: d */
    public final C7492s<FollowPair> mo22184d(long j) {
        return this.f24622i.mo19291a((C7328l<? super T>) new C9006o<Object>(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo22212b(User user) throws Exception {
        this.f24621h.onNext(user);
        mo22174a((IUser) user);
    }

    /* renamed from: b */
    public final C7319aa<User> mo22180b(long j) {
        return this.f24619f.queryUser(j, 2, mo22172a(j)).mo19135b(C7333a.m23044b()).mo19134b(C9013v.f24657a).mo19138c((C7326g<? super T>) new C9014w<Object>(this)).mo19127a(C47549a.m148327a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ boolean mo22214c(IUser iUser) throws Exception {
        if (iUser == null || this.f24618e == null || iUser.getId() != this.f24618e.getCurUserId()) {
            return false;
        }
        return true;
    }

    public C8998l(IHostUser iHostUser) {
        if (iHostUser != null) {
            this.f24618e = iHostUser;
            mo22211b(iHostUser.getCurUser());
            this.f24619f = (UserApi) C9178j.m27302j().mo22373b().mo10440a(UserApi.class);
            this.f24620g = (FollowApi) C9178j.m27302j().mo22373b().mo10440a(FollowApi.class);
            iHostUser.registerCurrentUserUpdateListener(new C9007p(this, iHostUser));
            iHostUser.registerFollowStatusListener(new C9008q(this));
            mo22185e().mo19137b((C47557ad<? super T>) new C8986g<Object>());
        }
    }

    /* renamed from: b */
    public final void mo22211b(IUser iUser) {
        if (iUser != null) {
            this.f24614a = iUser;
            this.f24615b.onNext(new C2379k(Status.Update, iUser));
            this.f24617d.mo9983a(Long.valueOf(iUser.getId()), iUser);
            this.f24621h.onNext(iUser);
            return;
        }
        this.f24614a = new C8990i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo22213b(FollowPair followPair) {
        this.f24622i.onNext(followPair);
        C9097a.m27146a().mo22267a((Object) new C9298a(followPair));
    }

    /* renamed from: a */
    public final C7319aa<User> mo22166a(HashMap<String, String> hashMap) {
        return this.f24619f.queryUser(hashMap).mo19135b(C7333a.m23044b()).mo19134b(C9015x.f24659a).mo19138c((C7326g<? super T>) new C9016y<Object>(this)).mo19127a(C47549a.m148327a());
    }

    /* renamed from: a */
    static final /* synthetic */ FollowPair m26894a(long j, C3479d dVar) throws Exception {
        int i = ((C8979c) dVar.data).f24582a;
        FollowPair followPair = new FollowPair();
        if (i == 1) {
            followPair.f25597e = 1;
        } else if (i == 2) {
            followPair.f25597e = 2;
        } else {
            followPair.f25597e = 0;
        }
        followPair.f25593a = j;
        return followPair;
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m26899a(long j, IUser iUser) throws Exception {
        if (iUser == null || iUser.getId() != j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m26900a(long j, FollowPair followPair) throws Exception {
        if (followPair.f25593a == j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static final /* synthetic */ void m26897a(String str, long j, String str2, boolean z, String str3, String str4, OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        try {
            new JSONObject().put("source", str);
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("follow_source", str);
        hashMap.put("user_id", String.valueOf(j));
        hashMap.put("enter_from", str2);
        hashMap.put("source", str2);
        if (z) {
            hashMap.put("event_type", "click");
            hashMap.put("event_belong", "video");
            hashMap.put("event_module", "toast");
            if (!C6319n.m19593a(str3)) {
                hashMap.put("event_page", str3);
            }
            if (!C6319n.m19593a(str4)) {
                hashMap.put("enter_from", str4);
            }
        }
        TTLiveSDKContext.getHostService().mo22363d().mo23269a("unfollow_popup_confirm", hashMap);
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }

    /* renamed from: a */
    private static void m26898a(String str, OnClickListener onClickListener, Context context, String str2, String str3, long j, boolean z, boolean z2, String str4, String str5) {
        String str6 = str3;
        if (context != null) {
            if (z) {
                HashMap hashMap = new HashMap();
                hashMap.put("follow_source", str2);
                hashMap.put("source", str6);
                hashMap.put("enter_from", str6);
                hashMap.put("user_id", String.valueOf(j));
                TTLiveSDKContext.getHostService().mo22363d().mo23269a("unfollow_popup", hashMap);
            } else {
                String str7 = str2;
            }
            C3534a aVar = new C3534a(context, R.style.y_);
            String str8 = str;
            C3534a b = aVar.mo10654a((CharSequence) str).mo10659b((int) R.string.ecm, C9004m.f24633a);
            C9005n nVar = new C9005n(str2, j, str3, false, str4, str5, onClickListener);
            b.mo10649a((int) R.string.f96, (OnClickListener) nVar);
            C3533b a = aVar.mo10657a();
            a.show();
            C3386f.m12598a(a);
        }
    }
}
