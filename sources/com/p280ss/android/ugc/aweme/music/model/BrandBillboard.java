package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.BrandBillboard */
public class BrandBillboard implements Serializable {
    @C6593c(mo15949a = "category_list")
    private List<BrandCategory> categoryList;
    @C6593c(mo15949a = "title")
    private String title;

    public List<BrandCategory> getCategoryList() {
        return this.categoryList;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCategoryList(List<BrandCategory> list) {
        this.categoryList = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
