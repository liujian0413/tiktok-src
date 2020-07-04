package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3410w;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8420k;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p410o.C8735f;
import com.bytedance.android.livesdk.p410o.C8735f.C8738b;
import com.bytedance.android.livesdk.p410o.p412b.C8721d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.monitor.webview.C9541j;
import com.bytedance.common.p479c.C9684b;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ttnet.p670a.C12925a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.utils.a */
public final class C9020a {

    /* renamed from: a */
    private static String f24667a;

    /* renamed from: b */
    private static boolean f24668b;

    /* renamed from: a */
    public static void m26957a(String str, String str2, String str3, String str4) {
        String str5 = str.equals("android.permission.ACCESS_FINE_LOCATION") ? "system_position" : str.equals("android.permission.READ_PHONE_STATE") ? "call" : (str.equals("android.permission.WRITE_EXTERNAL_STORAGE") || str.equals("android.permission.READ_EXTERNAL_STORAGE")) ? "save" : null;
        if (!TextUtils.isEmpty(str5)) {
        }
    }

    /* renamed from: a */
    public static void m26958a(HashMap<String, String> hashMap, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys != null && keys.hasNext()) {
                try {
                    String str2 = (String) keys.next();
                    String optString = jSONObject.optString(str2);
                    if (!C6319n.m19593a(str2)) {
                        if (!C6319n.m19593a(optString)) {
                            hashMap.put(str2, optString);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!C6319n.m19593a((String) null)) {
            hashMap.put("User-Agent", null);
        }
    }

    /* renamed from: a */
    public static void m26956a(String str, WebView webView, Map<String, String> map) {
        long j;
        long j2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j3;
        Map<String, String> map2 = map;
        if (webView != null && !C6319n.m19593a(str)) {
            boolean a = m26959a(str);
            Context context = webView.getContext();
            String g = (!a || context == null) ? str : C12925a.m37625a(context).mo31413g(str);
            Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
            if (currentRoom == null) {
                j = 0;
            } else {
                j = currentRoom.getId();
            }
            if (currentRoom == null) {
                j2 = 0;
            } else {
                j2 = currentRoom.getOwnerUserId();
            }
            String str8 = "";
            if (currentRoom == null) {
                str8 = String.valueOf(j2);
            } else if (currentRoom.getOwner() != null) {
                str8 = currentRoom.getOwner().getSecUid();
            }
            long b = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
            String secUid = TTLiveSDKContext.getHostService().mo22367h().mo22165a().getSecUid();
            if (currentRoom == null) {
                str2 = "";
            } else {
                str2 = currentRoom.getLog_pb();
            }
            if (currentRoom == null) {
                str3 = "";
            } else {
                str3 = currentRoom.getRequestId();
            }
            C8416g a2 = C8443c.m25663a().mo21605a(C8438j.class);
            String str9 = "";
            String str10 = "";
            String str11 = "";
            String str12 = "";
            String str13 = "";
            if (a2 instanceof C8420k) {
                C8420k kVar = (C8420k) a2;
                if (kVar.mo21568a().containsKey("enter_from")) {
                    kVar.mo21568a().get("enter_from");
                }
                if (kVar.mo21568a().containsKey("source")) {
                    kVar.mo21568a().get("source");
                }
                if (kVar.mo21568a().containsKey("action_type")) {
                    str10 = (String) kVar.mo21568a().get("action_type");
                }
                if (kVar.mo21568a().containsKey("video_id")) {
                    str11 = (String) kVar.mo21568a().get("video_id");
                }
                if (kVar.mo21568a().containsKey("gd_label")) {
                    str12 = (String) kVar.mo21568a().get("gd_label");
                }
                Map a3 = kVar.mo21568a();
                str6 = (String) a3.get("enter_from_merge");
                str9 = (String) a3.get("enter_method");
                str7 = str10;
                str5 = str11;
                str4 = str12;
            } else {
                str7 = str10;
                str5 = str11;
                str4 = str12;
                str6 = str13;
            }
            Uri parse = Uri.parse(g);
            boolean z = false;
            if (parse.getHost() != null) {
                Iterator it = TTLiveSDKContext.getHostService().mo22368i().mo23271a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (parse.getHost().endsWith((String) it.next())) {
                        z = true;
                        break;
                    } else {
                        WebView webView2 = webView;
                        Map<String, String> map3 = map;
                    }
                }
            }
            Set queryParameterNames = parse.getQueryParameterNames();
            if (z && queryParameterNames != null) {
                Builder buildUpon = Uri.parse(g).buildUpon();
                if (!queryParameterNames.contains("room_id")) {
                    j3 = 0;
                    if (j != 0) {
                        buildUpon.appendQueryParameter("room_id", String.valueOf(j));
                    }
                } else {
                    j3 = 0;
                }
                if (!queryParameterNames.contains("anchor_id") && j2 != j3) {
                    buildUpon.appendQueryParameter("anchor_id", String.valueOf(j2));
                }
                if (!queryParameterNames.contains("sec_anchor_id")) {
                    buildUpon.appendQueryParameter("sec_anchor_id", str8);
                }
                if (!queryParameterNames.contains("user_id")) {
                    buildUpon.appendQueryParameter("user_id", String.valueOf(b));
                }
                if (!queryParameterNames.contains("sec_user_id")) {
                    buildUpon.appendQueryParameter("sec_user_id", secUid);
                }
                if (!queryParameterNames.contains("enter_from_merge")) {
                    buildUpon.appendQueryParameter("enter_from_merge", str6);
                }
                if (!queryParameterNames.contains("enter_method")) {
                    buildUpon.appendQueryParameter("enter_method", str9);
                }
                if (!queryParameterNames.contains("action_type")) {
                    buildUpon.appendQueryParameter("action_type", str7);
                }
                if (!queryParameterNames.contains("log_pb") && !TextUtils.isEmpty(str2)) {
                    buildUpon.appendQueryParameter("log_pb", str2);
                }
                if (!queryParameterNames.contains("request_id") && !TextUtils.isEmpty(str3)) {
                    buildUpon.appendQueryParameter("request_id", str3);
                }
                if (!queryParameterNames.contains("video_id") && !TextUtils.isEmpty(str5)) {
                    buildUpon.appendQueryParameter("video_id", str5);
                }
                if (!queryParameterNames.contains("action_type") && !TextUtils.isEmpty(str7)) {
                    buildUpon.appendQueryParameter("action_type", str7);
                }
                if (!queryParameterNames.contains("gd_label") && !TextUtils.isEmpty(str4)) {
                    buildUpon.appendQueryParameter("gd_label", str4);
                }
                g = buildUpon.build().toString();
            }
            WebView webView3 = webView;
            C9541j.m28227b().mo23587a(webView3, g);
            Map<String, String> map4 = map;
            if (map4 == null || map.isEmpty()) {
                C3410w.m12671a(webView3, g);
            } else {
                C9064f.m27068a(webView3, g, map4);
            }
        }
    }

    /* renamed from: a */
    public static boolean m26959a(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m26961b(String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = C3358ac.m12528e().getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r8 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r8 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri m26949a(android.content.Context r8, java.lang.String r9) {
        /*
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.ContentResolver r2 = r8.getContentResolver()     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String r5 = "_data= ?"
            r8 = 1
            java.lang.String[] r6 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            r0 = 0
            r6[r0] = r9     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            java.lang.String r8 = "_id"
            r4[r0] = r8     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0048, all -> 0x0041 }
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            if (r9 == 0) goto L_0x003b
            java.lang.String r9 = r8.getString(r0)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            long r2 = java.lang.Long.parseLong(r9)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            android.net.Uri r9 = android.content.ContentUris.withAppendedId(r0, r2)     // Catch:{ Exception -> 0x0049, all -> 0x003e }
            if (r8 == 0) goto L_0x003a
            r8.close()
        L_0x003a:
            return r9
        L_0x003b:
            if (r8 == 0) goto L_0x004e
            goto L_0x004b
        L_0x003e:
            r9 = move-exception
            r1 = r8
            goto L_0x0042
        L_0x0041:
            r9 = move-exception
        L_0x0042:
            if (r1 == 0) goto L_0x0047
            r1.close()
        L_0x0047:
            throw r9
        L_0x0048:
            r8 = r1
        L_0x0049:
            if (r8 == 0) goto L_0x004e
        L_0x004b:
            r8.close()
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.C9020a.m26949a(android.content.Context, java.lang.String):android.net.Uri");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r2 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        if (r2 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b0, code lost:
        if (r11 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c2, code lost:
        if (r11 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d A[SYNTHETIC, Splitter:B:27:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bd A[SYNTHETIC, Splitter:B:62:0x00bd] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m26950a(android.content.Context r11, android.net.Uri r12) {
        /*
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r12.getScheme()
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)
            if (r2 != 0) goto L_0x00c7
            java.lang.String r2 = "file"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0018
            goto L_0x00c7
        L_0x0018:
            java.lang.String r2 = "http"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0025
            java.lang.String r11 = r12.toString()
            return r11
        L_0x0025:
            java.lang.String r2 = "content"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00c6
            r1 = 1
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r2 = "_data"
            r9 = 0
            r8[r9] = r2
            java.lang.String r10 = ""
            android.content.ContentResolver r2 = r11.getContentResolver()     // Catch:{ Exception -> 0x0061, all -> 0x0059 }
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r12
            r4 = r8
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0061, all -> 0x0059 }
            boolean r0 = r2.moveToFirst()     // Catch:{ Exception -> 0x0062, all -> 0x0057 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.getString(r9)     // Catch:{ Exception -> 0x0062, all -> 0x0057 }
            r10 = r0
        L_0x004f:
            if (r2 == 0) goto L_0x0054
            r2.close()     // Catch:{ Exception -> 0x0062, all -> 0x0057 }
        L_0x0054:
            if (r2 == 0) goto L_0x0067
            goto L_0x0064
        L_0x0057:
            r11 = move-exception
            goto L_0x005b
        L_0x0059:
            r11 = move-exception
            r2 = r0
        L_0x005b:
            if (r2 == 0) goto L_0x0060
            r2.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            throw r11
        L_0x0061:
            r2 = r0
        L_0x0062:
            if (r2 == 0) goto L_0x0067
        L_0x0064:
            r2.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            r0 = r2
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r10)
            if (r2 == 0) goto L_0x00c5
            android.content.ContentResolver r2 = r11.getContentResolver()     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            java.lang.String r5 = "_id= ?"
            java.lang.String r11 = r12.getLastPathSegment()     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            r3 = 19
            if (r12 < r3) goto L_0x0094
            boolean r12 = com.bytedance.common.utility.C6319n.m19593a(r11)     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            if (r12 != 0) goto L_0x0094
            java.lang.String r12 = ":"
            boolean r12 = r11.contains(r12)     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            if (r12 == 0) goto L_0x0094
            java.lang.String r12 = ":"
            java.lang.String[] r11 = r11.split(r12)     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            r11 = r11[r1]     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
        L_0x0094:
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            r6[r9] = r11     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            r7 = 0
            r4 = r8
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            boolean r12 = r11.moveToFirst()     // Catch:{ Exception -> 0x00c2, all -> 0x00b6 }
            if (r12 == 0) goto L_0x00ab
            java.lang.String r12 = r11.getString(r9)     // Catch:{ Exception -> 0x00c2, all -> 0x00b6 }
            r10 = r12
        L_0x00ab:
            if (r11 == 0) goto L_0x00b0
            r11.close()     // Catch:{ Exception -> 0x00c2, all -> 0x00b6 }
        L_0x00b0:
            if (r11 == 0) goto L_0x00c5
        L_0x00b2:
            r11.close()     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00c5
        L_0x00b6:
            r12 = move-exception
            r0 = r11
            r11 = r12
            goto L_0x00bb
        L_0x00ba:
            r11 = move-exception
        L_0x00bb:
            if (r0 == 0) goto L_0x00c0
            r0.close()     // Catch:{ Exception -> 0x00c0 }
        L_0x00c0:
            throw r11
        L_0x00c1:
            r11 = r0
        L_0x00c2:
            if (r11 == 0) goto L_0x00c5
            goto L_0x00b2
        L_0x00c5:
            return r10
        L_0x00c6:
            return r0
        L_0x00c7:
            java.lang.String r11 = r12.getPath()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.C9020a.m26950a(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* renamed from: a */
    public static String m26951a(Context context, WebView webView) {
        if (webView != null) {
            String userAgentString = webView.getSettings().getUserAgentString();
            if (!C6319n.m19593a(userAgentString)) {
                f24667a = userAgentString;
                return userAgentString;
            }
        }
        if (!C6319n.m19593a(f24667a)) {
            return f24667a;
        }
        String a = C9684b.m28615a(context);
        f24667a = a;
        if (!C6319n.m19593a(a)) {
            return f24667a;
        }
        if (!f24668b && webView == null && (context instanceof Activity)) {
            f24668b = true;
            try {
                WebView webView2 = new WebView(context);
                f24667a = webView2.getSettings().getUserAgentString();
                webView2.destroy();
            } catch (Throwable unused) {
            }
        }
        return f24667a;
    }

    /* renamed from: a */
    public static void m26953a(final Activity activity, final Fragment fragment, int i) {
        C8735f.m26105a(activity).mo21742a(C9055b.f24717a).mo21744b(C9061c.f24721a).mo21743a(new C8721d(40003) {
            /* renamed from: b */
            public final void mo9568b(String... strArr) {
                C9020a.m26957a("android.permission.WRITE_EXTERNAL_STORAGE", "click", (String) null, "cancel");
            }

            /* renamed from: a */
            public final void mo9567a(String... strArr) {
                if (!"mounted".equals(Environment.getExternalStorageState())) {
                    C9738o.m28694a((Context) activity, (int) R.drawable.bzp, (int) R.string.efx);
                    return;
                }
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                try {
                    if (fragment != null) {
                        fragment.startActivityForResult(intent, 40003);
                    } else {
                        activity.startActivityForResult(intent, 40003);
                    }
                } catch (Exception unused) {
                    C9738o.m28694a((Context) activity, (int) R.drawable.bzp, (int) R.string.efw);
                }
            }
        }, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* renamed from: a */
    public static void m26955a(String str, WebView webView, String str2, boolean z) {
        if (webView != null && !C6319n.m19593a(str)) {
            boolean a = m26959a(str);
            if (a && C6319n.m19593a(str2)) {
                str2 = "https://nativeapp.toutiao.com";
            }
            if (!a) {
                str2 = null;
            }
            HashMap hashMap = new HashMap();
            if (!C6319n.m19593a(str2)) {
                hashMap.put("Referer", str2);
            }
            m26956a(str, webView, (Map<String, String>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m26954a(Activity activity, Fragment fragment, int i, String str, String str2) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            C9738o.m28694a((Context) activity, (int) R.drawable.bzp, (int) R.string.efx);
            return;
        }
        C8738b b = C8735f.m26105a(activity).mo21742a(C9062d.f24722a).mo21744b(C9063e.f24723a);
        final String str3 = str;
        final String str4 = str2;
        final Activity activity2 = activity;
        final Fragment fragment2 = fragment;
        C90222 r0 = new C8721d(40004) {
            /* renamed from: b */
            public final void mo9568b(String... strArr) {
                C9020a.m26957a("android.permission.CAMERA", "click", (String) null, "cancel");
            }

            /* renamed from: a */
            public final void mo9567a(String... strArr) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File file = new File(str3);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, str4);
                Activity activity = activity2;
                StringBuilder sb = new StringBuilder();
                sb.append(activity2.getPackageName());
                sb.append(TTLiveFileProvider.NAME);
                intent.putExtra("output", TTLiveFileProvider.getUri(activity, sb.toString(), file2));
                try {
                    if (fragment2 != null) {
                        fragment2.startActivityForResult(intent, 40004);
                    } else {
                        activity2.startActivityForResult(intent, 40004);
                    }
                } catch (Exception unused) {
                    C9738o.m28694a((Context) activity2, (int) R.drawable.bzp, (int) R.string.efv);
                }
            }
        };
        b.mo21743a(r0, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
