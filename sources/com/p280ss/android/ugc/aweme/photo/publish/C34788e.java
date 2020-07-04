package com.p280ss.android.ugc.aweme.photo.publish;

import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.services.IAVService;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.e */
public final class C34788e {
    /* renamed from: a */
    public static String m112188a(int i) {
        switch (i) {
            case 0:
                return "public";
            case 1:
                return "private";
            case 2:
                return "friend";
            default:
                return "public";
        }
    }

    /* renamed from: b */
    public static String m112190b(int i) {
        if (i != 0) {
            switch (i) {
                case 5:
                case 8:
                    return "photo";
                case 6:
                    return "slideshow";
                case 7:
                case 9:
                    break;
                default:
                    return null;
            }
        }
        return "video";
    }

    /* renamed from: c */
    public static boolean m112191c(int i) {
        return i == 0 || i == 7;
    }

    /* renamed from: d */
    public static boolean m112192d(int i) {
        return i == 8 || i == 7 || i == 9;
    }

    /* renamed from: a */
    public static String m112189a(int i, Object obj) {
        if (i != 0) {
            switch (i) {
                case 5:
                    if (((PhotoContext) obj).mPhotoFrom == 1) {
                        return "shoot";
                    }
                    return "upload";
                case 6:
                    return "upload";
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    return null;
            }
        }
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().converToExposureData(obj).getOrigin() == 1) {
            return "shoot";
        }
        return "upload";
    }
}
