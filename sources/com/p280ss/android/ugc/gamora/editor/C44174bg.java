package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.group.C12604b;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23318a;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39505b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39558aj;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39559ak;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39564ap;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39604b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractTrackPage;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a.C39545a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a.C39548d;
import com.p280ss.android.ugc.aweme.shortvideo.lyric.C40026b;
import com.p280ss.android.ugc.aweme.shortvideo.lyric.LyricEffectViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40380aj;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40696e.C40697a;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42046i.C42049a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42060b;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42088k;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42598h;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42605d;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47517w;
import dmt.p1861av.video.C47518x;
import dmt.p1861av.video.C47521z;
import dmt.p1861av.video.VEPreviewMusicParams;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import org.json.JSONArray;
import org.json.JSONObject;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.bg */
public final class C44174bg extends C12604b implements C40697a, C44396a {

    /* renamed from: L */
    public static final C44175a f114245L = new C44175a(null);

    /* renamed from: A */
    public EditStickerViewModel f114246A;

    /* renamed from: B */
    public VEVideoPublishEditViewModel f114247B;

    /* renamed from: C */
    public FrameLayout f114248C;

    /* renamed from: D */
    public FrameLayout f114249D;

    /* renamed from: E */
    public C47521z f114250E;

    /* renamed from: F */
    public EditStickerPanelViewModel f114251F;

    /* renamed from: G */
    public InfoStickerViewModel f114252G;

    /* renamed from: H */
    public C44179b f114253H;

    /* renamed from: I */
    public boolean f114254I;

    /* renamed from: J */
    public long f114255J;

    /* renamed from: K */
    public boolean f114256K;

    /* renamed from: M */
    private List<InteractStickerStruct> f114257M = new ArrayList();

    /* renamed from: N */
    private boolean f114258N;

    /* renamed from: j */
    public C44362u f114259j;

    /* renamed from: k */
    public C44295cr f114260k;

    /* renamed from: l */
    public C44378z f114261l;

    /* renamed from: m */
    public C44215br f114262m;

    /* renamed from: n */
    public C44054ap f114263n;

    /* renamed from: o */
    public C44284cn f114264o;

    /* renamed from: p */
    public C40380aj f114265p;

    /* renamed from: q */
    public C44005ae f114266q;

    /* renamed from: r */
    public EditViewModel f114267r;

    /* renamed from: s */
    public EditPoiStickerViewModel f114268s;

    /* renamed from: t */
    public VideoPublishEditModel f114269t;

    /* renamed from: u */
    public EditInfoStickerViewModel f114270u;

    /* renamed from: v */
    public EditTextStickerViewModel f114271v;

    /* renamed from: w */
    public EditVoteStickerViewModel f114272w;

    /* renamed from: x */
    public EditLyricStickerViewModel f114273x;

    /* renamed from: y */
    public LyricEffectViewModel f114274y;

    /* renamed from: z */
    public EditToolbarViewModel f114275z;

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$a */
    public static final class C44175a {
        private C44175a() {
        }

        public /* synthetic */ C44175a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$aa */
    static final class C44176aa<T> implements C0053p<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114276a;

        /* renamed from: b */
        final /* synthetic */ Effect f114277b;

        /* renamed from: c */
        final /* synthetic */ String f114278c;

