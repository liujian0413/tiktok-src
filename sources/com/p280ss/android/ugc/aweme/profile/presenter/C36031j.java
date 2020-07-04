package com.p280ss.android.ugc.aweme.profile.presenter;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.p938b.C21116a;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p1029d.C22915b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29092a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.j */
public final class C36031j extends C21116a<C25640a<FollowStatus>, C36040n> {

    /* renamed from: a */
    public int f94272a = -1;

    /* renamed from: d */
    public String f94273d;

    /* renamed from: com.ss.android.ugc.aweme.profile.presenter.j$a */
    public static final class C36034a {

        /* renamed from: a */
        private C36030i f94277a = new C36030i();

        /* renamed from: a */
        public final C36030i mo91681a() {
            if (this.f94277a.f94264c != -1) {
                return this.f94277a;
            }
            throw new IllegalStateException("You must set an action.");
        }

        /* renamed from: a */
        public final C36034a mo91682a(int i) {
            this.f94277a.f94264c = i;
            return this;
        }

        /* renamed from: b */
        public final C36034a mo91685b(int i) {
            this.f94277a.f94265d = i;
            return this;
        }

        /* renamed from: c */
        public final C36034a mo91687c(int i) {
            this.f94277a.f94266e = i;
            return this;
        }

        /* renamed from: d */
        public final C36034a mo91689d(int i) {
            this.f94277a.f94271j = i;
            return this;
        }

        /* renamed from: e */
        public final C36034a mo91691e(String str) {
            this.f94277a.f94270i = str;
            return this;
        }

        /* renamed from: a */
        public final C36034a mo91683a(Aweme aweme) {
            this.f94277a.f94269h = aweme;
            return this;
        }

        /* renamed from: b */
        public final C36034a mo91686b(String str) {
            this.f94277a.f94263b = str;
            return this;
        }

        /* renamed from: c */
        public final C36034a mo91688c(String str) {
            this.f94277a.f94267f = str;
            return this;
        }

        /* renamed from: d */
        public final C36034a mo91690d(String str) {
            this.f94277a.f94268g = str;
            return this;
        }

        /* renamed from: a */
        public final C36034a mo91684a(String str) {
            this.f94277a.f94262a = str;
            return this;
        }
    }

    public C36031j() {
        m116066e();
    }

