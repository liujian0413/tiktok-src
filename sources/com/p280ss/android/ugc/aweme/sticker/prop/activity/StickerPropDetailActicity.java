package com.p280ss.android.ugc.aweme.sticker.prop.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.sticker.prop.fragment.StickerPropDetailFragment;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity */
public class StickerPropDetailActicity extends AmeSSActivity {

    /* renamed from: a */
    private List<String> f108881a = new ArrayList();

    /* renamed from: b */
    private String f108882b;

    /* renamed from: c */
    private String f108883c;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        if (C6399b.m19946v()) {
            C10994a.m32205a((Activity) this);
            C43098ej.m136714b(this);
            return;
        }
        C7212bb.m22494a((Activity) this);
    }

    /* renamed from: a */
    private void m133128a() {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74858a();
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).setStatusBar(this, findViewById(R.id.dal));
        String stringExtra = getIntent().getStringExtra("extra_log_pb");
        this.f108882b = getIntent().getStringExtra("aweme_id");
        this.f108883c = getIntent().getStringExtra("extra_music_from");
        AVMusic aVMusic = (AVMusic) getIntent().getSerializableExtra("sticker_music");
        Serializable serializableExtra = getIntent().getSerializableExtra("music_model");
        getIntent().getStringExtra("sticker_id");
        getIntent().getStringExtra("from_token");
        ArrayList stringArrayListExtra = getIntent().getStringArrayListExtra("extra_stickers");
        if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
            stringArrayListExtra = new ArrayList();
            String stringExtra2 = getIntent().getStringExtra("id");
            if (!TextUtils.isEmpty(stringExtra2)) {
                String[] split = stringExtra2.split(",");
                if (split.length > 0) {
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            stringArrayListExtra.add(str);
                        }
                    }
                }
            }
        }
        ArrayList arrayList = stringArrayListExtra;
        if (arrayList == null || arrayList.size() == 0) {
            finish();
            return;
        }
        this.f108881a.addAll(arrayList);
        C0608j supportFragmentManager = getSupportFragmentManager();
        C0633q a = supportFragmentManager.mo2645a();
        Fragment a2 = supportFragmentManager.mo2644a("sticker_prop_detail_fragment_tag");
        String stringExtra3 = getIntent().getStringExtra("extra_sticker_from");
        if (a2 == null) {
            a2 = StickerPropDetailFragment.m133151a(arrayList, this.f108882b, this.f108883c, stringExtra3, stringExtra, aVMusic, serializableExtra);
        }
        a2.setUserVisibleHint(true);
        a.mo2600b(R.id.a19, a2, "sticker_prop_detail_fragment_tag");
        a.mo2604c();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ba);
        findViewById(R.id.a19).setBackgroundColor(getResources().getColor(R.color.a7f));
        m133128a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m133131a(Context context, ArrayList<String> arrayList) {
        context.startActivity(m133132b(context, null, null, null, arrayList, "reuse"));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }

    /* renamed from: a */
    public static void m133129a(Context context, String str, AVMusic aVMusic, Serializable serializable, ArrayList<String> arrayList) {
        context.startActivity(m133132b(context, null, null, null, arrayList, "reuse"));
    }

    /* renamed from: a */
    public static void m133130a(Context context, String str, AVMusic aVMusic, Serializable serializable, ArrayList<String> arrayList, String str2) {
        Intent b = m133132b(context, str, aVMusic, serializable, arrayList, "reuse");
        b.putExtra("extra_log_pb", str2);
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(b, 10086);
        } else {
            context.startActivity(b);
        }
    }

    /* renamed from: b */
    private static Intent m133132b(Context context, String str, AVMusic aVMusic, Serializable serializable, ArrayList<String> arrayList, String str2) {
        Intent intent = new Intent(context, StickerPropDetailActicity.class);
        if (str != null) {
            intent.putExtra("aweme_id", str);
        }
        if (aVMusic != null) {
            intent.putExtra("sticker_music", aVMusic);
        }
        if (serializable != null) {
            intent.putExtra("music_model", serializable);
        }
        intent.putExtra("extra_sticker_from", str2);
        intent.putExtra("extra_stickers", arrayList);
        return intent;
    }
}
