package com.p280ss.android.ugc.aweme.p313im.sdk.abtest;

import android.content.Context;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30803b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30804c.C30818a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30804c.C30819b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.audio.widget.AudioRecordBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.view.MentionEditText.C31007e;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.e */
public final class C30570e implements C30803b {

    /* renamed from: a */
    public C30803b f80276a;

    /* renamed from: b */
    private Context f80277b;

    /* renamed from: a */
    public final void mo80323a(int i) {
    }

    /* renamed from: a */
    public final void mo80325a(C30818a aVar) {
    }

    /* renamed from: a */
    public final void mo80326a(C30819b bVar) {
    }

    /* renamed from: a */
    public final void mo80327a(C31007e eVar) {
    }

    /* renamed from: a */
    public final void mo80328a(String str) {
    }

    /* renamed from: a */
    public final void mo80329a(String str, String str2) {
    }

    /* renamed from: a */
    public final void mo80330a(List<MediaModel> list, boolean z) {
    }

    /* renamed from: b */
    public final void mo80331b() {
    }

    /* renamed from: b */
    public final void mo80332b(int i) {
    }

    /* renamed from: c */
    public final boolean mo80334c() {
        return false;
    }

    /* renamed from: d */
    public final void mo80335d() {
    }

    /* renamed from: e */
    public final AudioRecordBar mo80336e() {
        return null;
    }

    public final void ba_() {
        new C6928b(this.f80277b, new C6943d() {
            public final void sendMsg() {
                C30570e.this.f80276a.ba_();
            }
        }).sendMsg();
    }

    /* renamed from: a */
    public final void mo80324a(final C27517a aVar) {
        new C6928b(this.f80277b, new C6943d() {
            public final void sendMsg() {
                C30570e.this.f80276a.mo80324a(aVar);
            }
        }).sendMsg();
    }

    public C30570e(C30803b bVar, Context context) {
        this.f80276a = bVar;
        this.f80277b = context;
    }
}
