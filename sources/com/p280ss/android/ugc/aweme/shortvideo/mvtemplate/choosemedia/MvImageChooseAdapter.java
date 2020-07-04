package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.p013ss.com.vboost.C0170b.C0171a;
import android.p013ss.com.vboost.C0173d;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.imported.C32068d;
import com.p280ss.android.ugc.aweme.mediachoose.C33146a;
import com.p280ss.android.ugc.aweme.mediachoose.C33165d;
import com.p280ss.android.ugc.aweme.mediachoose.C33185q;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41555i;
import com.p280ss.android.ugc.aweme.utils.C42923ak;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C43137g;
import com.p280ss.android.ugc.aweme.utils.MediaType;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.C7581n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter */
public class MvImageChooseAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public int f104263a = 12;

    /* renamed from: b */
    public String f104264b;

    /* renamed from: c */
    public HashMap<String, MyMediaModel> f104265c = new HashMap<>();

    /* renamed from: d */
    public C40117c f104266d;

    /* renamed from: e */
    public C40116b f104267e;

    /* renamed from: f */
    public boolean f104268f = true;

    /* renamed from: g */
    public boolean f104269g;

    /* renamed from: h */
    public RecyclerView f104270h;

    /* renamed from: i */
    private final Context f104271i;

    /* renamed from: j */
    private final List<MyMediaModel> f104272j = new ArrayList();

    /* renamed from: k */
    private List<MyMediaModel> f104273k = new ArrayList();

    /* renamed from: l */
    private int f104274l;

    /* renamed from: m */
    private C0171a f104275m;

    /* renamed from: n */
    private Map<Long, Float> f104276n = new HashMap();

    /* renamed from: o */
    private double f104277o;

    /* renamed from: p */
    private int f104278p;

    /* renamed from: q */
    private C33185q f104279q;

    /* renamed from: r */
    private final HashSet<String> f104280r = new HashSet<>();

    /* renamed from: s */
    private int f104281s = 1;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel */
    public static class MyMediaModel extends MediaModel {

        /* renamed from: o */
        public int f104287o = -1;

        /* renamed from: p */
        public int f104288p = -1;

        private MyMediaModel(long j) {
            super(j);
        }

        /* renamed from: a */
        public static MyMediaModel m128240a(MediaModel mediaModel) {
            MyMediaModel myMediaModel = new MyMediaModel(mediaModel.f88155a);
            myMediaModel.f88156b = mediaModel.f88156b;
            myMediaModel.f88157c = mediaModel.f88157c;
            myMediaModel.f88158d = mediaModel.f88158d;
            myMediaModel.f88159e = mediaModel.f88159e;
            myMediaModel.f88160f = mediaModel.f88160f;
            myMediaModel.f88161g = mediaModel.f88161g;
            myMediaModel.f88162h = mediaModel.f88162h;
            myMediaModel.f88163i = mediaModel.f88163i;
            myMediaModel.f88164j = mediaModel.f88164j;
            myMediaModel.f88165k = mediaModel.f88165k;
            myMediaModel.f88166l = mediaModel.f88166l;
            myMediaModel.mo86199a(mediaModel.mo86198a());
            return myMediaModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$a */
    interface C40115a {
        /* renamed from: a */
        void mo99857a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$b */
    public interface C40116b {
        /* renamed from: a */
        int mo99833a(MyMediaModel myMediaModel, boolean z);

        /* renamed from: a */
        void mo99834a(MediaModel mediaModel);

        /* renamed from: a */
        void mo99835a(List<MyMediaModel> list);

        /* renamed from: a */
        boolean mo99836a();

        /* renamed from: a */
        boolean mo99837a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$c */
    public interface C40117c {
        /* renamed from: a */
        void mo99809a(View view, MediaModel mediaModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$d */
    static class C40118d extends C1293v {

        /* renamed from: a */
        RemoteImageView f104289a;

        /* renamed from: b */
        TextView f104290b;

        /* renamed from: c */
        TextView f104291c;

        /* renamed from: d */
        FrameLayout f104292d;

        /* renamed from: e */
        View f104293e;

        /* renamed from: f */
        String f104294f;

        /* renamed from: g */
        MyMediaModel f104295g;

        /* renamed from: h */
        View f104296h;

        /* renamed from: i */
        int f104297i;

        /* renamed from: a */
        public final void mo99858a() {
            this.f104290b.setText("");
            this.f104290b.setBackgroundResource(R.drawable.ne);
        }

        C40118d(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo99859a(int i) {
            this.f104290b.setText(String.valueOf(i));
            this.f104290b.setBackgroundResource(R.drawable.nf);
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public final void mo99854a(boolean z) {
        m128221b();
        this.f104268f = z;
        if (!C6311g.m19573a(this.f104273k)) {
            this.f104273k.clear();
            this.f104265c.clear();
            if (this.f104267e != null) {
                this.f104267e.mo99835a(this.f104273k);
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo99852a(Collection<? extends MyMediaModel> collection) {
        this.f104272j.clear();
        this.f104272j.addAll(collection);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo99853a(List<MyMediaModel> list) {
        int size = this.f104272j.size();
        for (int i = size; i < list.size(); i++) {
            this.f104272j.add(list.get(i));
        }
        if (C42923ak.m136268a()) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeInserted(size, this.f104272j.size());
        }
    }

    /* renamed from: a */
    public final void mo99851a(C40118d dVar) {
        if (dVar.f104295g.f104288p >= 0) {
            int i = dVar.f104295g.f104288p;
            dVar.f104295g.f104288p = -1;
            dVar.mo99858a();
            dVar.f104293e.animate().alpha(0.0f).setDuration(300).withEndAction(new C40150w(dVar)).start();
            dVar.f104289a.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
            int i2 = 0;
            for (int i3 = 0; i3 < this.f104273k.size(); i3++) {
                MyMediaModel myMediaModel = (MyMediaModel) this.f104273k.get(i3);
                if (myMediaModel.f88155a == dVar.f104295g.f88155a) {
                    i2 = i3;
                }
                if (myMediaModel.f104288p > i) {
                    myMediaModel.f104288p--;
                }
            }
            this.f104265c.remove(dVar.f104295g.f88156b);
            this.f104273k.remove(i2);
            if (this.f104273k.size() + 1 == this.f104263a) {
                mo99849a();
            } else {
                notifyItemChanged(i2, new Object());
                for (MyMediaModel myMediaModel2 : this.f104273k) {
                    notifyItemChanged(myMediaModel2.f104287o, new Object());
                }
            }
            if (this.f104267e != null) {
                this.f104267e.mo99835a(this.f104273k);
                this.f104267e.mo99833a(dVar.f104295g, false);
            }
        } else if (this.f104267e != null && !this.f104267e.mo99837a(dVar.f104295g.f88156b)) {
        } else {
            if (!C7276d.m22812b(dVar.f104295g.f88156b)) {
                if (1 == this.f104278p) {
                    C10761a.m31403c(this.f104271i, this.f104271i.getString(R.string.bh2)).mo25750a();
                } else {
                    C10761a.m31403c(this.f104271i, this.f104271i.getString(R.string.cu2)).mo25750a();
                }
            } else if (this.f104267e.mo99836a()) {
                C10761a.m31403c(this.f104271i, this.f104264b).mo25750a();
            } else {
                m128218a((MediaModel) dVar.f104295g, (C40115a) new C40151x(this, dVar));
            }
        }
    }

    public int getItemCount() {
        return this.f104272j.size();
    }

    /* renamed from: b */
    private void m128221b() {
        for (MyMediaModel myMediaModel : this.f104272j) {
            myMediaModel.f104288p = -1;
        }
    }

    /* renamed from: c */
    private void m128223c() {
        int i = -1;
        for (MyMediaModel myMediaModel : this.f104272j) {
            i++;
            for (MyMediaModel myMediaModel2 : this.f104273k) {
                if (myMediaModel.f88156b.equals(myMediaModel2.f88156b)) {
                    notifyItemChanged(i, new Object());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo99849a() {
        C0902i a = C32068d.m104096a(this.f104270h);
        int intValue = ((Integer) a.f3155b).intValue();
        for (int intValue2 = ((Integer) a.f3154a).intValue(); intValue2 <= intValue; intValue2++) {
            notifyItemChanged(intValue2, new Object());
        }
    }

    /* renamed from: b */
    public final void mo99856b(List<String> list) {
        this.f104280r.addAll(list);
    }

    /* renamed from: c */
    static final /* synthetic */ void m128225c(C40118d dVar) {
        dVar.f104293e.setVisibility(4);
        dVar.f104293e.setAlpha(1.0f);
    }

    /* renamed from: d */
    private static void m128226d(C40118d dVar) {
        Object tag = dVar.f104289a.getTag(R.id.bcz);
        if (tag instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) tag;
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            dVar.f104289a.setTag(R.id.bcz, null);
        }
    }

    /* renamed from: a */
    private void m128217a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.f104274l) {
            int i = layoutParams.height;
            double d = (double) this.f104274l;
            double d2 = this.f104277o;
            Double.isNaN(d);
            if (i != ((int) (d * d2))) {
                layoutParams.width = this.f104274l;
                double d3 = (double) this.f104274l;
                double d4 = this.f104277o;
                Double.isNaN(d3);
                layoutParams.height = (int) (d3 * d4);
            }
        }
    }

    /* renamed from: a */
    private static String m128216a(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            return C1642a.m8035a(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)});
        }
        return C1642a.m8035a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)});
    }

    /* renamed from: e */
    private void m128227e(C40118d dVar) {
        float f;
        float f2 = 1.0f;
        if (dVar.f104295g.f104288p >= 0) {
            dVar.f104293e.setVisibility(0);
            f = 1.0f;
            f2 = 1.1f;
        } else {
            dVar.mo99858a();
            dVar.f104293e.setVisibility(4);
            if (this.f104267e.mo99836a()) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
        }
        if (dVar.f104289a.getAlpha() != f) {
            dVar.f104289a.setAlpha(f);
        }
        if (dVar.f104289a.getScaleX() != f2) {
            dVar.f104289a.setScaleX(f2);
            dVar.f104289a.setScaleY(f2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo99855b(C40118d dVar) {
        if (this.f104273k.size() == this.f104263a) {
            notifyDataSetChanged();
            if (this.f104267e != null) {
                this.f104281s = this.f104267e.mo99833a(dVar.f104295g, true);
                this.f104267e.mo99835a(this.f104273k);
            }
        } else {
            this.f104273k.add(dVar.f104295g);
            this.f104265c.put(dVar.f104295g.f88156b, dVar.f104295g);
            if (this.f104267e != null) {
                this.f104281s = this.f104267e.mo99833a(dVar.f104295g, true);
                this.f104267e.mo99835a(this.f104273k);
            }
            dVar.f104295g.f104288p = this.f104281s;
            if (this.f104273k.size() == this.f104263a) {
                mo99849a();
            } else {
                notifyItemChanged(dVar.f104297i, new Object());
            }
        }
        dVar.f104289a.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).start();
        dVar.f104293e.setAlpha(0.0f);
        dVar.f104293e.setVisibility(0);
        dVar.f104293e.animate().alpha(1.0f).setDuration(300).start();
    }

    /* renamed from: a */
    public final void mo99850a(int i, int i2) {
        m128223c();
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        m128219a((C40118d) vVar, i, false);
    }

    /* renamed from: a */
    private void m128218a(MediaModel mediaModel, C40115a aVar) {
        if (1 == this.f104278p) {
            m128224c(mediaModel, aVar);
        } else {
            m128222b(mediaModel, aVar);
        }
    }

    /* renamed from: b */
    private void m128222b(MediaModel mediaModel, C40115a aVar) {
        double d = (double) mediaModel.f88163i;
        double d2 = (double) mediaModel.f88164j;
        Double.isNaN(d2);
        if (d <= d2 * 2.4d) {
            double d3 = (double) mediaModel.f88164j;
            double d4 = (double) mediaModel.f88163i;
            Double.isNaN(d4);
            if (d3 <= d4 * 2.4d) {
                C43137g.m136830a().mo104766a(mediaModel.f88156b, MediaType.IMAGE);
                aVar.mo99857a();
                return;
            }
        }
        C10761a.m31409e(this.f104271i, (int) R.string.dsl).mo25750a();
    }

    /* renamed from: c */
    private void m128224c(MediaModel mediaModel, C40115a aVar) {
        if (this.f104279q == null) {
            if (C35563c.f93231M.mo93305a(Property.VideoLegalCheckInLocal)) {
                this.f104279q = new C33165d(this.f104271i);
            } else {
                this.f104279q = new C33146a(this.f104271i);
            }
            this.f104279q.mo84892a("enter_from_multi");
        }
        this.f104279q.mo84891a(mediaModel, 1000, -1, new C40152y(this, aVar), new C40153z(this));
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        int i3 = 0;
        View inflate = LayoutInflater.from(this.f104271i).inflate(R.layout.sf, viewGroup, false);
        C40118d dVar = new C40118d(inflate);
        dVar.f104289a = (RemoteImageView) inflate.findViewById(R.id.bxo);
        dVar.f104290b = (TextView) inflate.findViewById(R.id.ayi);
        dVar.f104292d = (FrameLayout) inflate.findViewById(R.id.amg);
        dVar.f104293e = inflate.findViewById(R.id.d4f);
        dVar.f104291c = (TextView) inflate.findViewById(R.id.abu);
        TextView textView = dVar.f104291c;
        if (this.f104269g) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        dVar.f104296h = inflate.findViewById(R.id.d2o);
        View findViewById = dVar.f104296h.findViewById(R.id.d2n);
        if (C6399b.m19944t()) {
            i3 = 8;
        }
        findViewById.setVisibility(i3);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo99847a(C40115a aVar, String str, Long l) {
        m128220a(str, 0, l.longValue(), "select");
        aVar.mo99857a();
        return null;
    }

    public void onBindViewHolder(C1293v vVar, int i, List<Object> list) {
        if (list.isEmpty()) {
            m128219a((C40118d) vVar, i, false);
        } else {
            m128219a((C40118d) vVar, i, true);
        }
    }

    /* renamed from: a */
    private void m128219a(final C40118d dVar, int i, boolean z) {
        float f;
        int i2;
        int i3 = 8;
        dVar.f104296h.setVisibility(8);
        m128217a((View) dVar.f104289a);
        m128217a(dVar.f104293e);
        final MyMediaModel myMediaModel = (MyMediaModel) this.f104272j.get(i);
        myMediaModel.f104287o = i;
        if (myMediaModel == null) {
            StringBuilder sb = new StringBuilder("mediaModel is empty ");
            sb.append(i);
            sb.append(" cur type: ");
            sb.append(this.f104278p);
            sb.append("  ");
            sb.append(this.f104272j.size());
            C41530am.m132283b(sb.toString());
        }
        dVar.f104295g = myMediaModel;
        dVar.f104297i = i;
        dVar.mo99859a(dVar.f104295g.f104288p);
        FrameLayout frameLayout = dVar.f104292d;
        if (this.f104268f) {
            i3 = 0;
        }
        frameLayout.setVisibility(i3);
        m128227e(dVar);
        if (!z) {
            StringBuilder sb2 = new StringBuilder("file://");
            sb2.append(myMediaModel.f88156b);
            String sb3 = sb2.toString();
            if (this.f104280r.contains(myMediaModel.f88156b)) {
                dVar.f104296h.setVisibility(0);
            }
            Bitmap bitmap = null;
            if (this.f104275m != null) {
                if (1 == myMediaModel.f88158d) {
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                bitmap = this.f104275m.mo367a((int) myMediaModel.f88155a, myMediaModel.f88157c, i2, 2, null);
                StringBuilder sb4 = new StringBuilder("hw thumbnail dup id:");
                sb4.append(myMediaModel.f88155a);
                sb4.append(" url: ");
                sb4.append(sb3);
                C41530am.m132283b(sb4.toString());
            }
            if (!TextUtils.equals(dVar.f104294f, sb3)) {
                dVar.f104294f = sb3;
                if (bitmap != null) {
                    if (this.f104276n.containsKey(Long.valueOf(myMediaModel.f88155a))) {
                        f = ((Float) this.f104276n.get(Long.valueOf(myMediaModel.f88155a))).floatValue();
                    } else {
                        f = (float) C41555i.m132331a(dVar.f104294f);
                        this.f104276n.put(Long.valueOf(myMediaModel.f88155a), Float.valueOf(f));
                    }
                    m128226d(dVar);
                    if (f != 0.0f) {
                        bitmap = C41555i.m132332a(bitmap, f);
                    }
                    dVar.f104289a.setTag(R.id.bcz, bitmap);
                    dVar.f104289a.setImageBitmap(bitmap);
                } else {
                    C23323e.m76516a(dVar.f104289a, dVar.f104294f, this.f104274l, this.f104274l, Config.ARGB_4444);
                }
            }
        }
        dVar.itemView.setOnClickListener(new C42939as() {
            /* renamed from: a */
            public final void mo70606a(View view) {
                boolean z;
                if (dVar.f104295g.f104288p >= 0 || !MvImageChooseAdapter.this.f104267e.mo99836a()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && MvImageChooseAdapter.this.f104266d != null) {
                    MvImageChooseAdapter.this.f104266d.mo99809a(view, myMediaModel);
                }
            }
        });
        dVar.f104292d.setOnClickListener(new C42939as() {
            /* renamed from: a */
            public final void mo70606a(View view) {
                MvImageChooseAdapter.this.mo99851a(dVar);
            }
        });
        if (myMediaModel.f88158d == 4) {
            dVar.f104291c.setText(m128216a(Math.round((((float) myMediaModel.f88159e) * 1.0f) / 1000.0f)));
        }
    }

    /* renamed from: a */
    private static void m128220a(String str, int i, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C6893q.m21448a("aweme_video_import_duration", jSONObject, C6869c.m21381a().mo16887a("status", String.valueOf(i)).mo16887a("scene_name", str2).mo16887a("type", str).mo16888b());
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo99848a(String str, Long l, Integer num, String str2) {
        m128220a(str, 1, l.longValue(), "select");
        C6893q.m21444a("aweme_movie_import_error_rate", 1, C6869c.m21381a().mo16887a("errorCode", String.valueOf(num)).mo16887a("errorMsg", str2).mo16888b());
        C40132e.m128287a(this.f104271i, num.intValue(), 1000);
        return null;
    }

    public MvImageChooseAdapter(Context context, int i, double d, float f, int i2, int i3) {
        this.f104271i = context;
        this.f104277o = 1.0d;
        context.getResources().getDimensionPixelOffset(R.dimen.im);
        this.f104274l = ((C9738o.m28691a(context) - (((int) C9738o.m28708b(this.f104271i, 1.5f)) * 3)) + 0) / 4;
        this.f104264b = this.f104271i.getString(R.string.a3h);
        this.f104278p = i3;
        if (C35563c.f93231M.mo93305a(Property.EnableVboostOpt)) {
            this.f104275m = C0173d.m477b().mo369a();
        }
    }
}
