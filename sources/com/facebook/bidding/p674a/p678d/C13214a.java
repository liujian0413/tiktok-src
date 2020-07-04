package com.facebook.bidding.p674a.p678d;

import android.content.Context;
import com.facebook.ads.AdSettings;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.bidding.C13202a;
import com.facebook.bidding.FBAdBidFormat;
import com.facebook.bidding.p674a.p675a.C13205a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.bidding.a.d.a */
public final class C13214a {

    /* renamed from: a */
    private static String f35012a;

    /* renamed from: a */
    private static String m38612a(Context context) {
        if (f35012a == null) {
            f35012a = BidderTokenProvider.getBidderToken(context);
        }
        return f35012a;
    }

    /* renamed from: a */
    public static String m38613a(C13202a aVar) {
        int i = 0;
        JSONObject put = new JSONObject().put("id", aVar.f34995j).put("imp", m38614a(aVar.f34989d, aVar.f34996k, aVar.f34988c)).put("app", new JSONObject().put("publisher", new JSONObject().put("id", aVar.f34987b))).put("device", new JSONObject().put("dnt", (aVar.f34991f || C13205a.m38595a(aVar.f34986a)) ? 1 : 0)).put("user", new JSONObject().put("buyeruid", m38612a(aVar.f34986a)));
        String str = "regs";
        JSONObject jSONObject = new JSONObject();
        String str2 = "coppa";
        if (aVar.f34994i || m38616a()) {
            i = 1;
        }
        return put.put(str, jSONObject.put(str2, i)).put("at", aVar.f34993h.getValue()).put("tmax", aVar.f34990e).put("test", aVar.f34992g ? 1 : 0).put("ext", new JSONObject().put("platformid", aVar.mo32398a())).toString();
    }

    /* renamed from: a */
    private static JSONArray m38614a(FBAdBidFormat fBAdBidFormat, String str, String str2) {
        return new JSONArray().put(new JSONObject().put("id", str).put("tagid", str2).put("instl", fBAdBidFormat.getInstl()).put(fBAdBidFormat.getFormatLabel(), m38615a(fBAdBidFormat)));
    }

    /* renamed from: a */
    private static JSONObject m38615a(FBAdBidFormat fBAdBidFormat) {
        return new JSONObject().put("h", fBAdBidFormat.getHeight()).put("w", fBAdBidFormat.getWidth()).put("linearity", fBAdBidFormat.getLinearity());
    }

    /* renamed from: a */
    private static boolean m38616a() {
        return AdSettings.isChildDirected();
    }
}
