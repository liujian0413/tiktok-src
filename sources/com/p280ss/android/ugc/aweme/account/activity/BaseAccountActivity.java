package com.p280ss.android.ugc.aweme.account.activity;

import android.os.Bundle;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;

/* renamed from: com.ss.android.ugc.aweme.account.activity.BaseAccountActivity */
public class BaseAccountActivity extends AmeSSActivity {

    /* renamed from: a */
    protected String f56675a;

    /* renamed from: b */
    protected String f56676b;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f56675a = getIntent().getStringExtra("enter_from");
        this.f56676b = getIntent().getStringExtra("enter_method");
    }
}
