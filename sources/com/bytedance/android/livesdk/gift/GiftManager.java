package com.bytedance.android.livesdk.gift;

import android.os.SystemClock;
import android.support.p022v4.util.C0893e;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.gift.C3433c;
import com.bytedance.android.live.gift.C3435e;
import com.bytedance.android.live.gift.GiftType;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C4440j;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7872f;
import com.bytedance.android.livesdk.gift.assets.C7874h;
import com.bytedance.android.livesdk.gift.download.TTDownloadException;
import com.bytedance.android.livesdk.gift.model.C8148c;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8151f;
import com.bytedance.android.livesdk.gift.model.C8152g;
import com.bytedance.android.livesdk.gift.model.C8155j;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.model.C8160o;
import com.bytedance.android.livesdk.gift.model.DoodleTemplate;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.relay.p392a.C8271c;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8449h;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdk.utils.p426b.C9058c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C9456c;
import com.bytedance.android.livesdkapi.host.C9456c.C9457a;
import com.bytedance.android.livesdkapi.host.C9456c.C9459c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.google.gson.C6600e;
import com.p280ss.ugc.live.gift.resource.C46212b;
import com.p280ss.ugc.live.gift.resource.C46220c;
import com.p280ss.ugc.live.gift.resource.C46237f;
import com.p280ss.ugc.live.gift.resource.exception.BaseGetResourceException;
import com.p280ss.ugc.live.gift.resource.exception.Md5InvalidException;
import com.p280ss.ugc.live.gift.resource.exception.NetworkException;
import com.p280ss.ugc.live.gift.resource.exception.UnzipException;
import com.p280ss.ugc.live.gift.resource.exception.WriteStorageException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.BackpressureStrategy;
import p346io.reactivex.C47580g;
import p346io.reactivex.C47587h;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

