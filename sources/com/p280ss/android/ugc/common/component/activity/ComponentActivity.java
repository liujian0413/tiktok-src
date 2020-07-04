package com.p280ss.android.ugc.common.component.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.ies.uikit.base.AbsActivity;

/* renamed from: com.ss.android.ugc.common.component.activity.ComponentActivity */
public abstract class ComponentActivity extends AbsActivity {

    /* renamed from: a */
    private SparseArray<Object> f113031a;

    /* renamed from: a */
    public abstract SparseArray<Object> mo105652a();

    public void onPause() {
        super.onPause();
        for (int i = 0; i < this.f113031a.size(); i++) {
            this.f113031a.valueAt(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        for (int i = 0; i < this.f113031a.size(); i++) {
            this.f113031a.valueAt(i);
        }
    }

    public void onResume() {
        super.onResume();
        for (int i = 0; i < this.f113031a.size(); i++) {
            this.f113031a.valueAt(i);
        }
    }

    public void onStart() {
        super.onStart();
        for (int i = 0; i < this.f113031a.size(); i++) {
            this.f113031a.valueAt(i);
        }
    }

    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.f113031a.size(); i++) {
            this.f113031a.valueAt(i);
        }
    }

    public void onDestroy() {
        for (int i = 0; i < this.f113031a.size(); i++) {
            this.f113031a.valueAt(i);
        }
        if (this.f113031a != null) {
            this.f113031a.clear();
            this.f113031a = null;
        }
        super.onDestroy();
    }

    public void onCreate(Bundle bundle) {
        this.f113031a = mo105652a();
        super.onCreate(bundle);
        for (int i = 0; i < this.f113031a.size(); i++) {
            this.f113031a.valueAt(i);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        for (int i = 0; i < this.f113031a.size(); i++) {
            this.f113031a.valueAt(i);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (int i3 = 0; i3 < this.f113031a.size(); i3++) {
            this.f113031a.valueAt(i3);
        }
    }
}
