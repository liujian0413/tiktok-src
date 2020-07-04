package com.linecorp.linesdk.auth.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LineAuthenticationCallbackActivity extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, LineAuthenticationActivity.class);
        intent.setData(getIntent().getData());
        intent.setFlags(335544320);
        startActivity(intent);
        finish();
    }
}
