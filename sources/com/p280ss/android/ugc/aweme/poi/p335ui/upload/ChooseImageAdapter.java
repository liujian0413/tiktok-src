package com.p280ss.android.ugc.aweme.poi.p335ui.upload;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter */
public final class ChooseImageAdapter extends C1262a<ChooseImageViewHolder> {

    /* renamed from: d */
    public static final C35416a f92895d = new C35416a(null);

    /* renamed from: a */
    public List<Integer> f92896a;

    /* renamed from: b */
    public final Context f92897b;

    /* renamed from: c */
    public final C35417b f92898c;

    /* renamed from: e */
    private final List<String> f92899e;

    /* renamed from: f */
    private List<Integer> f92900f;

    /* renamed from: g */
    private int f92901g;

    /* renamed from: h */
    private final double f92902h = 1.0d;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter$ChooseImageViewHolder */
    public static final class ChooseImageViewHolder extends C1293v {

        /* renamed from: a */
        public String f92903a;

        /* renamed from: b */
        public final RemoteImageView f92904b;

        /* renamed from: c */
        public final FrameLayout f92905c;

        /* renamed from: d */
        public final View f92906d;

        /* renamed from: e */
        private final TextView f92907e;

        /* renamed from: a */
        public final void mo90161a() {
            this.f92907e.setText("");
            this.f92907e.setBackgroundResource(R.drawable.ne);
        }

        /* renamed from: a */
        public final void mo90162a(int i) {
            this.f92907e.setText(String.valueOf(i + 1));
            this.f92907e.setBackgroundResource(R.drawable.nf);
        }

