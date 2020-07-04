package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.BrandCategory */
public class BrandCategory implements Serializable {
    @C6593c(mo15949a = "brand_list")
    private List<Brand> brandList;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private int f88171id;
    @C6593c(mo15949a = "name")
    private String name;
    @C6593c(mo15949a = "weekly_info")
    private BillboardWeeklyInfoStruct weeklyInfo;

    public List<Brand> getBrandList() {
        return this.brandList;
    }

    public int getId() {
        return this.f88171id;
    }

    public String getName() {
        return this.name;
    }

    public BillboardWeeklyInfoStruct getWeeklyInfo() {
        return this.weeklyInfo;
    }

    public void setBrandList(List<Brand> list) {
        this.brandList = list;
    }

    public void setId(int i) {
        this.f88171id = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setWeeklyInfo(BillboardWeeklyInfoStruct billboardWeeklyInfoStruct) {
        this.weeklyInfo = billboardWeeklyInfoStruct;
    }
}
