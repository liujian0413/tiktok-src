package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import java.util.HashMap;
import java.util.Map;

public class HolderFragment extends Fragment implements C0071z {

    /* renamed from: a */
    private static final C0019a f31a = new C0019a();

    /* renamed from: b */
    private C0070y f32b = new C0070y();

    /* renamed from: android.arch.lifecycle.HolderFragment$a */
    static class C0019a {

        /* renamed from: a */
        public Map<Activity, HolderFragment> f33a = new HashMap();

        /* renamed from: b */
        public Map<Fragment, HolderFragment> f34b = new HashMap();

        /* renamed from: c */
        private ActivityLifecycleCallbacks f35c = new C0035c() {
            public final void onActivityDestroyed(Activity activity) {
                C0019a.this.f33a.remove(activity);
            }
        };

        /* renamed from: d */
        private boolean f36d = false;

        /* renamed from: e */
        private C0609a f37e = new C0609a() {
            public final void onFragmentDestroyed(C0608j jVar, Fragment fragment) {
                super.onFragmentDestroyed(jVar, fragment);
                C0019a.this.f34b.remove(fragment);
            }
        };

        C0019a() {
        }

        /* renamed from: b */
        private static HolderFragment m47b(C0608j jVar) {
            HolderFragment holderFragment = new HolderFragment();
            jVar.mo2645a().mo2588a((Fragment) holderFragment, "android.arch.lifecycle.state.StateProviderHolderFragment").mo2606d();
            return holderFragment;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo50a(Fragment fragment) {
            Fragment fragment2 = fragment.mParentFragment;
            if (fragment2 != null) {
                this.f34b.remove(fragment2);
                fragment2.mFragmentManager.mo2648a(this.f37e);
                return;
            }
            this.f33a.remove(fragment.getActivity());
        }

        /* renamed from: a */
        private static HolderFragment m46a(C0608j jVar) {
            if (!jVar.mo2659g()) {
                Fragment a = jVar.mo2644a("android.arch.lifecycle.state.StateProviderHolderFragment");
                if (a == null || (a instanceof HolderFragment)) {
                    return (HolderFragment) a;
                }
                throw new IllegalStateException("Unexpected fragment instance was returned by HOLDER_TAG");
            }
            throw new IllegalStateException("Can't access ViewModels from onDestroy");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final HolderFragment mo51b(Fragment fragment) {
            C0608j childFragmentManager = fragment.getChildFragmentManager();
            HolderFragment a = m46a(childFragmentManager);
            if (a != null) {
                return a;
            }
            HolderFragment holderFragment = (HolderFragment) this.f34b.get(fragment);
            if (holderFragment != null) {
                return holderFragment;
            }
            fragment.mFragmentManager.mo2649a(this.f37e, false);
            HolderFragment b = m47b(childFragmentManager);
            this.f34b.put(fragment, b);
            return b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final HolderFragment mo49a(FragmentActivity fragmentActivity) {
            C0608j supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            HolderFragment a = m46a(supportFragmentManager);
            if (a != null) {
                return a;
            }
            HolderFragment holderFragment = (HolderFragment) this.f33a.get(fragmentActivity);
            if (holderFragment != null) {
                return holderFragment;
            }
            if (!this.f36d) {
                this.f36d = true;
                fragmentActivity.getApplication().registerActivityLifecycleCallbacks(this.f35c);
            }
            HolderFragment b = m47b(supportFragmentManager);
            this.f33a.put(fragmentActivity, b);
            return b;
        }
    }

    public C0070y getViewModelStore() {
        return this.f32b;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f32b.mo151a();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public static HolderFragment m44a(Fragment fragment) {
        return f31a.mo51b(fragment);
    }

    /* renamed from: a */
    public static HolderFragment m45a(FragmentActivity fragmentActivity) {
        return f31a.mo49a(fragmentActivity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f31a.mo50a((Fragment) this);
    }
}
