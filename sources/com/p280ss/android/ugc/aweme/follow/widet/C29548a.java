package com.p280ss.android.ugc.aweme.follow.widet;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.C29778b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p313im.C30544a;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.follow.widet.a */
public final class C29548a implements C0053p<FollowStatus> {

    /* renamed from: a */
    public FragmentActivity f77864a;

    /* renamed from: b */
    public C29554c f77865b;

    /* renamed from: c */
    public C29552a f77866c;

    /* renamed from: d */
    public C29553b f77867d;

    /* renamed from: e */
    public C29555d f77868e;

    /* renamed from: f */
    private C29778b f77869f;

    /* renamed from: g */
    private User f77870g;

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$a */
    public interface C29552a {
        /* renamed from: a */
        void mo68102a(FollowStatus followStatus);
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$b */
    public interface C29553b {
        /* renamed from: a */
        void mo75564a(FollowStatus followStatus);

        /* renamed from: a */
        void mo75565a(Exception exc);
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$c */
    public interface C29554c {
        /* renamed from: a */
        String mo68099a();

        /* renamed from: a */
        void mo67853a(int i, User user);

        /* renamed from: b */
        String mo68100b();

        /* renamed from: c */
        int mo68101c();
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$d */
    public interface C29555d {
        /* renamed from: a */
        void mo68109a();
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$e */
    public static class C29556e implements C29554c {
        /* renamed from: a */
        public String mo68099a() {
            return "";
        }

        /* renamed from: a */
        public void mo67853a(int i, User user) {
        }

        /* renamed from: b */
        public String mo68100b() {
            return "";
        }

