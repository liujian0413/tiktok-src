package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchCarModelAladdin */
public final class SearchCarModelAladdin {
    @C6593c(mo15949a = "car_info")
    public Car carInfo;
    @C6593c(mo15949a = "micro_app_schema_video")
    public String microAppSchemaVideo;
    @C6593c(mo15949a = "src")
    public String src;

    public final int hashCode() {
        int i;
        int i2;
        Car car = this.carInfo;
        int i3 = 0;
        if (car != null) {
            i = car.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str = this.src;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.microAppSchemaVideo;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchCarModelAladdin(carInfo=");
        sb.append(this.carInfo);
        sb.append(", src=");
        sb.append(this.src);
        sb.append(", microAppSchemaVideo=");
        sb.append(this.microAppSchemaVideo);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCarModelAladdin)) {
            return false;
        }
        SearchCarModelAladdin searchCarModelAladdin = (SearchCarModelAladdin) obj;
        if (!(!C7573i.m23585a((Object) this.carInfo, (Object) searchCarModelAladdin.carInfo)) && !(!C7573i.m23585a((Object) this.src, (Object) searchCarModelAladdin.src)) && !(!C7573i.m23585a((Object) this.microAppSchemaVideo, (Object) searchCarModelAladdin.microAppSchemaVideo))) {
            return true;
        }
        return false;
    }
}
