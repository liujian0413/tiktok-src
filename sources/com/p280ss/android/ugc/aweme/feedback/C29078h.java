package com.p280ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.C11013c;
import com.p280ss.android.common.util.C6775g;
import com.p280ss.android.image.C19577a;
import com.p280ss.android.image.C19592h;
import com.p280ss.android.image.C6813b;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.feedback.C29075g.C29077b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43150p;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.feedback.h */
public final class C29078h extends BaseAdapter implements C11013c, C29114s {

    /* renamed from: a */
    private LayoutInflater f76773a;

    /* renamed from: b */
    private List<C29075g> f76774b = new ArrayList();

    /* renamed from: c */
    private SimpleDateFormat f76775c;

    /* renamed from: d */
    private C19577a f76776d;

    /* renamed from: e */
    private C19592h f76777e;

    /* renamed from: f */
    private C6775g f76778f;

    /* renamed from: g */
    private C19936f f76779g;

    /* renamed from: h */
    private Context f76780h;

    /* renamed from: i */
    private ColorFilter f76781i;

    /* renamed from: j */
    private int f76782j;

    /* renamed from: k */
    private int f76783k = 20000;

    /* renamed from: l */
    private boolean f76784l = true;

    /* renamed from: m */
    private boolean f76785m = false;

    /* renamed from: n */
    private C29114s f76786n;

    /* renamed from: o */
    private int f76787o;

    /* renamed from: p */
    private int f76788p;

    /* renamed from: q */
    private int f76789q;

    /* renamed from: r */
    private int f76790r;

    /* renamed from: s */
    private int f76791s;

    /* renamed from: t */
    private int f76792t;

    /* renamed from: u */
    private int f76793u;

    /* renamed from: v */
    private C6813b f76794v;

    /* renamed from: com.ss.android.ugc.aweme.feedback.h$a */
    public static class C29079a {

        /* renamed from: a */
        public ImageView f76795a;

        /* renamed from: b */
        public ImageView f76796b;

        /* renamed from: c */
        public ImageView f76797c;

        /* renamed from: d */
        public TextView f76798d;

        /* renamed from: e */
        public TextView f76799e;

        /* renamed from: f */
        public LinearLayout f76800f;

        /* renamed from: g */
        public View f76801g;

        /* renamed from: h */
        public View f76802h;

        /* renamed from: i */
        public View f76803i;

        /* renamed from: j */
        public View f76804j;

        /* renamed from: k */
        public C29075g f76805k;

        /* renamed from: l */
        public boolean f76806l;

        /* renamed from: m */
        public C29114s f76807m;

        /* renamed from: n */
        private OnClickListener f76808n = new OnClickListener() {
            public final void onClick(View view) {
                Bitmap bitmap;
                ClickInstrumentation.onClick(view);
                if (C29079a.this.f76805k != null && C29079a.this.f76807m != null && C29079a.this.f76797c != null) {
                    Drawable drawable = C29079a.this.f76797c.getDrawable();
                    if (drawable instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable).getBitmap();
                    } else {
                        bitmap = null;
                    }
                    C29079a.this.f76807m.mo74492a(C29079a.this.f76805k.f76756f, null, bitmap);
                }
            }
        };

        public C29079a(C29114s sVar) {
            this.f76807m = sVar;
        }

