package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C16019rx;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.bym;

public class AdActivity extends Activity {

    /* renamed from: a */
    private C16019rx f38066a;

    /* renamed from: a */
    public final void mo37361a(int i) {
        super.setRequestedOrientation(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C14724a.m42568a(this, bundle);
    }

    public void setRequestedOrientation(int i) {
        C14724a.m42567a(this, i);
    }

    /* renamed from: a */
    public final void mo37362a(Bundle bundle) {
        super.onCreate(bundle);
        this.f38066a = bym.m50297b().mo41438a((Activity) this);
        if (this.f38066a == null) {
            afm.m45782d("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            this.f38066a.mo37811a(bundle);
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        try {
            if (this.f38066a != null) {
                this.f38066a.mo37820f();
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            if (this.f38066a != null) {
                this.f38066a.mo37821g();
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (this.f38066a != null) {
                this.f38066a.mo37822h();
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            if (this.f38066a != null) {
                this.f38066a.mo37823i();
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f38066a != null) {
                this.f38066a.mo37816b(bundle);
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            if (this.f38066a != null) {
                this.f38066a.mo37824j();
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f38066a != null) {
                this.f38066a.mo37825k();
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private final void m42562a() {
        if (this.f38066a != null) {
            try {
                this.f38066a.mo37826l();
            } catch (RemoteException e) {
                afm.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m42562a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m42562a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m42562a();
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f38066a != null) {
                z = this.f38066a.mo37819e();
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f38066a.mo37810a(i, i2, intent);
        } catch (Exception e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f38066a.mo37813a(C15349d.m44668a(configuration));
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }
}