        public ChooseImageViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.bxo);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.media_view)");
            this.f92904b = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.ayi);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.image_select_indicator)");
            this.f92907e = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.amg);
            C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.…l_image_select_indicator)");
            this.f92905c = (FrameLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.d4f);
            C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.shadow_view)");
            this.f92906d = findViewById4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter$a */
    public static final class C35416a {
        private C35416a() {
        }

        public /* synthetic */ C35416a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter$b */
    public interface C35417b {
        /* renamed from: a */
        void mo90155a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter$c */
    static final class C35418c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChooseImageAdapter f92908a;

        /* renamed from: b */
        final /* synthetic */ String f92909b;

        C35418c(ChooseImageAdapter chooseImageAdapter, String str) {
            this.f92908a = chooseImageAdapter;
            this.f92909b = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Context context = this.f92908a.f92897b;
            if (context != null) {
                ChooseImageAdapter.m114400a((Activity) context, view, (((float) C9738o.m28691a(this.f92908a.f92897b)) * 1.0f) / ((float) C9738o.m28709b(this.f92908a.f92897b)), null, false, null, this.f92909b);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter$d */
    static final class C35419d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChooseImageAdapter f92910a;

        /* renamed from: b */
        final /* synthetic */ ChooseImageViewHolder f92911b;

        C35419d(ChooseImageAdapter chooseImageAdapter, ChooseImageViewHolder chooseImageViewHolder) {
            this.f92910a = chooseImageAdapter;
            this.f92911b = chooseImageViewHolder;
        }

        public final void onClick(View view) {
            Integer num;
            ClickInstrumentation.onClick(view);
            this.f92910a.mo90159a(this.f92911b, this.f92911b.getAdapterPosition());
            C35417b bVar = this.f92910a.f92898c;
            if (bVar != null) {
                List<Integer> list = this.f92910a.f92896a;
                if (list != null) {
                    num = Integer.valueOf(list.size());
                } else {
                    num = null;
                }
                if (num == null) {
                    C7573i.m23580a();
                }
                bVar.mo90155a(num.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter$e */
    static final class C35420e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChooseImageAdapter f92912a;

        /* renamed from: b */
        final /* synthetic */ ChooseImageViewHolder f92913b;

        /* renamed from: c */
        final /* synthetic */ int f92914c;

        C35420e(ChooseImageAdapter chooseImageAdapter, ChooseImageViewHolder chooseImageViewHolder, int i) {
            this.f92912a = chooseImageAdapter;
            this.f92913b = chooseImageViewHolder;
            this.f92914c = i;
        }

        public final void run() {
            this.f92913b.f92906d.setVisibility(4);
            this.f92913b.f92906d.setAlpha(1.0f);
            this.f92912a.notifyItemChanged(this.f92914c, Boolean.valueOf(false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter$f */
    static final class C35421f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChooseImageAdapter f92915a;

        /* renamed from: b */
        final /* synthetic */ int f92916b;

        /* renamed from: c */
        final /* synthetic */ int f92917c;

        C35421f(ChooseImageAdapter chooseImageAdapter, int i, int i2) {
            this.f92915a = chooseImageAdapter;
            this.f92916b = i;
            this.f92917c = i2;
        }

        public final void run() {
            if (this.f92916b == 5) {
                this.f92915a.notifyDataSetChanged();
            } else {
                this.f92915a.notifyItemChanged(this.f92917c, Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: a */
    public final void mo90160a(List<String> list) {
        C7573i.m23587b(list, "filePaths");
        this.f92899e.clear();
        this.f92899e.addAll(list);
        m114398a(this.f92899e.size());
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo90159a(ChooseImageViewHolder chooseImageViewHolder, int i) {
        List<Integer> list = this.f92896a;
        Integer num = null;
        Integer valueOf = list != null ? Integer.valueOf(list.indexOf(Integer.valueOf(i))) : null;
        if (valueOf == null) {
            C7573i.m23580a();
        }
        int intValue = valueOf.intValue();
        if (intValue >= 0) {
            List<Integer> list2 = this.f92900f;
            if (list2 != null) {
                list2.set(i, Integer.valueOf(-1));
            }
            chooseImageViewHolder.mo90161a();
            chooseImageViewHolder.f92906d.animate().alpha(0.0f).setDuration(300).withEndAction(new C35420e(this, chooseImageViewHolder, i)).start();
            chooseImageViewHolder.f92904b.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
            List<Integer> list3 = this.f92896a;
            if (list3 != null) {
                list3.remove(Integer.valueOf(i));
            }
            List<Integer> list4 = this.f92896a;
            Integer valueOf2 = list4 != null ? Integer.valueOf(list4.size()) : null;
            if (valueOf2 == null) {
                C7573i.m23580a();
            }
            int intValue2 = valueOf2.intValue();
            while (intValue < intValue2) {
                List<Integer> list5 = this.f92900f;
                if (list5 != null) {
                    List<Integer> list6 = this.f92896a;
                    Integer num2 = list6 != null ? (Integer) list6.get(intValue) : null;
                    if (num2 == null) {
                        C7573i.m23580a();
                    }
                    list5.set(num2.intValue(), Integer.valueOf(intValue));
                }
                if (intValue2 != 4) {
                    List<Integer> list7 = this.f92896a;
                    Integer num3 = list7 != null ? (Integer) list7.get(intValue) : null;
                    if (num3 == null) {
                        C7573i.m23580a();
                    }
                    notifyItemChanged(num3.intValue(), Boolean.valueOf(false));
                }
                intValue++;
            }
            if (intValue2 == 4) {
                notifyDataSetChanged();
            }
        } else {
            List<Integer> list8 = this.f92896a;
            Integer valueOf3 = list8 != null ? Integer.valueOf(list8.size()) : null;
            if (valueOf3 == null) {
                C7573i.m23580a();
            }
            if (valueOf3.intValue() >= 5) {
                Context context = this.f92897b;
                String string = this.f92897b.getString(R.string.a3x);
                C7573i.m23582a((Object) string, "context.getString(R.stri…se_upload_photos_at_most)");
                String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{Integer.valueOf(5)}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
                C10761a.m31403c(context, a).mo25750a();
                return;
            }
            List<Integer> list9 = this.f92896a;
            if (list9 != null) {
                list9.add(Integer.valueOf(i));
            }
            List<Integer> list10 = this.f92896a;
            Integer valueOf4 = list10 != null ? Integer.valueOf(list10.size()) : null;
            if (valueOf4 == null) {
                C7573i.m23580a();
            }
            chooseImageViewHolder.mo90162a(valueOf4.intValue() - 1);
            List<Integer> list11 = this.f92896a;
            if (list11 != null) {
                num = Integer.valueOf(list11.size());
            }
            if (num == null) {
                C7573i.m23580a();
            }
            int intValue3 = num.intValue();
            List<Integer> list12 = this.f92900f;
            if (list12 != null) {
                list12.set(i, Integer.valueOf(intValue3 - 1));
            }
            chooseImageViewHolder.f92904b.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new C35421f(this, intValue3, i)).start();
            chooseImageViewHolder.f92906d.setAlpha(0.0f);
            chooseImageViewHolder.f92906d.setVisibility(0);
            chooseImageViewHolder.f92906d.animate().alpha(1.0f).setDuration(300).start();
        }
    }

    public final int getItemCount() {
        return this.f92899e.size();
    }

    /* renamed from: a */
    private final void m114398a(int i) {
        if (this.f92896a == null) {
            this.f92896a = new ArrayList();
        } else {
            List<Integer> list = this.f92896a;
            if (list != null) {
                list.clear();
            }
        }
        if (this.f92900f == null) {
            this.f92900f = new ArrayList();
        } else {
            List<Integer> list2 = this.f92900f;
            if (list2 != null) {
                list2.clear();
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            List<Integer> list3 = this.f92900f;
            if (list3 != null) {
                list3.add(Integer.valueOf(-1));
            }
        }
    }

    /* renamed from: a */
    private final void m114401a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.f92901g) {
            int i = layoutParams.height;
            double d = (double) this.f92901g;
            double d2 = this.f92902h;
            Double.isNaN(d);
            if (i != ((int) (d * d2))) {
                layoutParams.width = this.f92901g;
                double d3 = (double) this.f92901g;
                double d4 = this.f92902h;
                Double.isNaN(d3);
                layoutParams.height = (int) (d3 * d4);
            }
        }
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m114397a(viewGroup, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onBindViewHolder(ChooseImageViewHolder chooseImageViewHolder, int i) {
        C7573i.m23587b(chooseImageViewHolder, "holder");
        m114403a(chooseImageViewHolder, i, true);
    }

    /* renamed from: a */
    private static ChooseImageViewHolder m114397a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tp, viewGroup, false);
        C7573i.m23582a((Object) inflate, "itemView");
        return new ChooseImageViewHolder(inflate);
    }

    /* renamed from: a */
    private final void m114399a(int i, ChooseImageViewHolder chooseImageViewHolder) {
        float f;
        Integer num;
        float f2 = 1.0f;
        if (i >= 0) {
            chooseImageViewHolder.mo90162a(i);
            chooseImageViewHolder.f92906d.setVisibility(0);
            f = 1.0f;
            f2 = 1.1f;
        } else {
            chooseImageViewHolder.mo90161a();
            chooseImageViewHolder.f92906d.setVisibility(4);
            List<Integer> list = this.f92896a;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            if (num == null) {
                C7573i.m23580a();
            }
            if (num.intValue() >= 5) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
        }
        if (chooseImageViewHolder.f92904b.getAlpha() != f) {
            chooseImageViewHolder.f92904b.setAlpha(f);
        }
        if (chooseImageViewHolder.f92904b.getScaleX() != f2) {
            chooseImageViewHolder.f92904b.setScaleX(f2);
            chooseImageViewHolder.f92904b.setScaleY(f2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ChooseImageViewHolder chooseImageViewHolder, int i, List<Object> list) {
        C7573i.m23587b(chooseImageViewHolder, "holder");
        C7573i.m23587b(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(chooseImageViewHolder, i);
            return;
        }
        Object obj = list.get(0);
        if (obj != null) {
            m114403a(chooseImageViewHolder, i, ((Boolean) obj).booleanValue());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
    }

    /* renamed from: a */
    private final void m114403a(ChooseImageViewHolder chooseImageViewHolder, int i, boolean z) {
        Integer num;
        m114401a((View) chooseImageViewHolder.f92904b);
        m114401a(chooseImageViewHolder.f92906d);
        List<Integer> list = this.f92900f;
        if (list != null) {
            num = (Integer) list.get(i);
        } else {
            num = null;
        }
        if (num == null) {
            C7573i.m23580a();
        }
        m114399a(num.intValue(), chooseImageViewHolder);
        StringBuilder sb = new StringBuilder("file://");
        sb.append((String) this.f92899e.get(i));
        String sb2 = sb.toString();
        if (!TextUtils.equals(chooseImageViewHolder.f92903a, sb2) && z) {
            chooseImageViewHolder.f92903a = sb2;
            C23323e.m76525b(chooseImageViewHolder.f92904b, chooseImageViewHolder.f92903a, this.f92901g, this.f92901g);
        }
        chooseImageViewHolder.itemView.setOnClickListener(new C35418c(this, sb2));
        chooseImageViewHolder.f92905c.setOnClickListener(new C35419d(this, chooseImageViewHolder));
    }

    public ChooseImageAdapter(Context context, int i, double d, float f, int i2, C35417b bVar) {
        C7573i.m23587b(context, "context");
        this.f92897b = context;
        this.f92898c = bVar;
        this.f92899e = new ArrayList();
        this.f92897b.getResources().getDimensionPixelOffset(R.dimen.im);
        this.f92901g = ((C9738o.m28691a(this.f92897b) - (((int) C9738o.m28708b(this.f92897b, 1.5f)) * 3)) + 0) / 4;
    }

    /* renamed from: a */
    public static void m114400a(Activity activity, View view, float f, User user, boolean z, Challenge challenge, String... strArr) {
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) activity, "aweme://user/header/preview");
        String str = "extra_zoom_info";
        if (view == null) {
            C7573i.m23580a();
        }
        buildRoute.withParam(str, (Parcelable) ZoomAnimationUtils.m136228a(view)).withParam("uri", strArr).withParam("wh_ratio", f).withParam("enable_download_img", false).open();
    }
}
