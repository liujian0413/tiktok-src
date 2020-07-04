package com.bytedance.android.live.broadcast.preview.p139a.p140a;

import android.content.Context;
import com.bytedance.android.live.broadcast.monitor.BroadcastMonitor;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.utils.C9079q;
import com.bytedance.android.livesdkapi.C9402f;
import com.bytedance.android.livesdkapi.C9402f.C9403a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.live.broadcast.preview.a.a.d */
public final class C2852d implements C9402f {

    /* renamed from: a */
    public static final C2853a f9064a = new C2853a(null);

    /* renamed from: b */
    private StartLiveViewModel f9065b;

    /* renamed from: c */
    private String f9066c;

    /* renamed from: d */
    private String f9067d;

    /* renamed from: e */
    private long f9068e;

    /* renamed from: f */
    private LiveMode f9069f;

    /* renamed from: g */
    private int f9070g;

    /* renamed from: h */
    private boolean f9071h;

    /* renamed from: i */
    private Context f9072i;

    /* renamed from: j */
    private Boolean f9073j = Boolean.valueOf(false);

    /* renamed from: k */
    private HashMap<String, String> f9074k = new HashMap<>();

    /* renamed from: com.bytedance.android.live.broadcast.preview.a.a.d$a */
    public static final class C2853a {
        private C2853a() {
        }

