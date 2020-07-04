package android.support.p022v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: android.support.v4.widget.f */
final class C1044f extends Filter {

    /* renamed from: a */
    C1045a f3647a;

    /* renamed from: android.support.v4.widget.f$a */
    interface C1045a {
        /* renamed from: a */
        Cursor mo3811a();

        /* renamed from: a */
        Cursor mo3812a(CharSequence charSequence);

        /* renamed from: a */
        void mo3814a(Cursor cursor);

        /* renamed from: c */
        CharSequence mo3819c(Cursor cursor);
    }

    C1044f(C1045a aVar) {
        this.f3647a = aVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f3647a.mo3819c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public final FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f3647a.mo3812a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f3647a.mo3811a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f3647a.mo3814a((Cursor) filterResults.values);
        }
    }
}
