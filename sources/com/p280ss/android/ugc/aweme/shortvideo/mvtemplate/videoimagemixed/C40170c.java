package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.view.View.OnClickListener;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.listener.C40180a;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.listener.C40181b;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.listener.C40182c;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.listener.VideoImageMixedTouchCallback;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.c */
public final class C40170c implements C40180a {

    /* renamed from: a */
    public final ArrayList<MyMediaModel> f104424a = new ArrayList<>();

    /* renamed from: b */
    public C40182c f104425b;

    /* renamed from: c */
    public C40181b f104426c;

    /* renamed from: d */
    public AVMediaChooseBaseFragment f104427d;

    /* renamed from: e */
    public AVMediaChooseBaseFragment f104428e;

    /* renamed from: f */
    private VideoImageMixedView f104429f;

    /* renamed from: g */
    private VideoImageMixedAdapter f104430g;

    /* renamed from: h */
    private String f104431h;

    /* renamed from: i */
    private String f104432i;

    /* renamed from: j */
    private String f104433j;

    /* renamed from: k */
    private Drawable f104434k;

    /* renamed from: l */
    private Drawable f104435l;

    /* renamed from: m */
    private boolean f104436m;

    /* renamed from: n */
    private boolean f104437n;

    /* renamed from: o */
    private int f104438o = 1;

    /* renamed from: p */
    private int f104439p = 1;

    /* renamed from: q */
    private List<String> f104440q = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.c$a */
    public static final class C40171a implements C40182c {

        /* renamed from: a */
        final /* synthetic */ C40170c f104441a;

        C40171a(C40170c cVar) {
            this.f104441a = cVar;
        }

        /* renamed from: a */
        public final void mo99831a(MyMediaModel myMediaModel) {
            if (myMediaModel != null) {
                Iterator it = this.f104441a.f104424a.iterator();
                int i = 1;
                while (it.hasNext()) {
                    MyMediaModel myMediaModel2 = (MyMediaModel) it.next();
                    String str = myMediaModel.f88156b;
                    C7573i.m23582a((Object) myMediaModel2, "model");
                    if (C7573i.m23585a((Object) str, (Object) myMediaModel2.f88156b)) {
                        myMediaModel2.f104288p = -1;
                    } else {
                        myMediaModel2.f104288p = i;
                        i++;
                    }
                }
                this.f104441a.f104424a.remove(myMediaModel);
                this.f104441a.mo99932a(true, myMediaModel);
                AVMediaChooseBaseFragment aVMediaChooseBaseFragment = this.f104441a.f104427d;
                if (aVMediaChooseBaseFragment == null) {
                    C7573i.m23580a();
                }
                aVMediaChooseBaseFragment.mo99800d();
                AVMediaChooseBaseFragment aVMediaChooseBaseFragment2 = this.f104441a.f104428e;
                if (aVMediaChooseBaseFragment2 == null) {
                    C7573i.m23580a();
                }
                aVMediaChooseBaseFragment2.mo99800d();
                if (this.f104441a.f104425b != null) {
                    C40182c cVar = this.f104441a.f104425b;
                    if (cVar == null) {
                        C7573i.m23580a();
                    }
                    cVar.mo99831a(myMediaModel);
                }
                C40177e.f104448a.mo99946b(myMediaModel.mo86201c());
            }
        }

        /* renamed from: a */
        public final void mo99832a(MyMediaModel myMediaModel, View view) {
            if (this.f104441a.f104425b != null) {
                C40182c cVar = this.f104441a.f104425b;
                if (cVar == null) {
                    C7573i.m23580a();
                }
                cVar.mo99832a(myMediaModel, view);
            }
            if (myMediaModel != null) {
                C40177e.f104448a.mo99947c(myMediaModel.mo86201c());
            }
        }

