package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel */
public final class InteractStickerViewModel extends C0063u {

    /* renamed from: a */
    public C0043i f106093a;

    /* renamed from: b */
    private final HashMap<String, Object> f106094b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, C23084b<C23083a>> f106095c = new HashMap<>();

    /* renamed from: d */
    private Thread f106096d;

    /* renamed from: e */
    private final Handler f106097e = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel$a */
    static final class C40797a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InteractStickerViewModel f106098a;

        /* renamed from: b */
        final /* synthetic */ String f106099b;

        /* renamed from: c */
        final /* synthetic */ Object f106100c;

        C40797a(InteractStickerViewModel interactStickerViewModel, String str, Object obj) {
            this.f106098a = interactStickerViewModel;
            this.f106099b = str;
            this.f106100c = obj;
        }

        public final void run() {
            this.f106098a.mo101067a(this.f106099b, this.f106100c);
        }
    }

    public final void onCleared() {
        this.f106094b.clear();
        this.f106095c.clear();
        this.f106093a = null;
    }

    /* renamed from: a */
    private final boolean m130381a() {
        if (this.f106096d == null) {
            this.f106096d = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f106096d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final C23084b<C23083a> m130382b(String str) {
        C23084b<C23083a> bVar = (C23084b) this.f106095c.get(str);
        if (bVar == null) {
            bVar = new C23084b<>();
            if (this.f106094b.containsKey(str)) {
                bVar.setValue(new C23083a(str, this.f106094b.get(str)));
            }
            this.f106095c.put(str, bVar);
        }
        return bVar;
    }

    /* renamed from: a */
    public final <T> T mo101068a(String str) {
        C7573i.m23587b(str, "key");
        T t = this.f106094b.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    public final InteractStickerViewModel mo101066a(String str, C0053p<C23083a> pVar) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(pVar, "observer");
        return m130380a(str, pVar, false);
    }

    /* renamed from: a */
    public final InteractStickerViewModel mo101067a(String str, Object obj) {
        C7573i.m23587b(str, "key");
        if (!m130381a()) {
            this.f106097e.post(new C40797a(this, str, obj));
            return this;
        }
        this.f106094b.put(str, obj);
        C23084b bVar = (C23084b) this.f106095c.get(str);
        if (bVar != null) {
            bVar.setValue(new C23083a(str, obj));
        }
        return this;
    }

    /* renamed from: a */
    private InteractStickerViewModel m130380a(String str, C0053p<C23083a> pVar, boolean z) {
        C7573i.m23587b(str, "key");
        if (TextUtils.isEmpty(str) || pVar == null) {
            return this;
        }
        C23084b b = m130382b(str);
        C0043i iVar = this.f106093a;
        if (iVar == null) {
            C7573i.m23580a();
        }
        b.mo60162a(iVar, pVar, false);
        return this;
    }
}
