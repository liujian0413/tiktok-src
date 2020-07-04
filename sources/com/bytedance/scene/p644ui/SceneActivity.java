package com.bytedance.scene.p644ui;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import com.bytedance.scene.C12626i;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12642n;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.bytedance.scene.ui.SceneActivity */
public abstract class SceneActivity extends AppCompatActivity {

    /* renamed from: a */
    private C12642n f33658a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Class<? extends C12629j> mo31130a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo31131b();

    public void onBackPressed() {
        if (!this.f33658a.mo30877a()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | PreloadTask.BYTE_UNIT_NUMBER);
        }
        this.f33658a = C12626i.m36626a((Activity) this, mo31130a()).mo30989a(mo31131b()).mo30990a();
    }
}
