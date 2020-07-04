package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40949u.C40951b;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerBaseViewHolder */
public class EffectStickerBaseViewHolder extends C1293v implements C40951b {

    /* renamed from: h */
    protected static final String f104774h = f104774h;

    /* renamed from: i */
    public static final C40341a f104775i = new C40341a(null);

    /* renamed from: a */
    protected StickerWrapper f104776a;

    /* renamed from: b */
    public AVDmtImageTextView f104777b;

    /* renamed from: c */
    public Context f104778c;

    /* renamed from: d */
    public int f104779d;

    /* renamed from: e */
    public View f104780e;

    /* renamed from: f */
    public EffectStickerManager f104781f;

    /* renamed from: g */
    public List<? extends StickerWrapper> f104782g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerBaseViewHolder$a */
    public static final class C40341a {
        private C40341a() {
        }

        public /* synthetic */ C40341a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public void mo100195a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final StickerWrapper mo100202b() {
        StickerWrapper stickerWrapper = this.f104776a;
        if (stickerWrapper == null) {
            C7573i.m23583a("stickerWrapper");
        }
        return stickerWrapper;
    }

    /* renamed from: c */
    public final void mo100205c() {
        AVDmtImageTextView aVDmtImageTextView = this.f104777b;
        StickerWrapper stickerWrapper = this.f104776a;
        if (stickerWrapper == null) {
            C7573i.m23583a("stickerWrapper");
        }
        int i = stickerWrapper.f104910c;
        StickerWrapper stickerWrapper2 = this.f104776a;
        if (stickerWrapper2 == null) {
            C7573i.m23583a("stickerWrapper");
        }
        aVDmtImageTextView.mo103495a(i, stickerWrapper2.f104912e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100198a(Context context) {
        C7573i.m23587b(context, "<set-?>");
        this.f104778c = context;
    }

    /* renamed from: b */
    public final void mo100204b(boolean z) {
        this.f104777b.mo103510d(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100199a(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f104780e = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100200a(StickerWrapper stickerWrapper) {
        C7573i.m23587b(stickerWrapper, "<set-?>");
        this.f104776a = stickerWrapper;
    }

    /* renamed from: a */
    public void mo100186a(Effect effect) {
        C7573i.m23587b(effect, "effect");
        CharSequence effectId = effect.getEffectId();
        StickerWrapper stickerWrapper = this.f104776a;
        if (stickerWrapper == null) {
            C7573i.m23583a("stickerWrapper");
        }
        Effect effect2 = stickerWrapper.f104908a;
        C7573i.m23582a((Object) effect2, "this.stickerWrapper.effect");
        if (TextUtils.equals(effectId, effect2.getEffectId())) {
            StickerWrapper stickerWrapper2 = this.f104776a;
            if (stickerWrapper2 == null) {
                C7573i.m23583a("stickerWrapper");
            }
            stickerWrapper2.f104910c = 2;
            this.f104777b.mo103511e();
        }
    }

    /* renamed from: b */
    public final void mo100203b(StickerWrapper stickerWrapper) {
        if (stickerWrapper != null) {
            StickerWrapper stickerWrapper2 = this.f104776a;
            if (stickerWrapper2 == null) {
                C7573i.m23583a("stickerWrapper");
            }
            stickerWrapper2.f104910c = stickerWrapper.f104910c;
            mo100205c();
            EffectStickerManager effectStickerManager = this.f104781f;
            if (effectStickerManager != null) {
                StickerWrapper stickerWrapper3 = this.f104776a;
                if (stickerWrapper3 == null) {
                    C7573i.m23583a("stickerWrapper");
                }
                if (effectStickerManager.mo100230c(stickerWrapper3.f104908a)) {
                    mo100201a(true);
                    EffectStickerManager effectStickerManager2 = this.f104781f;
                    if (effectStickerManager2 != null) {
                        StickerWrapper stickerWrapper4 = this.f104776a;
                        if (stickerWrapper4 == null) {
                            C7573i.m23583a("stickerWrapper");
                        }
                        effectStickerManager2.mo100232d(stickerWrapper4.f104908a);
                    }
                    return;
                }
            }
            mo100201a(false);
        }
    }

    /* renamed from: b */
    public void mo100188b(Effect effect) {
        C7573i.m23587b(effect, "effect");
        CharSequence effectId = effect.getEffectId();
        StickerWrapper stickerWrapper = this.f104776a;
        if (stickerWrapper == null) {
            C7573i.m23583a("stickerWrapper");
        }
        Effect effect2 = stickerWrapper.f104908a;
        C7573i.m23582a((Object) effect2, "this.stickerWrapper.effect");
        if (TextUtils.equals(effectId, effect2.getEffectId())) {
            StickerWrapper stickerWrapper2 = this.f104776a;
            if (stickerWrapper2 == null) {
                C7573i.m23583a("stickerWrapper");
            }
            stickerWrapper2.f104911d = true;
            StickerWrapper stickerWrapper3 = this.f104776a;
            if (stickerWrapper3 == null) {
                C7573i.m23583a("stickerWrapper");
            }
            stickerWrapper3.f104910c = 1;
            this.f104777b.mo103509d();
        }
    }

    /* renamed from: a */
    public final void mo100201a(boolean z) {
        this.f104777b.mo103501a(z);
    }

    /* renamed from: a */
    public void mo100196a(Effect effect, int i) {
        C7573i.m23587b(effect, "effect");
        StickerWrapper stickerWrapper = this.f104776a;
        if (stickerWrapper == null) {
            C7573i.m23583a("stickerWrapper");
        }
        stickerWrapper.f104910c = 5;
        StickerWrapper stickerWrapper2 = this.f104776a;
        if (stickerWrapper2 == null) {
            C7573i.m23583a("stickerWrapper");
        }
        stickerWrapper2.f104912e = i;
        CharSequence effectId = effect.getEffectId();
        StickerWrapper stickerWrapper3 = this.f104776a;
        if (stickerWrapper3 == null) {
            C7573i.m23583a("stickerWrapper");
        }
        Effect effect2 = stickerWrapper3.f104908a;
        C7573i.m23582a((Object) effect2, "this.stickerWrapper.effect");
        if (TextUtils.equals(effectId, effect2.getEffectId())) {
            this.f104777b.mo103494a(i);
        }
    }

    /* renamed from: a */
    public void mo100187a(Effect effect, C43726c cVar) {
        C7573i.m23587b(effect, "effect");
        C7573i.m23587b(cVar, "e");
        CharSequence effectId = effect.getEffectId();
        StickerWrapper stickerWrapper = this.f104776a;
        if (stickerWrapper == null) {
            C7573i.m23583a("stickerWrapper");
        }
        Effect effect2 = stickerWrapper.f104908a;
        C7573i.m23582a((Object) effect2, "this.stickerWrapper.effect");
        if (TextUtils.equals(effectId, effect2.getEffectId())) {
            StickerWrapper stickerWrapper2 = this.f104776a;
            if (stickerWrapper2 == null) {
                C7573i.m23583a("stickerWrapper");
            }
            stickerWrapper2.f104910c = 3;
            this.f104777b.mo103513f();
        }
    }

    public EffectStickerBaseViewHolder(View view, EffectStickerManager effectStickerManager, List<? extends StickerWrapper> list) {
        C7573i.m23587b(view, "mItemView");
        super(view);
        this.f104780e = view;
        this.f104781f = effectStickerManager;
        this.f104782g = list;
        View findViewById = this.f104780e.findViewById(R.id.db2);
        C7573i.m23582a((Object) findViewById, "mItemView.findViewById(R.id.sticker_img_view)");
        this.f104777b = (AVDmtImageTextView) findViewById;
        Context context = this.f104780e.getContext();
        C7573i.m23582a((Object) context, "mItemView.context");
        this.f104778c = context;
        this.f104777b.setShowDownloadIcon(true);
    }
}
