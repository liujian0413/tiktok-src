package com.p280ss.android.ugc.aweme.miniapp_api.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.AddressInfo */
public class AddressInfo implements Serializable {
    @C6593c(mo15949a = "address")
    private String address;
    private boolean checkState;
    @C6593c(mo15949a = "city")
    private String city;
    @C6593c(mo15949a = "city_code")
    private int cityCode = 0;
    @C6593c(mo15949a = "district")
    private String district;
    @C6593c(mo15949a = "district_code")
    private int districtCode = 0;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private Long f87292id = Long.valueOf(0);
    @C6593c(mo15949a = "name")
    private String name;
    @C6593c(mo15949a = "province")
    private String province;
    @C6593c(mo15949a = "province_code")
    private int provinceCode = 0;
    @C6593c(mo15949a = "telephone")
    private String telephone;

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public int getCityCode() {
        return this.cityCode;
    }

    public String getDistrict() {
        return this.district;
    }

    public int getDistrictCode() {
        return this.districtCode;
    }

    public Long getId() {
        return this.f87292id;
    }

    public String getName() {
        return this.name;
    }

    public String getProvince() {
        return this.province;
    }

    public int getProvinceCode() {
        return this.provinceCode;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public boolean isCheckState() {
        return this.checkState;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCheckState(boolean z) {
        this.checkState = z;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCityCode(int i) {
        this.cityCode = i;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setDistrictCode(int i) {
        this.districtCode = i;
    }

    public void setId(Long l) {
        this.f87292id = l;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setProvinceCode(int i) {
        this.provinceCode = i;
    }

    public void setTelephone(String str) {
        this.telephone = str;
    }
}
