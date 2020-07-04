package com.p280ss.android.ugc.aweme.user.repository;

import android.content.Context;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11500c;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11674x;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.model.p601c.C11786e;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p1029d.C22915b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29092a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36030i;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7585d;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel */
public final class UserViewModel extends JediViewModel<UserState> {

    /* renamed from: c */
    public final String f111311c = "follow_user";

    /* renamed from: d */
    public final String f111312d = "unfollow_user";

    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$a */
    static final class C42834a extends Lambda implements C7563m<UserState, C11491a<? extends FollowStatus>, UserState> {

        /* renamed from: a */
        final /* synthetic */ UserViewModel f111313a;

        /* renamed from: b */
        final /* synthetic */ C36030i f111314b;

        C42834a(UserViewModel userViewModel, C36030i iVar) {
            this.f111313a = userViewModel;
            this.f111314b = iVar;
            super(2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public UserState invoke(UserState userState, C11491a<? extends FollowStatus> aVar) {
            C7573i.m23587b(userState, "$receiver");
            C7573i.m23587b(aVar, "follow");
            if (aVar instanceof C11674x) {
                User clone = userState.getUser().clone();
                C7573i.m23582a((Object) clone, "it");
                clone.setFollowStatus(((FollowStatus) ((C11674x) aVar).mo29046a()).followStatus);
                C7573i.m23582a((Object) clone, "user.clone().also { it.f…w.invoke().followStatus }");
                return UserState.copy$default(userState, clone, false, aVar, null, 10, null);
            }
            if (aVar instanceof C11500c) {
                Throwable th = ((C11500c) aVar).f31096a;
                if (th instanceof ApiServerException) {
                    if (this.f111314b.f94264c == 0) {
                        ((C29092a) ServiceManager.get().getService(C29092a.class)).mo74528a(this.f111313a.f111312d, String.valueOf(((ApiServerException) th).getErrorCode()));
                    } else if (this.f111314b.f94264c == 0) {
                        ((C29092a) ServiceManager.get().getService(C29092a.class)).mo74528a(this.f111313a.f111311c, String.valueOf(((ApiServerException) th).getErrorCode()));
                    }
                }
            }
            return UserState.copy$default(userState, null, false, aVar, null, 11, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$b */
    static final class C42835b extends Lambda implements C7562b<UserState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ UserViewModel f111315a;

        C42835b(UserViewModel userViewModel) {
            this.f111315a = userViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m136006a((UserState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m136006a(UserState userState) {
            C7573i.m23587b(userState, "it");
            UserViewModel userViewModel = this.f111315a;
            C42846a aVar = (C42846a) ServiceManager.get().getService(C42846a.class);
            String uid = userState.getUser().getUid();
            C7573i.m23582a((Object) uid, "it.user.uid");
            C7321c f = aVar.mo104555a(uid).mo19325f((C7326g<? super T>) new C7326g<C11786e<? extends User>>(this) {

                /* renamed from: a */
                final /* synthetic */ C42835b f111316a;

                /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$b$1$a */
                static final class C42837a extends Lambda implements C7562b<UserState, UserState> {

                    /* renamed from: a */
                    final /* synthetic */ User f111317a;

                    C42837a(User user) {
                        this.f111317a = user;
                        super(1);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public UserState invoke(UserState userState) {
                        C7573i.m23587b(userState, "$receiver");
                        return UserState.copy$default(userState, this.f111317a, false, null, null, 14, null);
                    }
                }

                {
                    this.f111316a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(C11786e<? extends User> eVar) {
                    User user = (User) eVar.mo29356a();
                    if (user != null) {
                        this.f111316a.f111315a.mo29038c(new C42837a(user));
                    }
                }
            });
            C7573i.m23582a((Object) f, "ServiceManager.get().get…  }\n                    }");
            userViewModel.mo29029a(f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c */
    static final class C42838c extends Lambda implements C7563m<UserState, C11491a<? extends BaseResponse>, UserState> {

        /* renamed from: a */
        public static final C42838c f111318a = new C42838c();

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c$a */
        static final /* synthetic */ class C42840a extends FunctionReference implements C7561a<Integer> {
            C42840a(User user) {
                super(0, user);
            }

            public final String getName() {
                return "getFansCount";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(User.class);
            }

            public final String getSignature() {
                return "getFansCount()I";
            }

            /* renamed from: a */
            private int m136011a() {
                return ((User) this.receiver).getFansCount();
            }

            public final /* synthetic */ Object invoke() {
                return Integer.valueOf(m136011a());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c$b */
        static final /* synthetic */ class C42841b extends FunctionReference implements C7562b<Integer, C7581n> {
            C42841b(User user) {
                super(1, user);
            }

            public final String getName() {
                return "setFansCount";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(User.class);
            }

            public final String getSignature() {
                return "setFansCount(I)V";
            }

            /* renamed from: a */
            private void m136012a(int i) {
                ((User) this.receiver).setFansCount(i);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m136012a(((Number) obj).intValue());
                return C7581n.f20898a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c$c */
        static final /* synthetic */ class C42842c extends FunctionReference implements C7561a<Integer> {
            C42842c(User user) {
                super(0, user);
            }

            public final String getName() {
                return "getFollowerCount";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(User.class);
            }

            public final String getSignature() {
                return "getFollowerCount()I";
            }

            /* renamed from: a */
            private int m136013a() {
                return ((User) this.receiver).getFollowerCount();
            }

            public final /* synthetic */ Object invoke() {
                return Integer.valueOf(m136013a());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c$d */
        static final /* synthetic */ class C42843d extends FunctionReference implements C7562b<Integer, C7581n> {
            C42843d(User user) {
                super(1, user);
            }

            public final String getName() {
                return "setFollowerCount";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(User.class);
            }

            public final String getSignature() {
                return "setFollowerCount(I)V";
            }

            /* renamed from: a */
            private void m136014a(int i) {
                ((User) this.receiver).setFollowerCount(i);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m136014a(((Number) obj).intValue());
                return C7581n.f20898a;
            }
        }

        C42838c() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m136009a((UserState) obj, (C11491a) obj2);
        }

        /* renamed from: a */
        private static UserState m136009a(UserState userState, C11491a<? extends BaseResponse> aVar) {
            C7573i.m23587b(userState, "$receiver");
            C7573i.m23587b(aVar, "res");
            if (aVar instanceof C11674x) {
                Object a = aVar.mo29046a();
                if (a == null) {
                    C7573i.m23580a();
                }
                if (((BaseResponse) a).status_code == 0) {
                    IAccountUserService a2 = C21115b.m71197a();
                    C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
                    User curUser = a2.getCurUser();
                    C7563m mVar = C428391.f111319a;
                    if (C36337ai.m117567a(curUser)) {
                        mVar.invoke(new C42840a(curUser), new C42841b(curUser));
                    } else {
                        mVar.invoke(new C42842c(curUser), new C42843d(curUser));
                    }
                    return UserState.copy$default(userState, null, true, null, null, 13, null);
                }
            }
            if (!(aVar instanceof C11500c)) {
                return userState;
            }
            C11500c cVar = (C11500c) aVar;
            if (cVar.f31096a instanceof ApiServerException) {
                Context a3 = AwemeApplication.m21341a();
                Throwable th = cVar.f31096a;
                if (th != null) {
                    C22814a.m75242a(a3, (ApiServerException) th);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                }
            } else {
                C6921a.m21559a(cVar.f31096a);
            }
            return userState;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m135999f();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        m136000g();
    }

    /* renamed from: f */
    private static UserState m135999f() {
        UserState userState = new UserState(null, false, null, null, 15, null);
        return userState;
    }

    /* renamed from: g */
    private final void m136000g() {
        mo29036b(new C42835b(this));
    }

    /* renamed from: a */
    public final C7321c mo104546a(String str) {
        C7573i.m23587b(str, "uid");
        C7492s a = ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104557b(str).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "ServiceManager.get().get…dSchedulers.mainThread())");
        return mo29031a(a, (C7563m<? super S, ? super C11491a<? extends T>, ? extends S>) C42838c.f111318a);
    }

    /* renamed from: a */
    public final void mo104547a(C36030i iVar) {
        C7573i.m23587b(iVar, "param");
        mo29028a(((C42846a) ServiceManager.get().getService(C42846a.class)).mo104554a(iVar.f94262a, iVar.f94263b, iVar.f94264c, C22915b.m75418a(iVar.f94267f), iVar.f94265d, iVar.f94268g, iVar.f94266e), (C7563m<? super S, ? super C11491a<? extends T>, ? extends S>) new C42834a<Object,Object,Object>(this, iVar));
    }
}
