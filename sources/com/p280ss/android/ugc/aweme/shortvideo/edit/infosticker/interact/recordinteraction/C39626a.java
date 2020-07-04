package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39604b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractTrackPage;
import com.p280ss.android.ugc.aweme.shortvideo.guide.ExtraParams;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.a */
public final class C39626a implements C1944a {

    /* renamed from: a */
    public String f102945a = "";

    /* renamed from: b */
    public boolean f102946b = true;

    /* renamed from: c */
    private String f102947c = "";

    /* renamed from: d */
    private LinkedHashMap<String, List<NormalTrackTimeStamp>> f102948d = new LinkedHashMap<>();

    /* renamed from: e */
    private LinkedHashMap<String, ExtraParams> f102949e = new LinkedHashMap<>();

    /* renamed from: f */
    private int f102950f = 0;

    public C39626a() {
        MessageCenter.init();
        MessageCenter.addListener(this);
    }

    /* renamed from: c */
    private void m126810c(int i) {
        if (this.f102946b && i - this.f102950f < -10) {
            m126809b(i);
            this.f102950f = i;
        }
    }

    /* renamed from: a */
    public final boolean mo98793a(int i) {
        if (!this.f102946b) {
            return false;
        }
        if (i - this.f102950f < -10) {
            m126809b(i);
            this.f102950f = i;
            return false;
        } else if (C6319n.m19593a(this.f102947c)) {
            return false;
        } else {
            if (this.f102950f != -1 && i - this.f102950f <= 300) {
                return false;
            }
            this.f102950f = i;
            return true;
        }
    }

    /* renamed from: b */
    private void m126809b(int i) {
        if (this.f102946b) {
            for (Entry value : this.f102948d.entrySet()) {
                List list = (List) value.getValue();
                if (!C6307b.m19566a((Collection<T>) list)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((NormalTrackTimeStamp) it.next()).getPts() > i) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo98791a(ShortVideoContext shortVideoContext) {
        if (this.f102946b) {
            m126810c((int) shortVideoContext.f99777m);
            LinkedList linkedList = new LinkedList();
            int i = 0;
            for (Entry entry : this.f102948d.entrySet()) {
                ExtraParams extraParams = (ExtraParams) this.f102949e.get(entry.getKey());
                List list = (List) entry.getValue();
                if (!C6307b.m19566a((Collection<T>) list) && extraParams != null) {
                    RecordInteractExtra recordInteractExtra = new RecordInteractExtra();
                    recordInteractExtra.formatFromExtraParams(extraParams, (String) entry.getKey());
                    InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("interaction_extra", recordInteractExtra);
                    interactStickerStruct.setAttr(C35563c.f93220B.getRetrofitFactoryGson().mo15979b((Object) linkedHashMap));
                    interactStickerStruct.setType(2);
                    interactStickerStruct.setIndex(i);
                    interactStickerStruct.setTrackList(C35563c.f93220B.getRetrofitFactoryGson().mo15979b((Object) list));
                    linkedList.add(interactStickerStruct);
                    i++;
                }
            }
            shortVideoContext.f99754ao = C39604b.m126711a(shortVideoContext.f99754ao, (List<InteractStickerStruct>) linkedList, InteractTrackPage.TRACK_PAGE_RECORD);
        }
    }

    /* renamed from: a */
    public final void mo98790a(int i, ExtraParams extraParams) {
        if (this.f102946b && !C6319n.m19593a(this.f102947c)) {
            ArrayList arrayList = new ArrayList();
            List list = (List) this.f102948d.get(this.f102945a);
            if (!C6307b.m19566a((Collection<T>) list)) {
                arrayList.addAll(list);
            }
            EffectLocationMessage effectLocationMessage = null;
            try {
                effectLocationMessage = (EffectLocationMessage) C35563c.f93220B.getRetrofitFactoryGson().mo15974a(this.f102947c, EffectLocationMessage.class);
            } catch (Exception unused) {
            }
            if (effectLocationMessage != null && !C6307b.m19566a((Collection<T>) effectLocationMessage.locations)) {
                LinkedList linkedList = new LinkedList();
                for (EffectLocation effectLocation : effectLocationMessage.locations) {
                    NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                    normalTrackTimeStamp.setPts(i);
                    normalTrackTimeStamp.setWidth(effectLocation.getW());
                    normalTrackTimeStamp.setHeight(effectLocation.getH());
                    normalTrackTimeStamp.setX(effectLocation.getX());
                    normalTrackTimeStamp.setY(effectLocation.getY());
                    normalTrackTimeStamp.setScale(Float.valueOf(1.0f));
                    normalTrackTimeStamp.setRotation(effectLocation.getR());
                    linkedList.add(normalTrackTimeStamp);
                }
                arrayList.addAll(linkedList);
                this.f102948d.put(this.f102945a, arrayList);
                this.f102949e.put(this.f102945a, extraParams);
            }
        }
    }

    /* renamed from: a */
    public final void mo98792a(String str, int i) {
        if (this.f102946b) {
            this.f102950f = i;
            List<InteractStickerStruct> a = C39604b.m126714a(str, InteractTrackPage.TRACK_PAGE_RECORD);
            if (!C6307b.m19566a((Collection<T>) a)) {
                for (InteractStickerStruct interactStickerStruct : a) {
                    if (interactStickerStruct.getType() == 2 && !C6319n.m19593a(interactStickerStruct.getAttr()) && !C6319n.m19593a(interactStickerStruct.getTrackList())) {
                        Map map = (Map) C35563c.f93220B.getRetrofitFactoryGson().mo15974a(interactStickerStruct.getAttr(), Map.class);
                        if (map != null && map.containsKey("interaction_extra")) {
                            try {
                                RecordInteractExtra recordInteractExtra = (RecordInteractExtra) C35563c.f93220B.getRetrofitFactoryGson().mo15974a(new JSONObject((Map) map.get("interaction_extra")).toString(), RecordInteractExtra.class);
                                if (recordInteractExtra != null && !C6319n.m19593a(recordInteractExtra.getStickerId())) {
                                    NormalTrackTimeStamp[] normalTrackTimeStampArr = (NormalTrackTimeStamp[]) C35563c.f93220B.getRetrofitFactoryGson().mo15974a(interactStickerStruct.getTrackList(), NormalTrackTimeStamp[].class);
                                    if (!(normalTrackTimeStampArr == null || normalTrackTimeStampArr.length == 0)) {
                                        this.f102948d.put(recordInteractExtra.getStickerId(), new ArrayList(Arrays.asList(normalTrackTimeStampArr)));
                                        this.f102949e.put(recordInteractExtra.getStickerId(), recordInteractExtra.toExtraParams());
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 28) {
            this.f102947c = str;
        }
    }
}
