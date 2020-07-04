package com.p280ss.android.ugc.aweme.friends.model;

import com.google.common.base.C17434j;
import com.google.gson.p276a.C6591a;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.login.utils.PhoneNumberUtil;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ContactModel */
public class ContactModel {
    @C6591a(mo15945a = false, mo15946b = false)
    public String firstName;
    @C6593c(mo15949a = "invited")
    @C6591a
    public boolean invited;
    @C6591a(mo15945a = false, mo15946b = false)
    public String lastName;
    @C6591a(mo15945a = false, mo15946b = false)
    public String mSection;
    @C6593c(mo15949a = "name")
    @C6591a
    public String name;
    @C6591a(mo15945a = false, mo15946b = false)
    public int originIndex;
    @C6593c(mo15949a = "phone_number")
    @C6591a
    public String phoneNumber;
    @C6591a(mo15945a = false, mo15946b = false)
    public String url;

    public ContactModel() {
    }

    public String nationalNumber() {
        return PhoneNumberUtil.m105814a(this.phoneNumber);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContactModel contactModel = (ContactModel) obj;
        if (!C17434j.m57955a(this.phoneNumber, contactModel.phoneNumber) || !C17434j.m57955a(this.name, contactModel.name)) {
            return false;
        }
        return true;
    }

    public ContactModel(String str, String str2) {
        this.phoneNumber = str;
        this.name = str2;
    }
}
