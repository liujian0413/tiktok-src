package com.p280ss.android.ugc.aweme.profile.viewmodel;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.core.C12131l;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel */
public final class ProfileViewModel extends JediViewModel<ProfileState> {

    /* renamed from: c */
    public static final C36792a f96540c = new C36792a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$a */
    public static final class C36792a {

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$a$a */
        public static final class C36793a implements C0067b {
            C36793a() {
            }

            /* renamed from: a */
            public final <T extends C0063u> T mo149a(Class<T> cls) {
                C7573i.m23587b(cls, "modelClass");
                return (C0063u) new ProfileViewModel();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$a$b */
        static final class C36794b extends Lambda implements C7562b<ProfileState, ProfileState> {

            /* renamed from: a */
            public static final C36794b f96541a = new C36794b();

            C36794b() {
                super(1);
            }

            /* renamed from: a */
            private static ProfileState m118588a(ProfileState profileState) {
                C7573i.m23587b(profileState, "$receiver");
                return profileState;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m118588a((ProfileState) obj);
            }
        }

        private C36792a() {
        }

        public /* synthetic */ C36792a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ProfileViewModel m118586a(Fragment fragment) {
            C7573i.m23587b(fragment, "fragment");
            C0063u a = C0069x.m158a(fragment, (C0067b) new C36793a()).mo148a(ProfileViewModel.class.getName(), ProfileViewModel.class);
            ProfileViewModel profileViewModel = (ProfileViewModel) a;
            profileViewModel.mo29034a((C7562b<? super S, ? extends S>) C36794b.f96541a);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(fr…eturn@initialize this } }");
            return profileViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$b */
    static final class C36795b extends Lambda implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ int f96542a;

        C36795b(int i) {
            this.f96542a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C7573i.m23587b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, this.f96542a, false, null, null, null, null, null, false, false, false, null, false, null, 524223, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$c */
    static final class C36796c extends Lambda implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ int f96543a;

        C36796c(int i) {
            this.f96543a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C7573i.m23587b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, false, false, false, Integer.valueOf(this.f96543a), false, null, 458751, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$d */
    static final class C36797d extends Lambda implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ String f96544a;

        C36797d(String str) {
            this.f96544a = str;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C7573i.m23587b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, this.f96544a, null, false, false, false, null, false, null, 522239, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$e */
    static final class C36798e extends Lambda implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ String f96545a;

        C36798e(String str) {
            this.f96545a = str;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C7573i.m23587b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, this.f96545a, null, null, false, false, false, null, false, null, 523263, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$f */
    static final class C36799f extends Lambda implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f96546a;

        C36799f(boolean z) {
            this.f96546a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C7573i.m23587b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, false, this.f96546a, false, null, false, null, 507903, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$g */
    static final class C36800g extends Lambda implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f96547a;

        C36800g(boolean z) {
            this.f96547a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C7573i.m23587b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, false, false, this.f96547a, null, false, null, 491519, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$h */
    static final class C36801h extends Lambda implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ C11491a f96548a;

        C36801h(C11491a aVar) {
            this.f96548a = aVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C7573i.m23587b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, this.f96548a, 0, 0, false, null, null, null, null, null, false, false, false, null, false, null, 524271, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$i */
    static final class C36802i extends Lambda implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f96549a;

        C36802i(boolean z) {
            this.f96549a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C7573i.m23587b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, false, false, false, null, this.f96549a, null, 393215, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$j */
    static final class C36803j extends Lambda implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f96550a;

        C36803j(boolean z) {
            this.f96550a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C7573i.m23587b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, Boolean.valueOf(this.f96550a), false, false, false, null, false, null, 520191, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$k */
    static final class C36804k extends Lambda implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ User f96551a;

        C36804k(User user) {
            this.f96551a = user;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C7573i.m23587b(profileState, "$receiver");
            return ProfileState.copy$default(profileState2, null, null, this.f96551a, null, null, 0, 0, false, null, null, null, null, null, false, false, false, null, false, null, 524283, null);
        }
    }

    /* renamed from: a */
    public static final ProfileViewModel m118573a(Fragment fragment) {
        return C36792a.m118586a(fragment);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m118574f();
    }

    /* renamed from: f */
    private static ProfileState m118574f() {
        ProfileState profileState = new ProfileState(null, null, null, null, null, 0, 0, false, null, null, null, null, null, false, false, false, null, false, null, 524287, null);
        return profileState;
    }

    /* renamed from: a */
    public final void mo93192a(int i) {
        mo29038c(new C36795b(i));
    }

    /* renamed from: b */
    public final void mo93197b(int i) {
        mo29038c(new C36796c(i));
    }

    /* renamed from: c */
    public final void mo93200c(boolean z) {
        mo29038c(new C36800g(true));
    }

    /* renamed from: d */
    public final void mo93201d(boolean z) {
        mo29038c(new C36802i(z));
    }

    /* renamed from: a */
    public final void mo93193a(C11491a<? extends Pair<? extends UrlModel, ? extends C12131l>> aVar) {
        C7573i.m23587b(aVar, "loadAvatar");
        mo29038c(new C36801h(aVar));
    }

    /* renamed from: b */
    public final void mo93198b(String str) {
        mo29038c(new C36797d(str));
    }

    /* renamed from: a */
    public final void mo93194a(User user) {
        C7573i.m23587b(user, "u");
        mo29038c(new C36804k(user));
    }

    /* renamed from: b */
    public final void mo93199b(boolean z) {
        mo29038c(new C36799f(true));
    }

    /* renamed from: a */
    public final void mo93195a(String str) {
        mo29038c(new C36798e(str));
    }

    /* renamed from: a */
    public final void mo93196a(boolean z) {
        mo29038c(new C36803j(z));
    }
}
