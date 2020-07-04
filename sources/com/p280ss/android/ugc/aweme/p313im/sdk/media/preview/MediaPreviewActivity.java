package com.p280ss.android.ugc.aweme.p313im.sdk.media.preview;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.BaseContainerActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseResult;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.model.MediaPreviewSettings;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.p1333a.C31449a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.p1334b.C31454b;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewmodel.MediaPreviewViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewmodel.MediaPreviewViewModel.C31467a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity */
public final class MediaPreviewActivity extends BaseContainerActivity {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82322a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaPreviewActivity.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/sdk/media/preview/viewmodel/MediaPreviewViewModel;"))};

    /* renamed from: b */
    public static final C31434a f82323b = new C31434a(null);

    /* renamed from: c */
    private final C7541d f82324c = C7546e.m23569a(new C31435b(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity$a */
    public static final class C31434a {
        private C31434a() {
        }

        public /* synthetic */ C31434a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m102250a(Activity activity, MediaPreviewSettings mediaPreviewSettings, int i) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(mediaPreviewSettings, "settings");
            Intent intent = new Intent(activity, MediaPreviewActivity.class);
            intent.putExtra("extra_preview_settings", mediaPreviewSettings);
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity$b */
    static final class C31435b extends Lambda implements C7561a<MediaPreviewViewModel> {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewActivity f82325a;

        C31435b(MediaPreviewActivity mediaPreviewActivity) {
            this.f82325a = mediaPreviewActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MediaPreviewViewModel invoke() {
            return C31467a.m102346a(this.f82325a);
        }
    }

    /* renamed from: c */
    private final MediaPreviewViewModel m102246c() {
        return (MediaPreviewViewModel) this.f82324c.getValue();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.preview.MediaPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        mo82037a(false);
    }

    /* renamed from: a */
    public final void mo81547a() {
        Serializable serializable;
        Intent intent = getIntent();
        if (intent != null) {
            serializable = intent.getSerializableExtra("extra_preview_settings");
        } else {
            serializable = null;
        }
        if (serializable instanceof MediaPreviewSettings) {
            MediaPreviewSettings mediaPreviewSettings = (MediaPreviewSettings) serializable;
            m102246c().mo82088a(mediaPreviewSettings);
            m102246c().f82289d = mediaPreviewSettings.getSendRaw();
        }
        C31449a a = C31454b.m102296a();
        if (a != null) {
            m102246c().f82395h = a;
        }
    }

    /* renamed from: b */
    public final Fragment mo81548b() {
        AmeBaseFragment mediaPreviewFragment;
        if (m102246c().f82394g.isChooseMode()) {
            mediaPreviewFragment = new MediaPreviewChooseFragment();
        } else {
            mediaPreviewFragment = new MediaPreviewFragment();
        }
        AmeBaseFragment ameBaseFragment = mediaPreviewFragment;
        MediaPreviewViewModel c = m102246c();
        Lifecycle lifecycle = ameBaseFragment.getLifecycle();
        C7573i.m23582a((Object) lifecycle, "fragment.lifecycle");
        c.mo82087a(lifecycle);
        return ameBaseFragment;
    }

    /* renamed from: a */
    public final void mo82037a(boolean z) {
        int i;
        if (m102246c().f82394g.isChooseMode()) {
            Intent intent = new Intent();
            if (z) {
                i = 2012;
            } else {
                i = 2011;
            }
            ArrayList arrayList = new ArrayList();
            List list = (List) m102246c().mo82000b().getValue();
            if (list != null) {
                arrayList.addAll(list);
            }
            if (z && arrayList.isEmpty()) {
                MediaModel mediaModel = (MediaModel) m102246c().mo82089o().getValue();
                if (mediaModel != null) {
                    MediaPreviewViewModel c = m102246c();
                    C7573i.m23582a((Object) mediaModel, "it");
                    if (c.mo81999b(mediaModel) == -2) {
                        C10761a.m31399c((Context) this, (int) R.string.bhr).mo25750a();
                        return;
                    }
                    arrayList.add(mediaModel);
                }
            }
            intent.putExtra("extra_choose_result", new MediaChooseResult(m102246c().f82289d, arrayList));
            setResult(i, intent);
        }
        finish();
    }
}
