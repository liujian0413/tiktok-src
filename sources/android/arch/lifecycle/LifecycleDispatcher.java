package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

final class LifecycleDispatcher {

    /* renamed from: a */
    private static AtomicBoolean f40a = new AtomicBoolean(false);

    public static class DestructionReportFragment extends Fragment {
        public void onDestroy() {
            super.onDestroy();
            m59a(Event.ON_DESTROY);
        }

        public void onPause() {
            super.onPause();
            m59a(Event.ON_PAUSE);
        }

        public void onStop() {
            super.onStop();
            m59a(Event.ON_STOP);
        }

        /* renamed from: a */
        private void m59a(Event event) {
            LifecycleDispatcher.m55a(this.mParentFragment, event);
        }
    }

    /* renamed from: android.arch.lifecycle.LifecycleDispatcher$a */
    static class C0022a extends C0035c {

        /* renamed from: a */
        private final C0023b f41a = new C0023b();

        C0022a() {
        }

        public final void onActivityStopped(Activity activity) {
            if (activity instanceof FragmentActivity) {
                LifecycleDispatcher.m56a((FragmentActivity) activity, State.CREATED);
            }
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            if (activity instanceof FragmentActivity) {
                LifecycleDispatcher.m56a((FragmentActivity) activity, State.CREATED);
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof FragmentActivity) {
                ((FragmentActivity) activity).getSupportFragmentManager().mo2649a((C0609a) this.f41a, true);
            }
            C0059s.m137a(activity);
        }
    }

    /* renamed from: android.arch.lifecycle.LifecycleDispatcher$b */
    static class C0023b extends C0609a {
        C0023b() {
        }

        public final void onFragmentResumed(C0608j jVar, Fragment fragment) {
            LifecycleDispatcher.m55a(fragment, Event.ON_RESUME);
        }

        public final void onFragmentStarted(C0608j jVar, Fragment fragment) {
            LifecycleDispatcher.m55a(fragment, Event.ON_START);
        }

        public final void onFragmentCreated(C0608j jVar, Fragment fragment, Bundle bundle) {
            LifecycleDispatcher.m55a(fragment, Event.ON_CREATE);
            if ((fragment instanceof C0047k) && fragment.getChildFragmentManager().mo2644a("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragment.getChildFragmentManager().mo2645a().mo2588a((Fragment) new DestructionReportFragment(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").mo2604c();
            }
        }
    }

    /* renamed from: a */
    static void m54a(Context context) {
        if (!f40a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0022a());
        }
    }

    /* renamed from: a */
    public static void m55a(Fragment fragment, Event event) {
        if (fragment instanceof C0047k) {
            ((C0047k) fragment).mo119a().mo116a(event);
        }
    }

    /* renamed from: a */
    public static void m56a(FragmentActivity fragmentActivity, State state) {
        m58a((Object) fragmentActivity, state);
        m57a(fragmentActivity.getSupportFragmentManager(), state);
    }

    /* renamed from: a */
    private static void m57a(C0608j jVar, State state) {
        List<Fragment> f = jVar.mo2658f();
        if (f != null) {
            for (Fragment fragment : f) {
                if (fragment != null) {
                    m58a((Object) fragment, state);
                    if (fragment.isAdded()) {
                        m57a(fragment.getChildFragmentManager(), state);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m58a(Object obj, State state) {
        if (obj instanceof C0047k) {
            ((C0047k) obj).mo119a().mo117a(state);
        }
    }
}
