package dmt.p1861av.video.p1862a;

import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import bolts.C1591g;
import bolts.C1592h;
import bolts.C1606i;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p280ss.android.ugc.aweme.effect.C27431j;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29297h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39440c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39561am;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39506a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39508b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39509c;
import com.p280ss.android.ugc.aweme.shortvideo.lyric.C40026b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VEEditor.VEState;
import com.p280ss.android.vesdk.VEException;
import com.p280ss.android.vesdk.runtime.C45345b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47466l;
import dmt.p1861av.video.C47479s;
import dmt.p1861av.video.C47515u;
import dmt.p1861av.video.C47516v;
import dmt.p1861av.video.C47520y;
import dmt.p1861av.video.VEEditorAutoStartStopArbiter;
import dmt.p1861av.video.VEPreviewMusicParams;
import dmt.p1861av.video.VEPreviewParams;
import java.io.File;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: dmt.av.video.a.a */
public abstract class C47398a {

    /* renamed from: o */
    public static int f121686o = 1;

    /* renamed from: p */
    public static int f121687p = 2;

    /* renamed from: a */
    public C0052o<Boolean> f121688a;

    /* renamed from: b */
    public C0052o<AudioEffectParam> f121689b;

    /* renamed from: c */
    public ArrayList<EffectPointModel> f121690c;

    /* renamed from: d */
    public VEEditorAutoStartStopArbiter f121691d;

    /* renamed from: e */
    protected C15389d f121692e;

    /* renamed from: f */
    protected VEPreviewParams f121693f;

    /* renamed from: g */
    public int f121694g = -1;

    /* renamed from: h */
    public int f121695h = -1;

    /* renamed from: i */
    public int f121696i = -1;

    /* renamed from: j */
    public C47466l f121697j;

    /* renamed from: k */
    protected List<String> f121698k;

    /* renamed from: l */
    public C29230az f121699l;

    /* renamed from: m */
    public boolean f121700m = true;

    /* renamed from: n */
    public int f121701n;

    /* renamed from: q */
    public int f121702q;

    /* renamed from: r */
    private Context f121703r;

    /* renamed from: s */
    private Executor f121704s;

    /* renamed from: t */
    private String f121705t = C39506a.m126190a();

    /* renamed from: a */
    public void mo119536a(SurfaceView surfaceView) {
    }

    /* renamed from: a */
    public void mo119539a(VEPreviewParams vEPreviewParams) {
    }

    /* renamed from: a */
    public int mo119531a(Context context, C15389d dVar, VEPreviewParams vEPreviewParams) {
        this.f121703r = context;
        this.f121692e = dVar;
        this.f121693f = vEPreviewParams;
        return -1;
    }

