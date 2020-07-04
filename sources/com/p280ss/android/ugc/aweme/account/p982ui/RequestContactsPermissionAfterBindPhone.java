package com.p280ss.android.ugc.aweme.account.p982ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.RequestContactsPermissionAfterBindPhone */
public class RequestContactsPermissionAfterBindPhone extends AmeBaseActivity {

    /* renamed from: a */
    private String f59500a;

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.dm;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58718a(DialogInterface dialogInterface) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f59500a = getIntent().getStringExtra("ENTER_REASON");
        Dialog requestContactsPermissionAfterBindMobile = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).requestContactsPermissionAfterBindMobile(this, this.f59500a);
        if (requestContactsPermissionAfterBindMobile == null) {
            finish();
            return;
        }
        requestContactsPermissionAfterBindMobile.setOnDismissListener(new C22311j(this));
        requestContactsPermissionAfterBindMobile.show();
    }
}
