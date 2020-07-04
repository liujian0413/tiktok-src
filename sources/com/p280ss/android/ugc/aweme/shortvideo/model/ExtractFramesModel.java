package com.p280ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.google.gson.C6607f;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel */
public class ExtractFramesModel implements Serializable {
    @C6593c(mo15949a = "extractFramesDir")
    public String extractFramesDir;
    @C6593c(mo15949a = "extractType")
    public String extractType;
    @C6593c(mo15949a = "frames")
    public Map<Integer, ArrayList<String>> frames = new HashMap();
    @C6593c(mo15949a = "stickerFacesMap")
    public Map<Integer, String> stickerFaces = new HashMap();
    private String stickerIds;

    public String getStickerIds() {
        return this.stickerIds;
    }

    public void clearAllFrames() {
        if (this.frames != null) {
            this.frames.clear();
        }
    }

    public String toString() {
        return new C6607f().mo15992f().mo15979b((Object) this);
    }

    public List<String> removeLastSegment() {
        if (this.frames == null || this.frames.size() <= 0) {
            return new ArrayList();
        }
        return (List) this.frames.remove(Integer.valueOf(this.frames.size() - 1));
    }

    public void removeStickerFace() {
        int i;
        if (this.stickerFaces != null && !this.stickerFaces.isEmpty()) {
            if (this.frames == null || this.frames.isEmpty()) {
                i = 0;
            } else {
                i = this.frames.size();
            }
            this.stickerFaces.remove(Integer.valueOf(i));
        }
    }

    public List<String> getAllFrames() {
        ArrayList arrayList = new ArrayList();
        if (this.frames == null || this.frames.isEmpty()) {
            return arrayList;
        }
        for (int i = 0; i < this.frames.size(); i++) {
            List list = (List) this.frames.get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                arrayList.addAll(list);
            }
            String str = (String) this.stickerFaces.get(Integer.valueOf(i));
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public void setStickerIds(String str) {
        this.stickerIds = str;
    }

    public ExtractFramesModel(String str) {
        this.extractType = str;
    }

    public static ExtractFramesModel string2Model(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (ExtractFramesModel) new C6607f().mo15992f().mo15974a(str, ExtractFramesModel.class);
    }

    public void addFrameSegment(ArrayList<String> arrayList) {
        if (this.frames != null) {
            this.frames.put(Integer.valueOf(this.frames.size()), arrayList);
        }
    }

    public void addFrameAtLastSegment(String str) {
        if (this.frames != null && this.frames.size() > 0) {
            ((ArrayList) this.frames.get(Integer.valueOf(this.frames.size() - 1))).add(str);
        }
    }

    public void addStickFace(String str) {
        int i;
        if (this.stickerFaces == null) {
            this.stickerFaces = new HashMap();
        }
        if (this.frames == null || this.frames.isEmpty()) {
            i = 0;
        } else {
            i = this.frames.size();
        }
        this.stickerFaces.put(Integer.valueOf(i), str);
    }
}