public class GiftManager {
    private static final int DEFAULT_LIVE_TYPE = 0;
    public static final long DOODLE_GIFT_ID = 998;
    public static final int GIFT_LIST_STRATEGY_UNKNOWN = -1;
    public static final int GIFT_LIST_STRATEGY_V1 = 0;
    public static final int GIFT_LIST_STRATEGY_V2 = 1;
    private static GiftManager sInst;
    C6600e gson = C2317a.m9932a();
    private final C7874h mAssetsManager = C7872f.m24128a("effects");
    private List<DoodleTemplate> mDoodleTemplates;
    private List<Long> mFansClubIds = new ArrayList();
    private C8149d mFastGift;
    private List<C8148c> mGameGiftItemList;
    private C46212b mGetResourceListener = new C46212b() {
        /* renamed from: a */
        public final void mo20628a(BaseGetResourceException baseGetResourceException) {
            int i;
            long j;
            int i2;
            BaseGetResourceException baseGetResourceException2 = baseGetResourceException;
            try {
                JSONObject jSONObject = new JSONObject();
                if (baseGetResourceException2 instanceof NetworkException) {
                    jSONObject.put("response_code", ((NetworkException) baseGetResourceException2).getErrorCode());
                    i = 1;
                } else if (baseGetResourceException2 instanceof WriteStorageException) {
                    i = 2;
                } else if (baseGetResourceException2 instanceof Md5InvalidException) {
                    i = 3;
                } else if (baseGetResourceException2 instanceof UnzipException) {
                    i = 4;
                } else if (baseGetResourceException2 instanceof TTDownloadException) {
                    i = 5;
                    jSONObject.put("downloader_error_code", ((TTDownloadException) baseGetResourceException2).getErrorCode());
                } else {
                    i = -1;
                }
                long j2 = -1;
                if (baseGetResourceException.getResourceRequest() != null) {
                    j = baseGetResourceException.getResourceRequest().f118814c;
                } else {
                    j = -1;
                }
                AssetsModel c = C7872f.m24128a("effects").mo20662c((long) ((int) baseGetResourceException.getId()));
                if (c != null) {
                    int resourceType = c.getResourceType();
                    j2 = c.getSize();
                    i2 = resourceType;
                } else {
                    i2 = -1;
                }
                jSONObject.put("gift_id", baseGetResourceException.getId());
                jSONObject.put("gift_type", i2);
                jSONObject.put("size", j2);
                jSONObject.put("error_code", i);
                jSONObject.put("error_desc", baseGetResourceException.toString());
                jSONObject.put("download_assets_from", j);
                new C8449h().mo21614a(jSONObject).mo21616a("hotsoon_live_gift_resource_download_rate", 1);
                HashMap hashMap = new HashMap(1);
                hashMap.put("info", jSONObject.toString());
                C8443c.m25663a().mo21606a("hotsoon_live_gift_resource_download_failed", hashMap, new Object[0]);
                if (baseGetResourceException2 instanceof TTDownloadException) {
                    i = ((TTDownloadException) baseGetResourceException2).getErrorCode();
                }
                C8282s.m25310a(baseGetResourceException.getId(), i2, j, i, baseGetResourceException.toString());
            } catch (JSONException unused) {
            }
        }

        /* renamed from: a */
        public final void mo20627a(long j, C46220c cVar) {
            long j2;
            int i;
            JSONObject jSONObject = new JSONObject();
            long j3 = -1;
            if (cVar != null) {
                j2 = cVar.f118814c;
            } else {
                j2 = -1;
            }
            AssetsModel c = C7872f.m24128a("effects").mo20662c((long) ((int) j));
            if (c != null) {
                int resourceType = c.getResourceType();
                long size = c.getSize();
                i = resourceType;
                j3 = size;
            } else {
                i = -1;
            }
            try {
                jSONObject.put("gift_id", j);
                jSONObject.put("gift_type", i);
                jSONObject.put("size", j3);
                jSONObject.put("download_assets_from", j2);
            } catch (JSONException unused) {
            }
            new C8449h().mo21614a(jSONObject).mo21616a("hotsoon_live_gift_resource_download_rate", 0);
            C9097a.m27146a().mo22267a((Object) new C8164p(j));
            HashMap hashMap = new HashMap(1);
            hashMap.put("resource_id", String.valueOf(j));
            C8443c.m25663a().mo21606a("hotsoon_live_gift_resource_download_success", hashMap, new Object[0]);
            C8282s.m25309a(j, i, j2);
        }
    };
    private final HashMap<Integer, Integer> mGiftListStrategyMaps = new HashMap<>();
    private List<C8271c> mGiftRelayInfoList;
    private Map<Integer, C8152g> mGiftsMap = new HashMap();
    private SparseArray<C0893e<C8149d>> mGiftsMapByFind = new SparseArray<>();
    private final List<C8151f> mGroupCountInfo = new ArrayList();
    private boolean mHasNewGift = false;
    private List<Long> mHonorLevelIds = new ArrayList();
    private long mNewGiftId = -1;
    private String mNewGiftTip = "";
    private List<Long> mNobleIds = new ArrayList();
    private long mXgCoinCache;
    private C8149d temporaryFastGift;

    @FunctionalInterface
    /* renamed from: com.bytedance.android.livesdk.gift.GiftManager$a */
    public interface C7858a {
        /* renamed from: a */
        void mo20629a(long j);
    }

    static final /* synthetic */ void lambda$loadLocal$6$GiftManager(Throwable th) throws Exception {
    }

    public long getXgCoinCache() {
        return this.mXgCoinCache;
    }

    public List<C8151f> getGroupCountInfo() {
        return new ArrayList(this.mGroupCountInfo);
    }

    public boolean isTemporaryFastGiftPresent() {
        if (this.temporaryFastGift != null) {
            return true;
        }
        return false;
    }

    public C8149d getFastGift() {
        if (this.temporaryFastGift != null) {
            return this.temporaryFastGift;
        }
        return this.mFastGift;
    }

    public String getNewGiftTip() {
        if (!this.mHasNewGift) {
            return null;
        }
        this.mHasNewGift = false;
        this.mNewGiftId = -1;
        return this.mNewGiftTip;
    }

    public static synchronized GiftManager inst() {
        GiftManager giftManager;
        synchronized (GiftManager.class) {
            if (sInst == null) {
                sInst = new GiftManager();
            }
            giftManager = sInst;
        }
        return giftManager;
    }

    public List<DoodleTemplate> getDoodleTemplates() {
        if (this.mDoodleTemplates == null || this.mDoodleTemplates.isEmpty()) {
            return new ArrayList();
        }
        return new ArrayList(this.mDoodleTemplates);
    }