        /* renamed from: a */
        public final void mo99830a(int i, int i2) {
            boolean z;
            boolean z2 = true;
            if (i < 0 || i >= this.f104441a.f104424a.size()) {
                z = false;
            } else {
                z = true;
            }
            if (i2 < 0 || i2 >= this.f104441a.f104424a.size()) {
                z2 = false;
            }
            if (z && z2) {
                Object remove = this.f104441a.f104424a.remove(i);
                C7573i.m23582a(remove, "selectMediaModelList.removeAt(from)");
                MyMediaModel myMediaModel = (MyMediaModel) remove;
                this.f104441a.f104424a.add(i2, myMediaModel);
                this.f104441a.mo99936b();
                AVMediaChooseBaseFragment aVMediaChooseBaseFragment = this.f104441a.f104428e;
                if (aVMediaChooseBaseFragment == null) {
                    C7573i.m23580a();
                }
                aVMediaChooseBaseFragment.mo99797a(i, i2);
                AVMediaChooseBaseFragment aVMediaChooseBaseFragment2 = this.f104441a.f104427d;
                if (aVMediaChooseBaseFragment2 == null) {
                    C7573i.m23580a();
                }
                aVMediaChooseBaseFragment2.mo99797a(i, i2);
                if (this.f104441a.f104425b != null) {
                    C40182c cVar = this.f104441a.f104425b;
                    if (cVar == null) {
                        C7573i.m23580a();
                    }
                    cVar.mo99830a(i, i2);
                }
                C40177e.f104448a.mo99945a(myMediaModel.mo86201c());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.c$b */
    static final class C40172b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40170c f104442a;

        C40172b(C40170c cVar) {
            this.f104442a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f104442a.f104426c != null) {
                C40181b bVar = this.f104442a.f104426c;
                if (bVar == null) {
                    C7573i.m23580a();
                }
                bVar.mo99892a();
            }
        }
    }

    /* renamed from: a */
    public final List<MyMediaModel> mo99933a() {
        return this.f104424a;
    }

    /* renamed from: c */
    private final int m128340c() {
        int b = (C40173d.f104443a.mo99941b() - this.f104424a.size()) - this.f104440q.size();
        if (b < 0) {
            return 0;
        }
        return b;
    }

    /* renamed from: b */
    public final void mo99936b() {
        Iterator it = this.f104424a.iterator();
        int i = 1;
        while (it.hasNext()) {
            ((MyMediaModel) it.next()).f104288p = i;
            i++;
        }
    }

    /* renamed from: d */
    private final void m128341d() {
        Iterator it = this.f104424a.iterator();
        while (it.hasNext()) {
            MyMediaModel myMediaModel = (MyMediaModel) it.next();
            C7573i.m23582a((Object) myMediaModel, "mediaModel");
            String str = myMediaModel.f88156b;
            C7573i.m23582a((Object) str, "mediaModel.filePath");
            if (C40173d.m128357b(str)) {
                myMediaModel.f88159e = 3000;
                myMediaModel.f88163i = 720;
                myMediaModel.f88164j = 1280;
            }
        }
    }

