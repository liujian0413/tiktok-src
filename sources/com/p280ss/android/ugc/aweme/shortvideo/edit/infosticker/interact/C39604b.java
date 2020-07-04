package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p280ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b */
public final class C39604b {
    /* renamed from: a */
    public static String m126711a(String str, List<InteractStickerStruct> list, InteractTrackPage interactTrackPage) {
        MainBusinessContext mainBusinessContext;
        if (C6319n.m19593a(str)) {
            mainBusinessContext = new MainBusinessContext();
        } else {
            try {
                mainBusinessContext = (MainBusinessContext) C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15974a(str, MainBusinessContext.class);
            } catch (Exception unused) {
                mainBusinessContext = new MainBusinessContext();
            }
        }
        InteractStickerTracksContext interactStickerTracksContext = mainBusinessContext.mInteractStickerContext == null ? new InteractStickerTracksContext() : mainBusinessContext.mInteractStickerContext;
        interactStickerTracksContext.upDateStickerStructs(list, interactTrackPage);
        mainBusinessContext.setInteractStickerContext(interactStickerTracksContext);
        return C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15979b((Object) mainBusinessContext);
    }

    /* renamed from: a */
    public static List<InteractStickerStruct> m126714a(String str, InteractTrackPage interactTrackPage) {
        InteractStickerTracksContext a = m126704a(str);
        if (a == null) {
            return null;
        }
        return a.getStickerStructsByPage(interactTrackPage);
    }

    /* renamed from: a */
    public static boolean m126716a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            if (!C6307b.m19566a((Collection<T>) m126719c(videoPublishEditModel.getMainBusinessContext(), InteractTrackPage.TRACK_PAGE_RECORD))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Collection<InteractStickerStruct> m126713a(MainBusinessContext mainBusinessContext, InteractTrackPage... interactTrackPageArr) {
        InteractStickerTracksContext b = m126717b(mainBusinessContext);
        if (b == null || b.isEmpty(interactTrackPageArr)) {
            return null;
        }
        List<InteractStickerStruct> stickerStructsByPage = b.getStickerStructsByPage(interactTrackPageArr);
        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
            if (interactStickerStruct.getPoiStruct() != null) {
                PoiStruct poiStruct = new PoiStruct();
                poiStruct.setPoiId(interactStickerStruct.getPoiStruct().getPoiId());
                interactStickerStruct.setPoiStruct(poiStruct);
            }
            if (interactStickerStruct.getVoteStruct() != null) {
                VoteStruct voteStruct = interactStickerStruct.getVoteStruct();
                if (!C6307b.m19566a((Collection<T>) voteStruct.getOptions()) && voteStruct.getOptions().size() >= 2) {
                    if (C6319n.m19593a(((OptionsBean) voteStruct.getOptions().get(0)).getPostOption())) {
                        ((OptionsBean) voteStruct.getOptions().get(0)).setPostOption(C35574k.m114861b().getString(R.string.fqe));
                    }
                    if (C6319n.m19593a(((OptionsBean) voteStruct.getOptions().get(1)).getPostOption())) {
                        ((OptionsBean) voteStruct.getOptions().get(1)).setPostOption(C35574k.m114861b().getString(R.string.fqf));
                    }
                }
            }
        }
        return stickerStructsByPage;
    }

