package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiProductInfo */
public class PoiProductInfo implements Serializable {
    @C6593c(mo15949a = "contact_phone_no")
    public String contactNo;
    @C6593c(mo15949a = "hotel_feature")
    public List<Object> hotelFeatures;
    @C6593c(mo15949a = "products")
    public List<PoiDcdCar> products;
    @C6593c(mo15949a = "display_style")
    public int style;
    @C6593c(mo15949a = "supplier_id")
    public String supplierId;
    @C6593c(mo15949a = "sp_source")
    public String supplierSource;
    @C6593c(mo15949a = "title")
    public String title;
    @C6593c(mo15949a = "url")
    public String url;
    @C6593c(mo15949a = "url_title")
    public String urlTitle;

    public boolean isDcd() {
        if (this.style == 1) {
            return true;
        }
        return false;
    }

    public boolean isValidStyle() {
        if (this.style == 1 || this.style == 2) {
            return true;
        }
        return false;
    }
}
