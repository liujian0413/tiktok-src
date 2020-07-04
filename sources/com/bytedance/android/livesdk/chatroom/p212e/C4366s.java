package com.bytedance.android.livesdk.chatroom.p212e;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C4433c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.message.model.C8529bs;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.s */
public final class C4366s extends C4340a<C8529bs> {
    /* renamed from: a */
    public final ImageModel mo12060a() {
        return null;
    }

    /* renamed from: b */
    public final int mo12062b() {
        return 0;
    }

    /* renamed from: d */
    public final boolean mo12064d() {
        return true;
    }

    /* renamed from: g */
    public final String mo12067g() {
        return "#ff8533";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        return new SpannableString(((C8529bs) this.f12647a).f23447b);
    }

    public C4366s(C8529bs bsVar) {
        super(bsVar);
    }

    /* renamed from: a */
    public final void mo12061a(Context context, Room room) {
        C9097a.m27146a().mo22267a((Object) new C4433c((C8529bs) this.f12647a));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", room.getUserFrom());
            jSONObject.put("request_id", room.getRequestId());
            jSONObject.put("log_pb", room.getLog_pb());
        } catch (Exception unused) {
        }
        C8448g.m25682a(context);
        TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        room.getId();
    }
}
