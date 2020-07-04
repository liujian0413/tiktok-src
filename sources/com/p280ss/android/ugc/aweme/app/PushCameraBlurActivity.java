package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.sdk.activity.SSActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23483k;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39828c;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39828c.C39843a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.app.PushCameraBlurActivity */
public class PushCameraBlurActivity extends SSActivity {

    /* renamed from: a */
    private boolean f60391a;

    /* renamed from: b */
    private boolean f60392b;

    /* renamed from: c */
    private boolean f60393c;

    /* renamed from: d */
    private String f60394d;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    private void m74973b() {
        Dialog a = new C10741a(this).mo25649a((int) R.string.cr2).mo25657b((int) R.string.cr0).mo25658b((int) R.string.bce, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                PushCameraBlurActivity.this.finish();
            }
        }).mo25650a((int) R.string.i0, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                PushCameraBlurActivity.this.mo53821a();
                dialogInterface.dismiss();
            }
        }).mo25656a().mo25637a();
        a.setOnCancelListener(new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                PushCameraBlurActivity.this.finish();
            }
        });
        a.setCanceledOnTouchOutside(true);
        a.show();
    }

    /* renamed from: a */
    public final void mo53821a() {
        if (this.f60392b) {
            Intent intent = new Intent();
            intent.putExtra("sticker_pannel_show", true);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) this, intent);
            finish();
            return;
        }
        if (this.f60393c && !C23483k.m77110a(this.f60394d)) {
            C39828c cVar = new C39828c();
            cVar.f103519h = new C39843a() {
                /* renamed from: a */
                public final void mo59437a() {
                    PushCameraBlurActivity.this.finish();
                }

                /* renamed from: a */
                public final void mo59438a(String str) {
                    PushCameraBlurActivity.this.finish();
                }
            };
            cVar.mo99245a(this.f60394d, (Activity) this, "push");
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f60391a = intent.getBooleanExtra("show_dialog", false);
        this.f60392b = intent.getBooleanExtra("show_effect", false);
        this.f60393c = intent.getBooleanExtra("show_duet", false);
        this.f60394d = intent.getStringExtra("aid");
        if (this.f60391a) {
            setContentView((int) R.layout.es);
            m74973b();
        } else {
            mo53821a();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", false);
    }
}
