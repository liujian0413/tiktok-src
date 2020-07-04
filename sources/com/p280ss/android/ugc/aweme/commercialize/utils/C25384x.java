package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Dialog;
import android.content.Context;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.comment.list.C24181g;
import com.p280ss.android.ugc.aweme.comment.p1095b.C24087a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.x */
public final class C25384x {
    /* renamed from: b */
    public static boolean m83533b(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !C25352e.m83215a(aweme) || TextUtils.isEmpty(C25352e.m83303N(aweme))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m83528a(C0608j jVar) {
        if (jVar == null) {
            return false;
        }
        List<Fragment> f = jVar.mo2658f();
        if (C6307b.m19566a((Collection<T>) f)) {
            return false;
        }
        for (Fragment fragment : f) {
            if (fragment != null && !(fragment instanceof C24087a)) {
                if (fragment instanceof DialogFragment) {
                    Dialog dialog = ((DialogFragment) fragment).getDialog();
                    if (dialog != null) {
                        return dialog.isShowing();
                    }
                } else if (fragment instanceof C24181g) {
                    return ((C24181g) fragment).mo62628e();
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m83529a(Aweme aweme) {
        if (aweme.getAwemeRawAd() == null) {
            return false;
        }
        String type = aweme.getAwemeRawAd().getType();
        int maskFormStyle = aweme.getAwemeRawAd().getMaskFormStyle();
        if (!TextUtils.equals(type, "form") || maskFormStyle != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m83531a(AwemeRawAd awemeRawAd) {
        String openUrl = awemeRawAd.getOpenUrl();
        String downloadUrl = awemeRawAd.getDownloadUrl();
        String packageName = awemeRawAd.getPackageName();
        if (C25371n.m83473b(openUrl)) {
            return true;
        }
        if (C6399b.m19944t()) {
            if (!TextUtils.isEmpty(packageName)) {
                return true;
            }
            return false;
        } else if (!TextUtils.isEmpty(downloadUrl)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static String m83525a(Context context, Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (!aweme.isAd()) {
            return "";
        }
        User author = aweme.getAuthor();
        if (author == null) {
            return "";
        }
        String nickname = author.getNickname();
        if (TextUtils.isEmpty(nickname)) {
            nickname = "";
        }
        return nickname;
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m83534b(com.p280ss.android.ugc.aweme.feed.model.Aweme r8, boolean r9) {
        /*
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r8.getAwemeRawAd()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r2 = r0.isDisableUserprofileAdLabel()
            if (r2 == 0) goto L_0x000f
            return r1
        L_0x000f:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r8.getAwemeRawAd()
            java.lang.String r2 = r2.getType()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x001e
            return r1
        L_0x001e:
            java.lang.String r3 = r0.getOpenUrl()
            java.lang.String r4 = r0.getWebUrl()
            r5 = -1
            int r6 = r2.hashCode()
            r7 = 1
            switch(r6) {
                case -1354573786: goto L_0x006c;
                case 96801: goto L_0x0062;
                case 117588: goto L_0x0058;
                case 3083120: goto L_0x004e;
                case 3148996: goto L_0x0044;
                case 957829685: goto L_0x003a;
                case 1893962841: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0076
        L_0x0030:
            java.lang.String r6 = "redpacket"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0076
            r2 = 5
            goto L_0x0077
        L_0x003a:
            java.lang.String r6 = "counsel"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0076
            r2 = 6
            goto L_0x0077
        L_0x0044:
            java.lang.String r6 = "form"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0076
            r2 = 4
            goto L_0x0077
        L_0x004e:
            java.lang.String r6 = "dial"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0076
            r2 = 3
            goto L_0x0077
        L_0x0058:
            java.lang.String r6 = "web"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0076
            r2 = 0
            goto L_0x0077
        L_0x0062:
            java.lang.String r6 = "app"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0076
            r2 = 2
            goto L_0x0077
        L_0x006c:
            java.lang.String r6 = "coupon"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0076
            r2 = 1
            goto L_0x0077
        L_0x0076:
            r2 = -1
        L_0x0077:
            switch(r2) {
                case 0: goto L_0x00c1;
                case 1: goto L_0x00c1;
                case 2: goto L_0x00bc;
                case 3: goto L_0x00b0;
                case 4: goto L_0x0093;
                case 5: goto L_0x0087;
                case 6: goto L_0x007b;
                default: goto L_0x007a;
            }
        L_0x007a:
            return r1
        L_0x007b:
            java.lang.String r8 = r0.getConsultUrl()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0086
            return r7
        L_0x0086:
            return r1
        L_0x0087:
            java.lang.String r8 = r0.getRedUrl()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0092
            return r7
        L_0x0092:
            return r1
        L_0x0093:
            java.lang.String r0 = r0.getFormUrl()
            if (r9 == 0) goto L_0x00a1
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 != 0) goto L_0x00a0
            return r7
        L_0x00a0:
            return r1
        L_0x00a1:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 == 0) goto L_0x00af
            com.ss.android.ugc.aweme.feed.model.CardStruct r8 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83310U(r8)
            if (r8 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            return r1
        L_0x00af:
            return r7
        L_0x00b0:
            java.lang.String r8 = r0.getPhoneNumber()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x00bb
            return r7
        L_0x00bb:
            return r1
        L_0x00bc:
            boolean r8 = m83531a(r0)
            return r8
        L_0x00c1:
            boolean r8 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83473b(r3)
            if (r8 != 0) goto L_0x00cf
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 != 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            return r1
        L_0x00cf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.C25384x.m83534b(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):boolean");
    }

    /* renamed from: a */
    public static boolean m83530a(Aweme aweme, boolean z) {
        if (aweme != null && aweme.isAd() && m83534b(aweme, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m83526a(Context context, Aweme aweme, boolean z) {
        if (context == null) {
            return "";
        }
        if (aweme == null) {
            return "";
        }
        if (!aweme.isAd()) {
            return "";
        }
        return m83532b(context, aweme, z);
    }

    /* renamed from: b */
    private static String m83532b(Context context, Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return "";
        }
        String type = aweme.getAwemeRawAd().getType();
        if (TextUtils.isEmpty(type)) {
            return "";
        }
        String buttonText = awemeRawAd.getButtonText();
        char c = 65535;
        switch (type.hashCode()) {
            case -1354573786:
                if (type.equals("coupon")) {
                    c = 6;
                    break;
                }
                break;
            case 96801:
                if (type.equals("app")) {
                    c = 1;
                    break;
                }
                break;
            case 117588:
                if (type.equals("web")) {
                    c = 0;
                    break;
                }
                break;
            case 3083120:
                if (type.equals("dial")) {
                    c = 2;
                    break;
                }
                break;
            case 3148996:
                if (type.equals("form")) {
                    c = 3;
                    break;
                }
                break;
            case 957829685:
                if (type.equals("counsel")) {
                    c = 5;
                    break;
                }
                break;
            case 1893962841:
                if (type.equals("redpacket")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.ef);
                }
                return buttonText;
            case 1:
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.ef);
                }
                return buttonText;
            case 2:
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.ea);
                }
                return buttonText;
            case 3:
                if (z) {
                    return context.getString(R.string.ef);
                }
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.dy);
                }
                return buttonText;
            case 4:
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.ec);
                }
                return buttonText;
            case 5:
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.ef);
                }
                return buttonText;
            case 6:
                if (TextUtils.isEmpty(buttonText)) {
                    return context.getString(R.string.dv);
                }
                return buttonText;
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static void m83527a(View view, int i, int i2, boolean z) {
        if (view != null) {
            int i3 = ((LayoutParams) view.getLayoutParams()).bottomMargin;
            if (z) {
                if (i3 < 0) {
                    C43081e.m136668a(view, i3, i, i2).start();
                }
            } else if (i3 >= 0) {
                C43081e.m136668a(view, i3, i, i2).start();
            }
        }
    }
}
