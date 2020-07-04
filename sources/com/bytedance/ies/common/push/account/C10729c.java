package com.bytedance.ies.common.push.account;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.bytedance.ies.common.push.p560a.C10723a;

/* renamed from: com.bytedance.ies.common.push.account.c */
public final class C10729c extends AbstractThreadedSyncAdapter {
    /* renamed from: a */
    private void m31306a() {
        if (getContext() != null) {
            C10723a.f28666a.mo25615a(getContext());
        }
    }

    public C10729c(Context context, boolean z) {
        super(context, true);
    }

    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        m31306a();
    }
}
