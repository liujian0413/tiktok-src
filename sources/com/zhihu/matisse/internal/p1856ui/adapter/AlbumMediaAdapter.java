package com.zhihu.matisse.internal.p1856ui.adapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C47336b;
import com.zhihu.matisse.internal.entity.C47338d;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.model.C47343a;
import com.zhihu.matisse.internal.p1856ui.widget.CheckView;
import com.zhihu.matisse.internal.p1856ui.widget.MediaGrid;
import com.zhihu.matisse.internal.p1856ui.widget.MediaGrid.C47362a;
import com.zhihu.matisse.internal.p1856ui.widget.MediaGrid.C47363b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.zhihu.matisse.internal.ui.adapter.AlbumMediaAdapter */
public class AlbumMediaAdapter extends RecyclerViewCursorAdapter<C1293v> implements C47362a {

    /* renamed from: a */
    public C47353b f121516a;

    /* renamed from: b */
    public C47355d f121517b;

    /* renamed from: d */
    private final C47343a f121518d;

    /* renamed from: e */
    private final Drawable f121519e;

    /* renamed from: f */
    private C47338d f121520f = C47338d.m147803a();

    /* renamed from: g */
    private RecyclerView f121521g;

    /* renamed from: h */
    private int f121522h;

    /* renamed from: com.zhihu.matisse.internal.ui.adapter.AlbumMediaAdapter$a */
    static class C47352a extends C1293v {

        /* renamed from: a */
        public TextView f121524a;

        C47352a(View view) {
            super(view);
            this.f121524a = (TextView) view.findViewById(R.id.avh);
        }
    }

    /* renamed from: com.zhihu.matisse.internal.ui.adapter.AlbumMediaAdapter$b */
    public interface C47353b {
        /* renamed from: c */
        void mo119405c();
    }

    /* renamed from: com.zhihu.matisse.internal.ui.adapter.AlbumMediaAdapter$c */
    static class C47354c extends C1293v {

        /* renamed from: a */
        public MediaGrid f121525a;

        C47354c(View view) {
            super(view);
            this.f121525a = (MediaGrid) view;
        }
    }

    /* renamed from: com.zhihu.matisse.internal.ui.adapter.AlbumMediaAdapter$d */
    public interface C47355d {
        /* renamed from: a */
        void mo119403a(Album album, Item item, int i);
    }

    /* renamed from: com.zhihu.matisse.internal.ui.adapter.AlbumMediaAdapter$e */
    public interface C47356e {
        /* renamed from: d */
        void mo119416d();
    }

    /* renamed from: a */
    private void m147882a() {
        notifyDataSetChanged();
        if (this.f121516a != null) {
            this.f121516a.mo119405c();
        }
    }

    /* renamed from: a */
    private int m147881a(Context context) {
        if (this.f121522h == 0) {
            int i = ((GridLayoutManager) this.f121521g.getLayoutManager()).f4716b;
            this.f121522h = (context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDimensionPixelSize(R.dimen.io) * (i - 1))) / i;
            this.f121522h = (int) (((float) this.f121522h) * this.f121520f.f121459o);
        }
        return this.f121522h;
    }

    /* renamed from: a */
    private boolean m147884a(Context context, Item item) {
        C47336b d = this.f121518d.mo119389d(item);
        C47336b.m147801a(context, d);
        if (d == null) {
            return true;
        }
        return false;
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            C47352a aVar = new C47352a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.agb, viewGroup, false));
            aVar.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    if (view.getContext() instanceof C47356e) {
                        ((C47356e) view.getContext()).mo119416d();
                    }
                }
            });
            return aVar;
        } else if (i == 2) {
            return new C47354c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adc, viewGroup, false));
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private void m147883a(Item item, MediaGrid mediaGrid) {
        if (this.f121520f.f121450f) {
            int e = this.f121518d.mo119391e(item);
            if (e > 0 || !this.f121518d.mo119392e()) {
                mediaGrid.setCheckEnabled(true);
                mediaGrid.setCheckedNum(e);
                return;
            }
            mediaGrid.setCheckEnabled(false);
            mediaGrid.setCheckedNum(Integer.MIN_VALUE);
        } else if (this.f121518d.mo119388c(item)) {
            mediaGrid.setCheckEnabled(true);
            mediaGrid.setChecked(true);
        } else if (this.f121518d.mo119392e()) {
            mediaGrid.setCheckEnabled(false);
            mediaGrid.setChecked(false);
        } else {
            mediaGrid.setCheckEnabled(true);
            mediaGrid.setChecked(false);
        }
    }

    /* renamed from: a */
    public final int mo119411a(int i, Cursor cursor) {
        if (Item.m147794a(cursor).mo119353a()) {
            return 1;
        }
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119412a(C1293v vVar, Cursor cursor) {
        if (vVar instanceof C47352a) {
            C47352a aVar = (C47352a) vVar;
            Drawable[] compoundDrawables = aVar.f121524a.getCompoundDrawables();
            TypedArray obtainStyledAttributes = vVar.itemView.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.ec});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            for (int i = 0; i < compoundDrawables.length; i++) {
                Drawable drawable = compoundDrawables[i];
                if (drawable != null) {
                    ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        Drawable mutate = constantState.newDrawable().mutate();
                        mutate.setColorFilter(color, Mode.SRC_IN);
                        mutate.setBounds(drawable.getBounds());
                        compoundDrawables[i] = mutate;
                    }
                }
            }
            aVar.f121524a.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            return;
        }
        if (vVar instanceof C47354c) {
            C47354c cVar = (C47354c) vVar;
            Item a = Item.m147794a(cursor);
            cVar.f121525a.f121549a = new C47363b(m147881a(cVar.f121525a.getContext()), this.f121519e, this.f121520f.f121450f, vVar);
            cVar.f121525a.mo119437a(a);
            cVar.f121525a.setOnMediaGridClickListener(this);
            m147883a(a, cVar.f121525a);
        }
    }

    public AlbumMediaAdapter(Context context, C47343a aVar, RecyclerView recyclerView) {
        super(null);
        this.f121518d = aVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.oz});
        this.f121519e = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.f121521g = recyclerView;
    }

    /* renamed from: a */
    public final void mo119413a(ImageView imageView, Item item, C1293v vVar) {
        if (this.f121517b != null) {
            this.f121517b.mo119403a(null, item, vVar.getAdapterPosition());
        }
    }

    /* renamed from: a */
    public final void mo119414a(CheckView checkView, Item item, C1293v vVar) {
        if (this.f121520f.f121450f) {
            if (this.f121518d.mo119391e(item) != Integer.MIN_VALUE) {
                this.f121518d.mo119386b(item);
                m147882a();
            } else if (m147884a(vVar.itemView.getContext(), item)) {
                this.f121518d.mo119383a(item);
                m147882a();
            }
        } else if (this.f121518d.mo119388c(item)) {
            this.f121518d.mo119386b(item);
            m147882a();
        } else if (m147884a(vVar.itemView.getContext(), item)) {
            this.f121518d.mo119383a(item);
            m147882a();
        }
    }
}
