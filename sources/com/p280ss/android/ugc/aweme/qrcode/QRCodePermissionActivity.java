package com.p280ss.android.ugc.aweme.qrcode;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.ActivityCompat;
import android.support.p029v7.app.AppCompatActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a;
import com.p280ss.android.ugc.aweme.qrcode.p1499v2.ScanQRCodeActivityV2;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity */
public class QRCodePermissionActivity extends AppCompatActivity {

    /* renamed from: c */
    public static long f96921c;

    /* renamed from: a */
    public boolean f96922a;

    /* renamed from: b */
    public int f96923b = -1;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    private void m119025b() {
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getShortVideoPluginService().mo90366a(this, true, new C35547a() {
            public final void onSuccess() {
                if (QRCodePermissionActivity.this.f96923b != -1) {
                    ScanQRCodeActivityV2.m119265a((Context) QRCodePermissionActivity.this, QRCodePermissionActivity.this.f96923b);
                } else {
                    ScanQRCodeActivityV2.m119266a((Context) QRCodePermissionActivity.this, QRCodePermissionActivity.this.f96922a);
                }
                QRCodePermissionActivity.this.finish();
            }
        });
    }

    /* renamed from: a */
    private void m119021a() {
        Dialog a = new C10741a(this).mo25657b((int) R.string.ct4).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                QRCodePermissionActivity.this.finish();
            }
        }).mo25650a((int) R.string.afp, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C42969bc.m136401a(QRCodePermissionActivity.this);
                QRCodePermissionActivity.this.finish();
            }
        }).mo25656a().mo25637a();
        a.setOnDismissListener(new OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                QRCodePermissionActivity.this.finish();
            }
        });
        a.show();
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        if (C43162f.m136885a(this) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f96922a = getIntent().getBooleanExtra("enter_from", false);
        this.f96923b = getIntent().getIntExtra("page_from", -1);
        if (z) {
            m119025b();
        } else if (C43162f.m136886a()) {
            ActivityCompat.m2241a(this, new String[]{"android.permission.CAMERA"}, 1);
        } else {
            m119021a();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m119022a(Context context, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f96921c >= 1000) {
            f96921c = currentTimeMillis;
            Intent intent = new Intent(context, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", z);
            context.startActivity(intent);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            for (int i2 : iArr) {
                if (i2 == -1) {
                    m119021a();
                    return;
                }
            }
            m119025b();
        }
    }

    /* renamed from: a */
    public static void m119023a(Context context, boolean z, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f96921c >= 1000) {
            f96921c = currentTimeMillis;
            Intent intent = new Intent(context, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", z);
            intent.putExtra("page_from", i);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m119024a(Context context, boolean z, boolean z2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f96921c >= 1000) {
            f96921c = currentTimeMillis;
            Intent intent = new Intent(context, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", false);
            intent.putExtra("enter_from", z2);
            context.startActivity(intent);
        }
    }
}
