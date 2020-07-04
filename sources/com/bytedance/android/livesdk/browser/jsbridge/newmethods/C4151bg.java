package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.DialogInterface;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.user.C8976b.C8977a;
import com.bytedance.android.livesdk.user.C8976b.C8978b;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.user.C8985f;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.C8991j.C8993b;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair.Type;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg */
public final class C4151bg extends C11152c<JSONObject, Object> {

    /* renamed from: a */
    private C7321c f12188a;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11711a(Throwable th) {
        finishWithFailure(th);
    }

    public final void onTerminate() {
        if (this.f12188a != null) {
            this.f12188a.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11709a(FollowPair followPair) throws Exception {
        finishWithSuccess();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11713b(FollowPair followPair) throws Exception {
        finishWithSuccess();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(JSONObject jSONObject, CallContext callContext) throws Exception {
        String optString = jSONObject.optString("type");
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject == null) {
            finishWithFailure();
        } else if (TextUtils.equals("follow", optString)) {
            m14257a(optJSONObject, callContext.f30265a);
        } else if (TextUtils.equals("unfollow", optString)) {
            m14259b(optJSONObject, callContext.f30265a);
        } else {
            finishWithFailure();
        }
    }

    /* renamed from: a */
    private void m14257a(JSONObject jSONObject, Context context) throws Exception {
        long j;
        long parseLong = Long.parseLong(jSONObject.getString("user_id"));
        try {
            j = Long.parseLong(jSONObject.getString("room_id"));
        } catch (Exception e) {
            C8444d.m25673b();
            C8444d.m11969a(5, e.getStackTrace());
            j = 0;
        }
        String string = jSONObject.getString("from_label");
        String optString = jSONObject.optString("url");
        FollowPair followPair = new FollowPair();
        followPair.f25598f = Type.FromWeb;
        followPair.f25593a = parseLong;
        followPair.f25594b = j;
        followPair.f25596d = optString;
        followPair.f25595c = string;
        followPair.f25599g = true;
        m14256a(followPair, context);
    }

    /* renamed from: b */
    private void m14259b(JSONObject jSONObject, Context context) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        long parseLong = Long.parseLong(jSONObject.getString("user_id"));
        String optString = jSONObject.optString("from_label", "");
        String optString2 = jSONObject.optString("url", "");
        C8984e h = TTLiveSDKContext.getHostService().mo22367h();
        String a = C3358ac.m12515a((int) R.string.eid);
        C4152bh bhVar = new C4152bh(this, jSONObject2, parseLong, optString2, optString, context);
        h.mo22176a(a, bhVar, context, optString, "", parseLong, false);
    }

    /* renamed from: a */
    private void m14256a(FollowPair followPair, Context context) {
        if (followPair != null) {
            if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                if (context instanceof FragmentActivity) {
                    this.f12188a = TTLiveSDKContext.getHostService().mo22367h().mo22167a((FragmentActivity) context, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f6a)).mo22188a(-1).mo22193d("search_result").mo22192c("recommend").mo22194e("follow").mo22190a()).mo19280a((C7326g<? super T>) new C4153bi<Object>(this, followPair, context), (C7326g<? super Throwable>) new C4154bj<Object>(this));
                }
            } else if (followPair.f25599g) {
                this.f12188a = TTLiveSDKContext.getHostService().mo22367h().mo22168a(((C8978b) ((C8978b) ((C8977a) C8985f.m26861a().mo22153a(followPair.f25593a)).mo22156b(followPair.f25594b)).mo22158c(followPair.f25595c)).mo22160c()).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C4155bk<Object>(this), (C7326g<? super Throwable>) new C4156bl<Object>(this));
            } else {
                this.f12188a = TTLiveSDKContext.getHostService().mo22367h().mo22170a(((C8993b) ((C8993b) ((C8993b) C8985f.m26863c().mo22153a(followPair.f25593a)).mo22197a(followPair.f25595c)).mo22195a(followPair.f25597e)).mo22200c()).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C4157bm<Object>(this), (C7326g<? super Throwable>) new C4158bn<Object>(this));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11710a(FollowPair followPair, Context context, IUser iUser) throws Exception {
        m14256a(followPair, context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11712a(JSONObject jSONObject, long j, String str, String str2, Context context, DialogInterface dialogInterface, int i) {
        int i2;
        try {
            i2 = jSONObject.getInt("follow_status");
        } catch (Throwable unused) {
            i2 = 0;
        }
        FollowPair followPair = new FollowPair();
        followPair.f25597e = i2;
        followPair.f25598f = Type.FromWeb;
        followPair.f25593a = j;
        followPair.f25596d = str;
        followPair.f25595c = str2;
        m14256a(followPair, context);
    }
}
