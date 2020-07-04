package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p022v4.app.C0581aa;
import android.support.p029v7.app.AlertDialog.C1081a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.chatroom.event.C4415ag;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;
import p040b.p041a.p042a.p043a.p044a.C1579a;
import p346io.reactivex.C47559ag;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p348d.C7326g;

public final class SubscribeMatchMethod extends C11155d<JSONObject, Object> {

    interface RaceRoomApi {
        @C6468s(mo15750a = "/webcast/match/push_msg_subscribe/")
        C7319aa<C3479d<Object>> subscribePushMsg(@C6474y(mo15757a = "plan_id") String str, @C6474y(mo15757a = "subscribe") boolean z);
    }

    /* renamed from: a */
    static final /* synthetic */ void m14159a(Throwable th) throws Exception {
        C3166a.m11961b("SubscribeMatchMethod", th.toString());
        C4415ag agVar = new C4415ag();
        agVar.f12835a = false;
        C9097a.m27146a().mo22267a((Object) agVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object invoke(JSONObject jSONObject, CallContext callContext) throws Exception {
        String string = jSONObject.getString("match_id");
        int i = jSONObject.getInt("status");
        boolean z = false;
        if (string == null) {
            C3166a.m11961b("SubscribeMatchMethod", "plan id not exist");
            C4415ag agVar = new C4415ag();
            agVar.f12835a = false;
            C9097a.m27146a().mo22267a((Object) agVar);
        }
        RaceRoomApi raceRoomApi = (RaceRoomApi) C9178j.m27302j().mo22373b().mo10440a(RaceRoomApi.class);
        if (i > 0) {
            z = true;
        }
        raceRoomApi.subscribePushMsg(string, z).mo19124a((C47559ag<? super T, ? extends R>) C3303k.m12366a()).mo19129a((C7326g<? super T>) new C4128az<Object>(this, i, callContext), C4134ba.f12134a);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11671a(int i, final CallContext callContext, C3479d dVar) throws Exception {
        if (i != 1) {
            C3517a.m12960a(callContext.f30265a, (int) R.string.fsz);
        } else if (C0581aa.m2444a(callContext.f30265a).mo2561a()) {
            new C1081a(callContext.f30265a).mo4237b((int) R.string.ft3).mo4226a((int) R.string.ft2, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                }
            }).mo4242b().show();
        } else {
            new C1081a(callContext.f30265a).mo4237b((int) R.string.ft4).mo4238b((int) R.string.ft0, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                }
            }).mo4226a((int) R.string.ft1, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Intent a = C1579a.m7678a(callContext.f30265a);
                    if (a != null) {
                        callContext.f30265a.startActivity(a);
                    }
                }
            }).mo4242b().show();
        }
        C4415ag agVar = new C4415ag();
        agVar.f12835a = true;
        C9097a.m27146a().mo22267a((Object) agVar);
    }
}
