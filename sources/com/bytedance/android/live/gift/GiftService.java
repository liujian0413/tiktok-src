package com.bytedance.android.live.gift;

import android.app.Dialog;
import android.content.Context;
import android.support.p022v4.app.Fragment;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.p162a.p163a.C3426a;
import com.bytedance.android.live.gift.p164b.C3430a;
import com.bytedance.android.live.gift.p164b.C3431b;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C4430av;
import com.bytedance.android.livesdk.chatroom.p220ui.C5332y;
import com.bytedance.android.livesdk.chatroom.presenter.C5046x;
import com.bytedance.android.livesdk.chatroom.viewmodule.GiftWidget;
import com.bytedance.android.livesdk.gift.C8163o;
import com.bytedance.android.livesdk.gift.C8262q;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7864a;
import com.bytedance.android.livesdk.gift.assets.C7872f;
import com.bytedance.android.livesdk.gift.assets.C7873g;
import com.bytedance.android.livesdk.gift.assets.C7874h;
import com.bytedance.android.livesdk.gift.download.C7953a;
import com.bytedance.android.livesdk.gift.download.C7960d;
import com.bytedance.android.livesdk.gift.effect.video.p388a.C8072c;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.panel.widget.PanelType;
import com.bytedance.android.livesdk.log.p405b.C8442n;
import com.bytedance.android.livesdk.message.C8451a;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.message.p408b.C8456a;
import com.bytedance.android.livesdk.message.p408b.C8460d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9323b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p280ss.ugc.live.gift.resource.C46234e.C46236a;
import com.p280ss.ugc.live.gift.resource.C46237f;
import com.p280ss.ugc.live.gift.resource.p1827a.C46211b;
import com.p280ss.ugc.live.gift.resource.p1829c.C46221a;
import java.util.List;
import p346io.reactivex.C7492s;

public class GiftService implements IGiftService {
    public void clearGiftIconBitmapCache() {
    }

    public Fragment createLiveGiftAdFragment() {
        return null;
    }

    public C7874h getAssetsManager() {
        return C7872f.m24128a("effects");
    }

    public Widget getGiftWidget() {
        return new GiftWidget();
    }

    public C9323b getLiveGiftPlayControllerManager() {
        return giftPlayControllerManager();
    }

    public C9323b giftPlayControllerManager() {
        return C8072c.m24766a();
    }

    public void removeMonkeyGameEngine() {
        C3434d.m12739a().mo10401b();
    }

    public C8149d getFastGift() {
        return GiftManager.inst().getFastGift();
    }

    public C8149d getRedEnvelopeGift() {
        return GiftManager.inst().getRedEnvelopeGift();
    }

    public List<C8149d> getStickerGifts() {
        return GiftManager.inst().getStickerGifts();
    }

    public void syncGiftList() {
        GiftManager.inst().syncGiftList(1);
    }

    public void onTurnTableUrlEmpty(String str) {
        C8282s.m25329c(str);
    }

    public void clearAssets(String str) {
        C7872f.m24128a(str).mo20652a();
    }

    public C8451a getAssetsInterceptor(boolean z) {
        return new C8456a(z);
    }

    public C3430a getGiftGuidePresenter(DataCenter dataCenter) {
        return new C5046x(dataCenter);
    }

    public C8442n getSendGiftResultLog(C8158m mVar) {
        return C8163o.m24997a(mVar);
    }

    public void registerMonkeyGameEngine(C3426a aVar) {
        C3434d.m12739a().f10251a = aVar;
    }

    public void removeAnimationEngine(GiftType giftType) {
        C3425a.m12724a().mo10392b(giftType);
    }

    public void removeTemporaryFastGift(long j) {
        GiftManager.inst().removeTemporaryFastGift(j);
    }

    public void setTemporaryFastGift(long j) {
        GiftManager.inst().setTemporaryFastGift(j);
    }

    public void syncGiftList(int i) {
        GiftManager.inst().syncGiftList(i);
    }

    public C8149d findGiftById(long j) {
        return GiftManager.inst().findGiftById(j);
    }

    public void initGiftResourceManager(Context context) {
        C7953a.m24378a(context);
        C46236a aVar = new C46236a(context);
        aVar.mo114179a((C46221a) new C7960d());
        aVar.mo114178a((C46211b) new C7864a(context));
        aVar.mo114181b(5);
        aVar.mo114177a(3);
        C46237f.m145179a(aVar.mo114180a());
    }

    public C8451a getGiftInterceptor(long j, boolean z) {
        return new C8460d(j, z);
    }

    public void setGiftAnimationEngine(GiftType giftType, C3429b bVar) throws Exception {
        C3425a.m12724a().mo10390a(giftType, bVar);
    }

    public void syncAssetsList(String str, int i) {
        C7872f.m24128a(str).mo20653a(i);
    }

    public AssetsModel getAssets(String str, long j) {
        return C7872f.m24128a(str).mo20662c(j);
    }

    public String getAssetsPath(String str, long j) {
        return C7872f.m24128a(str).mo20660b(j);
    }

    public boolean isAssetsDownloaded(String str, long j) {
        return C7872f.m24128a(str).mo20659a(j);
    }

    public void openGiftDialog(String str, boolean z) {
        PanelType panelType;
        C9097a a = C9097a.m27146a();
        if ("gift".equals(str)) {
            panelType = PanelType.GIFT;
        } else {
            panelType = PanelType.PROP;
        }
        a.mo22267a((Object) new C4430av(panelType, z));
    }

    public boolean showGiftIcon(Room room, boolean z) {
        if (C8262q.m25251a()) {
            return false;
        }
        boolean b = C8262q.m25253b(room, z);
        boolean d = C8262q.m25255d(room, z);
        if (b || d) {
            return true;
        }
        return false;
    }

    public void sendGift(String str, boolean z) {
        PanelType panelType;
        C9097a a = C9097a.m27146a();
        if ("gift".equals(str)) {
            panelType = PanelType.GIFT;
        } else {
            panelType = PanelType.PROP;
        }
        a.mo22267a((Object) new C4430av(panelType, z));
    }

    public C8489ao getGiftMessage(long j, C8158m mVar, User user) {
        return C8163o.m24998a(j, mVar, user);
    }

    public void sendGiftInternal(long j, int i, C3433c cVar) {
        GiftManager.inst().sendGiftInternal(j, i, cVar);
    }

    public void downloadAssets(String str, long j, C7873g gVar, int i) {
        C7872f.m24128a(str).mo20656a(j, gVar, i);
    }

    public C7492s<C3479d<C8158m>> sendGift(long j, long j2, long j3, int i) {
        return ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).send(j, j2, j3, i);
    }

    public void syncGiftList(C3435e eVar, long j, int i, boolean z) {
        GiftManager.inst().syncGiftList(eVar, j, i, z);
    }

    public Dialog getGiftGuideDialog(Context context, Room room, IUser iUser, C3431b bVar, long j, String str, long j2, String str2, DataCenter dataCenter) {
        C5332y yVar = new C5332y(context, room, iUser, bVar, j, str, j2, str2, dataCenter);
        return yVar;
    }
}