        public /* synthetic */ C2853a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m11370a(String str) {
            String str2;
            Map hashMap = new HashMap();
            hashMap.put("event_type", "click");
            hashMap.put("event_belong", "live");
            hashMap.put("event_page", "live_action");
            hashMap.put("event_module", "title");
            hashMap.put("live_edit_type", "title");
            String str3 = "title_status";
            if (str == null) {
                C7573i.m23580a();
            }
            if (str.length() == 0) {
                str2 = "off";
            } else {
                str2 = "on";
            }
            hashMap.put(str3, str2);
            C8443c.m25663a().mo21606a("live_edit_features", hashMap, new Object[0]);
            Map hashMap2 = new HashMap();
            hashMap2.put("event_type", "click");
            hashMap2.put("event_belong", "live");
            hashMap2.put("event_page", "live_action");
            hashMap2.put("event_module", "action");
            hashMap2.put("is_beauty", "off");
            C8443c.m25663a().mo21606a("live_action", hashMap2, new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        if (r0 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009c, code lost:
        if (r0 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r0 == null) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11366a() {
        /*
            r2 = this;
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r2.f9065b
            if (r0 == 0) goto L_0x0012
            android.arch.lifecycle.o r0 = r0.mo9601h()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            java.lang.String r0 = ""
        L_0x0014:
            r2.f9066c = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r2.f9065b
            if (r0 == 0) goto L_0x0028
            android.arch.lifecycle.o r0 = r0.mo9602i()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r0 = ""
        L_0x002a:
            r2.f9067d = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r2.f9065b
            if (r0 == 0) goto L_0x0041
            android.arch.lifecycle.o r0 = r0.mo9599f()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.live.broadcast.api.model.Game r0 = (com.bytedance.android.live.broadcast.api.model.Game) r0
            if (r0 == 0) goto L_0x0041
            long r0 = r0.gameId
            goto L_0x0043
        L_0x0041:
            r0 = 0
        L_0x0043:
            r2.f9068e = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r2.f9065b
            if (r0 == 0) goto L_0x0057
            android.arch.lifecycle.o r0 = r0.mo9597d()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r0
            if (r0 != 0) goto L_0x0059
        L_0x0057:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
        L_0x0059:
            r2.f9069f = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r2.f9065b
            r1 = 0
            if (r0 == 0) goto L_0x0071
            android.arch.lifecycle.o r0 = r0.mo9603j()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdk.chatroom.model.aq r0 = (com.bytedance.android.livesdk.chatroom.model.C4884aq) r0
            if (r0 == 0) goto L_0x0071
            int r0 = r0.f13993a
            goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            r2.f9070g = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r2.f9065b
            if (r0 == 0) goto L_0x008a
            android.arch.lifecycle.o r0 = r0.mo9604k()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x008a
            boolean r1 = r0.booleanValue()
        L_0x008a:
            r2.f9071h = r1
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r2.f9065b
            if (r0 == 0) goto L_0x009e
            android.arch.lifecycle.o r0 = r0.mo9606m()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r0.getValue()
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 != 0) goto L_0x00a3
        L_0x009e:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x00a3:
            r2.f9074k = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r2.f9065b
            if (r0 == 0) goto L_0x00b6
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.mo9595b()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            r2.f9073j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.p139a.p140a.C2852d.m11366a():void");
    }

    /* renamed from: a */
    public final void mo9617a(StartLiveViewModel startLiveViewModel) {
        C7573i.m23587b(startLiveViewModel, "viewModel");
        this.f9065b = startLiveViewModel;
    }

    /* renamed from: a */
    public final void mo9615a(C9403a aVar) {
        C7573i.m23587b(aVar, "chain");
        m11366a();
        this.f9072i = aVar.mo9614b().f25878a;
        C2853a.m11370a(this.f9066c);
        BroadcastMonitor.m11026a();
        StartLiveViewModel startLiveViewModel = this.f9065b;
        if (startLiveViewModel != null) {
            startLiveViewModel.mo9594a(m11367b(aVar));
        }
        C8448g.m25682a(this.f9072i);
    }

    /* renamed from: b */
    private final HashMap<String, String> m11367b(C9403a aVar) {
        String str;
        String str2;
        boolean z;
        C9079q a = new C9079q().mo22259a("title", this.f9066c).mo22259a("cover_uri", this.f9067d);
        String str3 = "game";
        if (this.f9068e != 0) {
            str = String.valueOf(this.f9068e);
        } else {
            str = "";
        }
        C9079q a2 = a.mo22259a(str3, str);
        String str4 = C38347c.f99557l;
        if (this.f9070g != -1) {
            str2 = String.valueOf(this.f9070g);
        } else {
            str2 = "";
        }
        C9079q a3 = a2.mo22259a(str4, str2);
        C7573i.m23582a((Object) a3, "GenerateApiMap()\n       …TagId.toString() else \"\")");
        HashMap<String, String> hashMap = a3.f24734a;
        if (this.f9069f == LiveMode.AUDIO) {
            C7573i.m23582a((Object) hashMap, "map");
            hashMap.put("live_audio", "1");
        } else if (this.f9069f == LiveMode.THIRD_PARTY) {
            C7573i.m23582a((Object) hashMap, "map");
            hashMap.put("third_party", "1");
        } else if (this.f9069f == LiveMode.SCREEN_RECORD) {
            C7573i.m23582a((Object) hashMap, "map");
            hashMap.put("screen_shot", "1");
        }
        String str5 = (String) aVar.mo9614b().f25880c.get("has_commerce_goods");
        if (str5 == null || (!C7573i.m23585a((Object) str5, (Object) "1") && !C7573i.m23585a((Object) str5, (Object) "true"))) {
            z = false;
        } else {
            z = true;
        }
        if (this.f9071h || z) {
            C7573i.m23582a((Object) hashMap, "map");
            hashMap.put("has_commerce_goods", "true");
        } else {
            aVar.mo9614b().f25880c.remove("has_commerce_goods");
        }
        if (!this.f9074k.isEmpty()) {
            hashMap.putAll(this.f9074k);
        }
        if (this.f9073j != null) {
            Boolean bool = this.f9073j;
            if (bool == null) {
                C7573i.m23580a();
            }
            if (bool.booleanValue()) {
                C7573i.m23582a((Object) hashMap, "map");
                hashMap.put("disable_location_permission", "0");
                hashMap.putAll(aVar.mo9614b().f25880c);
                aVar.mo9614b().f25880c.clear();
                return hashMap;
            }
        }
        C7573i.m23582a((Object) hashMap, "map");
        hashMap.put("disable_location_permission", "1");
        hashMap.putAll(aVar.mo9614b().f25880c);
        aVar.mo9614b().f25880c.clear();
        return hashMap;
    }
}
