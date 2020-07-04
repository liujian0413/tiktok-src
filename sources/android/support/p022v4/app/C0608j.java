package android.support.p022v4.app;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment.SavedState;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: android.support.v4.app.j */
public abstract class C0608j {

    /* renamed from: android.support.v4.app.j$a */
    public static abstract class C0609a {
        public void onFragmentActivityCreated(C0608j jVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(C0608j jVar, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(C0608j jVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(C0608j jVar, Fragment fragment) {
        }

        public void onFragmentDetached(C0608j jVar, Fragment fragment) {
        }

        public void onFragmentPaused(C0608j jVar, Fragment fragment) {
        }

        public void onFragmentPreAttached(C0608j jVar, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(C0608j jVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(C0608j jVar, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(C0608j jVar, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(C0608j jVar, Fragment fragment) {
        }

        public void onFragmentStopped(C0608j jVar, Fragment fragment) {
        }

        public void onFragmentViewCreated(C0608j jVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(C0608j jVar, Fragment fragment) {
        }
    }

    /* renamed from: android.support.v4.app.j$b */
    public interface C0610b {
        /* renamed from: a */
        void mo2671a();
    }

    /* renamed from: a */
    public abstract SavedState mo2641a(Fragment fragment);

    /* renamed from: a */
    public abstract Fragment mo2642a(int i);

    /* renamed from: a */
    public abstract Fragment mo2643a(Bundle bundle, String str);

    /* renamed from: a */
    public abstract Fragment mo2644a(String str);

    /* renamed from: a */
    public abstract C0633q mo2645a();

    /* renamed from: a */
    public abstract void mo2646a(int i, int i2);

    /* renamed from: a */
    public abstract void mo2647a(Bundle bundle, String str, Fragment fragment);

    /* renamed from: a */
    public abstract void mo2648a(C0609a aVar);

    /* renamed from: a */
    public abstract void mo2649a(C0609a aVar, boolean z);

    /* renamed from: a */
    public abstract void mo2650a(C0610b bVar);

    /* renamed from: a */
    public abstract void mo2651a(String str, int i);

    /* renamed from: a */
    public abstract void mo2652a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract void mo2653b(C0610b bVar);

    /* renamed from: b */
    public abstract boolean mo2654b();

    /* renamed from: c */
    public abstract void mo2655c();

    /* renamed from: d */
    public abstract boolean mo2656d();

    /* renamed from: e */
    public abstract int mo2657e();

    /* renamed from: f */
    public abstract List<Fragment> mo2658f();

    /* renamed from: g */
    public abstract boolean mo2659g();

    /* renamed from: h */
    public abstract boolean mo2660h();
}
