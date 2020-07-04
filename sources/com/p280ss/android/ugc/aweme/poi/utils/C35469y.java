package com.p280ss.android.ugc.aweme.poi.utils;

import android.text.TextUtils;
import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.generic.C13439b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.y */
public final class C35469y {
    /* renamed from: a */
    public static boolean m114574a() {
        if (!C30538p.m99745a() || ((Boolean) SharePrefCache.inst().getShowInteractionStickers().mo59877d()).booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m114576a(PoiStruct poiStruct) {
        if (poiStruct != null && poiStruct.getPoiSubTitleType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String[] m114577a(LocationBundle locationBundle) {
        String str;
        String str2;
        if (locationBundle.isGaode) {
            double[] c = C35440a.m114455c(locationBundle.longitude, locationBundle.latitude);
            str2 = C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(c[0])});
            str = C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(c[1])});
        } else {
            str2 = C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(locationBundle.longitude)});
            str = C1642a.m8035a(Locale.US, "%.6f", new Object[]{Double.valueOf(locationBundle.latitude)});
        }
        return new String[]{str, str2};
    }

    /* renamed from: a */
    public static String m114572a(PoiStruct poiStruct, String str) {
        if (poiStruct == null) {
            return "";
        }
        return (String) poiStruct.get(str);
    }

    /* renamed from: a */
    public static void m114573a(RemoteImageView remoteImageView, PoiStruct poiStruct) {
        int i;
        if (!C6399b.m19944t()) {
            i = R.drawable.aez;
        } else {
            i = R.drawable.aet;
        }
        remoteImageView.setImageResource(i);
        if (poiStruct != null) {
            UrlModel urlModel = poiStruct.iconOnEntry;
            if (urlModel != null && remoteImageView != null && remoteImageView.getContext() != null) {
                try {
                    C13439b bVar = new C13439b(remoteImageView.getContext().getResources());
                    bVar.mo32917b(i);
                    bVar.mo32923d(i);
                    remoteImageView.setHierarchy(bVar.mo32908a());
                    C23323e.m76524b(remoteImageView, urlModel);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m114575a(LocationBundle locationBundle, PoiStruct poiStruct) {
        if (poiStruct == null) {
            return true;
        }
        if (poiStruct.getPoiSubTitleType() != 4) {
            if (!TextUtils.isEmpty(poiStruct.getPoiSubTitle()) && poiStruct.getPoiSubTitleType() != 0) {
                if (!m114576a(poiStruct)) {
                    return false;
                }
                poiStruct.getVoucherReleaseAreas();
                C28290d.m93043d();
            }
            return true;
        } else if (locationBundle == null) {
            return true;
        } else {
            try {
                if (C35442b.m114465a(Double.parseDouble(poiStruct.poiLatitude), Double.parseDouble(poiStruct.poiLongitude), locationBundle.latitude, locationBundle.longitude) > 10.0d) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return true;
            }
        }
    }
}
