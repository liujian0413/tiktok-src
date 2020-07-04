package com.p280ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33151b;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d.C33154a;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d.C33156c;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C40132e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.C7581n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.MediaAdapter */
public class MediaAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public boolean f86205a;

    /* renamed from: b */
    public final List<MediaModel> f86206b = new ArrayList();

    /* renamed from: c */
    public final Set<MediaModel> f86207c = new HashSet(9);

    /* renamed from: d */
    public List<Integer> f86208d;

    /* renamed from: e */
    public List<Integer> f86209e;

    /* renamed from: f */
    public boolean f86210f;

    /* renamed from: g */
    public C33140a f86211g;

    /* renamed from: h */
    public int f86212h = -1;

    /* renamed from: i */
    public int f86213i = -1;

    /* renamed from: j */
    public int f86214j = -1;

    /* renamed from: k */
    public boolean f86215k;

    /* renamed from: l */
    public List<MediaModel> f86216l;

    /* renamed from: m */
    public VideoChooseFragment f86217m;

    /* renamed from: n */
    public final C33153d f86218n = C33153d.m106972a();

    /* renamed from: o */
    public C33177i f86219o;

    /* renamed from: p */
    private final Context f86220p;

    /* renamed from: q */
    private int f86221q;

    /* renamed from: r */
    private int f86222r;

    /* renamed from: s */
    private int f86223s = 0;

    /* renamed from: t */
    private int f86224t;

    /* renamed from: u */
    private double f86225u;

    /* renamed from: v */
    private C33185q f86226v;

    /* renamed from: w */
    private C33156c f86227w = new C33156c() {
        /* renamed from: a */
        public final void mo84870a() {
            MediaAdapter.this.f86207c.clear();
            MediaAdapter.this.f86207c.addAll(MediaAdapter.this.f86218n.mo84910c());
        }
    };

    /* renamed from: x */
    private C33154a f86228x = new C33154a() {
        /* renamed from: a */
        public final void mo84854a(int i) {
            if (4 == i) {
                MediaAdapter.this.f86206b.clear();
                MediaAdapter.this.f86206b.addAll(MediaAdapter.this.f86218n.mo84898a(i));
                MediaAdapter.this.mo84865a(MediaAdapter.this.f86206b.size());
                MediaAdapter.this.f86217m.mo84886f();
            }
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.MediaAdapter$a */
    public interface C33140a {
        /* renamed from: a */
        void mo80206a(View view, MediaModel mediaModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.MediaAdapter$b */
    static class C33141b extends C1293v {

        /* renamed from: a */
        RemoteImageView f86243a;

        /* renamed from: b */
        TextView f86244b;

        /* renamed from: c */
        TextView f86245c;

        /* renamed from: d */
        View f86246d;

        /* renamed from: e */
        FrameLayout f86247e;

        /* renamed from: f */
        View f86248f;

        /* renamed from: a */
        public final void mo84875a() {
            this.f86245c.setText("");
            this.f86245c.setBackgroundResource(R.drawable.ne);
        }

        C33141b(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo84876a(int i) {
            this.f86245c.setText(String.valueOf(i + 1));
            this.f86245c.setBackgroundResource(R.drawable.nf);
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public final void mo84867a(Collection<? extends MediaModel> collection, Collection<? extends MediaModel> collection2) {
        this.f86206b.clear();
        this.f86206b.addAll(collection);
        mo84865a(this.f86206b.size());
        this.f86217m.mo84886f();
    }

    /* renamed from: a */
    public final void mo84865a(int i) {
        if (this.f86209e == null) {
            this.f86209e = new ArrayList();
        } else {
            this.f86209e.clear();
        }
        if (this.f86208d == null) {
            this.f86208d = new ArrayList();
        } else {
            this.f86208d.clear();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f86208d.add(Integer.valueOf(-1));
        }
    }

    /* renamed from: a */
    public final void mo84864a() {
        this.f86218n.mo84904a(this.f86227w);
        this.f86218n.mo84902a(this.f86228x);
    }

    /* renamed from: a */
    public final void mo84866a(final C33141b bVar, final int i, MediaModel mediaModel) {
        int indexOf = this.f86209e.indexOf(Integer.valueOf(i));
        if (indexOf >= 0) {
            this.f86208d.set(i, Integer.valueOf(-1));
            bVar.mo84875a();
            this.f86205a = true;
            bVar.f86248f.animate().alpha(0.0f).setDuration(300).withEndAction(new Runnable() {
                public final void run() {
                    bVar.f86248f.setVisibility(4);
                    bVar.f86248f.setAlpha(1.0f);
                    MediaAdapter.this.notifyItemChanged(i);
                    MediaAdapter.this.f86205a = false;
                }
            }).start();
            bVar.f86243a.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
            if (this.f86216l != null) {
                this.f86216l.remove(indexOf);
            }
            this.f86209e.remove(Integer.valueOf(i));
            int size = this.f86209e.size();
            while (indexOf < size) {
                this.f86208d.set(((Integer) this.f86209e.get(indexOf)).intValue(), Integer.valueOf(indexOf));
                if (size != 11) {
                    notifyItemChanged(((Integer) this.f86209e.get(indexOf)).intValue());
                }
                indexOf++;
            }
            if (size == 11) {
                this.f86217m.mo84886f();
            }
            if (this.f86219o != null) {
                this.f86219o.mo84846a(this.f86216l);
            }
            return;
        }
        m106919b(bVar, i, mediaModel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo84862a(Context context, String str, Long l, Integer num, String str2) {
        m106917a(str, 1, l.longValue(), "select");
        C6893q.m21444a("aweme_movie_import_error_rate", 1, C6869c.m21381a().mo16887a("errorCode", String.valueOf(num)).mo16887a("errorMsg", str2).mo16888b());
        C40132e.m128287a(context, num.intValue(), -1);
        return null;
    }

    /* renamed from: a */
    private static void m106917a(String str, int i, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C6893q.m21448a("aweme_video_import_duration", jSONObject, C6869c.m21381a().mo16887a("status", String.valueOf(i)).mo16887a("scene_name", str2).mo16887a("type", str).mo16888b());
        } catch (JSONException unused) {
        }
    }

    public int getItemCount() {
        return this.f86206b.size();
    }

    /* renamed from: b */
    public final void mo84868b() {
        this.f86218n.mo84909b(this.f86227w);
        this.f86218n.mo84907b(this.f86228x);
    }

    /* renamed from: c */
    public final void mo84869c() {
        mo84865a(this.f86206b.size());
        this.f86217m.mo84886f();
        if (!C6311g.m19573a(this.f86216l)) {
            this.f86216l.clear();
            if (this.f86219o != null) {
                this.f86219o.mo84846a(this.f86216l);
            }
        }
    }

    /* renamed from: b */
    private static String m106918b(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            return C1642a.m8035a(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)});
        }
        return C1642a.m8035a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)});
    }

    /* renamed from: a */
    private void m106912a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.f86223s) {
            int i = layoutParams.height;
            double d = (double) this.f86223s;
            double d2 = this.f86225u;
            Double.isNaN(d);
            if (i != ((int) (d * d2))) {
                layoutParams.width = this.f86223s;
                double d3 = (double) this.f86223s;
                double d4 = this.f86225u;
                Double.isNaN(d3);
                layoutParams.height = (int) (d3 * d4);
            }
        }
    }

    /* renamed from: a */
    private void m106913a(C33141b bVar) {
        if (!this.f86215k) {
            bVar.f86244b.setBackgroundResource(0);
            return;
        }
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.mo32879a(C9738o.m28708b(this.f86220p, 2.0f));
        C13438a a = new C13439b(this.f86220p.getResources()).mo32908a();
        a.mo32897a(roundingParams);
        bVar.f86243a.setHierarchy(a);
        bVar.f86244b.setBackgroundResource(R.drawable.b94);
        Drawable drawable = this.f86220p.getResources().getDrawable(R.drawable.cor);
        bVar.f86244b.setCompoundDrawablePadding((int) C9738o.m28708b(this.f86220p, 2.0f));
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        bVar.f86244b.setCompoundDrawables(drawable, null, null, null);
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        m106914a((C33141b) vVar, i);
    }

    /* renamed from: b */
    private void m106920b(C33141b bVar, MediaModel mediaModel) {
        int round = Math.round((((float) mediaModel.f88159e) * 1.0f) / 1000.0f);
        bVar.f86246d.setVisibility(4);
        bVar.f86244b.setText(m106918b(round));
    }

    /* renamed from: a */
    private void m106910a(int i, C33141b bVar) {
        float f;
        int intValue = ((Integer) this.f86208d.get(i)).intValue();
        float f2 = 1.0f;
        if (intValue >= 0) {
            bVar.mo84876a(intValue);
            bVar.f86248f.setVisibility(0);
            f = 1.0f;
            f2 = 1.1f;
        } else {
            bVar.mo84875a();
            bVar.f86248f.setVisibility(4);
            if (this.f86209e.size() >= 12) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
        }
        if (bVar.f86243a.getAlpha() != f) {
            bVar.f86243a.setAlpha(f);
        }
        if (bVar.f86243a.getScaleX() != f2) {
            bVar.f86243a.setScaleX(f2);
            bVar.f86243a.setScaleY(f2);
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f86220p).inflate(R.layout.ad9, null);
        C33141b bVar = new C33141b(inflate);
        bVar.f86243a = (RemoteImageView) inflate.findViewById(R.id.bxo);
        bVar.f86244b = (TextView) inflate.findViewById(R.id.eaj);
        bVar.f86245c = (TextView) inflate.findViewById(R.id.ayi);
        bVar.f86246d = inflate.findViewById(R.id.e7w);
        bVar.f86246d.setVisibility(8);
        bVar.f86248f = inflate.findViewById(R.id.d28);
        bVar.f86247e = (FrameLayout) inflate.findViewById(R.id.amg);
        inflate.setTag(bVar);
        return bVar;
    }

    /* renamed from: a */
    private void m106914a(C33141b bVar, int i) {
        m106912a((View) bVar.f86243a);
        m106912a(bVar.f86246d);
        m106912a(bVar.f86248f);
        MediaModel mediaModel = (MediaModel) this.f86206b.get(i);
        m106911a(i, bVar, mediaModel);
        m106915a(bVar, mediaModel);
        m106916a(bVar, mediaModel, i);
    }

    /* renamed from: a */
    private void m106915a(C33141b bVar, MediaModel mediaModel) {
        StringBuilder sb = new StringBuilder("file://");
        sb.append(mediaModel.f88156b);
        bVar.f86243a.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32729b(bVar.f86243a.getController())).mo32748b(ImageRequestBuilder.m40865a(Uri.parse(sb.toString())).mo33468a(new C13596d(this.f86223s, this.f86223s)).mo33476b())).mo32730f());
    }

    /* renamed from: a */
    private void m106916a(final C33141b bVar, final MediaModel mediaModel, final int i) {
        bVar.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                boolean z;
                ClickInstrumentation.onClick(view);
                if (i < MediaAdapter.this.f86208d.size()) {
                    if (((Integer) MediaAdapter.this.f86208d.get(i)).intValue() >= 0 || MediaAdapter.this.f86209e.size() < 12) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        MediaAdapter.this.f86211g.mo80206a(view, mediaModel);
                    }
                }
            }
        });
        bVar.f86247e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!MediaAdapter.this.f86205a) {
                    C33175g.m107023a(true, true);
                    MediaAdapter.this.mo84866a(bVar, i, mediaModel);
                }
            }
        });
    }

    /* renamed from: b */
    private void m106919b(C33141b bVar, int i, MediaModel mediaModel) {
        MediaModel mediaModel2 = mediaModel;
        this.f86226v.mo84891a(mediaModel2, 0, -1, new C33173e(this, bVar, i, mediaModel), new C33174f(this, bVar.itemView.getContext()));
    }

    /* renamed from: a */
    private void m106911a(int i, C33141b bVar, MediaModel mediaModel) {
        int i2;
        FrameLayout frameLayout = bVar.f86247e;
        if (this.f86210f) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        if (this.f86213i != -1) {
            bVar.f86244b.setTextColor(this.f86213i);
        }
        if (this.f86214j != -1) {
            bVar.f86244b.setShadowLayer(6.0f, 0.0f, 3.0f, this.f86214j);
        }
        m106913a(bVar);
        m106920b(bVar, mediaModel);
        m106910a(i, bVar);
    }

    /* renamed from: c */
    private void m106921c(C33141b bVar, int i, MediaModel mediaModel) {
        if (this.f86209e.size() >= 12) {
            C9738o.m28697a(this.f86220p, this.f86220p.getString(R.string.a3i));
            return;
        }
        if (this.f86216l == null) {
            this.f86216l = new ArrayList();
        }
        this.f86216l.add(mediaModel);
        this.f86209e.add(Integer.valueOf(i));
        bVar.mo84876a(this.f86209e.size() - 1);
        final int size = this.f86209e.size();
        this.f86208d.set(i, Integer.valueOf(size - 1));
        this.f86205a = true;
        bVar.f86243a.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new Runnable() {
            public final void run() {
                int i = size;
                MediaAdapter.this.f86217m.mo84886f();
                if (MediaAdapter.this.f86219o != null) {
                    MediaAdapter.this.f86219o.mo84846a(MediaAdapter.this.f86216l);
                }
                MediaAdapter.this.f86205a = false;
            }
        }).start();
        bVar.f86248f.setAlpha(0.0f);
        bVar.f86248f.setVisibility(0);
        bVar.f86248f.animate().alpha(1.0f).setDuration(300).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo84863a(C33141b bVar, int i, MediaModel mediaModel, String str, Long l) {
        m106917a(str, 0, l.longValue(), "select");
        m106921c(bVar, i, mediaModel);
        return null;
    }

    public MediaAdapter(Context context, VideoChooseFragment videoChooseFragment, int i, double d, float f, int i2) {
        this.f86220p = context;
        this.f86217m = videoChooseFragment;
        this.f86224t = i;
        this.f86225u = 1.0d;
        this.f86221q = C33151b.m106967a().f86289b;
        this.f86222r = 3600000;
        context.getResources().getDimensionPixelOffset(R.dimen.im);
        this.f86223s = ((C9738o.m28691a(context) - ((this.f86224t - 1) * ((int) C9738o.m28708b(this.f86220p, 1.5f)))) - 0) / this.f86224t;
        if (C35563c.f93231M.mo93305a(Property.VideoLegalCheckInLocal)) {
            this.f86226v = new C33165d(context);
        } else {
            this.f86226v = new C33146a(context);
        }
        this.f86226v.mo84893a(false);
        this.f86226v.mo84892a("enter_from_multi");
    }
}
