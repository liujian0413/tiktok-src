package com.bytedance.android.livesdk.schema;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.chatroom.event.C4445o;
import com.bytedance.android.livesdk.chatroom.event.C4446p;
import com.bytedance.android.livesdk.chatroom.p209bl.C4274f;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.i18n.C8317b;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8445e.C8446a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.rank.C8804a;
import com.bytedance.android.livesdk.schema.interfaces.C8932b;
import com.bytedance.android.livesdk.schema.interfaces.C8932b.C8933a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.android.livesdkapi.p452h.C9412a;
import com.bytedance.common.utility.C6319n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

public class RoomActionHandler implements C8932b {
    private static final String XT_LEARNING_ROOM_TYPE = "1";
    private boolean isFromPush;
    private boolean isNewFeedStyle;

    private boolean shouldConfirmAndNeverAlert() {
        if (!C8804a.m26399b() || this.isNewFeedStyle) {
            return false;
        }
        return true;
    }

    public boolean canHandle(Uri uri) {
        if (!TextUtils.equals("webcast_room", uri.getHost()) || (!TextUtils.equals("/", uri.getPath()) && !TextUtils.equals("", uri.getPath()))) {
            return false;
        }
        return true;
    }

    private void toastClickLog(C8933a aVar, boolean z) {
        String str;
        if (aVar.f24306b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("toast_type", aVar.f24306b);
            String str2 = "choose_type";
            if (z) {
                str = "cancel";
            } else {
                str = "yes_never";
            }
            hashMap.put(str2, str);
            C8443c.m25663a().mo21606a("livesdk_toast_click", hashMap, Room.class);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$handle$0$RoomActionHandler(long j, C47870u uVar) throws Exception {
        String str;
        try {
            Room a = C4274f.m14431a(false, j, 3);
            User owner = a.getOwner();
            if (a.getStatus() == 4) {
                str = "live_finish";
            } else {
                str = "live_on";
            }
            logPushCheckLiveState(owner, j, str);
        } catch (Exception e) {
            C3166a.m11963b("ttlive_push", (Throwable) e);
        }
    }

    public void logPushClick(String str, String str2) {
        if (this.isFromPush) {
            C8443c.m25663a().mo21606a("livesdk_push_click", C8446a.m25675a().mo21609a("anchor_id", str2).mo21609a("room_id", str).f23108a, new Object[0]);
        }
    }

    private void jumpToOtherRoom(Room room, C8933a aVar) {
        C4445o oVar = new C4445o(aVar.f24305a);
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", aVar.f24307c);
        bundle.putString("source", aVar.f24309e);
        bundle.putString("enter_from_merge", aVar.f24308d);
        bundle.putString("enter_method", aVar.f24310f);
        bundle.putLong("anchor_id", aVar.f24320p);
        bundle.putString("top_message_type", aVar.f24325u);
        bundle.putString("message_type", aVar.f24311g);
        bundle.putLong("live.intent.extra.FROM_ROOM_ID", room.getId());
        bundle.putInt("orientation", aVar.f24322r);
        if (!C6319n.m19593a(aVar.f24312h)) {
            bundle.putString("gift_id", aVar.f24312h);
        }
        if (!TextUtils.isEmpty(aVar.f24327w)) {
            bundle.putString("pop_type", aVar.f24327w);
        }
        oVar.f12900c = bundle;
        oVar.f12899b = aVar.f24306b;
        bundle.putBoolean("live.intent.extra.OPEN_PICK_PROFILE_PANEL", aVar.f24329y);
        bundle.putBoolean("live.intent.extra.OPEN_PICK_TOP", aVar.f24330z);
        bundle.putLong("live.intent.extra.FROM_PORTAL_ID", aVar.f24328x);
        if (aVar.f24303E != null) {
            bundle.putString("enable_feed_drawer", aVar.f24303E);
        }
        if ("true".equals(aVar.f24323s)) {
            C9097a.m27146a().mo22267a((Object) new C4446p(oVar));
        } else {
            C9097a.m27146a().mo22267a((Object) oVar);
        }
    }

    public boolean handle(final Context context, final Uri uri) {
        String queryParameter = uri.getQueryParameter("room_id");
        long j = 0;
        if (!TextUtils.isEmpty(queryParameter)) {
            long parseLong = Long.parseLong(queryParameter);
            if (parseLong > 0) {
                String str = "";
                String queryParameter2 = uri.getQueryParameter("enter_from_merge");
                String queryParameter3 = uri.getQueryParameter("enter_method");
                String queryParameter4 = uri.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    try {
                        j = Long.parseLong(queryParameter4);
                    } catch (NumberFormatException unused) {
                    }
                }
                logPushClick(queryParameter, queryParameter4);
                if (this.isFromPush) {
                    C7492s.m23282a((C7495v<T>) new C8928g<T>(this, parseLong)).mo19304b(C7333a.m23044b()).mo19333l();
                }
                return handleEnterRoom(context, new C8933a().mo22054a(parseLong).mo22078n(str).mo22064b(uri.getQueryParameter("enter_live_source")).mo22067c(uri.getQueryParameter("enter_from_v3")).mo22075k(queryParameter2).mo22076l(uri.getQueryParameter("enter_method")).mo22068d(uri.getQueryParameter("enter_from_module")).mo22069e(uri.getQueryParameter("msg_type")).mo22062b(j).mo22070f(uri.getQueryParameter("gift_id")).mo22071g(uri.getQueryParameter("tip")).mo22076l(queryParameter3).mo22073i(uri.getQueryParameter("request_id")).mo22074j(uri.getQueryParameter("log_pb")).mo22072h(uri.getQueryParameter("tip_i18n")).mo22057a(uri.getQueryParameter("top_message_type")).mo22061b(-1).mo22053a(-1).mo22079o(uri.getQueryParameter("pop_type")).mo22080p(uri.getQueryParameter("video_id")).mo22077m(uri.getQueryParameter("back_room")).mo22081q("").mo22082r("").mo22083s("").mo22058a((HashMap) null));
            }
        } else {
            final String queryParameter5 = uri.getQueryParameter("user_id");
            if (!TextUtils.isEmpty(queryParameter5)) {
                long parseLong2 = Long.parseLong(queryParameter5);
                if (parseLong2 > 0) {
                    TTLiveSDKContext.getHostService().mo22367h().mo22180b(parseLong2).mo19137b((C47557ad<? super T>) new C47557ad<User>() {
                        public final void onSubscribe(C7321c cVar) {
                        }

                        public final void onError(Throwable th) {
                            RoomActionHandler.this.logPushClick("-1", queryParameter5);
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void onSuccess(User user) {
                            String str;
                            RoomActionHandler.this.logPushClick(String.valueOf(user.getLiveRoomId()), queryParameter5);
                            long liveRoomId = user.getLiveRoomId();
                            RoomActionHandler roomActionHandler = RoomActionHandler.this;
                            if (liveRoomId > 0) {
                                str = "live_on";
                            } else {
                                str = "live_finish";
                            }
                            roomActionHandler.logPushCheckLiveState(user, liveRoomId, str);
                            if (liveRoomId > 0) {
                                RoomActionHandler.this.handleEnterRoom(context, new C8933a().mo22054a(liveRoomId).mo22064b(uri.getQueryParameter("enter_live_source")).mo22067c(uri.getQueryParameter("enter_from_v3")).mo22076l(uri.getQueryParameter("enter_method")).mo22075k(uri.getQueryParameter("enter_from_merge")).mo22068d(uri.getQueryParameter("enter_from_module")).mo22069e(uri.getQueryParameter("msg_type")).mo22070f(uri.getQueryParameter("gift_id")).mo22071g(uri.getQueryParameter("tip")).mo22080p(uri.getQueryParameter("video_id")).mo22072h(uri.getQueryParameter("tip_i18n")).mo22058a((HashMap) null));
                                return;
                            }
                            TTLiveSDKContext.getHostService().mo22362c().centerToast(context, TTLiveSDKContext.getHostService().mo22360a().context().getString(R.string.eyj), 1);
                        }
                    });
                }
            }
        }
        return false;
    }

    public boolean handleEnterRoom(Context context, C8933a aVar) {
        Bundle bundle;
        long j = 0;
        if (aVar.f24305a <= 0) {
            return false;
        }
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom == null) {
            Boolean bool = (Boolean) LiveSettingKeys.ENABLE_ENTER_ROOM_OPT_FROM_LIVE_AUDIENCE_END.mo10240a();
            if (bool == null || !bool.booleanValue() || aVar.f24304F == null) {
                bundle = new Bundle();
            } else {
                bundle = C9412a.m27916a(aVar.f24304F);
            }
            bundle.putLong("live.intent.extra.ROOM_ID", aVar.f24305a);
            bundle.putString("live.intent.extra.ENTER_LIVE_SOURCE", aVar.f24306b);
            bundle.putString("live.intent.extra.REQUEST_ID", aVar.f24318n);
            bundle.putString("live.intent.extra.LOG_PB", aVar.f24319o);
            bundle.putLong("live.intent.extra.USER_FROM", aVar.f24320p);
            bundle.putInt("orientation", aVar.f24322r);
            bundle.putInt("enter_room_type", aVar.f24326v);
            bundle.putString("author_id", aVar.f24324t);
            bundle.putString("pop_type", aVar.f24327w);
            bundle.putLong("live.intent.extra.FROM_PORTAL_ID", aVar.f24328x);
            if (aVar.f24302D != null) {
                bundle.putBoolean("enter_from_effect_ad", true);
                bundle.putSerializable("live_effect_ad_log_extra_map", aVar.f24302D);
            }
            try {
                j = Long.parseLong(aVar.f24324t);
            } catch (Exception unused) {
            }
            bundle.putLong("anchor_id", j);
            if (aVar.f24303E != null) {
                bundle.putString("enable_feed_drawer", aVar.f24303E);
            }
            if (aVar.f24321q == null) {
                aVar.f24321q = new Bundle();
            }
            aVar.f24321q.putString("enter_from", aVar.f24307c);
            aVar.f24321q.putString("enter_from_merge", aVar.f24308d);
            aVar.f24321q.putString("pop_type", aVar.f24327w);
            aVar.f24321q.putString("enter_method", aVar.f24310f);
            aVar.f24321q.putBoolean("live.intent.extra.OPEN_GIFT_PANEL", aVar.f24315k);
            aVar.f24321q.putBoolean("live.intent.extra.OPEN_PROP_PANEL", aVar.f24316l);
            aVar.f24321q.putString("top_message_type", aVar.f24325u);
            aVar.f24321q.putString("video_id", aVar.f24299A);
            aVar.f24321q.putBoolean("live.intent.extra.OPEN_PICK_PROFILE_PANEL", aVar.f24329y);
            aVar.f24321q.putBoolean("live.intent.extra.OPEN_PICK_TOP", aVar.f24330z);
            aVar.f24321q.putString("request_page", aVar.f24300B);
            aVar.f24321q.putString("anchor_type", aVar.f24301C);
            bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", aVar.f24321q);
            if (aVar.f24317m != null) {
                aVar.f24321q.putAll(aVar.f24317m);
            }
            bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", aVar.f24321q);
            TTLiveSDKContext.getHostService().mo22366g().mo23270a(context, aVar.f24305a, bundle);
            return true;
        } else if (currentRoom.getOwner() != null && currentRoom.getOwner().getId() == TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
            new C9249a(context, 0).mo22716a(false).mo22718b((int) R.string.f39).mo22722b(0, (int) R.string.f3a, C8929h.f24297a).mo22729d();
            return true;
        } else if (currentRoom.getId() == aVar.f24305a) {
            Class liveActivityClass = TTLiveSDKContext.getHostService().mo22362c().getLiveActivityClass();
            if (liveActivityClass != null && !liveActivityClass.isAssignableFrom(context.getClass())) {
                ((Activity) context).finish();
            }
            return true;
        } else if (2 == ((Integer) C3913e.m13800a().f11699b).intValue()) {
            new C9249a(context, 0).mo22716a(false).mo22718b((int) R.string.f3b).mo22722b(0, (int) R.string.f3a, C8930i.f24298a).mo22729d();
            return true;
        } else if (!TextUtils.isEmpty(aVar.f24313i) || !TextUtils.isEmpty(aVar.f24314j)) {
            Spannable spannable = null;
            if (!TextUtils.isEmpty(aVar.f24314j)) {
                try {
                    C9505f fVar = (C9505f) C9178j.m27302j().mo22372a().mo15974a(aVar.f24314j, C9505f.class);
                    if (fVar != null) {
                        String a = C8317b.m25387a().mo21482a(fVar.f26013a);
                        String str = fVar.f26014b;
                        if (TextUtils.isEmpty(a)) {
                            a = str;
                        }
                        spannable = C4374z.m14751a(a, fVar);
                    }
                } catch (Exception e) {
                    C3166a.m11966e("RoomSchemaHandler", e.getMessage());
                }
            }
            if (spannable == null || spannable == C4374z.f12668a) {
                spannable = new SpannableString(aVar.f24313i);
            }
            if (!TextUtils.isEmpty(spannable)) {
                new C9249a(context, 1).mo22716a(false).mo22727c((CharSequence) spannable).mo22722b(2, (int) R.string.f3c, (OnClickListener) new C8936j(this, currentRoom, aVar)).mo22722b(3, (int) R.string.f3_, C8937k.f24334a).mo22729d();
            }
            return true;
        } else {
            jumpToOtherRoom(currentRoom, aVar);
            return true;
        }
    }

    private /* synthetic */ void lambda$handleEnterRoom$6(C8933a aVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        toastClickLog(aVar, true);
    }

    public void logPushCheckLiveState(User user, long j, String str) {
        if (this.isFromPush) {
            C8443c a = C8443c.m25663a();
            String str2 = "livesdk_push_click_lookup_anchor";
            C8446a a2 = C8446a.m25675a().mo21609a("anchor_id", String.valueOf(user.getId())).mo21609a("anchor_status", str);
            String str3 = "room_id";
            if (j <= 0) {
                j = 0;
            }
            a.mo21606a(str2, a2.mo21609a(str3, String.valueOf(j)).f23108a, new Object[0]);
        }
    }

    private /* synthetic */ void lambda$handleEnterRoom$8(Room room, C8933a aVar, DialogInterface dialogInterface, int i) {
        C8933a aVar2 = aVar;
        jumpToOtherRoom(room, aVar2.f24305a, aVar2.f24308d, aVar2.f24310f, aVar2.f24307c, aVar2.f24309e, aVar2.f24311g, aVar2.f24312h, aVar2.f24306b, aVar2.f24322r, aVar2.f24323s, aVar2.f24320p, aVar2.f24325u, aVar2.f24327w, aVar2.f24328x);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$handleEnterRoom$3$RoomActionHandler(Room room, C8933a aVar, DialogInterface dialogInterface, int i) {
        C8933a aVar2 = aVar;
        jumpToOtherRoom(room, aVar2.f24305a, aVar2.f24308d, aVar2.f24310f, aVar2.f24307c, aVar2.f24309e, aVar2.f24311g, aVar2.f24312h, aVar2.f24306b, aVar2.f24322r, aVar2.f24323s, aVar2.f24320p, aVar2.f24325u, aVar2.f24327w, aVar2.f24328x);
        dialogInterface.dismiss();
    }

    private /* synthetic */ void lambda$handleEnterRoom$5(Room room, C8933a aVar, DialogInterface dialogInterface, int i) {
        C8933a aVar2 = aVar;
        Room room2 = room;
        Room room3 = room2;
        jumpToOtherRoom(room3, aVar2.f24305a, aVar2.f24308d, aVar2.f24310f, aVar2.f24307c, aVar2.f24309e, aVar2.f24311g, aVar2.f24312h, aVar2.f24306b, aVar2.f24322r, aVar2.f24323s, aVar2.f24320p, aVar2.f24325u, aVar2.f24327w, aVar2.f24328x);
        if (shouldConfirmAndNeverAlert()) {
            C8946b.f24398aW.mo22118a(Boolean.valueOf(false));
        }
        dialogInterface.dismiss();
        toastClickLog(aVar2, false);
    }

    private /* synthetic */ void lambda$handleEnterRoom$7(Room room, C8933a aVar, DialogInterface dialogInterface, int i) {
        C8933a aVar2 = aVar;
        jumpToOtherRoom(room, aVar2.f24305a, aVar2.f24308d, aVar2.f24310f, aVar2.f24307c, aVar2.f24309e, aVar2.f24311g, aVar2.f24312h, aVar2.f24306b, aVar2.f24322r, aVar2.f24323s, aVar2.f24320p, aVar2.f24325u, aVar2.f24327w, aVar2.f24328x);
        if (shouldConfirmAndNeverAlert()) {
            C8946b.f24398aW.mo22118a(Boolean.valueOf(false));
        }
        C8946b.f24398aW.mo22118a(Boolean.valueOf(false));
        dialogInterface.dismiss();
    }

    private void jumpToOtherRoom(Room room, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, long j2, String str9, String str10, long j3) {
        long j4 = j;
        C4445o oVar = new C4445o(j);
        Bundle bundle = new Bundle();
        String str11 = str3;
        bundle.putString("enter_from", str3);
        String str12 = str4;
        bundle.putString("source", str4);
        String str13 = str;
        bundle.putString("enter_from_merge", str);
        String str14 = str2;
        bundle.putString("enter_method", str2);
        bundle.putLong("anchor_id", j2);
        bundle.putString("top_message_type", str9);
        if (!TextUtils.isEmpty(str10)) {
            bundle.putString("pop_type", str10);
        }
        bundle.putLong("live.intent.extra.FROM_PORTAL_ID", j3);
        String str15 = str5;
        bundle.putString("message_type", str5);
        bundle.putLong("live.intent.extra.FROM_ROOM_ID", room.getId());
        bundle.putInt("orientation", i);
        if (!C6319n.m19593a(str6)) {
            String str16 = str6;
            bundle.putString("gift_id", str6);
        }
        oVar.f12900c = bundle;
        oVar.f12899b = str7;
        if ("true".equals(str8)) {
            C9097a.m27146a().mo22267a((Object) new C4446p(oVar));
        } else {
            C9097a.m27146a().mo22267a((Object) oVar);
        }
    }
}
