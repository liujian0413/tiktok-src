package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.collections.C7513am;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.C7577n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.ah */
public final class C40687ah {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f105815a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C40687ah.class), "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C40687ah.class), "stickerChallenge", "getStickerChallenge()Lcom/ss/android/ugc/aweme/infosticker/StickerChallenge;"))};

    /* renamed from: b */
    public final FragmentActivity f105816b;

    /* renamed from: c */
    private final C7541d f105817c = C7546e.m23569a(new C40689b(this));

    /* renamed from: d */
    private final C7541d f105818d = C7546e.m23569a(new C40690c(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.ah$a */
    static final class C40688a implements C40677a {

        /* renamed from: a */
        final /* synthetic */ C40687ah f105819a;

        /* renamed from: b */
        final /* synthetic */ Effect f105820b;

        C40688a(C40687ah ahVar, Effect effect) {
            this.f105819a = ahVar;
            this.f105820b = effect;
        }

        /* renamed from: a */
        public final void mo98222a(AVChallenge aVChallenge) {
            List stickerList = this.f105819a.mo100871b().getStickerList();
            String effectId = this.f105820b.getEffectId();
            C7573i.m23582a((Object) effectId, "effect.effectId");
            stickerList.add(effectId);
            this.f105819a.mo100871b().getStickerToChallenge().put(this.f105820b.getEffectId(), aVChallenge);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.ah$b */
    static final class C40689b extends Lambda implements C7561a<VideoPublishEditModel> {

        /* renamed from: a */
        final /* synthetic */ C40687ah f105821a;

        C40689b(C40687ah ahVar) {
            this.f105821a = ahVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public VideoPublishEditModel invoke() {
            return ((EditViewModel) C36113b.m116288a(this.f105821a.f105816b).mo91871a(EditViewModel.class)).mo29069f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.ah$c */
    static final class C40690c extends Lambda implements C7561a<StickerChallenge> {

        /* renamed from: a */
        final /* synthetic */ C40687ah f105822a;

        C40690c(C40687ah ahVar) {
            this.f105822a = ahVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StickerChallenge invoke() {
            if (this.f105822a.mo100867a().stickerChallenge == null) {
                return new StickerChallenge();
            }
            return this.f105822a.mo100867a().stickerChallenge;
        }
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo100867a() {
        return (VideoPublishEditModel) this.f105817c.getValue();
    }

    /* renamed from: b */
    public final StickerChallenge mo100871b() {
        return (StickerChallenge) this.f105818d.getValue();
    }

    /* renamed from: d */
    public final Collection<AVChallenge> mo100873d() {
        return mo100871b().getRecordStickerChallengeList();
    }

    /* renamed from: c */
    public final Collection<AVChallenge> mo100872c() {
        Collection<AVChallenge> values = mo100871b().getStickerToChallenge().values();
        C7573i.m23582a((Object) values, "stickerChallenge.stickerToChallenge.values");
        return values;
    }

    public C40687ah(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "context");
        this.f105816b = fragmentActivity;
    }

    /* renamed from: a */
    public final void mo100870a(List<? extends AVChallenge> list) {
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                mo100871b().getRecordStickerChallengeList().clear();
                mo100871b().getRecordStickerChallengeList().addAll(list);
            }
        }
    }

    /* renamed from: a */
    public final void mo100869a(String str) {
        Object obj;
        AVChallenge aVChallenge = (AVChallenge) mo100871b().getStickerToChallenge().get(str);
        if (aVChallenge != null) {
            Iterator it = mo100871b().getRecordStickerChallengeList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7573i.m23585a((Object) aVChallenge.challengeName, (Object) ((AVChallenge) obj).challengeName)) {
                    break;
                }
            }
            if (((AVChallenge) obj) == null) {
                mo100867a().removeChallengeFromTitleAndStruct(C7513am.m23407a(aVChallenge));
            }
        }
        Collection stickerList = mo100871b().getStickerList();
        if (stickerList != null) {
            C7577n.m23621b(stickerList).remove(str);
            if (!C7525m.m23496a((Iterable<? extends T>) mo100871b().getStickerList(), str)) {
                Map stickerToChallenge = mo100871b().getStickerToChallenge();
                if (stickerToChallenge != null) {
                    C7577n.m23626f(stickerToChallenge).remove(str);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    /* renamed from: a */
    public final void mo100868a(FragmentActivity fragmentActivity, Effect effect) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(effect, "effect");
        new C40692b(fragmentActivity, C40496bh.m129469n(effect)).mo100874a(new C40688a(this, effect));
    }
}