    /* renamed from: a */
    public final boolean mo119548a(C47516v vVar) {
        if (vVar.f121979a == 0 && this.f121691d != null) {
            if (this.f121691d.f121596a) {
                this.f121691d.mo119465a(false);
            } else {
                this.f121691d.mo119467b();
            }
        }
        if (vVar.f121979a == 1 && this.f121691d != null) {
            this.f121691d.mo119465a(true);
        }
        if (vVar.f121979a == 2) {
            int a = this.f121692e.mo38763a((int) vVar.f121980b, SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);
            if (a != 0) {
                StringBuilder sb = new StringBuilder("Seek failed. ret = ");
                sb.append(a);
                sb.append(" See logs for more details.");
                C6921a.m21555a(sb.toString());
                if (C7163a.m22363a()) {
                    throw m148021b(a);
                }
            }
        }
        if (vVar.f121979a == 3) {
            final C1606i iVar = new C1606i();
            this.f121692e.mo38824b((C45329l) new C45329l() {
                public final void onCallback(int i, int i2, float f, String str) {
                    if (i == 4101) {
                        iVar.mo6900a(null);
                        C47398a.this.f121692e.mo38831c((C45329l) this);
                    }
                }
            });
            int a2 = this.f121692e.mo38763a((int) vVar.f121980b, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            if (a2 != 0) {
                try {
                    VEState h = this.f121692e.mo38850h();
                    StringBuilder sb2 = new StringBuilder("Seek failed. ret = ");
                    sb2.append(a2);
                    sb2.append(" state = ");
                    sb2.append(h.ordinal());
                    C6921a.m21555a(sb2.toString());
                    if (C7163a.m22363a()) {
                        StringBuilder sb3 = new StringBuilder("Seek failed. ret = ");
                        sb3.append(a2);
                        sb3.append(" state = ");
                        sb3.append(h.ordinal());
                        throw new IllegalStateException(sb3.toString());
                    }
                } catch (VEException e) {
                    C6921a.m21559a((Throwable) e);
                    if (C7163a.m22363a()) {
                        throw new IllegalStateException("Seek failed. ret = ", e);
                    }
                }
            }
            try {
                iVar.f6010a.mo6892g();
            } catch (InterruptedException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo119544a(VEVolumeChangeOp vEVolumeChangeOp) {
        if (vEVolumeChangeOp.mType == 0) {
            this.f121692e.mo38803a(this.f121692e.mo38796a().f116803h, this.f121692e.mo38796a().f116804i, vEVolumeChangeOp.mVolume);
        } else if (vEVolumeChangeOp.mType == 1) {
            this.f121692e.mo38803a(this.f121694g, 1, vEVolumeChangeOp.mVolume);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo119547a(C47515u uVar) {
        this.f121692e.mo38754a(this.f121694g, uVar.f121977a, uVar.f121977a + uVar.f121978b, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
        return false;
    }

    /* renamed from: a */
    public boolean mo119545a(VEPreviewMusicParams vEPreviewMusicParams) {
        if (this.f121694g != -1) {
            this.f121692e.mo38833d(this.f121694g);
        }
        if (vEPreviewMusicParams.f121606a == null) {
            return false;
        }
        if (!C35563c.f93231M.mo93305a(Property.EnableRemove15sCapMusic) || vEPreviewMusicParams.f121609d <= 0 || Math.abs(vEPreviewMusicParams.f121608c - vEPreviewMusicParams.f121609d) < 1000) {
            this.f121694g = this.f121692e.mo38783a(vEPreviewMusicParams.f121606a, vEPreviewMusicParams.f121607b, vEPreviewMusicParams.f121607b + vEPreviewMusicParams.f121608c, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
        } else {
            this.f121694g = this.f121692e.mo38783a(vEPreviewMusicParams.f121606a, vEPreviewMusicParams.f121607b, vEPreviewMusicParams.f121607b + vEPreviewMusicParams.f121609d, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
        }
        this.f121692e.mo38803a(this.f121694g, 1, vEPreviewMusicParams.f121610e);
        return false;
    }

    /* renamed from: a */
    public final void mo119538a(C40026b bVar) {
        this.f121692e.mo38814b(bVar.f103937a, this.f121694g, bVar.f103938b, bVar.f103939c, bVar.f103940d, bVar.f103941e);
    }

    /* renamed from: a */
    public final void mo119537a(C39508b bVar) {
        if (bVar != null) {
            String str = "";
            switch (bVar.f102559b) {
                case 0:
                    str = "apply nothing";
                    break;
                case 1:
                    m148020a(bVar.f102558a, bVar.f102560c);
                    StringBuilder sb = new StringBuilder("apply light enhance, ");
                    sb.append(bVar.f102558a ? "on " : "off");
                    str = sb.toString();
                    break;
                case 2:
                    m148019a(bVar.f102558a);
                    StringBuilder sb2 = new StringBuilder("apply hdr enhance, ");
                    sb2.append(bVar.f102558a ? "on " : "off");
                    str = sb2.toString();
                    break;
            }
            C39509c.m126200a(this.f121703r, str);
        }
    }

    /* renamed from: a */
    public final boolean mo119546a(C47479s sVar) {
        ArrayList<EffectPointModel> arrayList = this.f121690c;
        long l = sVar.f121913e ? ((long) this.f121692e.mo38860l()) - sVar.f121910b : sVar.f121910b;
        if (sVar.f121912d == 0) {
            if (C6399b.m19944t()) {
                sVar.f121909a = new int[]{this.f121692e.mo38766a((int) sVar.f121910b, sVar.f121915g)};
            } else {
                sVar.f121909a = new int[]{this.f121692e.mo38767a((int) sVar.f121910b, sVar.f121915g, 0, 0, sVar.f121920l)};
            }
            EffectPointModel effectPointModel = new EffectPointModel();
            effectPointModel.setType(1);
            effectPointModel.setSelectColor(sVar.f121914f);
            effectPointModel.setIndex(sVar.f121909a[0]);
            effectPointModel.setResDir(sVar.f121915g);
            effectPointModel.setKey(sVar.f121916h);
            effectPointModel.setFromEnd(sVar.f121913e);
            effectPointModel.setStartPoint((int) l);
            effectPointModel.setName(sVar.f121917i);
            effectPointModel.setDuration(sVar.f121918j);
            effectPointModel.setCategory(sVar.f121919k);
            effectPointModel.setExtra(sVar.f121920l);
            arrayList.add(effectPointModel);
        } else if (sVar.f121912d == 5) {
            m148017a(sVar, arrayList);
        } else if (sVar.f121912d == 6) {
            if (arrayList.isEmpty()) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (C27431j.m89899b(((EffectPointModel) arrayList.get(size)).getCategory())) {
                    this.f121692e.mo38820b(new int[]{((EffectPointModel) arrayList.get(size)).getIndex()});
                    ((EffectPointModel) arrayList.get(size)).setFromEnd(sVar.f121913e);
                    ((EffectPointModel) arrayList.get(size)).setStartPoint((int) sVar.f121910b);
                    ((EffectPointModel) arrayList.get(size)).setEndPoint((int) sVar.f121911c);
                    if (C6399b.m19944t()) {
                        sVar.f121909a = this.f121692e.mo38807a(new int[]{((EffectPointModel) arrayList.get(size)).getStartPoint()}, new int[]{((EffectPointModel) arrayList.get(size)).getEndPoint()}, new String[]{((EffectPointModel) arrayList.get(size)).getResDir()});
                    } else {
                        sVar.f121909a = this.f121692e.mo38808a(new int[]{((EffectPointModel) arrayList.get(size)).getStartPoint()}, new int[]{((EffectPointModel) arrayList.get(size)).getEndPoint()}, new String[]{((EffectPointModel) arrayList.get(size)).getResDir()}, new int[]{0}, new int[]{0}, new String[]{((EffectPointModel) arrayList.get(size)).getExtra()});
                    }
                    ((EffectPointModel) arrayList.get(size)).setIndex(sVar.f121909a[0]);
                    return false;
                }
            }
        } else if (sVar.f121912d == 1) {
            EffectPointModel effectPointModel2 = (EffectPointModel) arrayList.get(arrayList.size() - 1);
            this.f121692e.mo38844f(effectPointModel2.getIndex(), (int) sVar.f121910b);
            effectPointModel2.setEndPoint((int) l);
        } else if (sVar.f121912d == 2 || sVar.f121912d == 7) {
            m148016a(sVar.f121909a[0], arrayList);
        } else if (sVar.f121912d == 3) {
            this.f121692e.mo38820b(sVar.f121909a);
            arrayList.clear();
        } else if (sVar.f121912d == 4) {
            this.f121692e.mo38820b(sVar.f121909a);
            for (int i = 0; i < sVar.f121909a.length; i++) {
                arrayList.remove(arrayList.size() - 1);
            }
        } else if (sVar.f121912d == 8) {
            m148016a(sVar.f121909a[0], arrayList);
            m148017a(sVar, arrayList);
        }
        return false;
    }

    /* renamed from: a */
    public final int mo119532a(AudioRecorderParam audioRecorderParam) {
        if (audioRecorderParam.getNeedDel()) {
            this.f121692e.mo38833d(audioRecorderParam.getAudioRecordIndex());
            audioRecorderParam.setNeedDel(false);
            audioRecorderParam.setAudioRecordIndex(-2);
            this.f121696i = -1;
            return -2;
        } else if (!audioRecorderParam.hasRecord()) {
            return -1;
        } else {
            if (audioRecorderParam.getAudioRecordIndex() >= 0) {
                this.f121695h = audioRecorderParam.getAudioRecordIndex();
                return this.f121695h;
            }
            this.f121695h = this.f121692e.mo38783a(audioRecorderParam.getAudioUrl(), 0, this.f121692e.mo38860l(), false);
            if (this.f121697j != null && this.f121696i == -1) {
                mo119540a(this.f121697j, this.f121697j);
            }
            audioRecorderParam.setAudioRecordIndex(this.f121695h);
            return this.f121695h;
        }
    }

    /* renamed from: a */
    public final void mo119540a(C47466l lVar, C47466l lVar2) {
        boolean z = lVar2.f121873e;
        boolean z2 = lVar2.f121874f;
        if ("apply".equals(lVar2.f121872d)) {
            this.f121697j = lVar2;
            if (lVar2.f121875g != null) {
                Callable d = m148025d(lVar, lVar2, z, z2);
                C1591g a = m148013a(lVar2);
                if (this.f121700m) {
                    C1592h.m7855a(d, m148015a()).mo6876a(a, C1592h.f5958b);
                } else {
                    C1592h.m7859b(d).mo6876a(a, C1592h.f5958b);
                }
            }
        } else if ("clear".equals(lVar2.f121872d)) {
            this.f121697j = null;
            C47400b bVar = new C47400b(this, lVar, lVar2, z, z2);
            C1592h.m7855a((Callable<TResult>) bVar, m148015a()).mo6876a((C1591g<TResult, TContinuationResult>) new C47401c<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo119534a(C1592h hVar) throws Exception {
        this.f121689b.setValue(null);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo119535a(C47466l lVar, C1592h hVar) throws Exception {
        if (((Boolean) hVar.mo6890e()).booleanValue()) {
            AudioEffectParam audioEffectParam = lVar.f121875g;
            if (audioEffectParam != null) {
                audioEffectParam.setPreprocessResult(null);
                this.f121689b.setValue(audioEffectParam);
            }
        } else if (lVar.f121875g.getShowErrorToast() || C6399b.m19928c()) {
            C10761a.m31399c((Context) C35563c.f93238a, (int) R.string.p3).mo25750a();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo119533a(C47466l lVar, C47466l lVar2, boolean z, boolean z2) throws Exception {
        int i;
        m148024c(lVar, lVar2, z, z2);
        C45345b a = this.f121692e.mo38796a();
        AudioEffectParam audioEffectParam = lVar2.f121875g;
        boolean z3 = false;
        if (audioEffectParam == null || !C38527bf.m123172a(audioEffectParam.getEffectPath())) {
            return Boolean.valueOf(false);
        }
        int i2 = -1;
        if (!z2) {
            int trackType = z ? a.f116804i : audioEffectParam.getTrackType();
            int trackIndex = z ? a.f116803h : audioEffectParam.getTrackIndex();
            C15389d dVar = this.f121692e;
            String effectPath = audioEffectParam.getEffectPath();
            C39440c.m125973c();
            i = dVar.mo38759a(trackType, trackIndex, effectPath, C39440c.m125972a(audioEffectParam.getEffectPath()), audioEffectParam.getSeqIn(), audioEffectParam.getSeqOut(), C47405g.f121722a);
            if (z) {
                lVar2.f121870b.set(i);
            } else {
                lVar2.f121869a.set(i);
            }
        } else {
            i = -1;
        }
        if (this.f121695h >= 0) {
            C15389d dVar2 = this.f121692e;
            int i3 = this.f121695h;
            String effectPath2 = audioEffectParam.getEffectPath();
            C39440c.m125973c();
            i2 = dVar2.mo38759a(1, i3, effectPath2, C39440c.m125972a(audioEffectParam.getEffectPath()), audioEffectParam.getSeqIn(), audioEffectParam.getSeqOut(), C47406h.f121723a);
            this.f121696i = i2;
            lVar2.f121871c.set(i2);
        }
        if (i >= 0 || (this.f121695h >= 0 && i2 >= 0)) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    /* renamed from: a */
    public final boolean mo119549a(C47520y yVar, C47520y yVar2) {
        boolean z;
        if (this.f121691d != null) {
            z = this.f121691d.f121596a;
            if (!z) {
                this.f121691d.mo119465a(true);
            }
        } else {
            z = false;
        }
        if (yVar != null) {
            if ("1".equals(yVar.f121995a)) {
                this.f121688a.setValue(Boolean.valueOf(false));
            } else if ("2".equals(yVar.f121995a)) {
                this.f121692e.mo38853i(yVar.f121997c);
            } else if ("3".equals(yVar.f121995a)) {
                this.f121692e.mo38858k(yVar.f121997c);
            }
        }
        if ("1".equals(yVar2.f121995a)) {
            this.f121688a.setValue(Boolean.valueOf(true));
        } else if ("2".equals(yVar2.f121995a)) {
            int a = this.f121692e.mo38752a(0, 0, (int) yVar2.f121996b, 3, 600);
            if (a >= 0) {
                yVar2.f121997c = a;
            }
        } else if ("3".equals(yVar2.f121995a)) {
            int i = (int) yVar2.f121996b;
            float l = (float) this.f121692e.mo38860l();
            int i2 = (int) (0.2f * l);
            float f = l * 0.8f;
            if (((float) i) > f) {
                i = (int) f;
            }
            int a2 = this.f121692e.mo38751a(0, 0, i, i2, 0.5f, 1.333f);
            if (a2 >= 0) {
                yVar2.f121997c = a2;
            }
        }
        if (!z && this.f121691d != null) {
            this.f121691d.mo119465a(false);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo119542a(InfoStickerModel infoStickerModel) {
        String sb;
        int a;
        if (infoStickerModel == null || C6311g.m19573a(infoStickerModel.stickers)) {
            return false;
        }
        for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
            if (stickerItemModel == null) {
                if (C7163a.m22363a()) {
                    StringBuilder sb2 = new StringBuilder("VeSdk add infoSticker failed ");
                    sb2.append(infoStickerModel);
                    throw new IllegalStateException(sb2.toString());
                }
            } else if (!stickerItemModel.isSubtitle() && !stickerItemModel.isSubtitleRule()) {
                if (C7276d.m22812b(stickerItemModel.path)) {
                    sb = stickerItemModel.path;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(infoStickerModel.infoStickerDraftDir);
                    sb3.append(File.separator);
                    sb3.append(new File(stickerItemModel.path).getName());
                    sb = sb3.toString();
                }
                String str = sb;
                if (C7276d.m22812b(str)) {
                    if (!stickerItemModel.isImageStickerLayer) {
                        a = this.f121692e.mo38788a(str, TextUtils.isEmpty(stickerItemModel.extra) ? null : new String[]{stickerItemModel.extra});
                    } else if (this.f121693f == null || this.f121693f.canvasWidth <= 0 || this.f121693f.canvasHeight <= 0) {
                        a = this.f121692e.mo38780a(str, 0.0f, 0.0f, 1.0f, 1.0f);
                    } else {
                        a = this.f121692e.mo38818b(str, 0.0f, 0.0f, 1.0f, new BigDecimal((double) ((((float) this.f121693f.canvasHeight) * 1.0f) / ((float) this.f121693f.canvasWidth))).setScale(4, 4).floatValue());
                    }
                    int i = a;
                    StringBuilder sb4 = new StringBuilder("changeInfoSticker id = ");
                    sb4.append(i);
                    C41530am.m132285d(sb4.toString());
                    if (i != -1) {
                        if (!stickerItemModel.isPin() || !C38527bf.m123172a(stickerItemModel.pinAlgorithmFile)) {
                            this.f121692e.mo38749a(i, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
                            this.f121692e.mo38810b(i, stickerItemModel.scale);
                            this.f121692e.mo38748a(i, -stickerItemModel.rotateAngle);
                            this.f121692e.mo38813b(i, stickerItemModel.startTime, stickerItemModel.endTime);
                            this.f121692e.mo38838e(i, stickerItemModel.layerWeight);
                        } else {
                            this.f121692e.mo38813b(i, stickerItemModel.startTime, stickerItemModel.endTime);
                            this.f121692e.mo38838e(i, stickerItemModel.layerWeight);
                            ByteBuffer a2 = C39561am.m126376a(stickerItemModel.pinAlgorithmFile);
                            if (a2 != null) {
                                this.f121692e.mo38768a(i, a2);
                                m148022b();
                            }
                        }
                        if (stickerItemModel.isLyric()) {
                            this.f121692e.mo38758a(i, 0, stickerItemModel.mLyricInfo);
                            if (!TextUtils.isEmpty(stickerItemModel.mLyricFontPath)) {
                                this.f121692e.mo38815b(i, stickerItemModel.mLyricFontPath);
                            }
                            this.f121692e.mo38846g(i, stickerItemModel.mLyricColor);
                            this.f121692e.mo38814b(i, this.f121694g, stickerItemModel.mLyricInPoint, stickerItemModel.mLyricStartTime, stickerItemModel.mLyricOutPoint, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
                        }
                    } else if (C7163a.m22363a()) {
                        StringBuilder sb5 = new StringBuilder("VeSdk add infoSticker failed ");
                        sb5.append(infoStickerModel);
                        throw new IllegalStateException(sb5.toString());
                    }
                } else if (!C7163a.m22363a()) {
                    StringBuilder sb6 = new StringBuilder("infoSticker not exist ");
                    sb6.append(stickerItemModel);
                    C6921a.m21559a((Throwable) new Exception(sb6.toString()));
                } else {
                    StringBuilder sb7 = new StringBuilder("infoSticker not exist ");
                    sb7.append(infoStickerModel);
                    throw new IllegalStateException(sb7.toString());
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo119543a(InfoStickerModel infoStickerModel, HashMap<Integer, StickerItemModel> hashMap) {
        boolean z = false;
        if (infoStickerModel == null || C6311g.m19573a(infoStickerModel.stickers)) {
            return false;
        }
        hashMap.clear();
        for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
            if (stickerItemModel == null) {
                if (C7163a.m22363a()) {
                    StringBuilder sb = new StringBuilder("VeSdk add infoSticker failed ");
                    sb.append(infoStickerModel);
                    throw new IllegalStateException(sb.toString());
                }
            } else if (stickerItemModel.isSubtitle() || stickerItemModel.isSubtitleRule()) {
                z = true;
                int y = this.f121692e.mo38882y();
                if (y != -1) {
                    stickerItemModel.f83875id = y;
                    hashMap.put(Integer.valueOf(y), stickerItemModel);
                    this.f121692e.mo38749a(y, stickerItemModel.currentOffsetX, stickerItemModel.currentOffsetY);
                    this.f121692e.mo38810b(y, stickerItemModel.scale);
                    this.f121692e.mo38748a(y, -stickerItemModel.rotateAngle);
                    this.f121692e.mo38813b(y, stickerItemModel.startTime, stickerItemModel.endTime);
                    this.f121692e.mo38838e(y, stickerItemModel.layerWeight);
                } else if (C7163a.m22363a()) {
                    StringBuilder sb2 = new StringBuilder("VeSdk add subtitle failed ");
                    sb2.append(infoStickerModel);
                    throw new IllegalStateException(sb2.toString());
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo119541a(C29296g gVar) {
        if (C35563c.f93231M.mo93305a(Property.EnableFilterIntensityJust)) {
            C15389d dVar = this.f121692e;
            String b = gVar.mo74978b();
            C29230az azVar = this.f121699l;
            C15389d dVar2 = this.f121692e;
            dVar2.getClass();
            dVar.mo38817b(b, C29297h.m96116a(gVar, azVar, C47404f.m148047a(dVar2)));
        } else {
            this.f121692e.mo38779a(gVar.mo74978b(), 1.0f);
        }
        return false;
    }

    /* renamed from: a */
    private Executor m148015a() {
        if (this.f121704s == null) {
            this.f121704s = C47407i.m148051a();
        }
        return this.f121704s;
    }

    /* renamed from: b */
    private void m148022b() {
        if (this.f121701n == f121686o) {
            this.f121692e.mo38870q(this.f121702q);
            return;
        }
        if (this.f121701n == f121687p) {
            this.f121692e.mo38870q(1);
        }
    }

    /* renamed from: a */
    private C1591g<Boolean, Void> m148013a(C47466l lVar) {
        return new C47402d(this, lVar);
    }

    /* renamed from: b */
    private static IllegalStateException m148021b(int i) {
        StringBuilder sb = new StringBuilder("Seek failed. ret = ");
        sb.append(i);
        sb.append(" See logs for more details.");
        return new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static C47398a m148014a(int i) {
        if (i == 2) {
            return new C47412m();
        }
        if (i == 3) {
            return new C47411l();
        }
        if (i == 4) {
            return new C47414o();
        }
        if (i == 5) {
            return new C47413n();
        }
        if (i == 6) {
            return new C47409k();
        }
        return new C47408j();
    }

    /* renamed from: a */
    private void m148019a(boolean z) {
        String str;
        C15389d dVar = this.f121692e;
        if (z) {
            str = this.f121705t;
        } else {
            str = "";
        }
        dVar.mo38778a(str);
        StringBuilder sb = new StringBuilder("apply hdr enhance ");
        sb.append(z);
        C39509c.m126200a(this.f121703r, sb.toString());
    }

    /* renamed from: a */
    public final float mo119530a(String str) {
        return this.f121692e.mo38809b(str);
    }

    /* renamed from: a */
    private void m148016a(int i, ArrayList<EffectPointModel> arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((EffectPointModel) arrayList.get(i2)).getIndex() == i) {
                this.f121692e.mo38820b(new int[]{i});
                arrayList.remove(i2);
                return;
            }
        }
    }

    /* renamed from: a */
    private void m148017a(C47479s sVar, ArrayList<EffectPointModel> arrayList) {
        if (C6399b.m19944t()) {
            sVar.f121909a = this.f121692e.mo38807a(new int[]{(int) sVar.f121910b}, new int[]{(int) sVar.f121911c}, new String[]{sVar.f121915g});
        } else {
            sVar.f121909a = this.f121692e.mo38808a(new int[]{(int) sVar.f121910b}, new int[]{(int) sVar.f121911c}, new String[]{sVar.f121915g}, new int[]{0}, new int[]{0}, new String[]{sVar.f121920l});
        }
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setType(1);
        effectPointModel.setSelectColor(sVar.f121914f);
        effectPointModel.setIndex(sVar.f121909a[0]);
        effectPointModel.setResDir(sVar.f121915g);
        effectPointModel.setKey(sVar.f121916h);
        effectPointModel.setFromEnd(sVar.f121913e);
        effectPointModel.setStartPoint((int) sVar.f121910b);
        effectPointModel.setEndPoint((int) sVar.f121911c);
        effectPointModel.setName(sVar.f121917i);
        effectPointModel.setCategory(sVar.f121919k);
        effectPointModel.setExtra(sVar.f121920l);
        arrayList.add(effectPointModel);
    }

    /* renamed from: a */
    private void m148020a(boolean z, boolean z2) {
        String str;
        if (z2) {
            this.f121692e.mo38851h(z);
        } else {
            this.f121692e.mo38848g(z);
        }
        StringBuilder sb = new StringBuilder("apply light enhance ");
        sb.append(z);
        if (z2) {
            str = "is";
        } else {
            str = "is not";
        }
        sb.append(str);
        sb.append(" preview");
        C39509c.m126200a(this.f121703r, sb.toString());
    }

    /* renamed from: b */
    static final /* synthetic */ void m148023b(String str, int i, byte[] bArr) {
        if (i >= 0) {
            C39440c.m125973c();
            C39440c.m125970a(str, bArr);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m148018a(String str, int i, byte[] bArr) {
        if (i >= 0) {
            C39440c.m125973c();
            C39440c.m125970a(str, bArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo119550b(C47466l lVar, C47466l lVar2, boolean z, boolean z2) throws Exception {
        m148024c(lVar, lVar2, z, z2);
        return null;
    }

    /* renamed from: d */
    private Callable<Boolean> m148025d(C47466l lVar, C47466l lVar2, boolean z, boolean z2) {
        C47403e eVar = new C47403e(this, lVar, lVar2, z, z2);
        return eVar;
    }

    /* renamed from: c */
    private void m148024c(C47466l lVar, C47466l lVar2, boolean z, boolean z2) {
        int i;
        if (lVar != null) {
            if (z) {
                i = lVar.f121870b.get();
            } else {
                i = lVar.f121869a.get();
            }
            int[] iArr = z2 ? new int[]{lVar.f121871c.get()} : lVar.f121871c.get() > 0 ? new int[]{i, lVar.f121871c.get()} : new int[]{i};
            this.f121692e.mo38827c(iArr);
            if (z) {
                lVar2.mo119589a(lVar.f121869a);
            } else {
                lVar2.mo119590b(lVar.f121870b);
            }
        }
        if (z) {
            lVar2.f121870b.set(-1);
        } else {
            lVar2.f121869a.set(-1);
        }
    }
}