    /* renamed from: e */
    private final void m128342e() {
        VideoImageMixedView videoImageMixedView = this.f104429f;
        if (videoImageMixedView == null) {
            C7573i.m23583a("videoImageMixedView");
        }
        DmtTextView sureTextView = videoImageMixedView.getSureTextView();
        int size = this.f104424a.size();
        boolean a = C40173d.m128356a((List<? extends MyMediaModel>) this.f104424a);
        boolean z = false;
        if (!a && size != 1 && !this.f104436m && !this.f104437n) {
            String str = this.f104431h;
            if (str == null) {
                C7573i.m23583a("photoMovieText");
            }
            String a2 = C1642a.m8034a(str, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            C7573i.m23582a((Object) a2, "java.lang.String.format(format, *args)");
            sureTextView.setText(a2);
        } else if (this.f104437n) {
            if (size == 1) {
                sureTextView.setText(sureTextView.getContext().getString(R.string.alj));
            } else {
                String str2 = this.f104433j;
                if (str2 == null) {
                    C7573i.m23583a("sureText");
                }
                String a3 = C1642a.m8034a(str2, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                C7573i.m23582a((Object) a3, "java.lang.String.format(format, *args)");
                sureTextView.setText(a3);
            }
        } else if (this.f104436m) {
            String str3 = this.f104433j;
            if (str3 == null) {
                C7573i.m23583a("sureText");
            }
            String a4 = C1642a.m8034a(str3, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            C7573i.m23582a((Object) a4, "java.lang.String.format(format, *args)");
            sureTextView.setText(a4);
        } else if (size == 1) {
            sureTextView.setText(sureTextView.getContext().getString(R.string.cll));
        } else {
            String str4 = this.f104432i;
            if (str4 == null) {
                C7573i.m23583a("nextStepText");
            }
            String a5 = C1642a.m8034a(str4, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
            C7573i.m23582a((Object) a5, "java.lang.String.format(format, *args)");
            sureTextView.setText(a5);
        }
        if (size == 0) {
            m128338a(sureTextView, false);
            VideoImageMixedView videoImageMixedView2 = this.f104429f;
            if (videoImageMixedView2 == null) {
                C7573i.m23583a("videoImageMixedView");
            }
            videoImageMixedView2.mo99923a(false);
            if (this.f104437n || this.f104436m) {
                sureTextView.setText(sureTextView.getContext().getString(R.string.alj));
            } else {
                sureTextView.setText(sureTextView.getContext().getString(R.string.cll));
            }
        } else {
            if (a) {
                if (size >= this.f104438o) {
                    z = true;
                }
                m128338a(sureTextView, z);
            } else {
                if (size >= this.f104439p) {
                    z = true;
                }
                m128338a(sureTextView, z);
            }
            VideoImageMixedView videoImageMixedView3 = this.f104429f;
            if (videoImageMixedView3 == null) {
                C7573i.m23583a("videoImageMixedView");
            }
            videoImageMixedView3.mo99923a(true);
        }
    }

    /* renamed from: a */
    public final void mo99934a(View view) {
        C7573i.m23587b(view, "contentView");
        this.f104429f = (VideoImageMixedView) view;
        VideoImageMixedView videoImageMixedView = this.f104429f;
        if (videoImageMixedView == null) {
            C7573i.m23583a("videoImageMixedView");
        }
        videoImageMixedView.setVisibility(0);
        this.f104430g = new VideoImageMixedAdapter();
        VideoImageMixedView videoImageMixedView2 = this.f104429f;
        if (videoImageMixedView2 == null) {
            C7573i.m23583a("videoImageMixedView");
        }
        RecyclerView mediaSelectRecyleView = videoImageMixedView2.getMediaSelectRecyleView();
        VideoImageMixedAdapter videoImageMixedAdapter = this.f104430g;
        if (videoImageMixedAdapter == null) {
            C7573i.m23583a("videoImageMixedAdapter");
        }
        mediaSelectRecyleView.setAdapter(videoImageMixedAdapter);
        VideoImageMixedAdapter videoImageMixedAdapter2 = this.f104430g;
        if (videoImageMixedAdapter2 == null) {
            C7573i.m23583a("videoImageMixedAdapter");
        }
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new VideoImageMixedTouchCallback(videoImageMixedAdapter2));
        VideoImageMixedView videoImageMixedView3 = this.f104429f;
        if (videoImageMixedView3 == null) {
            C7573i.m23583a("videoImageMixedView");
        }
        itemTouchHelper.mo6500a(videoImageMixedView3.getMediaSelectRecyleView());
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "contentView.getContext()");
        String string = context.getResources().getString(R.string.bav);
        C7573i.m23582a((Object) string, "contentView.getContext()…g.generating_photo_films)");
        this.f104431h = string;
        Context context2 = view.getContext();
        C7573i.m23582a((Object) context2, "contentView.getContext()");
        String string2 = context2.getResources().getString(R.string.cln);
        C7573i.m23582a((Object) string2, "contentView.getContext()…ing.next_step_with_count)");
        this.f104432i = string2;
        Context context3 = view.getContext();
        C7573i.m23582a((Object) context3, "contentView.getContext()");
        String string3 = context3.getResources().getString(R.string.dcb);
        C7573i.m23582a((Object) string3, "contentView.getContext()…record_choose_photo_sure)");
        this.f104433j = string3;
        Context context4 = view.getContext();
        C7573i.m23582a((Object) context4, "contentView.getContext()");
        int a = (int) C20505c.m68010a(view.getContext(), 2.0f);
        Drawable a2 = C38501ax.m123066a(0, context4.getResources().getColor(R.color.a2w), 0, a);
        C7573i.m23582a((Object) a2, "DmtDesignDrawableFactory…T, clickColor, 0, radius)");
        this.f104434k = a2;
        Drawable a3 = C38501ax.m123066a(0, 253106211, 0, a);
        C7573i.m23582a((Object) a3, "DmtDesignDrawableFactory…T, 0x0F161823, 0, radius)");
        this.f104435l = a3;
        VideoImageMixedAdapter videoImageMixedAdapter3 = this.f104430g;
        if (videoImageMixedAdapter3 == null) {
            C7573i.m23583a("videoImageMixedAdapter");
        }
        videoImageMixedAdapter3.f104392a = new C40171a(this);
        VideoImageMixedView videoImageMixedView4 = this.f104429f;
        if (videoImageMixedView4 == null) {
            C7573i.m23583a("videoImageMixedView");
        }
        videoImageMixedView4.getSureTextView().setOnClickListener(new C40172b(this));
    }

    /* renamed from: a */
    public final void mo99935a(C40169b bVar) {
        this.f104425b = bVar.f104414a;
        this.f104426c = bVar.f104415b;
        this.f104436m = bVar.f104416c;
        this.f104437n = bVar.f104417d;
        this.f104427d = bVar.f104418e;
        this.f104428e = bVar.f104419f;
        this.f104439p = bVar.f104421h;
        this.f104438o = bVar.f104422i;
        VideoImageMixedView videoImageMixedView = this.f104429f;
        if (videoImageMixedView == null) {
            C7573i.m23583a("videoImageMixedView");
        }
        videoImageMixedView.mo99922a(bVar.f104420g, this.f104436m);
        this.f104440q = bVar.f104423j;
        m128342e();
        if (!this.f104437n) {
            C40173d.f104443a.mo99942e();
        }
    }

    /* renamed from: a */
    public final int mo99932a(boolean z, MyMediaModel myMediaModel) {
        if (myMediaModel == null) {
            return -1;
        }
        VideoImageMixedAdapter videoImageMixedAdapter = this.f104430g;
        if (videoImageMixedAdapter == null) {
            C7573i.m23583a("videoImageMixedAdapter");
        }
        videoImageMixedAdapter.mo99914a(myMediaModel);
        this.f104424a.remove(myMediaModel);
        mo99936b();
        m128342e();
        return m128340c();
    }

    /* renamed from: a */
    private final void m128338a(DmtTextView dmtTextView, boolean z) {
        if (z) {
            if (dmtTextView != null) {
                dmtTextView.setTextColor(-1);
            }
            if (dmtTextView != null) {
                Drawable drawable = this.f104434k;
                if (drawable == null) {
                    C7573i.m23583a("clickDrawable");
                }
                dmtTextView.setBackground(drawable);
            }
            if (dmtTextView != null) {
                dmtTextView.setClickable(true);
            }
            return;
        }
        if (dmtTextView != null) {
            dmtTextView.setTextColor(1461065763);
        }
        if (dmtTextView != null) {
            Drawable drawable2 = this.f104435l;
            if (drawable2 == null) {
                C7573i.m23583a("unClickDrawable");
            }
            dmtTextView.setBackground(drawable2);
        }
        if (dmtTextView != null) {
            dmtTextView.setClickable(false);
        }
    }

    /* renamed from: b */
    private final int m128339b(boolean z, MyMediaModel myMediaModel) {
        if (myMediaModel == null) {
            return -1;
        }
        this.f104424a.add(myMediaModel);
        VideoImageMixedAdapter videoImageMixedAdapter = this.f104430g;
        if (videoImageMixedAdapter == null) {
            C7573i.m23583a("videoImageMixedAdapter");
        }
        videoImageMixedAdapter.mo99915b(myMediaModel);
        mo99936b();
        m128342e();
        VideoImageMixedView videoImageMixedView = this.f104429f;
        if (videoImageMixedView == null) {
            C7573i.m23583a("videoImageMixedView");
        }
        VideoImageMixedAdapter videoImageMixedAdapter2 = this.f104430g;
        if (videoImageMixedAdapter2 == null) {
            C7573i.m23583a("videoImageMixedAdapter");
        }
        videoImageMixedView.mo99921a(videoImageMixedAdapter2.getItemCount());
        return m128340c();
    }

    /* renamed from: a */
    public final int mo99930a(int i, int i2) {
        int size = this.f104424a.size();
        int i3 = 2;
        if (this.f104437n) {
            m128341d();
            return 2;
        } else if (i == 1) {
            return i;
        } else {
            if (size == 1) {
                Object obj = this.f104424a.get(0);
                C7573i.m23582a(obj, "selectMediaModelList[0]");
                if (!((MyMediaModel) obj).mo86201c()) {
                    i3 = i2 == 1 ? 5 : 3;
                } else if (i2 == 1) {
                    i3 = 6;
                }
            } else if (C40173d.m128356a((List<? extends MyMediaModel>) this.f104424a)) {
                m128341d();
            } else {
                i3 = 4;
            }
            return i3;
        }
    }

    /* renamed from: a */
    public final int mo99931a(MyMediaModel myMediaModel, boolean z, boolean z2) {
        int i;
        if (z) {
            i = m128339b(false, myMediaModel);
        } else {
            i = mo99932a(false, myMediaModel);
        }
        if (z2) {
            AVMediaChooseBaseFragment aVMediaChooseBaseFragment = this.f104428e;
            if (aVMediaChooseBaseFragment == null) {
                C7573i.m23580a();
            }
            aVMediaChooseBaseFragment.mo99796a(i);
        } else {
            AVMediaChooseBaseFragment aVMediaChooseBaseFragment2 = this.f104427d;
            if (aVMediaChooseBaseFragment2 == null) {
                C7573i.m23580a();
            }
            aVMediaChooseBaseFragment2.mo99796a(i);
        }
        if (!z) {
            AVMediaChooseBaseFragment aVMediaChooseBaseFragment3 = this.f104427d;
            if (aVMediaChooseBaseFragment3 == null) {
                C7573i.m23580a();
            }
            aVMediaChooseBaseFragment3.mo99795a();
            AVMediaChooseBaseFragment aVMediaChooseBaseFragment4 = this.f104428e;
            if (aVMediaChooseBaseFragment4 == null) {
                C7573i.m23580a();
            }
            aVMediaChooseBaseFragment4.mo99795a();
        } else if (i == 0) {
            AVMediaChooseBaseFragment aVMediaChooseBaseFragment5 = this.f104427d;
            if (aVMediaChooseBaseFragment5 == null) {
                C7573i.m23580a();
            }
            aVMediaChooseBaseFragment5.mo99795a();
            AVMediaChooseBaseFragment aVMediaChooseBaseFragment6 = this.f104428e;
            if (aVMediaChooseBaseFragment6 == null) {
                C7573i.m23580a();
            }
            aVMediaChooseBaseFragment6.mo99795a();
        }
        return mo99933a().size();
    }
}