        /* renamed from: a */
        public final void mo74520a(C29075g gVar) {
            this.f76805k = gVar;
            if (this.f76797c != null) {
                this.f76797c.setOnClickListener(this.f76808n);
            }
        }
    }

    public final int getCount() {
        return this.f76774b.size();
    }

    /* renamed from: a */
    public final void mo26596a() {
        this.f76785m = true;
        if (this.f76776d != null) {
            this.f76776d.mo51750a();
        }
        if (this.f76777e != null) {
            this.f76777e.mo51768a();
        }
    }

    public final void bb_() {
        if (this.f76776d != null) {
            this.f76776d.mo51754c();
        }
        if (this.f76777e != null) {
            this.f76777e.mo51773c();
        }
        if (this.f76778f != null) {
            this.f76778f.mo16567a();
        }
    }

    public final void bc_() {
        this.f76785m = false;
        if (this.f76776d != null) {
            this.f76776d.mo51753b();
        }
        if (this.f76777e != null) {
            this.f76777e.mo51772b();
        }
    }

    public final Object getItem(int i) {
        if (i < 0 || i >= this.f76774b.size()) {
            return null;
        }
        return this.f76774b.get(i);
    }

    public final long getItemId(int i) {
        if (i < 0 || i >= this.f76774b.size()) {
            return -1;
        }
        return ((C29075g) this.f76774b.get(i)).f76752b;
    }

    /* renamed from: a */
    private void m95416a(C29079a aVar) {
        int i;
        int i2;
        ColorFilter colorFilter;
        if (aVar.f76806l && this.f76784l) {
            aVar.f76806l = false;
            Resources resources = this.f76780h.getResources();
            if (aVar.f76806l) {
                i = R.color.q2;
            } else {
                i = R.color.q1;
            }
            if (aVar.f76806l) {
                i2 = R.color.q8;
            } else {
                i2 = R.color.q7;
            }
            if (aVar.f76806l) {
                colorFilter = this.f76781i;
            } else {
                colorFilter = null;
            }
            aVar.f76798d.setTextColor(resources.getColor(i));
            aVar.f76799e.setTextColor(resources.getColor(i2));
            aVar.f76795a.setColorFilter(colorFilter);
            aVar.f76796b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: a */
    public final void mo74515a(List<C29075g> list, List<C29075g> list2) {
        this.f76774b.clear();
        if (list2 != null && list2.size() > 0 && !C6399b.m19946v()) {
            this.f76774b.addAll(list2);
        }
        if (list != null && list.size() > 0) {
            this.f76774b.addAll(list);
        }
        notifyDataSetChanged();
    }

    public C29078h(Context context, C29114s sVar) {
        Locale locale;
        Context context2 = context;
        this.f76773a = LayoutInflater.from(context);
        this.f76775c = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        if (((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).isArabicLang(context2)) {
            locale = Locale.US;
        } else {
            locale = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale();
        }
        this.f76775c = new SimpleDateFormat("yyyy-MM-dd HH:mm", locale);
        this.f76778f = new C6775g();
        this.f76779g = C19936f.m65765a();
        this.f76780h = context2;
        this.f76781i = SubmitFeedbackActivity.f76710w;
        this.f76786n = sVar;
        Resources resources = context.getResources();
        boolean z = resources.getBoolean(R.bool.i);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.h8);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.h6);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.h7);
        this.f76794v = new C6813b(context2);
        if (z) {
            C19577a aVar = new C19577a(R.drawable.z0, this.f76778f, this.f76794v, dimensionPixelSize3 * 2, false, dimensionPixelSize3, true);
            this.f76776d = aVar;
        } else {
            C19577a aVar2 = new C19577a((int) R.drawable.bk0, this.f76778f, this.f76794v, dimensionPixelSize, false, dimensionPixelSize2);
            this.f76776d = aVar2;
        }
        this.f76784l = resources.getBoolean(R.bool.j);
        this.f76782j = resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelOffset(R.dimen.h9);
        C19592h hVar = new C19592h(context, this.f76778f, 4, 4, 4, this.f76794v, this.f76782j, this.f76783k, R.drawable.ws);
        this.f76777e = hVar;
        this.f76788p = resources.getColor(R.color.a5d);
        this.f76787o = resources.getColor(R.color.a8f);
        this.f76789q = resources.getColor(R.color.q1);
        this.f76790r = resources.getColor(R.color.qc);
        this.f76791s = resources.getColor(R.color.q2);
        this.f76792t = resources.getDimensionPixelOffset(R.dimen.h_);
        this.f76793u = resources.getDimensionPixelOffset(R.dimen.ha);
    }

    /* renamed from: a */
    public final void mo74492a(String str, String str2, Bitmap bitmap) {
        if (this.f76785m) {
            if (bitmap == null) {
                bitmap = this.f76777e.mo51766a(str);
            }
            if (this.f76786n != null) {
                this.f76786n.mo74492a(str, str2, bitmap);
            }
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C29079a aVar;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6 = i;
        if (view == null) {
            aVar = new C29079a(this);
            view2 = this.f76773a.inflate(R.layout.mk, null);
            aVar.f76796b = (ImageView) view2.findViewById(R.id.ja);
            aVar.f76795a = (ImageView) view2.findViewById(R.id.j4);
            aVar.f76797c = (ImageView) view2.findViewById(R.id.ajr);
            aVar.f76798d = (TextView) view2.findViewById(R.id.ajt);
            aVar.f76799e = (TextView) view2.findViewById(R.id.aju);
            aVar.f76800f = (LinearLayout) view2.findViewById(R.id.ajs);
            aVar.f76801g = view2.findViewById(R.id.ctc);
            aVar.f76802h = view2.findViewById(R.id.bl_);
            aVar.f76803i = view2.findViewById(R.id.dme);
            aVar.f76804j = view2.findViewById(R.id.o3);
            view2.setTag(aVar);
        } else {
            aVar = (C29079a) view.getTag();
            view2 = view;
        }
        if (i6 == 0) {
            aVar.f76803i.setVisibility(0);
        } else {
            aVar.f76803i.setVisibility(8);
        }
        if (i6 == this.f76774b.size() - 1) {
            aVar.f76804j.setVisibility(0);
        } else {
            aVar.f76804j.setVisibility(8);
        }
        C29075g gVar = (C29075g) this.f76774b.get(i6);
        aVar.mo74520a(gVar);
        if (gVar.f76762l == null || gVar.f76762l.size() <= 0 || C6319n.m19593a(gVar.f76755e)) {
            aVar.f76798d.setText(gVar.f76755e);
            TextView textView = aVar.f76798d;
            if (C6319n.m19593a(gVar.f76755e)) {
                i5 = 8;
            } else {
                i5 = 0;
            }
            textView.setVisibility(i5);
        } else {
            SpannableString spannableString = new SpannableString(gVar.f76755e);
            int size = gVar.f76762l.size();
            for (int i7 = 0; i7 < size; i7++) {
                C29077b bVar = (C29077b) gVar.f76762l.get(i7);
                C29089p pVar = new C29089p(bVar.f76771c);
                if (bVar != null && bVar.f76769a >= 0 && bVar.f76770b > 0) {
                    spannableString.setSpan(pVar, bVar.f76769a, bVar.f76769a + bVar.f76770b, 34);
                }
            }
            aVar.f76798d.setText(spannableString);
            aVar.f76798d.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (gVar.f76754d <= 0 || i6 == 0) {
            aVar.f76799e.setVisibility(8);
        } else {
            aVar.f76799e.setVisibility(0);
            aVar.f76799e.setText(this.f76775c.format(new Date(gVar.f76754d * 1000)));
        }
        LayoutParams layoutParams = (LayoutParams) aVar.f76799e.getLayoutParams();
        LayoutParams layoutParams2 = (LayoutParams) aVar.f76800f.getLayoutParams();
        LayoutParams layoutParams3 = (LayoutParams) aVar.f76798d.getLayoutParams();
        LayoutParams layoutParams4 = (LayoutParams) aVar.f76797c.getLayoutParams();
        if (aVar.f76806l) {
            i2 = this.f76790r;
        } else {
            i2 = this.f76788p;
        }
        if (aVar.f76806l) {
            i3 = this.f76791s;
        } else {
            i3 = this.f76789q;
        }
        if (aVar.f76806l) {
            i4 = this.f76791s;
        } else {
            i4 = this.f76787o;
        }
        if (gVar.f76760j == 0) {
            aVar.f76800f.setBackgroundResource(R.drawable.lr);
            if (VERSION.SDK_INT >= 19) {
                aVar.f76800f.getBackground().setAutoMirrored(true);
            }
            aVar.f76800f.setGravity(8388613);
            aVar.f76796b.setVisibility(0);
            aVar.f76795a.setVisibility(4);
            aVar.f76798d.setTextColor(i2);
            aVar.f76799e.setTextColor(i4);
            if (this.f76776d != null) {
                User curUser = C21115b.m71197a().getCurUser();
                if (curUser == null) {
                    str = "";
                } else {
                    UrlModel a = C43150p.m136857a(curUser);
                    if (a == null || a.getUrlList() == null || a.getUrlList().size() == 0) {
                        str = "";
                    } else {
                        str = (String) a.getUrlList().get(0);
                    }
                }
                this.f76776d.mo51751a(aVar.f76796b, str);
            }
            aVar.f76801g.setVisibility(8);
            aVar.f76802h.setVisibility(0);
            layoutParams.gravity = 8388613;
            if (layoutParams3 != null) {
                layoutParams3.leftMargin = this.f76793u;
                layoutParams3.rightMargin = this.f76792t;
            }
            if (layoutParams4 != null) {
                layoutParams4.leftMargin = this.f76793u;
                layoutParams4.rightMargin = this.f76792t;
                if (aVar.f76798d.getVisibility() == 8) {
                    layoutParams4.topMargin = C23486n.m77122a(10.0d);
                } else {
                    layoutParams4.topMargin = 0;
                }
            }
            if (layoutParams2 != null) {
                layoutParams2.gravity = 8388613;
            }
        } else {
            aVar.f76800f.setBackgroundResource(R.drawable.lq);
            if (VERSION.SDK_INT >= 19) {
                aVar.f76800f.getBackground().setAutoMirrored(true);
            }
            aVar.f76800f.setGravity(8388611);
            aVar.f76796b.setVisibility(4);
            aVar.f76795a.setVisibility(0);
            aVar.f76798d.setTextColor(i3);
            aVar.f76799e.setTextColor(i4);
            aVar.f76795a.setImageResource(R.drawable.z0);
            if (this.f76776d != null) {
                this.f76776d.mo51751a(aVar.f76795a, gVar.f76757g);
            }
            aVar.f76801g.setVisibility(0);
            aVar.f76802h.setVisibility(8);
            if (layoutParams3 != null) {
                layoutParams3.leftMargin = this.f76792t;
                layoutParams3.rightMargin = this.f76793u;
            }
            if (layoutParams4 != null) {
                layoutParams4.leftMargin = this.f76792t;
                layoutParams4.rightMargin = this.f76793u;
            }
            if (layoutParams2 != null) {
                layoutParams2.gravity = 8388611;
            }
        }
        aVar.f76800f.requestLayout();
        if (C6319n.m19593a(gVar.f76756f) || gVar.f76758h <= 0 || gVar.f76759i <= 0) {
            aVar.f76797c.setVisibility(8);
        } else {
            aVar.f76797c.setVisibility(0);
            int i8 = (this.f76782j * gVar.f76759i) / gVar.f76758h;
            ViewGroup.LayoutParams layoutParams5 = aVar.f76797c.getLayoutParams();
            layoutParams5.height = i8;
            layoutParams5.width = this.f76782j;
            aVar.f76797c.setLayoutParams(layoutParams5);
            aVar.f76797c.setImageResource(R.drawable.ws);
            this.f76777e.mo51770a(aVar.f76797c, gVar.f76756f, (String) null);
        }
        m95416a(aVar);
        return view2;
    }
}
