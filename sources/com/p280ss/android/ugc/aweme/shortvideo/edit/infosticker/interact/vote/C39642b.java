package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.jedi.arch.JediViewModel;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C39608b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.C39652d.C39653a;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;
import kotlin.text.Regex;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b */
public final class C39642b extends C39608b {

    /* renamed from: A */
    private VoteStruct f103088A;

    /* renamed from: B */
    private final int f103089B;

    /* renamed from: C */
    private final int f103090C;

    /* renamed from: D */
    private final int f103091D;

    /* renamed from: E */
    private final int f103092E;

    /* renamed from: t */
    public String f103093t;

    /* renamed from: u */
    public VotingStickerLayout f103094u;

    /* renamed from: v */
    public boolean f103095v;

    /* renamed from: w */
    private final String f103096w = "poll_sticker_id";

    /* renamed from: x */
    private final String f103097x = "pi_start";

    /* renamed from: y */
    private final String f103098y = "pi_end";

    /* renamed from: z */
    private final String f103099z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$a */
    static final class C39643a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39642b f103100a;

        C39643a(C39642b bVar) {
            this.f103100a = bVar;
        }

        public final void run() {
            this.f103100a.f102894i.mo98822c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$b */
    static final class C39644b extends Lambda implements C7562b<VotingStickerView, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39642b f103101a;

        C39644b(C39642b bVar) {
            this.f103101a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m126961a((VotingStickerView) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m126961a(VotingStickerView votingStickerView) {
            this.f103101a.mo98933m();
            this.f103101a.mo98930a(votingStickerView);
            if (this.f103101a.f102894i != null && (this.f103101a.f102894i instanceof C39651c)) {
                this.f103101a.f102894i.post(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C39644b f103102a;

                    {
                        this.f103102a = r1;
                    }

                    public final void run() {
                        this.f103102a.f103101a.f102894i.mo98825d();
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$c */
    static final class C39646c extends Lambda implements C7562b<VotingStickerView, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39642b f103103a;

        /* renamed from: b */
        final /* synthetic */ VotingStickerLayout f103104b;

        C39646c(C39642b bVar, VotingStickerLayout votingStickerLayout) {
            this.f103103a = bVar;
            this.f103104b = votingStickerLayout;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m126962a((VotingStickerView) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m126962a(VotingStickerView votingStickerView) {
            if (this.f103103a.f102894i == null || !(this.f103103a.f102894i instanceof C39651c)) {
                VotingStickerLayout votingStickerLayout = this.f103103a.f103094u;
                if (votingStickerLayout != null) {
                    votingStickerLayout.mo98890a();
                }
            } else {
                InteractStickerBaseView interactStickerBaseView = this.f103103a.f102894i;
                if (interactStickerBaseView != null) {
                    float b = ((C39651c) interactStickerBaseView).mo98943b(votingStickerView);
                    VotingStickerLayout votingStickerLayout2 = this.f103104b;
                    if (votingStickerLayout2 != null) {
                        votingStickerLayout2.mo98891a(b);
                    }
                    VotingStickerLayout votingStickerLayout3 = this.f103103a.f103094u;
                    if (votingStickerLayout3 != null) {
                        votingStickerLayout3.mo98890a();
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$d */
    static final class C39647d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39642b f103105a;

        /* renamed from: b */
        final /* synthetic */ ObjectRef f103106b;

        /* renamed from: c */
        final /* synthetic */ ObjectRef f103107c;

        C39647d(C39642b bVar, ObjectRef objectRef, ObjectRef objectRef2) {
            this.f103105a = bVar;
            this.f103106b = objectRef;
            this.f103107c = objectRef2;
        }

        public final void run() {
            VotingStickerLayout votingStickerLayout = this.f103105a.f103094u;
            if (votingStickerLayout != null) {
                votingStickerLayout.mo98894a((VotingStickerView) this.f103106b.element, (C39641a) this.f103107c.element);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$e */
    static final class C39648e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39642b f103108a;

        /* renamed from: b */
        final /* synthetic */ InteractStickerStruct f103109b;

        C39648e(C39642b bVar, InteractStickerStruct interactStickerStruct) {
            this.f103108a = bVar;
            this.f103109b = interactStickerStruct;
        }

        public final void run() {
            C39642b.super.mo98734a(this.f103109b);
            InteractStickerBaseView interactStickerBaseView = this.f103108a.f102894i;
            C7573i.m23582a((Object) interactStickerBaseView, "mStickerView");
            interactStickerBaseView.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$f */
    public static final class C39649f extends C6597a<HashMap<String, String>> {
        C39649f() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$g */
    static final class C39650g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39642b f103110a;

        C39650g(C39642b bVar) {
            this.f103110a = bVar;
        }

        public final void run() {
            VotingStickerLayout votingStickerLayout = this.f103110a.f103094u;
            if (votingStickerLayout != null) {
                C39653a.m126970a(votingStickerLayout, null, null, 2, null);
            }
        }
    }

    /* renamed from: b */
    public final int mo98738b() {
        return R.string.akc;
    }

    /* renamed from: f */
    public final boolean mo98744f() {
        if (this.f103088A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void mo98931k() {
        VotingStickerLayout votingStickerLayout = this.f103094u;
        if (votingStickerLayout != null) {
            votingStickerLayout.f103052b = this.f103095v;
        }
    }

    /* renamed from: o */
    public final void mo98935o() {
        VotingStickerLayout votingStickerLayout = this.f103094u;
        if (votingStickerLayout != null) {
            votingStickerLayout.mo98895b();
        }
    }

    /* renamed from: q */
    private final String m126945q() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f103097x);
        sb.append(UUID.randomUUID().toString());
        sb.append(this.f103098y);
        return sb.toString();
    }

    public C39642b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f103097x);
        sb.append("(.*?)");
        sb.append(this.f103098y);
        this.f103099z = sb.toString();
        this.f103089B = 160;
        this.f103090C = 170;
        this.f103091D = 190;
        this.f103092E = 24;
    }

    /* renamed from: p */
    private final void m126944p() {
        this.f103095v = true;
        Context context = this.f102902q;
        if (!(context instanceof FragmentActivity)) {
            context = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity != null) {
            JediViewModel a = C36113b.m116288a(fragmentActivity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            ((EditViewModel) a).mo106443a(false, false);
        }
    }

    /* renamed from: j */
    public final InteractStickerStruct mo98758j() {
        InteractStickerStruct a = super.mo98728a(3);
        if (a == null) {
            return null;
        }
        a.setIndex(3);
        HashMap hashMap = new HashMap();
        hashMap.put(this.f103096w, this.f103093t);
        a.setAttr(C35563c.f93220B.getRetrofitFactoryGson().mo15979b((Object) hashMap));
        a.setIndex(1);
        a.setVoteStruct(this.f103088A);
        return a;
    }

    /* renamed from: l */
    public final void mo98932l() {
        if (this.f103088A != null) {
            mo98934n();
            return;
        }
        m126944p();
        VotingStickerLayout votingStickerLayout = this.f103094u;
        if (votingStickerLayout != null) {
            FrameLayout frameLayout = this.f102887b;
            C7573i.m23582a((Object) frameLayout, "mStickerParentLayout");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f102887b;
            C7573i.m23582a((Object) frameLayout2, "mStickerParentLayout");
            votingStickerLayout.mo98892a(height, (float) frameLayout2.getTop());
        }
        VotingStickerLayout votingStickerLayout2 = this.f103094u;
        if (votingStickerLayout2 != null) {
            votingStickerLayout2.post(new C39650g(this));
        }
    }

    /* renamed from: m */
    public final void mo98933m() {
        this.f103095v = false;
        Context context = this.f102902q;
        if (!(context instanceof FragmentActivity)) {
            context = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity != null) {
            JediViewModel a = C36113b.m116288a(fragmentActivity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            EditViewModel editViewModel = (EditViewModel) a;
            editViewModel.mo106443a(true, false);
            m126939a(editViewModel.mo29069f());
        }
    }

    /* renamed from: n */
    public final void mo98934n() {
        m126944p();
        VotingStickerLayout votingStickerLayout = this.f103094u;
        if (votingStickerLayout != null) {
            FrameLayout frameLayout = this.f102887b;
            C7573i.m23582a((Object) frameLayout, "mStickerParentLayout");
            float height = (float) frameLayout.getHeight();
            FrameLayout frameLayout2 = this.f102887b;
            C7573i.m23582a((Object) frameLayout2, "mStickerParentLayout");
            votingStickerLayout.mo98892a(height, (float) frameLayout2.getTop());
        }
        mo98743e();
        if (this.f102894i instanceof C39651c) {
            ObjectRef objectRef = new ObjectRef();
            InteractStickerBaseView interactStickerBaseView = this.f102894i;
            if (interactStickerBaseView != null) {
                objectRef.element = ((C39651c) interactStickerBaseView).getBaseView();
                InteractStickerBaseView interactStickerBaseView2 = this.f102894i;
                if (interactStickerBaseView2 != null) {
                    ((C39651c) interactStickerBaseView2).mo98753a();
                    ObjectRef objectRef2 = new ObjectRef();
                    C39641a aVar = new C39641a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
                    objectRef2.element = aVar;
                    ((C39641a) objectRef2.element).f103087f = ((VotingStickerView) objectRef.element).getLastTouchedIndex();
                    C39641a aVar2 = (C39641a) objectRef2.element;
                    InteractStickerBaseView interactStickerBaseView3 = this.f102894i;
                    C7573i.m23582a((Object) interactStickerBaseView3, "mStickerView");
                    aVar2.f103084c = C39608b.m126723b(interactStickerBaseView3.getRotateAngle());
                    C39641a aVar3 = (C39641a) objectRef2.element;
                    InteractStickerBaseView interactStickerBaseView4 = this.f102894i;
                    C7573i.m23582a((Object) interactStickerBaseView4, "mStickerView");
                    View contentView = interactStickerBaseView4.getContentView();
                    C7573i.m23582a((Object) contentView, "mStickerView.contentView");
                    aVar3.f103082a = contentView.getScaleX();
                    C39641a aVar4 = (C39641a) objectRef2.element;
                    InteractStickerBaseView interactStickerBaseView5 = this.f102894i;
                    C7573i.m23582a((Object) interactStickerBaseView5, "mStickerView");
                    View contentView2 = interactStickerBaseView5.getContentView();
                    C7573i.m23582a((Object) contentView2, "mStickerView.contentView");
                    aVar4.f103083b = contentView2.getScaleY();
                    C39641a aVar5 = (C39641a) objectRef2.element;
                    InteractStickerBaseView interactStickerBaseView6 = this.f102894i;
                    C7573i.m23582a((Object) interactStickerBaseView6, "mStickerView");
                    View contentView3 = interactStickerBaseView6.getContentView();
                    C7573i.m23582a((Object) contentView3, "mStickerView.contentView");
                    float x = contentView3.getX();
                    FrameLayout frameLayout3 = this.f102887b;
                    C7573i.m23582a((Object) frameLayout3, "mStickerParentLayout");
                    aVar5.f103085d = x + frameLayout3.getX();
                    C39641a aVar6 = (C39641a) objectRef2.element;
                    InteractStickerBaseView interactStickerBaseView7 = this.f102894i;
                    C7573i.m23582a((Object) interactStickerBaseView7, "mStickerView");
                    View contentView4 = interactStickerBaseView7.getContentView();
                    C7573i.m23582a((Object) contentView4, "mStickerView.contentView");
                    float y = contentView4.getY();
                    FrameLayout frameLayout4 = this.f102887b;
                    C7573i.m23582a((Object) frameLayout4, "mStickerParentLayout");
                    aVar6.f103086e = y + frameLayout4.getY();
                    VotingStickerLayout votingStickerLayout2 = this.f103094u;
                    if (votingStickerLayout2 != null) {
                        votingStickerLayout2.post(new C39647d(this, objectRef, objectRef2));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
            }
        }
    }

    /* renamed from: a */
    public final InteractStickerBaseView mo98727a(Context context) {
        C7573i.m23587b(context, "context");
        return m126941b(context);
    }

    /* renamed from: b */
    private static C39651c m126941b(Context context) {
        C39651c cVar = new C39651c(context);
        cVar.setLockMode(true);
        cVar.setLayoutParams(new LayoutParams(-1, -1));
        return cVar;
    }

    /* renamed from: a */
    public final boolean mo98737a(InteractStickerBaseView interactStickerBaseView) {
        C7573i.m23587b(interactStickerBaseView, "view");
        if (interactStickerBaseView instanceof C39651c) {
            super.mo98737a(interactStickerBaseView);
            this.f103088A = null;
        }
        return false;
    }

    /* renamed from: b */
    private final String m126942b(String str) {
        return new Regex(this.f103099z).replace((CharSequence) str, m126945q());
    }

    /* renamed from: a */
    private void m126939a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "model");
        C6907h.m21524a("poll_edit_complete", (Map) C22984d.m75611a().mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("shoot_way", videoPublishEditModel.mShootWay).mo59973a("content_type", C39500av.m126133a(videoPublishEditModel)).mo59973a("content_source", C39500av.m126142b(videoPublishEditModel)).mo59973a("enter_from", "video_edit_page").mo59973a("prop_id", this.f103093t).f60753a);
    }

    /* renamed from: b */
    private final void m126943b(InteractStickerStruct interactStickerStruct) {
        this.f103088A = interactStickerStruct.getVoteStruct();
        mo98740b(true);
        InteractStickerBaseView interactStickerBaseView = this.f102894i;
        if (interactStickerBaseView != null) {
            ((C39651c) interactStickerBaseView).mo98942a(this.f103088A);
            InteractStickerBaseView interactStickerBaseView2 = this.f102894i;
            C7573i.m23582a((Object) interactStickerBaseView2, "mStickerView");
            interactStickerBaseView2.setVisibility(4);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
    }

    /* renamed from: a */
    public final void mo98930a(VotingStickerView votingStickerView) {
        VoteStruct voteStruct;
        if (this.f102894i == null) {
            mo98740b(false);
        }
        if (this.f102894i instanceof C39651c) {
            if (votingStickerView != null) {
                voteStruct = votingStickerView.getVoteStruct();
            } else {
                voteStruct = null;
            }
            this.f103088A = voteStruct;
            if (votingStickerView != null) {
                votingStickerView.mo98912b();
            }
            InteractStickerBaseView interactStickerBaseView = this.f102894i;
            if (interactStickerBaseView != null) {
                ((C39651c) interactStickerBaseView).mo98941a(votingStickerView);
                this.f102894i.post(new C39643a(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
        }
    }

    /* renamed from: a */
    public final void mo98734a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            m126943b(interactStickerStruct);
            this.f103093t = (String) ((HashMap) C35563c.f93220B.getRetrofitFactoryGson().mo15975a(interactStickerStruct.getAttr(), new C39649f().type)).get(this.f103096w);
        }
        if (this.f102894i != null) {
            this.f102894i.postDelayed(new C39648e(this, interactStickerStruct), 300);
        }
    }

    /* renamed from: a */
    public final void mo98735a(String str) {
        C7573i.m23587b(str, "stickerPath");
        if (!C6319n.m19593a(str)) {
            CharSequence charSequence = str;
            if (!C7634n.m23776c(charSequence, (CharSequence) this.f103097x, false) || !C7634n.m23776c(charSequence, (CharSequence) this.f103098y, false)) {
                String str2 = File.separator;
                C7573i.m23582a((Object) str2, "File.separator");
                if (C7634n.m23723c(str, str2, false)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(m126945q());
                    super.mo98735a(sb.toString());
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(m126945q());
                super.mo98735a(sb2.toString());
            } else {
                super.mo98735a(m126942b(str));
            }
        }
    }

    /* renamed from: a */
    public final void mo98929a(Activity activity, VotingStickerLayout votingStickerLayout) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(votingStickerLayout, "votingStickerLayout");
        this.f103094u = votingStickerLayout;
        VotingStickerLayout votingStickerLayout2 = this.f103094u;
        if (votingStickerLayout2 != null) {
            votingStickerLayout2.mo98893a(activity);
        }
        VotingStickerLayout votingStickerLayout3 = this.f103094u;
        if (votingStickerLayout3 != null) {
            votingStickerLayout3.setOnCompleteListener(new C39644b(this));
        }
        VotingStickerLayout votingStickerLayout4 = this.f103094u;
        if (votingStickerLayout4 != null) {
            votingStickerLayout4.setBeforeChangeListener(new C39646c(this, votingStickerLayout));
        }
    }

    /* renamed from: a */
    public final void mo98732a(C15389d dVar, boolean z) {
        super.mo98732a(dVar, z);
        if (dVar != null) {
            float f = (float) dVar.mo38828c().f116386b;
            FrameLayout frameLayout = this.f102887b;
            C7573i.m23582a((Object) frameLayout, "mStickerParentLayout");
            if (f > C9738o.m28708b(frameLayout.getContext(), (float) (this.f103091D + this.f103092E))) {
                VotingStickerLayout votingStickerLayout = this.f103094u;
                if (votingStickerLayout != null) {
                    votingStickerLayout.setMaxLine(3);
                }
            } else {
                FrameLayout frameLayout2 = this.f102887b;
                C7573i.m23582a((Object) frameLayout2, "mStickerParentLayout");
                if (f > C9738o.m28708b(frameLayout2.getContext(), (float) (this.f103090C + this.f103092E))) {
                    VotingStickerLayout votingStickerLayout2 = this.f103094u;
                    if (votingStickerLayout2 != null) {
                        votingStickerLayout2.setMaxLine(2);
                    }
                } else {
                    FrameLayout frameLayout3 = this.f102887b;
                    C7573i.m23582a((Object) frameLayout3, "mStickerParentLayout");
                    if (f > C9738o.m28708b(frameLayout3.getContext(), (float) (this.f103089B + this.f103092E))) {
                        VotingStickerLayout votingStickerLayout3 = this.f103094u;
                        if (votingStickerLayout3 != null) {
                            votingStickerLayout3.setMaxLine(1);
                        }
                    }
                }
            }
        }
    }
}
