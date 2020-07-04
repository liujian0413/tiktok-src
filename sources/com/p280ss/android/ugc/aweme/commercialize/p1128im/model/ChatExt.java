package com.p280ss.android.ugc.aweme.commercialize.p1128im.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import java.io.Serializable;
import java.text.DecimalFormat;

/* renamed from: com.ss.android.ugc.aweme.commercialize.im.model.ChatExt */
public class ChatExt implements Serializable {
    public static final DecimalFormat GPS_FMT = new DecimalFormat("##0.000000");
    @C6593c(mo15949a = "ext")
    public String ext = "";
    @C6593c(mo15949a = "location")
    public String location = "";

    public void setLoc(LocationBundle locationBundle) {
        if (locationBundle != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(GPS_FMT.format(locationBundle.longitude));
            sb.append(",");
            sb.append(GPS_FMT.format(locationBundle.latitude));
            this.location = sb.toString();
        }
    }
}
