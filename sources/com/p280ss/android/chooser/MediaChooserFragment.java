package com.p280ss.android.chooser;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Media;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.chooser.C19247b.C19249a;
import com.p280ss.android.chooser.C19256e.C19258a;
import com.p280ss.android.chooser.C19256e.C19260c;
import com.p280ss.android.chooser.C19256e.C19261d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.chooser.MediaChooserFragment */
public class MediaChooserFragment extends AbsFragment implements C6310a {

    /* renamed from: m */
    public static String f52035m = "ARG_NUM_COLUMNS";

    /* renamed from: n */
    public static String f52036n = "ARG_HORIZONTAL_SPACING";

    /* renamed from: o */
    public static String f52037o = "ARG_VERTICAL_SPACING";

    /* renamed from: p */
    public static String f52038p = "ARG_GRID_PADDING";

    /* renamed from: q */
    public static String f52039q = "ARG_TEXT_COLOR";

    /* renamed from: r */
    public static String f52040r = "ARG_TEXT_SIZE";

    /* renamed from: s */
    public static String f52041s = "ARG_SHADOW_COLOR";

    /* renamed from: t */
    public static String f52042t = "ARG_ITEM_HEIGHT_WIDTH_RATIO";

    /* renamed from: u */
    public static String f52043u = "ARG_BG_COLOR";

    /* renamed from: v */
    public static String f52044v = "ARG_TEXT_BACKGROUND";

    /* renamed from: w */
    public static String f52045w = "ARG_TEXT_INDICATOR";

    /* renamed from: A */
    private final int f52046A = 100;

    /* renamed from: B */
    private View f52047B;

    /* renamed from: C */
    private View f52048C;

    /* renamed from: D */
    private View f52049D;

    /* renamed from: E */
    private TextView f52050E;

    /* renamed from: F */
    private View f52051F;

    /* renamed from: G */
    private volatile int f52052G;

    /* renamed from: H */
    private String[] f52053H;

    /* renamed from: I */
    private GridView f52054I;

    /* renamed from: J */
    private boolean f52055J;

    /* renamed from: K */
    private boolean f52056K;

    /* renamed from: L */
    private int f52057L;

    /* renamed from: M */
    private C6309f f52058M = new C6309f(this);

