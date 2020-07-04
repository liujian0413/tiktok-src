package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.view.View;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.experiment.UserProfileMessageStyleExperiment;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.bb */
public final class C36530bb {

    /* renamed from: a */
    public static final C36530bb f95903a = new C36530bb();

    /* renamed from: b */
    private static final int f95904b;

    /* renamed from: c */
    private static final int f95905c;

    private C36530bb() {
    }

    /* renamed from: a */
    public static final int m117951a() {
        return f95905c;
    }

    /* renamed from: b */
    public static final boolean m117955b() {
        if (f95904b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m117956c() {
        IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
        if (iIMService != null) {
            return iIMService.isImReduction();
        }
        return false;
    }

    static {
        int i;
        int a = C6384b.m19835a().mo15287a(UserProfileMessageStyleExperiment.class, true, "send_message_style_in_user_profile", C6384b.m19835a().mo15295d().send_message_style_in_user_profile, 0);
        f95904b = a;
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i = 69;
                break;
            default:
                i = 40;
                break;
        }
        f95905c = i;
    }

    /* renamed from: a */
    public static final void m117953a(RemoteImageView remoteImageView) {
        C7573i.m23587b(remoteImageView, "icon");
        if (f95904b != 0) {
            remoteImageView.setImageResource(R.drawable.ahs);
        }
    }

    /* renamed from: a */
    public static final boolean m117954a(int i) {
        if (C6399b.m19944t() || i == 0 || i == 4) {
            return true;
        }
        int i2 = f95904b;
        if (i2 == 1 || i2 == 3 || i2 == 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m117952a(View view) {
        int i;
        if (!C6399b.m19944t() && view != null) {
            RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.d39);
            if (remoteImageView != null) {
                DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.d38);
                if (dmtTextView != null) {
                    int i2 = -1;
                    switch (f95904b) {
                        case 1:
                        case 2:
                            i = R.string.a1x;
                            break;
                        case 3:
                        case 4:
                            i = R.string.a1z;
                            break;
                        case 5:
                        case 6:
                            i = R.string.a1w;
                            break;
                        case 7:
                            i = -1;
                            i2 = R.drawable.ahs;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    if (i > 0) {
                        dmtTextView.setText(i);
                        dmtTextView.setVisibility(0);
                        remoteImageView.setVisibility(8);
                        return;
                    }
                    if (i2 > 0) {
                        remoteImageView.setImageResource(i2);
                        remoteImageView.setVisibility(0);
                        dmtTextView.setVisibility(8);
                    }
                }
            }
        }
    }
}
