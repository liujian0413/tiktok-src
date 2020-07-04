package com.p280ss.android.ugc.aweme.emoji.p1205c;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.emoji.miniemojichoose.C27603a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.emoji.c.c */
public final class C27527c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f72569a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27527c.class), "inputView", "getInputView()Lcom/ss/android/ugc/aweme/emoji/lastedemoji/MiniEmojiInputViewImpl;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C27527c.class), "emojiChoosePanel", "getEmojiChoosePanel()Lcom/ss/android/ugc/aweme/emoji/miniemojichoose/MiniEmojiChoosePanel;"))};

    /* renamed from: b */
    public final C27526b f72570b;

    /* renamed from: c */
    private final C7541d f72571c = C27530d.m90232a(new C27529b(this));

    /* renamed from: d */
    private final C7541d f72572d = C27530d.m90232a(new C27528a(this));

    /* renamed from: com.ss.android.ugc.aweme.emoji.c.c$a */
    static final class C27528a extends Lambda implements C7561a<C27603a> {

        /* renamed from: a */
        final /* synthetic */ C27527c f72573a;

        C27528a(C27527c cVar) {
            this.f72573a = cVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C27603a invoke() {
            return new C27603a(this.f72573a.mo70748a(), this.f72573a.f72570b.f72564a, C27532f.f72580b.mo70750a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.c.c$b */
    static final class C27529b extends Lambda implements C7561a<C27531e> {

        /* renamed from: a */
        final /* synthetic */ C27527c f72574a;

        C27529b(C27527c cVar) {
            this.f72574a = cVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C27531e invoke() {
            return new C27531e(this.f72574a.f72570b.f72565b, this.f72574a.f72570b.f72566c, this.f72574a.f72570b.f72567d, this.f72574a.f72570b.f72568e);
        }
    }

    /* renamed from: c */
    private final C27603a m90227c() {
        return (C27603a) this.f72572d.getValue();
    }

    /* renamed from: a */
    public final C27531e mo70748a() {
        return (C27531e) this.f72571c.getValue();
    }

    /* renamed from: b */
    public final void mo70749b() {
        m90227c().mo70735a().setBackgroundColor(C6399b.m19921a().getResources().getColor(R.color.ac4));
        this.f72570b.f72564a.addView(m90227c().mo70735a());
    }

    public C27527c(C27526b bVar) {
        C7573i.m23587b(bVar, "payload");
        this.f72570b = bVar;
    }
}
