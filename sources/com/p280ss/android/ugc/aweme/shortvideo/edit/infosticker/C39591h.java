package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.util.C0902i;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.internal.C13315l;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.effect.C27439r;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.p280ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39774n;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39601a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.BorderLineView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a.C39545a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a.C39546b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a.C39548d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1564d.C39517a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1564d.C39517a.C39518a;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.C41108b;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.UtteranceWithWords;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41536ap;
import com.p280ss.android.ugc.aweme.shortvideo.widget.C41706n;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1658c.C42015a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42061c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42088k;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.gamora.editor.C44295cr;
import com.p280ss.android.ugc.gamora.editor.EditCornerViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VEException;
import com.p280ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47516v;
import dmt.p1861av.video.C47518x;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.h */
public final class C39591h implements C39566b, C39774n {

    /* renamed from: A */
    private DmtTextView f102830A;

    /* renamed from: B */
    private VideoEditView f102831B;

    /* renamed from: C */
    private ImageView f102832C;

    /* renamed from: D */
    private ImageView f102833D;

    /* renamed from: E */
    private ImageView f102834E;

    /* renamed from: F */
    private TextView f102835F;

    /* renamed from: G */
    private TextView f102836G;

    /* renamed from: H */
    private SeekBar f102837H;

    /* renamed from: I */
    private int f102838I = 30;

    /* renamed from: J */
    private C42061c f102839J;

    /* renamed from: K */
    private View f102840K;

    /* renamed from: L */
    private boolean f102841L;

    /* renamed from: M */
    private boolean f102842M;

    /* renamed from: N */
    private boolean f102843N;

    /* renamed from: O */
    private boolean f102844O;

    /* renamed from: P */
    private boolean f102845P;

    /* renamed from: Q */
    private FrameLayout f102846Q;

    /* renamed from: R */
    private int f102847R;

    /* renamed from: S */
    private int f102848S;

    /* renamed from: T */
    private boolean f102849T;

    /* renamed from: U */
    private boolean f102850U;

    /* renamed from: V */
    private boolean f102851V = false;

    /* renamed from: W */
    private C41706n f102852W;

    /* renamed from: X */
    private EditCornerViewModel f102853X;

    /* renamed from: a */
    public boolean f102854a;

    /* renamed from: b */
    public boolean f102855b;

    /* renamed from: c */
    public FragmentActivity f102856c;

    /* renamed from: d */
    public InfoStickerEditView f102857d;

    /* renamed from: e */
    public View f102858e;

    /* renamed from: f */
    public CutMultiVideoViewModel f102859f;

    /* renamed from: g */
    public View f102860g;

    /* renamed from: h */
    public C15389d f102861h;

    /* renamed from: i */
    public InfoStickerViewModel f102862i;

    /* renamed from: j */
    public VideoPublishEditModel f102863j;

    /* renamed from: k */
    public String f102864k;

    /* renamed from: l */
    public List<MediaModel> f102865l;

    /* renamed from: m */
    public SafeHandler f102866m;

    /* renamed from: n */
    public C44295cr f102867n;

    /* renamed from: o */
    public C0052o<Bitmap> f102868o;

    /* renamed from: p */
    public C0052o<Boolean> f102869p;

    /* renamed from: q */
    public int f102870q;

    /* renamed from: r */
    public Rect f102871r;

    /* renamed from: s */
    public BorderLineView f102872s;

    /* renamed from: t */
    public Runnable f102873t = new Runnable() {
        public final void run() {
            if (C39591h.this.f102861h != null) {
                C39591h.this.f102859f.f100395b.setValue(Long.valueOf((long) C39591h.this.f102861h.mo38862m()));
                C39591h.this.f102866m.postDelayed(C39591h.this.f102873t, 30);
            }
        }
    };

    /* renamed from: u */
    public C39598c f102874u;

    /* renamed from: v */
    public C39596a f102875v;

    /* renamed from: w */
    public C39545a f102876w;

    /* renamed from: x */
    public Map<C39548d, C39546b> f102877x = new ArrayMap();

    /* renamed from: y */
    public C39517a f102878y;

    /* renamed from: z */
    private View f102879z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.h$a */
    public interface C39596a {
        /* renamed from: a */
        void mo98692a(boolean z);

