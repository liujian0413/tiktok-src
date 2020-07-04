package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.PoiContext;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.LocationActivityPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.o */
public final class C41389o implements IAVPublishExtension<LocationActivityPublishModel> {

    /* renamed from: b */
    public static final C41390a f107701b = new C41390a(null);

    /* renamed from: a */
    public LocationActivitySettingItem f107702a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.o$a */
    public static final class C41390a {
        private C41390a() {
        }

        public /* synthetic */ C41390a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.o$b */
    static final class C41391b<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41389o f107703a;

        C41391b(C41389o oVar) {
            this.f107703a = oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            int i;
            if (bool != null) {
                LocationActivitySettingItem a = this.f107703a.mo102020a();
                C7573i.m23582a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                a.setVisibility(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.o$c */
    static final class C41392c<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41389o f107704a;

        C41392c(C41389o oVar) {
            this.f107704a = oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C41389o oVar = this.f107704a;
                C7573i.m23582a((Object) bool, "it");
                oVar.mo102021a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.o$d */
    static final class C41393d extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C41389o f107705a;

        C41393d(C41389o oVar) {
            this.f107705a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m131991a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m131991a(String str) {
            this.f107705a.mo102020a().setPoiActivity(PoiContext.unserializeFromJson(str));
        }
    }

    public final String getName() {
        return "LocationActivityPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed(PublishOutput publishOutput) {
        C7573i.m23587b(publishOutput, "publishOutput");
    }

    public final void onCreateFinish() {
        DefaultImpls.onCreateFinish(this);
    }

    public final void onDestroy() {
    }

    public final void onPublish(PublishOutput publishOutput) {
        C7573i.m23587b(publishOutput, "publishOutput");
    }

    public final void onResume() {
        DefaultImpls.onResume(this);
    }

    public final void onSaveDraft(PublishOutput publishOutput) {
        C7573i.m23587b(publishOutput, "publishOutput");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C7573i.m23587b(bundle, "outState");
    }

    /* renamed from: b */
    private static LocationActivityPublishModel m131986b() {
        return new LocationActivityPublishModel();
    }

    public final /* synthetic */ Object provideExtensionData() {
        return m131986b();
    }

    /* renamed from: a */
    public final LocationActivitySettingItem mo102020a() {
        LocationActivitySettingItem locationActivitySettingItem = this.f107702a;
        if (locationActivitySettingItem == null) {
            C7573i.m23583a("delegate");
        }
        return locationActivitySettingItem;
    }

    public final void onEnterChildrenMode() {
        LocationActivitySettingItem locationActivitySettingItem = this.f107702a;
        if (locationActivitySettingItem == null) {
            C7573i.m23583a("delegate");
        }
        locationActivitySettingItem.setVisibility(8);
    }

    /* renamed from: a */
    private static LocationActivitySettingItem m131985a(LinearLayout linearLayout) {
        LocationActivitySettingItem locationActivitySettingItem = new LocationActivitySettingItem(linearLayout.getContext());
        linearLayout.addView(locationActivitySettingItem, new LayoutParams(-1, -2));
        locationActivitySettingItem.setVisibility(8);
        return locationActivitySettingItem;
    }

    /* renamed from: a */
    public final void mo102021a(boolean z) {
        if (z) {
            LocationActivitySettingItem locationActivitySettingItem = this.f107702a;
            if (locationActivitySettingItem == null) {
                C7573i.m23583a("delegate");
            }
            locationActivitySettingItem.setAlpha(1.0f);
            LocationActivitySettingItem locationActivitySettingItem2 = this.f107702a;
            if (locationActivitySettingItem2 == null) {
                C7573i.m23583a("delegate");
            }
            locationActivitySettingItem2.setEnabled(true);
            return;
        }
        LocationActivitySettingItem locationActivitySettingItem3 = this.f107702a;
        if (locationActivitySettingItem3 == null) {
            C7573i.m23583a("delegate");
        }
        locationActivitySettingItem3.setAlpha(0.5f);
        LocationActivitySettingItem locationActivitySettingItem4 = this.f107702a;
        if (locationActivitySettingItem4 == null) {
            C7573i.m23583a("delegate");
        }
        locationActivitySettingItem4.setEnabled(false);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C7573i.m23587b(strArr, "permissions");
        C7573i.m23587b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback) {
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(linearLayout, "extensionWidgetContainer");
        C7573i.m23587b(aVPublishContentType, "contentType");
        C7573i.m23587b(publishOutput, "publishOutput");
        C7573i.m23587b(extensionMisc, "extensionMisc");
        C7573i.m23587b(callback, "callback");
        this.f107702a = m131985a(linearLayout);
        C0043i iVar = fragment;
        extensionMisc.getExtensionDataRepo().getLocationActivityVisible().observe(iVar, new C41391b(this));
        extensionMisc.getExtensionDataRepo().getLocationState().observe(iVar, new C41392c(this));
        extensionMisc.getExtensionDataRepo().setSetPoiActivity(new C41393d(this));
    }
}
