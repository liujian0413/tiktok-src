package com.bytedance.android.livesdk.p422s;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.setting.C3339m;
import com.bytedance.android.live.core.setting.LiveSettingGroupFragment;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.C3904ae;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.app.dataholder.C3915g;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.chatroom.event.C4431aw;
import com.bytedance.android.livesdk.i18n.C8317b;
import com.bytedance.android.livesdk.live.p402a.C8384a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.live.C9321a;
import com.bytedance.android.livesdkapi.depend.live.C9328d;
import com.bytedance.android.livesdkapi.depend.live.C9332f;
import com.bytedance.android.livesdkapi.depend.live.C9337k;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9323b;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9345a;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9348c;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9350e;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9351f;
import com.bytedance.android.livesdkapi.p436c.C9293b;
import com.bytedance.android.livesdkapi.p451g.C9410b;
import com.bytedance.android.livesdkapi.service.C9515c;
import com.bytedance.android.livesdkapi.service.C9516d;
import java.util.Locale;

/* renamed from: com.bytedance.android.livesdk.s.b */
public final class C8913b implements C9515c {

    /* renamed from: a */
    private final C9410b f24282a = C8915c.f24287a;

    /* renamed from: b */
    private C9351f f24283b;

    /* renamed from: c */
    private C9337k f24284c;

    /* renamed from: d */
    private final C9516d f24285d = new C9516d() {
        /* renamed from: a */
        public final int mo22025a() {
            return ((Integer) C3913e.m13800a().f11699b).intValue();
        }

        /* renamed from: a */
        public final void mo22026a(C3915g<Integer> gVar) {
            C3913e.m13800a().mo11451a(gVar);
        }
    };

    /* renamed from: c */
    public final C9516d mo22017c() {
        return this.f24285d;
    }

    /* renamed from: a */
    public final void mo22011a(String str, boolean z) {
        ((IGiftService) C3596c.m13172a(IGiftService.class)).openGiftDialog(str, z);
    }

    /* renamed from: a */
    public final void mo22013a(boolean z) {
        C9097a.m27146a().mo22267a((Object) new C4431aw(2, z));
    }

    /* renamed from: a */
    public final void mo22012a(Locale locale) {
        C8317b.m25387a().mo21483a(locale);
    }

    /* renamed from: a */
    public final boolean mo22014a(Context context, Uri uri) {
        return C9178j.m27302j().mo22380i().handleWithoutHost(context, uri.toString());
    }

    /* renamed from: a */
    public final void mo22010a(String str) {
        C9178j.m27302j().mo22376e().f23036a = new C8384a(str);
    }

    /* renamed from: g */
    public final Fragment mo22021g() {
        return new LiveSettingGroupFragment();
    }

    /* renamed from: h */
    public final C9321a mo22022h() {
        return C8912a.m26658a();
    }

