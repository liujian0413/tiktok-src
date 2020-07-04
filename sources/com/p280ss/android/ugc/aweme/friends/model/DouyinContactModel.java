package com.p280ss.android.ugc.aweme.friends.model;

import com.google.common.base.C17434j;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.login.utils.PhoneNumberUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.friends.model.DouyinContactModel */
public class DouyinContactModel {
    @C6593c(mo15949a = "addresses")
    public List<String> addresses;
    @C6593c(mo15949a = "birthday")
    public String birthday;
    @C6593c(mo15949a = "department_name")
    public String department;
    @C6593c(mo15949a = "emails")
    public List<String> emails;
    public String familyName;
    public String givenName;
    @C6593c(mo15949a = "instant_message_addresses")
    public Map<String, String> instantMessageAddresses;
    @C6593c(mo15949a = "job_desc")
    public String jobDesc;
    @C6593c(mo15949a = "image_url")
    public String mImageUrl;
    @C6593c(mo15949a = "modification_date")
    public String modificationDate;
    @C6593c(mo15949a = "name")
    public String name;
    @C6593c(mo15949a = "nick_name")
    public String nickName;
    @C6593c(mo15949a = "note")
    public String note;
    @C6593c(mo15949a = "organization_name")
    public String organization;
    @C6593c(mo15949a = "phone_number")
    public List<String> phoneNumber;
    public String section;
    @C6593c(mo15949a = "urls")
    public List<String> urls;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public String nationalNumber(String str) {
        return PhoneNumberUtil.m105814a(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DouyinContactModel douyinContactModel = (DouyinContactModel) obj;
        if (!C17434j.m57955a(this.phoneNumber, douyinContactModel.phoneNumber) || !C17434j.m57955a(this.name, douyinContactModel.name)) {
            return false;
        }
        return true;
    }
}
