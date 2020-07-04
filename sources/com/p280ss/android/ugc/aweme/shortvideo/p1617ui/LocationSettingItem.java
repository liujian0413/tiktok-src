package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.p612c.C12105c;
import com.bytedance.lighten.core.p612c.C12112j;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.LocationSettingItem */
public class LocationSettingItem extends PublishSettingItem {

    /* renamed from: a */
    PoiStruct f107078a;

    /* renamed from: b */
    boolean f107079b;

    /* renamed from: k */
    private C41144a f107080k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.LocationSettingItem$a */
    public interface C41144a {
        /* renamed from: a */
        void mo101633a(boolean z);
    }

    public PoiStruct getPoiStruct() {
        return this.f107078a;
    }

    /* renamed from: a */
    public final boolean mo101626a() {
        if (!C6319n.m19593a(getPoiId())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo101627b() {
        super.mo101627b();
        getIconRight().setDuplicateParentStateEnabled(true);
    }

    public String getPoiId() {
        if (this.f107078a == null) {
            return null;
        }
        return this.f107078a.getPoiId();
    }

    public String getPoiName() {
        if (this.f107078a == null) {
            return null;
        }
        return this.f107078a.getPoiName();
    }

    public void setStateChangeCB(C41144a aVar) {
        this.f107080k = aVar;
    }

    /* renamed from: a */
    public final void mo101625a(UrlModel urlModel) {
        if (urlModel == null) {
            this.f107117i.setVisibility(8);
            this.f107079b = false;
            return;
        }
        this.f107079b = true;
        this.f107117i.setVisibility(0);
        C12133n.m35299a(C23400r.m76741a(urlModel)).mo29845a("LocationSettingItem").mo29844a((C12128i) this.f107117i).mo29849a((C12112j) new C12105c() {
            /* renamed from: a */
            public final void mo29812a(Uri uri, View view, Throwable th) {
            }

            /* renamed from: a */
            public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
                if (lVar != null) {
                    LayoutParams layoutParams = (LayoutParams) LocationSettingItem.this.f107117i.getLayoutParams();
                    layoutParams.width = (int) ((((float) lVar.f32217a) * C9738o.m28708b(LocationSettingItem.this.getContext(), 14.0f)) / ((float) lVar.f32218b));
                    LocationSettingItem.this.f107117i.setLayoutParams(layoutParams);
                }
            }
        });
    }

    public void setLocation(PoiStruct poiStruct) {
        this.f107078a = poiStruct;
        boolean z = true;
        setTextHighlight(true);
        int i = 8;
        if (poiStruct == null) {
            if (this.f107079b) {
                i = 0;
            }
            this.f107117i.setVisibility(i);
            setSingleLine(false);
            setTitle((int) R.string.f3);
            setSubtitle((String) null);
        } else {
            this.f107117i.setVisibility(8);
            setSingleLine(true);
            setTitle(poiStruct.getPoiName());
        }
        if (this.f107080k != null) {
            C41144a aVar = this.f107080k;
            if (poiStruct == null) {
                z = false;
            }
            aVar.mo101633a(z);
        }
    }

    public LocationSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.aen);
        setTitle((int) R.string.f3);
        setDrawableLeft(drawable);
        getIconRight().setDuplicateParentStateEnabled(true);
        setSubtitle((String) null);
    }
}
