package com.p280ss.android.ugc.aweme.profile.model;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.profile.api.SelectCityApi;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.profile.model.SelelctCityModel */
public class SelelctCityModel extends C25640a<CityListBean> {
    private static final SelectCityApi S_API = ((SelectCityApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(SelectCityApi.class));
    private ArrayList<String> indexs = new ArrayList<>();

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public List<String> getCityIndexData() {
        if (this.mData == null || ((CityListBean) this.mData).data == null || ((CityListBean) this.mData).data.isEmpty()) {
            return null;
        }
        if (this.indexs.size() == 0) {
            this.indexs.add(0, AwemeApplication.m21341a().getResources().getString(R.string.cmw));
            for (CityBean cityBean : ((CityListBean) this.mData).data) {
                this.indexs.add(cityBean.name);
            }
        }
        return this.indexs;
    }

    static final /* synthetic */ Void lambda$uploadLocation$0$SelelctCityModel(boolean z) throws Exception {
        try {
            S_API.hideLocation(z ^ true ? 1 : 0);
        } catch (Exception unused) {
        }
        return null;
    }

    public static void uploadLocation(boolean z) {
        C1592h.m7855a((Callable<TResult>) new SelelctCityModel$$Lambda$0<TResult>(z), (Executor) C1592h.f5957a);
    }

    public boolean sendRequest(Object... objArr) {
        S_API.queryCityList().mo6876a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0), C1592h.f5958b);
        return true;
    }

    public List<String> getCityData(int i) {
        if (i == 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(AwemeApplication.m21341a().getResources().getString(R.string.fjm));
            return arrayList;
        } else if (this.mData == null || ((CityListBean) this.mData).data == null || ((CityListBean) this.mData).data.isEmpty()) {
            return null;
        } else {
            int i2 = i - 1;
            if (((CityListBean) this.mData).data.get(i2) != null) {
                return ((CityBean) ((CityListBean) this.mData).data.get(i2)).cities;
            }
            return null;
        }
    }
}
