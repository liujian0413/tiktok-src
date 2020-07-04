package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem */
public class BusinessGoodsPublishSettingItem extends PublishSettingItem {

    /* renamed from: a */
    public boolean f107019a;

    /* renamed from: b */
    private C41131a f107020b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.BusinessGoodsPublishSettingItem$a */
    public interface C41131a {
        /* renamed from: a */
        void mo101595a(boolean z);
    }

    /* renamed from: a */
    public final void mo101592a() {
        this.f107019a = true;
    }

    public void setStateChangeCB(C41131a aVar) {
        this.f107020b = aVar;
    }

    public void setBusinessGoodsInfo(BusinessGoodsPublishModel businessGoodsPublishModel) {
        if (businessGoodsPublishModel != null) {
            if (!TextUtils.isEmpty(businessGoodsPublishModel.title)) {
                setTitle(businessGoodsPublishModel.title);
                this.f107019a = true;
                setDrawableLeft((int) R.drawable.aow);
            } else {
                setTitle((int) R.string.bc2);
                this.f107019a = false;
                setDrawableLeft((int) R.drawable.a21);
            }
            if (this.f107020b != null) {
                this.f107020b.mo101595a(!TextUtils.isEmpty(businessGoodsPublishModel.title));
            }
            setSubtitle((String) null);
        }
    }

    public BusinessGoodsPublishSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.a21);
        setTitle((int) R.string.bc2);
        setDrawableLeft(drawable);
        setSubtitle((String) null);
    }
}
