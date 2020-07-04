package com.p280ss.android.ugc.awemepushlib.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.awemepushlib.p1713b.C43590a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.ugc.awemepushlib.model.a */
public final class C43639a {
    /* renamed from: a */
    private static String m138284a() {
        if (!C6399b.m19946v()) {
            StringBuilder sb = new StringBuilder(C22909c.f60638b);
            sb.append(C6399b.m19935k());
            return sb.toString();
        } else if (TextUtils.isEmpty(C6399b.f18694b.mo15329x())) {
            return "musically";
        } else {
            return C6399b.f18694b.mo15329x();
        }
    }

    /* renamed from: b */
    private static String m138287b(String str) {
        if (C6319n.m19593a(str)) {
            return str;
        }
        try {
            String scheme = Uri.parse(str).getScheme();
            String a = m138284a();
            if (C22909c.f60637a.equals(scheme) || C22909c.f60639c.equals(scheme)) {
                str = str.replace(scheme, a);
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: a */
    private static boolean m138286a(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        if (C22909c.f60637a.equals(str)) {
            return true;
        }
        String a = m138284a();
        if (C6319n.m19593a(a) || !a.equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Intent m138283a(Context context, PushMsg pushMsg) {
        Intent intent;
        if (!C6319n.m19593a(pushMsg.openUrl)) {
            Uri parse = Uri.parse(pushMsg.openUrl);
            String scheme = parse.getScheme();
            if (C22909c.f60637a.equals(scheme)) {
                pushMsg.openUrl = m138287b(pushMsg.openUrl);
                parse = Uri.parse(pushMsg.openUrl);
            }
            intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            if (m138286a(scheme)) {
                intent.putExtra(C22912d.f60643c, true);
            }
            if (pushMsg.extra.pre_o_urls.size() > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = pushMsg.extra.pre_o_urls.iterator();
                while (it.hasNext()) {
                    arrayList.add(m138287b((String) it.next()));
                }
                intent.putExtra("pre_o_urls", arrayList);
            }
            if (!TextUtils.isEmpty(pushMsg.extra.push_user_id)) {
                intent.putExtra("push_user_id", pushMsg.extra.push_user_id);
                if (TextUtils.isEmpty(parse.getQueryParameter("multi_account_push_uid"))) {
                    parse = parse.buildUpon().appendQueryParameter("multi_account_push_uid", pushMsg.extra.push_user_id).build();
                }
            }
            intent.setData(parse);
            intent.setPackage(context.getPackageName());
        } else {
            intent = null;
        }
        if (intent == null) {
            return C6776h.m20941a(context, context.getPackageName());
        }
        return intent;
    }

    /* renamed from: a */
    public static Map<String, String> m138285a(PushMsg pushMsg, int i, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("rule_id", String.valueOf(pushMsg.f112935id));
            if (!TextUtils.isEmpty(pushMsg.openUrl)) {
                Uri parse = Uri.parse(pushMsg.openUrl);
                if (parse != null) {
                    if (!TextUtils.isEmpty(parse.getQueryParameter("push_id"))) {
                        hashMap.put("rule_id", parse.getQueryParameter("push_id"));
                    }
                    if (!TextUtils.isEmpty(parse.getQueryParameter("gd_label"))) {
                        hashMap.put("push_label", parse.getQueryParameter("gd_label"));
                    }
                    String host = parse.getHost();
                    if (C22704b.f60415d.equals(host) && !TextUtils.isEmpty(parse.getQueryParameter("id"))) {
                        hashMap.put("group_id", parse.getQueryParameter("id"));
                    } else if (!TextUtils.isEmpty(host) && "aweme".equals(host) && !TextUtils.isEmpty(parse.getLastPathSegment())) {
                        hashMap.put("group_id", parse.getLastPathSegment());
                    }
                    String path = parse.getPath();
                    if ("challenge".equals(host) && !TextUtils.isEmpty(path) && path.contains(C22704b.f60415d)) {
                        hashMap.put("tag_id", parse.getLastPathSegment());
                    }
                }
            }
            hashMap.put("push_channel", C43590a.m138120a(i));
            String str6 = "push_delay";
            if (pushMsg.extra.turn_screen_on) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put(str6, str);
            hashMap.put("post_back", pushMsg.postBack);
            String str7 = "click_position";
            if (z) {
                str2 = "notify";
            } else {
                str2 = "alert";
            }
            hashMap.put(str7, str2);
            String str8 = "mediastyle";
            if (pushMsg.extra.style == 5) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            hashMap.put(str8, str3);
            String str9 = "colorized";
            if (TextUtils.isEmpty(pushMsg.extra.bg_color)) {
                str4 = "0";
            } else {
                str4 = "1";
            }
            hashMap.put(str9, str4);
            String str10 = "is_banner_deleted";
            if (pushMsg.extra.isBannerDeteled) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            hashMap.put(str10, str5);
            if (pushMsg.extra != null) {
                if (!TextUtils.isEmpty(pushMsg.extra.authorId)) {
                    hashMap.put("author_id", pushMsg.extra.authorId);
                }
                if (!TextUtils.isEmpty(pushMsg.extra.roomId)) {
                    hashMap.put("room_id", pushMsg.extra.roomId);
                }
                if (!TextUtils.isEmpty(pushMsg.extra.userId)) {
                    hashMap.put("user_id", pushMsg.extra.userId);
                }
                if (!TextUtils.isEmpty(pushMsg.extra.musicId)) {
                    hashMap.put("music_id", pushMsg.extra.musicId);
                }
                if (!TextUtils.isEmpty(pushMsg.extra.challengeId)) {
                    hashMap.put("tag_id", pushMsg.extra.challengeId);
                }
                if (!TextUtils.isEmpty(pushMsg.extra.tagId)) {
                    hashMap.put("tag_id", pushMsg.extra.tagId);
                }
                if (!TextUtils.isEmpty(pushMsg.extra.poiId)) {
                    hashMap.put("poi_id", pushMsg.extra.poiId);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
