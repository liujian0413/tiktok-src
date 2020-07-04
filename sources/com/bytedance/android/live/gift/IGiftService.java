package com.bytedance.android.live.gift;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.p162a.p163a.C3426a;
import com.bytedance.android.live.gift.p164b.C3430a;
import com.bytedance.android.live.gift.p164b.C3431b;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7873g;
import com.bytedance.android.livesdk.gift.assets.C7874h;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.log.p405b.C8442n;
import com.bytedance.android.livesdk.message.C8451a;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdkapi.depend.live.C9327c;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9323b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import java.util.List;
import p346io.reactivex.C7492s;

public interface IGiftService extends C9327c {
    void clearAssets(String str);

    void clearGiftIconBitmapCache();

    void downloadAssets(String str, long j, C7873g gVar, int i);

    C8149d findGiftById(long j);

    AssetsModel getAssets(String str, long j);

    C8451a getAssetsInterceptor(boolean z);

    C7874h getAssetsManager();

    String getAssetsPath(String str, long j);

    C8149d getFastGift();

    Dialog getGiftGuideDialog(Context context, Room room, IUser iUser, C3431b bVar, long j, String str, long j2, String str2, DataCenter dataCenter);

    C3430a getGiftGuidePresenter(DataCenter dataCenter);

    C8451a getGiftInterceptor(long j, boolean z);

    C8489ao getGiftMessage(long j, C8158m mVar, User user);

    Widget getGiftWidget();

    C8149d getRedEnvelopeGift();

    C8442n getSendGiftResultLog(C8158m mVar);

    List<C8149d> getStickerGifts();

    C9323b giftPlayControllerManager();

    boolean isAssetsDownloaded(String str, long j);

    void onTurnTableUrlEmpty(String str);

    void openGiftDialog(String str, boolean z);

    void registerMonkeyGameEngine(C3426a aVar);

    void removeAnimationEngine(GiftType giftType);

    void removeMonkeyGameEngine();

    void removeTemporaryFastGift(long j);

    C7492s<C3479d<C8158m>> sendGift(long j, long j2, long j3, int i);

    void sendGiftInternal(long j, int i, C3433c cVar);

    void setGiftAnimationEngine(GiftType giftType, C3429b bVar) throws Exception;

    void setTemporaryFastGift(long j);

    boolean showGiftIcon(Room room, boolean z);

    void syncAssetsList(String str, int i);

    void syncGiftList(int i);

    void syncGiftList(C3435e eVar, long j, int i, boolean z);
}
