package com.facebook.bidding.p674a.p679e;

import android.content.Context;
import com.facebook.bidding.C13202a;
import com.facebook.bidding.p674a.p681h.p682a.C13228h;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.bidding.a.e.b */
public final class C13216b {
    /* renamed from: a */
    public static C13215a m38619a(C13202a aVar) {
        return new C13215a(aVar.f34986a, "Bid timeout - Please consider increasing the timeout.", aVar.f34995j);
    }

    /* renamed from: a */
    public static C13215a m38620a(C13202a aVar, C13228h hVar) {
        return hVar.f35052a == 200 ? m38624c(aVar, hVar) : m38623b(aVar, hVar);
    }

    /* renamed from: a */
    public static C13215a m38621a(C13202a aVar, String str) {
        Context context = aVar.f34986a;
        StringBuilder sb = new StringBuilder("Failed to send a bid request - ");
        sb.append(str);
        sb.append(" Please check your network connection and make sure you are passing in the correct values.");
        return new C13215a(context, sb.toString(), aVar.f34995j);
    }

    /* renamed from: a */
    private static String m38622a(C13228h hVar, String str) {
        List list = (List) hVar.f35054c.get(str);
        if (list == null) {
            return null;
        }
        return list.toString();
    }

    /* renamed from: b */
    private static C13215a m38623b(C13202a aVar, C13228h hVar) {
        StringBuilder sb;
        String sb2;
        String a = m38622a(hVar, "x-fb-debug");
        String a2 = m38622a(hVar, "x-fb-an-request-id");
        String a3 = m38622a(hVar, "x-fb-an-errors");
        int i = hVar.f35052a;
        if (i == 204) {
            sb = new StringBuilder("No bid - ");
            sb.append(a3);
            sb2 = sb.toString();
        } else if (i != 400) {
            sb2 = "Unexpected error - Please reach out to your account manager for technical support by providing auction platform id, bid request id, debug header for debugging purpose.";
        } else {
            sb = new StringBuilder("Invalid bid request - ");
            sb.append(a3);
            a3 = " Please make sure you are passing in all the required parameters with correct values.";
            sb.append(a3);
            sb2 = sb.toString();
        }
        C13215a aVar2 = new C13215a(aVar.f34986a, sb2, hVar.f35052a, a2, a, aVar.f34995j);
        return aVar2;
    }

    /* renamed from: c */
    private static C13215a m38624c(C13202a aVar, C13228h hVar) {
        C13202a aVar2 = aVar;
        C13228h hVar2 = hVar;
        String a = m38622a(hVar2, "x-fb-debug");
        String a2 = m38622a(hVar2, "x-fb-an-request-id");
        try {
            JSONObject jSONObject = new JSONObject(hVar.mo32418a());
            JSONObject jSONObject2 = jSONObject.getJSONArray("seatbid").getJSONObject(0).getJSONArray("bid").getJSONObject(0);
            String string = jSONObject2.getString("adm");
            Context context = aVar2.f34986a;
            String str = aVar2.f34995j;
            String string2 = jSONObject2.getString("impid");
            C13215a aVar3 = new C13215a(context, str, string2, new JSONObject(string).getString("resolved_placement_id"), a2, jSONObject2.getDouble("price"), jSONObject.getString("cur"), string, jSONObject2.getString("nurl"), jSONObject2.getString("lurl"), hVar2.f35052a, a);
            return aVar3;
        } catch (JSONException unused) {
            C13215a aVar4 = new C13215a(aVar2.f34986a, "Failed to parse the bid response.", hVar2.f35052a, a2, a, aVar2.f34995j);
            return aVar4;
        }
    }
}
