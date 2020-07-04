package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27535a;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27536b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.PhotoParam;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30981y;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity */
public class EmojiAddActivity extends AmeActivity implements C27535a {

    /* renamed from: a */
    public PhotoParam f80715a;

    /* renamed from: b */
    public boolean f80716b;

    /* renamed from: c */
    public C30981y f80717c = new C30981y() {
        /* renamed from: a */
        public final void mo18257a() {
        }

        /* renamed from: a */
        public final void mo18258a(double d) {
        }

        /* renamed from: a */
        public final void mo18259a(String str) {
            EmojiAddActivity.this.mo80690a(str);
        }

        /* renamed from: a */
        public final void mo18261a(Throwable th) {
            EmojiAddActivity.this.mo80690a(EmojiAddActivity.this.getString(R.string.bna));
        }

        /* renamed from: a */
        public final void mo18260a(String str, UrlModel urlModel) {
            if (urlModel == null) {
                EmojiAddActivity.this.mo80690a(EmojiAddActivity.this.getString(R.string.bna));
                return;
            }
            if (!C27536b.m90251a().mo70763a(EmojiAddActivity.this.f80715a.getPath(), str, urlModel.getUri())) {
                EmojiAddActivity.this.mo80690a("");
            }
        }
    };

    /* renamed from: d */
    private RemoteImageView f80718d;

    /* renamed from: e */
    private ImTextTitleBar f80719e;

    /* renamed from: a */
    public final void mo63139a(List<Emoji> list) {
    }

    /* renamed from: a */
    public final void mo63141a(List<Emoji> list, boolean z, String str) {
    }

    /* renamed from: b */
    public final void mo63142b(List<Emoji> list, boolean z, String str) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onDestroy() {
        super.onDestroy();
        C27536b.m90251a().mo70767b((C27535a) this);
    }

    /* renamed from: a */
    private void m100439a() {
        this.f80718d = (RemoteImageView) findViewById(R.id.cb9);
        this.f80719e = (ImTextTitleBar) findViewById(R.id.djz);
        this.f80719e.setOnTitlebarClickListener(new C31980a() {
            /* renamed from: a */
            public final void mo18096a() {
                EmojiAddActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo18097b() {
                if (!EmojiAddActivity.this.f80716b) {
                    EmojiAddActivity.this.f80716b = true;
                    EmojiAddActivity.this.showProgressDialog(EmojiAddActivity.this.getString(R.string.bj1));
                    C30842d.m100514a(EmojiAddActivity.this.f80715a, EmojiAddActivity.this.f80717c);
                }
            }
        });
        RemoteImageView remoteImageView = this.f80718d;
        StringBuilder sb = new StringBuilder("file://");
        sb.append(this.f80715a.getPath());
        C23323e.m76514a(remoteImageView, sb.toString());
        C27536b.m90251a().mo70757a((C27535a) this);
    }

    /* renamed from: a */
    public final void mo80690a(String str) {
        m100442a(str, true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("photo_param", this.f80715a);
    }

    /* renamed from: a */
    private void m100441a(Bundle bundle) {
        if (bundle != null) {
            this.f80715a = (PhotoParam) bundle.getSerializable("photo_param");
        } else {
            this.f80715a = (PhotoParam) getIntent().getSerializableExtra("photo_param");
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bi);
        C6956a.m21633b().setupStatusBar(this);
        m100441a(bundle);
        m100439a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m100440a(Activity activity, PhotoParam photoParam) {
        Intent intent = new Intent(activity, EmojiAddActivity.class);
        intent.putExtra("photo_param", photoParam);
        activity.startActivityForResult(intent, 17);
    }

    /* renamed from: a */
    private void m100442a(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && z) {
            C10761a.m31403c((Context) this, str).mo25750a();
        }
        C31858ad.m103406a();
        C31858ad.m103452b(false);
        dismissProgressDialog();
        this.f80716b = false;
    }

    /* renamed from: a */
    public final void mo63140a(List<Emoji> list, Emoji emoji, boolean z, String str) {
        if (z) {
            dismissProgressDialog();
            C31858ad.m103406a();
            C31858ad.m103452b(true);
            setResult(-1);
            finish();
            this.f80716b = false;
            return;
        }
        m100442a(str, false);
    }
}
