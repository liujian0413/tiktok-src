package com.p280ss.android.ugc.aweme.sticker.data;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.Address */
public class Address implements Serializable {
    @C6593c(mo15949a = "address")
    public String address;
    @C6593c(mo15949a = "city")
    public String city;
    @C6593c(mo15949a = "district")
    public String district;
    @C6593c(mo15949a = "province")
    public String provice;
    @C6593c(mo15949a = "simple_addr")
    public String simpleAddr;

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvice() {
        return this.provice;
    }

    public String getSimpleAddr() {
        return this.simpleAddr;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setProvice(String str) {
        this.provice = str;
    }

    public void setSimpleAddr(String str) {
        this.simpleAddr = str;
    }
}
