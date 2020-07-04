package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4116at.C4117a;
import com.bytedance.android.livesdk.browser.p197g.C4025b;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C4411ac;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9079q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.C9388a;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.p276a.C6593c;
import java.util.HashMap;
import java.util.Map;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.au */
public final class C4119au extends C11152c<C4122a, Object> {

    /* renamed from: a */
    private C4117a f12106a;

    /* renamed from: b */
    private C7321c f12107b;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.au$a */
    static final class C4122a {
        @C6593c(mo15949a = "title")

        /* renamed from: a */
        String f12112a;
        @C6593c(mo15949a = "desc")

        /* renamed from: b */
        String f12113b;
        @C6593c(mo15949a = "image")

        /* renamed from: c */
        String f12114c;
        @C6593c(mo15949a = "url")

        /* renamed from: d */
        String f12115d;

        C4122a() {
        }
    }

    public final void onTerminate() {
        if (this.f12107b != null) {
            this.f12107b.dispose();
        }
        this.f12106a = null;
    }

    public C4119au(C4117a aVar) {
        this.f12106a = aVar;
    }

    /* renamed from: a */
    static final /* synthetic */ void m14205a(C3479d dVar) throws Exception {
        if (dVar != null && dVar.data != null && ((ShareReportResult) dVar.data).getDeltaIntimacy() > 0) {
            C9097a.m27146a().mo22267a((Object) new C4411ac((ShareReportResult) dVar.data));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005e A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m14204a(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = -1
            if (r0 == r1) goto L_0x004a
            r1 = 3616(0xe20, float:5.067E-42)
            if (r0 == r1) goto L_0x0040
            r1 = 108102557(0x671839d, float:4.5423756E-35)
            if (r0 == r1) goto L_0x0036
            r1 = 113011944(0x6bc6ce8, float:7.0877763E-35)
            if (r0 == r1) goto L_0x002c
            r1 = 1355475581(0x50caea7d, float:2.72349204E10)
            if (r0 == r1) goto L_0x0022
            goto L_0x0054
        L_0x0022:
            java.lang.String r0 = "weixin_moment"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 3
            goto L_0x0055
        L_0x002c:
            java.lang.String r0 = "weibo"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 4
            goto L_0x0055
        L_0x0036:
            java.lang.String r0 = "qzone"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 1
            goto L_0x0055
        L_0x0040:
            java.lang.String r0 = "qq"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 0
            goto L_0x0055
        L_0x004a:
            java.lang.String r0 = "weixin"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 2
            goto L_0x0055
        L_0x0054:
            r7 = -1
        L_0x0055:
            switch(r7) {
                case 0: goto L_0x005e;
                case 1: goto L_0x005d;
                case 2: goto L_0x005c;
                case 3: goto L_0x005b;
                case 4: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            return r6
        L_0x0059:
            r7 = 5
            return r7
        L_0x005b:
            return r2
        L_0x005c:
            return r3
        L_0x005d:
            return r4
        L_0x005e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4119au.m14204a(java.lang.String):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(C4122a aVar, CallContext callContext) throws Exception {
        final Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        HashMap hashMap = new HashMap();
        C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
        if (a != null) {
            hashMap.putAll(a.mo21568a());
        }
        C8416g a2 = C8443c.m25663a().mo21605a(Room.class);
        if (a != null) {
            hashMap.putAll(a2.mo21568a());
        }
        if (currentRoom != null) {
            TTLiveSDKContext.getHostService().mo22364e().mo22110a((Activity) callContext.f30265a, C9389b.m27848a(currentRoom).mo23100a((Map<String, String>) hashMap).mo23102a(), (C9388a) new C9388a() {
                /* renamed from: a */
                public final void mo11627a(Throwable th) {
                    C3166a.m11963b("SharePanelMethod", th);
                }

                /* renamed from: a */
                public final void mo11626a(String str, String str2) {
                    C4119au.this.mo11694a(currentRoom.getId(), str, 1, currentRoom.getLabels());
                    C4119au.m14207a(currentRoom, str, str2);
                }
            });
            return;
        }
        C4025b f = this.f12106a.mo11613f();
        if (aVar != null) {
            f = new C4025b(aVar.f12112a, aVar.f12113b, aVar.f12114c, aVar.f12115d);
        }
        if (f != null && !TextUtils.isEmpty(f.f11998d)) {
            Builder buildUpon = Uri.parse(f.f11998d).buildUpon();
            buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()));
            TTLiveSDKContext.getHostService().mo22364e().mo22110a((Activity) callContext.f30265a, C9389b.m27846a().mo23099a(f.f11995a).mo23104b(f.f11996b).mo23105c(f.f11997c).mo23106d(buildUpon.toString()).mo23100a((Map<String, String>) hashMap).mo23102a(), (C9388a) new C9388a() {
                /* renamed from: a */
                public final void mo11627a(Throwable th) {
                    C3166a.m11963b("SharePanelMethod", th);
                }

                /* renamed from: a */
                public final void mo11626a(String str, String str2) {
                    String labels;
                    C4119au auVar = C4119au.this;
                    if (currentRoom == null) {
                        labels = "";
                    } else {
                        labels = currentRoom.getLabels();
                    }
                    auVar.mo11694a(0, str, 1, labels);
                    C4119au.m14207a(currentRoom, str, str2);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m14207a(Room room, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("share_platform", str);
        hashMap.put("is_pyramid_sale", "0");
        hashMap.put("share_type", str2);
        if (room != null) {
            hashMap.put("log_pb", room.getLog_pb());
        }
        C8443c.m25663a().mo21606a("share", hashMap, new C8438j().mo21604g("click"), Room.class);
    }

    /* renamed from: a */
    public final void mo11694a(long j, String str, int i, String str2) {
        this.f12107b = ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).sendShare(j, new C9079q().mo22259a("target_id", String.valueOf(m14204a(str))).mo22259a("share_type", "1").mo22259a("common_label_list", String.valueOf(str2)).f24734a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a(C4123av.f12116a, C3303k.m12377b());
    }
}