        /* renamed from: c */
        public int mo68101c() {
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo75560b(User user) {
        boolean z;
        C30544a g = C6903bc.m21488g();
        FragmentActivity fragmentActivity = this.f77864a;
        if (user.getFollowStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        g.mo80283a(fragmentActivity, 2, z, new C29557b(this, user));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void mo75561c(User user) {
        int followStatus = user.getFollowStatus();
        int i = 0;
        if (followStatus != 4) {
            switch (followStatus) {
                case 0:
                    if (!user.isSecret()) {
                        if (user.getFollowerStatus() != 1) {
                            i = 1;
                            break;
                        } else {
                            i = 2;
                            break;
                        }
                    } else {
                        i = 4;
                        break;
                    }
            }
        }
        if (user.getFollowStatus() != 4 && i == 4) {
            m97084a((Activity) this.f77864a);
        }
        m97083a(i, user);
    }

    /* renamed from: a */
    private static void m97084a(Activity activity) {
        C22903bl privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        int intValue = ((Integer) privacyAccountFollowCount.mo59877d()).intValue();
        if (intValue == 0) {
            new C10741a(activity).mo25657b((int) R.string.d50).mo25650a((int) R.string.bfm, (OnClickListener) null).mo25656a().mo25637a();
        } else if (intValue > 0 && intValue < 4) {
            C10761a.m31409e((Context) activity, (int) R.string.d51).mo25750a();
        }
        privacyAccountFollowCount.mo59871a(Integer.valueOf(intValue + 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(FollowStatus followStatus) {
        if (followStatus != null && TextUtils.equals(followStatus.userId, this.f77870g.getUid())) {
            this.f77870g.setFollowStatus(followStatus.followStatus);
            C29778b bVar = this.f77869f;
            int i = followStatus.followStatus;
            int i2 = 1;
            if (this.f77870g.getFollowerStatus() != 1) {
                i2 = 0;
            }
            bVar.mo75747a(i, i2);
            if (this.f77866c != null) {
                this.f77866c.mo68102a(followStatus);
            }
            if (this.f77867d != null) {
                this.f77867d.mo75564a(followStatus);
            }
        }
    }

    /* renamed from: a */
    public final void mo75558a(final User user) {
        String str;
        if (C6399b.m19928c()) {
            StringBuilder sb = new StringBuilder("bind() called with: old user = [");
            if (this.f77870g == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else {
                str = this.f77870g.getNickname();
            }
            sb.append(str);
            sb.append("]");
        }
        if (this.f77870g != null) {
            ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104556b().removeObserver(this);
        }
        this.f77870g = user;
        int followStatus = user.getFollowStatus();
        int i = 0;
        if (TextUtils.equals(user.getUid(), C6861a.m21337f().getCurUserId())) {
            C29778b bVar = this.f77869f;
            if (this.f77870g.getFollowerStatus() == 1) {
                i = 1;
            }
            bVar.mo75747a(3, i);
            return;
        }
        C29778b bVar2 = this.f77869f;
        if (this.f77870g.getFollowerStatus() == 1) {
            i = 1;
        }
        bVar2.mo75747a(followStatus, i);
        ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104556b().observe(this.f77869f.getLifeCycleOwner(), this);
        this.f77869f.setOnClickListener(new View.OnClickListener() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo75562a(User user) {
                if (C6861a.m21337f().isLogin()) {
                    C29548a.this.mo75560b(user);
                }
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89579a(view, 300)) {
                    if (!C29559d.m97108a(C6399b.m19921a())) {
                        C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjs).mo25750a();
                        return;
                    }
                    if (!C6861a.m21337f().isLogin()) {
                        C32656f.m105744a((Activity) C29548a.this.f77864a, C29548a.this.f77865b.mo68099a(), C29548a.this.f77865b.mo68100b(), C42914ab.m136242a().mo104633a("login_title", C29548a.this.f77864a.getResources().getString(R.string.b7t)).f111445a, (C23305g) new C29558c(this, user));
                    } else {
                        C29548a.this.mo75560b(user);
                    }
                    if (C29548a.this.f77868e != null) {
                        C29548a.this.f77868e.mo68109a();
                    }
                }
            }
        });
    }

    public C29548a(C29778b bVar, C29554c cVar) {
        this.f77869f = bVar;
        this.f77864a = (FragmentActivity) C23487o.m77130a(bVar.getContext());
        this.f77865b = cVar;
    }

    /* renamed from: a */
    private void m97083a(int i, User user) {
        int i2;
        if (user.getFollowStatus() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.f77865b != null) {
            this.f77865b.mo67853a(i2, user);
        }
        mo75559a(user.getUid(), user.getSecUid(), i2, user.getFollowerStatus());
    }

    /* renamed from: a */
    public final void mo75559a(String str, String str2, int i, int i2) {
        String str3;
        int i3;
        final C36031j jVar = new C36031j();
        C36034a a = new C36034a().mo91684a(str).mo91686b(str2).mo91682a(i);
        if (this.f77865b == null) {
            str3 = "";
        } else {
            str3 = this.f77865b.mo68099a();
        }
        C36034a c = a.mo91688c(str3);
        if (this.f77865b == null) {
            i3 = 0;
        } else {
            i3 = this.f77865b.mo68101c();
        }
        jVar.mo91679a(c.mo91685b(i3).mo91689d(i2).mo91681a());
        this.f77869f.getLifeCycleOwner().getLifecycle().mo55a(new FollowUserBlock$2(this, jVar));
        jVar.mo66537a(new C36040n() {
            public final void onFollowSuccess(FollowStatus followStatus) {
            }

            public final void onFollowFail(final Exception exc) {
                if (C6903bc.m21483b().mo61553a(exc)) {
                    C6903bc.m21483b().mo61552a(C29548a.this.f77864a.getSupportFragmentManager(), (ApiServerException) exc, new C23637b() {
                        /* renamed from: a */
                        public final void mo57592a() {
                            jVar.mo56975R_();
                        }

                        /* renamed from: b */
                        public final void mo57593b() {
                            C22814a.m75245a(C29548a.this.f77864a, exc, R.string.b82);
                        }
                    });
                } else {
                    C22814a.m75245a(C29548a.this.f77864a, exc, R.string.b82);
                }
                if (C29548a.this.f77867d != null) {
                    C29548a.this.f77867d.mo75565a(exc);
                }
            }
        });
    }
}
