package com.p280ss.base.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.base.mvp.MvpActivity */
public abstract class MvpActivity extends Activity implements C45783b, C45784c {

    /* renamed from: a */
    private String f117109a;

    /* renamed from: b */
    private Map<String, C45781a> f117110b = new HashMap();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo110979a();

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C45781a c = mo111074c();
        if (c != null) {
            c.mo110993b();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C45781a c = mo111074c();
        if (c != null) {
            c.mo110992a((C45784c) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C45781a c = mo111074c();
        if (c != null) {
            c.mo110988a();
        }
    }

    /* renamed from: c */
    private C45781a mo111074c() {
        C45781a aVar = (C45781a) this.f117110b.get(this.f117109a);
        if (aVar != null) {
            return aVar;
        }
        C45781a b = mo110997b();
        this.f117110b.put(this.f117109a, b);
        return b;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (!isChangingConfigurations()) {
            for (C45781a c : this.f117110b.values()) {
                c.mo110994c();
            }
            this.f117110b.clear();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C45781a c = mo111074c();
        if (c != null) {
            Bundle bundle2 = new Bundle();
            c.mo110991a(bundle2);
            bundle.putBundle("KEY_SAVE_PRESENTER_DATA", bundle2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f117109a = UUID.randomUUID().toString();
        } else {
            this.f117109a = bundle.getString("SAVE_VIEW_UUID");
        }
        mo110979a();
        C45781a c = mo111074c();
        if (c != null) {
            Bundle bundle2 = null;
            if (bundle != null) {
                bundle2 = bundle.getBundle("KEY_SAVE_PRESENTER_DATA");
            }
            c.mo110990a((Context) this, getIntent().getExtras(), bundle2);
        }
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        C45781a c = mo111074c();
        if (c != null) {
            c.mo110991a(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (mo111074c() != null) {
            if (intent == null) {
                intent = new Intent();
            }
            mo111074c().mo110989a(i, i2, intent.getExtras());
        }
    }
}
