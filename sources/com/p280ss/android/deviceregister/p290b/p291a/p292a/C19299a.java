package com.p280ss.android.deviceregister.p290b.p291a.p292a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.p254b.C6304f;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.deviceregister.b.a.a.a */
public final class C19299a extends C19301b {

    /* renamed from: a */
    public final AccountManager f52201a;

    /* renamed from: b */
    public final ConcurrentHashMap<String, String> f52202b = new ConcurrentHashMap<>();

    /* renamed from: d */
    private Account f52203d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo51197a(String str) {
        if (this.f52203d == null) {
            return null;
        }
        try {
            return this.f52201a.getUserData(this.f52203d, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public C19299a(Context context) {
        this.f52201a = AccountManager.get(context);
    }

    /* renamed from: a */
    public final void mo51198a(final Account account) {
        if (account != null) {
            this.f52203d = account;
            if (this.f52202b != null && this.f52202b.size() > 0) {
                C6304f.submitRunnable(new Runnable() {
                    public final void run() {
                        try {
                            if (C19299a.this.f52202b != null && C19299a.this.f52202b.size() > 0) {
                                if (C19299a.this.f52201a != null) {
                                    for (Entry entry : C19299a.this.f52202b.entrySet()) {
                                        if (entry != null) {
                                            C19299a.this.f52201a.setUserData(account, (String) entry.getKey(), (String) entry.getValue());
                                        }
                                    }
                                    C19299a.this.f52202b.clear();
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String[] mo51201b(String str) {
        String a = mo51197a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return a.split("\n");
    }

    /* renamed from: c */
    public final void mo51202c(String str) {
        if (this.f52202b != null && this.f52202b.containsKey(str)) {
            this.f52202b.remove(str);
        }
        try {
            if (!(this.f52203d == null || this.f52201a == null)) {
                this.f52201a.setUserData(this.f52203d, str, null);
            }
        } catch (Exception unused) {
        }
        super.mo51202c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51199a(String str, String str2) {
        if (this.f52203d == null) {
            this.f52202b.put(str, str2);
        } else if (str != null && str2 != null) {
            try {
                this.f52201a.setUserData(this.f52203d, str, str2);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51200a(String str, String[] strArr) {
        if (strArr != null) {
            mo51199a(str, TextUtils.join("\n", strArr));
        }
    }
}
