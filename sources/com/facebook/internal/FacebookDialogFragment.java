package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import com.C1642a;
import com.facebook.C13499h;
import com.facebook.FacebookException;
import com.facebook.internal.C13877ab.C13882a;
import com.facebook.internal.C13877ab.C13884c;

public class FacebookDialogFragment extends DialogFragment {

    /* renamed from: a */
    public Dialog f36723a;

    public void onDestroyView() {
        if (getDialog() != null && this.mRetainInstance) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        if (this.f36723a instanceof C13877ab) {
            ((C13877ab) this.f36723a).mo33515a();
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f36723a == null) {
            mo33485a(null, null);
            this.mShowsDialog = false;
        }
        return this.f36723a;
    }

    /* renamed from: a */
    public final void mo33484a(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f36723a instanceof C13877ab) && isResumed()) {
            ((C13877ab) this.f36723a).mo33515a();
        }
    }

    public void onCreate(Bundle bundle) {
        C13877ab abVar;
        super.onCreate(bundle);
        if (this.f36723a == null) {
            FragmentActivity activity = getActivity();
            Bundle b = C13953v.m41173b(activity.getIntent());
            if (!b.getBoolean("is_fallback", false)) {
                String string = b.getString("action");
                Bundle bundle2 = b.getBundle("params");
                if (C13967z.m41249a(string)) {
                    activity.finish();
                    return;
                }
                abVar = new C13882a(activity, string, bundle2).mo33532a(new C13884c() {
                    /* renamed from: a */
                    public final void mo33486a(Bundle bundle, FacebookException facebookException) {
                        FacebookDialogFragment.this.mo33485a(bundle, facebookException);
                    }
                }).mo33533a();
            } else {
                String string2 = b.getString("url");
                if (C13967z.m41249a(string2)) {
                    activity.finish();
                    return;
                }
                abVar = C13917k.m41081a(activity, string2, C1642a.m8034a("fb%s://bridge/", new Object[]{C13499h.m39725k()}));
                abVar.f36753c = new C13884c() {
                    /* renamed from: a */
                    public final void mo33486a(Bundle bundle, FacebookException facebookException) {
                        FacebookDialogFragment.this.mo33484a(bundle);
                    }
                };
            }
            this.f36723a = abVar;
        }
    }

    /* renamed from: a */
    public final void mo33485a(Bundle bundle, FacebookException facebookException) {
        int i;
        FragmentActivity activity = getActivity();
        Intent a = C13953v.m41159a(activity.getIntent(), bundle, facebookException);
        if (facebookException == null) {
            i = -1;
        } else {
            i = 0;
        }
        activity.setResult(i, a);
        activity.finish();
    }
}
