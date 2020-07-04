package com.p280ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiExtension */
public class PoiExtension implements Serializable {
    @C6593c(mo15949a = "comment_list")
    public List<PoiComment> commentList;
    @C6593c(mo15949a = "comment_url")
    public String commentUrl;
    @C6593c(mo15949a = "cost")
    public String cost;
    @C6593c(mo15949a = "customer_service_url")
    public String customerServiceUrl;
    @C6593c(mo15949a = "desc_title")
    public String descTitle;
    @C6593c(mo15949a = "feedback_url")
    public String feedbackUrl;
    @C6593c(mo15949a = "has_detail_info")
    public boolean hasDetailInfo;
    @C6593c(mo15949a = "has_rate")
    public int hasRate;
    @C6593c(mo15949a = "has_upload_image_permission")
    public boolean hasUploadImagePermission;
    @C6593c(mo15949a = "i18n_cost")
    public String i18nCost;
    @C6593c(mo15949a = "introduction")
    public String introduction;
    @C6593c(mo15949a = "open_time")
    public String open_time;
    @C6593c(mo15949a = "order_info")
    public PoiOrder orderInfo;
    @C6593c(mo15949a = "photos")
    public List<PoiPhoto> photos;
    @C6593c(mo15949a = "poi_activity_info")
    public PoiActivityInfo poiActivityInfo;
    @C6593c(mo15949a = "destination_poi_class_list")
    public List<DestinationPoiClassInfoStruct> poiClassInfoStructList;
    @C6593c(mo15949a = "poi_class_rank")
    public PoiClassRankStruct poiClassRank;
    @C6593c(mo15949a = "question_info")
    public PoiQuestionInfo questionInfo;
    @C6593c(mo15949a = "rating")
    public String rating;
    @C6593c(mo15949a = "recommend_items")
    public List<PoiPhoto> recommendItems;
    @C6593c(mo15949a = "recommend_title")
    public String recommendTitle;
    @C6593c(mo15949a = "biz_src")
    public int source;
    @C6593c(mo15949a = "specialities")
    public String specialities;
    @C6593c(mo15949a = "sub_type")
    public String subType;
    @C6593c(mo15949a = "tags")
    public String tags;
    @C6593c(mo15949a = "telephone")
    public String telephone;
    @C6593c(mo15949a = "valid")
    public boolean valid;
    @C6593c(mo15949a = "website")
    public String website;

    public List<DestinationPoiClassInfoStruct> getPoiClassInfoStructList() {
        return this.poiClassInfoStructList;
    }

    public long getRankClassCode() {
        if (this.poiClassRank != null) {
            return this.poiClassRank.poiClassCode;
        }
        return -1;
    }

    public String getRankDesc() {
        if (this.poiClassRank != null) {
            return this.poiClassRank.description;
        }
        return "";
    }

    public PoiQuestion getQuestion() {
        List questions = this.questionInfo.getQuestions();
        if (C6307b.m19566a((Collection<T>) questions)) {
            return null;
        }
        return (PoiQuestion) questions.get(0);
    }

    public String[] getPoiCategory() {
        if (this.poiClassInfoStructList == null || this.poiClassInfoStructList.size() == 0) {
            return null;
        }
        String[] strArr = new String[this.poiClassInfoStructList.size()];
        int i = 0;
        for (DestinationPoiClassInfoStruct destinationPoiClassInfoStruct : this.poiClassInfoStructList) {
            strArr[i] = destinationPoiClassInfoStruct.name;
            i++;
        }
        if (i < 3) {
            return null;
        }
        return strArr;
    }

    public void validatePoiClassInfoStructList() {
        if (this.poiClassInfoStructList != null) {
            for (int size = this.poiClassInfoStructList.size() - 1; size >= 0; size--) {
                if (((DestinationPoiClassInfoStruct) this.poiClassInfoStructList.get(size)).size() < 3) {
                    this.poiClassInfoStructList.remove(size);
                }
            }
        }
    }

    public DestinationPoiClassInfoStruct getPoiClassInfoStruct(int i) {
        return (DestinationPoiClassInfoStruct) this.poiClassInfoStructList.get(i);
    }
}
