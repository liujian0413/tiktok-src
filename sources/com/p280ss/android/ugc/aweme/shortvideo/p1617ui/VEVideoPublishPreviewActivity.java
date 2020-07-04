package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.app.Activity;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0598c;
import android.support.p022v4.view.C0991u;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34849a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C38576cg;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39967gn;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39604b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractTrackPage;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p280ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47419ae;
import java.util.HashMap;
import kotlin.C7581n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity */
public class VEVideoPublishPreviewActivity extends AmeSSActivity {

    /* renamed from: a */
    public SurfaceView f107137a;

    /* renamed from: b */
    C0044j f107138b = new C0044j(this);

    /* renamed from: c */
    private ImageView f107139c;

    /* renamed from: d */
    private VideoPublishEditModel f107140d;

    /* renamed from: e */
    private C47419ae f107141e;

    /* renamed from: f */
    private int f107142f;

    /* renamed from: g */
    private int f107143g;

    /* renamed from: h */
    private HashMap<Integer, StickerItemModel> f107144h;

    public Lifecycle getLifecycle() {
        return this.f107138b;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101723a(Void voidR) {
        C6921a.m21555a("receive prepare done event in publish preview page");
        if (this.f107144h == null) {
            this.f107144h = new HashMap<>();
        } else {
            this.f107144h.clear();
        }
        this.f107141e.mo119569a(this.f107144h);
        SubtitleModule.m131121a(this.f107141e.f121778t, C35563c.f93238a, this.f107140d, this.f107144h);
    }

    public void onDestroy() {
        this.f107138b.mo117a(State.DESTROYED);
        this.f107141e.mo119572b();
        super.onDestroy();
    }

    public void onBackPressed() {
        super.onBackPressed();
        VotingStickerView votingStickerView = (VotingStickerView) findViewById(R.id.cja);
        if (votingStickerView != null) {
            votingStickerView.setVisibility(8);
            if (this.f107137a != null) {
                this.f107137a.setVisibility(8);
            }
        }
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            findViewById(R.id.cja).setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m131391c() {
        this.f107139c = (ImageView) findViewById(R.id.ebd);
        if (VideoCoverBitmapHolder.f107006a != null) {
            this.f107139c.setImageBitmap(VideoCoverBitmapHolder.f107006a);
        }
        C0991u.m4192a((View) this.f107139c, "transition_img_name");
        this.f107137a = (SurfaceView) findViewById(R.id.cj6);
        this.f107137a.setVisibility(4);
        this.f107137a.setOnClickListener(new C41256ak(this));
    }

    /* renamed from: e */
    private void m131393e() {
        if (VERSION.SDK_INT >= 21) {
            AutoTransition autoTransition = new AutoTransition();
            getWindow().setSharedElementEnterTransition(autoTransition);
            autoTransition.addListener(new C34849a() {
                public final void onTransitionStart(Transition transition) {
                }

                public final void onTransitionEnd(Transition transition) {
                    VEVideoPublishPreviewActivity.this.f107137a.setVisibility(0);
                    VEVideoPublishPreviewActivity.this.f107137a.bringToFront();
                    VEVideoPublishPreviewActivity.this.mo101720a();
                }
            });
            getWindow().setReturnTransition(new AutoTransition());
            return;
        }
        this.f107137a.setVisibility(0);
        this.f107137a.bringToFront();
        mo101720a();
    }

    /* renamed from: d */
    private void m131392d() {
        if (C39805en.m127445a()) {
            int c = C39805en.m127450c(this);
            switch (C39804em.f103457a) {
                case 1:
                    m131389a(this.f107137a, (int) C9738o.m28708b((Context) this, 29.0f));
                    m131389a(this.f107139c, (int) C9738o.m28708b((Context) this, 29.0f));
                    return;
                case 2:
                    int i = c / 2;
                    m131389a(this.f107137a, ((int) C9738o.m28708b((Context) this, 29.0f)) + i);
                    m131389a(this.f107139c, ((int) C9738o.m28708b((Context) this, 29.0f)) + i);
                    return;
                case 3:
                    return;
                case 4:
                    m131389a(this.f107137a, (int) C9738o.m28708b((Context) this, 29.0f));
                    m131389a(this.f107139c, (int) C9738o.m28708b((Context) this, 29.0f));
                    return;
                case 5:
                    int i2 = c / 2;
                    m131389a(this.f107137a, ((int) C9738o.m28708b((Context) this, 29.0f)) + i2);
                    m131389a(this.f107139c, ((int) C9738o.m28708b((Context) this, 29.0f)) + i2);
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo101720a() {
        if (!(this.f107140d == null || this.f107140d.getMainBusinessContext() == null)) {
            InteractStickerStruct a = C39604b.m126707a(this.f107140d.getMainBusinessContext(), 1, InteractTrackPage.TRACK_PAGE_EDIT);
            if (!(a == null || a.getVoteStruct() == null)) {
                VotingStickerView votingStickerView = (VotingStickerView) findViewById(R.id.cja);
                View findViewById = findViewById(R.id.ecr);
                if (votingStickerView != null) {
                    LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
                    int height = ((LayoutParams) this.f107137a.getLayoutParams()).topMargin + ((this.f107137a.getHeight() - this.f107141e.f121778t.mo38828c().f116386b) / 2);
                    if (height > 0) {
                        layoutParams.height = height;
                        findViewById.setLayoutParams(layoutParams);
                        findViewById.setVisibility(0);
                        findViewById.bringToFront();
                    }
                    votingStickerView.mo98910a(a.getVoteStruct());
                    votingStickerView.setTouchEnable(true);
                    votingStickerView.mo98912b();
                    votingStickerView.setEditEnable(false);
                    votingStickerView.post(new C41257al(this, a, votingStickerView, findViewById));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x013e, code lost:
        if (r7.equals("3") != false) goto L_0x0160;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m131390b() {
        /*
            r12 = this;
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r1 = "args"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = (com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r0
            r12.f107140d = r0
            dmt.av.video.ae r0 = new dmt.av.video.ae
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r12.f107140d
            int r1 = r1.videoEditorType
            r0.<init>(r1)
            r12.f107141e = r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            int r0 = r0.mVideoCanvasWidth
            if (r0 <= 0) goto L_0x0032
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            int r0 = r0.mVideoCanvasHeight
            if (r0 <= 0) goto L_0x0032
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            int r0 = r0.mVideoCanvasWidth
            r12.f107142f = r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            int r0 = r0.mVideoCanvasHeight
            r12.f107143g = r0
            goto L_0x0070
        L_0x0032:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            int r0 = r0.videoWidth()
            r12.f107142f = r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            int r0 = r0.videoHeight()
            r12.f107143g = r0
            int r0 = r12.f107143g
            if (r0 == 0) goto L_0x004a
            int r0 = r12.f107142f
            if (r0 != 0) goto L_0x0070
        L_0x004a:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            int r0 = r0.getOriginal()
            if (r0 != 0) goto L_0x0055
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93255r
            goto L_0x0057
        L_0x0055:
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93254q
        L_0x0057:
            int r0 = r0.getVideoWidth()
            r12.f107142f = r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            int r0 = r0.getOriginal()
            if (r0 != 0) goto L_0x0068
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93255r
            goto L_0x006a
        L_0x0068:
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93254q
        L_0x006a:
            int r0 = r0.getVideoHeight()
            r12.f107143g = r0
        L_0x0070:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            r1 = 30
            r2 = 2
            dmt.av.video.VEPreviewParams r0 = com.p280ss.android.ugc.aweme.shortvideo.edit.C39526e.m126247a(r0, r2, r1)
            android.arch.lifecycle.o r1 = new android.arch.lifecycle.o
            r1.<init>()
            r1.setValue(r0)
            android.arch.lifecycle.o r3 = new android.arch.lifecycle.o
            r3.<init>()
            dmt.av.video.VEPreviewMusicParams r4 = new dmt.av.video.VEPreviewMusicParams
            r4.<init>()
            r4.f121613h = r2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r12.f107140d
            java.lang.String r5 = r5.mMusicPath
            r4.f121606a = r5
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r12.f107140d
            int r5 = r5.mMusicStart
            r4.f121607b = r5
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r12.f107140d
            java.lang.String r5 = r5.mMusicPath
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6 = r12.f107140d
            boolean r6 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136538a(r6)
            int r5 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136536a(r5, r6)
            r4.f121608c = r5
            com.ss.android.ugc.aweme.property.AVAB r5 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r6 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
            boolean r5 = r5.mo93305a(r6)
            if (r5 == 0) goto L_0x00e3
            com.ss.android.ugc.aweme.shortvideo.dw r5 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r5 = r5.mo97931b()
            if (r5 == 0) goto L_0x00e3
            int r5 = r4.f121608c
            com.ss.android.ugc.aweme.shortvideo.dw r6 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r6 = r6.mo97931b()
            int r6 = r6.getShootDuration()
            int r5 = r5 - r6
            int r5 = java.lang.Math.abs(r5)
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r5 < r6) goto L_0x00e3
            com.ss.android.ugc.aweme.shortvideo.dw r5 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r5 = r5.mo97931b()
            int r5 = r5.getShootDuration()
            r4.f121609d = r5
            goto L_0x00e7
        L_0x00e3:
            int r5 = r4.f121608c
            r4.f121609d = r5
        L_0x00e7:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r12.f107140d
            float r5 = r5.musicVolume
            r4.f121610e = r5
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r12.f107140d
            java.lang.String r5 = r5.musicId
            r4.f121611f = r5
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r12.f107140d
            float r5 = r5.previewStartTime
            r4.f121612g = r5
            r3.setValue(r4)
            dmt.av.video.g r4 = new dmt.av.video.g
            r4.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r12.f107140d
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r5 = r5.mEffectList
            if (r5 == 0) goto L_0x010e
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r12.f107140d
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r5 = r5.mEffectList
            dmt.p1861av.video.C47514t.m148293a(r5, r4)
        L_0x010e:
            android.arch.lifecycle.o r5 = new android.arch.lifecycle.o
            r5.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6 = r12.f107140d
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r6 = r6.infoStickerModel
            r5.setValue(r6)
            dmt.av.video.j r6 = new dmt.av.video.j
            r6.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r12.f107140d
            com.ss.android.ugc.aweme.effect.EffectPointModel r7 = r7.mTimeEffect
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L_0x0191
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r12.f107140d
            com.ss.android.ugc.aweme.effect.EffectPointModel r7 = r7.mTimeEffect
            java.lang.String r7 = r7.getKey()
            r10 = -1
            int r11 = r7.hashCode()
            switch(r11) {
                case 48: goto L_0x0155;
                case 49: goto L_0x014b;
                case 50: goto L_0x0141;
                case 51: goto L_0x0138;
                default: goto L_0x0137;
            }
        L_0x0137:
            goto L_0x015f
        L_0x0138:
            java.lang.String r11 = "3"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x015f
            goto L_0x0160
        L_0x0141:
            java.lang.String r2 = "2"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x015f
            r2 = 1
            goto L_0x0160
        L_0x014b:
            java.lang.String r2 = "1"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x015f
            r2 = 3
            goto L_0x0160
        L_0x0155:
            java.lang.String r2 = "0"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x015f
            r2 = 0
            goto L_0x0160
        L_0x015f:
            r2 = -1
        L_0x0160:
            switch(r2) {
                case 0: goto L_0x018a;
                case 1: goto L_0x017c;
                case 2: goto L_0x016e;
                case 3: goto L_0x0169;
                default: goto L_0x0163;
            }
        L_0x0163:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0169:
            dmt.av.video.y r2 = dmt.p1861av.video.C47520y.m148316b()
            goto L_0x018e
        L_0x016e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r12.f107140d
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r2.mTimeEffect
            int r2 = r2.getEndPoint()
            long r10 = (long) r2
            dmt.av.video.y r2 = dmt.p1861av.video.C47520y.m148317b(r10)
            goto L_0x018e
        L_0x017c:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r12.f107140d
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r2.mTimeEffect
            int r2 = r2.getEndPoint()
            long r10 = (long) r2
            dmt.av.video.y r2 = dmt.p1861av.video.C47520y.m148315a(r10)
            goto L_0x018e
        L_0x018a:
            dmt.av.video.y r2 = dmt.p1861av.video.C47520y.m148314a()
        L_0x018e:
            r6.setValue(r2)
        L_0x0191:
            dmt.av.video.ae r2 = r12.f107141e
            r2.f121762d = r1
            dmt.av.video.ae r1 = r12.f107141e
            r1.f121763e = r3
            dmt.av.video.ae r1 = r12.f107141e
            r1.f121766h = r4
            dmt.av.video.ae r1 = r12.f107141e
            android.arch.lifecycle.o r2 = new android.arch.lifecycle.o
            r2.<init>()
            r1.f121764f = r2
            dmt.av.video.ae r1 = r12.f107141e
            android.arch.lifecycle.o r2 = new android.arch.lifecycle.o
            r2.<init>()
            r1.f121765g = r2
            dmt.av.video.ae r1 = r12.f107141e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.mo119568a(r2)
            dmt.av.video.ae r1 = r12.f107141e
            r1.f121767i = r6
            dmt.av.video.j r1 = new dmt.av.video.j
            r1.<init>()
            dmt.av.video.ae r2 = r12.f107141e
            r2.f121768j = r1
            dmt.av.video.ae r2 = r12.f107141e
            android.arch.lifecycle.o r3 = new android.arch.lifecycle.o
            r3.<init>()
            r2.f121770l = r3
            dmt.av.video.ae r2 = r12.f107141e
            android.arch.lifecycle.o r3 = new android.arch.lifecycle.o
            r3.<init>()
            r2.f121771m = r3
            dmt.av.video.ae r2 = r12.f107141e
            android.arch.lifecycle.o r3 = new android.arch.lifecycle.o
            r3.<init>()
            r2.mo119562a(r3)
            dmt.av.video.ae r2 = r12.f107141e
            r2.f121772n = r5
            android.arch.lifecycle.o r2 = new android.arch.lifecycle.o
            r2.<init>()
            dmt.av.video.ae r3 = r12.f107141e
            r3.f121769k = r2
            android.arch.lifecycle.o r3 = new android.arch.lifecycle.o
            r3.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.b.b r4 = new com.ss.android.ugc.aweme.shortvideo.edit.b.b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r12.f107140d
            boolean r5 = r5.autoEnhanceOn
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6 = r12.f107140d
            int r6 = r6.autoEnhanceType
            r4.<init>(r5, r6, r9)
            r3.setValue(r4)
            dmt.av.video.ae r4 = r12.f107141e
            r4.f121775q = r3
            dmt.av.video.ae r3 = r12.f107141e
            android.arch.lifecycle.o<java.lang.Void> r3 = r3.f121782x
            com.ss.android.ugc.aweme.shortvideo.ui.aj r4 = new com.ss.android.ugc.aweme.shortvideo.ui.aj
            r4.<init>(r12)
            r3.observe(r12, r4)
            android.arch.lifecycle.j r3 = r12.f107138b
            android.arch.lifecycle.Lifecycle$State r4 = android.arch.lifecycle.Lifecycle.State.STARTED
            r3.mo117a(r4)
            dmt.av.video.ae r3 = r12.f107141e
            android.view.SurfaceView r4 = r12.f107137a
            r3.mo119563a(r12, r12, r4)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r12.f107140d
            com.ss.android.ugc.aweme.effect.EffectPointModel r3 = r3.mTimeEffect
            if (r3 == 0) goto L_0x023a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r12.f107140d
            com.ss.android.ugc.aweme.effect.EffectPointModel r3 = r3.mTimeEffect
            java.lang.String r3 = r3.getKey()
            java.lang.String r4 = "1"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x023a
            r3 = 1
            goto L_0x023b
        L_0x023a:
            r3 = 0
        L_0x023b:
            if (r3 == 0) goto L_0x02ab
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r12.f107140d
            boolean r3 = r3.isFastImport
            if (r3 == 0) goto L_0x0270
            dmt.av.video.ae r3 = r12.f107141e
            com.ss.android.ugc.aweme.shortvideo.a.b r3 = r3.f121778t
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r12.f107140d
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r4 = r4.getPreviewInfo()
            java.lang.String[] r4 = r4.getReverseVideoArray()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r12.f107140d
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r5 = r5.getPreviewInfo()
            java.lang.String[] r5 = r5.getReverseAudioArray()
            r3.mo38793a(r4, r5)
            dmt.av.video.ae r3 = r12.f107141e
            com.ss.android.ugc.aweme.shortvideo.a.b r3 = r3.f121778t
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r12.f107140d
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r4 = r4.getPreviewInfo()
            java.lang.String[] r4 = r4.getTempVideoArray()
            r3.mo38802a(r4)
            goto L_0x0281
        L_0x0270:
            dmt.av.video.ae r3 = r12.f107141e
            com.ss.android.ugc.aweme.shortvideo.a.b r3 = r3.f121778t
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r12.f107140d
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r4 = r4.getPreviewInfo()
            java.lang.String[] r4 = r4.getReverseVideoArray()
            r3.mo38821b(r4)
        L_0x0281:
            dmt.av.video.ae r3 = r12.f107141e
            com.ss.android.ugc.aweme.shortvideo.a.b r3 = r3.f121778t
            r3.mo38839e(r9)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r12.f107140d
            boolean r3 = r3.isFastImport
            if (r3 == 0) goto L_0x02ab
            dmt.av.video.ae r3 = r12.f107141e
            com.ss.android.ugc.aweme.shortvideo.a.b r3 = r3.f121778t
            dmt.av.video.ae r4 = r12.f107141e
            com.ss.android.ugc.aweme.shortvideo.a.b r4 = r4.f121778t
            com.ss.android.vesdk.runtime.b r4 = r4.mo38796a()
            int r4 = r4.f116803h
            dmt.av.video.ae r5 = r12.f107141e
            com.ss.android.ugc.aweme.shortvideo.a.b r5 = r5.f121778t
            com.ss.android.vesdk.runtime.b r5 = r5.mo38796a()
            int r5 = r5.f116804i
            float r0 = r0.mVolume
            r3.mo38803a(r4, r5, r0)
        L_0x02ab:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            if (r0 == 0) goto L_0x02b8
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            r2.setValue(r0)
        L_0x02b8:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            if (r0 == 0) goto L_0x02de
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            r0.setShowErrorToast(r8)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            r2 = 0
            r0.setPreprocessResult(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r12.f107140d
            boolean r0 = r0.isReviewVideo()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r12.f107140d
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r2 = r2.veAudioEffectParam
            dmt.av.video.l r0 = dmt.p1861av.video.C47466l.m148179a(r9, r0, r2)
            r1.setValue(r0)
        L_0x02de:
            com.ss.android.ugc.aweme.property.AVAB r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r1 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableFilterIntensityJust
            boolean r0 = r0.mo93305a(r1)
            if (r0 == 0) goto L_0x030a
            com.ss.android.ugc.aweme.port.in.n r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93224F
            com.ss.android.ugc.aweme.filter.e.a r0 = r0.mo70097l()
            com.ss.android.ugc.aweme.filter.e.c r0 = r0.mo74949b()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r12.f107140d
            int r1 = r1.mSelectedId
            com.ss.android.ugc.aweme.filter.g r0 = r0.mo74962a(r1)
            dmt.av.video.ae r1 = r12.f107141e
            com.ss.android.ugc.aweme.shortvideo.a.b r1 = r1.f121778t
            java.lang.String r0 = r0.mo74978b()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r12.f107140d
            float r2 = r2.mSelectedFilterIntensity
            r1.mo38817b(r0, r2)
            goto L_0x0329
        L_0x030a:
            dmt.av.video.ae r0 = r12.f107141e
            com.ss.android.ugc.aweme.shortvideo.a.b r0 = r0.f121778t
            com.ss.android.ugc.aweme.port.in.n r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93224F
            com.ss.android.ugc.aweme.filter.e.a r1 = r1.mo70097l()
            com.ss.android.ugc.aweme.filter.e.c r1 = r1.mo74949b()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r12.f107140d
            int r2 = r2.mSelectedId
            com.ss.android.ugc.aweme.filter.g r1 = r1.mo74962a(r2)
            java.lang.String r1 = r1.mo74978b()
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.mo38779a(r1, r2)
        L_0x0329:
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.C39805en.m127445a()
            if (r0 == 0) goto L_0x0345
            android.view.SurfaceView r0 = r12.f107137a
            int r1 = r12.f107142f
            int r2 = r12.f107143g
            com.p280ss.android.ugc.aweme.shortvideo.C39804em.m127430a(r0, r12, r1, r2)
            android.widget.ImageView r0 = r12.f107139c
            int r1 = r12.f107142f
            int r2 = r12.f107143g
            com.p280ss.android.ugc.aweme.shortvideo.C39804em.m127430a(r0, r12, r1, r2)
            r12.m131392d()
            return
        L_0x0345:
            android.view.SurfaceView r0 = r12.f107137a
            int r1 = r12.f107142f
            int r2 = r12.f107143g
            com.p280ss.android.ugc.aweme.shortvideo.C39804em.m127439b(r0, r1, r2)
            android.widget.ImageView r0 = r12.f107139c
            int r1 = r12.f107142f
            int r2 = r12.f107143g
            com.p280ss.android.ugc.aweme.shortvideo.C39804em.m127439b(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VEVideoPublishPreviewActivity.m131390b():void");
    }

    /* renamed from: a */
    private Point m131387a(PointF pointF) {
        Point point = new Point();
        point.set((int) (((float) this.f107141e.f121778t.mo38828c().f116385a) * pointF.x), (int) (((float) this.f107141e.f121778t.mo38828c().f116386b) * pointF.y));
        return point;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        setContentView((int) R.layout.f_);
        if (!C39805en.m127445a() && !C22911a.m75401a(this)) {
            C23487o.m77136a((Activity) this);
        }
        new C39967gn();
        C35563c.m114829a(C39967gn.m127849a());
        m131391c();
        m131390b();
        m131393e();
        if (C39805en.m127445a()) {
            getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            if (C6776h.m20953d()) {
                C10994a.m32205a((Activity) this);
            } else {
                C10994a.m32208b(this);
            }
            if (VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
            new C38576cg(this).mo96555a(new C41254ai(this));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo101719a(Integer num) {
        C39804em.m127430a((View) this.f107137a, (Context) this, this.f107142f, this.f107143g);
        C39804em.m127430a((View) this.f107139c, (Context) this, this.f107142f, this.f107143g);
        m131392d();
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101721a(View view) {
        if (VERSION.SDK_INT >= 21) {
            this.f107139c.bringToFront();
            this.f107137a.post(new Runnable() {
                public final void run() {
                    VEVideoPublishPreviewActivity.this.f107137a.setVisibility(4);
                    VEVideoPublishPreviewActivity.this.finishAfterTransition();
                }
            });
            return;
        }
        finish();
    }

    /* renamed from: a */
    private static void m131389a(View view, int i) {
        if (view != null) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.topMargin += i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public static void m131388a(Activity activity, ImageView imageView, VideoPublishEditModel videoPublishEditModel) {
        Intent intent = new Intent(activity, VEVideoPublishPreviewActivity.class);
        intent.putExtra("args", videoPublishEditModel);
        C0991u.m4192a((View) imageView, "transition_img_name");
        activity.startActivity(intent, C0598c.m2483a(activity, (View) imageView, "transition_img_name").mo2580a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101722a(InteractStickerStruct interactStickerStruct, VotingStickerView votingStickerView, View view) {
        NormalTrackTimeStamp a = C39604b.m126708a(interactStickerStruct);
        Point a2 = m131387a(new PointF(a.getX(), a.getY()));
        LayoutParams layoutParams = (LayoutParams) this.f107137a.getLayoutParams();
        float height = (float) ((this.f107137a.getHeight() - this.f107141e.f121778t.mo38828c().f116386b) / 2);
        votingStickerView.setX((float) ((a2.x + layoutParams.leftMargin) - (votingStickerView.getWidth() / 2)));
        votingStickerView.setY((((float) (a2.y + layoutParams.topMargin)) + height) - ((float) (votingStickerView.getHeight() / 2)));
        votingStickerView.setRotation(a.getRotation());
        votingStickerView.setScaleX(a.getScale().floatValue());
        votingStickerView.setScaleY(a.getScale().floatValue());
        votingStickerView.bringToFront();
        view.bringToFront();
        votingStickerView.setVisibility(0);
    }
}
