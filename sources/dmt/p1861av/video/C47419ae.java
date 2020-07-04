package dmt.p1861av.video;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.filter.C29197ac;
import com.p280ss.android.ugc.aweme.filter.model.C29321a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39701c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39506a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39508b;
import com.p280ss.android.ugc.aweme.shortvideo.lyric.C40026b;
import com.p280ss.android.ugc.aweme.shortvideo.p1547a.C38420b;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor.SCALE_MODE;
import com.p280ss.android.vesdk.VEListener.C45219o;
import dmt.p1861av.video.p1862a.C47398a;
import dmt.p1861av.video.p1862a.C47409k;
import dmt.p1861av.video.p1862a.C47411l;
import dmt.p1861av.video.p1862a.C47412m;
import dmt.p1861av.video.p1862a.C47413n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* renamed from: dmt.av.video.ae */
public final class C47419ae {

    /* renamed from: A */
    boolean f121751A = false;

    /* renamed from: B */
    boolean f121752B = false;

    /* renamed from: C */
    boolean f121753C = false;

    /* renamed from: D */
    volatile boolean f121754D = false;

    /* renamed from: E */
    public C47398a f121755E;

    /* renamed from: F */
    public boolean f121756F = false;

    /* renamed from: G */
    public C0052o<C15389d> f121757G;

    /* renamed from: H */
    private C45329l f121758H;

    /* renamed from: a */
    Context f121759a;

    /* renamed from: b */
    C0043i f121760b;

    /* renamed from: c */
    SurfaceView f121761c;

    /* renamed from: d */
    public LiveData<VEPreviewParams> f121762d;

    /* renamed from: e */
    public LiveData<VEPreviewMusicParams> f121763e;

    /* renamed from: f */
    public LiveData<C29321a> f121764f;

    /* renamed from: g */
    public LiveData<C47516v> f121765g;

    /* renamed from: h */
    public LiveData<C47479s> f121766h;

    /* renamed from: i */
    public C47462j<C47520y> f121767i;

    /* renamed from: j */
    public C47462j<C47466l> f121768j;

    /* renamed from: k */
    public C0052o<AudioRecorderParam> f121769k;

    /* renamed from: l */
    public LiveData<VEVolumeChangeOp> f121770l;

    /* renamed from: m */
    public LiveData<C47515u> f121771m;

    /* renamed from: n */
    public C0052o<InfoStickerModel> f121772n;

    /* renamed from: o */
    public C0052o<InfoStickerModel> f121773o;

    /* renamed from: p */
    public C0052o<Boolean> f121774p;

    /* renamed from: q */
    public LiveData<C39508b> f121775q;

    /* renamed from: r */
    public C0052o<C40026b> f121776r;

    /* renamed from: s */
    public VEEditorAutoStartStopArbiter f121777s;

    /* renamed from: t */
    public C38420b f121778t;

    /* renamed from: u */
    public C0052o<Integer> f121779u = new C0052o<>();

    /* renamed from: v */
    public C45329l f121780v;

    /* renamed from: w */
    public C45219o f121781w;

    /* renamed from: x */
    public C0052o<Void> f121782x = new C0052o<>();

    /* renamed from: y */
    public C0052o<Void> f121783y = new C0052o<>();

    /* renamed from: z */
    public C0052o<Boolean> f121784z = new C0052o<>();

    /* renamed from: a */
    public final void mo119570a(boolean z) {
        this.f121755E.f121700m = false;
    }

    /* renamed from: a */
    public final void mo119569a(HashMap<Integer, StickerItemModel> hashMap) {
        this.f121755E.mo119543a((InfoStickerModel) this.f121772n.getValue(), hashMap);
    }

    /* renamed from: a */
    public final void mo119571a(boolean z, boolean z2) {
        if (!this.f121752B) {
            this.f121752B = true;
            this.f121784z.postValue(Boolean.valueOf(z));
            this.f121778t.mo38831c(this.f121758H);
            C6921a.m21555a(z2 ? "receive dld done event" : "not receive dld done event");
        }
    }

    /* renamed from: a */
    public final void mo119568a(ArrayList<EffectPointModel> arrayList) {
        this.f121755E.f121690c = arrayList;
    }