    /* renamed from: e */
    private void m116066e() {
        mo66536a(new C25640a<FollowStatus>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 10) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C36031j.this.f94273d = objArr[0];
                C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        FollowStatus followStatus;
                        Aweme aweme = (Aweme) objArr[5];
                        String str = (String) objArr[6];
                        C36031j.this.f94272a = ((Integer) objArr[1]).intValue();
                        try {
                            String str2 = (String) objArr[3];
                            if (objArr.length >= 10) {
                                followStatus = ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104553a((String) objArr[0], (String) objArr[8], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), C22915b.m75418a(str2), (String) objArr[4], ((Integer) objArr[7]).intValue(), C28290d.m93044e());
                                if (followStatus != null) {
                                    followStatus.followerStatus = ((Integer) objArr[9]).intValue();
                                }
                            } else {
                                followStatus = ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104553a((String) objArr[0], C43077dz.m136657a().mo104733b((String) objArr[0]), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), C22915b.m75418a(str2), (String) objArr[4], ((Integer) objArr[7]).intValue(), C28290d.m93044e());
                            }
                            C360321.m116071a(((Integer) objArr[1]).intValue(), aweme, str, followStatus);
                            return followStatus;
                        } catch (ApiServerException e) {
                            if (e.getErrorCode() == 2149 && C25329c.m83225h(aweme)) {
                                C360321.m116071a(((Integer) objArr[1]).intValue(), aweme, str, new FollowStatus((String) objArr[0], 0, e.getErrorCode()));
                            }
                            throw e;
                        }
                    }
                }, 0);
                return true;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
                if (r5.equals("homepage") != false) goto L_0x0030;
             */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static void m116071a(int r3, com.p280ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.String r5, com.p280ss.android.ugc.aweme.profile.model.FollowStatus r6) {
                /*
                    if (r5 == 0) goto L_0x004d
                    r0 = 1
                    if (r3 != r0) goto L_0x004d
                    boolean r3 = com.p280ss.android.ugc.aweme.commercialize.utils.C25329c.m83225h(r4)
                    if (r3 != 0) goto L_0x000c
                    goto L_0x004d
                L_0x000c:
                    r3 = -1
                    int r1 = r5.hashCode()
                    r2 = -485371922(0xffffffffe311cfee, float:-2.6897608E21)
                    if (r1 == r2) goto L_0x0026
                    r0 = 3138974(0x2fe59e, float:4.39864E-39)
                    if (r1 == r0) goto L_0x001c
                    goto L_0x002f
                L_0x001c:
                    java.lang.String r0 = "feed"
                    boolean r5 = r5.equals(r0)
                    if (r5 == 0) goto L_0x002f
                    r0 = 0
                    goto L_0x0030
                L_0x0026:
                    java.lang.String r1 = "homepage"
                    boolean r5 = r5.equals(r1)
                    if (r5 == 0) goto L_0x002f
                    goto L_0x0030
                L_0x002f:
                    r0 = -1
                L_0x0030:
                    switch(r0) {
                        case 0: goto L_0x0040;
                        case 1: goto L_0x0034;
                        default: goto L_0x0033;
                    }
                L_0x0033:
                    goto L_0x004c
                L_0x0034:
                    com.ss.android.ugc.aweme.commercialize.feed.al r3 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80851a()
                    android.content.Context r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                    r3.mo64669b(r5, r4, r6)
                    goto L_0x004c
                L_0x0040:
                    com.ss.android.ugc.aweme.commercialize.feed.al r3 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80851a()
                    android.content.Context r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
                    r3.mo64658a(r5, r4, r6)
                    return
                L_0x004c:
                    return
                L_0x004d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C360321.m116071a(int, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, com.ss.android.ugc.aweme.profile.model.FollowStatus):void");
            }
        });
    }

    /* renamed from: b */
    public final void mo56977b() {
        FollowStatus followStatus;
        if (this.f67571b == null) {
            followStatus = null;
        } else {
            followStatus = (FollowStatus) this.f67571b.getData();
        }
        if (followStatus != null && followStatus.followStatus == 1) {
            ((IMainService) ServiceManager.get().getService(IMainService.class)).trackAppsFlyerEvent("mus_af_follow", followStatus.userId);
        }
        if (followStatus != null) {
            if (this.f67572c != null) {
                ((C36040n) this.f67572c).onFollowSuccess(followStatus);
                C42961az.m136380a(followStatus);
                ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104556b().postValue(followStatus);
            }
            User user = new User();
            user.setUid(followStatus.userId);
            user.setFollowStatus(followStatus.followStatus);
            user.setFollowerStatus(followStatus.followerStatus);
            C6903bc.m21488g().mo80285a(user);
            m116064a(followStatus);
        }
    }

    /* renamed from: a */
    public final boolean mo56976a(Object... objArr) {
        return super.mo56976a(objArr);
    }

    /* renamed from: a */
    private static void m116064a(FollowStatus followStatus) {
        if (C6399b.m19946v() && followStatus != null && followStatus.followStatus == 0) {
            C42961az.m136380a(followStatus.cpoyToWatchStatus());
        }
    }

    /* renamed from: a */
    private static void m116065a(String str) {
        FollowStatus followStatus = new FollowStatus();
        followStatus.userId = str;
        followStatus.followStatus = 0;
        followStatus.isFollowSucess = false;
        C42961az.m136380a(followStatus);
        ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104556b().postValue(followStatus);
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            if (C22814a.m75240a(exc) != null) {
                if (this.f94272a == 1) {
                    ((C29092a) ServiceManager.get().getService(C29092a.class)).mo74528a("follow_user", String.valueOf(C22814a.m75240a(exc).getErrorCode()));
                } else if (this.f94272a == 0) {
                    ((C29092a) ServiceManager.get().getService(C29092a.class)).mo74528a("unfollow_user", String.valueOf(C22814a.m75240a(exc).getErrorCode()));
                }
            }
            ((C36040n) this.f67572c).onFollowFail(exc);
            m116065a(this.f94273d);
        }
    }

    /* renamed from: a */
    public final boolean mo91679a(C36030i iVar) {
        if (iVar != null) {
            if (super.mo56976a(iVar.f94262a, Integer.valueOf(iVar.f94264c), Integer.valueOf(iVar.f94265d), iVar.f94267f, iVar.f94268g, iVar.f94269h, iVar.f94270i, Integer.valueOf(iVar.f94266e), iVar.f94263b, Integer.valueOf(iVar.f94271j))) {
                return true;
            }
        }
        return false;
    }
}