    /* renamed from: b */
    public final C9350e mo22016b() {
        return ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).createStartLiveFragment();
    }

    /* renamed from: d */
    public final C9332f mo22018d() {
        return (C9332f) C3596c.m13172a(C3495l.class);
    }

    /* renamed from: e */
    public final ILivePlayController mo22019e() {
        return ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayController();
    }

    /* renamed from: f */
    public final C9323b mo22020f() {
        return ((IGiftService) C3596c.m13172a(IGiftService.class)).giftPlayControllerManager();
    }

    /* renamed from: j */
    public final C9337k mo22024j() {
        if (this.f24284c == null) {
            this.f24284c = new C3904ae();
        }
        return this.f24284c;
    }

    /* renamed from: i */
    public final C9351f mo22023i() {
        if (this.f24283b == null) {
            this.f24283b = ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).startLiveManager();
        }
        return this.f24283b;
    }

    /* renamed from: a */
    public final void mo22007a() {
        ((IGiftService) C3596c.m13172a(IGiftService.class)).syncGiftList(1);
    }

    /* renamed from: b */
    public final C9293b mo22015b(Bundle bundle) {
        return TTLiveBrowserFragment.m14008a(bundle);
    }

    /* renamed from: a */
    public final C9345a mo22005a(Bundle bundle) {
        return ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).createBgBroadcastFragment(bundle);
    }

    /* renamed from: a */
    public final void mo22009a(Context context) {
        ((IGiftService) C3596c.m13172a(IGiftService.class)).initGiftResourceManager(context);
    }

    /* renamed from: a */
    public final C9328d mo22004a(long j, Bundle bundle) {
        return LiveRoomFragment.m13618a(j, bundle);
    }

    /* renamed from: a */
    public final Fragment mo22001a(Context context, Bundle bundle) {
        return ((IWalletService) C3596c.m13172a(IWalletService.class)).getWalletFragment(context, bundle);
    }

    /* renamed from: a */
    public final Fragment mo22002a(C9348c cVar, Bundle bundle) {
        return ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).createLiveBroadcastFragment(cVar, bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdkapi.LiveActivityProxy mo22003a(android.support.p022v4.app.FragmentActivity r3, int r4) {
        /*
            r2 = this;
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            com.bytedance.android.live.broadcast.api.IBroadcastService r0 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r0
            com.bytedance.android.live.broadcast.IXTBroadcastService r0 = r0.getXTBroadcastService()
            r1 = 19
            if (r4 == r1) goto L_0x0050
            r1 = 21
            if (r4 == r1) goto L_0x0043
            switch(r4) {
                case 7: goto L_0x0036;
                case 8: goto L_0x002f;
                case 9: goto L_0x0029;
                default: goto L_0x0017;
            }
        L_0x0017:
            switch(r4) {
                case 16: goto L_0x0022;
                case 17: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0057
        L_0x001b:
            if (r0 == 0) goto L_0x0057
            com.bytedance.android.livesdkapi.LiveActivityProxy r3 = r0.createXTBroadcastResDownloadActivityProxy(r3)
            goto L_0x0058
        L_0x0022:
            if (r0 == 0) goto L_0x0057
            com.bytedance.android.livesdkapi.LiveActivityProxy r3 = r0.createXTBroadcastBeforeActivityProxy(r3)
            goto L_0x0058
        L_0x0029:
            com.bytedance.android.livesdk.sign.BroadcastSigningActivityProxy r4 = new com.bytedance.android.livesdk.sign.BroadcastSigningActivityProxy
            r4.<init>(r3)
            goto L_0x0034
        L_0x002f:
            com.bytedance.android.livesdk.verify.VerifyActivityProxy r4 = new com.bytedance.android.livesdk.verify.VerifyActivityProxy
            r4.<init>(r3)
        L_0x0034:
            r3 = r4
            goto L_0x0058
        L_0x0036:
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r4 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.utility.C3596c.m13172a(r4)
            com.bytedance.android.live.broadcast.api.IBroadcastService r4 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r4
            com.bytedance.android.livesdkapi.LiveActivityProxy r3 = r4.createStartLiveActivityProxy(r3)
            goto L_0x0058
        L_0x0043:
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r4 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.utility.C3596c.m13172a(r4)
            com.bytedance.android.live.wallet.IWalletService r4 = (com.bytedance.android.live.wallet.IWalletService) r4
            com.bytedance.android.livesdkapi.LiveActivityProxy r3 = r4.getLiveBillingActivityProxy(r3)
            goto L_0x0058
        L_0x0050:
            if (r0 == 0) goto L_0x0057
            com.bytedance.android.livesdkapi.LiveActivityProxy r3 = r0.createXTMediaStartLiveProxy(r3)
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p422s.C8913b.mo22003a(android.support.v4.app.FragmentActivity, int):com.bytedance.android.livesdkapi.LiveActivityProxy");
    }

    /* renamed from: a */
    public final <T> T mo22006a(String str, T t) {
        return C3339m.m12446a("key_ttlive_sdk_setting", str, t.getClass(), t);
    }

    /* renamed from: a */
    public final void mo22008a(long j, Bundle bundle, Context context) {
        ((C3450b) C3596c.m13172a(C3450b.class)).warmUp(j, bundle, context);
    }
}
