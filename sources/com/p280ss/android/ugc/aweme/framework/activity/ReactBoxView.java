package com.p280ss.android.ugc.aweme.framework.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.framework.p1277f.C29967a;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.framework.activity.ReactBoxView */
public class ReactBoxView extends C29945a {

    /* renamed from: e */
    public boolean f78728e;

    /* renamed from: f */
    private String f78729f = UUID.randomUUID().toString();

    /* renamed from: c */
    public final void mo67483c() {
        finish();
    }

    /* renamed from: d */
    public final void mo67487d() {
        super.mo67487d();
    }

    public Activity getActivity() {
        return this;
    }

    public String getReactId() {
        return this.f78729f;
    }

    public /* bridge */ /* synthetic */ void invokeDefaultOnBackPressed() {
        super.invokeDefaultOnBackPressed();
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.framework.activity.ReactBoxView", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.framework.activity.ReactBoxView", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.framework.activity.ReactBoxView", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.framework.activity.ReactBoxView", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.framework.activity.ReactBoxView", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final boolean mo67478a(String str) {
        return TextUtils.equals(str, this.f78729f);
    }

    /* renamed from: b */
    public final void mo67481b(boolean z) {
        if (!this.f78728e) {
            C29967a.m98251a(this, getWindow(), z);
        }
        this.f78728e = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo76104a(Intent intent) {
        if (!TextUtils.isEmpty(intent.getStringExtra("component_name"))) {
            return intent.getStringExtra("component_name");
        }
        if (intent.getExtras() == null) {
            return "Index";
        }
        return intent.getExtras().getString("FIELD_COMPONENT_NAME", "Index");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Bundle mo76105b(Intent intent) {
        if (getIntent().getExtras() == null) {
            Bundle bundle = new Bundle();
            bundle.putString("reactId", this.f78729f);
            return bundle;
        }
        Bundle extras = getIntent().getExtras();
        extras.putString("reactId", this.f78729f);
        return extras;
    }
}