        /* renamed from: b */
        void mo98693b(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.h$b */
    public interface C39597b {
        /* renamed from: a */
        void mo98476a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.h$c */
    public interface C39598c {
        /* renamed from: a */
        int mo98683a(C39558aj ajVar, boolean z, boolean z2);

        /* renamed from: a */
        PointF mo98684a(C39558aj ajVar, float f, float f2);

        /* renamed from: a */
        Float mo98685a(float f);

        /* renamed from: a */
        void mo98686a(C39558aj ajVar, int i, int i2, boolean z, boolean z2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98632a(C39558aj ajVar) {
        if ((mo98512a() || mo98513b()) && ((this.f102857d.f102643h == InfoStickerEditView.f102614i && !ajVar.f102719o) || (this.f102857d.f102643h == InfoStickerEditView.f102615j && ajVar.f102719o))) {
            if (mo98513b()) {
                m126575a((C39548d) ajVar, 1);
                return;
            }
            mo98630a((C39548d) ajVar);
        }
    }

    /* renamed from: a */
    public final void mo98630a(C39548d dVar) {
        m126575a(dVar, 0);
    }

    /* renamed from: a */
    public final void mo98629a(C39545a aVar, boolean z) {
        if (!z) {
            this.f102876w = null;
        } else if (aVar != this.f102876w) {
            this.f102876w = aVar;
        } else {
            return;
        }
        mo98661c(!z);
        if (this.f102875v != null) {
            this.f102875v.mo98692a(z);
        }
    }

    /* renamed from: a */
    public final void mo98620a(int i) {
        this.f102838I = i;
        if (this.f102838I == 0) {
            this.f102838I = 30;
        }
    }

    /* renamed from: a */
    public final void mo98641a(boolean z) {
        this.f102857d.mo98410a(z);
    }

    /* renamed from: a */
    public final void mo98627a(C15389d dVar, VideoPublishEditModel videoPublishEditModel) {
        this.f102861h = dVar;
        this.f102863j = videoPublishEditModel;
    }

    /* renamed from: a */
    public final void mo98624a(FragmentActivity fragmentActivity, View view, List<MediaModel> list, boolean z) {
        this.f102856c = fragmentActivity;
        this.f102865l = list;
        this.f102864k = ((MediaModel) list.get(0)).f88156b;
        this.f102855b = z;
        this.f102866m = new SafeHandler(fragmentActivity);
        this.f102862i = (InfoStickerViewModel) C0069x.m159a(fragmentActivity).mo147a(InfoStickerViewModel.class);
        this.f102840K = view;
        m126589l();
    }

    /* renamed from: a */
    public final boolean mo98512a() {
        C0052o<Boolean> oVar = this.f102862i.f102671c;
        if (oVar == null || oVar.getValue() == null) {
            return false;
        }
        return ((Boolean) oVar.getValue()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo98513b() {
        C0052o<Boolean> oVar = this.f102862i.f102672d;
        if (oVar == null || oVar.getValue() == null) {
            return false;
        }
        return ((Boolean) oVar.getValue()).booleanValue();
    }

    /* renamed from: a */
    public final void mo98626a(FrameLayout frameLayout) {
        if (this.f102861h != null && frameLayout != null) {
            this.f102846Q.post(new C39552ad(this, frameLayout));
        }
    }

    /* renamed from: a */
    public final void mo98633a(C39558aj ajVar, int i) {
        if (i == 1) {
            if (this.f102861h != null) {
                this.f102861h.mo38825c(ajVar.f102708c.f83875id, 0.3137255f);
            }
        } else if (i == 3) {
            if (this.f102857d != null) {
                this.f102857d.mo98434n();
                if (this.f102857d.f102641f != null) {
                    this.f102857d.f102641f.mo98602c(ajVar);
                    if (ajVar.f102708c != null) {
                        C42962b.f111525a.mo104671a("prop_delete", C22984d.m75611a().mo59973a("creation_id", this.f102863j.creationId).mo59970a("draft_id", this.f102863j.draftId).mo59973a("enter_from", this.f102854a ? "edit_post_page" : "video_edit_page").mo59973a("prop_id", ajVar.f102708c.stickerId).mo59973a("shoot_way", this.f102863j.mShootWay).f60753a);
                    }
                    this.f102857d.f102646m = true;
                }
            }
        } else if (i == 4 && this.f102861h != null) {
            this.f102861h.mo38825c(ajVar.f102708c.f83875id, 1.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98636a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            mo98655c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo98652b(Void voidR) {
        m126599v();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98637a(Long l) {
        if (this.f102849T) {
            this.f102862i.mo98464a().setValue(C47516v.m148296a(l.longValue()));
        }
    }

    /* renamed from: a */
    public final void mo98631a(C39544a aVar) {
        this.f102857d.setStickerDataChangeListener(aVar);
    }

    /* renamed from: a */
    public final void mo98635a(C42015a aVar) {
        if (this.f102857d != null && this.f102857d.f102641f != null) {
            this.f102857d.f102641f.f102811e = aVar;
        }
    }

    /* renamed from: a */
    public final void mo98638a(String str, String str2, String str3, int i) {
        if (this.f102857d.getStickNumber() >= this.f102838I) {
            C10761a.m31392b(this.f102857d.getContext(), (int) R.string.btt, 0).mo25750a();
        } else {
            this.f102857d.mo98400a(str, str2, str3, i);
        }
    }

    /* renamed from: a */
    public final C39558aj mo98619a(String str, String str2, String str3, String str4, int i, String str5) {
        return this.f102857d.mo98401a(str, str2, str3, str4, i, str5);
    }

    /* renamed from: a */
    public final void mo98621a(int i, int i2) {
        this.f102857d.mo98405a(i, i2);
    }

    /* renamed from: a */
    public final void mo98640a(List<UtteranceWithWords> list) {
        this.f102857d.mo98409a(list);
    }

    /* renamed from: a */
    public final void mo98634a(C41108b bVar) {
        this.f102857d.setSubtitleCallBack(bVar);
    }

    /* renamed from: a */
    public final boolean mo98645a(boolean z, boolean z2) {
        int i = z ? 1 : 0;
        if (z2) {
            i++;
        }
        if (this.f102857d.getStickNumber() + i < this.f102838I) {
            return false;
        }
        C10761a.m31392b(this.f102857d.getContext(), (int) R.string.btt, 0).mo25750a();
        return true;
    }

    /* renamed from: a */
    public final void mo98628a(InfoStickerModel infoStickerModel) {
        this.f102857d.mo98407a(infoStickerModel);
    }

    /* renamed from: b */
    public final void mo98653b(boolean z) {
        m126578a(false, (C39548d) null, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98643a(boolean z, boolean z2, Void voidR) {
        boolean z3 = !z;
        this.f102857d.setVisibility(z3 ? 0 : 4);
        if (z3) {
            this.f102857d.mo98423f();
        }
        if (z) {
            this.f102857d.f102643h = InfoStickerEditView.f102614i;
            this.f102861h.mo38832c(true);
            return;
        }
        this.f102857d.f102643h = 0;
        if (z2) {
            this.f102878y.mo98365a((Context) this.f102856c);
            this.f102878y.mo98364a();
            return;
        }
        this.f102861h.mo38832c(true);
        this.f102862i.mo98464a().setValue(C47516v.m148295a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98642a(boolean z, Void voidR) {
        boolean z2 = !z;
        this.f102857d.setVisibility(z2 ? 0 : 4);
        if (z2) {
            this.f102857d.mo98423f();
        }
        if (z) {
            this.f102857d.f102643h = InfoStickerEditView.f102614i;
            this.f102861h.mo38832c(true);
            return;
        }
        this.f102857d.f102643h = 0;
        this.f102862i.mo98464a().setValue(C47516v.m148298b(0));
        this.f102861h.mo38832c(true);
        this.f102862i.mo98464a().setValue(C47516v.m148295a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98625a(View view) {
        this.f102858e.setVisibility(8);
        this.f102862i.mo98464a().setValue(C47516v.m148295a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98622a(int i, int i2, C39548d dVar) {
        m126579a(i, i2, 0, dVar);
    }

    /* renamed from: a */
    public final void mo98623a(int i, int i2, int[] iArr) {
        if (C39805en.m127445a() && this.f102861h != null) {
            this.f102846Q.post(new C39672z(this, i, i2, iArr));
        }
    }

    /* renamed from: a */
    public final boolean mo98644a(RectF rectF) {
        if (!this.f102863j.hasInfoStickers()) {
            return false;
        }
        VESize c = this.f102861h.mo38828c();
        RectF rectF2 = new RectF();
        for (StickerItemModel stickerItemModel : this.f102863j.infoStickerModel.stickers) {
            if (stickerItemModel.isSubtitleRule()) {
                try {
                    float[] g = this.f102861h.mo38849g(stickerItemModel.f83875id);
                    rectF2.set(g[0] * ((float) c.f116385a), g[3] * ((float) c.f116386b), g[2] * ((float) c.f116385a), g[1] * ((float) c.f116386b));
                    m126581b(rectF2);
                    if (rectF2.top < rectF.top || rectF2.bottom > rectF.bottom) {
                        return true;
                    }
                } catch (VEException unused) {
                    StringBuilder sb = new StringBuilder("getInfoStickerBoundingBox of subtitle error, index is ");
                    sb.append(stickerItemModel.f83875id);
                    sb.append(" veState is ");
                    sb.append(this.f102861h.mo38850h().getValue());
                    C41530am.m132283b(sb.toString());
                    return false;
                }
            } else if (!stickerItemModel.isSubtitle()) {
                try {
                    float[] g2 = this.f102861h.mo38849g(stickerItemModel.f83875id);
                    rectF2.set(g2[0] * ((float) c.f116385a), g2[3] * ((float) c.f116386b), g2[2] * ((float) c.f116385a), g2[1] * ((float) c.f116386b));
                    if (rectF2.top < rectF.top || rectF2.bottom > rectF.bottom) {
                        return true;
                    }
                } catch (VEException unused2) {
                    StringBuilder sb2 = new StringBuilder("getInfoStickerBoundingBox error, index is ");
                    sb2.append(stickerItemModel.f83875id);
                    sb2.append(" veState is ");
                    sb2.append(this.f102861h.mo38850h().getValue());
                    C41530am.m132283b(sb2.toString());
                    return false;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo98654b(boolean z, boolean z2) {
        if (this.f102857d != null) {
            this.f102857d.mo98411a(z, z2);
        }
    }

    /* renamed from: C */
    private void m126568C() {
        m126577a(false, (C39548d) null);
    }

    /* renamed from: t */
    private String m126597t() {
        return m126574a(this.f102876w);
    }

    /* renamed from: c */
    public final void mo98655c() {
        if (this.f102845P) {
            m126603z();
        }
    }

    /* renamed from: e */
    public final void mo98667e() {
        m126582b(false, (C39548d) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo98679i() {
        this.f102861h.mo38881x();
    }

    /* renamed from: n */
    private void m126591n() {
        this.f102846Q.getViewTreeObserver().addOnGlobalLayoutListener(new C39667u(this));
    }

    /* renamed from: g */
    public final boolean mo98677g() {
        if (this.f102857d != null) {
            return this.f102857d.f102656w;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo98678h() {
        if (this.f102867n != null) {
            this.f102867n.mo103323b();
        }
    }

    /* renamed from: A */
    private boolean m126566A() {
        if (this.f102876w instanceof C39558aj) {
            return true;
        }
        if ((this.f102876w instanceof C42088k) || !C6399b.m19928c()) {
            return false;
        }
        throw new IllegalStateException();
    }

    /* renamed from: G */
    private C39558aj m126572G() {
        if (this.f102876w == null || !(this.f102876w instanceof C39558aj)) {
            return null;
        }
        return (C39558aj) this.f102876w;
    }

    /* renamed from: p */
    private void m126593p() {
        if (this.f102839J != null) {
            this.f102867n = this.f102839J.getDeleteView();
        }
        if (this.f102854a) {
            this.f102867n.mo103322a();
        }
    }

    /* renamed from: y */
    private void m126602y() {
        this.f102878y = new C39517a(this.f102861h, this.f102856c);
        this.f102878y.f102575e = new C39518a() {
            /* renamed from: a */
            public final void mo98372a() {
                C39591h.this.mo98653b(true);
            }

            /* renamed from: a */
            public final void mo98374a(boolean z) {
                C39591h.this.f102857d.post(new C39557ai(this, true));
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ void mo98691b(boolean z) {
                C39591h.this.f102878y.mo98369c();
                C39591h.this.mo98661c(true);
                C39591h.this.mo98666d();
                C39591h.this.f102857d.invalidate();
                if (z) {
                    C10761a.m31392b(C39591h.this.f102860g.getContext(), (int) R.string.b1n, 0).mo25750a();
                }
            }

            /* renamed from: a */
            public final void mo98373a(String str, C39558aj ajVar) {
                C39591h.this.f102857d.post(new C39556ah(this, ajVar, str));
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo98690a(C39558aj ajVar, String str) {
                C39591h.this.f102878y.mo98369c();
                if (ajVar != null && !TextUtils.isEmpty(str)) {
                    ajVar.f102708c.setPin(true);
                }
                C39591h.this.f102857d.f102641f.mo98607e(ajVar);
            }
        };
    }

    /* renamed from: D */
    private int m126569D() {
        if (C39805en.m127445a()) {
            return ((C39805en.m127452e(this.f102856c) - this.f102848S) - C39805en.m127450c(this.f102856c)) - C39805en.m127451d(this.f102856c);
        }
        return C39805en.m127443a((Context) this.f102856c) - this.f102848S;
    }

    /* renamed from: E */
    private int m126570E() {
        if (C39805en.m127445a()) {
            return (C39805en.m127452e(this.f102856c) - this.f102848S) - C39805en.m127451d(this.f102856c);
        }
        return C39805en.m127443a((Context) this.f102856c) - this.f102848S;
    }

    /* renamed from: o */
    private void m126592o() {
        if (C35563c.f93231M.mo93305a(Property.EnableSubtitleRecognition)) {
            this.f102857d.setStickerOnPlayListener(new C39549aa(this));
        }
        this.f102857d.setStickerOnMoveListener(new C39598c() {
            /* renamed from: a */
            public final Float mo98685a(float f) {
                if (C39591h.this.f102872s != null) {
                    return BorderLineView.m126817a(f);
                }
                return Float.valueOf(f);
            }

            /* renamed from: a */
            public final int mo98683a(C39558aj ajVar, boolean z, boolean z2) {
                if (C39591h.this.f102872s == null) {
                    return -1;
                }
                if (z) {
                    C39591h.this.f102872s.mo98797a();
                } else if (ajVar != null && !C39591h.this.mo98512a() && !C39591h.this.mo98513b()) {
                    return C39591h.this.f102872s.mo98794a(ajVar.mo98495c((float) C39591h.this.f102870q), z2, false);
                }
                return -1;
            }

            /* renamed from: a */
            public final PointF mo98684a(C39558aj ajVar, float f, float f2) {
                if (C39591h.this.f102872s == null || ajVar == null) {
                    return new PointF(0.0f, 0.0f);
                }
                PointF[] c = ajVar.mo98495c((float) C39591h.this.f102870q);
                int length = c.length;
                for (int i = 0; i < length; i++) {
                    PointF pointF = c[i];
                    pointF.x += f;
                    pointF.y += f2;
                }
                return C39591h.this.f102872s.mo98796a(c, f, f2, false);
            }

            /* renamed from: a */
            public final void mo98686a(C39558aj ajVar, int i, int i2, boolean z, boolean z2) {
                boolean z3;
                boolean z4;
                if (!z2) {
                    if (z && ((C39591h.this.f102857d.f102643h == InfoStickerEditView.f102614i && !ajVar.f102719o) || (C39591h.this.f102857d.f102643h == InfoStickerEditView.f102615j && ajVar.f102719o))) {
                        C39591h.this.f102861h.mo38825c(ajVar.f102708c.f83875id, 1.0f);
                    }
                    boolean z5 = true;
                    int i3 = 0;
                    if (C39591h.this.f102862i.f102671c == null || !((Boolean) C39591h.this.f102862i.f102671c.getValue()).booleanValue()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (C39591h.this.f102862i.f102672d == null || !((Boolean) C39591h.this.f102862i.f102672d.getValue()).booleanValue()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (C39591h.this.f102862i == null || (!z3 && !z4)) {
                        z5 = false;
                    }
                    if (!z5) {
                        if (C39805en.m127445a()) {
                            C39804em.m127428a(C39591h.this.f102856c);
                            if (C39804em.m127436a()) {
                                i3 = -C39805en.m127450c(C39591h.this.f102856c);
                            }
                        }
                        boolean a = C39601a.m126688a(C39591h.this.f102871r, ajVar.mo98493b((float) C39591h.this.f102870q, (float) i3));
                        if (C39591h.this.f102867n != null) {
                            C39591h.this.mo98633a(ajVar, C39591h.this.f102867n.mo103321a(i, i2, z, a));
                        }
                    }
                }
                if (C39591h.this.f102874u != null) {
                    C39591h.this.f102874u.mo98686a(ajVar, i, i2, z, z2);
                }
                if (C39591h.this.mo98512a() || C39591h.this.mo98513b()) {
                    C39591h.this.f102861h.mo38881x();
                }
            }
        });
        this.f102857d.f102641f.f102814h = new C39550ab(this);
    }

    /* renamed from: u */
    private void m126598u() {
        if (this.f102849T) {
            C0902i playBoundary = this.f102831B.getPlayBoundary();
            this.f102862i.mo98464a().setValue(C47516v.m148296a((long) ((Long) playBoundary.f3154a).intValue()));
            m126580b(Math.max(((Long) playBoundary.f3154a).intValue() - 30, 0), ((Long) playBoundary.f3155b).intValue());
        }
    }

    /* renamed from: v */
    private void m126599v() {
        if (this.f102849T) {
            mo98655c();
            m126580b(0, this.f102861h.mo38860l());
            this.f102862i.mo98464a().setValue(C47516v.m148296a((long) ((Long) this.f102831B.getPlayBoundary().f3154a).intValue()));
        }
    }

    /* renamed from: w */
    private void m126600w() {
        if (this.f102849T) {
            mo98655c();
            m126580b(0, this.f102861h.mo38860l());
            this.f102862i.mo98464a().setValue(C47516v.m148296a((long) ((Long) this.f102831B.getPlayBoundary().f3155b).intValue()));
        }
    }

    /* renamed from: f */
    public final boolean mo98675f() {
        if (this.f102857d != null) {
            return this.f102857d.f102655v;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo98680j() {
        if (this.f102858e.getVisibility() == 8) {
            this.f102858e.setVisibility(0);
            this.f102862i.mo98464a().setValue(C47516v.m148297b());
            return;
        }
        this.f102858e.setVisibility(8);
        this.f102862i.mo98464a().setValue(C47516v.m148295a());
    }

    /* renamed from: F */
    private C41706n m126571F() {
        int frameWidth = this.f102831B.getFrameWidth();
        int frameHeight = this.f102831B.getFrameHeight();
        int ceil = (int) Math.ceil((double) (((float) (C9738o.m28691a((Context) this.f102856c) - (this.f102831B.getLeftRightMargin() * 2))) / (((float) frameWidth) * 1.0f)));
        if (!this.f102863j.isMultiVideoEdit()) {
            return new C41706n(new VEVideoCoverGeneratorImpl(this.f102861h, this.f102856c, ceil), frameWidth, frameHeight, ceil);
        }
        int i = ceil + 2;
        VEMultiEditVideoCoverGeneratorImpl vEMultiEditVideoCoverGeneratorImpl = new VEMultiEditVideoCoverGeneratorImpl(this.f102861h, this.f102856c, i, this.f102861h.mo38860l(), (int) this.f102863j.getMultiEditVideoStartTime());
        return new C41706n(vEMultiEditVideoCoverGeneratorImpl, frameWidth, frameHeight, i);
    }

    /* renamed from: m */
    private void m126590m() {
        this.f102857d.f102657x = this.f102854a;
        this.f102857d.setVisibility(0);
        this.f102857d.mo98406a(this.f102856c, this.f102866m, this.f102861h, this.f102863j, this.f102851V, this.f102840K);
        if (this.f102839J != null) {
            this.f102839J.mo103300c(this.f102857d.getGestureListener());
        }
        this.f102879z.setVisibility(8);
        this.f102857d.setOnInfoStickerTimeEdit(new C39599i(this));
        this.f102857d.setOnInfoStickerPinEditClick(new C39656j(this));
        this.f102857d.setITimeEditListener(this);
        this.f102857d.setPinHelper(this.f102878y);
    }

    /* renamed from: r */
    private void m126595r() {
        if (!this.f102841L) {
            this.f102841L = true;
            this.f102836G.setTypeface(C10832b.m31784a().mo26161a(C10834d.f29337g));
            this.f102835F.setTypeface(C10832b.m31784a().mo26161a(C10834d.f29337g));
            this.f102835F.setOnClickListener(new C39553ae(this));
            this.f102836G.setOnClickListener(new C39554af(this));
            m126594q();
            this.f102837H.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                public final void onStopTrackingTouch(SeekBar seekBar) {
                }

                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    if (z) {
                        C39591h.this.mo98646b(i);
                    }
                }
            });
        }
    }

    /* renamed from: x */
    private void m126601x() {
        if (this.f102849T) {
            C0902i playBoundary = this.f102831B.getPlayBoundary();
            this.f102862i.mo98464a().setValue(C47516v.m148296a((long) ((Long) playBoundary.f3155b).intValue()));
            m126580b(((Long) playBoundary.f3154a).intValue(), Math.min(((Long) playBoundary.f3155b).intValue() + 30, this.f102861h.mo38860l()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo98681k() {
        int i;
        if (this.f102861h != null) {
            VESize c = this.f102861h.mo38828c();
            this.f102870q = (C39805en.m127447b(this.f102856c) - c.f116385a) >> 1;
            if (C39805en.m127445a()) {
                int f = C39805en.m127453f(this.f102856c);
                this.f102847R = (((C39805en.m127452e(this.f102856c) - C39804em.m127429a((Context) this.f102856c, f)) - c.f116386b) / 2) + C39804em.m127438b(this.f102856c, f);
                return;
            }
            int e = C39805en.m127452e(this.f102856c);
            if (this.f102851V) {
                i = C39805en.m127450c(this.f102856c);
            } else {
                i = 0;
            }
            this.f102847R = ((e - i) - c.f116386b) >> 1;
        }
    }

    /* renamed from: B */
    private void m126567B() {
        CharSequence charSequence;
        boolean z;
        String str;
        if (this.f102845P) {
            charSequence = this.f102830A.getContext().getResources().getString(R.string.e5g);
        } else {
            float selectedTime = this.f102831B.getSelectedTime();
            if (1000.0f * selectedTime * 0.99f < ((float) this.f102831B.getMinVideoLength())) {
                z = true;
            } else {
                z = false;
            }
            String a = C1642a.m8035a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(selectedTime)});
            try {
                str = this.f102830A.getContext().getResources().getString(R.string.btw, new Object[]{a});
            } catch (FormatFlagsConversionMismatchException e) {
                String string = this.f102830A.getContext().getResources().getString(R.string.btv, new Object[]{a});
                m126576a(e, string);
                str = string;
            }
            if (z) {
                charSequence = C41536ap.m132294a(new SpannableString(str), str.indexOf(a), str.indexOf(a) + a.length(), this.f102830A.getResources().getColor(R.color.a_n));
            } else {
                charSequence = str;
            }
        }
        this.f102830A.setText(charSequence);
    }

    /* renamed from: l */
    private void m126589l() {
        this.f102846Q = (FrameLayout) this.f102840K.findViewById(R.id.cws);
        this.f102857d = (InfoStickerEditView) this.f102840K.findViewById(R.id.b17);
        this.f102858e = this.f102840K.findViewById(R.id.bb4);
        this.f102879z = this.f102840K.findViewById(R.id.a24);
        this.f102830A = (DmtTextView) this.f102840K.findViewById(R.id.di7);
        this.f102831B = (VideoEditView) this.f102840K.findViewById(R.id.eak);
        this.f102832C = (ImageView) this.f102840K.findViewById(R.id.sp);
        this.f102833D = (ImageView) this.f102840K.findViewById(R.id.cy3);
        this.f102834E = (ImageView) this.f102840K.findViewById(R.id.r5);
        this.f102860g = this.f102840K.findViewById(R.id.cbq);
        this.f102835F = (TextView) this.f102840K.findViewById(R.id.cbp);
        this.f102836G = (TextView) this.f102840K.findViewById(R.id.cbt);
        this.f102837H = (SeekBar) this.f102840K.findViewById(R.id.cbr);
        this.f102853X = (EditCornerViewModel) C36113b.m116288a(this.f102856c).mo91871a(EditCornerViewModel.class);
        m126602y();
        m126590m();
        m126591n();
        m126593p();
        m126592o();
    }

    /* renamed from: q */
    private void m126594q() {
        if (!this.f102843N) {
            this.f102843N = true;
            int l = this.f102861h.mo38860l();
            this.f102859f = (CutMultiVideoViewModel) C0069x.m159a(this.f102856c).mo147a(CutMultiVideoViewModel.class);
            boolean z = false;
            this.f102831B.setCanEdit(false);
            this.f102831B.setMinVideoLength(1000);
            this.f102831B.setMaxVideoLength((long) l);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f102859f;
            if (this.f102863j.isMvThemeVideoType() || this.f102863j.isStatusVideoType()) {
                z = true;
            }
            cutMultiVideoViewModel.f100404k = z;
            this.f102859f.f100405l = l;
            this.f102831B.setFirstFrameVisibleLiveData(this.f102869p);
            this.f102831B.setFirstFrameBitmapLiveData(this.f102868o);
            this.f102831B.setVeEditor(this.f102861h);
            this.f102852W = m126571F();
            if (this.f102865l == null || this.f102865l.isEmpty()) {
                this.f102831B.mo97632a(this.f102856c, this.f102859f, this.f102864k);
            } else {
                this.f102831B.mo97631a(this.f102856c, this.f102859f, this.f102852W, this.f102865l);
            }
            this.f102831B.setEnableBoundaryText(true);
            this.f102831B.setPointerType(2);
        }
    }

    /* renamed from: s */
    private void m126596s() {
        if (!this.f102842M) {
            this.f102842M = true;
            this.f102832C.setOnClickListener(new C39555ag(this));
            this.f102833D.setOnClickListener(new C39657k(this));
            this.f102834E.setOnClickListener(new C39658l(this));
            m126594q();
            VideoEditViewModel videoEditViewModel = this.f102831B.getVideoEditViewModel();
            videoEditViewModel.f101837b.observe(this.f102856c, new C39659m(this));
            videoEditViewModel.f101840e.observe(this.f102856c, new C39660n(this));
            videoEditViewModel.f101845j.observe(this.f102856c, new C39661o(this));
            videoEditViewModel.f101843h.observe(this.f102856c, new C39662p(this));
            videoEditViewModel.f101844i.observe(this.f102856c, new C39663q(this));
            videoEditViewModel.f101841f.observe(this.f102856c, new C39664r(this));
            videoEditViewModel.f101842g.observe(this.f102856c, new C39665s(this));
            videoEditViewModel.f101839d.observe(this.f102856c, new C39666t(this));
        }
    }

    /* renamed from: z */
    private void m126603z() {
        this.f102845P = !this.f102845P;
        mo98661c(this.f102845P);
        m126567B();
        if (this.f102875v != null) {
            this.f102875v.mo98693b(this.f102845P);
        }
        if (!this.f102845P) {
            this.f102834E.setImageDrawable(this.f102856c.getResources().getDrawable(R.drawable.wj));
            this.f102862i.mo98464a().setValue(C47516v.m148296a((long) this.f102861h.mo38862m()));
            this.f102862i.mo98464a().setValue(C47516v.m148297b());
            this.f102866m.removeCallbacks(this.f102873t);
            if (this.f102876w != null) {
                this.f102876w.setAlpha(true);
            }
        } else {
            this.f102834E.setImageDrawable(this.f102856c.getResources().getDrawable(R.drawable.wi));
            this.f102866m.post(this.f102873t);
            this.f102862i.mo98464a().setValue(C47516v.m148295a());
        }
        this.f102831B.mo97639b(true ^ this.f102845P);
    }

    /* renamed from: d */
    public final boolean mo98666d() {
        this.f102857d.mo98424g();
        if (this.f102857d == null || this.f102857d.f102641f == null || this.f102857d.f102641f.f102807a == null || this.f102857d.f102641f.f102807a.size() <= 0) {
            return false;
        }
        boolean z = false;
        for (C39558aj ajVar : this.f102857d.f102641f.f102807a) {
            if (ajVar.f102709d) {
                ajVar.f102709d = false;
                z = true;
            }
        }
        if (z) {
            this.f102857d.f102659z = false;
            this.f102857d.invalidate();
        }
        return z;
    }

    /* renamed from: b */
    private static boolean m126583b(C39545a aVar) {
        return aVar instanceof C39558aj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98639a(Void voidR) {
        m126598u();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo98660c(Void voidR) {
        m126598u();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo98664d(Void voidR) {
        m126599v();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo98670e(Void voidR) {
        m126601x();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo98674f(Void voidR) {
        m126600w();
    }

    /* renamed from: f */
    private void m126586f(C39548d dVar) {
        m126578a(true, dVar, false);
    }

    /* renamed from: a */
    public final int mo98617a(StickerItemModel stickerItemModel) {
        return this.f102857d.mo98398a(stickerItemModel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo98648b(View view) {
        m126603z();
    }

    /* renamed from: d */
    public final void mo98662d(int i) {
        this.f102857d.mo98414b(i);
    }

    /* renamed from: f */
    private void m126587f(boolean z) {
        if (C39805en.m127445a() && this.f102853X != null) {
            this.f102853X.mo106198a(z);
        }
    }

    /* renamed from: a */
    public final int mo98618a(UtteranceWithWords utteranceWithWords) {
        return this.f102857d.mo98399a(utteranceWithWords);
    }

    /* renamed from: b */
    public final void mo98650b(C39548d dVar) {
        m126577a(true, dVar);
    }

    /* renamed from: c */
    public final void mo98656c(int i) {
        this.f102857d.mo98404a(i);
    }

    /* renamed from: d */
    public final void mo98665d(boolean z) {
        mo98654b(z, true);
    }

    /* renamed from: e */
    public final void mo98668e(int i) {
        this.f102857d.mo98420d(i);
    }

    /* renamed from: a */
    private static String m126574a(C39545a aVar) {
        if (m126583b(aVar)) {
            return ((C39558aj) aVar).f102708c.stickerId;
        }
        if (aVar instanceof C42088k) {
            return "text_sticker";
        }
        return "";
    }

    /* renamed from: c */
    public final void mo98658c(C39548d dVar) {
        m126582b(true, dVar);
    }

    /* renamed from: e */
    public final void mo98671e(boolean z) {
        if (this.f102857d != null) {
            this.f102857d.mo98418c(z);
        }
    }

    /* renamed from: f */
    public final void mo98672f(int i) {
        this.f102857d.mo98417c(i);
    }

    /* renamed from: g */
    public final void mo98676g(int i) {
        if (this.f102857d != null) {
            this.f102857d.mo98422e(i);
        }
        if (this.f102842M) {
            if (this.f102859f != null) {
                this.f102859f.f100405l = i;
            }
            this.f102831B.mo97623a(i);
        }
    }

    /* renamed from: d */
    private void m126584d(C39548d dVar) {
        this.f102837H.setProgress((int) ((((float) (this.f102861h.mo38862m() - dVar.mo98472a(0))) / ((float) (dVar.mo98474b(this.f102861h.mo38860l()) - dVar.mo98472a(0)))) * 100.0f));
    }

    /* renamed from: g */
    private void m126588g(C39548d dVar) {
        int a = dVar.mo98472a(0);
        int b = dVar.mo98474b(this.f102861h.mo38860l());
        if (a >= 0 && b >= 0 && !m126579a(a, b, 0, dVar)) {
            this.f102866m.postDelayed(new C39671y(this, a, b, dVar), 300);
        }
        m126567B();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo98659c(C39558aj ajVar) {
        this.f102862i.f102671c.setValue(Boolean.valueOf(true));
        mo98650b((C39548d) ajVar);
    }

    /* renamed from: b */
    private void m126581b(RectF rectF) {
        for (StickerItemModel stickerItemModel : this.f102863j.infoStickerModel.stickers) {
            if (stickerItemModel.isSubtitle() && stickerItemModel.getText().length() >= 16) {
                rectF.top -= (rectF.bottom - rectF.top) / 2.0f;
                rectF.bottom += (rectF.bottom - rectF.top) / 2.0f;
                return;
            }
        }
    }

    /* renamed from: e */
    private void m126585e(C39548d dVar) {
        String str;
        String str2;
        if (dVar != null) {
            C42962b bVar = C42962b.f111525a;
            String str3 = "prop_time_set";
            C22984d a = C22984d.m75611a().mo59973a("prop_id", m126574a((C39545a) dVar)).mo59973a("creation_id", this.f102863j.creationId);
            String str4 = "method";
            if (this.f102876w == null) {
                str = "click";
            } else {
                str = "change";
            }
            C22984d a2 = a.mo59973a(str4, str).mo59970a("draft_id", this.f102863j.draftId).mo59973a("content_type", this.f102863j.getAvetParameter().getContentType()).mo59973a("content_source", this.f102863j.getAvetParameter().getContentSource()).mo59973a("shoot_entrance", this.f102863j.mShootWay);
            String str5 = "enter_from";
            if (this.f102854a) {
                str2 = "edit_post_page";
            } else {
                str2 = "video_edit_page";
            }
            bVar.mo104671a(str3, a2.mo59973a(str5, str2).f60753a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo98657c(View view) {
        String str;
        this.f102857d.mo98421e();
        this.f102877x.clear();
        C42962b bVar = C42962b.f111525a;
        String str2 = "prop_timeset_confirm";
        C22984d a = C22984d.m75611a().mo59973a("prop_id", m126597t()).mo59973a("creation_id", this.f102863j.creationId).mo59970a("draft_id", this.f102863j.draftId).mo59973a("content_source", this.f102863j.getAvetParameter().getContentSource()).mo59973a("shoot_entrance", this.f102863j.mShootWay);
        String str3 = "enter_from";
        if (this.f102854a) {
            str = "edit_post_page";
        } else {
            str = "video_edit_page";
        }
        bVar.mo104671a(str2, a.mo59973a(str3, str).f60753a);
        m126568C();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo98663d(View view) {
        String str;
        this.f102857d.mo98412b();
        C42962b bVar = C42962b.f111525a;
        String str2 = "prop_timeset_cancel";
        C22984d a = C22984d.m75611a().mo59973a("prop_id", m126597t()).mo59973a("creation_id", this.f102863j.creationId).mo59970a("draft_id", this.f102863j.draftId).mo59973a("content_source", this.f102863j.getAvetParameter().getContentSource()).mo59973a("shoot_entrance", this.f102863j.mShootWay);
        String str3 = "enter_from";
        if (this.f102854a) {
            str = "edit_post_page";
        } else {
            str = "video_edit_page";
        }
        bVar.mo104671a(str2, a.mo59973a(str3, str).f60753a);
        m126568C();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo98673f(View view) {
        this.f102857d.mo98416c();
        mo98653b(false);
        C42962b.f111525a.mo104671a("prop_pin_cancel", C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("shoot_way", this.f102863j.mShootWay).mo59973a("creation_id", this.f102863j.creationId).mo59973a("content_type", this.f102863j.getAvetParameter().getContentType()).mo59973a("content_source", this.f102863j.getAvetParameter().getContentSource()).mo59973a("prop_id", m126597t()).f60753a);
    }

    /* renamed from: c */
    public final void mo98661c(boolean z) {
        this.f102857d.mo98415b(z);
        if (this.f102876w != null && m126566A()) {
            this.f102876w.setAlpha(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo98669e(View view) {
        this.f102857d.mo98419d();
        this.f102877x.clear();
        C39558aj G = m126572G();
        if (G != null) {
            this.f102878y.mo98368b(G);
        }
        C42962b.f111525a.mo104671a("prop_pin_confirm", C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("shoot_way", this.f102863j.mShootWay).mo59973a("creation_id", this.f102863j.creationId).mo59973a("content_type", this.f102863j.getAvetParameter().getContentType()).mo59973a("content_source", this.f102863j.getAvetParameter().getContentSource()).mo59973a("prop_id", m126597t()).f60753a);
    }

    /* renamed from: b */
    public final void mo98646b(int i) {
        if (this.f102850U && this.f102876w != null && (this.f102876w instanceof C39548d)) {
            this.f102862i.mo98464a().setValue(C47516v.m148296a(m126573a(this.f102831B.getVideoEditViewModel().mo97721n(), ((float) ((C39548d) this.f102876w).mo98472a(0)) + (((float) ((((C39548d) this.f102876w).mo98474b(this.f102861h.mo38860l()) - ((C39548d) this.f102876w).mo98472a(0)) * i)) / 100.0f), this.f102831B.getVideoEditViewModel().mo97722o())));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo98649b(FrameLayout frameLayout) {
        VESize c = this.f102861h.mo38828c();
        if (c.f116385a != 0 && c.f116386b != 0) {
            int[] a = C39560al.m126373a((View) frameLayout, c.f116385a, c.f116386b, this.f102855b);
            this.f102870q = a[0];
            this.f102847R = a[1];
            LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
            this.f102871r = new Rect(0, layoutParams.topMargin, layoutParams.width, layoutParams.height + layoutParams.topMargin);
            this.f102872s = BorderLineView.m126816a(this.f102856c, layoutParams.width, layoutParams.height, this.f102870q, this.f102847R);
            frameLayout.addView(this.f102872s);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo98651b(C39558aj ajVar) {
        this.f102862i.f102672d.setValue(Boolean.valueOf(true));
        m126586f((C39548d) ajVar);
    }

    /* renamed from: b */
    private void m126580b(int i, int i2) {
        m126567B();
        if (this.f102876w != null) {
            if (m126566A()) {
                this.f102857d.mo98408a((C39558aj) this.f102876w, i, i2, 0);
                return;
            }
            TextStickerData data = ((C42088k) this.f102876w).getData();
            if (data != null) {
                data.mStartTime = i;
                data.mEndTime = i2;
            }
        }
    }

    /* renamed from: a */
    private void m126576a(FormatFlagsConversionMismatchException formatFlagsConversionMismatchException, String str) {
        try {
            StringBuilder sb = new StringBuilder("normal_str=");
            sb.append(str);
            sb.append(", error_str=");
            sb.append(this.f102830A.getContext().getResources().getString(R.string.btw));
            C6893q.m21447a("info_sticker_string_format_event", C38510bb.m123095a().mo96481a("exception", C13315l.m38963c(formatFlagsConversionMismatchException)).mo96481a("event", sb.toString()).mo96482b());
        } catch (Exception e) {
            C41530am.m132283b(e.getLocalizedMessage());
        }
    }

    /* renamed from: b */
    private void m126582b(boolean z, C39548d dVar) {
        this.f102849T = z;
        mo98630a(dVar);
        this.f102848S = this.f102879z.getHeight();
        if (this.f102848S == 0) {
            this.f102848S = ((int) C9738o.m28708b((Context) this.f102856c, 210.0f)) + 84;
        }
        boolean z2 = !z;
        int i = 0;
        if (z) {
            this.f102844O = this.f102842M;
            this.f102842M = false;
            this.f102857d.f102643h = InfoStickerEditView.f102615j;
            this.f102857d.f102641f.mo98606e();
            this.f102858e.setOnClickListener(new C39670x(this));
        } else {
            this.f102842M = this.f102844O;
            this.f102857d.f102643h = 0;
            this.f102858e.setVisibility(8);
            this.f102858e.setOnClickListener(null);
        }
        InfoStickerEditView infoStickerEditView = this.f102857d;
        if (!z2) {
            i = 4;
        }
        infoStickerEditView.setVisibility(i);
        if (z2) {
            this.f102857d.mo98423f();
        }
        if (this.f102875v != null) {
            this.f102875v.mo98692a(z);
        }
    }

    /* renamed from: a */
    private void m126575a(C39548d dVar, int i) {
        if (dVar != this.f102876w) {
            if (dVar != null) {
                if (!this.f102877x.containsKey(dVar)) {
                    this.f102877x.put(dVar, dVar.mo98475e());
                }
                dVar.setAlpha(true);
                if (m126583b((C39545a) dVar)) {
                    this.f102866m.post(new C39551ac(this));
                }
                if (this.f102842M && i == 0) {
                    m126588g(dVar);
                }
                if (this.f102876w != null) {
                    switch (i) {
                        case 0:
                            if (this.f102842M) {
                                this.f102876w.setAlpha(false);
                                break;
                            }
                            break;
                        case 1:
                            if (this.f102841L) {
                                this.f102876w.setAlpha(false);
                                break;
                            }
                            break;
                    }
                    if (m126583b(this.f102876w)) {
                        this.f102861h.mo38881x();
                    }
                }
                if (i == 0) {
                    m126585e(dVar);
                }
                if (i == 1) {
                    m126584d(dVar);
                }
            } else {
                for (Entry entry : this.f102877x.entrySet()) {
                    C39548d dVar2 = (C39548d) entry.getKey();
                    C39546b bVar = (C39546b) entry.getValue();
                    if (!(dVar2 == null || bVar == null)) {
                        dVar2.mo98473a(bVar, this.f102857d.f102638c, this.f102857d.f102639d);
                    }
                }
                this.f102877x.clear();
            }
            this.f102876w = dVar;
        }
    }

    /* renamed from: a */
    private void m126577a(boolean z, C39548d dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f102849T = z;
        m126587f(!z);
        m126596s();
        mo98661c(!z);
        mo98630a(dVar);
        this.f102848S = this.f102879z.getHeight();
        if (this.f102848S == 0) {
            this.f102848S = ((int) C9738o.m28708b((Context) this.f102856c, 210.0f)) + 84;
        }
        C27439r.m89908a(this.f102879z, z, this.f102848S, this.f102879z, (C6892b<Void>) new C39669w<Void>(this, z));
        if (this.f102875v != null) {
            this.f102875v.mo98692a(z);
        }
        if (z) {
            C0052o b = this.f102862i.mo98465b();
            int a = C42111b.f109618a.mo103542a(true, false, false, false, false);
            if (C39805en.m127445a()) {
                i3 = C39805en.m127450c(this.f102856c);
            } else {
                i3 = 0;
            }
            int i5 = this.f102848S;
            int D = m126569D();
            if (C39805en.m127445a()) {
                i4 = C39804em.m127438b(this.f102856c, C39804em.f103457a);
            } else {
                i4 = 0;
            }
            b.setValue(C47518x.m148299a(a, i3, i5, D, i4, 0));
            this.f102834E.setImageDrawable(this.f102834E.getContext().getResources().getDrawable(R.drawable.wj));
            this.f102834E.setEnabled(true);
            this.f102831B.setEnabled(true);
            this.f102831B.mo97639b(true);
            this.f102862i.mo98464a().setValue(C47516v.m148298b(0));
            return;
        }
        this.f102834E.setEnabled(false);
        this.f102831B.setEnabled(false);
        this.f102866m.removeCallbacks(this.f102873t);
        this.f102862i.mo98464a().setValue(C47516v.m148297b());
        C0052o b2 = this.f102862i.mo98465b();
        int color = this.f102857d.getResources().getColor(R.color.l3);
        if (C39805en.m127445a()) {
            i = C39805en.m127450c(this.f102856c);
        } else {
            i = 0;
        }
        int i6 = this.f102848S;
        int D2 = m126569D();
        if (C39805en.m127445a()) {
            i2 = C39804em.m127438b(this.f102856c, C39804em.f103457a);
        } else {
            i2 = 0;
        }
        b2.setValue(C47518x.m148302b(color, i, i6, D2, i2, 0));
        this.f102845P = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo98647b(int i, int i2, int[] iArr) {
        if (i != 0 && i2 != 0 && iArr != null) {
            this.f102871r = new Rect(0, iArr[1], i, i2 + iArr[1]);
        }
    }

    /* renamed from: a */
    private static long m126573a(List<VideoSegment> list, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!((VideoSegment) list.get(i2)).f100768j) {
                arrayList.add(list.get(i2));
            }
        }
        long j = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                break;
            }
            VideoSegment videoSegment = (VideoSegment) arrayList.get(i3);
            j += videoSegment.f100761c;
            if (f <= ((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / (videoSegment.mo96911j() * f2)) {
                i = i3;
                break;
            }
            f -= ((float) (videoSegment.mo96910i() - videoSegment.mo96909h())) / (videoSegment.mo96911j() * f2);
            i3++;
        }
        if (i3 == arrayList.size()) {
            return (j - ((VideoSegment) arrayList.get(i)).f100761c) + ((VideoSegment) arrayList.get(i)).mo96910i();
        }
        return (long) (((float) ((j - ((VideoSegment) arrayList.get(i)).f100761c) + ((VideoSegment) arrayList.get(i)).mo96909h())) + (f * ((VideoSegment) arrayList.get(i)).mo96911j() * f2));
    }

    /* renamed from: a */
    private void m126578a(boolean z, C39548d dVar, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3 = z;
        this.f102850U = z3;
        m126587f(!z3);
        m126595r();
        mo98661c(!z3);
        m126575a(dVar, 1);
        this.f102848S = this.f102860g.getHeight();
        if (this.f102848S == 0) {
            this.f102848S = (int) C9738o.m28708b((Context) this.f102856c, 120.0f);
        }
        this.f102837H.setProgress((int) ((((float) this.f102861h.mo38862m()) * 100.0f) / ((float) this.f102861h.mo38860l())));
        C27439r.m89908a(this.f102860g, z3, this.f102848S, this.f102860g, (C6892b<Void>) new C39668v<Void>(this, z3, z2));
        if (this.f102875v != null) {
            this.f102875v.mo98692a(z3);
        }
        if (z3) {
            C0052o b = this.f102862i.mo98465b();
            int a = C42111b.f109618a.mo103542a(true, false, false, false, false);
            int i4 = this.f102848S;
            int E = m126570E();
            if (C39805en.m127445a()) {
                i3 = C39804em.m127438b(this.f102856c, C39804em.f103457a);
            } else {
                i3 = 0;
            }
            b.setValue(C47518x.m148301a(a, 0, i4, E, i3, 0, true, false, z2));
            this.f102834E.setImageDrawable(this.f102834E.getContext().getResources().getDrawable(R.drawable.wj));
            this.f102834E.setEnabled(true);
            return;
        }
        this.f102834E.setEnabled(false);
        this.f102866m.removeCallbacks(this.f102873t);
        this.f102862i.mo98464a().setValue(C47516v.m148297b());
        C0052o b2 = this.f102862i.mo98465b();
        int color = this.f102857d.getResources().getColor(R.color.l3);
        if (C39805en.m127445a()) {
            i = C39805en.m127450c(this.f102856c);
        } else {
            i = 0;
        }
        int i5 = this.f102848S;
        int E2 = m126570E();
        if (C39805en.m127445a()) {
            i2 = C39804em.m127438b(this.f102856c, C39804em.f103457a);
        } else {
            i2 = 0;
        }
        b2.setValue(C47518x.m148300a(color, i, i5, E2, i2, 0, z2, true));
        this.f102845P = false;
    }

    /* renamed from: a */
    private boolean m126579a(int i, int i2, int i3, C39548d dVar) {
        boolean a = this.f102831B.mo97630a(i, i2, 0);
        if (a && dVar != null) {
            this.f102859f.f100395b.setValue(Long.valueOf((long) dVar.mo98472a(0)));
            this.f102862i.mo98464a().setValue(C47516v.m148298b((long) dVar.mo98472a(0)));
        }
        return a;
    }
}
