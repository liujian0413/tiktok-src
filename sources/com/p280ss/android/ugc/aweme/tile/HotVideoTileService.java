package com.p280ss.android.ugc.aweme.tile;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.ugc.appcontext.C6405d.C6407b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.tile.HotVideoTileService */
public final class HotVideoTileService extends TileService {

    /* renamed from: b */
    public static final long f109636b = 2500;

    /* renamed from: c */
    public static final C42116a f109637c = new C42116a(null);

    /* renamed from: a */
    public volatile boolean f109638a;

    /* renamed from: com.ss.android.ugc.aweme.tile.HotVideoTileService$a */
    public static final class C42116a {
        private C42116a() {
        }

        public /* synthetic */ C42116a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tile.HotVideoTileService$b */
    static final class C42117b<T> implements C7326g<Activity> {

        /* renamed from: a */
        final /* synthetic */ HotVideoTileService f109639a;

        C42117b(HotVideoTileService hotVideoTileService) {
            this.f109639a = hotVideoTileService;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Activity activity) {
            if (activity instanceof C6407b) {
                this.f109639a.f109638a = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tile.HotVideoTileService$c */
    static final class C42118c<TTaskResult, TContinuationResult> implements C1591g<Void, C1592h<Void>> {

        /* renamed from: a */
        final /* synthetic */ HotVideoTileService f109640a;

        C42118c(HotVideoTileService hotVideoTileService) {
            this.f109640a = hotVideoTileService;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C1592h<Void> then(C1592h<Void> hVar) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_status", this.f109640a.f109638a ? 1 : 0);
            C6379c.m19828a("tile_service_open", jSONObject, (JSONObject) null, (JSONObject) null);
            return hVar;
        }
    }

    public final void onStartListening() {
        super.onStartListening();
        m134081a(1);
    }

    public final void onTileAdded() {
        super.onTileAdded();
        C6907h.m21524a("add_to_notificationbar", (Map) C22984d.m75611a().mo59973a("features", "watch_video").f60753a);
    }

    public final void onTileRemoved() {
        super.onTileRemoved();
        C6907h.m21524a("delete_from_notificationbar", (Map) C22984d.m75611a().mo59973a("features", "watch_video").f60753a);
    }

    public final void onCreate() {
        super.onCreate();
        long uptimeMillis = SystemClock.uptimeMillis() - C6857a.m21312e().f19503c;
        if (uptimeMillis <= 1000) {
            C6907h.m21524a("active_in_notificationbar", (Map) C22984d.m75611a().mo59971a("time", uptimeMillis).mo59973a("features", "watch_video").f60753a);
        }
        m134081a(1);
    }

    public final void onClick() {
        super.onClick();
        if (!C6405d.m19987h()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClass(this, DeepLinkHandlerActivity.class);
            intent.putExtra("from_tile_service", true);
            intent.addFlags(268435456);
            startActivityAndCollapse(intent);
            return;
        }
        int k = C6399b.m19935k();
        if (k <= 0) {
            k = 1233;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setClass(this, DeepLinkHandlerActivity.class);
        StringBuilder sb = new StringBuilder(C22909c.f60638b);
        sb.append(k);
        sb.append("://feed?tab=1");
        intent2.setData(Uri.parse(sb.toString()));
        try {
            intent2.addFlags(268435456);
            intent2.putExtra("from_tile_service", true);
            startActivityAndCollapse(intent2);
            this.f109638a = false;
            C6405d.m19974b().mo19325f((C7326g<? super T>) new C42117b<Object>(this));
            C1592h.m7848a(f109636b).mo6880b(new C42118c(this), C1592h.f5958b);
        } catch (Exception e) {
            C2077a.m9160a((Throwable) e);
        }
        C6907h.m21524a("click_notificationbar", (Map) C22984d.m75611a().mo59973a("features", "watch_video").f60753a);
    }

    /* renamed from: a */
    private final void m134081a(int i) {
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            qsTile.setState(1);
        }
        if (qsTile != null) {
            qsTile.setLabel(getString(R.string.aml));
        }
        if (qsTile != null) {
            qsTile.updateTile();
        }
    }
}