    /* renamed from: N */
    private OnItemClickListener f52059N = new OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            C19262f a = MediaChooserFragment.this.f52077h.getItem(i);
            if (a.f52148a != -1) {
                if (MediaChooserFragment.this.f52075f == 0) {
                    MediaChooserFragment.this.mo51042a(a);
                }
                C19247b.m63089a();
            } else if (MediaChooserFragment.this.f52078i.mo51087f() >= MediaChooserFragment.this.f52076g) {
                if (MediaChooserFragment.this.f52076g > 1) {
                    str = MediaChooserFragment.this.getActivity().getString(R.string.c8z, new Object[]{Integer.valueOf(MediaChooserFragment.this.f52076g)});
                } else {
                    str = MediaChooserFragment.this.getActivity().getString(R.string.c8x);
                }
                C9738o.m28697a((Context) MediaChooserFragment.this.getActivity(), str);
            } else {
                MediaChooserFragment.this.mo51041a();
            }
        }
    };

    /* renamed from: O */
    private String f52060O;

    /* renamed from: P */
    private String f52061P;

    /* renamed from: Q */
    private int f52062Q;

    /* renamed from: R */
    private int f52063R;

    /* renamed from: S */
    private int f52064S;

    /* renamed from: T */
    private int f52065T;

    /* renamed from: U */
    private int f52066U;

    /* renamed from: V */
    private int f52067V;

    /* renamed from: W */
    private int f52068W;

    /* renamed from: X */
    private int f52069X;

    /* renamed from: Y */
    private double f52070Y;

    /* renamed from: Z */
    private OnClickListener f52071Z = new OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int id = view.getId();
            if (id != R.id.d2g && id == R.id.d2_) {
                MediaChooserFragment.this.mo51044e();
                if (!MediaChooserFragment.this.f52081l) {
                    MediaChooserFragment.m63069a("ac_choose_pic", "local_pic");
                }
            }
        }
    };

    /* renamed from: aa */
    private C19261d f52072aa = new C19261d() {
        /* renamed from: a */
        public final void mo51048a() {
            MediaChooserFragment.this.mo51043d();
        }
    };

    /* renamed from: ab */
    private C19260c f52073ab = new C19260c() {
        /* renamed from: a */
        public final void mo51049a(boolean z, List<C19262f> list) {
            if (MediaChooserFragment.this.isViewValid()) {
                MediaChooserFragment.this.f52074e.setVisibility(4);
                if (z) {
                    MediaChooserFragment.this.mo51045f();
                }
            }
        }
    };

    /* renamed from: e */
    public View f52074e;

    /* renamed from: f */
    public int f52075f;

    /* renamed from: g */
    public int f52076g = 9;

    /* renamed from: h */
    public C19242a f52077h;

    /* renamed from: i */
    public C19256e f52078i;

    /* renamed from: j */
    public C19241a f52079j;

    /* renamed from: k */
    public C19258a f52080k;

    /* renamed from: l */
    public boolean f52081l;

    /* renamed from: x */
    private final int f52082x = 1001;

    /* renamed from: y */
    private final int f52083y = 1002;

    /* renamed from: z */
    private final int f52084z = 1003;

    /* renamed from: com.ss.android.chooser.MediaChooserFragment$a */
    public interface C19241a {
    }

    /* renamed from: g */
    private boolean m63071g() {
        if (1 == this.f52075f) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo51044e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
            activity.finish();
        }
    }

    public void onResume() {
        super.onResume();
        mo51045f();
        mo51043d();
    }

    public void onStart() {
        super.onStart();
        this.f52077h.mo51051a();
        this.f52078i.mo51076a(this.f52072aa);
        this.f52078i.mo51075a(this.f52073ab);
    }

    public void onStop() {
        super.onStop();
        this.f52077h.mo51055b();
        this.f52078i.mo51082b(this.f52072aa);
        this.f52078i.mo51081b(this.f52073ab);
    }

    /* renamed from: d */
    public final void mo51043d() {
        boolean z;
        if (isViewValid() && this.f52077h != null) {
            TextView textView = this.f52050E;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f52078i.mo51087f());
            sb.append("/");
            sb.append(this.f52076g);
            textView.setText(sb.toString());
            View view = this.f52048C;
            if (this.f52078i.mo51087f() > 0) {
                z = true;
            } else {
                z = false;
            }
            view.setEnabled(z);
        }
    }

    /* renamed from: a */
    public final void mo51041a() {
        if (getActivity() != null) {
            if (4 == this.f52052G || 5 == this.f52052G) {
                StringBuilder sb = new StringBuilder();
                sb.append(System.currentTimeMillis());
                sb.append(".jpg");
                this.f52060O = sb.toString();
                return;
            }
            if (8 == this.f52052G) {
                m63069a("ac_choose_video", "take_video");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(System.currentTimeMillis());
                sb2.append(".mp4");
                this.f52060O = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(System.currentTimeMillis());
                sb3.append(".jpg");
                this.f52061P = sb3.toString();
            }
        }
    }

    /* renamed from: f */
    public final void mo51045f() {
        ArrayList arrayList = new ArrayList();
        List a = this.f52078i.mo51071a(this.f52057L);
        if (!C6311g.m19573a(a) && this.f52053H != null && this.f52053H.length > 0) {
            C19256e.m63104a().mo51078a(Arrays.asList(this.f52053H));
            this.f52053H = null;
        }
        List e = this.f52078i.mo51086e();
        if (4 == this.f52052G || 5 == this.f52052G) {
            arrayList.add(C19262f.m63133a(0));
        } else if (8 == this.f52052G) {
            arrayList.add(C19262f.m63133a(1));
        }
        arrayList.addAll(a);
        if (this.f52080k != null) {
            arrayList = this.f52080k.mo51088a(arrayList);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
        }
        this.f52077h.mo51054a((Collection<? extends C19262f>) arrayList, (Collection<? extends C19262f>) e);
    }

    /* renamed from: h */
    private void m63072h() {
        if (this.f52078i == null && getActivity() != null) {
            C19256e.m63106a(getActivity().getApplicationContext());
            this.f52078i = C19256e.m63104a();
        }
        if (C6311g.m19573a(this.f52078i.mo51071a(this.f52057L))) {
            this.f52074e.setVisibility(0);
            this.f52078i.mo51073a(this.f52057L, false);
        }
        C19242a aVar = new C19242a(getActivity(), this.f52075f, this.f52076g, this.f52062Q, this.f52070Y, this.f52063R, this.f52065T);
        this.f52077h = aVar;
        this.f52077h.f52095g = this.f52067V;
        this.f52077h.f52094f = this.f52066U;
        this.f52077h.f52093e = this.f52068W;
        this.f52077h.f52091c = this.f52055J;
        this.f52077h.f52092d = this.f52056K;
        C19247b a = C19247b.m63089a();
        this.f52077h.mo51052a(a.f52120b, a.f52121c);
        this.f52054I.setAdapter(this.f52077h);
    }

    /* renamed from: b */
    private boolean m63070b(C19262f fVar) {
        C19249a aVar = C19247b.m63089a().f52122d;
        if (aVar != null) {
            String a = aVar.mo51064a(fVar);
            if (!C6319n.m19593a(a)) {
                C9738o.m28697a((Context) getActivity(), a);
                return false;
            }
        }
        return true;
    }

    public void onActivityCreated(Bundle bundle) {
        int i;
        String str;
        super.onActivityCreated(bundle);
        m63072h();
        mo51043d();
        this.f52081l = C19247b.m63092a(this.f52052G);
        View view = this.f52051F;
        if (this.f52081l) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        this.f52051F.setVisibility(8);
        if (this.f52081l) {
            str = "pv_all_video";
        } else {
            str = "pv_all_pic";
        }
        m63069a(str, "publish");
    }

    public void handleMsg(Message message) {
        if (message.what == 100) {
            C19256e.m63104a().mo51079b();
            Object obj = message.obj;
            if (obj instanceof C19262f) {
                C19262f fVar = (C19262f) obj;
                this.f52078i.mo51072a(0, this.f52057L, fVar);
                if (this.f52075f == 0) {
                    C19256e.m63104a().mo51085d();
                }
                Bundle bundle = new Bundle();
                this.f52078i.mo51083b(fVar);
                m63068a(bundle, 0, fVar.f52149b, fVar.f52151d, null, fVar.f52156i, fVar.f52157j);
            }
        }
    }

    /* renamed from: a */
    public final void mo51042a(C19262f fVar) {
        if (m63070b(fVar)) {
            C19256e.m63104a().mo51085d();
            C19256e.m63104a().mo51083b(fVar);
            if (fVar.f52151d == 1) {
                ContentUris.withAppendedId(Media.EXTERNAL_CONTENT_URI, fVar.f52148a);
                m63069a("local_video_pick", "pick");
                if (fVar.f52152e <= 3000) {
                    C9738o.m28693a((Context) getActivity(), (int) R.string.byx);
                    return;
                }
                if (fVar.f52152e > 600000) {
                    C9738o.m28693a((Context) getActivity(), (int) R.string.fp8);
                }
                return;
            }
            Uri withAppendedId = ContentUris.withAppendedId(Images.Media.EXTERNAL_CONTENT_URI, fVar.f52148a);
            if (this.f52079j == null) {
                m63068a(null, 1, fVar.f52149b, fVar.f52151d, withAppendedId, fVar.f52156i, fVar.f52157j);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f52062Q = getArguments().getInt(f52035m, -1);
            this.f52063R = getArguments().getInt(f52036n, -1);
            this.f52064S = getArguments().getInt(f52037o, -1);
            this.f52065T = getArguments().getInt(f52038p, -1);
            this.f52066U = getArguments().getInt(f52039q, -1);
            this.f52067V = getArguments().getInt(f52041s, -1);
            this.f52070Y = getArguments().getDouble(f52042t, 1.0d);
            this.f52068W = getArguments().getInt(f52040r, 12);
            this.f52069X = getArguments().getInt(f52043u, -1);
            this.f52055J = getArguments().getBoolean(f52044v, false);
            this.f52056K = getArguments().getBoolean(f52045w, false);
            return;
        }
        this.f52062Q = 3;
        this.f52063R = -1;
        this.f52064S = -1;
        this.f52065T = -1;
        this.f52066U = -1;
        this.f52067V = -1;
        this.f52070Y = 1.0d;
        this.f52068W = -1;
    }

    /* renamed from: a */
    public static void m63069a(String str, String str2) {
        new HashMap().put("reference", str2);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f52069X != -1 && this.f52054I != null) {
            this.f52054I.setBackgroundColor(this.f52069X);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        int i3;
        FragmentActivity activity = getActivity();
        if (this.f52081l) {
            str = "pv_all_video";
        } else {
            str = "pv_all_pic";
        }
        m63069a(str, "other");
        if (i2 != 0) {
            super.onActivityResult(i, i2, intent);
            if (i == 1001 || i == 1003) {
                if (i == 1001) {
                    m63069a("ac_choose_pic", "take_pic");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(C19247b.f52118a);
                sb.append(File.separator);
                sb.append(this.f52060O);
                String sb2 = sb.toString();
                if (!C6319n.m19593a(sb2) && new File(sb2).exists()) {
                    if (i == 1001) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    C19247b.m63091a(getActivity(), sb2, this.f52058M, 100, i3);
                    return;
                }
                return;
            }
            if (i == 1002) {
                activity.setResult(-1);
                activity.finish();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ad8, null);
        this.f52054I = (GridView) inflate.findViewById(R.id.ass);
        this.f52054I.setOnItemClickListener(this.f52059N);
        if (this.f52062Q != -1) {
            this.f52054I.setNumColumns(this.f52062Q);
        }
        if (this.f52063R != -1) {
            this.f52054I.setHorizontalSpacing((int) C9738o.m28708b((Context) getActivity(), (float) this.f52063R));
        }
        if (this.f52064S != -1) {
            this.f52054I.setVerticalSpacing((int) C9738o.m28708b((Context) getActivity(), (float) this.f52064S));
        }
        int i = 0;
        if (this.f52065T == -1) {
            this.f52065T = 0;
        } else {
            this.f52065T = (int) C9738o.m28708b((Context) getActivity(), (float) this.f52065T);
        }
        this.f52054I.setPadding(this.f52065T, this.f52065T, this.f52065T, this.f52065T);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f52075f = arguments.getInt("media_choose_select_type");
            this.f52052G = arguments.getInt("media_chooser_type", 0);
            this.f52076g = arguments.getInt("media_max_select_count", 1);
            this.f52053H = arguments.getStringArray("media_select_list");
        }
        this.f52052G = 7;
        this.f52075f = 0;
        this.f52076g = 1;
        this.f52057L = C19247b.m63093b(this.f52052G);
        this.f52048C = inflate.findViewById(R.id.d2g);
        this.f52048C.setOnClickListener(this.f52071Z);
        this.f52047B = inflate.findViewById(R.id.d2_);
        this.f52047B.setOnClickListener(this.f52071Z);
        this.f52050E = (TextView) inflate.findViewById(R.id.d2e);
        this.f52049D = inflate.findViewById(R.id.c8r);
        View view = this.f52049D;
        if (!m63071g()) {
            i = 8;
        }
        view.setVisibility(i);
        this.f52051F = inflate.findViewById(R.id.bxi);
        this.f52074e = inflate.findViewById(R.id.bty);
        return inflate;
    }

    /* renamed from: a */
    private void m63068a(Bundle bundle, int i, String str, int i2, Uri uri, int i3, int i4) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setData(uri);
        intent.putExtra("media_source", i);
        intent.putExtra("media_path", str);
        intent.putExtra("media_type", i2);
        intent.putExtra("media_width", i3);
        intent.putExtra("media_height", i4);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }
}
