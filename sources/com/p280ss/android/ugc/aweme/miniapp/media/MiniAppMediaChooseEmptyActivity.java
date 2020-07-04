package com.p280ss.android.ugc.aweme.miniapp.media;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity */
public class MiniAppMediaChooseEmptyActivity extends FragmentActivity {

    /* renamed from: a */
    private Fragment f87256a;

    /* renamed from: b */
    private C33410a f87257b;

    /* renamed from: c */
    private int f87258c;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.d_);
        this.f87256a = getSupportFragmentManager().mo2642a((int) R.id.ap4);
        this.f87257b = new C33410a(this, this.f87256a);
        this.f87258c = getIntent().getIntExtra("key_choose_type", 1);
        int intExtra = getIntent().getIntExtra("key_choose_num", 1);
        switch (this.f87258c) {
            case 1:
                this.f87257b.mo85644a();
                break;
            case 2:
                this.f87257b.mo85645a(intExtra);
                break;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i, intent);
        if (intent == null) {
            intent = new Intent();
        }
        ArrayList arrayList = new ArrayList();
        switch (this.f87258c) {
            case 1:
                if (i2 != 0) {
                    arrayList.add(this.f87257b.mo85646b());
                    break;
                }
                break;
            case 2:
                arrayList.addAll(C33410a.m108054a(intent));
                break;
        }
        setResult(11, intent);
        intent.putExtra("key_media_list", arrayList);
        C7167b.m22380b().mo18647a().handleActivityImageResult(i, i2, intent);
        finish();
    }
}