        C44176aa(C44174bg bgVar, Effect effect, String str) {
            this.f114276a = bgVar;
            this.f114277b = effect;
            this.f114278c = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C7581n nVar) {
            if (C39360dw.m125725a().mo97931b() != null) {
                C44174bg bgVar = this.f114276a;
                AVMusic b = C39360dw.m125725a().mo97931b();
                if (b == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) b, "PublishManager.inst().getCurMusic()!!");
                bgVar.mo106696a(b, this.f114277b, this.f114278c, true);
            }
            this.f114276a.mo106683P().f103936c.removeObservers(this.f114276a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$ab */
    static final class C44177ab extends Lambda implements C7562b<C42605d, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114279a;

        /* renamed from: b */
        final /* synthetic */ Effect f114280b;

        /* renamed from: c */
        final /* synthetic */ String f114281c;

        /* renamed from: d */
        final /* synthetic */ int f114282d;

        C44177ab(C44174bg bgVar, Effect effect, String str, int i) {
            this.f114279a = bgVar;
            this.f114280b = effect;
            this.f114281c = str;
            this.f114282d = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m139882a((C42605d) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139882a(C42605d dVar) {
            C7573i.m23587b(dVar, "result");
            this.f114279a.mo106697a(this.f114280b, this.f114281c, dVar, this.f114282d);
            this.f114279a.mo106682O().mo106277i();
            this.f114279a.f114256K = false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$ac */
    static final class C44178ac extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114283a;

        /* renamed from: b */
        final /* synthetic */ int f114284b;

        C44178ac(C44174bg bgVar, int i) {
            this.f114283a = bgVar;
            this.f114284b = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m139883a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139883a() {
            this.f114283a.mo106712e(this.f114284b);
            this.f114283a.f114256K = false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$b */
    public interface C44179b {
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$c */
    public static final class C44180c implements C42598h {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114285a;

        /* renamed from: b */
        final /* synthetic */ AVMusic f114286b;

        /* renamed from: c */
        final /* synthetic */ Effect f114287c;

        /* renamed from: d */
        final /* synthetic */ String f114288d;

        /* renamed from: a */
        public final void mo104198a(int i, String str, JSONArray jSONArray) {
            Long l = null;
            if (jSONArray != null && !jSONArray.isNull(0)) {
                this.f114285a.mo106695a(this.f114286b, this.f114287c, this.f114288d, jSONArray);
                if (i == 2) {
                    String str2 = "aweme_type_download_lyric_rate";
                    C38510bb a = C38510bb.m123095a().mo96480a("duration", Long.valueOf(System.currentTimeMillis() - this.f114285a.f114255J));
                    String str3 = "music_id";
                    AVMusic aVMusic = this.f114286b;
                    if (aVMusic != null) {
                        l = Long.valueOf(aVMusic.f99664id);
                    }
                    C6893q.m21444a(str2, 0, a.mo96480a(str3, l).mo96482b());
                }
            } else if (i == 2) {
                C10761a.m31399c((Context) this.f114285a.f33526d_, (int) R.string.ak6).mo25750a();
                String str4 = "aweme_type_download_lyric_rate";
                C38510bb a2 = C38510bb.m123095a().mo96480a("duration", Long.valueOf(System.currentTimeMillis() - this.f114285a.f114255J));
                String str5 = "music_id";
                AVMusic aVMusic2 = this.f114286b;
                if (aVMusic2 != null) {
                    l = Long.valueOf(aVMusic2.f99664id);
                }
                C6893q.m21444a(str4, 1, a2.mo96480a(str5, l).mo96482b());
            }
        }

        C44180c(C44174bg bgVar, AVMusic aVMusic, Effect effect, String str) {
            this.f114285a = bgVar;
            this.f114286b = aVMusic;
            this.f114287c = effect;
            this.f114288d = str;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$d */
    static final class C44181d<T> implements C0053p<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114289a;

        /* renamed from: b */
        final /* synthetic */ AVMusic f114290b;

        /* renamed from: c */
        final /* synthetic */ String f114291c;

        /* renamed from: d */
        final /* synthetic */ JSONArray f114292d;

        C44181d(C44174bg bgVar, AVMusic aVMusic, String str, JSONArray jSONArray) {
            this.f114289a = bgVar;
            this.f114290b = aVMusic;
            this.f114291c = str;
            this.f114292d = jSONArray;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C7581n nVar) {
            Effect effect;
            C44174bg bgVar = this.f114289a;
            AVMusic aVMusic = this.f114290b;
            C44005ae aeVar = this.f114289a.f114266q;
            if (aeVar != null) {
                effect = aeVar.mo30922I();
            } else {
                effect = null;
            }
            bgVar.mo106695a(aVMusic, effect, this.f114291c, this.f114292d);
            this.f114289a.mo106683P().f103936c.removeObservers(this.f114289a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$e */
    static final class C44182e<T> implements C0053p<C47517w> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114293a;

        C44182e(C44174bg bgVar) {
            this.f114293a = bgVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C47517w wVar) {
            if (wVar != null) {
                if (wVar.f121981a == 1) {
                    this.f114293a.mo106678J().mo106443a(false, false);
                } else {
                    this.f114293a.mo106678J().mo106443a(true, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$f */
    static final class C44183f<T> implements C0053p<C47518x> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114294a;

        C44183f(C44174bg bgVar) {
            this.f114294a = bgVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C47518x xVar) {
            if (xVar != null) {
                if (xVar.f121991h == 1) {
                    this.f114294a.mo106678J().mo106443a(false, false);
                } else {
                    this.f114294a.mo106678J().mo106443a(true, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$g */
    public static final class C44184g extends C34861a {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114295a;

        /* renamed from: b */
        public final void mo74847b() {
            String str;
            super.mo74847b();
            this.f114295a.mo106678J().mo106443a(false, false);
            IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
            C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
            AVMusic curMusic = publishService.getCurMusic();
            String str2 = "edit_lyricsticker";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "video_eidt_page").mo59973a("creation_id", this.f114295a.mo106679L().creationId).mo59973a("shoot_way", this.f114295a.mo106679L().mShootWay);
            String str3 = "music_id";
            if (curMusic == null) {
                str = "";
            } else {
                str = curMusic.getMusicId();
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        }

        /* renamed from: d */
        public final void mo74768d() {
            if (this.f114295a.f114266q != null) {
                C44005ae aeVar = this.f114295a.f114266q;
                if (aeVar == null) {
                    C7573i.m23580a();
                }
                if (aeVar.f103984j) {
                    C44005ae aeVar2 = this.f114295a.f114266q;
                    if (aeVar2 == null) {
                        C7573i.m23580a();
                    }
                    aeVar2.f103984j = false;
                    C12629j jVar = this.f114295a.f33524c;
                    if (!(jVar instanceof C44082av)) {
                        jVar = null;
                    }
                    C44082av avVar = (C44082av) jVar;
                    if (avVar != null) {
                        avVar.mo106599a(true);
                    }
                    return;
                }
            }
            if (this.f114295a.f114266q != null) {
                C44005ae aeVar3 = this.f114295a.f114266q;
                if (aeVar3 == null) {
                    C7573i.m23580a();
                }
                if (aeVar3.f103985k) {
                    C44005ae aeVar4 = this.f114295a.f114266q;
                    if (aeVar4 == null) {
                        C7573i.m23580a();
                    }
                    aeVar4.f103985k = false;
                    return;
                }
            }
            C0052o<Boolean> oVar = this.f114295a.mo106688U().f102671c;
            C7573i.m23582a((Object) oVar, "mInfoStickerViewModel.inTimeEditView");
            Object value = oVar.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (!((Boolean) value).booleanValue()) {
                this.f114295a.mo106678J().mo106443a(true, false);
            }
            this.f114295a.mo106691X();
        }

        C44184g(C44174bg bgVar) {
            this.f114295a = bgVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$h */
    static final class C44185h<T> implements C0053p<C44297cs> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114296a;

        C44185h(C44174bg bgVar) {
            this.f114296a = bgVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C44297cs csVar) {
            if (csVar != null) {
                this.f114296a.mo106698a(csVar.f114470a, csVar.f114471b, csVar.f114472c, 2);
                C6907h.m21524a("enter_lyricsticker_song_search", (Map) C22984d.m75611a().mo59973a("creation_id", this.f114296a.mo106679L().creationId).mo59973a("shoot_way", this.f114296a.mo106679L().mShootWay).mo59973a("previous_page", "lyrics_edit_page").f60753a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$i */
    static final class C44186i extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114297a;

        C44186i(C44174bg bgVar) {
            this.f114297a = bgVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139891a((C11585f) obj, (Boolean) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139891a(C11585f fVar, Boolean bool) {
            C7573i.m23587b(fVar, "$receiver");
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    this.f114297a.mo106684Q().mo106364h().setValue(Boolean.valueOf(false));
                    C44378z zVar = this.f114297a.f114261l;
                    if (zVar != null) {
                        C44005ae aeVar = this.f114297a.f114266q;
                        if (aeVar == null) {
                            C7573i.m23580a();
                        }
                        zVar.mo106813a((C39545a) aeVar.f113873y, true);
                    }
                } else {
                    this.f114297a.mo106684Q().mo106364h().setValue(Boolean.valueOf(true));
                    C44378z zVar2 = this.f114297a.f114261l;
                    if (zVar2 != null) {
                        C44005ae aeVar2 = this.f114297a.f114266q;
                        if (aeVar2 == null) {
                            C7573i.m23580a();
                        }
                        zVar2.mo106813a((C39545a) aeVar2.f113873y, false);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$j */
    static final class C44187j extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114298a;

        C44187j(C44174bg bgVar) {
            this.f114298a = bgVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139892a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139892a(C44396a aVar, C7581n nVar) {
            int i;
            int i2;
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            C44005ae aeVar = this.f114298a.f114266q;
            if (aeVar == null) {
                C7573i.m23580a();
            }
            if (aeVar.f113873y != null) {
                C44005ae aeVar2 = this.f114298a.f114266q;
                if (aeVar2 == null) {
                    C7573i.m23580a();
                }
                C39558aj ajVar = aeVar2.f113873y;
                if (ajVar == null) {
                    C7573i.m23580a();
                }
                StickerItemModel stickerItemModel = ajVar.f102708c;
                C44005ae aeVar3 = this.f114298a.f114266q;
                int i3 = 0;
                if (aeVar3 != null) {
                    i = aeVar3.f113867B;
                } else {
                    i = 0;
                }
                stickerItemModel.mLyricInPoint = i;
                C44005ae aeVar4 = this.f114298a.f114266q;
                if (aeVar4 != null) {
                    i2 = aeVar4.f113868C;
                } else {
                    i2 = 0;
                }
                stickerItemModel.mLyricStartTime = i2;
                C44005ae aeVar5 = this.f114298a.f114266q;
                if (aeVar5 != null) {
                    i3 = aeVar5.f113869D;
                }
                stickerItemModel.mLyricOutPoint = i3;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$k */
    public static final class C44188k extends C42060b {
        C44188k() {
        }

        /* renamed from: c */
        public final boolean mo96392c(MotionEvent motionEvent) {
            return super.mo96392c(motionEvent);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$l */
    static final class C44189l extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114299a;

        C44189l(C44174bg bgVar) {
            this.f114299a = bgVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139894a((C11585f) obj, (Integer) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139894a(C11585f fVar, Integer num) {
            String str;
            C7573i.m23587b(fVar, "$receiver");
            if (num != null) {
                int intValue = num.intValue();
                C44378z zVar = this.f114299a.f114261l;
                if (zVar != null) {
                    C44005ae aeVar = this.f114299a.f114266q;
                    if (aeVar == null) {
                        C7573i.m23580a();
                    }
                    zVar.mo106810a(aeVar.mo106508L(), intValue);
                }
                C44005ae aeVar2 = this.f114299a.f114266q;
                if (aeVar2 == null) {
                    C7573i.m23580a();
                }
                if (aeVar2.f113873y != null) {
                    C44005ae aeVar3 = this.f114299a.f114266q;
                    if (aeVar3 == null) {
                        C7573i.m23580a();
                    }
                    C39558aj ajVar = aeVar3.f113873y;
                    if (ajVar == null) {
                        C7573i.m23580a();
                    }
                    ajVar.f102708c.mLyricColor = intValue;
                }
                IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
                C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
                AVMusic curMusic = publishService.getCurMusic();
                String str2 = "select_lyricsticker_color";
                C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f114299a.mo106679L().creationId).mo59973a("shoot_way", this.f114299a.mo106679L().mShootWay);
                String str3 = "music_id";
                if (curMusic == null) {
                    str = "";
                } else {
                    str = curMusic.getMusicId();
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59970a("color_id", intValue).f60753a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$m */
    static final class C44190m extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114300a;

        C44190m(C44174bg bgVar) {
            this.f114300a = bgVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139895a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x007a, code lost:
            if (r1 == null) goto L_0x007c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m139895a(com.p280ss.android.ugc.gamora.jedi.C44396a r4, kotlin.C7581n r5) {
            /*
                r3 = this;
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.C7573i.m23587b(r4, r0)
                java.lang.String r4 = "it"
                kotlin.jvm.internal.C7573i.m23587b(r5, r4)
                com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r5 = com.p280ss.android.ugc.aweme.services.IAVService.class
                java.lang.Object r4 = r4.getService(r5)
                com.ss.android.ugc.aweme.services.IAVService r4 = (com.p280ss.android.ugc.aweme.services.IAVService) r4
                com.ss.android.ugc.aweme.services.video.IAVPublishService r4 = r4.publishService()
                java.lang.String r5 = "ServiceManager.get().get…ss.java).publishService()"
                kotlin.jvm.internal.C7573i.m23582a(r4, r5)
                com.ss.android.ugc.aweme.shortvideo.AVMusic r4 = r4.getCurMusic()
                java.lang.String r5 = "select_lyricsticker_clip"
                com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r1 = "creation_id"
                com.ss.android.ugc.gamora.editor.bg r2 = r3.f114300a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r2.mo106679L()
                java.lang.String r2 = r2.creationId
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "shoot_way"
                com.ss.android.ugc.gamora.editor.bg r2 = r3.f114300a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r2.mo106679L()
                java.lang.String r2 = r2.mShootWay
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "music_id"
                if (r4 != 0) goto L_0x004c
                java.lang.String r4 = ""
                goto L_0x0050
            L_0x004c:
                java.lang.String r4 = r4.getMusicId()
            L_0x0050:
                com.ss.android.ugc.aweme.app.g.d r4 = r0.mo59973a(r1, r4)
                java.lang.String r0 = "dynamics"
                com.ss.android.ugc.gamora.editor.bg r1 = r3.f114300a
                com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel r1 = r1.mo106682O()
                com.ss.android.ugc.gamora.editor.bg r2 = r3.f114300a
                android.app.Activity r2 = r2.f33526d_
                if (r2 == 0) goto L_0x0088
                android.support.v4.app.FragmentActivity r2 = (android.support.p022v4.app.FragmentActivity) r2
                android.arch.lifecycle.i r2 = (android.arch.lifecycle.C0043i) r2
                com.bytedance.jedi.arch.t r1 = r1.mo106825a(r2)
                com.ss.android.ugc.gamora.editor.EditLyricStickerState r1 = (com.p280ss.android.ugc.gamora.editor.EditLyricStickerState) r1
                com.ss.android.ugc.gamora.editor.ct r1 = r1.getCurLyricEffect()
                if (r1 == 0) goto L_0x007c
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.f114473a
                if (r1 == 0) goto L_0x007c
                java.lang.String r1 = r1.getName()
                if (r1 != 0) goto L_0x007e
            L_0x007c:
                java.lang.String r1 = "经典"
            L_0x007e:
                com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r0, r1)
                java.util.Map<java.lang.String, java.lang.String> r4 = r4.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r5, r4)
                return
            L_0x0088:
                kotlin.TypeCastException r4 = new kotlin.TypeCastException
                java.lang.String r5 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44174bg.C44190m.m139895a(com.ss.android.ugc.gamora.jedi.a, kotlin.n):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$n */
    static final class C44191n extends Lambda implements C7563m<C11585f, C44298ct, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114301a;

        C44191n(C44174bg bgVar) {
            this.f114301a = bgVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139896a((C11585f) obj, (C44298ct) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139896a(C11585f fVar, C44298ct ctVar) {
            Effect effect;
            int i;
            int i2;
            int i3;
            int i4;
            String str;
            C7573i.m23587b(fVar, "$receiver");
            if (ctVar != null) {
                C44174bg bgVar = this.f114301a;
                AVMusic b = C39360dw.m125725a().mo97931b();
                if (b == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) b, "PublishManager.inst().getCurMusic()!!");
                EditLyricStickerViewModel O = this.f114301a.mo106682O();
                Activity activity = this.f114301a.f33526d_;
                if (activity != null) {
                    C44298ct curLyricEffect = ((EditLyricStickerState) O.mo106825a((FragmentActivity) activity)).getCurLyricEffect();
                    if (curLyricEffect != null) {
                        effect = curLyricEffect.f114473a;
                    } else {
                        effect = null;
                    }
                    bgVar.mo106696a(b, effect, (String) null, false);
                    C0052o u = this.f114301a.mo106685R().mo119529u();
                    C7573i.m23582a((Object) u, "publishEditViewModel.lyricAudioTimeLiveData");
                    C44005ae aeVar = this.f114301a.f114266q;
                    if (aeVar != null) {
                        i = aeVar.mo106508L();
                    } else {
                        i = -1;
                    }
                    C44005ae aeVar2 = this.f114301a.f114266q;
                    if (aeVar2 != null) {
                        i2 = aeVar2.f113867B;
                    } else {
                        i2 = 0;
                    }
                    C44005ae aeVar3 = this.f114301a.f114266q;
                    if (aeVar3 != null) {
                        i3 = aeVar3.f113868C;
                    } else {
                        i3 = 0;
                    }
                    C44005ae aeVar4 = this.f114301a.f114266q;
                    if (aeVar4 != null) {
                        i4 = aeVar4.f113869D;
                    } else {
                        i4 = 0;
                    }
                    C40026b bVar = new C40026b(i, i2, i3, i4, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
                    u.setValue(bVar);
                    IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
                    C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
                    AVMusic curMusic = publishService.getCurMusic();
                    String str2 = "select_lyricsticker_dynamics";
                    C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f114301a.mo106679L().creationId).mo59973a("shoot_way", this.f114301a.mo106679L().mShootWay);
                    String str3 = "music_id";
                    if (curMusic == null) {
                        str = "";
                    } else {
                        str = curMusic.getMusicId();
                    }
                    C22984d a2 = a.mo59973a(str3, str);
                    String str4 = "dynamics";
                    String name = ctVar.f114473a.getName();
                    if (name == null) {
                        name = "";
                    }
                    C6907h.m21524a(str2, (Map) a2.mo59973a(str4, name).f60753a);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$o */
    static final class C44192o extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114302a;

        C44192o(C44174bg bgVar) {
            this.f114302a = bgVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139897a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139897a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            C44378z zVar = this.f114302a.f114261l;
            if (zVar != null) {
                C44005ae aeVar = this.f114302a.f114266q;
                if (aeVar == null) {
                    C7573i.m23580a();
                }
                zVar.mo106824f(aeVar.mo106508L());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$p */
    static final class C44193p<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114303a;

        C44193p(C44174bg bgVar) {
            this.f114303a = bgVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C44174bg bgVar = this.f114303a;
                C7573i.m23582a((Object) bool, "it");
                bgVar.mo106709b(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$q */
    static final class C44194q extends Lambda implements C7563m<C44396a, Triple<? extends Float, ? extends Float, ? extends Float>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114304a;

        C44194q(C44174bg bgVar) {
            this.f114304a = bgVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139899a((C44396a) obj, (Triple) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139899a(C44396a aVar, Triple<Float, Float, Float> triple) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(triple, "it");
            C44065ar.m139483a(this.f114304a.mo106687T(), ((Number) triple.getFirst()).floatValue(), ((Number) triple.getSecond()).floatValue(), ((Number) triple.getThird()).floatValue());
            C44065ar.m139483a(this.f114304a.mo106686S(), ((Number) triple.getFirst()).floatValue(), ((Number) triple.getSecond()).floatValue(), ((Number) triple.getThird()).floatValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$r */
    static final class C44195r<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114305a;

        C44195r(C44174bg bgVar) {
            this.f114305a = bgVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C44174bg bgVar = this.f114305a;
                C7573i.m23582a((Object) bool, "it");
                bgVar.mo106710c(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$s */
    static final class C44196s<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114306a;

        C44196s(C44174bg bgVar) {
            this.f114306a = bgVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C44174bg bgVar = this.f114306a;
                C7573i.m23582a((Object) bool, "it");
                bgVar.mo106711d(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$t */
    static final class C44197t extends Lambda implements C7563m<C11585f, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114307a;

        C44197t(C44174bg bgVar) {
            this.f114307a = bgVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139902a((C11585f) obj, (Integer) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139902a(C11585f fVar, Integer num) {
            C7573i.m23587b(fVar, "$receiver");
            if (num != null) {
                int intValue = num.intValue();
                View b = this.f114307a.mo31002b((int) R.id.dwi);
                if (b != null) {
                    LayoutParams layoutParams = b.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = intValue;
                        b.setLayoutParams(marginLayoutParams);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$u */
    static final class C44198u<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114308a;

        C44198u(C44174bg bgVar) {
            this.f114308a = bgVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (this.f114308a.f114266q != null) {
                C44005ae aeVar = this.f114308a.f114266q;
                if (aeVar == null) {
                    C7573i.m23580a();
                }
                if (aeVar.mo106508L() > 0) {
                    C44378z zVar = this.f114308a.f114261l;
                    if (zVar != null) {
                        C44005ae aeVar2 = this.f114308a.f114266q;
                        if (aeVar2 == null) {
                            C7573i.m23580a();
                        }
                        zVar.mo106822d(aeVar2.mo106508L());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$v */
    static final class C44199v<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114309a;

        C44199v(C44174bg bgVar) {
            this.f114309a = bgVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (this.f114309a.f114266q != null) {
                C44005ae aeVar = this.f114309a.f114266q;
                if (aeVar == null) {
                    C7573i.m23580a();
                }
                if (aeVar.mo106508L() > 0) {
                    C44378z zVar = this.f114309a.f114261l;
                    if (zVar != null) {
                        C44005ae aeVar2 = this.f114309a.f114266q;
                        if (aeVar2 == null) {
                            C7573i.m23580a();
                        }
                        zVar.mo106823e(aeVar2.mo106508L());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$w */
    static final class C44200w extends Lambda implements C7563m<C44396a, Pair<? extends Float, ? extends Long>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114310a;

        C44200w(C44174bg bgVar) {
            this.f114310a = bgVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139905a((C44396a) obj, (Pair) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139905a(C44396a aVar, Pair<Float, Long> pair) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(pair, "it");
            C44065ar.m139484a(this.f114310a.mo106687T(), ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).longValue());
            C44065ar.m139484a(this.f114310a.mo106686S(), ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).longValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$x */
    public static final class C44201x implements C42049a {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114311a;

        /* renamed from: a */
        public final void mo103279a(C42088k kVar) {
            C7573i.m23587b(kVar, "view");
        }

        /* renamed from: b */
        public final void mo103281b(C42088k kVar) {
            C7573i.m23587b(kVar, "view");
        }

        /* renamed from: c */
        public final void mo103282c(C42088k kVar) {
            C7573i.m23587b(kVar, "view");
        }

        C44201x(C44174bg bgVar) {
            this.f114311a = bgVar;
        }

        /* renamed from: a */
        public final void mo103280a(C42088k kVar, int i, int i2, boolean z, boolean z2, boolean z3) {
            C7573i.m23587b(kVar, "view");
            if (z) {
                if (!z3) {
                    this.f114311a.mo106678J().mo106443a(true, true);
                }
                this.f114311a.f114254I = false;
                return;
            }
            if (!this.f114311a.f114254I) {
                this.f114311a.mo106678J().mo106443a(false, true);
                this.f114311a.mo106680M().mo29069f();
                this.f114311a.mo106681N().mo29069f();
                this.f114311a.mo96987K().mo29069f();
                this.f114311a.mo106689V();
                C44378z zVar = this.f114311a.f114261l;
                if (!(zVar == null || zVar.mo30921H() == null)) {
                    zVar.mo30922I();
                }
            }
            this.f114311a.f114254I = true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$y */
    static final class C44202y<T> implements C23319b<C42088k> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114312a;

        C44202y(C44174bg bgVar) {
            this.f114312a = bgVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C42088k kVar) {
            this.f114312a.mo106689V();
            C44378z zVar = this.f114312a.f114261l;
            if (zVar != null) {
                zVar.mo106814a((C39548d<?>) kVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.bg$z */
    static final class C44203z<T, U> implements C23318a<C42088k, C42088k> {

        /* renamed from: a */
        final /* synthetic */ C44174bg f114313a;

        C44203z(C44174bg bgVar) {
            this.f114313a = bgVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo60605a(C42088k kVar, C42088k kVar2) {
            C44215br brVar = this.f114313a.f114262m;
            if (brVar != null && brVar.mo106717O()) {
                C44378z zVar = this.f114313a.f114261l;
                if (zVar != null) {
                    zVar.mo106819b((C39548d<?>) kVar2);
                }
                C44378z zVar2 = this.f114313a.f114261l;
                if (zVar2 != null) {
                    zVar2.mo30922I();
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
    }

    /* renamed from: a */
    public final void mo106700a(C44362u uVar) {
        C7573i.m23587b(uVar, "<set-?>");
        this.f114259j = uVar;
    }

    /* renamed from: a */
    public final void mo106699a(C44295cr crVar) {
        C7573i.m23587b(crVar, "<set-?>");
        this.f114260k = crVar;
    }

    /* renamed from: a */
    public final void mo106701a(boolean z) {
        if (this.f114261l != null) {
            C44378z zVar = this.f114261l;
            if (zVar != null) {
                zVar.mo106821c(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo106694a(MarginLayoutParams marginLayoutParams, int i, int i2) {
        C7573i.m23587b(marginLayoutParams, "params");
        C44054ap apVar = this.f114263n;
        if (apVar != null) {
            EditViewModel editViewModel = this.f114267r;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            apVar.mo106564b(editViewModel.mo106459t());
        }
        C44215br brVar = this.f114262m;
        if (brVar != null) {
            EditViewModel editViewModel2 = this.f114267r;
            if (editViewModel2 == null) {
                C7573i.m23583a("editViewModel");
            }
            brVar.mo106734b(editViewModel2.mo106459t());
        }
        C44378z zVar = this.f114261l;
        if (zVar != null) {
            zVar.mo106811a(i, i2, new int[]{marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin});
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0104  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100875a(com.p280ss.android.ugc.effectmanager.effect.model.Effect r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "effect"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            r5.mo106689V()
            r5.mo106690W()
            com.ss.android.ugc.gamora.editor.z r0 = r5.f114261l
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0039
            com.ss.android.ugc.gamora.editor.z r0 = r5.f114261l
            if (r0 != 0) goto L_0x0018
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0018:
            com.ss.android.ugc.gamora.editor.cn r3 = r5.f114264o
            if (r3 == 0) goto L_0x0024
            boolean r3 = r3.mo106764O()
            if (r3 != r2) goto L_0x0024
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            com.ss.android.ugc.gamora.editor.ap r4 = r5.f114263n
            if (r4 == 0) goto L_0x0031
            boolean r4 = r4.mo106550N()
            if (r4 != r2) goto L_0x0031
            r4 = 1
            goto L_0x0032
        L_0x0031:
            r4 = 0
        L_0x0032:
            boolean r0 = r0.mo106818a(r3, r4)
            if (r0 == 0) goto L_0x0039
            return
        L_0x0039:
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r5.f114267r
            if (r0 != 0) goto L_0x0042
            java.lang.String r3 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0042:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.ah r0 = r0.mo106447h()
            android.app.Activity r3 = r5.f33526d_
            if (r3 == 0) goto L_0x018c
            android.support.v4.app.FragmentActivity r3 = (android.support.p022v4.app.FragmentActivity) r3
            r0.mo100868a(r3, r6)
            r5.f114258N = r1
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40814t.m130427c(r6)
            if (r0 == 0) goto L_0x0061
            com.ss.android.ugc.gamora.editor.ap r7 = r5.f114263n
            if (r7 == 0) goto L_0x0060
            r7.mo106557a(r6)
            goto L_0x018b
        L_0x0060:
            return
        L_0x0061:
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40814t.m130428d(r6)
            if (r0 == 0) goto L_0x007d
            com.ss.android.ugc.gamora.editor.cn r7 = r5.f114264o
            if (r7 == 0) goto L_0x006e
            r7.mo106765P()
        L_0x006e:
            com.ss.android.ugc.gamora.editor.cn r7 = r5.f114264o
            if (r7 == 0) goto L_0x0079
            java.lang.String r6 = r6.getEffectId()
            r7.mo106772a(r6)
        L_0x0079:
            r5.m139821an()
            return
        L_0x007d:
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40814t.m130429e(r6)
            if (r0 == 0) goto L_0x0177
            com.ss.android.ugc.gamora.editor.ae r0 = r5.f114266q
            if (r0 == 0) goto L_0x008a
            r0.mo99483a(r6, r7)
        L_0x008a:
            r5.f114258N = r2
            boolean r0 = r5.m139820am()
            if (r0 != 0) goto L_0x010d
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            if (r0 == 0) goto L_0x010d
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            if (r0 != 0) goto L_0x00a9
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00a9:
            java.lang.String r3 = "PublishManager.inst().getCurMusic()!!"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            java.lang.String r0 = r0.getLrcUrl()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x010d
            com.ss.android.ugc.gamora.editor.ae r0 = r5.f114266q
            if (r0 == 0) goto L_0x00c9
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.mo99480a(r6)
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = r0.getUnzipPath()
            goto L_0x00ca
        L_0x00c9:
            r0 = 0
        L_0x00ca:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00eb
            com.ss.android.ugc.aweme.shortvideo.lyric.LyricEffectViewModel r0 = r5.f114274y
            if (r0 != 0) goto L_0x00db
            java.lang.String r3 = "lyricEffectViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00db:
            android.arch.lifecycle.o<kotlin.n> r0 = r0.f103936c
            r3 = r5
            android.arch.lifecycle.i r3 = (android.arch.lifecycle.C0043i) r3
            com.ss.android.ugc.gamora.editor.bg$aa r4 = new com.ss.android.ugc.gamora.editor.bg$aa
            r4.<init>(r5, r6, r7)
            android.arch.lifecycle.p r4 = (android.arch.lifecycle.C0053p) r4
            r0.observe(r3, r4)
            goto L_0x0100
        L_0x00eb:
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            if (r0 != 0) goto L_0x00f8
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00f8:
            java.lang.String r3 = "PublishManager.inst().getCurMusic()!!"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r5.mo106696a(r0, r6, r7, r2)
        L_0x0100:
            com.ss.android.ugc.gamora.editor.EditViewModel r6 = r5.f114267r
            if (r6 != 0) goto L_0x0109
            java.lang.String r7 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r7)
        L_0x0109:
            r6.mo106443a(r2, r1)
            return
        L_0x010d:
            r5.f114256K = r2
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            if (r0 == 0) goto L_0x013e
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            if (r0 != 0) goto L_0x0126
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0126:
            java.lang.String r3 = "PublishManager.inst().getCurMusic()!!"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            java.lang.String r0 = r0.getLrcUrl()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x013e
            boolean r0 = r5.m139820am()
            if (r0 != 0) goto L_0x013e
            r1 = 1
        L_0x013e:
            r5.mo106698a(r6, r7, r1, r2)
            java.lang.String r6 = "enter_lyricsticker_song_search"
            com.ss.android.ugc.aweme.app.g.d r7 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r0 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f114269t
            if (r1 != 0) goto L_0x0152
            java.lang.String r2 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0152:
            java.lang.String r1 = r1.creationId
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r0, r1)
            java.lang.String r0 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f114269t
            if (r1 != 0) goto L_0x0163
            java.lang.String r2 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0163:
            java.lang.String r1 = r1.mShootWay
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r0, r1)
            java.lang.String r0 = "previous_page"
            java.lang.String r1 = "video_edit_page"
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r6, r7)
            return
        L_0x0177:
            com.ss.android.ugc.gamora.editor.z r0 = r5.f114261l
            if (r0 == 0) goto L_0x018b
            java.lang.String r1 = r6.getEffectId()
            java.lang.String r2 = r6.getUnzipPath()
            int r6 = r6.getEffectType()
            r0.mo106817a(r1, r2, r7, r6)
            return
        L_0x018b:
            return
        L_0x018c:
            kotlin.TypeCastException r6 = new kotlin.TypeCastException
            java.lang.String r7 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44174bg.mo100875a(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106698a(com.p280ss.android.ugc.effectmanager.effect.model.Effect r19, java.lang.String r20, boolean r21, int r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r22
            com.ss.android.ugc.gamora.editor.EditViewModel r2 = r0.f114267r
            if (r2 != 0) goto L_0x000d
            java.lang.String r3 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x000d:
            r3 = 0
            r2.mo106443a(r3, r3)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f114269t
            if (r2 != 0) goto L_0x001a
            java.lang.String r4 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x001a:
            java.lang.String r2 = r2.mStickerID
            r4 = 0
            if (r2 == 0) goto L_0x003b
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.String r2 = ","
            r6[r3] = r2
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r2 = kotlin.text.C7634n.m23768b(r5, r6, false, 0)
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = kotlin.collections.C7525m.m23504c(r2, r3)
            java.lang.String r2 = (java.lang.String) r2
            r9 = r2
            goto L_0x003c
        L_0x003b:
            r9 = r4
        L_0x003c:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f114269t
            if (r2 != 0) goto L_0x0045
            java.lang.String r5 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x0045:
            java.util.List r2 = r2.challenges
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)
            if (r2 != 0) goto L_0x0062
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f114269t
            if (r2 != 0) goto L_0x0058
            java.lang.String r4 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0058:
            java.util.List r2 = r2.challenges
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r2 = (com.p280ss.android.ugc.aweme.shortvideo.AVChallenge) r2
            java.lang.String r4 = r2.cid
        L_0x0062:
            r10 = r4
            dmt.av.video.z r5 = r0.f114250E
            if (r5 != 0) goto L_0x006c
            java.lang.String r2 = "mEnvironment"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x006c:
            android.app.Activity r2 = r0.f33526d_
            if (r2 == 0) goto L_0x00c2
            android.support.v4.app.FragmentActivity r2 = (android.support.p022v4.app.FragmentActivity) r2
            r6 = r2
            android.app.Activity r6 = (android.app.Activity) r6
            r7 = 110(0x6e, float:1.54E-43)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f114269t
            if (r2 != 0) goto L_0x0080
            java.lang.String r3 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0080:
            java.lang.String r8 = r2.mFirstStickerMusicIdsJson
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f114269t
            if (r2 != 0) goto L_0x008b
            java.lang.String r3 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x008b:
            boolean r11 = r2.isAllowClearMusic()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f114269t
            if (r2 != 0) goto L_0x0098
            java.lang.String r3 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0098:
            java.lang.String r12 = r2.mShootWay
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r0.f114269t
            if (r2 != 0) goto L_0x00a3
            java.lang.String r3 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00a3:
            java.lang.String r13 = r2.creationId
            r14 = 1
            com.ss.android.ugc.gamora.editor.bg$ab r2 = new com.ss.android.ugc.gamora.editor.bg$ab
            r3 = r19
            r4 = r20
            r2.<init>(r0, r3, r4, r1)
            r16 = r2
            kotlin.jvm.a.b r16 = (kotlin.jvm.p357a.C7562b) r16
            com.ss.android.ugc.gamora.editor.bg$ac r2 = new com.ss.android.ugc.gamora.editor.bg$ac
            r2.<init>(r0, r1)
            r17 = r2
            kotlin.jvm.a.a r17 = (kotlin.jvm.p357a.C7561a) r17
            r15 = r21
            r5.mo98360a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x00c2:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44174bg.mo106698a(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String, boolean, int):void");
    }

    /* renamed from: a */
    public final void mo106697a(Effect effect, String str, C42605d dVar, int i) {
        AVMusic aVMusic = dVar.f110763c;
        if (aVMusic == null) {
            C7573i.m23580a();
        }
        mo106696a(aVMusic, effect, str, i == 1);
        C12629j jVar = this.f33524c;
        if (!(jVar instanceof C44082av)) {
            jVar = null;
        }
        C44082av avVar = (C44082av) jVar;
        if (avVar != null) {
            C44294cq O = avVar.mo106580O();
            if (O != null) {
                O.mo106512a(dVar);
            }
        }
        VideoPublishEditModel videoPublishEditModel = this.f114269t;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        videoPublishEditModel.mMusicOrigin = "edit_page_lyricsticker";
        EditViewModel editViewModel = this.f114267r;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106443a(true, false);
    }

    /* renamed from: a */
    public final void mo106696a(AVMusic aVMusic, Effect effect, String str, boolean z) {
        new C39564ap().mo98510d(!z);
        this.f114255J = System.currentTimeMillis();
        if (TextUtils.isEmpty(aVMusic.getLrcUrl())) {
            C10761a.m31399c((Context) this.f33526d_, (int) R.string.ak6).mo25750a();
            C6893q.m21444a("aweme_type_download_lyric_rate", 1, C38510bb.m123095a().mo96480a("duration", Long.valueOf(System.currentTimeMillis() - this.f114255J)).mo96480a("music_id", aVMusic != null ? Long.valueOf(aVMusic.f99664id) : null).mo96481a("lrc_url", "").mo96482b());
            return;
        }
        IAVMusicService iAVMusicService = C35563c.f93246i;
        String lrcUrl = aVMusic.getLrcUrl();
        C7573i.m23582a((Object) lrcUrl, "music.lrcUrl");
        iAVMusicService.mo103857a(lrcUrl, aVMusic.getLrcType(), (C42598h) new C44180c(this, aVMusic, effect, str));
    }

    /* renamed from: a */
    public final void mo106695a(AVMusic aVMusic, Effect effect, String str, JSONArray jSONArray) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C39558aj ajVar = null;
        if (effect == null) {
            C44005ae aeVar = this.f114266q;
            if ((aeVar != null ? aeVar.mo30922I() : null) == null) {
                LyricEffectViewModel lyricEffectViewModel = this.f114274y;
                if (lyricEffectViewModel == null) {
                    C7573i.m23583a("lyricEffectViewModel");
                }
                lyricEffectViewModel.f103936c.observe(this, new C44181d(this, aVMusic, str, jSONArray));
                return;
            }
        }
        if (effect == null) {
            C44005ae aeVar2 = this.f114266q;
            effect = aeVar2 != null ? aeVar2.mo30922I() : null;
        }
        JSONObject put = new JSONObject().put("header", new JSONObject().put("title", aVMusic.musicName).put("artist", aVMusic.getSinger()).put("musicBy", "").put("writtenBy", "")).put(C38347c.f99553h, jSONArray);
        if (effect == null) {
            VideoPublishEditModel videoPublishEditModel = this.f114269t;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("publishEditModel");
            }
            InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
            C7573i.m23582a((Object) infoStickerModel, "publishEditModel.infoStickerModel");
            StickerItemModel lyricStickerModel = infoStickerModel.getLyricStickerModel();
            str2 = lyricStickerModel.mLyricFontPath;
            String str7 = lyricStickerModel.stickerId;
            String str8 = lyricStickerModel.path;
            str3 = lyricStickerModel.extra;
            str5 = str7;
            str4 = str8;
        } else {
            C44005ae aeVar3 = this.f114266q;
            if (aeVar3 != null) {
                Effect a = aeVar3.mo99480a(effect);
                if (a != null) {
                    str6 = a.getUnzipPath();
                    String effectId = effect.getEffectId();
                    str4 = effect.getUnzipPath();
                    str3 = str;
                    str2 = str6;
                    str5 = effectId;
                }
            }
            str6 = null;
            String effectId2 = effect.getEffectId();
            str4 = effect.getUnzipPath();
            str3 = str;
            str2 = str6;
            str5 = effectId2;
        }
        if (m139820am()) {
            C44378z zVar = this.f114261l;
            if (zVar != null) {
                C44005ae aeVar4 = this.f114266q;
                if (aeVar4 == null) {
                    C7573i.m23580a();
                }
                zVar.mo106824f(aeVar4.mo106508L());
            }
        }
        C44005ae aeVar5 = this.f114266q;
        if (aeVar5 != null) {
            C44378z zVar2 = this.f114261l;
            if (zVar2 == null) {
                C7573i.m23580a();
            }
            C44005ae aeVar6 = this.f114266q;
            if (aeVar6 == null) {
                C7573i.m23580a();
            }
            aeVar5.f113873y = zVar2.mo106809a(str5, str4, str2, str3, aeVar6.f113868C, put.toString());
        }
        C44005ae aeVar7 = this.f114266q;
        if (aeVar7 != null) {
            ajVar = aeVar7.f113873y;
        }
        if (ajVar == null) {
            C7573i.m23580a();
        }
        StickerItemModel stickerItemModel = ajVar.f102708c;
        C44005ae aeVar8 = this.f114266q;
        if (aeVar8 != null) {
            aeVar8.mo99484a(stickerItemModel.stickerId);
        }
        C44005ae aeVar9 = this.f114266q;
        if (aeVar9 != null) {
            aeVar9.mo99485d(-1);
        }
        EditLyricStickerViewModel editLyricStickerViewModel = this.f114273x;
        if (editLyricStickerViewModel == null) {
            C7573i.m23583a("editLyricStickerViewModel");
        }
        editLyricStickerViewModel.mo106274b(Integer.valueOf(-1));
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f114247B;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        C0052o u = vEVideoPublishEditViewModel.mo119529u();
        C7573i.m23582a((Object) u, "publishEditViewModel.lyricAudioTimeLiveData");
        C44005ae aeVar10 = this.f114266q;
        int L = aeVar10 != null ? aeVar10.mo106508L() : -1;
        C44005ae aeVar11 = this.f114266q;
        int i = aeVar11 != null ? aeVar11.f113867B : 0;
        C44005ae aeVar12 = this.f114266q;
        int i2 = aeVar12 != null ? aeVar12.f113868C : 0;
        C44005ae aeVar13 = this.f114266q;
        C40026b bVar = new C40026b(L, i, i2, aeVar13 != null ? aeVar13.f113869D : 0, C35563c.f93231M.mo93305a(Property.RearMusicAutoLoop));
        u.setValue(bVar);
        stickerItemModel.mLyricColor = -1;
        stickerItemModel.mLyricInfo = put.toString();
        stickerItemModel.mLyricFontPath = str2;
        EditLyricStickerViewModel editLyricStickerViewModel2 = this.f114273x;
        if (editLyricStickerViewModel2 == null) {
            C7573i.m23583a("editLyricStickerViewModel");
        }
        editLyricStickerViewModel2.mo106276h();
    }

    /* access modifiers changed from: private */
    /* renamed from: ao */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: J */
    public final EditViewModel mo106678J() {
        EditViewModel editViewModel = this.f114267r;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: K */
    public final EditPoiStickerViewModel mo96987K() {
        EditPoiStickerViewModel editPoiStickerViewModel = this.f114268s;
        if (editPoiStickerViewModel == null) {
            C7573i.m23583a("editPoiStickerViewModel");
        }
        return editPoiStickerViewModel;
    }

    /* renamed from: L */
    public final VideoPublishEditModel mo106679L() {
        VideoPublishEditModel videoPublishEditModel = this.f114269t;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: M */
    public final EditInfoStickerViewModel mo106680M() {
        EditInfoStickerViewModel editInfoStickerViewModel = this.f114270u;
        if (editInfoStickerViewModel == null) {
            C7573i.m23583a("editInfoStickerViewModel");
        }
        return editInfoStickerViewModel;
    }

    /* renamed from: N */
    public final EditTextStickerViewModel mo106681N() {
        EditTextStickerViewModel editTextStickerViewModel = this.f114271v;
        if (editTextStickerViewModel == null) {
            C7573i.m23583a("editTextStickerViewModel");
        }
        return editTextStickerViewModel;
    }

    /* renamed from: O */
    public final EditLyricStickerViewModel mo106682O() {
        EditLyricStickerViewModel editLyricStickerViewModel = this.f114273x;
        if (editLyricStickerViewModel == null) {
            C7573i.m23583a("editLyricStickerViewModel");
        }
        return editLyricStickerViewModel;
    }

    /* renamed from: P */
    public final LyricEffectViewModel mo106683P() {
        LyricEffectViewModel lyricEffectViewModel = this.f114274y;
        if (lyricEffectViewModel == null) {
            C7573i.m23583a("lyricEffectViewModel");
        }
        return lyricEffectViewModel;
    }

    /* renamed from: Q */
    public final EditStickerViewModel mo106684Q() {
        EditStickerViewModel editStickerViewModel = this.f114246A;
        if (editStickerViewModel == null) {
            C7573i.m23583a("stickerViewModel");
        }
        return editStickerViewModel;
    }

    /* renamed from: R */
    public final VEVideoPublishEditViewModel mo106685R() {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f114247B;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: S */
    public final FrameLayout mo106686S() {
        FrameLayout frameLayout = this.f114248C;
        if (frameLayout == null) {
            C7573i.m23583a("textPoiLayout");
        }
        return frameLayout;
    }

    /* renamed from: T */
    public final FrameLayout mo106687T() {
        FrameLayout frameLayout = this.f114249D;
        if (frameLayout == null) {
            C7573i.m23583a("voteLayout");
        }
        return frameLayout;
    }

    /* renamed from: U */
    public final InfoStickerViewModel mo106688U() {
        InfoStickerViewModel infoStickerViewModel = this.f114252G;
        if (infoStickerViewModel == null) {
            C7573i.m23583a("mInfoStickerViewModel");
        }
        return infoStickerViewModel;
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: ad */
    public final void mo106705ad() {
        C44054ap apVar = this.f114263n;
        if (apVar != null) {
            apVar.mo106549M();
        }
        C44284cn cnVar = this.f114264o;
        if (cnVar != null) {
            cnVar.mo106763N();
        }
    }

    /* renamed from: f */
    public final void mo100877f() {
        EditViewModel editViewModel = this.f114267r;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106443a(false, false);
    }

    /* renamed from: aj */
    private final void m139817aj() {
        m139816ai();
        C44054ap apVar = this.f114263n;
        if (apVar != null) {
            apVar.mo30922I();
        }
        C44284cn cnVar = this.f114264o;
        if (cnVar != null) {
            cnVar.mo30921H();
        }
    }

    /* renamed from: ak */
    private final void m139818ak() {
        if (this.f114265p == null) {
            this.f114265p = new C40380aj();
            C40380aj ajVar = this.f114265p;
            if (ajVar == null) {
                C7573i.m23580a();
            }
            mo30925a((int) R.id.e2n, (C12629j) ajVar, "StickerHintTextScene");
        }
    }

    /* renamed from: A */
    public final void mo30993A() {
        super.mo30993A();
        m139816ai();
        C44215br brVar = this.f114262m;
        if (brVar != null) {
            brVar.mo30922I();
        }
        this.f114254I = false;
    }

    public final void bU_() {
        C44284cn cnVar = this.f114264o;
        if (cnVar != null && !cnVar.mo106767R() && !this.f114256K) {
            EditViewModel editViewModel = this.f114267r;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            editViewModel.mo106443a(true, false);
        }
    }

    /* renamed from: al */
    private final void m139819al() {
        C44215br brVar = this.f114262m;
        if (brVar != null) {
            brVar.mo106728a((C42049a) new C44201x(this));
        }
        C44215br brVar2 = this.f114262m;
        if (brVar2 != null) {
            brVar2.mo106727a((C23319b<C42088k>) new C44202y<C42088k>(this));
        }
        C44215br brVar3 = this.f114262m;
        if (brVar3 != null) {
            brVar3.mo106726a((C23318a<C42088k, C42088k>) new C44203z<C42088k,C42088k>(this));
        }
    }

    /* renamed from: am */
    private final boolean m139820am() {
        VideoPublishEditModel videoPublishEditModel = this.f114269t;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        if (videoPublishEditModel.hasInfoStickers()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f114269t;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("publishEditModel");
            }
            if (videoPublishEditModel2.infoStickerModel.hasLyricSticker()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ab */
    public final void mo106703ab() {
        boolean z;
        if (this.f114263n != null) {
            C44054ap apVar = this.f114263n;
            if (apVar != null) {
                apVar.mo96987K();
            }
            z = true;
        } else {
            z = false;
        }
        if (this.f114264o != null) {
            C44284cn cnVar = this.f114264o;
            if (cnVar != null) {
                cnVar.mo96987K();
            }
            z = true;
        }
        if (z) {
            mo106704ac();
        }
        if (this.f114262m != null) {
            C44215br brVar = this.f114262m;
            if (brVar != null) {
                brVar.mo106718P();
            }
        }
    }

    /* renamed from: ae */
    public final boolean mo106706ae() {
        C44054ap apVar = this.f114263n;
        boolean z = false;
        if (apVar != null && apVar.mo106547J()) {
            apVar.mo106549M();
            z = true;
        }
        C44284cn cnVar = this.f114264o;
        if (cnVar != null && cnVar.mo106762M()) {
            cnVar.mo106763N();
            z = true;
        }
        C44215br brVar = this.f114262m;
        if (brVar != null) {
            return brVar.mo106715M();
        }
        return z;
    }

    /* renamed from: af */
    public final boolean mo106707af() {
        C44054ap apVar = this.f114263n;
        if (apVar == null || !apVar.mo106550N()) {
            C44215br brVar = this.f114262m;
            if (brVar == null || !brVar.mo106714L()) {
                C44284cn cnVar = this.f114264o;
                if (cnVar == null || !cnVar.mo106764O()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: ag */
    public final void mo106708ag() {
        boolean z;
        if (this.f114263n != null) {
            C44054ap apVar = this.f114263n;
            if (apVar != null) {
                apVar.mo96987K();
            }
            z = true;
        } else {
            z = false;
        }
        if (this.f114264o != null) {
            C44284cn cnVar = this.f114264o;
            if (cnVar != null) {
                cnVar.mo96987K();
            }
            z = true;
        }
        if (z) {
            mo106704ac();
        }
    }

    /* renamed from: ai */
    private final void m139816ai() {
        VideoPublishEditModel videoPublishEditModel = this.f114269t;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        if (infoStickerModel != null) {
            List<StickerItemModel> list = infoStickerModel.stickers;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    StickerItemModel stickerItemModel = (StickerItemModel) it.next();
                    if (stickerItemModel.type == 1) {
                        C44054ap apVar = this.f114263n;
                        if (apVar != null) {
                            String str = stickerItemModel.path;
                            C7573i.m23582a((Object) str, "model.path");
                            apVar.mo106561a(str);
                            String str2 = stickerItemModel.stickerId;
                            C7573i.m23582a((Object) str2, "model.stickerId");
                            apVar.mo106563b(str2);
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: an */
    private final void m139821an() {
        String str;
        if (this.f114264o != null) {
            String str2 = "poll_edit";
            C22984d a = C22984d.m75611a();
            String str3 = "creation_id";
            VideoPublishEditModel videoPublishEditModel = this.f114269t;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("publishEditModel");
            }
            C22984d a2 = a.mo59973a(str3, videoPublishEditModel.creationId);
            String str4 = "shoot_way";
            VideoPublishEditModel videoPublishEditModel2 = this.f114269t;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("publishEditModel");
            }
            C22984d a3 = a2.mo59973a(str4, videoPublishEditModel2.mShootWay);
            String str5 = "content_type";
            VideoPublishEditModel videoPublishEditModel3 = this.f114269t;
            if (videoPublishEditModel3 == null) {
                C7573i.m23583a("publishEditModel");
            }
            C22984d a4 = a3.mo59973a(str5, C39500av.m126133a(videoPublishEditModel3));
            String str6 = "content_source";
            VideoPublishEditModel videoPublishEditModel4 = this.f114269t;
            if (videoPublishEditModel4 == null) {
                C7573i.m23583a("publishEditModel");
            }
            C22984d a5 = a4.mo59973a(str6, C39500av.m126142b(videoPublishEditModel4)).mo59973a("enter_from", "video_edit_page");
            String str7 = "prop_id";
            C44284cn cnVar = this.f114264o;
            if (cnVar != null) {
                str = cnVar.mo106766Q();
            } else {
                str = null;
            }
            C6907h.m21524a(str2, (Map) a5.mo59973a(str7, str).f60753a);
        }
    }

    /* renamed from: V */
    public final void mo106689V() {
        if (this.f114261l == null) {
            this.f114261l = new C44378z();
            C44378z zVar = this.f114261l;
            if (zVar != null) {
                C44362u uVar = this.f114259j;
                if (uVar == null) {
                    C7573i.m23583a("gestureListenerManager");
                }
                zVar.mo106816a(uVar);
            }
            C44378z zVar2 = this.f114261l;
            if (zVar2 != null) {
                C44295cr crVar = this.f114260k;
                if (crVar == null) {
                    C7573i.m23583a("deleteComponent");
                }
                zVar2.mo106815a(crVar);
            }
            C44378z zVar3 = this.f114261l;
            if (zVar3 != null) {
                FrameLayout frameLayout = this.f114248C;
                if (frameLayout == null) {
                    C7573i.m23583a("textPoiLayout");
                }
                zVar3.mo106812a(frameLayout);
            }
            C44378z zVar4 = this.f114261l;
            if (zVar4 == null) {
                C7573i.m23580a();
            }
            mo30925a((int) R.id.b0y, (C12629j) zVar4, "EditInfoStickerScene");
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f114247B;
            if (vEVideoPublishEditViewModel == null) {
                C7573i.m23583a("publishEditViewModel");
            }
            C0043i iVar = this;
            vEVideoPublishEditViewModel.mo119514f().observe(iVar, new C44182e(this));
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f114247B;
            if (vEVideoPublishEditViewModel2 == null) {
                C7573i.m23583a("publishEditViewModel");
            }
            vEVideoPublishEditViewModel2.mo119515g().observe(iVar, new C44183f(this));
        }
    }

    /* renamed from: Z */
    public final void mo106693Z() {
        if (this.f114262m == null) {
            C44215br brVar = new C44215br();
            C44362u uVar = this.f114259j;
            if (uVar == null) {
                C7573i.m23583a("gestureListenerManager");
            }
            brVar.mo106732a(uVar);
            C44295cr crVar = this.f114260k;
            if (crVar == null) {
                C7573i.m23583a("deleteComponent");
            }
            brVar.mo106731a(crVar);
            this.f114262m = brVar;
            C44215br brVar2 = this.f114262m;
            if (brVar2 != null) {
                View inflate = ((ViewStub) mo31004h_(R.id.edi)).inflate();
                if (inflate != null) {
                    brVar2.mo106729a((TextStickerInputLayout) inflate);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout");
                }
            }
            C44215br brVar3 = this.f114262m;
            if (brVar3 == null) {
                C7573i.m23580a();
            }
            mo30925a((int) R.id.dia, (C12629j) brVar3, "EditTextStickerScene");
            m139819al();
        }
    }

    /* renamed from: aa */
    public final void mo106702aa() {
        C44054ap apVar = this.f114263n;
        if (apVar != null) {
            apVar.mo106547J();
            EditPoiStickerViewModel editPoiStickerViewModel = this.f114268s;
            if (editPoiStickerViewModel == null) {
                C7573i.m23583a("editPoiStickerViewModel");
            }
            editPoiStickerViewModel.mo29069f();
        }
        C44215br brVar = this.f114262m;
        if (brVar != null) {
            EditViewModel editViewModel = this.f114267r;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            C15389d dVar = (C15389d) editViewModel.mo106448i().getValue();
            EditViewModel editViewModel2 = this.f114267r;
            if (editViewModel2 == null) {
                C7573i.m23583a("editViewModel");
            }
            brVar.mo106725a(dVar, editViewModel2.mo106459t());
        }
        C44215br brVar2 = this.f114262m;
        if (brVar2 != null) {
            brVar2.mo106730a((C42088k) null);
        }
        EditToolbarViewModel editToolbarViewModel = this.f114275z;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("editToolbarViewModel");
        }
        editToolbarViewModel.mo106418c(2, false);
    }

    /* renamed from: ac */
    public final void mo106704ac() {
        Object obj;
        if (this.f114263n != null) {
            this.f114257M.clear();
            EditViewModel editViewModel = this.f114267r;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            C15389d dVar = (C15389d) editViewModel.mo106448i().getValue();
            if (dVar != null) {
                C44054ap apVar = this.f114263n;
                if (apVar != null) {
                    apVar.mo106560a(dVar.mo38828c());
                }
                C44284cn cnVar = this.f114264o;
                if (cnVar != null) {
                    cnVar.mo106771a(dVar.mo38828c());
                }
            }
            C44054ap apVar2 = this.f114263n;
            InteractStickerStruct interactStickerStruct = null;
            if (apVar2 != null) {
                obj = apVar2.mo106548L();
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f114257M.add(obj);
            }
            C44284cn cnVar2 = this.f114264o;
            if (cnVar2 != null) {
                interactStickerStruct = cnVar2.mo106761L();
            }
            if (interactStickerStruct != null) {
                this.f114257M.add(interactStickerStruct);
            }
            VideoPublishEditModel videoPublishEditModel = this.f114269t;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("publishEditModel");
            }
            String a = C39604b.m126710a(videoPublishEditModel.getMainBusinessContext(), this.f114257M, InteractTrackPage.TRACK_PAGE_EDIT);
            VideoPublishEditModel videoPublishEditModel2 = this.f114269t;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("publishEditModel");
            }
            videoPublishEditModel2.setMainBusinessData(a);
        }
    }

    /* renamed from: ah */
    private final void m139815ah() {
        EditStickerViewModel editStickerViewModel = this.f114246A;
        if (editStickerViewModel == null) {
            C7573i.m23583a("stickerViewModel");
        }
        C0043i iVar = this;
        editStickerViewModel.mo29069f().observe(iVar, new C44193p(this));
        EditStickerViewModel editStickerViewModel2 = this.f114246A;
        if (editStickerViewModel2 == null) {
            C7573i.m23583a("stickerViewModel");
        }
        editStickerViewModel2.mo106363g().observe(iVar, new C44195r(this));
        EditStickerViewModel editStickerViewModel3 = this.f114246A;
        if (editStickerViewModel3 == null) {
            C7573i.m23583a("stickerViewModel");
        }
        editStickerViewModel3.mo106364h().observe(iVar, new C44196s(this));
        EditStickerViewModel editStickerViewModel4 = this.f114246A;
        if (editStickerViewModel4 == null) {
            C7573i.m23583a("stickerViewModel");
        }
        mo29062a(editStickerViewModel4, C44211bo.f114321a, C11640h.m34110a(), new C44197t(this));
        C39559ak.m126366a().observe(iVar, new C44198u(this));
        C39559ak.m126368b().observe(iVar, new C44199v(this));
        EditStickerViewModel editStickerViewModel5 = this.f114246A;
        if (editStickerViewModel5 == null) {
            C7573i.m23583a("stickerViewModel");
        }
        mo91869c(editStickerViewModel5, C44212bp.f114322a, new C11672v(), new C44200w(this));
        EditStickerViewModel editStickerViewModel6 = this.f114246A;
        if (editStickerViewModel6 == null) {
            C7573i.m23583a("stickerViewModel");
        }
        mo91869c(editStickerViewModel6, C44210bn.f114320a, new C11672v(), new C44194q(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (r3 == null) goto L_0x00a2;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106691X() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            java.lang.String r1 = "ServiceManager.get().get…ss.java).publishService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.getCurMusic()
            java.lang.String r1 = "edit_lyricsticker_complete"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r3 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f114269t
            if (r4 != 0) goto L_0x002a
            java.lang.String r5 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x002a:
            java.lang.String r4 = r4.creationId
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f114269t
            if (r4 != 0) goto L_0x003b
            java.lang.String r5 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x003b:
            java.lang.String r4 = r4.mShootWay
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "music_id"
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = ""
            goto L_0x004c
        L_0x0048:
            java.lang.String r0 = r0.getMusicId()
        L_0x004c:
            com.ss.android.ugc.aweme.app.g.d r0 = r2.mo59973a(r3, r0)
            java.lang.String r2 = "color_id"
            com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel r3 = r6.f114273x
            if (r3 != 0) goto L_0x005b
            java.lang.String r4 = "editLyricStickerViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x005b:
            android.app.Activity r4 = r6.f33526d_
            if (r4 == 0) goto L_0x00b6
            android.support.v4.app.FragmentActivity r4 = (android.support.p022v4.app.FragmentActivity) r4
            android.arch.lifecycle.i r4 = (android.arch.lifecycle.C0043i) r4
            com.bytedance.jedi.arch.t r3 = r3.mo106825a(r4)
            com.ss.android.ugc.gamora.editor.EditLyricStickerState r3 = (com.p280ss.android.ugc.gamora.editor.EditLyricStickerState) r3
            java.lang.Integer r3 = r3.getCurColor()
            if (r3 == 0) goto L_0x0074
            int r3 = r3.intValue()
            goto L_0x0075
        L_0x0074:
            r3 = -1
        L_0x0075:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59970a(r2, r3)
            java.lang.String r2 = "dynamics"
            com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel r3 = r6.f114273x
            if (r3 != 0) goto L_0x0084
            java.lang.String r4 = "editLyricStickerViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0084:
            android.app.Activity r4 = r6.f33526d_
            if (r4 == 0) goto L_0x00ae
            android.support.v4.app.FragmentActivity r4 = (android.support.p022v4.app.FragmentActivity) r4
            android.arch.lifecycle.i r4 = (android.arch.lifecycle.C0043i) r4
            com.bytedance.jedi.arch.t r3 = r3.mo106825a(r4)
            com.ss.android.ugc.gamora.editor.EditLyricStickerState r3 = (com.p280ss.android.ugc.gamora.editor.EditLyricStickerState) r3
            com.ss.android.ugc.gamora.editor.ct r3 = r3.getCurLyricEffect()
            if (r3 == 0) goto L_0x00a2
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r3.f114473a
            if (r3 == 0) goto L_0x00a2
            java.lang.String r3 = r3.getName()
            if (r3 != 0) goto L_0x00a4
        L_0x00a2:
            java.lang.String r3 = "经典"
        L_0x00a4:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r0)
            return
        L_0x00ae:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44174bg.mo106691X():void");
    }

    /* renamed from: Y */
    public final void mo106692Y() {
        if (this.f114263n == null) {
            this.f114263n = new C44054ap();
            C44054ap apVar = this.f114263n;
            if (apVar != null) {
                C44362u uVar = this.f114259j;
                if (uVar == null) {
                    C7573i.m23583a("gestureListenerManager");
                }
                apVar.mo106559a(uVar);
            }
            C44054ap apVar2 = this.f114263n;
            if (apVar2 != null) {
                C44295cr crVar = this.f114260k;
                if (crVar == null) {
                    C7573i.m23583a("deleteComponent");
                }
                apVar2.mo106558a(crVar);
            }
            C44054ap apVar3 = this.f114263n;
            if (apVar3 == null) {
                C7573i.m23580a();
            }
            mo30925a((int) R.id.dia, (C12629j) apVar3, "EditPoiStickerScene");
        }
        if (this.f114264o == null) {
            this.f114264o = new C44284cn();
            C44284cn cnVar = this.f114264o;
            if (cnVar != null) {
                C44362u uVar2 = this.f114259j;
                if (uVar2 == null) {
                    C7573i.m23583a("gestureListenerManager");
                }
                cnVar.mo106770a(uVar2);
            }
            C44284cn cnVar2 = this.f114264o;
            if (cnVar2 != null) {
                C44295cr crVar2 = this.f114260k;
                if (crVar2 == null) {
                    C7573i.m23583a("deleteComponent");
                }
                cnVar2.mo106769a(crVar2);
            }
            C44284cn cnVar3 = this.f114264o;
            if (cnVar3 != null) {
                View h_ = mo31004h_(R.id.bkp);
                C7573i.m23582a((Object) h_, "requireViewById(R.id.layout_vote_display)");
                cnVar3.mo106768a((VotingStickerLayout) h_);
            }
            C44284cn cnVar4 = this.f114264o;
            if (cnVar4 == null) {
                C7573i.m23580a();
            }
            mo30925a((int) R.id.dib, (C12629j) cnVar4, "EditVoteStickerScene");
        }
        m139817aj();
    }

    /* renamed from: W */
    public final void mo106690W() {
        VEPreviewMusicParams vEPreviewMusicParams;
        Object obj;
        Object obj2;
        if (this.f114266q == null) {
            this.f114266q = new C44005ae();
            C44005ae aeVar = this.f114266q;
            if (aeVar == null) {
                C7573i.m23580a();
            }
            mo30925a((int) R.id.b0y, (C12629j) aeVar, "LyricScene");
            C44005ae aeVar2 = this.f114266q;
            Integer num = null;
            if (aeVar2 != null) {
                vEPreviewMusicParams = aeVar2.f113874z;
            } else {
                vEPreviewMusicParams = null;
            }
            if (vEPreviewMusicParams == null) {
                C44005ae aeVar3 = this.f114266q;
                if (aeVar3 != null) {
                    VideoPublishEditModel videoPublishEditModel = this.f114269t;
                    if (videoPublishEditModel == null) {
                        C7573i.m23583a("publishEditModel");
                    }
                    aeVar3.f113867B = videoPublishEditModel.mMusicStart;
                }
                C44005ae aeVar4 = this.f114266q;
                if (aeVar4 != null) {
                    VideoPublishEditModel videoPublishEditModel2 = this.f114269t;
                    if (videoPublishEditModel2 == null) {
                        C7573i.m23583a("publishEditModel");
                    }
                    aeVar4.f113868C = (int) (videoPublishEditModel2.previewStartTime * 1000.0f);
                }
                C44005ae aeVar5 = this.f114266q;
                if (aeVar5 != null) {
                    VideoPublishEditModel videoPublishEditModel3 = this.f114269t;
                    if (videoPublishEditModel3 == null) {
                        C7573i.m23583a("publishEditModel");
                    }
                    int i = (int) (videoPublishEditModel3.previewStartTime * 1000.0f);
                    VideoPublishEditModel videoPublishEditModel4 = this.f114269t;
                    if (videoPublishEditModel4 == null) {
                        C7573i.m23583a("publishEditModel");
                    }
                    aeVar5.f113869D = i + videoPublishEditModel4.mMusicEnd;
                }
            }
            StringBuilder sb = new StringBuilder("inPoint=");
            C44005ae aeVar6 = this.f114266q;
            if (aeVar6 != null) {
                obj = Integer.valueOf(aeVar6.f113867B);
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(",startTime=");
            C44005ae aeVar7 = this.f114266q;
            if (aeVar7 != null) {
                obj2 = Integer.valueOf(aeVar7.f113868C);
            } else {
                obj2 = null;
            }
            sb.append(obj2);
            sb.append(",endTime=");
            C44005ae aeVar8 = this.f114266q;
            if (aeVar8 != null) {
                num = Integer.valueOf(aeVar8.f113869D);
            }
            sb.append(num);
            C44005ae aeVar9 = this.f114266q;
            if (aeVar9 != null) {
                aeVar9.mo99482a((C34860g) new C44184g(this));
            }
            C44005ae aeVar10 = this.f114266q;
            if (aeVar10 != null) {
                Activity activity = this.f33526d_;
                if (activity != null) {
                    aeVar10.mo99481a((FragmentActivity) activity);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
            EditLyricStickerViewModel editLyricStickerViewModel = this.f114273x;
            if (editLyricStickerViewModel == null) {
                C7573i.m23583a("editLyricStickerViewModel");
            }
            mo29062a(editLyricStickerViewModel, C44206bj.f114316a, C11640h.m34110a(), new C44189l(this));
            EditLyricStickerViewModel editLyricStickerViewModel2 = this.f114273x;
            if (editLyricStickerViewModel2 == null) {
                C7573i.m23583a("editLyricStickerViewModel");
            }
            mo91869c(editLyricStickerViewModel2, C44207bk.f114317a, new C11672v(), new C44190m(this));
            EditLyricStickerViewModel editLyricStickerViewModel3 = this.f114273x;
            if (editLyricStickerViewModel3 == null) {
                C7573i.m23583a("editLyricStickerViewModel");
            }
            mo29062a(editLyricStickerViewModel3, C44208bl.f114318a, C11640h.m34110a(), new C44191n(this));
            EditLyricStickerViewModel editLyricStickerViewModel4 = this.f114273x;
            if (editLyricStickerViewModel4 == null) {
                C7573i.m23583a("editLyricStickerViewModel");
            }
            mo91869c(editLyricStickerViewModel4, C44209bm.f114319a, new C11672v(), new C44192o(this));
            EditLyricStickerViewModel editLyricStickerViewModel5 = this.f114273x;
            if (editLyricStickerViewModel5 == null) {
                C7573i.m23583a("editLyricStickerViewModel");
            }
            editLyricStickerViewModel5.mo29069f().observe(this, new C44185h(this));
            EditLyricStickerViewModel editLyricStickerViewModel6 = this.f114273x;
            if (editLyricStickerViewModel6 == null) {
                C7573i.m23583a("editLyricStickerViewModel");
            }
            mo29062a(editLyricStickerViewModel6, C44204bh.f114314a, C11640h.m34110a(), new C44186i(this));
            EditLyricStickerViewModel editLyricStickerViewModel7 = this.f114273x;
            if (editLyricStickerViewModel7 == null) {
                C7573i.m23583a("editLyricStickerViewModel");
            }
            mo91869c(editLyricStickerViewModel7, C44205bi.f114315a, new C11672v(), new C44187j(this));
            C44362u uVar = this.f114259j;
            if (uVar == null) {
                C7573i.m23583a("gestureListenerManager");
            }
            uVar.mo106801a((C42060b) new C44188k());
        }
    }

    /* renamed from: c */
    public final void mo106710c(boolean z) {
        C44215br brVar = this.f114262m;
        if (brVar != null && !brVar.mo106721S()) {
            brVar.mo106735c(z);
        }
        C44378z zVar = this.f114261l;
        if (zVar != null && !zVar.mo106808L()) {
            zVar.mo106820b(z);
        }
        C44054ap apVar = this.f114263n;
        if (apVar != null) {
            apVar.mo106562a(z);
        }
        C44284cn cnVar = this.f114264o;
        if (cnVar != null) {
            cnVar.mo106773a(z);
        }
    }

    /* renamed from: d */
    public final void mo106711d(boolean z) {
        C44054ap apVar = this.f114263n;
        if (apVar != null) {
            apVar.mo106562a(z);
        }
        C44284cn cnVar = this.f114264o;
        if (cnVar != null) {
            cnVar.mo106773a(z);
        }
        C44215br brVar = this.f114262m;
        if (brVar != null) {
            brVar.mo106735c(z);
        }
        C44378z zVar = this.f114261l;
        if (zVar != null) {
            zVar.mo106820b(z);
        }
    }

    /* renamed from: e */
    public final void mo106712e(int i) {
        C12629j jVar = this.f33524c;
        if (!(jVar instanceof C44082av)) {
            jVar = null;
        }
        C44082av avVar = (C44082av) jVar;
        if (avVar != null) {
            C44294cq O = avVar.mo106580O();
            if (O != null) {
                O.mo106519d();
            }
        }
        if (i != 2) {
            EditViewModel editViewModel = this.f114267r;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            editViewModel.mo106443a(true, false);
        } else {
            C44005ae aeVar = this.f114266q;
            if (aeVar != null) {
                aeVar.mo30920G();
            }
        }
    }

    /* renamed from: b */
    public final void mo106709b(boolean z) {
        C44215br brVar = this.f114262m;
        if (brVar != null && !brVar.mo106716N()) {
            brVar.mo106735c(z);
        }
        C44378z zVar = this.f114261l;
        if (zVar != null && !zVar.mo106807J()) {
            zVar.mo106820b(z);
        }
        C44054ap apVar = this.f114263n;
        if (apVar != null) {
            apVar.mo106562a(z);
        }
        C44284cn cnVar = this.f114264o;
        if (cnVar != null) {
            cnVar.mo106773a(z);
        }
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditPoiStickerViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java]");
            this.f114268s = (EditPoiStickerViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditInfoStickerViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java]");
                this.f114270u = (EditInfoStickerViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditVoteStickerViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…kerViewModel::class.java]");
                    this.f114272w = (EditVoteStickerViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(EditTextStickerViewModel.class);
                        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java]");
                        this.f114271v = (EditTextStickerViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity5).mo91871a(EditLyricStickerViewModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…kerViewModel::class.java]");
                            this.f114273x = (EditLyricStickerViewModel) a5;
                            Activity activity6 = this.f33526d_;
                            if (activity6 != null) {
                                C0063u a6 = C0069x.m159a((FragmentActivity) activity6).mo147a(LyricEffectViewModel.class);
                                C7573i.m23582a((Object) a6, "ViewModelProviders.of(ac…ectViewModel::class.java]");
                                this.f114274y = (LyricEffectViewModel) a6;
                                Activity activity7 = this.f33526d_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C36113b.m116288a((FragmentActivity) activity7).mo91871a(EditToolbarViewModel.class);
                                    C7573i.m23582a((Object) a7, "JediViewModelProviders.o…barViewModel::class.java]");
                                    this.f114275z = (EditToolbarViewModel) a7;
                                    Activity activity8 = this.f33526d_;
                                    if (activity8 != null) {
                                        JediViewModel a8 = C36113b.m116288a((FragmentActivity) activity8).mo91871a(EditStickerViewModel.class);
                                        C7573i.m23582a((Object) a8, "JediViewModelProviders.o…kerViewModel::class.java]");
                                        this.f114246A = (EditStickerViewModel) a8;
                                        Activity activity9 = this.f33526d_;
                                        if (activity9 != null) {
                                            C0063u a9 = C0069x.m159a((FragmentActivity) activity9).mo147a(VEVideoPublishEditViewModel.class);
                                            C7573i.m23582a((Object) a9, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                                            this.f114247B = (VEVideoPublishEditViewModel) a9;
                                            EditViewModel editViewModel = this.f114267r;
                                            if (editViewModel == null) {
                                                C7573i.m23583a("editViewModel");
                                            }
                                            this.f114269t = editViewModel.mo29069f();
                                            this.f114250E = new C39505b();
                                            Activity activity10 = this.f33526d_;
                                            if (activity10 != null) {
                                                JediViewModel a10 = C36113b.m116288a((FragmentActivity) activity10).mo91871a(EditStickerPanelViewModel.class);
                                                C7573i.m23582a((Object) a10, "JediViewModelProviders.o…nelViewModel::class.java)");
                                                this.f114251F = (EditStickerPanelViewModel) a10;
                                                Activity activity11 = this.f33526d_;
                                                if (activity11 != null) {
                                                    C0063u a11 = C0069x.m159a((FragmentActivity) activity11).mo147a(InfoStickerViewModel.class);
                                                    C7573i.m23582a((Object) a11, "ViewModelProviders.of(ac…kerViewModel::class.java)");
                                                    this.f114252G = (InfoStickerViewModel) a11;
                                                    m139815ah();
                                                    m139818ak();
                                                    return;
                                                }
                                                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                            }
                                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                        }
                                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                    }
                                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java]");
            this.f114267r = (EditViewModel) a;
            View h_ = mo31004h_(R.id.dia);
            C7573i.m23582a((Object) h_, "requireViewById(R.id.text_sticker_layout_layer)");
            this.f114248C = (FrameLayout) h_;
            View h_2 = mo31004h_(R.id.dib);
            C7573i.m23582a((Object) h_2, "requireViewById(R.id.tex…ticker_vote_layout_layer)");
            this.f114249D = (FrameLayout) h_2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: b */
    public final ViewGroup mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aiu, viewGroup, false);
        if (inflate != null) {
            return (FrameLayout) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
