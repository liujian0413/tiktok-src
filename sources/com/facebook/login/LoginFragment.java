package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.login.LoginClient.C14087b;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LoginFragment extends Fragment {

    /* renamed from: a */
    public LoginClient f37221a;

    /* renamed from: b */
    private String f37222b;

    /* renamed from: c */
    private Request f37223c;

    /* renamed from: a */
    private LoginClient m41572a() {
        return new LoginClient((Fragment) this);
    }

    public void onDestroy() {
        this.f37221a.mo33776c();
        super.onDestroy();
    }

    public void onPause() {
        View view;
        super.onPause();
        if (getView() == null) {
            view = null;
        } else {
            view = getView().findViewById(R.id.ye);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f37222b == null) {
            getActivity().finish();
        } else {
            this.f37221a.mo33772a(this.f37223c);
        }
    }

    /* renamed from: a */
    private void m41573a(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f37222b = callingActivity.getPackageName();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f37221a);
    }

    /* renamed from: a */
    public final void mo33798a(Result result) {
        int i;
        this.f37223c = null;
        if (result.f37209a == C14085a.CANCEL) {
            i = 0;
        } else {
            i = -1;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (isAdded()) {
            getActivity().setResult(i, intent);
            getActivity().finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f37221a = (LoginClient) bundle.getParcelable("loginClient");
            this.f37221a.mo33771a((Fragment) this);
        } else {
            this.f37221a = m41572a();
        }
        this.f37221a.f37193d = new C14087b() {
            /* renamed from: a */
            public final void mo33797a(Result result) {
                LoginFragment.this.mo33798a(result);
            }
        };
        FragmentActivity activity = getActivity();
        if (activity != null) {
            m41573a((Activity) activity);
            Intent intent = activity.getIntent();
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request");
                if (bundleExtra != null) {
                    this.f37223c = (Request) bundleExtra.getParcelable("request");
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f37221a.mo33774a(i, i2, intent);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ih, viewGroup, false);
        final View findViewById = inflate.findViewById(R.id.ye);
        this.f37221a.f37194e = new C14086a() {
            /* renamed from: a */
            public final void mo33795a() {
                findViewById.setVisibility(0);
            }

            /* renamed from: b */
            public final void mo33796b() {
                findViewById.setVisibility(8);
            }
        };
        return inflate;
    }
}
