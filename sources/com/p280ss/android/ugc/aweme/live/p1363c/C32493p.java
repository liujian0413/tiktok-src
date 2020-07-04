package com.p280ss.android.ugc.aweme.live.p1363c;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.p443f.C9314a;
import com.bytedance.android.livesdkapi.depend.p443f.C9315b;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.p455c.C9460a;
import com.bytedance.android.livesdkapi.host.p455c.C9461b;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.p1058c.C23284c;
import com.p280ss.android.ugc.aweme.base.p1058c.C23289h;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.live.c.p */
public final class C32493p implements IHostUser {

    /* renamed from: a */
    private C32496b f84757a;

    /* renamed from: b */
    private C32495a f84758b;

    /* renamed from: com.ss.android.ugc.aweme.live.c.p$a */
    public static final class C32495a {

        /* renamed from: a */
        public C9314a f84759a;

        private C32495a() {
        }

        /* renamed from: a */
        public final void mo83727a() {
            C42961az.m136382c(this);
        }

        /* renamed from: b */
        public final void mo83728b() {
            C42961az.m136383d(this);
            this.f84759a = null;
        }

        @C7709l
        public final void onEvent(C23661d dVar) {
            if (this.f84759a != null && (dVar.f62380b instanceof User)) {
                FollowPair followPair = new FollowPair();
                followPair.f25597e = dVar.f62379a;
                String uid = ((User) dVar.f62380b).getUid();
                if (uid != null) {
                    followPair.f25593a = Long.parseLong(uid);
                }
                this.f84759a.mo22221a(followPair);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.c.p$b */
    public static final class C32496b implements C9315b {

        /* renamed from: a */
        public C9315b f84760a;

        private C32496b() {
        }

        /* renamed from: a */
        public final void mo83730a() {
            C42961az.m136382c(this);
        }

        /* renamed from: b */
        public final void mo83731b() {
            C42961az.m136383d(this);
            this.f84760a = null;
        }

        @C7709l
        public final void onEvent(C23289h hVar) {
            mo22220a(false);
        }

        /* renamed from: a */
        public final void mo22220a(boolean z) {
            if (this.f84760a != null) {
                this.f84760a.mo22220a(z);
            }
        }

        @C7709l
        public final void onEvent(C23284c cVar) {
            mo22220a(((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin());
        }
    }

    public final boolean interceptOperation(String str) {
        return false;
    }

    public final void markAsOutOfDate(boolean z) {
    }

    public final void setRoomAttrsAdminFlag(int i) {
    }

    public final void updateUser(IUser iUser) {
    }

    public final IUser getCurUser() {
        return C32478e.m105218a(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser());
    }

    public final long getCurUserId() {
        return Long.parseLong(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
    }

    public final boolean isLogin() {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin();
    }

    public final void unRegisterCurrentUserUpdateListener(C9315b bVar) {
        if (this.f84757a != null) {
            this.f84757a.mo83731b();
        }
    }

    public final void unRegisterFollowStatusListener(C9314a aVar) {
        if (this.f84758b != null) {
            this.f84758b.mo83728b();
        }
    }

    public final void registerCurrentUserUpdateListener(C9315b bVar) {
        if (this.f84757a == null) {
            this.f84757a = new C32496b();
        }
        this.f84757a.f84760a = bVar;
        this.f84757a.mo83730a();
    }

    public final void registerFollowStatusListener(C9314a aVar) {
        if (this.f84758b == null) {
            this.f84758b = new C32495a();
        }
        this.f84758b.f84759a = aVar;
        this.f84758b.mo83727a();
    }

    public final void onFollowStatusChanged(int i, long j) {
        FollowStatus followStatus = new FollowStatus();
        followStatus.userId = String.valueOf(j);
        followStatus.followStatus = i;
        C42961az.m136380a(followStatus);
    }

    public final void unFollowWithConfirm(Activity activity, int i, long j, C9461b bVar) {
        bVar.mo22217a();
    }

    public final void login(FragmentActivity fragmentActivity, C9460a aVar, String str, String str2, int i, String str3, String str4, String str5) {
        C32656f.m105744a((Activity) fragmentActivity, str4, "live_room", (Bundle) null, (C23305g) new C32497q(aVar));
    }
}