    private void loadLocal() {
        C7329e.m22970a((C47587h<T>) new C8109i<T>(this), BackpressureStrategy.BUFFER).mo19159b(C7333a.m23044b()).mo19152a(C47549a.m148327a()).mo19159b(C7333a.m23044b()).mo19142a((C7326g<? super T>) new C8129j<Object>(this), C8130k.f22191a);
    }

    public int getCurrentStrategyByLiveType() {
        int i;
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            i = currentRoom.getOrientation();
        } else {
            i = 0;
        }
        Integer num = (Integer) this.mGiftListStrategyMaps.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public List<C8149d> getGiftList() {
        int i;
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            i = currentRoom.getOrientation();
        } else {
            i = 0;
        }
        C8152g gVar = (C8152g) this.mGiftsMap.get(Integer.valueOf(i));
        if (gVar == null || C6311g.m19573a(gVar.f22264a)) {
            return new ArrayList();
        }
        return new ArrayList(gVar.f22264a);
    }

    public List<GiftPage> getGiftPageList() {
        int i;
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            i = currentRoom.getOrientation();
        } else {
            i = 0;
        }
        C8152g gVar = (C8152g) this.mGiftsMap.get(Integer.valueOf(i));
        if (gVar == null || C6311g.m19573a(gVar.f22266c)) {
            return new ArrayList();
        }
        return new ArrayList(gVar.f22266c);
    }

    public boolean isGiftListLoaded() {
        int currentStrategyByLiveType = getCurrentStrategyByLiveType();
        if (currentStrategyByLiveType == 0) {
            List giftList = getGiftList();
            if (giftList == null || giftList.isEmpty()) {
                return false;
            }
            return true;
        } else if (currentStrategyByLiveType != 1) {
            return false;
        } else {
            List giftPageList = getGiftPageList();
            if (giftPageList == null || giftPageList.isEmpty()) {
                return false;
            }
            return true;
        }
    }

    private GiftManager() {
        ((IHostApp) C3596c.m13172a(IHostApp.class)).initImageLib();
        loadLocal();
        try {
            ((IGiftService) C3596c.m13172a(IGiftService.class)).initGiftResourceManager(C3358ac.m12528e());
        } catch (Exception unused) {
        }
        C46237f.m145177a().mo114186a(this.mGetResourceListener);
    }

    public C8149d getRedEnvelopeGift() {
        List<C8149d> arrayList = new ArrayList<>();
        int currentStrategyByLiveType = getCurrentStrategyByLiveType();
        if (currentStrategyByLiveType == 0) {
            arrayList = getGiftList();
        } else if (currentStrategyByLiveType == 1) {
            List<GiftPage> giftPageList = getGiftPageList();
            if (giftPageList != null) {
                for (GiftPage giftPage : giftPageList) {
                    arrayList.addAll(giftPage.gifts);
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        for (C8149d dVar : arrayList) {
            if (dVar != null && 3 == dVar.f22234e) {
                return dVar;
            }
        }
        return null;
    }

    public List<C8149d> getStickerGifts() {
        ArrayList arrayList = new ArrayList();
        List<C8149d> arrayList2 = new ArrayList<>();
        int currentStrategyByLiveType = getCurrentStrategyByLiveType();
        if (currentStrategyByLiveType == 0) {
            arrayList2 = getGiftList();
        } else if (currentStrategyByLiveType == 1) {
            List<GiftPage> giftPageList = getGiftPageList();
            if (giftPageList != null) {
                for (GiftPage giftPage : giftPageList) {
                    arrayList2.addAll(giftPage.gifts);
                }
            }
        }
        for (C8149d dVar : arrayList2) {
            if (dVar.f22234e == 4) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public List<C8149d> filterFansClubGifts(Collection<? extends C8149d> collection) {
        return filterGiftsForType(collection, this.mFansClubIds);
    }

    public List<C8149d> filterNobleGifts(Collection<? extends C8149d> collection) {
        return filterGiftsForType(collection, this.mNobleIds);
    }

    public void syncGiftList(int i) {
        syncGiftList(null, 0, i, false);
    }

    public static void filterNotDisplayedOnPanel(Collection<? extends C8149d> collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!((C8149d) it.next()).f22245p) {
                it.remove();
            }
        }
    }

    private C8947c<String> getPropertyByLiveType(int i) {
        StringBuilder sb = new StringBuilder("gift_list_response_");
        sb.append(i);
        return new C8947c<>(sb.toString(), "");
    }

    static final /* synthetic */ void lambda$syncXgCoin$3$GiftManager(Throwable th) throws Exception {
        Exception exc = new Exception(th);
        StringBuilder sb = new StringBuilder("sync xg coin error! ");
        sb.append(exc.getMessage());
        C3166a.m11966e("GIFT_MANAGER", sb.toString());
    }

    public C8271c getGiftRelayInfo(long j) {
        if (this.mGiftRelayInfoList != null) {
            for (C8271c cVar : this.mGiftRelayInfoList) {
                if (cVar.f22712c == j) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public void removeTemporaryFastGift(long j) {
        if (this.temporaryFastGift != null && this.temporaryFastGift.f22233d == j) {
            this.temporaryFastGift = null;
        }
        C9097a.m27146a().mo22267a((Object) new C4440j(this.mFastGift, 1));
    }

    public List<C8149d> filterHonorLevelGifts(Collection<? extends C8149d> collection) {
        List<C8149d> filterGiftsForType = filterGiftsForType(collection, this.mHonorLevelIds);
        ArrayList arrayList = new ArrayList();
        for (Long longValue : this.mHonorLevelIds) {
            long longValue2 = longValue.longValue();
            for (C8149d dVar : filterGiftsForType) {
                if (dVar.f22233d == longValue2) {
                    arrayList.add(dVar);
                }
            }
        }
        return arrayList;
    }

    public String findGameGiftRuleUrl(long j) {
        if (this.mGameGiftItemList == null) {
            return null;
        }
        for (C8148c cVar : this.mGameGiftItemList) {
            if (cVar != null && cVar.f22220a == j) {
                return cVar.f22221b;
            }
        }
        return null;
    }

    public C8149d findGiftById(long j) {
        int i;
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            i = currentRoom.getOrientation();
        } else {
            i = 0;
        }
        C0893e eVar = (C0893e) this.mGiftsMapByFind.get(i);
        if (eVar == null) {
            return null;
        }
        return (C8149d) eVar.mo3327a(j);
    }

    public void syncXgCoin(C7858a aVar) {
        if (aVar != null) {
            ((C9057b) ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).syncXgCoin().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22249a(3).mo19280a((C7326g<? super T>) new C8077g<Object>(this, aVar), C8078h.f22026a);
        }
    }

    public GiftType getGiftType(C8149d dVar) {
        if (dVar == null) {
            return GiftType.UNKNOWN;
        }
        if (dVar.f22234e == 10) {
            return GiftType.GOLDEN_BEAN_CELL;
        }
        if (dVar.f22234e == 9) {
            return GiftType.FREE_CELL;
        }
        if (dVar.f22234e == 1) {
            return GiftType.NORMAL_GIFT;
        }
        if (dVar.f22234e == 5) {
            return GiftType.TASK_GIFT;
        }
        if (dVar.f22234e == 4) {
            return GiftType.STICKER_GIFT;
        }
        if (dVar.f22234e == 8) {
            return GiftType.MIDDLE_GIFT;
        }
        if (dVar.f22234e == 2) {
            return GiftType.SPECIAL_GIFT;
        }
        if (dVar.f22234e == 11) {
            return GiftType.GAME;
        }
        return GiftType.UNKNOWN;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$loadLocal$4$GiftManager(C47580g gVar) throws Exception {
        Set<String> set = (Set) C8946b.f24428b.mo22117a();
        HashMap hashMap = new HashMap(4);
        for (String valueOf : set) {
            int intValue = Integer.valueOf(valueOf).intValue();
            String str = (String) getPropertyByLiveType(intValue).mo22117a();
            if (!C6319n.m19593a(str)) {
                hashMap.put(Integer.valueOf(intValue), (C8152g) this.gson.mo15974a(str, C8152g.class));
            }
        }
        gVar.mo19239a((Object) hashMap);
        gVar.mo19238a();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$loadLocal$5$GiftManager(Map map) throws Exception {
        if (map != null && !map.isEmpty()) {
            for (Integer num : map.keySet()) {
                C8152g gVar = (C8152g) map.get(num);
                if (gVar != null) {
                    this.mGiftListStrategyMaps.put(num, Integer.valueOf(C6311g.m19573a(gVar.f22266c) ^ true ? 1 : 0));
                    addGiftMap(gVar, num.intValue());
                }
            }
            updateGiftsInfo((C8152g) this.mGiftsMap.get(Integer.valueOf(0)), false);
        }
    }

    public void setTemporaryFastGift(long j) {
        List giftPageList = getGiftPageList();
        if (!C6311g.m19573a(giftPageList)) {
            GiftPage giftPage = null;
            Iterator it = giftPageList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GiftPage giftPage2 = (GiftPage) it.next();
                if (giftPage2.pageType == 1) {
                    giftPage = giftPage2;
                    break;
                }
            }
            if (giftPage != null) {
                List<C8149d> list = giftPage.gifts;
                if (!C6311g.m19573a(list)) {
                    for (C8149d dVar : new ArrayList(list)) {
                        if (dVar.f22233d == j) {
                            this.temporaryFastGift = dVar;
                            C9097a.m27146a().mo22267a((Object) new C4440j(dVar, 1));
                            return;
                        }
                    }
                }
            }
        }
    }

    public static void filterInteractNotSupportGift(Collection<? extends C8149d> collection, boolean z) {
        filterNotSupportGift(collection, z);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!((C8149d) it.next()).f22239j) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$syncXgCoin$2$GiftManager(C7858a aVar, C3479d dVar) throws Exception {
        if (dVar != null && dVar.data != null) {
            this.mXgCoinCache = ((C8160o) dVar.data).f22326a;
            aVar.mo20629a(this.mXgCoinCache);
        }
    }

    private static List<C8149d> filterGiftsForType(Collection<? extends C8149d> collection, List<Long> list) {
        if (collection == null || collection.isEmpty() || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C8149d dVar : collection) {
            if (list.contains(Long.valueOf(dVar.f22233d))) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public boolean canSendHonorGift(User user, C8149d dVar) {
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c() || dVar == null || user == null || user.getUserHonor() == null || ((long) user.getUserHonor().mo8710n()) < dVar.f22252w) {
            return false;
        }
        return true;
    }

    public boolean canSendNobleGift(User user, C8149d dVar) {
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c() || dVar == null || user == null || user.getNobleLevelInfo() == null || user.getNobleLevelInfo().getNobleLevel() < dVar.f22255z) {
            return false;
        }
        return true;
    }

    public void getGiftIconBitmap(long j, C9459c cVar) {
        C8149d findGiftById = findGiftById(j);
        if (findGiftById == null && cVar != null) {
            C9457a aVar = new C9457a();
            StringBuilder sb = new StringBuilder("can't find gift by id: ");
            sb.append(j);
            aVar.f25912a = new Throwable(sb.toString());
            cVar.mo9922a(aVar);
        }
        ((C9456c) C3596c.m13172a(C9456c.class)).mo23192a(findGiftById.f22231b, cVar);
    }

    private void addGiftMap(C8152g gVar, int i) {
        if (gVar != null) {
            this.mGiftsMap.put(Integer.valueOf(i), gVar);
            C0893e eVar = (C0893e) this.mGiftsMapByFind.get(i);
            if (eVar != null) {
                eVar.mo3335c();
            } else {
                eVar = new C0893e();
                this.mGiftsMapByFind.append(i, eVar);
            }
            List<C8149d> arrayList = new ArrayList<>();
            int currentStrategyByLiveType = getCurrentStrategyByLiveType();
            if (currentStrategyByLiveType == 0 && !C6311g.m19573a(gVar.f22264a)) {
                arrayList = gVar.f22264a;
            } else if (currentStrategyByLiveType == 1 && !C6311g.m19573a(gVar.f22266c)) {
                List<GiftPage> list = gVar.f22266c;
                if (list != null) {
                    for (GiftPage giftPage : list) {
                        arrayList.addAll(giftPage.gifts);
                    }
                }
            }
            for (C8149d dVar : arrayList) {
                eVar.mo3337c(dVar.f22233d, dVar);
            }
        }
    }

    public static void filterNotSupportGift(Collection<? extends C8149d> collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C8149d dVar = (C8149d) it.next();
            if (dVar.f22233d == 998) {
                it.remove();
            } else if ((dVar.f22234e == 2 || dVar.f22234e == 8 || dVar.f22234e == 11) && !C7872f.m24128a("effects").mo20659a(dVar.f22247r)) {
                it.remove();
            } else if (dVar.f22234e == 4 && z && !C7872f.m24128a("effects").mo20659a(dVar.f22247r)) {
                it.remove();
            }
        }
    }

    private void notifyFastGiftModule(long j, boolean z) {
        if (0 == j) {
            this.mFastGift = null;
            C9097a.m27146a().mo22267a((Object) new C4440j(null));
            return;
        }
        List arrayList = new ArrayList();
        int currentStrategyByLiveType = getCurrentStrategyByLiveType();
        if (currentStrategyByLiveType == 0) {
            arrayList = getGiftList();
        } else if (currentStrategyByLiveType == 1) {
            List<GiftPage> giftPageList = getGiftPageList();
            if (giftPageList != null) {
                for (GiftPage giftPage : giftPageList) {
                    arrayList.addAll(giftPage.gifts);
                }
            }
        }
        ArrayList<C8149d> arrayList2 = new ArrayList<>(arrayList);
        filterNotSupportGift(arrayList2, z);
        for (C8149d dVar : arrayList2) {
            if (dVar.f22233d == j) {
                this.mFastGift = dVar;
                C9097a.m27146a().mo22267a((Object) new C4440j(dVar));
                return;
            }
        }
    }

    private void updateGiftsInfo(C8152g gVar, boolean z) {
        if (gVar != null) {
            C8155j jVar = gVar.f22265b;
            if (jVar != null) {
                this.mGiftRelayInfoList = jVar.f22282f;
                this.mGameGiftItemList = jVar.f22283g;
                this.mDoodleTemplates = gVar.f22267d;
                if (jVar.f22280d > 0 && !TextUtils.isEmpty(jVar.f22281e)) {
                    updateNewGiftTip(gVar.f22264a, jVar.f22280d, jVar.f22281e);
                }
                notifyFastGiftModule(jVar.f22277a, z);
                if (jVar.f22278b != null) {
                    this.mGroupCountInfo.clear();
                    this.mGroupCountInfo.addAll(jVar.f22278b);
                }
                if (jVar.f22279c != null) {
                    this.mFansClubIds = jVar.f22279c;
                }
                if (jVar.f22284h != null) {
                    this.mHonorLevelIds = jVar.f22284h;
                }
                if (jVar.f22285i != null) {
                    this.mNobleIds = jVar.f22285i;
                }
            }
        }
    }

    static final /* synthetic */ void lambda$syncGiftList$1$GiftManager(boolean z, WeakReference weakReference, Throwable th) throws Exception {
        Exception exc = new Exception(th);
        StringBuilder sb = new StringBuilder("syncgiftlist error! ");
        sb.append(exc.getMessage());
        C3166a.m11966e("GIFT_MANAGER", sb.toString());
        if (z) {
            C8282s.m25318a(exc.getMessage());
        }
        if (weakReference.get() != null) {
            ((C3435e) weakReference.get()).mo10402a();
        }
    }

    private void updateNewGiftTip(List<C8149d> list, long j, String str) {
        C8149d dVar;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            dVar = (C8149d) it.next();
            if (dVar.f22233d == j) {
                break;
            }
        }
        if (dVar != null) {
            this.mNewGiftId = j;
            this.mNewGiftTip = str;
            if (((Long) C8946b.f24353E.mo22117a()).longValue() == this.mNewGiftId) {
                this.mHasNewGift = false;
            } else {
                this.mHasNewGift = true;
            }
        }
    }

    private void onSyncGiftListSuccess(C8152g gVar, boolean z, C3435e eVar) {
        int i;
        if (gVar == null) {
            if (eVar != null) {
                eVar.mo8799a(new ArrayList());
            }
            return;
        }
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        int i2 = 0;
        if (currentRoom != null) {
            i = currentRoom.getOrientation();
        } else {
            i = 0;
        }
        addGiftMap(gVar, i);
        List<C8149d> list = gVar.f22264a;
        List<GiftPage> list2 = gVar.f22266c;
        boolean z2 = true;
        if (list == null || list.isEmpty()) {
            if (list2 == null || list2.isEmpty()) {
                z2 = false;
            } else {
                i2 = 1;
            }
        }
        this.mGiftListStrategyMaps.put(Integer.valueOf(i), Integer.valueOf(i2));
        if (z2) {
            getPropertyByLiveType(i).mo22118a(this.gson.mo15979b((Object) gVar));
            Set set = (Set) C8946b.f24428b.mo22117a();
            set.add(String.valueOf(i));
            C8946b.f24428b.mo22118a(set);
        }
        if (eVar != null) {
            if (i2 == 0) {
                eVar.mo8799a(list);
            } else {
                eVar.mo8800b(list2);
            }
        }
        updateGiftsInfo(gVar, z);
    }

    public boolean canSendFansClubGift(User user, User user2, C8149d dVar) {
        boolean z = false;
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            return false;
        }
        if (!(user == null || user2 == null || dVar == null || !dVar.f22253x || dVar.f22254y == null)) {
            user.getId();
            FansClubMember fansClub = user2.getFansClub();
            if (fansClub != null) {
                FansClubData data = fansClub.getData();
                if (FansClubData.isValid(data) && data.userFansClubStatus > 0 && data.level >= dVar.f22254y.f22275a) {
                    z = true;
                }
            }
        }
        return z;
    }

    public void sendGiftInternal(long j, int i, C3433c cVar) {
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null && currentRoom.getOwner() != null) {
            User owner = currentRoom.getOwner();
            long id = currentRoom.getId();
            long uptimeMillis = SystemClock.uptimeMillis();
            C7492s a = ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).send(j, currentRoom.getId(), owner.getId(), i).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
            C8131l lVar = new C8131l(cVar, id, owner, j, uptimeMillis);
            C8132m mVar = new C8132m(cVar, j, id);
            a.mo19280a((C7326g<? super T>) lVar, (C7326g<? super Throwable>) mVar);
        }
    }

    static final /* synthetic */ void lambda$sendGiftInternal$8$GiftManager(C3433c cVar, long j, long j2, Throwable th) throws Exception {
        if (cVar != null) {
            cVar.mo10400a(th);
        }
        C8282s.m25315a(j, j2, th);
    }

    public void syncGiftList(C3435e eVar, long j, int i, boolean z) {
        boolean z2;
        if (C8162n.m24994a(C3358ac.m12528e())) {
            this.mAssetsManager.mo20654a(i, z);
            WeakReference weakReference = new WeakReference(eVar);
            if (j != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            C7492s a = ((C9057b) ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).syncGiftList(String.valueOf(j), i).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22250a((C7327h<C7492s<Throwable>, C7496w<?>>) C3303k.m12367a(3));
            C7961e eVar2 = new C7961e(this, z, weakReference, uptimeMillis, z2);
            a.mo19280a((C7326g<? super T>) eVar2, (C7326g<? super Throwable>) new C8076f<Object>(z2, weakReference));
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$syncGiftList$0$GiftManager(boolean z, WeakReference weakReference, long j, boolean z2, C3479d dVar) throws Exception {
        String str;
        if (dVar == null || dVar.data == null) {
            if (z2) {
                if (dVar == null) {
                    str = "response is empty";
                } else {
                    str = "response.data is empty";
                }
                C8282s.m25318a(str);
            }
            return;
        }
        onSyncGiftListSuccess((C8152g) dVar.data, z, (C3435e) weakReference.get());
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (z2) {
            C8282s.m25307a(uptimeMillis);
        }
    }

    static final /* synthetic */ void lambda$sendGiftInternal$7$GiftManager(C3433c cVar, long j, User user, long j2, long j3, C3479d dVar) throws Exception {
        if (dVar != null) {
            C8158m mVar = (C8158m) dVar.data;
            if (cVar != null) {
                cVar.mo10399a(mVar);
            }
            for (C8489ao insertMessage : C8163o.m25002b(j, mVar, user, User.from(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a()))) {
                ((C3495l) C3596c.m13172a(C3495l.class)).messageManagerHelper().mo10513a().insertMessage(insertMessage);
            }
            C8282s.m25314a(j2, j, SystemClock.uptimeMillis() - j3);
        }
    }
}
