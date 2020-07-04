package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Car */
public final class Car implements Serializable {
    @C6593c(mo15949a = "car_icon")
    private UrlModel carIcon;
    @C6593c(mo15949a = "car_items")
    private List<? extends Aweme> carItems;
    @C6593c(mo15949a = "desc")
    private String desc;
    @C6593c(mo15949a = "micro_app_schema_model")
    private String microAppSchemaModel;
    @C6593c(mo15949a = "price")
    private String price;
    @C6593c(mo15949a = "rank_list")
    private String rankList;
    @C6593c(mo15949a = "title")
    private String title;

    public final UrlModel getCarIcon() {
        return this.carIcon;
    }

    public final List<Aweme> getCarItems() {
        return this.carItems;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getMicroAppSchemaModel() {
        return this.microAppSchemaModel;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getRankList() {
        return this.rankList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.title;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str2 = this.price;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.desc;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str4 = this.rankList;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        UrlModel urlModel = this.carIcon;
        if (urlModel != null) {
            i5 = urlModel.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        String str5 = this.microAppSchemaModel;
        if (str5 != null) {
            i6 = str5.hashCode();
        }
        return i11 + i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Car(title=");
        sb.append(this.title);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", rankList=");
        sb.append(this.rankList);
        sb.append(',');
        sb.append(" carIcon=");
        sb.append(this.carIcon);
        sb.append(", microAppSchemaModelList=");
        sb.append(this.microAppSchemaModel);
        sb.append(')');
        return sb.toString();
    }

    public final void setCarIcon(UrlModel urlModel) {
        this.carIcon = urlModel;
    }

    public final void setCarItems(List<? extends Aweme> list) {
        this.carItems = list;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setMicroAppSchemaModel(String str) {
        this.microAppSchemaModel = str;
    }

    public final void setPrice(String str) {
        this.price = str;
    }

    public final void setRankList(String str) {
        this.rankList = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final boolean equals(Object obj) {
        Class cls;
        if (this == obj) {
            return true;
        }
        Class cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C7573i.m23585a((Object) cls2, (Object) cls)) {
            return false;
        }
        if (obj != null) {
            Car car = (Car) obj;
            if (!(!C7573i.m23585a((Object) this.title, (Object) car.title)) && !(!C7573i.m23585a((Object) this.price, (Object) car.price)) && !(!C7573i.m23585a((Object) this.desc, (Object) car.desc)) && !(!C7573i.m23585a((Object) this.rankList, (Object) car.rankList)) && !(!C7573i.m23585a((Object) this.carIcon, (Object) car.carIcon)) && !(!C7573i.m23585a((Object) this.microAppSchemaModel, (Object) car.microAppSchemaModel))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.Car");
    }
}
