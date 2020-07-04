package com.snapchat.kit.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SnapKitActivity extends Activity {

    /* renamed from: a */
    OAuth2Manager f50366a;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        SnapKitComponent component = SnapKit.getComponent(this);
        if (component == null) {
            finish();
            return;
        }
        component.inject(this);
        if (this.f50366a.mo48850a(intent)) {
            this.f50366a.mo48846a(intent.getData());
        }
        finish();
    }
}
