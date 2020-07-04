package android.support.p022v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.ResourceCursorAdapter */
public abstract class ResourceCursorAdapter extends CursorAdapter {

    /* renamed from: j */
    public int f3525j;

    /* renamed from: k */
    public int f3526k;

    /* renamed from: l */
    private LayoutInflater f3527l;

    /* renamed from: a */
    public View mo3813a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3527l.inflate(this.f3525j, viewGroup, false);
    }

    /* renamed from: b */
    public final View mo3817b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3527l.inflate(this.f3526k, viewGroup, false);
    }

    public ResourceCursorAdapter(Context context, int i, Cursor cursor, boolean z) {
        super(context, null, true);
        this.f3526k = i;
        this.f3525j = i;
        this.f3527l = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
