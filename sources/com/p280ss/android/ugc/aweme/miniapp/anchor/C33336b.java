package com.p280ss.android.ugc.aweme.miniapp.anchor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.p022v4.util.ArrayMap;
import com.bytedance.router.RouteIntent;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.anchor.AnchorBaseActivity;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24522a;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.GameInfo;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.shortvideo.TaskAnchorInfo;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.b */
public final class C33336b {

    /* renamed from: a */
    public static final C33336b f87069a = new C33336b();

    private C33336b() {
    }

    /* renamed from: a */
    public static void m107787a(String str, String str2) {
        C7573i.m23587b(str, "anchorTitle");
        C7573i.m23587b(str2, "anchorContent");
        AnchorTransData anchorTransData = new AnchorTransData(AnchorBusinessType.GAME.getTYPE(), str2, str, null, null, null, null, 120, null);
        C42961az.m136380a(new C24522a(anchorTransData));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m107788a(com.p280ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r3.getAnchor()
            if (r1 == 0) goto L_0x000e
            java.lang.Integer r1 = r1.getBusinessType()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r2 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.GAME
            int r2 = r2.getTYPE()
            if (r1 != 0) goto L_0x0018
            goto L_0x0054
        L_0x0018:
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x0054
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r3.getAnchor()
            if (r1 == 0) goto L_0x002f
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = r1.getAnchorInfo()
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r1.getKeyword()
            goto L_0x0030
        L_0x002f:
            r1 = r0
        L_0x0030:
            java.lang.String r2 = ""
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0054
            com.ss.android.ugc.aweme.feed.model.Anchor r3 = r3.getAnchor()
            if (r3 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r3 = r3.getAnchorInfo()
            if (r3 == 0) goto L_0x004a
            java.lang.String r0 = r3.getUrl()
        L_0x004a:
            java.lang.String r3 = ""
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0054
            return r2
        L_0x0054:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b.m107788a(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* renamed from: a */
    public static String m107781a() {
        String str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fdouyin%2Fgame_detail%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_game_detail%26bundle%3Dindex.js%26module_name%3Dpage_game_detail%26hide_nav_bar%3D1%26loading_bgcolor%3D%2523161823";
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            FeConfigCollection feConfigCollection = a.getFeConfigCollection();
            C7573i.m23582a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
            FEConfig gameDetail = feConfigCollection.getGameDetail();
            C7573i.m23582a((Object) gameDetail, "SettingsReader.get().feConfigCollection.gameDetail");
            String schema = gameDetail.getSchema();
            if (schema == null) {
                return str;
            }
            return schema;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static void m107786a(String str) {
        if (str != null) {
            C7195s.m22438a().mo18682a(str);
        }
    }

    /* renamed from: c */
    private static String m107790c(String str) {
        boolean z;
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Uri parse = Uri.parse(str);
        C7573i.m23582a((Object) parse, "uri");
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Collection collection = queryParameterNames;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        }
        if (!z2) {
            for (String str2 : queryParameterNames) {
                if (str2 != null && str2.hashCode() == 1066014959 && str2.equals("anchor_content")) {
                    GameInfo gameInfo = (GameInfo) new C6600e().mo15974a(parse.getQueryParameter(str2), GameInfo.class);
                    if (gameInfo != null) {
                        return gameInfo.getId();
                    }
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo85484b(String str) {
        boolean z;
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Uri parse = Uri.parse(str);
        C7573i.m23582a((Object) parse, "uri");
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Collection collection = queryParameterNames;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        }
        if (!z2) {
            for (String str2 : queryParameterNames) {
                if (str2 != null && str2.hashCode() == 344713476 && str2.equals("rn_schema")) {
                    return m107790c(parse.getQueryParameter(str2));
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static TaskAnchorInfo m107780a(com.p280ss.android.ugc.aweme.discover.model.TaskAnchorInfo taskAnchorInfo) {
        int i;
        String str;
        String str2;
        UrlModel urlModel;
        String str3;
        String str4;
        String str5;
        TaskAnchorInfo taskAnchorInfo2 = new TaskAnchorInfo();
        if (taskAnchorInfo != null) {
            i = taskAnchorInfo.getType();
        } else {
            i = AnchorBusinessType.NO_TYPE.getTYPE();
        }
        taskAnchorInfo2.setType(i);
        String str6 = null;
        if (taskAnchorInfo != null) {
            str = taskAnchorInfo.getId();
        } else {
            str = null;
        }
        taskAnchorInfo2.setId(str);
        if (taskAnchorInfo != null) {
            str2 = taskAnchorInfo.getContent();
        } else {
            str2 = null;
        }
        taskAnchorInfo2.setContent(str2);
        if (taskAnchorInfo != null) {
            urlModel = taskAnchorInfo.getIcon();
        } else {
            urlModel = null;
        }
        taskAnchorInfo2.setIcon(urlModel);
        if (taskAnchorInfo != null) {
            str3 = taskAnchorInfo.getTitle();
        } else {
            str3 = null;
        }
        taskAnchorInfo2.setTitle(str3);
        if (taskAnchorInfo != null) {
            str4 = taskAnchorInfo.getOpenUrl();
        } else {
            str4 = null;
        }
        taskAnchorInfo2.setOpenUrl(str4);
        if (taskAnchorInfo != null) {
            str5 = taskAnchorInfo.getMpUrl();
        } else {
            str5 = null;
        }
        taskAnchorInfo2.setMpUrl(str5);
        if (taskAnchorInfo != null) {
            str6 = taskAnchorInfo.getWebUrl();
        }
        taskAnchorInfo2.setWebUrl(str6);
        return taskAnchorInfo2;
    }

    /* renamed from: a */
    public static final void m107785a(Context context) {
        if (context != null) {
            Intent intent = new Intent(context, AnchorBaseActivity.class);
            intent.putExtra("anchor_type", AnchorBusinessType.GAME);
            context.startActivity(intent);
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(R.anim.bq, R.anim.br);
            }
        }
    }

    /* renamed from: a */
    private static String m107783a(String str, int i) {
        if (str != null) {
            C25006o a = C25006o.m82325a(str);
            if (a != null) {
                a.f65949l = 1;
            } else {
                a = null;
            }
            String a2 = C25006o.m82326a(a);
            if (a2 != null) {
                return a2;
            }
        }
        return "";
    }

    /* renamed from: b */
    private static String m107789b(String str, Map<String, String> map) {
        if (str == null) {
            return null;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return buildUpon.build().toString();
    }

    /* renamed from: a */
    public static Intent m107779a(Intent intent, RouteIntent routeIntent) {
        boolean z;
        C7573i.m23587b(intent, "intent");
        if (routeIntent != null) {
            Uri parse = Uri.parse(routeIntent.getOriginUrl());
            C7573i.m23582a((Object) parse, "routeUri");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            intent.putExtra("shoot_way", "detail_page");
            Collection collection = queryParameterNames;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                for (String str : queryParameterNames) {
                    if (str != null && str.hashCode() == 1046359873 && str.equals("commerce_data_in_tools_line")) {
                        intent.putExtra("commerce_data_in_tools_line", m107783a(URLDecoder.decode(parse.getQueryParameter(str)), 1));
                    }
                }
            }
        }
        return intent;
    }

    /* renamed from: a */
    public static String m107784a(String str, Map<String, String> map) {
        boolean z;
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        C7573i.m23582a((Object) parse, "uri");
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        ArrayMap arrayMap = new ArrayMap();
        Collection collection = queryParameterNames;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (String str2 : queryParameterNames) {
                String queryParameter = parse.getQueryParameter(str2);
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != 116079) {
                        if (hashCode == 344713476 && str2.equals("rn_schema")) {
                            String b = m107789b(queryParameter, map);
                            if (b != null) {
                                arrayMap.put("rn_schema", b);
                            }
                        }
                    } else if (str2.equals("url")) {
                        String b2 = m107789b(queryParameter, map);
                        if (b2 != null) {
                            arrayMap.put("url", b2);
                        }
                    }
                }
                arrayMap.put(str2, queryParameter);
            }
        }
        return m107789b("aweme://webview/?", arrayMap);
    }

    /* renamed from: a */
    public static String m107782a(Integer num, String str, String str2) {
        int i;
        JSONObject jSONObject = new JSONObject();
        String str3 = "type";
        if (num != null) {
            try {
                i = num.intValue();
            } catch (Exception unused) {
            }
        } else {
            i = AnchorBusinessType.NO_TYPE.getTYPE();
        }
        jSONObject.put(str3, i);
        String str4 = "id";
        if (str == null) {
            str = "";
        }
        jSONObject.put(str4, str);
        String str5 = C38347c.f99553h;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put(str5, str2);
        String jSONObject2 = jSONObject.toString();
        C7573i.m23582a((Object) jSONObject2, "anchor.toString()");
        return jSONObject2;
    }
}