    /* renamed from: c */
    public final C47462j<C47466l> mo119576c() {
        if (this.f121768j == null) {
            return new C47462j<>();
        }
        return this.f121768j;
    }

    /* renamed from: b */
    public final void mo119572b() {
        if (this.f121757G != null) {
            this.f121757G.setValue(null);
        }
        if (this.f121778t != null) {
            this.f121778t.mo38876t();
        }
    }

    /* renamed from: a */
    public final void mo119559a() {
        if (this.f121751A) {
            this.f121758H = new C47436aj(this);
            this.f121778t.mo38824b(this.f121758H);
            this.f121778t.mo38861l(C39506a.m126192c());
            this.f121778t.mo38854i(true);
            new Timer().schedule(new TimerTask() {
                public final void run() {
                    C47419ae.this.f121754D = true;
                    C47419ae.this.mo119571a(false, false);
                }
            }, TimeUnit.SECONDS.toMillis(2));
        }
    }

    /* renamed from: a */
    public final void mo119562a(C0052o<Boolean> oVar) {
        this.f121755E.f121688a = oVar;
    }

    /* renamed from: b */
    public final void mo119574b(C0052o<AudioEffectParam> oVar) {
        this.f121755E.f121689b = oVar;
    }

    /* renamed from: a */
    public final void mo119560a(int i) {
        if (this.f121755E != null) {
            this.f121755E.f121701n = i;
        }
    }

