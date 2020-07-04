package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.s */
public final class C0059s extends Fragment {

    /* renamed from: a */
    public C0060a f106a;

    /* renamed from: android.arch.lifecycle.s$a */
    interface C0060a {
        /* renamed from: a */
        void mo133a();

        /* renamed from: b */
        void mo134b();
    }

    public final void onDestroy() {
        super.onDestroy();
        m138a(Event.ON_DESTROY);
        this.f106a = null;
    }

    public final void onPause() {
        super.onPause();
        m138a(Event.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        m141b(this.f106a);
        m138a(Event.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        m139a(this.f106a);
        m138a(Event.ON_START);
    }

    public final void onStop() {
        super.onStop();
        m138a(Event.ON_STOP);
    }

    /* renamed from: a */
    private static void m139a(C0060a aVar) {
        if (aVar != null) {
            aVar.mo133a();
        }
    }

    /* renamed from: b */
    private static void m141b(C0060a aVar) {
        if (aVar != null) {
            aVar.mo134b();
        }
    }

    /* renamed from: b */
    static C0059s m140b(Activity activity) {
        return (C0059s) activity.getFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m138a(Event.ON_CREATE);
    }

    /* renamed from: a */
    public static void m137a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0059s(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m138a(Event event) {
        Activity activity = getActivity();
        if (activity instanceof C0047k) {
            ((C0047k) activity).mo119a().mo116a(event);
            return;
        }
        if (activity instanceof C0043i) {
            Lifecycle lifecycle = ((C0043i) activity).getLifecycle();
            if (lifecycle instanceof C0044j) {
                ((C0044j) lifecycle).mo116a(event);
            }
        }
    }
}
