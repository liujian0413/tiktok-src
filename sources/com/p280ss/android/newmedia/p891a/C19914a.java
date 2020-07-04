package com.p280ss.android.newmedia.p891a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Message;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouch;
import com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouch.C11033b;
import com.bytedance.ies.uikit.viewpager.ImageViewTouchViewPager;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.common.util.C6773c;
import com.p280ss.android.download.p856a.C19365f;
import com.p280ss.android.image.C19592h;
import com.p280ss.android.image.C19602k;
import com.p280ss.android.image.C19602k.C19604a;
import com.p280ss.android.image.C6813b;
import com.p280ss.android.image.ImageInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p1896pl.droidsonroids.gif.C48425a;

/* renamed from: com.ss.android.newmedia.a.a */
public final class C19914a extends Dialog implements C6310a, C6773c<String>, C19604a {

    /* renamed from: a */
    final Context f53967a;

    /* renamed from: b */
    final C6813b f53968b;

    /* renamed from: c */
    final boolean f53969c;

    /* renamed from: d */
    public C19602k f53970d;

    /* renamed from: e */
    public C19592h f53971e;

    /* renamed from: f */
    public C19365f<String, Bitmap> f53972f;

    /* renamed from: g */
    View f53973g;

    /* renamed from: h */
    TextView f53974h;

    /* renamed from: i */
    ImageViewTouchViewPager f53975i;

    /* renamed from: j */
    C19919a f53976j;

    /* renamed from: k */
    final C6309f f53977k = new C6309f(this);

    /* renamed from: l */
    final List<ImageInfo> f53978l = new ArrayList();

    /* renamed from: m */
    final List<ImageInfo> f53979m = new ArrayList();

    /* renamed from: n */
    int f53980n = -1;

    /* renamed from: o */
    int f53981o = -1;

    /* renamed from: p */
    public boolean f53982p = true;