    /* renamed from: b */
    public final void mo119573b(int i) {
        if (this.f121755E != null) {
            this.f121755E.f121702q = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo119575b(InfoStickerModel infoStickerModel) {
        this.f121755E.mo119542a(infoStickerModel);
    }

    public C47419ae(int i) {
        this.f121755E = C47398a.m148014a(i);
        if (i == 6) {
            this.f121753C = true;
        }
        this.f121755E.f121699l = C29197ac.m95828a(VEVideoPublishEditActivity.f102286a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo119565a(AudioRecorderParam audioRecorderParam) {
        if (audioRecorderParam != null) {
            this.f121755E.mo119532a(audioRecorderParam);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo119566a(InfoStickerModel infoStickerModel) {
        this.f121755E.mo119542a(infoStickerModel);
        this.f121755E.mo119543a(infoStickerModel, SubtitleModule.m131125ac());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo119567a(Boolean bool) {
        boolean z;
        if (this.f121777s != null) {
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f121777s;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            vEEditorAutoStartStopArbiter.f121598c = z;
        }
    }

    /* renamed from: a */
    public final void mo119563a(Context context, C0043i iVar, SurfaceView surfaceView) {
        mo119564a(context, iVar, surfaceView, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo119561a(int i, int i2, float f, String str) {
        boolean z;
        if (i == 4119 && !this.f121754D) {
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            mo119571a(z, true);
        }
    }

    /* renamed from: a */
    public final void mo119564a(Context context, C0043i iVar, final SurfaceView surfaceView, boolean z) {
        this.f121751A = z;
        this.f121759a = context;
        this.f121760b = iVar;
        this.f121761c = surfaceView;
        this.f121762d.observe(this.f121760b, new C0053p<VEPreviewParams>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(VEPreviewParams vEPreviewParams) {
                C39701c.m127046a(vEPreviewParams);
                if (C47419ae.this.f121761c == null) {
                    C47419ae.this.f121778t = new C38420b(vEPreviewParams.mWorkspace);
                } else {
                    if (vEPreviewParams.editorHandler > 0) {
                        C47419ae.this.f121778t = new C38420b(vEPreviewParams.mWorkspace, C47419ae.this.f121761c, vEPreviewParams.editorHandler);
                        C47419ae.this.f121778t.mo38837d(false);
                        C47419ae.this.f121778t.mo38829c(0);
                    } else {
                        C47419ae.this.f121778t = new C38420b(vEPreviewParams.mWorkspace, C47419ae.this.f121761c);
                    }
                    C47419ae.this.f121777s = new VEEditorAutoStartStopArbiter(C47419ae.this.f121759a, C47419ae.this.f121760b, C47419ae.this.f121778t, C47419ae.this.f121761c);
                    C47419ae.this.f121755E.f121691d = C47419ae.this.f121777s;
                    C47419ae.this.f121755E.mo119536a(surfaceView);
                    if (vEPreviewParams.recordData != null && vEPreviewParams.recordData.isMultiEditRetake) {
                        C47419ae.this.f121777s.f121597b = true;
                    }
                    if (C47419ae.this.f121781w != null) {
                        C47419ae.this.f121778t.mo38800a(C47419ae.this.f121781w);
                    }
                }
                C41530am.m132280a("yarkey mVEEditor create");
                C47419ae.this.f121778t.mo38790a(!C35563c.f93231M.mo93305a(Property.VeEditorANRDestroy));
                C47419ae.this.f121780v = new C47437ak(this);
                C47419ae.this.f121778t.mo38824b(C47419ae.this.f121780v);
                C47419ae.this.f121778t.mo38824b((C45329l) new C47438al(this, vEPreviewParams));
                if (C35563c.f93231M.mo93305a(Property.EnableSubtitleRecognition)) {
                    C47419ae.this.f121778t.mo38824b((C45329l) new C47439am(this));
                }
                C47419ae.this.f121778t.mo38856j(vEPreviewParams.mFps);
                if (vEPreviewParams.previewHeight > 0 && vEPreviewParams.previewWidth > 0) {
                    C47419ae.this.f121778t.mo38836d(vEPreviewParams.previewWidth, vEPreviewParams.previewHeight);
                }
                C47419ae.this.f121778t.mo38819b(C35563c.f93231M.mo93305a(Property.EnableEffectNewEngineEdit));
                int a = C47419ae.this.f121755E.mo119531a(C47419ae.this.f121759a, (C15389d) C47419ae.this.f121778t, vEPreviewParams);
                if (C47419ae.this.f121761c != null && vEPreviewParams.canvasWidth > 0 && vEPreviewParams.canvasHeight > 0) {
                    C47419ae.this.f121778t.mo38773a(SCALE_MODE.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
                    C47419ae.this.f121778t.mo38830c(vEPreviewParams.canvasWidth, vEPreviewParams.canvasHeight);
                }
                if (!(vEPreviewParams.veCherEffectParam == null || vEPreviewParams.veCherEffectParam.getMatrix() == null)) {
                    C47419ae.this.f121778t.mo38806a(0, 1, vEPreviewParams.veCherEffectParam);
                }
                C47419ae.this.mo119559a();
                C47419ae.this.f121778t.mo38832c(true);
                if (!(C47419ae.this.f121761c == null && vEPreviewParams.veAudioEffectParam == null) && (!C47419ae.this.f121753C || !vEPreviewParams.recordData.isMultiEditRetake)) {
                    C47419ae.this.f121778t.mo38868p();
                }
                if (vEPreviewParams.veAudioRecordParam != null && !TextUtils.isEmpty(vEPreviewParams.veAudioRecordParam.getAudioUrl())) {
                    C47419ae.this.f121769k.setValue(vEPreviewParams.veAudioRecordParam);
                }
                if (!(vEPreviewParams.veAudioEffectParam == null || C47419ae.this.mo119576c() == null)) {
                    C47419ae.this.mo119576c().setValue(C47466l.m148179a(true, vEPreviewParams.fromPublishVideo, vEPreviewParams.veAudioEffectParam));
                }
                if (C47419ae.this.f121755E instanceof C47411l) {
                    C47419ae.this.f121778t.mo38803a(0, 1, vEPreviewParams.mMusicVolume);
                } else if ((C47419ae.this.f121755E instanceof C47412m) || (C47419ae.this.f121755E instanceof C47413n)) {
                    C47419ae.this.f121778t.mo38803a(0, 1, vEPreviewParams.mMusicVolume);
                } else if (C47419ae.this.f121755E instanceof C47409k) {
                    C47419ae.this.f121778t.mo38803a(0, 0, vEPreviewParams.recordData.curMultiEditVideoRecordData.originVolume);
                } else if (vEPreviewParams.mAudioPaths != null && vEPreviewParams.mAudioPaths.length == 1) {
                    C47419ae.this.f121778t.mo38803a(0, 0, vEPreviewParams.mVolume);
                }
                if (vEPreviewParams.isFastImport) {
                    C47419ae.this.f121778t.mo38803a(C47419ae.this.f121778t.mo38796a().f116803h, C47419ae.this.f121778t.mo38796a().f116804i, vEPreviewParams.mVolume);
                }
                C47419ae.this.f121779u.setValue(Integer.valueOf(a));
                if (C47419ae.this.f121757G != null) {
                    C47419ae.this.f121757G.setValue(C47419ae.this.f121778t);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo119577a(int i, int i2, float f, String str) {
                if (i == 4116) {
                    C6921a.m21555a("receive prepare done event persist");
                    C47419ae.this.f121783y.postValue(null);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ void mo119579b(int i, int i2, float f, String str) {
                if (i == 4116) {
                    C6921a.m21555a("receive prepare done event");
                    C47419ae.this.f121782x.postValue(null);
                    C47419ae.this.f121778t.mo38831c(C47419ae.this.f121780v);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo119578a(VEPreviewParams vEPreviewParams, int i, int i2, float f, String str) {
                if (i == 4116) {
                    C47419ae.this.f121755E.mo119539a(vEPreviewParams);
                }
            }
        });
        this.f121762d.observe(this.f121760b, new C47456e());
        this.f121763e.observe(this.f121760b, new C0053p<VEPreviewMusicParams>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(VEPreviewMusicParams vEPreviewMusicParams) {
                C47419ae.this.f121755E.mo119545a(vEPreviewMusicParams);
            }
        });
        this.f121763e.observe(this.f121760b, new C47456e());
        this.f121764f.observe(this.f121760b, new C0053p<C29321a>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C29321a aVar) {
                if (aVar != null) {
                    C47419ae.this.f121755E.mo119541a(aVar.f77314b);
                }
            }
        });
        this.f121764f.observe(this.f121760b, new C47456e());
        this.f121765g.observe(this.f121760b, new C0053p<C47516v>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C47516v vVar) {
                C47419ae.this.f121755E.mo119548a(vVar);
            }
        });
        this.f121765g.observe(this.f121760b, new C47456e());
        this.f121766h.observe(this.f121760b, new C0053p<C47479s>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C47479s sVar) {
                C47419ae.this.f121755E.mo119546a(sVar);
            }
        });
        this.f121766h.observe(this.f121760b, new C47456e());
        this.f121767i.mo119587a(this.f121760b, new C47441b<C47520y>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo119580a(C47520y yVar, C47520y yVar2) {
                C47419ae.this.f121755E.mo119549a(yVar, yVar2);
            }
        });
        this.f121767i.observe(this.f121760b, new C47456e());
        if (this.f121769k != null) {
            this.f121769k.observe(this.f121760b, new C47432af(this));
        }
        mo119576c().mo119587a(this.f121760b, new C47441b<C47466l>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo119580a(C47466l lVar, C47466l lVar2) {
                C47419ae.this.f121755E.mo119540a(lVar, lVar2);
            }
        });
        this.f121770l.observe(this.f121760b, new C0053p<VEVolumeChangeOp>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(VEVolumeChangeOp vEVolumeChangeOp) {
                C47419ae.this.f121755E.mo119544a(vEVolumeChangeOp);
            }
        });
        this.f121770l.observe(this.f121760b, new C47456e());
        this.f121771m.observe(this.f121760b, new C0053p<C47515u>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C47515u uVar) {
                C47419ae.this.f121755E.mo119547a(uVar);
            }
        });
        this.f121771m.observe(this.f121760b, new C47456e());
        if (this.f121776r != null) {
            this.f121776r.observe(this.f121760b, new C0053p<C40026b>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(C40026b bVar) {
                    C47419ae.this.f121755E.mo119538a(bVar);
                }
            });
            this.f121776r.observe(this.f121760b, new C47456e());
        }
        if (this.f121772n != null) {
            this.f121772n.observe(this.f121760b, new C47433ag(this));
            this.f121772n.observe(this.f121760b, new C47456e());
        }
        if (this.f121774p != null) {
            this.f121774p.observe(this.f121760b, new C47434ah(this));
        }
        if (this.f121773o != null) {
            this.f121773o.observe(this.f121760b, new C47435ai(this));
            this.f121773o.observe(this.f121760b, new C47456e());
        }
        if (this.f121775q != null) {
            this.f121775q.observe(this.f121760b, new C47456e<C39508b>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(C39508b bVar) {
                    C47419ae.this.f121755E.mo119537a(bVar);
                }
            });
        }
    }
}
