package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40723e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40725g;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1612e.C40754e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment.C40764b;
import com.p280ss.android.ugc.aweme.sticker.C41850e;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g */
public final class C40783g extends C40769a {

    /* renamed from: i */
    public C40787h f106045i;

    /* renamed from: j */
    public final C40754e f106046j;

    /* renamed from: k */
    public final C40725g f106047k;

    /* renamed from: l */
    private VoteBottomSheetDialogFragment f106048l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$a */
    static final class C40784a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40783g f106049a;

        C40784a(C40783g gVar) {
            this.f106049a = gVar;
        }

        public final void run() {
            float f;
            C40754e eVar = this.f106049a.f106046j;
            C40787h hVar = this.f106049a.f106045i;
            if (hVar == null) {
                C7573i.m23580a();
            }
            View voteView = hVar.getVoteView();
            List a = C40707a.m130162a(this.f106049a.f106014c);
            if (a != null) {
                NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) a.get(0);
                if (normalTrackTimeStamp != null) {
                    Float scale = normalTrackTimeStamp.getScale();
                    if (scale != null) {
                        f = scale.floatValue();
                        eVar.mo100984a(voteView, f);
                    }
                }
            }
            f = 1.0f;
            eVar.mo100984a(voteView, f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$b */
    public static final class C40785b implements C40764b {

        /* renamed from: a */
        final /* synthetic */ C40783g f106050a;

        C40785b(C40783g gVar) {
            this.f106050a = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$c */
    static final class C40786c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40783g f106051a;

        /* renamed from: b */
        final /* synthetic */ C40787h f106052b;

        /* renamed from: c */
        final /* synthetic */ C41850e f106053c;

        C40786c(C40783g gVar, C40787h hVar, C41850e eVar) {
            this.f106051a = gVar;
            this.f106052b = hVar;
            this.f106053c = eVar;
        }

        public final void run() {
            VoteStruct voteStruct;
            float f;
            C40787h hVar = this.f106052b;
            InteractStickerStruct interactStickerStruct = this.f106051a.f106014c;
            if (interactStickerStruct != null) {
                voteStruct = interactStickerStruct.getVoteStruct();
            } else {
                voteStruct = null;
            }
            boolean r = C43122ff.m136787r(this.f106053c.f108850c);
            String str = this.f106053c.f108851d;
            if (str == null) {
                str = "";
            }
            hVar.mo101033a(voteStruct, r, str, this.f106053c.f108860m, this.f106051a.mo100903d());
            C40754e eVar = this.f106051a.f106046j;
            View voteView = this.f106052b.getVoteView();
            List a = C40707a.m130162a(this.f106051a.f106014c);
            if (a != null) {
                NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) a.get(0);
                if (normalTrackTimeStamp != null) {
                    Float scale = normalTrackTimeStamp.getScale();
                    if (scale != null) {
                        f = scale.floatValue();
                        eVar.mo100984a(voteView, f);
                        this.f106052b.postInvalidate();
                    }
                }
            }
            f = 1.0f;
            eVar.mo100984a(voteView, f);
            this.f106052b.postInvalidate();
        }
    }

    /* renamed from: c */
    public final int mo100902c() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r3 == null) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101011e() {
        /*
            r5 = this;
            java.lang.String r0 = "poll_prop_click"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            r4 = 0
            if (r3 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0014
            java.lang.String r3 = r3.f108844d
            goto L_0x0015
        L_0x0014:
            r3 = r4
        L_0x0015:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.f108843c
            goto L_0x0027
        L_0x0026:
            r3 = r4
        L_0x0027:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.f108845e
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0049
            java.lang.String r4 = r3.f108842b
        L_0x0049:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r4)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r5.mo100903d()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130167c(r3)
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r3.getPollStickerId()
            if (r3 != 0) goto L_0x0061
        L_0x005f:
            java.lang.String r3 = ""
        L_0x0061:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40783g.mo101011e():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r3 == null) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101013g() {
        /*
            r5 = this;
            java.lang.String r0 = "poll_prop_label_click"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            r4 = 0
            if (r3 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0014
            java.lang.String r3 = r3.f108844d
            goto L_0x0015
        L_0x0014:
            r3 = r4
        L_0x0015:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.f108843c
            goto L_0x0027
        L_0x0026:
            r3 = r4
        L_0x0027:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.f108845e
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0049
            java.lang.String r4 = r3.f108842b
        L_0x0049:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r4)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r5.mo100903d()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130167c(r3)
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r3.getPollStickerId()
            if (r3 != 0) goto L_0x0061
        L_0x005f:
            java.lang.String r3 = ""
        L_0x0061:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            r5.m130349h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40783g.mo101013g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r3 == null) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m130349h() {
        /*
            r5 = this;
            java.lang.String r0 = "enter_poll_detail"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            r4 = 0
            if (r3 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0014
            java.lang.String r3 = r3.f108844d
            goto L_0x0015
        L_0x0014:
            r3 = r4
        L_0x0015:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.f108843c
            goto L_0x0027
        L_0x0026:
            r3 = r4
        L_0x0027:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.f108845e
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106019h
            if (r3 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = r3.f108842b
            goto L_0x004b
        L_0x004a:
            r3 = r4
        L_0x004b:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r5.mo100903d()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130167c(r3)
            if (r3 == 0) goto L_0x0061
            java.lang.String r3 = r3.getPollStickerId()
            if (r3 != 0) goto L_0x0063
        L_0x0061:
            java.lang.String r3 = ""
        L_0x0063:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r5.f106048l
            if (r0 != 0) goto L_0x007e
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = r5.f106014c
            if (r0 == 0) goto L_0x0078
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r4 = r0.getVoteStruct()
        L_0x0078:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment.C40763a.m130307a(r4)
            r5.f106048l = r0
        L_0x007e:
            android.content.Context r0 = r5.f106017f
            if (r0 == 0) goto L_0x00ee
            android.support.v4.app.FragmentActivity r0 = (android.support.p022v4.app.FragmentActivity) r0
            android.support.v4.app.j r0 = r0.getSupportFragmentManager()
            r0.mo2654b()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r5.f106048l
            r1 = 1
            if (r0 == 0) goto L_0x0096
            boolean r0 = r0.isAdded()
            if (r0 == r1) goto L_0x00a1
        L_0x0096:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r5.f106048l
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r0.isVisible()
            if (r0 == r1) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            return
        L_0x00a2:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r5.f106048l
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r0.mRemoving
            if (r0 != r1) goto L_0x00ab
            return
        L_0x00ab:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r5.f106048l
            if (r0 == 0) goto L_0x00b3
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r1 = r5.f106047k
            r0.f106001c = r1
        L_0x00b3:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r5.f106048l
            if (r0 == 0) goto L_0x00d4
            android.content.Context r1 = r5.f106017f
            if (r1 == 0) goto L_0x00cc
            android.support.v4.app.FragmentActivity r1 = (android.support.p022v4.app.FragmentActivity) r1
            android.support.v4.app.j r1 = r1.getSupportFragmentManager()
            java.lang.String r2 = "(context as FragmentActi…y).supportFragmentManager"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.String r2 = "VoteBottomSheetDialogFragment"
            r0.show(r1, r2)
            goto L_0x00d4
        L_0x00cc:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        L_0x00d4:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r5.f106048l
            if (r0 == 0) goto L_0x00e1
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$b r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$b
            r1.<init>(r5)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$b r1 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment.C40764b) r1
            r0.f106000b = r1
        L_0x00e1:
            com.ss.android.ugc.aweme.sticker.e r0 = r5.f106019h
            if (r0 == 0) goto L_0x00ed
            com.ss.android.ugc.aweme.sticker.a.c r0 = r0.f108860m
            if (r0 == 0) goto L_0x00ed
            r0.mo71724a()
            return
        L_0x00ed:
            return
        L_0x00ee:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40783g.m130349h():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final View mo101012f() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f106017f);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        DmtTextView dmtTextView = new DmtTextView(this.f106017f);
        dmtTextView.setTextColor(this.f106017f.getResources().getColor(R.color.az3));
        dmtTextView.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) C9738o.m28708b(this.f106017f, 1.0f);
        dmtTextView.setLayoutParams(layoutParams2);
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        dmtTextView.setText(this.f106017f.getString(R.string.dl7));
        TextPaint paint = dmtTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f106017f);
        autoRTLImageView.setImageResource(R.drawable.bd2);
        linearLayout.addView(dmtTextView);
        linearLayout.addView(autoRTLImageView);
        return linearLayout;
    }

    /* renamed from: a */
    public final void mo100901a(InteractStickerStruct interactStickerStruct) {
        super.mo100901a(interactStickerStruct);
        mo100896a(mo100902c());
    }

    /* renamed from: a */
    public final void mo100893a(C41850e eVar) {
        C7573i.m23587b(eVar, "interactStickerParams");
        super.mo100893a(eVar);
        this.f106046j.mo100893a(eVar);
        C40787h d = mo100896a(mo100902c());
        if (d != null) {
            d.post(new C40786c(this, d, eVar));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (r8 == null) goto L_0x007e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h mo100896a(int r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = r7.f106045i
            if (r8 != 0) goto L_0x0057
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h
            android.content.Context r0 = r7.f106017f
            r8.<init>(r0)
            r7.f106045i = r8
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = r7.f106045i
            if (r8 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.sticker.e r0 = r7.f106019h
            r8.setInteractStickerParams(r0)
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r0 = -1
            r8.<init>(r0, r0)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r7.f106045i
            if (r0 == 0) goto L_0x0025
            android.view.ViewGroup$LayoutParams r8 = (android.view.ViewGroup.LayoutParams) r8
            r0.setLayoutParams(r8)
        L_0x0025:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = r7.f106045i
            if (r8 == 0) goto L_0x0033
            android.widget.FrameLayout r8 = r8.getVoteView()
            if (r8 == 0) goto L_0x0033
            r0 = 4
            r8.setVisibility(r0)
        L_0x0033:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = r7.f106045i
            if (r8 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e r0 = r7.f106046j
            float[] r0 = r0.mo100985a()
            r8.setPoints(r0)
        L_0x0040:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = r7.f106045i
            if (r8 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$a r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$a
            r0.<init>(r7)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r8.post(r0)
            goto L_0x0057
        L_0x004f:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteStickerView"
            r8.<init>(r0)
            throw r8
        L_0x0057:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r1 = r7.f106045i
            if (r1 == 0) goto L_0x0091
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r8 = r7.f106014c
            r0 = 0
            if (r8 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r8 = r8.getVoteStruct()
            r2 = r8
            goto L_0x0067
        L_0x0066:
            r2 = r0
        L_0x0067:
            com.ss.android.ugc.aweme.sticker.e r8 = r7.f106019h
            if (r8 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.profile.model.User r8 = r8.f108850c
            goto L_0x006f
        L_0x006e:
            r8 = r0
        L_0x006f:
            boolean r3 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136787r(r8)
            com.ss.android.ugc.aweme.sticker.e r8 = r7.f106019h
            if (r8 == 0) goto L_0x007e
            java.lang.String r8 = r8.f108851d
            if (r8 != 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r4 = r8
            goto L_0x0081
        L_0x007e:
            java.lang.String r8 = ""
            goto L_0x007c
        L_0x0081:
            com.ss.android.ugc.aweme.sticker.e r8 = r7.f106019h
            if (r8 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.sticker.a.c r8 = r8.f108860m
            r5 = r8
            goto L_0x008a
        L_0x0089:
            r5 = r0
        L_0x008a:
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r6 = r7.mo100903d()
            r1.mo101033a(r2, r3, r4, r5, r6)
        L_0x0091:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = r7.f106045i
            if (r8 == 0) goto L_0x0098
            r8.postInvalidate()
        L_0x0098:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = r7.f106045i
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40783g.mo100896a(int):com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h");
    }

    /* renamed from: a */
    public final boolean mo100894a(long j, int i, float f, float f2) {
        return this.f106046j.mo100894a(j, i, f, f2);
    }

    /* renamed from: a */
    public final boolean mo100895a(long j, int i, float f, float f2, C40723e eVar) {
        C7573i.m23587b(eVar, "poiPopListener");
        return this.f106046j.mo100895a(j, i, f, f2, eVar);
    }

    public C40783g(int i, Context context, View view, InteractStickerStruct interactStickerStruct, C41850e eVar, C40725g gVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(view, "contentView");
        C7573i.m23587b(interactStickerStruct, "stickerStruct");
        C7573i.m23587b(gVar, "iVoteDetailSaveData");
        super(i, context, view, interactStickerStruct, eVar);
        this.f106047k = gVar;
        this.f106046j = new C40754e(context, this, interactStickerStruct, eVar);
        if (eVar != null && eVar.f108852e) {
            m130349h();
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).prefetchTypeface(context);
    }
}