    /* renamed from: q */
    final OnClickListener f53983q = new OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C19914a.this.dismiss();
        }
    };

    /* renamed from: com.ss.android.newmedia.a.a$a */
    class C19919a extends PagerAdapter {

        /* renamed from: a */
        final LinkedList<View> f53988a = new LinkedList<>();

        /* renamed from: b */
        final List<ImageInfo> f53989b = new ArrayList();

        /* renamed from: c */
        LayoutInflater f53990c;

        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public final int getCount() {
            return this.f53989b.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo53427a(List<ImageInfo> list) {
            this.f53989b.clear();
            if (list != null) {
                this.f53989b.addAll(list);
            }
        }

        public final int getItemPosition(Object obj) {
            if (this.f53989b.isEmpty()) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        /* renamed from: a */
        private static void m65727a(View view) {
            C19920b bVar;
            if (view != null) {
                Object tag = view.getTag();
                if (tag instanceof C19920b) {
                    bVar = (C19920b) tag;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    bVar.f53992a = null;
                    bVar.f53994c = null;
                    bVar.f53999h.mo26682b();
                }
            }
        }

        /* renamed from: a */
        public final ImageInfo mo53425a(int i) {
            if (i < 0 || i >= this.f53989b.size()) {
                return null;
            }
            return (ImageInfo) this.f53989b.get(i);
        }

        /* renamed from: a */
        private C19920b m65726a(String str) {
            if (C19914a.this.f53975i == null || C6319n.m19593a(str)) {
                return null;
            }
            int childCount = C19914a.this.f53975i.getChildCount();
            C19920b bVar = null;
            for (int i = 0; i < childCount; i++) {
                Object tag = C19914a.this.f53975i.getChildAt(i).getTag();
                if (tag instanceof C19920b) {
                    bVar = (C19920b) tag;
                }
                if (bVar != null && bVar.f53992a != null && str.equals(bVar.f53992a.mUri)) {
                    return bVar;
                }
            }
            return null;
        }

        /* renamed from: a */
        private void m65728a(C19920b bVar) {
            Object obj;
            bVar.f53999h.setVisibility(8);
            if (bVar.f53992a == null || bVar.f53992a.mUri == null) {
                bVar.f53996e.setVisibility(8);
                return;
            }
            bVar.f53996e.setVisibility(0);
            bVar.f53996e.setProgress(0);
            bVar.f53997f.setVisibility(0);
            bVar.f53997f.setText("");
            C19914a.m65716a(C19914a.this.f53973g, false);
            if (C19914a.this.f53972f != null) {
                obj = (Bitmap) C19914a.this.f53972f.mo51337a(bVar.f53992a.mUri);
            } else {
                obj = null;
            }
            if (obj != null) {
                m65729a(bVar, obj);
            } else if (C19914a.this.f53970d == null) {
                mo53426a(bVar.f53992a.mUri, (Object) null);
            } else {
                if (C19914a.this.f53971e == null || bVar.f53993b == null) {
                    C9738o.m28712b((View) bVar.f54000i, 8);
                } else {
                    C9738o.m28712b((View) bVar.f54000i, 0);
                    bVar.f54000i.setImageDrawable(null);
                    C19914a.this.f53971e.mo51769a(bVar.f54000i, bVar.f53993b, false);
                }
                C19914a.this.f53970d.mo51791a(bVar.f53992a.mUri, bVar.f53992a.mUrlList);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo53426a(String str, Object obj) {
            m65729a(m65726a(str), obj);
        }

        C19919a(Context context) {
            this.f53990c = LayoutInflater.from(context);
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            View view;
            if (this.f53988a.size() > 0) {
                view = (View) this.f53988a.removeFirst();
            } else {
                view = null;
            }
            View a = m65725a(i, view, viewGroup);
            viewGroup.addView(a);
            return a;
        }

        /* renamed from: a */
        private void m65729a(C19920b bVar, Object obj) {
            if (bVar != null) {
                bVar.f53996e.setVisibility(8);
                bVar.f53997f.setVisibility(8);
                if (obj == null) {
                    bVar.f53999h.setVisibility(8);
                    C19914a.m65716a(C19914a.this.f53973g, false);
                    C19922b.m65735a(Toast.makeText(C19914a.this.f53967a, R.string.bsu, 0));
                    C19282c.m63182a(C19914a.this.f53967a, "image", "fail");
                    return;
                }
                bVar.f53999h.setVisibility(0);
                bVar.f54000i.setVisibility(8);
                C19914a.m65716a(C19914a.this.f53973g, true);
                if (obj instanceof Bitmap) {
                    bVar.f53999h.setImageBitmap((Bitmap) obj);
                    return;
                }
                if (obj instanceof C48425a) {
                    bVar.f53999h.setImageDrawable((C48425a) obj);
                }
            }
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (obj != null) {
                View view = (View) obj;
                viewGroup.removeView(view);
                this.f53988a.addFirst(view);
                m65727a(view);
            }
        }

        /* renamed from: a */
        private View m65725a(int i, View view, ViewGroup viewGroup) {
            View view2;
            C19920b bVar;
            if (view == null) {
                bVar = new C19920b();
                view2 = this.f53990c.inflate(R.layout.rz, viewGroup, false);
                bVar.mo53428a(view2, C19914a.this.f53969c);
                view2.setTag(bVar);
            } else {
                view2 = view;
                bVar = (C19920b) view.getTag();
            }
            ImageInfo imageInfo = (ImageInfo) C19914a.this.f53978l.get(i);
            bVar.f53995d = false;
            bVar.f53992a = imageInfo;
            bVar.f53994c = null;
            if (C19914a.this.f53979m == null || C19914a.this.f53979m.size() < i + 1) {
                bVar.f53993b = null;
            } else {
                bVar.f53993b = (ImageInfo) C19914a.this.f53979m.get(i);
            }
            if (imageInfo.mKey != null) {
                bVar.f53994c = C6813b.m21186b(imageInfo.mKey);
            }
            m65728a(bVar);
            return view2;
        }
    }

    /* renamed from: com.ss.android.newmedia.a.a$b */
    class C19920b {

        /* renamed from: a */
        ImageInfo f53992a;

        /* renamed from: b */
        ImageInfo f53993b;

        /* renamed from: c */
        String f53994c;

        /* renamed from: d */
        boolean f53995d;

        /* renamed from: e */
        ProgressBar f53996e;

        /* renamed from: f */
        TextView f53997f;

        /* renamed from: g */
        View f53998g;

        /* renamed from: h */
        ImageViewTouch f53999h;

        /* renamed from: i */
        ImageView f54000i;

        C19920b() {
        }

        /* renamed from: a */
        public final void mo53428a(View view, boolean z) {
            view.setOnClickListener(C19914a.this.f53983q);
            this.f53996e = (ProgressBar) view.findViewById(R.id.cky);
            this.f53997f = (TextView) view.findViewById(R.id.cla);
            this.f53998g = view.findViewById(R.id.csg);
            C9738o.m28712b(this.f53998g, 8);
            this.f53999h = (ImageViewTouch) view.findViewById(R.id.apn);
            this.f54000i = (ImageView) view.findViewById(R.id.diy);
            if (z) {
                this.f53999h.setFitToWidth(true);
            }
            C0991u.m4180a((View) this.f53999h, 1, (Paint) null);
            this.f53996e.setVisibility(8);
            this.f53999h.setMyOnClickListener(C19914a.this.f53983q);
            this.f53999h.setDoubleTapListener(new C11033b() {
                /* renamed from: a */
                public final void mo26673a() {
                    C19914a.this.onEvent("zoom_in");
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo53415a() {
        if (this.f53975i != null) {
            this.f53976j.mo53427a(null);
            this.f53976j.notifyDataSetChanged();
            this.f53976j.mo53427a(this.f53978l);
            this.f53976j.notifyDataSetChanged();
            int count = this.f53976j.getCount();
            if (this.f53980n >= 0 && this.f53980n < count) {
                this.f53975i.setCurrentItem(this.f53980n, false);
            }
            m65718b(this.f53975i.getCurrentItem());
            this.f53980n = -1;
            if (count > 0) {
                this.f53973g.setVisibility(0);
            } else {
                this.f53973g.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo53418b() {
        if (this.f53975i != null) {
            ImageInfo a = this.f53976j.mo53425a(this.f53975i.getCurrentItem());
            if (a != null) {
                String str = a.mUri;
                if (!C6319n.m19593a(str)) {
                    this.f53968b.mo16650a(this.f53967a, C6306c.m19561a(str), str);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (this.f53975i != null) {
            this.f53978l.clear();
            this.f53976j.mo53427a(this.f53978l);
            this.f53976j.notifyDataSetChanged();
            int childCount = this.f53975i.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Object tag = this.f53975i.getChildAt(i).getTag();
                C19920b bVar = null;
                if (tag instanceof C19920b) {
                    bVar = (C19920b) tag;
                }
                if (!(bVar == null || bVar.f53992a == null || bVar.f53992a.mUri == null)) {
                    bVar.f53999h.mo26682b();
                }
            }
        }
    }

    public final void onEvent(String str) {
        C19282c.m63182a(this.f53967a, "image", str);
    }

    /* renamed from: b */
    private void m65718b(int i) {
        if (this.f53976j != null && this.f53974h != null && this.f53982p) {
            int count = this.f53976j.getCount();
            int i2 = i + 1;
            String str = "";
            if (i2 > 0 && i2 <= count && count > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append("/");
                sb.append(count);
                str = sb.toString();
            }
            this.f53974h.setText(str);
        }
    }

    public final void handleMsg(Message message) {
        String str;
        C19920b bVar;
        if (message.what == 257 && this.f53975i != null && this.f53976j != null) {
            int i = message.arg1;
            if (message.obj instanceof String) {
                str = (String) message.obj;
            } else {
                str = null;
            }
            if (str != null && isShowing()) {
                if (i < 0) {
                    i = 0;
                }
                if (i >= 100) {
                    i = 99;
                }
                int childCount = this.f53975i.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Object tag = this.f53975i.getChildAt(i2).getTag();
                    if (tag instanceof C19920b) {
                        bVar = (C19920b) tag;
                    } else {
                        bVar = null;
                    }
                    if (bVar != null && str.equals(bVar.f53994c)) {
                        bVar.f53996e.setProgress(i);
                        TextView textView = bVar.f53997f;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i);
                        sb.append("%");
                        textView.setText(sb.toString());
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ry);
        setCancelable(true);
        this.f53973g = findViewById(R.id.cyb);
        this.f53974h = (TextView) findViewById(R.id.c9y);
        this.f53975i = (ImageViewTouchViewPager) findViewById(R.id.ayg);
        this.f53976j = new C19919a(this.f53967a);
        this.f53975i.setOnPageChangeListener(new SimpleOnPageChangeListener() {
            public final void onPageSelected(int i) {
                C19914a.this.mo53416a(i);
            }
        });
        this.f53975i.setAdapter(this.f53976j);
        this.f53973g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C19914a.this.mo53418b();
                C19914a.this.onEvent("download");
            }
        });
        setOnShowListener(new OnShowListener() {
            public final void onShow(DialogInterface dialogInterface) {
                C19914a.this.mo53415a();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo53416a(int i) {
        C19920b bVar;
        if (this.f53975i != null) {
            m65718b(i);
            int i2 = this.f53981o;
            this.f53981o = i;
            if (i2 >= 0 && i2 < this.f53976j.getCount()) {
                ImageInfo a = this.f53976j.mo53425a(i2);
                ImageInfo a2 = this.f53976j.mo53425a(i);
                if (a != null && a2 != null) {
                    int childCount = this.f53975i.getChildCount();
                    C19920b bVar2 = null;
                    C19920b bVar3 = null;
                    for (int i3 = 0; i3 < childCount; i3++) {
                        Object tag = this.f53975i.getChildAt(i3).getTag();
                        if (tag instanceof C19920b) {
                            bVar = (C19920b) tag;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            if (bVar.f53992a == a) {
                                bVar2 = bVar;
                            }
                            if (bVar.f53992a == a2) {
                                bVar3 = bVar;
                            }
                        }
                    }
                    if (!(bVar2 == null || bVar2.f53999h.getDrawable() == null)) {
                        bVar2.f53999h.mo26683b(1.0f, 300.0f);
                    }
                    if (!(bVar3 == null || bVar3.f53999h.getDrawable() == null || !(bVar3.f53999h.getDrawable() instanceof C48425a))) {
                        try {
                            ((C48425a) bVar3.f53999h.getDrawable()).mo123218c();
                            ((C48425a) bVar3.f53999h.getDrawable()).start();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m65716a(View view, boolean z) {
        if (view != null && view.isEnabled() != z) {
            view.setEnabled(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo16566a(int i, String str) {
        Message obtainMessage = this.f53977k.obtainMessage(257);
        obtainMessage.arg1 = i;
        obtainMessage.obj = str;
        this.f53977k.sendMessage(obtainMessage);
    }

    /* renamed from: a */
    private void m65717a(List<ImageInfo> list, int i) {
        this.f53978l.clear();
        this.f53978l.addAll(list);
        this.f53980n = 0;
    }

    /* renamed from: a */
    public final void mo51794a(String str, Object obj) {
        if (isShowing() && this.f53976j != null) {
            this.f53976j.mo53426a(str, obj);
        }
    }

    public C19914a(Context context, C6813b bVar, boolean z) {
        super(context, 16973830);
        this.f53967a = context;
        this.f53968b = bVar;
        this.f53969c = true;
        this.f53972f = new C19365f<>();
    }

    /* renamed from: a */
    public final void mo53417a(String str, String str2, Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(new ImageInfo(str, str2));
        }
        m65717a((List<ImageInfo>) arrayList, 0);
        if (bitmap != null && !C6319n.m19593a(str)) {
            this.f53972f.mo51338a(str, bitmap);
        }
    }
}
