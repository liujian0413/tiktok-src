package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext */
public class InteractStickerTracksContext implements Serializable {
    private String extra;
    private LinkedHashMap<String, InteractStickerStruct> structEditLinkedHashMap;
    private LinkedHashMap<String, InteractStickerStruct> structRecordLinkedHashMap;

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public boolean isEmpty(InteractTrackPage... interactTrackPageArr) {
        for (InteractTrackPage structRecordLinkedHashMapByPage : interactTrackPageArr) {
            if (!getStructRecordLinkedHashMapByPage(structRecordLinkedHashMapByPage).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private LinkedHashMap<String, InteractStickerStruct> getStructRecordLinkedHashMapByPage(InteractTrackPage interactTrackPage) {
        switch (interactTrackPage) {
            case TRACK_PAGE_RECORD:
                if (this.structRecordLinkedHashMap == null) {
                    this.structRecordLinkedHashMap = new LinkedHashMap<>();
                }
                return this.structRecordLinkedHashMap;
            case TRACK_PAGE_EDIT:
                if (this.structEditLinkedHashMap == null) {
                    this.structEditLinkedHashMap = new LinkedHashMap<>();
                }
                return this.structEditLinkedHashMap;
            default:
                return new LinkedHashMap<>();
        }
    }

    public List<InteractStickerStruct> getStickerStructsByPage(InteractTrackPage... interactTrackPageArr) {
        ArrayList arrayList = new ArrayList();
        for (InteractTrackPage structRecordLinkedHashMapByPage : interactTrackPageArr) {
            LinkedHashMap structRecordLinkedHashMapByPage2 = getStructRecordLinkedHashMapByPage(structRecordLinkedHashMapByPage);
            for (String str : structRecordLinkedHashMapByPage2.keySet()) {
                arrayList.add(structRecordLinkedHashMapByPage2.get(str));
            }
        }
        return arrayList;
    }

    public void updateStickerStruct(InteractStickerStruct interactStickerStruct, InteractTrackPage interactTrackPage) {
        getStructRecordLinkedHashMapByPage(interactTrackPage).put(String.valueOf(interactStickerStruct.getIndex()), interactStickerStruct);
    }

    public InteractStickerStruct getTrackByIndex(String str, InteractTrackPage interactTrackPage) {
        LinkedHashMap structRecordLinkedHashMapByPage = getStructRecordLinkedHashMapByPage(interactTrackPage);
        if (structRecordLinkedHashMapByPage.isEmpty()) {
            return null;
        }
        return (InteractStickerStruct) structRecordLinkedHashMapByPage.get(str);
    }

    public void upDateStickerStructs(List<InteractStickerStruct> list, InteractTrackPage interactTrackPage) {
        LinkedHashMap structRecordLinkedHashMapByPage = getStructRecordLinkedHashMapByPage(interactTrackPage);
        structRecordLinkedHashMapByPage.clear();
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (InteractStickerStruct interactStickerStruct : list) {
                structRecordLinkedHashMapByPage.put(String.valueOf(interactStickerStruct.getIndex()), interactStickerStruct);
            }
        }
    }
}
