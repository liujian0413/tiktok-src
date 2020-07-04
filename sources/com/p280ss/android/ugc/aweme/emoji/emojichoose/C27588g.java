package com.p280ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.base.BaseViewHolder;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27507a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.emoji.utils.C27632c;
import com.p280ss.android.ugc.aweme.emoji.utils.C27636g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.g */
public final class C27588g {

    /* renamed from: a */
    public View f72694a;

    /* renamed from: b */
    public GridView f72695b;

    /* renamed from: c */
    public int f72696c;

    /* renamed from: d */
    private Context f72697d;

    /* renamed from: e */
    private ViewGroup f72698e;

    /* renamed from: f */
    private C27589a f72699f;

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.g$a */
    final class C27589a extends BaseAdapter {

        /* renamed from: a */
        public List<C27517a> f72700a = new ArrayList();

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            return this.f72700a.size();
        }

        public final Object getItem(int i) {
            return this.f72700a.get(i);
        }

        C27589a() {
        }

        /* renamed from: a */
        public final void mo70828a(List<C27517a> list) {
            this.f72700a.clear();
            this.f72700a.addAll(list);
        }

        /* renamed from: a */
        private int m90406a(int i) {
            if (C27588g.this.f72696c == 1) {
                return R.layout.m0;
            }
            if (C27588g.this.f72696c == 4 && ((C27517a) this.f72700a.get(i)).f72556a == R.drawable.a04) {
                return R.layout.lz;
            }
            return R.layout.lw;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            C27590b bVar;
            C27517a aVar = (C27517a) this.f72700a.get(i);
            if (view != null && aVar != null && aVar.equals(view.getTag(R.id.bfn))) {
                return view;
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(m90406a(i), viewGroup, false);
                bVar = new C27590b(view);
                view.setTag(R.id.bfm, bVar);
            } else {
                bVar = (C27590b) view.getTag(R.id.bfm);
            }
            view.setTag(R.id.bfn, aVar);
            bVar.mo70724a(aVar);
            return view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.g$b */
    final class C27590b extends BaseViewHolder<C27517a> {

        /* renamed from: b */
        private RemoteImageView f72703b;

        /* renamed from: c */
        private TextView f72704c;

        /* renamed from: b */
        public final void mo70725b() {
        }

        /* renamed from: a */
        public final void mo70723a() {
            this.f72703b = (RemoteImageView) this.itemView.findViewById(R.id.adx);
            this.f72704c = (TextView) this.itemView.findViewById(R.id.dkn);
        }

        /* renamed from: c */
        private void m90413c(C27517a aVar) {
            Emoji emoji = aVar.f72559d;
            if (C27507a.m90164d(emoji)) {
                C27636g.m90607a(this.f72703b, emoji.getStaticUrl());
            } else {
                C23323e.m76524b(this.f72703b, emoji.getStaticUrl());
            }
        }

        /* renamed from: f */
        private boolean m90416f(C27517a aVar) {
            if (!aVar.mo70726a() || (C27588g.this.f72696c != 2 && (C27588g.this.f72696c != 4 || aVar.f72556a != R.drawable.a04))) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        private void m90414d(C27517a aVar) {
            File file = new File(C27632c.m90590b(), C27632c.m90593d(aVar.f72559d));
            if (file.exists()) {
                m90410a(file.getAbsolutePath(), C27507a.m90164d(aVar.f72559d));
                return;
            }
            m90413c(aVar);
        }

        /* renamed from: e */
        private void m90415e(C27517a aVar) {
            if (this.f72704c != null) {
                this.f72704c.setVisibility(0);
                if (m90416f(aVar)) {
                    this.f72704c.setText(C27507a.m90162b(aVar.f72559d));
                } else {
                    this.f72704c.setText("");
                }
            }
        }

        /* renamed from: b */
        private void m90412b(C27517a aVar) {
            if (this.f72704c != null) {
                this.f72704c.setText("");
            }
            if (this.f72703b != null) {
                if (!aVar.mo70726a() || aVar.f72559d.getStaticUrl() == null) {
                    ((C13438a) this.f72703b.getHierarchy()).mo32904c((Drawable) null);
                    ((C13438a) this.f72703b.getHierarchy()).mo32900b((Drawable) null);
                } else {
                    ((C13438a) this.f72703b.getHierarchy()).mo32902c((int) R.drawable.a08);
                    ((C13438a) this.f72703b.getHierarchy()).mo32898b((int) R.drawable.a08);
                }
            }
        }

        /* renamed from: a */
        public final void mo70724a(C27517a aVar) {
            if (aVar != null) {
                m90412b(aVar);
                Context context = this.itemView.getContext();
                if (aVar.mo70726a()) {
                    m90409a(context, aVar);
                } else if (!TextUtils.isEmpty(aVar.f72558c) || aVar.f72556a > 0 || !TextUtils.isEmpty(aVar.f72557b)) {
                    m90411b(context, aVar);
                } else {
                    if (this.f72703b != null) {
                        this.f72703b.setVisibility(8);
                    }
                    if (this.f72704c != null) {
                        this.f72704c.setVisibility(8);
                    }
                }
                m90415e(aVar);
            }
        }

        C27590b(View view) {
            super(view);
        }

        /* renamed from: a */
        private void m90408a(Context context, int i) {
            StringBuilder sb = new StringBuilder("res://");
            sb.append(context.getPackageName());
            sb.append("/");
            sb.append(i);
            C23323e.m76514a(this.f72703b, sb.toString());
        }

        /* renamed from: a */
        private void m90410a(String str, boolean z) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            String sb2 = sb.toString();
            if (z) {
                C27636g.m90612a(this.f72703b, sb2);
            } else {
                C23323e.m76514a(this.f72703b, sb2);
            }
        }

        /* renamed from: b */
        private void m90411b(Context context, C27517a aVar) {
            if (this.f72703b != null) {
                this.f72703b.setVisibility(0);
                C27608b.m90503a(this.f72703b, aVar);
                this.f72703b.setContentDescription(context.getString(R.string.azv, new Object[]{aVar.f72558c}));
            }
        }

        /* renamed from: a */
        private void m90409a(Context context, C27517a aVar) {
            if (this.f72703b != null) {
                this.f72703b.setVisibility(0);
                this.f72703b.setDrawingCacheEnabled(true);
                if (aVar.f72559d.getStickerType() == 2) {
                    if (aVar.f72556a == R.drawable.zw) {
                        m90408a(context, aVar.f72556a);
                    } else {
                        m90414d(aVar);
                    }
                    this.f72703b.setContentDescription(context.getString(R.string.azy));
                } else if (aVar.f72559d.getStickerType() != 10) {
                    String a = C27632c.m90589a(aVar.f72559d);
                    if (new File(a).exists()) {
                        m90410a(a, C27507a.m90164d(aVar.f72559d));
                    } else {
                        m90413c(aVar);
                    }
                    if (!TextUtils.isEmpty(aVar.f72558c)) {
                        this.f72703b.setContentDescription(context.getString(R.string.azv, new Object[]{aVar.f72558c}));
                    }
                } else if (aVar.f72556a == R.drawable.a04) {
                    m90408a(context, aVar.f72556a);
                    this.f72703b.setContentDescription(context.getString(R.string.azx));
                } else {
                    m90413c(aVar);
                    this.f72703b.setContentDescription(context.getString(R.string.azw));
                }
            }
        }
    }

    /* renamed from: a */
    public final List<C27517a> mo70826a() {
        return this.f72699f.f72700a;
    }

    /* renamed from: b */
    private void m90403b() {
        this.f72694a = LayoutInflater.from(this.f72697d).inflate(R.layout.m5, this.f72698e, false);
        this.f72695b = (GridView) this.f72694a.findViewById(R.id.ae1);
        this.f72695b.setSelector(17170445);
        this.f72695b.setStretchMode(1);
        this.f72695b.setGravity(17);
        Resources resources = this.f72697d.getResources();
        if (this.f72696c == 1) {
            this.f72695b.setNumColumns(7);
            this.f72695b.setColumnWidth(resources.getDimensionPixelSize(R.dimen.gp));
            this.f72695b.setVerticalSpacing(resources.getDimensionPixelSize(R.dimen.gr));
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.gq);
            this.f72695b.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        } else {
            this.f72695b.setNumColumns(4);
            this.f72695b.setColumnWidth(resources.getDimensionPixelSize(R.dimen.gk));
            this.f72695b.setVerticalSpacing(resources.getDimensionPixelSize(R.dimen.gm));
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.gl);
            this.f72695b.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        }
        this.f72699f = new C27589a();
        this.f72695b.setAdapter(this.f72699f);
    }

    /* renamed from: a */
    public final void mo70827a(List<C27517a> list) {
        this.f72699f.mo70828a(list);
        this.f72699f.notifyDataSetChanged();
    }

    public C27588g(ViewGroup viewGroup, int i) {
        this.f72697d = viewGroup.getContext();
        this.f72696c = i;
        this.f72698e = viewGroup;
        m90403b();
    }
}
