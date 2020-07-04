package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.C4878ak;
import com.bytedance.android.livesdk.chatroom.model.C4879al;
import com.bytedance.android.livesdk.chatroom.model.C4881an;
import com.bytedance.android.livesdk.chatroom.model.C4882ao;
import com.bytedance.android.livesdk.chatroom.model.C4917n;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5704er;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.viewmodel.C9145h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.C6600e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ai */
public final class C4101ai extends C11152c<JSONObject, Object> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ai$a */
    static final class C4102a extends Lambda implements C7563m<C9145h, Room, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C4101ai f12083a;

        /* renamed from: b */
        final /* synthetic */ Object f12084b;

        C4102a(C4101ai aiVar, Object obj) {
            this.f12083a = aiVar;
            this.f12084b = obj;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m14186a((C9145h) obj, (Room) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m14186a(C9145h hVar, Room room) {
            C4917n nVar;
            Object obj;
            Object obj2;
            Object obj3 = null;
            if (hVar != null) {
                nVar = hVar.f24849a;
            } else {
                nVar = null;
            }
            if (nVar == null) {
                this.f12083a.finishWithFailure();
                return;
            }
            Object obj4 = this.f12084b;
            if (C7573i.m23585a(obj4, (Object) "dismissReward")) {
                if (hVar.f24849a instanceof C4881an) {
                    hVar.mo22348a((C4917n) new C4878ak());
                    this.f12083a.finishWithSuccess();
                }
            } else if (C7573i.m23585a(obj4, (Object) "getInviteInfo")) {
                C4917n nVar2 = hVar.f24849a;
                if (!(nVar2 instanceof C4879al)) {
                    nVar2 = null;
                }
                C4879al alVar = (C4879al) nVar2;
                if (alVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("anchor", C4101ai.m14184a(alVar.f13970e));
                    jSONObject.put("sugarDaddy", C4101ai.m14184a(alVar.f13969d));
                    jSONObject.put("inviteCountDown", String.valueOf(alVar.f13967b));
                    jSONObject.put("inviteCountDownStartTime", String.valueOf(alVar.f13966a));
                    jSONObject.put("inviteRoomId", String.valueOf(alVar.f13973h));
                    jSONObject.put("portalId", String.valueOf(alVar.f13972g));
                    this.f12083a.finishWithResult(jSONObject);
                    obj3 = C7581n.f20898a;
                }
                if (obj3 == null) {
                    this.f12083a.finishWithFailure();
                }
            } else if (C7573i.m23585a(obj4, (Object) "getRewardInfo")) {
                C4917n nVar3 = hVar.f24849a;
                if (!(nVar3 instanceof C4882ao)) {
                    nVar3 = null;
                }
                C4882ao aoVar = (C4882ao) nVar3;
                if (aoVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("anchor", C4101ai.m14184a(aoVar.f13988e));
                    jSONObject2.put("sugarDaddy", C4101ai.m14184a(aoVar.f13987d));
                    String str = "followStatus";
                    if (room != null) {
                        User owner = room.getOwner();
                        if (owner != null) {
                            FollowInfo followInfo = owner.getFollowInfo();
                            if (followInfo != null) {
                                obj2 = Long.valueOf(followInfo.getFollowStatus());
                                jSONObject2.put(str, obj2);
                                jSONObject2.put("waitCountDown", String.valueOf(aoVar.f13985b));
                                jSONObject2.put("waitCountDownStartTime", String.valueOf(aoVar.f13984a));
                                jSONObject2.put("rewardCountDown", String.valueOf(aoVar.f13986c));
                                jSONObject2.put("portalId", String.valueOf(aoVar.f13990g));
                                this.f12083a.finishWithResult(jSONObject2);
                                obj = C7581n.f20898a;
                            }
                        }
                    }
                    obj2 = null;
                    jSONObject2.put(str, obj2);
                    jSONObject2.put("waitCountDown", String.valueOf(aoVar.f13985b));
                    jSONObject2.put("waitCountDownStartTime", String.valueOf(aoVar.f13984a));
                    jSONObject2.put("rewardCountDown", String.valueOf(aoVar.f13986c));
                    jSONObject2.put("portalId", String.valueOf(aoVar.f13990g));
                    this.f12083a.finishWithResult(jSONObject2);
                    obj = C7581n.f20898a;
                } else {
                    obj = null;
                }
                if (obj == null) {
                    C4917n nVar4 = hVar.f24849a;
                    if (!(nVar4 instanceof C4881an)) {
                        nVar4 = null;
                    }
                    C4881an anVar = (C4881an) nVar4;
                    if (anVar != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("anchor", C4101ai.m14184a(anVar.f13981d));
                        jSONObject3.put("sugarDaddy", C4101ai.m14184a(anVar.f13980c));
                        String str2 = "followStatus";
                        if (room != null) {
                            User owner2 = room.getOwner();
                            if (owner2 != null) {
                                FollowInfo followInfo2 = owner2.getFollowInfo();
                                if (followInfo2 != null) {
                                    obj3 = Long.valueOf(followInfo2.getFollowStatus());
                                }
                            }
                        }
                        jSONObject3.put(str2, obj3);
                        jSONObject3.put("rewardCountDown", String.valueOf(anVar.f13979b));
                        jSONObject3.put("rewardCountDownStartTime", String.valueOf(anVar.f13978a));
                        jSONObject3.put("portalId", String.valueOf(anVar.f13983f));
                        this.f12083a.finishWithResult(jSONObject3);
                        obj3 = C7581n.f20898a;
                    }
                } else {
                    obj3 = obj;
                }
                if (obj3 == null) {
                    this.f12083a.finishWithFailure();
                }
            } else {
                this.f12083a.finishWithFailure();
            }
        }
    }

    public final void onTerminate() {
    }

    /* renamed from: a */
    public static JSONObject m14184a(User user) {
        return new JSONObject(new C6600e().mo15979b((Object) user));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(JSONObject jSONObject, CallContext callContext) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(callContext, "context");
        Object opt = jSONObject.opt("type");
        if (opt == null) {
            finishWithFailure();
            return;
        }
        C9097a.m27146a().mo22267a((Object) new C5704er(new C4102a(this, opt)));
    }
}
