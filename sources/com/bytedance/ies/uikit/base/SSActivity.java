package com.bytedance.ies.uikit.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.common.utility.C9729e;
import com.bytedance.ies.uikit.p577b.C10998a;
import com.bytedance.ies.uikit.p577b.C11000b;
import com.bytedance.ies.uikit.p577b.C11005e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class SSActivity extends AbsActivity implements C9729e {

    /* renamed from: a */
    protected int f29791a;

    /* renamed from: b */
    private boolean f29792b;

    public void overridePendingTransition(int i, int i2) {
    }

    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (IllegalStateException unused) {
            finish();
        }
    }

    public void finish() {
        super.finish();
        C11007a.m32266b(this, this.f29791a);
    }

    public void onPause() {
        C11000b.m32244a().mo26572b((Context) this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C11000b.m32244a().mo26574c((Context) this);
    }

    public void onStop() {
        super.onStop();
        C11000b.m32244a().mo26570a((Context) this);
    }

    /* renamed from: a */
    private C10998a mo57175a() {
        C10998a aVar = new C10998a(this, R.layout.j2);
        aVar.mo26552a(17).mo26554a(false).mo26560b(false).mo26556a(C11005e.m32260a(aVar.mo26561c()), C11005e.m32261b(aVar.mo26561c()));
        return aVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29792b = false;
        C11007a.m32265a(this, this.f29791a);
    }

    public void showCustomToast(String str) {
        if (isViewValid()) {
            mo57175a().mo26557a(str);
        }
    }

    /* renamed from: a */
    public final void mo26588a(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    public void showCustomLongToast(int i, String str) {
        if (isViewValid()) {
            mo57175a().mo26558a(str, i);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C11000b.m32244a().mo26574c((Context) this);
        super.onActivityResult(i, i2, intent);
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        if (isViewValid()) {
            mo57175a().mo26553a((long) i2).mo26552a(i3).mo26558a(str, i);
        }
    }
}
