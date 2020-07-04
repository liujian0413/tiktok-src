package com.bytedance.android.livesdk.browser.jsbridge.p201c;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.model.C2436a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p393h.C8295d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.schema.interfaces.C8932b.C8933a;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdkapi.p458j.p459a.C9494e;
import com.bytedance.ies.web.p582a.C11093e;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7498y;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.i */
public class C4057i implements C11093e {

    /* renamed from: a */
    protected WeakReference<Context> f12047a;

    public C4057i(WeakReference<Context> weakReference) {
        this.f12047a = weakReference;
    }

    /* renamed from: a */
    private static Bundle m14129a(JSONObject jSONObject) throws Exception {
        Bundle bundle = new Bundle();
        if (jSONObject == null) {
            return bundle;
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                bundle.putString(str, String.valueOf(obj));
            }
        }
        return bundle;
    }

    /* renamed from: l */
    private static void m14141l(JSONObject jSONObject, JSONObject jSONObject2) {
        C9097a.m27146a().mo22267a((Object) new C8295d("H5"));
    }

    /* renamed from: j */
    private void m14139j(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Context context = (Context) this.f12047a.get();
        if (context instanceof Activity) {
            TTLiveSDKContext.getHostService().mo22362c().openWallet((Activity) context);
        }
        jSONObject2.put("code", 1);
    }

    /* renamed from: a */
    private static void m14130a(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        if (jSONObject == null) {
            jSONObject2.put("code", 0);
            return;
        }
        String optString = jSONObject.optString("title");
        String optString2 = jSONObject.optString(C38347c.f99553h);
        C2436a aVar = new C2436a();
        aVar.f7968a = optString;
        aVar.f7969b = optString2;
        C9097a.m27146a().mo22267a((Object) aVar);
    }

    /* renamed from: f */
    private void m14135f(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        String str = "";
        if (jSONObject != null) {
            jSONObject.optInt("feedback_id", -1);
            str = jSONObject.optString("source", "");
        }
        if (this.f12047a != null && this.f12047a.get() != null) {
            TTLiveSDKContext.getHostService().mo22365f().mo22044a(str, (Context) this.f12047a.get());
            jSONObject2.put("code", 1);
        }
    }

    /* renamed from: g */
    private void m14136g(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        if (jSONObject == null) {
            jSONObject2.put("code", 0);
            return;
        }
        Context context = (Context) this.f12047a.get();
        TTLiveSDKContext.getHostService().mo22365f().mo22044a(jSONObject.optString("source"), context);
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
        jSONObject2.put("code", 1);
    }

    /* renamed from: k */
    private void m14140k(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null) {
            jSONObject2.put("code", 0);
            return;
        }
        String string = jSONObject.getString("url");
        Context context = (Context) this.f12047a.get();
        if (context == null || !C9178j.m27302j().mo22380i().handle(context, string)) {
            jSONObject2.put("code", 0);
        } else {
            jSONObject2.put("code", 1);
        }
    }

    /* renamed from: b */
    private void m14131b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        if (jSONObject == null) {
            jSONObject2.put("code", 0);
            return;
        }
        String optString = jSONObject.optString("item_id");
        C9494e eVar = new C9494e("sslocal://detail/video");
        eVar.mo23525a("groupid", optString);
        eVar.mo23525a("item_id", optString);
        eVar.mo23525a("aggr_type", "2");
        eVar.mo23525a("enter_from", jSONObject.optString("enter_from", "click_live_room"));
        eVar.mo23525a("category_name", jSONObject.optString("category_name", "live_room"));
        TTLiveSDKContext.getHostService().mo22365f().mo22047a((Context) this.f12047a.get(), eVar.mo23522a());
    }

    /* renamed from: c */
    private static void m14132c(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        if (jSONObject == null) {
            jSONObject2.put("code", 0);
            return;
        }
        String optString = jSONObject.optString("user_id");
        if (TextUtils.isEmpty(optString)) {
            jSONObject2.put("code", 0);
            return;
        }
        String optString2 = jSONObject.optString("sec_user_id");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(optString2)) {
            hashMap.put("sec_user_id", optString2);
        }
        jSONObject2.put("code", C9178j.m27302j().mo22380i().showUserProfile(Long.parseLong(optString), jSONObject.optString("type"), hashMap) ? 1 : 0);
    }

    /* renamed from: e */
    private void m14134e(JSONObject jSONObject, JSONObject jSONObject2) {
        Context context;
        if (this.f12047a != null) {
            context = (Context) this.f12047a.get();
        } else {
            context = null;
        }
        C8984e h = TTLiveSDKContext.getHostService().mo22367h();
        if (!h.mo22182c()) {
            h.mo22167a(context, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f6a)).mo22188a(-1).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("code", 1);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: i */
    private void m14138i(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Context context = (Context) this.f12047a.get();
        if (jSONObject == null || this.f12047a == null) {
            jSONObject2.put("code", 0);
            return;
        }
        String optString = jSONObject.optString("url");
        String optString2 = jSONObject.optString("title");
        String optString3 = jSONObject.optString("hide_nav_bar");
        C9178j.m27302j().mo22374c().mo11535a(context, C3979c.m13952b(optString).mo11550a(optString2).mo11553b(TextUtils.equals(jSONObject.optString("hide_status_bar"), "1")).mo11552b(jSONObject.optString("status_bar_color")).mo11554c(jSONObject.optString("status_bar_bg_color")).mo11551a(TextUtils.equals(optString3, "1")));
        jSONObject2.put("code", 1);
    }

    /* renamed from: d */
    private void m14133d(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        Context context;
        long j;
        if (jSONObject == null || !jSONObject.has("room_id")) {
            jSONObject2.put("code", 0);
            return;
        }
        JSONObject jSONObject3 = null;
        if (this.f12047a != null) {
            context = (Context) this.f12047a.get();
        } else {
            context = null;
        }
        if (context == null) {
            jSONObject2.put("code", 0);
            return;
        }
        long parseLong = Long.parseLong(jSONObject.getString("room_id"));
        try {
            j = Long.parseLong(jSONObject.optString("portal_id"));
        } catch (NumberFormatException unused) {
            j = 0;
        }
        if (j > 0) {
            C8444d.m25673b();
            StringBuilder sb = new StringBuilder("openRoom portalId=");
            sb.append(j);
            C8444d.m11970a("ttlive_portal", sb.toString());
        }
        if (jSONObject.has("log_extra")) {
            jSONObject3 = jSONObject.getJSONObject("log_extra");
        }
        Bundle a = m14129a(jSONObject3);
        a.putString("enter_method", "h5");
        if (C9178j.m27302j().mo22380i().openRoom(context, new C8933a().mo22054a(parseLong).mo22067c(jSONObject.optString("enter_from", "web")).mo22064b(jSONObject.optString("enter_from", "web")).mo22068d(jSONObject.optString("enter_from", "web")).mo22075k(jSONObject.optString("enter_from_merge", "h5")).mo22066c(j).mo22059a(jSONObject.optBoolean("gift_panel", false)).mo22065b(jSONObject.optBoolean("prop_panel", false)).mo22076l(jSONObject.optString("enter_method", "h5")).mo22060a(jSONObject.optBoolean("is_open_profile_panel", false), jSONObject.optBoolean("is_pick3", false)).mo22077m("false").mo22055a(a))) {
            jSONObject2.put("code", 1);
        } else {
            jSONObject2.put("code", 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14137h(org.json.JSONObject r13, org.json.JSONObject r14) throws java.lang.Exception {
        /*
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L_0x015a
            java.lang.ref.WeakReference<android.content.Context> r1 = r12.f12047a
            if (r1 == 0) goto L_0x015a
            java.lang.ref.WeakReference<android.content.Context> r1 = r12.f12047a
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x015a
            java.lang.ref.WeakReference<android.content.Context> r1 = r12.f12047a
            java.lang.Object r1 = r1.get()
            boolean r1 = r1 instanceof android.support.p022v4.app.FragmentActivity
            if (r1 != 0) goto L_0x001b
            goto L_0x015a
        L_0x001b:
            boolean r1 = com.bytedance.android.live.core.utils.C3358ac.m12529f()
            java.lang.String r2 = "width"
            if (r1 == 0) goto L_0x0028
            int r3 = com.bytedance.android.live.core.utils.C3358ac.m12523c()
            goto L_0x002c
        L_0x0028:
            int r3 = com.bytedance.android.live.core.utils.C3358ac.m12520b()
        L_0x002c:
            float r3 = com.bytedance.android.live.core.utils.C3358ac.m12527e(r3)
            int r3 = (int) r3
            int r2 = r13.optInt(r2, r3)
            if (r2 > 0) goto L_0x0047
            if (r1 == 0) goto L_0x003e
            int r1 = com.bytedance.android.live.core.utils.C3358ac.m12523c()
            goto L_0x0042
        L_0x003e:
            int r1 = com.bytedance.android.live.core.utils.C3358ac.m12520b()
        L_0x0042:
            float r1 = com.bytedance.android.live.core.utils.C3358ac.m12527e(r1)
            int r2 = (int) r1
        L_0x0047:
            java.lang.String r1 = "height"
            r3 = 400(0x190, float:5.6E-43)
            int r1 = r13.optInt(r1, r3)
            java.lang.String r3 = "radius"
            int r3 = r13.optInt(r3, r0)
            java.lang.String r4 = "radius_top_left"
            int r4 = r13.optInt(r4, r0)
            java.lang.String r5 = "radius_top_right"
            int r5 = r13.optInt(r5, r0)
            java.lang.String r6 = "radius_bottom_right"
            int r6 = r13.optInt(r6, r0)
            java.lang.String r7 = "radius_bottom_left"
            int r7 = r13.optInt(r7, r0)
            java.lang.String r8 = "margin"
            int r8 = r13.optInt(r8, r0)
            java.lang.String r9 = "gravity"
            boolean r9 = r13.has(r9)
            r10 = 80
            if (r9 == 0) goto L_0x00ce
            java.lang.String r9 = "gravity"
            java.lang.String r9 = r13.optString(r9)
            java.lang.String r11 = "right"
            boolean r11 = android.text.TextUtils.equals(r9, r11)
            if (r11 != 0) goto L_0x00ca
            java.lang.String r11 = "end"
            boolean r11 = android.text.TextUtils.equals(r9, r11)
            if (r11 == 0) goto L_0x0094
            goto L_0x00ca
        L_0x0094:
            java.lang.String r11 = "left"
            boolean r11 = android.text.TextUtils.equals(r9, r11)
            if (r11 != 0) goto L_0x00c6
            java.lang.String r11 = "start"
            boolean r11 = android.text.TextUtils.equals(r9, r11)
            if (r11 == 0) goto L_0x00a5
            goto L_0x00c6
        L_0x00a5:
            java.lang.String r11 = "top"
            boolean r11 = android.text.TextUtils.equals(r9, r11)
            if (r11 == 0) goto L_0x00b0
            r9 = 48
            goto L_0x00cf
        L_0x00b0:
            java.lang.String r11 = "bottom"
            boolean r11 = android.text.TextUtils.equals(r9, r11)
            if (r11 == 0) goto L_0x00bb
            r9 = 80
            goto L_0x00cf
        L_0x00bb:
            java.lang.String r11 = "center"
            boolean r9 = android.text.TextUtils.equals(r9, r11)
            if (r9 == 0) goto L_0x00ce
            r9 = 17
            goto L_0x00cf
        L_0x00c6:
            r9 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x00cf
        L_0x00ca:
            r9 = 8388613(0x800005, float:1.175495E-38)
            goto L_0x00cf
        L_0x00ce:
            r9 = 0
        L_0x00cf:
            r11 = 8
            if (r9 != r10) goto L_0x00e9
            java.lang.String r10 = "radius_top_left"
            boolean r10 = r13.has(r10)
            if (r10 != 0) goto L_0x00e9
            java.lang.String r10 = "radius_top_right"
            boolean r10 = r13.has(r10)
            if (r10 != 0) goto L_0x00e9
            r4 = 8
            r5 = 8
            r7 = 0
            goto L_0x00ea
        L_0x00e9:
            r0 = r6
        L_0x00ea:
            java.lang.String r6 = "from_label"
            java.lang.String r6 = r13.optString(r6)
            java.lang.String r10 = "url"
            java.lang.String r10 = r13.getString(r10)
            com.bytedance.android.livesdk.browser.c.b$b r10 = com.bytedance.android.livesdk.browser.p193c.C3979c.m13951a(r10)
            com.bytedance.android.livesdk.browser.c.b$b r2 = r10.mo11555a(r2)
            com.bytedance.android.livesdk.browser.c.b$b r1 = r2.mo11560b(r1)
            com.bytedance.android.livesdk.browser.c.b$b r1 = r1.mo11566e(r9)
            com.bytedance.android.livesdk.browser.c.b$b r1 = r1.mo11558a(r6)
            com.bytedance.android.livesdk.browser.c.b$b r1 = r1.mo11562c(r8)
            r2 = 1
            com.bytedance.android.livesdk.browser.c.b$b r1 = r1.mo11561b(r2)
            java.lang.String r6 = "radius"
            boolean r6 = r13.has(r6)
            if (r6 == 0) goto L_0x011f
            r1.mo11564d(r3)
            goto L_0x0122
        L_0x011f:
            r1.mo11556a(r4, r5, r0, r7)
        L_0x0122:
            java.lang.String r0 = "monitor"
            boolean r0 = r13.has(r0)
            if (r0 == 0) goto L_0x013d
            java.lang.String r0 = "monitor"
            org.json.JSONObject r13 = r13.optJSONObject(r0)
            java.lang.String r0 = "service"
            java.lang.String r13 = r13.optString(r0)
            com.bytedance.android.live.browser.b r13 = com.bytedance.android.livesdk.p431y.p433b.C9281a.m27616a(r13)
            r1.mo11557a(r13)
        L_0x013d:
            com.bytedance.android.livesdk.w.f r13 = com.bytedance.android.livesdk.p428w.C9178j.m27302j()
            com.bytedance.android.livesdk.browser.c.b r13 = r13.mo22374c()
            com.bytedance.android.live.core.widget.BaseDialogFragment r13 = r13.mo11533a(r1)
            java.lang.ref.WeakReference<android.content.Context> r0 = r12.f12047a
            java.lang.Object r0 = r0.get()
            android.support.v4.app.FragmentActivity r0 = (android.support.p022v4.app.FragmentActivity) r0
            com.bytedance.android.live.core.widget.BaseDialogFragment.m12686a(r0, r13)
            java.lang.String r13 = "code"
            r14.put(r13, r2)
            return
        L_0x015a:
            java.lang.String r13 = "code"
            r14.put(r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.p201c.C4057i.m14137h(org.json.JSONObject, org.json.JSONObject):void");
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void call(com.bytedance.ies.web.p582a.C11097i r7, org.json.JSONObject r8) throws java.lang.Exception {
        /*
            r6 = this;
            java.lang.String r0 = "code"
            r1 = 0
            r8.put(r0, r1)
            org.json.JSONObject r0 = r7.f30171d
            java.lang.String r2 = "type"
            java.lang.String r0 = r0.optString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x001a
            java.lang.String r7 = "code"
            r8.put(r7, r1)
            return
        L_0x001a:
            r2 = 0
            org.json.JSONObject r3 = r7.f30171d
            java.lang.String r4 = "args"
            boolean r3 = r3.has(r4)
            if (r3 == 0) goto L_0x002d
            org.json.JSONObject r2 = r7.f30171d
            java.lang.String r3 = "args"
            org.json.JSONObject r2 = r2.getJSONObject(r3)
        L_0x002d:
            r3 = -1
            int r4 = r0.hashCode()
            r5 = 1
            switch(r4) {
                case -1949693950: goto L_0x00dc;
                case -1932693274: goto L_0x00d2;
                case -1361632588: goto L_0x00c7;
                case -907987547: goto L_0x00bc;
                case -309425751: goto L_0x00b2;
                case -191501435: goto L_0x00a8;
                case 98260: goto L_0x009d;
                case 3322092: goto L_0x0092;
                case 3506395: goto L_0x0088;
                case 65209337: goto L_0x007e;
                case 112202875: goto L_0x0072;
                case 505229877: goto L_0x0067;
                case 845427215: goto L_0x005b;
                case 1152538955: goto L_0x004f;
                case 1224424441: goto L_0x0043;
                case 1654221230: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x00e6
        L_0x0038:
            java.lang.String r4 = "login_panel"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 4
            goto L_0x00e7
        L_0x0043:
            java.lang.String r4 = "webview"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 8
            goto L_0x00e7
        L_0x004f:
            java.lang.String r4 = "upload_poster"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 11
            goto L_0x00e7
        L_0x005b:
            java.lang.String r4 = "broadcast_task_finish"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 15
            goto L_0x00e7
        L_0x0067:
            java.lang.String r4 = "gift_panel"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 1
            goto L_0x00e7
        L_0x0072:
            java.lang.String r4 = "video"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 12
            goto L_0x00e7
        L_0x007e:
            java.lang.String r4 = "comments_panel"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 2
            goto L_0x00e7
        L_0x0088:
            java.lang.String r4 = "room"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 3
            goto L_0x00e7
        L_0x0092:
            java.lang.String r4 = "live"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 10
            goto L_0x00e7
        L_0x009d:
            java.lang.String r4 = "car"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 14
            goto L_0x00e7
        L_0x00a8:
            java.lang.String r4 = "feedback"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 5
            goto L_0x00e7
        L_0x00b2:
            java.lang.String r4 = "profile"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00e7
        L_0x00bc:
            java.lang.String r4 = "scheme"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 13
            goto L_0x00e7
        L_0x00c7:
            java.lang.String r4 = "charge"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 9
            goto L_0x00e7
        L_0x00d2:
            java.lang.String r4 = "webview_popup"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 7
            goto L_0x00e7
        L_0x00dc:
            java.lang.String r4 = "feedback_send"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x00e6
            r0 = 6
            goto L_0x00e7
        L_0x00e6:
            r0 = -1
        L_0x00e7:
            switch(r0) {
                case 0: goto L_0x0196;
                case 1: goto L_0x0175;
                case 2: goto L_0x013a;
                case 3: goto L_0x0136;
                case 4: goto L_0x0132;
                case 5: goto L_0x012e;
                case 6: goto L_0x012a;
                case 7: goto L_0x0126;
                case 8: goto L_0x0122;
                case 9: goto L_0x011e;
                case 10: goto L_0x010f;
                case 11: goto L_0x0100;
                case 12: goto L_0x00fc;
                case 13: goto L_0x00f8;
                case 14: goto L_0x00f4;
                case 15: goto L_0x00f0;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            java.lang.String r7 = "code"
            r8.put(r7, r5)
            return
        L_0x00f0:
            m14130a(r2, r8)
            return
        L_0x00f4:
            m14141l(r2, r8)
            return
        L_0x00f8:
            r6.m14140k(r2, r8)
            return
        L_0x00fc:
            r6.m14131b(r2, r8)
            return
        L_0x0100:
            com.bytedance.android.livesdk.h.f r7 = new com.bytedance.android.livesdk.h.f
            r7.<init>()
            r7.f22779a = r5
            com.bytedance.android.livesdk.v.a r8 = com.bytedance.android.livesdk.p427v.C9097a.m27146a()
            r8.mo22267a(r7)
            return
        L_0x010f:
            com.bytedance.android.livesdk.h.f r7 = new com.bytedance.android.livesdk.h.f
            r7.<init>()
            r7.f22779a = r1
            com.bytedance.android.livesdk.v.a r8 = com.bytedance.android.livesdk.p427v.C9097a.m27146a()
            r8.mo22267a(r7)
            return
        L_0x011e:
            r6.m14139j(r2, r8)
            return
        L_0x0122:
            r6.m14138i(r2, r8)
            return
        L_0x0126:
            r6.m14137h(r2, r8)
            return
        L_0x012a:
            r6.m14136g(r2, r8)
            return
        L_0x012e:
            r6.m14135f(r2, r8)
            return
        L_0x0132:
            r6.m14134e(r2, r8)
            return
        L_0x0136:
            r6.m14133d(r2, r8)
            return
        L_0x013a:
            org.json.JSONObject r0 = r7.f30171d
            java.lang.String r2 = "args"
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L_0x0168
            org.json.JSONObject r0 = r7.f30171d
            java.lang.String r2 = "args"
            org.json.JSONObject r0 = r0.getJSONObject(r2)
            java.lang.String r2 = "enableDanmaku"
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L_0x0168
            org.json.JSONObject r7 = r7.f30171d
            java.lang.String r0 = "args"
            org.json.JSONObject r7 = r7.getJSONObject(r0)
            java.lang.String r0 = "enableDanmaku"
            java.lang.String r7 = r7.getString(r0)
            java.lang.String r0 = "1"
            boolean r1 = android.text.TextUtils.equals(r7, r0)
        L_0x0168:
            com.bytedance.android.livesdkapi.service.c r7 = com.bytedance.android.livesdk.TTLiveSDKContext.getLiveService()
            r7.mo22013a(r1)
            java.lang.String r7 = "code"
            r8.put(r7, r5)
            return
        L_0x0175:
            java.lang.String r0 = "gift"
            org.json.JSONObject r2 = r7.f30171d
            java.lang.String r3 = "panel_type"
            boolean r2 = r2.has(r3)
            if (r2 == 0) goto L_0x0189
            org.json.JSONObject r7 = r7.f30171d
            java.lang.String r0 = "panel_type"
            java.lang.String r0 = r7.getString(r0)
        L_0x0189:
            com.bytedance.android.livesdkapi.service.c r7 = com.bytedance.android.livesdk.TTLiveSDKContext.getLiveService()
            r7.mo22011a(r0, r1)
            java.lang.String r7 = "code"
            r8.put(r7, r5)
            return
        L_0x0196:
            m14132c(r2, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.p201c.C4057i.call(com.bytedance.ies.web.a.i, org.json.JSONObject):void");
    }
}
