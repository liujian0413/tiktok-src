package com.p280ss.android.common.applog;

import android.accounts.Account;

/* renamed from: com.ss.android.common.applog.TeaStorageConfig */
public class TeaStorageConfig {
    private Account account;
    private String dbName;
    private String encryptCountSPName;
    private String spName;

    public Account getAccount() {
        return this.account;
    }

    public String getDbName() {
        return this.dbName;
    }

    public String getEncryptCountSPName() {
        return this.encryptCountSPName;
    }

    public String getSpName() {
        return this.spName;
    }

    public TeaStorageConfig(String str, Account account2, String str2, String str3) {
        this.encryptCountSPName = str;
        this.account = account2;
        this.dbName = str2;
        this.spName = str3;
    }
}
