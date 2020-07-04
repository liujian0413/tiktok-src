package com.p280ss.android.ugc.aweme.share.command;

import android.content.Intent;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;

/* renamed from: com.ss.android.ugc.aweme.share.command.i */
public final class C38022i extends C38009b {
    /* renamed from: a */
    public final boolean mo95652a(final String str, final String str2, final int i) {
        if (C33447f.m108191d(str)) {
            return false;
        }
        C6726a.m20843a(new Runnable() {
            public final void run() {
                Intent intent = new Intent(AwemeApplication.m21341a(), ShareCommandActivity.class);
                intent.putExtra("command_code", str);
                intent.putExtra("command_type", str2);
                intent.putExtra("qr_code_type", i);
                intent.addFlags(268435456);
                AwemeApplication.m21341a().startActivity(intent);
            }
        }, 100);
        return true;
    }
}
