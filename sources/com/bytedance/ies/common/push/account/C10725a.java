package com.bytedance.ies.common.push.account;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.bytedance.ies.common.push.account.a */
public final class C10725a {

    /* renamed from: a */
    private Context f28671a;

    /* renamed from: b */
    private int f28672b;

    /* renamed from: c */
    private boolean f28673c;

    /* renamed from: d */
    private long f28674d;

    /* renamed from: com.bytedance.ies.common.push.account.a$a */
    public static final class C10727a {

        /* renamed from: a */
        public Context f28675a;

        /* renamed from: b */
        public int f28676b = 1;

        /* renamed from: c */
        public boolean f28677c = true;

        /* renamed from: d */
        public long f28678d = 900;

        /* renamed from: a */
        public final C10725a mo25628a() {
            return new C10725a(this);
        }

        public C10727a(Context context) {
            this.f28675a = context;
        }
    }

    /* renamed from: b */
    private String m31303b() {
        return TextUtils.concat(new CharSequence[]{this.f28671a.getPackageName(), ".AccountProvider"}).toString();
    }

    /* renamed from: a */
    public final void mo25627a() {
        if (this.f28671a != null) {
            try {
                String packageName = this.f28671a.getPackageName();
                String string = this.f28671a.getString(this.f28671a.getApplicationInfo().labelRes);
                if (!TextUtils.isEmpty(string)) {
                    if (!TextUtils.isEmpty(packageName)) {
                        Account account = new Account(string, packageName);
                        if (AccountManager.get(this.f28671a).addAccountExplicitly(account, null, null)) {
                            ContentResolver.setIsSyncable(account, m31303b(), 1);
                            ContentResolver.setSyncAutomatically(account, m31303b(), true);
                            ContentResolver.addPeriodicSync(account, m31303b(), new Bundle(), 900);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private C10725a(C10727a aVar) {
        this.f28671a = aVar.f28675a;
        this.f28672b = aVar.f28676b;
        this.f28673c = aVar.f28677c;
        this.f28674d = aVar.f28678d;
    }
}
