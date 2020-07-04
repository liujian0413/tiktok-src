package org.greenrobot.eventbus.util;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import org.greenrobot.eventbus.C7705c;

public final class ErrorDialogManager {

    /* renamed from: a */
    public static C48347b<?> f123447a;

    public static class SupportManagerFragment extends Fragment {

        /* renamed from: a */
        protected boolean f123448a;

        /* renamed from: b */
        protected Bundle f123449b;

        /* renamed from: c */
        private C7705c f123450c;

        /* renamed from: d */
        private boolean f123451d;

        /* renamed from: e */
        private Object f123452e;

        public void onPause() {
            this.f123450c.mo20393c((Object) this);
            super.onPause();
        }

        public void onResume() {
            super.onResume();
            if (this.f123451d) {
                this.f123451d = false;
                return;
            }
            this.f123450c = ErrorDialogManager.f123447a.f123460a.mo121792a();
            this.f123450c.mo20389a((Object) this);
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.f123450c = ErrorDialogManager.f123447a.f123460a.mo121792a();
            this.f123450c.mo20389a((Object) this);
            this.f123451d = true;
        }

        public void onEventMainThread(C48349d dVar) {
            if (ErrorDialogManager.m149941a(this.f123452e, dVar)) {
                C0612l lVar = this.mFragmentManager;
                lVar.mo2654b();
                DialogFragment dialogFragment = (DialogFragment) lVar.mo2644a("de.greenrobot.eventbus.error_dialog");
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                }
                DialogFragment dialogFragment2 = (DialogFragment) ErrorDialogManager.f123447a.mo121794a(dVar, this.f123448a, this.f123449b);
                if (dialogFragment2 != null) {
                    dialogFragment2.show((C0608j) lVar, "de.greenrobot.eventbus.error_dialog");
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m149941a(Object obj, C48349d dVar) {
        if (dVar != null) {
            Object a = dVar.mo121796a();
            if (a != null && !a.equals(obj)) {
                return false;
            }
        }
        return true;
    }
}
