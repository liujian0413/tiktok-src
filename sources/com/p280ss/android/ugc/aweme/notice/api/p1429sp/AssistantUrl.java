package com.p280ss.android.ugc.aweme.notice.api.p1429sp;

import android.support.annotation.Keep;
import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

@Keep
/* renamed from: com.ss.android.ugc.aweme.notice.api.sp.AssistantUrl */
public final class AssistantUrl {
    @C6593c(mo15949a = "douplus_assistant_url")
    public final String douplusAssistantUrl;
    @C6593c(mo15949a = "service_assistant_url")
    public final String serviceAssistantUrl;
    @C6593c(mo15949a = "shop_assistant_url")
    public final String shopAssistantUrl;

    public AssistantUrl() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AssistantUrl copy$default(AssistantUrl assistantUrl, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assistantUrl.serviceAssistantUrl;
        }
        if ((i & 2) != 0) {
            str2 = assistantUrl.shopAssistantUrl;
        }
        if ((i & 4) != 0) {
            str3 = assistantUrl.douplusAssistantUrl;
        }
        return assistantUrl.copy(str, str2, str3);
    }

    public final String component1() {
        return this.serviceAssistantUrl;
    }

    public final String component2() {
        return this.shopAssistantUrl;
    }

    public final String component3() {
        return this.douplusAssistantUrl;
    }

    public final AssistantUrl copy(String str, String str2, String str3) {
        C7573i.m23587b(str, "serviceAssistantUrl");
        C7573i.m23587b(str2, "shopAssistantUrl");
        C7573i.m23587b(str3, "douplusAssistantUrl");
        return new AssistantUrl(str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.douplusAssistantUrl, (java.lang.Object) r3.douplusAssistantUrl) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.notice.api.p1429sp.AssistantUrl
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.notice.api.sp.AssistantUrl r3 = (com.p280ss.android.ugc.aweme.notice.api.p1429sp.AssistantUrl) r3
            java.lang.String r0 = r2.serviceAssistantUrl
            java.lang.String r1 = r3.serviceAssistantUrl
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.shopAssistantUrl
            java.lang.String r1 = r3.shopAssistantUrl
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.douplusAssistantUrl
            java.lang.String r3 = r3.douplusAssistantUrl
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notice.api.p1429sp.AssistantUrl.equals(java.lang.Object):boolean");
    }

    public final String getDouplusAssistantUrl() {
        return this.douplusAssistantUrl;
    }

    public final String getServiceAssistantUrl() {
        return this.serviceAssistantUrl;
    }

    public final String getShopAssistantUrl() {
        return this.shopAssistantUrl;
    }

    public final int hashCode() {
        String str = this.serviceAssistantUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.shopAssistantUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.douplusAssistantUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssistantUrl(serviceAssistantUrl=");
        sb.append(this.serviceAssistantUrl);
        sb.append(", shopAssistantUrl=");
        sb.append(this.shopAssistantUrl);
        sb.append(", douplusAssistantUrl=");
        sb.append(this.douplusAssistantUrl);
        sb.append(")");
        return sb.toString();
    }

    public AssistantUrl(String str, String str2, String str3) {
        C7573i.m23587b(str, "serviceAssistantUrl");
        C7573i.m23587b(str2, "shopAssistantUrl");
        C7573i.m23587b(str3, "douplusAssistantUrl");
        this.serviceAssistantUrl = str;
        this.shopAssistantUrl = str2;
        this.douplusAssistantUrl = str3;
    }

    public /* synthetic */ AssistantUrl(String str, String str2, String str3, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fpoi_rn_web%2Fservice_assistant%3Fstatus_font_dark%3D0%26hide_nav_bar%3D1%26bg_theme%3D161823%26disable_pop_gesture%3D0%26enterFrom%3Dmessage%26status_font_dark%3D0%26hide_nav_bar%3D1%26bg_theme%3D161823%26disable_pop_gesture%3D0";
        }
        if ((i & 2) != 0) {
            str2 = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fe_commerce%2Frn%2Fshop_assistant_message%2F%3Fstatus_font_dark%3D0%26hide_nav_bar%3D1%26loading_bgcolor%3D161823&status_font_dark=0&hide_nav_bar=1&loading_bgcolor=161823&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lyon_shop_assistant_message%26bundle%3Dindex.js%26module_name%3Dpage_shop_assistant_message%26status_font_dark%3D0%26hide_nav_bar%3D1%26loading_bgcolor%3D161823";
        }
        if ((i & 4) != 0) {
            str3 = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Ffe_douplusnx_service_assistant_web%2F%3Fhide_nav_bar%3D1%26loading_bgcolor%3D161823%26bg_theme%3D161823&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_douplusnx_service_assistant%26bundle_name%3Dindex%26module_name%3Dpage_service_assistant%26hide_nav_bar%3D1%26loading_bgcolor%3D161823%26bg_theme%3D161823";
        }
        this(str, str2, str3);
    }
}
