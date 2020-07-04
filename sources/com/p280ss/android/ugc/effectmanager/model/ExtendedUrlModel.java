package com.p280ss.android.ugc.effectmanager.model;

import android.os.Parcel;
import com.p280ss.android.ugc.effectmanager.FetchModelType;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.model.ExtendedUrlModel */
public class ExtendedUrlModel extends UrlModel {
    private List<String> zip_url_list;

    /* renamed from: com.ss.android.ugc.effectmanager.model.ExtendedUrlModel$1 */
    static /* synthetic */ class C438571 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType = new int[FetchModelType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.ss.android.ugc.effectmanager.FetchModelType[] r0 = com.p280ss.android.ugc.effectmanager.FetchModelType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType = r0
                int[] r0 = $SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.effectmanager.FetchModelType r1 = com.p280ss.android.ugc.effectmanager.FetchModelType.ZIP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.effectmanager.FetchModelType r1 = com.p280ss.android.ugc.effectmanager.FetchModelType.ORIGIN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.model.ExtendedUrlModel.C438571.<clinit>():void");
        }
    }

    public List<String> getZipUrlList() {
        return this.zip_url_list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.zip_url_list != null) {
            for (String str : this.zip_url_list) {
                sb.append(" [");
                sb.append(str);
                sb.append("] ");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("zip_url_list='");
        sb2.append(sb.toString());
        return sb2.toString();
    }

    public void setZipUrlList(List<String> list) {
        this.zip_url_list = list;
    }

    private ExtendedUrlModel(Parcel parcel) {
        super(parcel);
        this.zip_url_list = parcel.createStringArrayList();
    }

    public List<String> getUrl(FetchModelType fetchModelType) {
        if (C438571.$SwitchMap$com$ss$android$ugc$effectmanager$FetchModelType[fetchModelType.ordinal()] != 1) {
            return this.url_list;
        }
        return this.zip_url_list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringList(this.zip_url_list);
    }
}
