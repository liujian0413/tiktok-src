package com.zhihu.matisse.internal.p1856ui.adapter;

import android.database.Cursor;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;

/* renamed from: com.zhihu.matisse.internal.ui.adapter.RecyclerViewCursorAdapter */
public abstract class RecyclerViewCursorAdapter<VH extends C1293v> extends C1262a<VH> {

    /* renamed from: a */
    private int f121528a;

    /* renamed from: c */
    public Cursor f121529c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo119411a(int i, Cursor cursor);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo119412a(VH vh, Cursor cursor);

    public int getItemCount() {
        if (m147895b(this.f121529c)) {
            return this.f121529c.getCount();
        }
        return 0;
    }

    RecyclerViewCursorAdapter(Cursor cursor) {
        setHasStableIds(true);
        mo119419a(null);
    }

    /* renamed from: b */
    private static boolean m147895b(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo119419a(Cursor cursor) {
        if (cursor != this.f121529c) {
            if (cursor != null) {
                this.f121529c = cursor;
                this.f121528a = this.f121529c.getColumnIndexOrThrow("_id");
                notifyDataSetChanged();
                return;
            }
            notifyItemRangeRemoved(0, getItemCount());
            this.f121529c = null;
            this.f121528a = -1;
        }
    }

    public long getItemId(int i) {
        if (!m147895b(this.f121529c)) {
            throw new IllegalStateException("Cannot lookup item id when cursor is in invalid state.");
        } else if (this.f121529c.moveToPosition(i)) {
            return this.f121529c.getLong(this.f121528a);
        } else {
            StringBuilder sb = new StringBuilder("Could not move cursor to position ");
            sb.append(i);
            sb.append(" when trying to get an item id");
            throw new IllegalStateException(sb.toString());
        }
    }

    public int getItemViewType(int i) {
        if (this.f121529c.moveToPosition(i)) {
            return mo119411a(i, this.f121529c);
        }
        StringBuilder sb = new StringBuilder("Could not move cursor to position ");
        sb.append(i);
        sb.append(" when trying to get item view type.");
        throw new IllegalStateException(sb.toString());
    }

    public void onBindViewHolder(VH vh, int i) {
        if (!m147895b(this.f121529c)) {
            throw new IllegalStateException("Cannot bind view holder when cursor is in invalid state.");
        } else if (this.f121529c.moveToPosition(i)) {
            mo119412a(vh, this.f121529c);
        } else {
            StringBuilder sb = new StringBuilder("Could not move cursor to position ");
            sb.append(i);
            sb.append(" when trying to bind view holder");
            throw new IllegalStateException(sb.toString());
        }
    }
}
