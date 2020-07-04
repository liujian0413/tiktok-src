package com.p280ss.android.ugc.aweme.photo.setfilter;

import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.filter.C29238ba;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.photo.setfilter.k */
public interface C34816k {
    /* renamed from: a */
    void mo88256a();

    void setData(List<C29296g> list);

    void setData(Map<EffectCategoryResponse, List<C29296g>> map);

    void setFilterIndex(int i);

    void setFilterIntensityStore(C29230az azVar);

    void setFilterInternalDefaultIntensityGetter(C29238ba baVar);

    void setOnFilterChangeListener(C34817l lVar);

    void setPhotoContext(PhotoContext photoContext);
}
