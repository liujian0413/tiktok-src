package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchCarBrandAladdin */
public final class SearchCarBrandAladdin implements Serializable {
    @C6593c(mo15949a = "car_info")
    private List<Car> carInfo;
    @C6593c(mo15949a = "hot_tag")
    private String hotTag;
    @C6593c(mo15949a = "micro_app_schema_model_list")
    private String microAppSchemaModelList;
    @C6593c(mo15949a = "name")
    private String name;
    @C6593c(mo15949a = "src")
    private String src;

    public final List<Car> getCarInfo() {
        return this.carInfo;
    }

    public final String getHotTag() {
        return this.hotTag;
    }

    public final String getMicroAppSchemaModelList() {
        return this.microAppSchemaModelList;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSrc() {
        return this.src;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.name;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.hotTag;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.src;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        List<Car> list = this.carInfo;
        if (list != null) {
            i4 = list.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str4 = this.microAppSchemaModelList;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 + i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchCarBrandAladdin(name=");
        sb.append(this.name);
        sb.append(", hotTag=");
        sb.append(this.hotTag);
        sb.append(", src=");
        sb.append(this.src);
        sb.append(", carInfo=");
        sb.append(this.carInfo);
        sb.append(", microAppSchemaModelList=");
        sb.append(this.microAppSchemaModelList);
        sb.append(')');
        return sb.toString();
    }

    public final void setCarInfo(List<Car> list) {
        this.carInfo = list;
    }

    public final void setHotTag(String str) {
        this.hotTag = str;
    }

    public final void setMicroAppSchemaModelList(String str) {
        this.microAppSchemaModelList = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSrc(String str) {
        this.src = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCarBrandAladdin)) {
            return false;
        }
        SearchCarBrandAladdin searchCarBrandAladdin = (SearchCarBrandAladdin) obj;
        if (!(!C7573i.m23585a((Object) this.name, (Object) searchCarBrandAladdin.name)) && !(!C7573i.m23585a((Object) this.hotTag, (Object) searchCarBrandAladdin.hotTag)) && !(!C7573i.m23585a((Object) this.src, (Object) searchCarBrandAladdin.src)) && !(!C7573i.m23585a((Object) this.carInfo, (Object) searchCarBrandAladdin.carInfo)) && !(!C7573i.m23585a((Object) this.microAppSchemaModelList, (Object) searchCarBrandAladdin.microAppSchemaModelList))) {
            return true;
        }
        return false;
    }
}
