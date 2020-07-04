package com.p280ss.android.ugc.aweme.qrcode.p1499v2;

import android.content.Context;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.b */
public final class C37109b {
    /* renamed from: a */
    public static int m119306a(QRCodeParams qRCodeParams) {
        int i = qRCodeParams.type;
        if (i == 1) {
            return R.drawable.rp;
        }
        if (i == 7) {
            return R.drawable.ro;
        }
        if (i != 17) {
            return R.drawable.rn;
        }
        return R.drawable.rq;
    }

    /* renamed from: a */
    public static String m119307a(Context context, QRCodeParams qRCodeParams) {
        int i = qRCodeParams.type;
        if (!(i == 11 || i == 17 || i == 23)) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
                default:
                    switch (i) {
                        case 7:
                        case 8:
                        case 9:
                            break;
                        default:
                            return "";
                    }
            }
        }
        return qRCodeParams.title;
    }

    /* renamed from: b */
    public static String m119308b(Context context, QRCodeParams qRCodeParams) {
        int i = qRCodeParams.type;
        if (i == 11) {
            return "";
        }
        if (i != 17) {
            if (i != 23) {
                switch (i) {
                    case 1:
                        return context.getString(R.string.fsf, new Object[]{qRCodeParams.describe});
                    case 2:
                        break;
                    case 3:
                        return context.getString(R.string.ci4, new Object[]{qRCodeParams.describe});
                    case 4:
                        return qRCodeParams.describe;
                    case 5:
                        return "";
                    default:
                        switch (i) {
                            case 7:
                                return qRCodeParams.describe;
                            case 8:
                                return "";
                            case 9:
                                return "";
                            default:
                                return "";
                        }
                }
            }
            return context.getString(R.string.bwz, new Object[]{qRCodeParams.describe});
        }
        return context.getString(R.string.ci4, new Object[]{qRCodeParams.describe});
    }

    /* renamed from: c */
    public static String m119309c(Context context, QRCodeParams qRCodeParams) {
        int i = qRCodeParams.type;
        if (i == 11) {
            return "";
        }
        if (i == 17) {
            return context.getString(R.string.dad);
        }
        if (i != 23) {
            switch (i) {
                case 1:
                    return context.getString(R.string.dak);
                case 2:
                    break;
                case 3:
                    return context.getString(R.string.da7);
                case 4:
                    if (!qRCodeParams.isEnterpriseUser) {
                        return context.getString(R.string.dah);
                    }
                    return context.getString(R.string.da2, new Object[]{qRCodeParams.title});
                case 5:
                    return "";
                default:
                    switch (i) {
                        case 7:
                            return context.getString(R.string.daa);
                        case 8:
                            return "";
                        case 9:
                            return "";
                        default:
                            return "";
                    }
            }
        }
        return context.getString(R.string.d_z);
    }

    /* renamed from: d */
    public static String m119310d(Context context, QRCodeParams qRCodeParams) {
        int i = qRCodeParams.type;
        if (i == 11) {
            return "";
        }
        if (i == 17) {
            return context.getString(R.string.daf);
        }
        if (i != 23) {
            switch (i) {
                case 1:
                    return context.getString(R.string.dam);
                case 2:
                    break;
                case 3:
                    return context.getString(R.string.da9);
                case 4:
                    if (!qRCodeParams.isEnterpriseUser) {
                        return context.getString(R.string.daj);
                    }
                    return context.getString(R.string.da4, new Object[]{qRCodeParams.title});
                case 5:
                    return "";
                default:
                    switch (i) {
                        case 7:
                            return context.getString(R.string.dac);
                        case 8:
                            return "";
                        case 9:
                            return "";
                        default:
                            return "";
                    }
            }
        }
        return context.getString(R.string.da1);
    }
}
