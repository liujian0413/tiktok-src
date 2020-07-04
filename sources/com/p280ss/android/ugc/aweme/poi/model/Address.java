package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.Address */
public class Address implements Serializable {
    @C6593c(mo15949a = "address")
    public String address;
    @C6593c(mo15949a = "city")
    public String city;
    @C6593c(mo15949a = "city_code")
    public String cityCode;
    @C6593c(mo15949a = "country")
    public String country;
    @C6593c(mo15949a = "country_code")
    public String countryCode;
    @C6593c(mo15949a = "district")
    public String district;
    @C6593c(mo15949a = "province")
    public String province;
    @C6593c(mo15949a = "simple_addr")
    public String simpleAddr;

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvince() {
        return this.province;
    }

    public String getSimpleAddr() {
        return this.simpleAddr;
    }

    public com.p280ss.android.ugc.aweme.sticker.data.Address toStickerPoiCard() {
        com.p280ss.android.ugc.aweme.sticker.data.Address address2 = new com.p280ss.android.ugc.aweme.sticker.data.Address();
        address2.setProvice(this.province);
        address2.setCity(this.city);
        address2.setDistrict(this.district);
        address2.setAddress(this.address);
        address2.setSimpleAddr(this.simpleAddr);
        return address2;
    }

    public void setCityCode(String str) {
        this.cityCode = str;
    }

    public void setSimpleAddr(String str) {
        this.simpleAddr = str;
    }

    public void fromStickerPoiStruct(com.p280ss.android.ugc.aweme.sticker.data.Address address2) {
        if (address2 != null) {
            this.province = address2.getProvice();
            this.city = address2.getCity();
            this.district = address2.getDistrict();
            this.address = address2.getAddress();
            this.simpleAddr = address2.getSimpleAddr();
        }
    }
}
