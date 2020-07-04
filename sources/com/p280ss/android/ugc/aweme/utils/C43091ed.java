package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.design.widget.Snackbar.SnackbarLayout;
import android.support.p022v4.view.p028a.C0942b;
import android.support.p022v4.view.p028a.C0942b.C0943a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.utils.ed */
public final class C43091ed {
    /* renamed from: a */
    private static String m136695a(ShareCompleteEvent shareCompleteEvent) {
        if (shareCompleteEvent.isMulti) {
            return C6399b.m19921a().getString(R.string.bdn, new Object[]{shareCompleteEvent.contact.getDisplayName()});
        }
        return C6399b.m19921a().getString(R.string.bdm, new Object[]{shareCompleteEvent.contact.getDisplayName()});
    }

    /* renamed from: a */
    private static void m136697a(Context context, ShareCompleteEvent shareCompleteEvent) {
        IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
        if (iIMService != null) {
            iIMService.startChat(context, shareCompleteEvent.contact);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m136694a(Snackbar snackbar, C1592h hVar) throws Exception {
        if (snackbar.mo1284c()) {
            snackbar.dismiss();
        }
        try {
            Class cls = Class.forName("android.support.design.widget.BaseTransientBottomBar$d");
            Field declaredField = cls.getDeclaredField("accessibilityManager");
            declaredField.setAccessible(true);
            if (declaredField.get(snackbar.f1297d) == null || !(declaredField.get(snackbar.f1297d) instanceof AccessibilityManager)) {
                return null;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) declaredField.get(snackbar.f1297d);
            Field declaredField2 = cls.getDeclaredField("touchExplorationStateChangeListener");
            declaredField2.setAccessible(true);
            if (declaredField2.get(snackbar.f1297d) == null || !(declaredField2.get(snackbar.f1297d) instanceof C0943a)) {
                return null;
            }
            C0942b.m3981b(accessibilityManager, (C0943a) declaredField2.get(snackbar.f1297d));
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m136696a(Context context, View view, ShareCompleteEvent shareCompleteEvent) {
        if (context != null && view != null && shareCompleteEvent != null) {
            String a = m136695a(shareCompleteEvent);
            if (!TextUtils.isEmpty(a)) {
                Snackbar a2 = Snackbar.m1577a(view, "", -2);
                SnackbarLayout snackbarLayout = (SnackbarLayout) a2.f1297d;
                snackbarLayout.setPadding(0, 0, 0, 0);
                ((TextView) snackbarLayout.findViewById(R.id.d8k)).setVisibility(4);
                View inflate = LayoutInflater.from(context).inflate(R.layout.ajg, snackbarLayout);
                ((TextView) inflate.findViewById(R.id.dyo)).setText(a);
                if (C6399b.m19946v()) {
                    ((ImageView) inflate.findViewById(R.id.b7_)).setImageResource(R.drawable.at_);
                }
                inflate.setOnClickListener(new C43092ee(context, shareCompleteEvent, a2));
                C1592h.m7848a(500).mo6876a((C1591g<TResult, TContinuationResult>) new C43093ef<TResult,TContinuationResult>(a2), C1592h.f5958b);
                C1592h.m7848a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo6876a((C1591g<TResult, TContinuationResult>) new C43094eg<TResult,TContinuationResult>(a2), C1592h.f5958b);
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m136698a(Context context, ShareCompleteEvent shareCompleteEvent, Snackbar snackbar, View view) {
        m136697a(context, shareCompleteEvent);
        snackbar.dismiss();
    }
}