    /* renamed from: a */
    public static Collection<InteractStickerStruct> m126712a(BaseShortVideoContext baseShortVideoContext, InteractTrackPage... interactTrackPageArr) {
        InteractStickerTracksContext interactStickerTracksContext;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            interactStickerTracksContext = m126717b(((VideoPublishEditModel) baseShortVideoContext).getMainBusinessContext());
        } else {
            interactStickerTracksContext = m126704a(baseShortVideoContext.getMainBusinessData());
        }
        if (interactStickerTracksContext == null || interactStickerTracksContext.isEmpty(interactTrackPageArr)) {
            return null;
        }
        List<InteractStickerStruct> stickerStructsByPage = interactStickerTracksContext.getStickerStructsByPage(interactTrackPageArr);
        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
            if (interactStickerStruct.getPoiStruct() != null) {
                PoiStruct poiStruct = new PoiStruct();
                poiStruct.setPoiId(interactStickerStruct.getPoiStruct().getPoiId());
                interactStickerStruct.setPoiStruct(poiStruct);
            }
            if (interactStickerStruct.getVoteStruct() != null) {
                VoteStruct voteStruct = interactStickerStruct.getVoteStruct();
                if (!C6307b.m19566a((Collection<T>) voteStruct.getOptions()) && voteStruct.getOptions().size() >= 2) {
                    if (C6319n.m19593a(((OptionsBean) voteStruct.getOptions().get(0)).getPostOption())) {
                        ((OptionsBean) voteStruct.getOptions().get(0)).setPostOption(C35574k.m114861b().getString(R.string.fqe));
                    }
                    if (C6319n.m19593a(((OptionsBean) voteStruct.getOptions().get(1)).getPostOption())) {
                        ((OptionsBean) voteStruct.getOptions().get(1)).setPostOption(C35574k.m114861b().getString(R.string.fqf));
                    }
                }
            }
        }
        return stickerStructsByPage;
    }

    /* renamed from: a */
    public static void m126715a(C15389d dVar, MainBusinessContext mainBusinessContext) {
        if (mainBusinessContext != null) {
            HashMap hashMap = new HashMap();
            Collection a = m126713a(mainBusinessContext, InteractTrackPage.TRACK_PAGE_RECORD);
            if (!C6307b.m19566a(a)) {
                hashMap.put("interaction_stickers", C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15979b((Object) a));
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("com.bytedance.info", C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15979b((Object) hashMap));
            } catch (JSONException unused) {
            }
            dVar.mo38784a("com.android.information", jSONObject.toString());
        }
    }

    /* renamed from: b */
    private static InteractStickerTracksContext m126717b(MainBusinessContext mainBusinessContext) {
        if (mainBusinessContext != null) {
            return mainBusinessContext.mInteractStickerContext;
        }
        return null;
    }

    /* renamed from: a */
    private static InteractStickerTracksContext m126704a(String str) {
        if (C6319n.m19593a(str)) {
            return null;
        }
        try {
            return ((MainBusinessContext) C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15974a(str, MainBusinessContext.class)).mInteractStickerContext;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static InteractionCheckInfo m126705a(VoteStruct voteStruct) {
        if (voteStruct == null) {
            return null;
        }
        InteractionCheckInfo interactionCheckInfo = new InteractionCheckInfo();
        LinkedList linkedList = new LinkedList();
        if (voteStruct.getOptions().size() == 2) {
            linkedList.add(((OptionsBean) voteStruct.getOptions().get(0)).getPostOption());
            linkedList.add(((OptionsBean) voteStruct.getOptions().get(1)).getPostOption());
            interactionCheckInfo.setOptions(linkedList);
        }
        interactionCheckInfo.setQuestion(voteStruct.getQuestion());
        return interactionCheckInfo;
    }

    /* renamed from: a */
    public static NormalTrackTimeStamp m126708a(InteractStickerStruct interactStickerStruct) {
        List list;
        try {
            list = (List) C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15975a(interactStickerStruct.getTrackList(), new C6597a<List<NormalTrackTimeStamp>>() {
            }.type);
        } catch (Exception unused) {
            list = null;
        }
        if (C6307b.m19566a((Collection<T>) list)) {
            return null;
        }
        return (NormalTrackTimeStamp) list.get(0);
    }

    /* renamed from: a */
    public static String m126709a(MainBusinessContext mainBusinessContext) {
        String str = "";
        InteractStickerStruct a = m126707a(mainBusinessContext, 1, InteractTrackPage.TRACK_PAGE_EDIT);
        if (a == null || C6319n.m19593a(a.getAttr())) {
            return str;
        }
        try {
            HashMap hashMap = (HashMap) C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15975a(a.getAttr(), new C6597a<HashMap<String, String>>() {
            }.type);
            if (hashMap != null && hashMap.containsKey("poll_sticker_id")) {
                str = (String) hashMap.get("poll_sticker_id");
            }
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
        return str;
    }

    /* renamed from: c */
    private static List<InteractStickerStruct> m126719c(MainBusinessContext mainBusinessContext, InteractTrackPage... interactTrackPageArr) {
        LinkedList linkedList = new LinkedList();
        InteractStickerTracksContext b = m126717b(mainBusinessContext);
        if (b == null || b.isEmpty(interactTrackPageArr)) {
            return null;
        }
        linkedList.addAll(b.getStickerStructsByPage(interactTrackPageArr));
        return linkedList;
    }

    /* renamed from: b */
    public static List<InteractStickerStruct> m126718b(MainBusinessContext mainBusinessContext, InteractTrackPage... interactTrackPageArr) {
        LinkedList linkedList = new LinkedList();
        InteractStickerTracksContext b = m126717b(mainBusinessContext);
        if (b == null || b.isEmpty(interactTrackPageArr)) {
            return null;
        }
        List stickerStructsByPage = b.getStickerStructsByPage(interactTrackPageArr);
        Iterator it = stickerStructsByPage.iterator();
        while (it.hasNext()) {
            if (((InteractStickerStruct) it.next()).getVoteStruct() != null) {
                it.remove();
            }
        }
        linkedList.addAll(stickerStructsByPage);
        return linkedList;
    }

    /* renamed from: a */
    public static InteractStickerStruct m126706a(BaseShortVideoContext baseShortVideoContext, int i, InteractTrackPage interactTrackPage) {
        InteractStickerTracksContext interactStickerTracksContext;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            interactStickerTracksContext = m126717b(((VideoPublishEditModel) baseShortVideoContext).getMainBusinessContext());
        } else {
            interactStickerTracksContext = m126704a(baseShortVideoContext.getMainBusinessData());
        }
        if (interactStickerTracksContext == null) {
            return null;
        }
        return interactStickerTracksContext.getTrackByIndex("1", interactTrackPage);
    }

    /* renamed from: a */
    public static InteractStickerStruct m126707a(MainBusinessContext mainBusinessContext, int i, InteractTrackPage interactTrackPage) {
        InteractStickerTracksContext b = m126717b(mainBusinessContext);
        if (b == null) {
            return null;
        }
        return b.getTrackByIndex(String.valueOf(i), interactTrackPage);
    }

    /* renamed from: a */
    public static String m126710a(MainBusinessContext mainBusinessContext, List<InteractStickerStruct> list, InteractTrackPage interactTrackPage) {
        InteractStickerTracksContext interactStickerTracksContext;
        if (mainBusinessContext == null) {
            mainBusinessContext = new MainBusinessContext();
        }
        if (mainBusinessContext.mInteractStickerContext == null) {
            interactStickerTracksContext = new InteractStickerTracksContext();
        } else {
            interactStickerTracksContext = mainBusinessContext.mInteractStickerContext;
        }
        interactStickerTracksContext.upDateStickerStructs(list, interactTrackPage);
        mainBusinessContext.setInteractStickerContext(interactStickerTracksContext);
        return C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15979b((Object) mainBusinessContext);
    }
}
