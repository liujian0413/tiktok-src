package com.p280ss.android.ugc.aweme.commerce;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.SmartPhone */
public class SmartPhone implements Serializable {
    @C6593c(mo15949a = "encrypt_key")
    public String encryptKey;
    @C6593c(mo15949a = "phone_id")
    public String phoneId;
    @C6593c(mo15949a = "phone_number")
    public String phoneNumber;

    public String getEncryptKey() {
        return this.encryptKey;
    }

    public String getPhoneId() {
        return this.phoneId;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setEncryptKey(String str) {
        this.encryptKey = str;
    }

    public void setPhoneId(String str) {
        this.phoneId = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }
}
