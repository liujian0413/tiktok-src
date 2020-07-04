package android.support.p029v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.widget.ResourceCursorAdapter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.aq */
final class C1359aq extends ResourceCursorAdapter implements OnClickListener {

    /* renamed from: l */
    public int f5308l = 1;

    /* renamed from: m */
    private final SearchManager f5309m = ((SearchManager) this.f3456d.getSystemService("search"));

    /* renamed from: n */
    private final SearchView f5310n;

    /* renamed from: o */
    private final SearchableInfo f5311o;

    /* renamed from: p */
    private final Context f5312p;

    /* renamed from: q */
    private final WeakHashMap<String, ConstantState> f5313q;

    /* renamed from: r */
    private final int f5314r;

    /* renamed from: s */
    private boolean f5315s = false;

    /* renamed from: t */
    private ColorStateList f5316t;

    /* renamed from: u */
    private int f5317u = -1;

    /* renamed from: v */
    private int f5318v = -1;

    /* renamed from: w */
    private int f5319w = -1;

    /* renamed from: x */
    private int f5320x = -1;

    /* renamed from: y */
    private int f5321y = -1;

    /* renamed from: z */
    private int f5322z = -1;

    /* renamed from: android.support.v7.widget.aq$a */
    static final class C1360a {

        /* renamed from: a */
        public final TextView f5323a;

        /* renamed from: b */
        public final TextView f5324b;

        /* renamed from: c */
        public final ImageView f5325c;

        /* renamed from: d */
        public final ImageView f5326d;

        /* renamed from: e */
        public final ImageView f5327e;

        public C1360a(View view) {
            this.f5323a = (TextView) view.findViewById(16908308);
            this.f5324b = (TextView) view.findViewById(16908309);
            this.f5325c = (ImageView) view.findViewById(16908295);
            this.f5326d = (ImageView) view.findViewById(16908296);
            this.f5327e = (ImageView) view.findViewById(R.id.acf);
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    /* renamed from: a */
    public final Cursor mo3812a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f5310n.getVisibility() != 0 || this.f5310n.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor a = m6712a(this.f5311o, charSequence2, 50);
            if (a != null) {
                a.getCount();
                return a;
            }
        } catch (RuntimeException unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final void mo3814a(Cursor cursor) {
        if (this.f5315s) {
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.mo3814a(cursor);
            if (cursor != null) {
                this.f5317u = cursor.getColumnIndex("suggest_text_1");
                this.f5318v = cursor.getColumnIndex("suggest_text_2");
                this.f5319w = cursor.getColumnIndex("suggest_text_2_url");
                this.f5320x = cursor.getColumnIndex("suggest_icon_1");
                this.f5321y = cursor.getColumnIndex("suggest_icon_2");
                this.f5322z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final View mo3813a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo3813a(context, cursor, viewGroup);
        a.setTag(new C1360a(a));
        ((ImageView) a.findViewById(R.id.acf)).setImageResource(this.f5314r);
        return a;
    }

    /* renamed from: a */
    public final void mo3815a(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        C1360a aVar = (C1360a) view.getTag();
        int i = this.f5322z != -1 ? cursor.getInt(this.f5322z) : 0;
        if (aVar.f5323a != null) {
            m6719a(aVar.f5323a, (CharSequence) m6716a(cursor, this.f5317u));
        }
        if (aVar.f5324b != null) {
            String a = m6716a(cursor, this.f5319w);
            if (a != null) {
                charSequence = m6724b((CharSequence) a);
            } else {
                charSequence = m6716a(cursor, this.f5318v);
            }
            if (TextUtils.isEmpty(charSequence)) {
                if (aVar.f5323a != null) {
                    aVar.f5323a.setSingleLine(false);
                    aVar.f5323a.setMaxLines(2);
                }
            } else if (aVar.f5323a != null) {
                aVar.f5323a.setSingleLine(true);
                aVar.f5323a.setMaxLines(1);
            }
            m6719a(aVar.f5324b, charSequence);
        }
        if (aVar.f5325c != null) {
            m6718a(aVar.f5325c, m6726e(cursor), 4);
        }
        if (aVar.f5326d != null) {
            m6718a(aVar.f5326d, m6727f(cursor), 8);
        }
        if (this.f5308l == 2 || (this.f5308l == 1 && (i & 1) != 0)) {
            aVar.f5327e.setVisibility(0);
            aVar.f5327e.setTag(aVar.f5323a.getText());
            aVar.f5327e.setOnClickListener(this);
            return;
        }
        aVar.f5327e.setVisibility(8);
    }

    /* renamed from: a */
    private void m6720a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f5313q.put(str, drawable.getConstantState());
        }
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m6725d(mo3811a());
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m6725d(mo3811a());
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f5310n.mo5919a((CharSequence) tag);
        }
    }

    /* renamed from: b */
    private Drawable m6723b(String str) {
        ConstantState constantState = (ConstantState) this.f5313q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: d */
    private static void m6725d(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null && !bundle.getBoolean("in_progress")) {
        }
    }

    /* renamed from: e */
    private Drawable m6726e(Cursor cursor) {
        if (this.f5320x == -1) {
            return null;
        }
        Drawable a = m6715a(cursor.getString(this.f5320x));
        if (a != null) {
            return a;
        }
        return m6728g(cursor);
    }

    /* renamed from: f */
    private Drawable m6727f(Cursor cursor) {
        if (this.f5321y == -1) {
            return null;
        }
        return m6715a(cursor.getString(this.f5321y));
    }

    /* renamed from: g */
    private Drawable m6728g(Cursor cursor) {
        Drawable a = m6713a(this.f5311o.getSearchActivity());
        if (a != null) {
            return a;
        }
        return this.f3456d.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: a */
    private Drawable m6713a(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        ConstantState constantState = null;
        if (this.f5313q.containsKey(flattenToShortString)) {
            ConstantState constantState2 = (ConstantState) this.f5313q.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f5312p.getResources());
        }
        Drawable b = m6721b(componentName);
        if (b != null) {
            constantState = b.getConstantState();
        }
        this.f5313q.put(flattenToShortString, constantState);
        return b;
    }

    /* renamed from: b */
    private Drawable m6721b(ComponentName componentName) {
        PackageManager packageManager = this.f3456d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                return null;
            }
            return drawable;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final CharSequence mo3819c(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = m6717a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f5311o.shouldRewriteQueryFromData()) {
            String a2 = m6717a(cursor, "suggest_intent_data");
            if (a2 != null) {
                return a2;
            }
        }
        if (this.f5311o.shouldRewriteQueryFromText()) {
            String a3 = m6717a(cursor, "suggest_text_1");
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    /* renamed from: b */
    private CharSequence m6724b(CharSequence charSequence) {
        if (this.f5316t == null) {
            TypedValue typedValue = new TypedValue();
            this.f3456d.getTheme().resolveAttribute(R.attr.a60, typedValue, true);
            this.f5316t = this.f3456d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, this.f5316t, null);
        spannableString.setSpan(textAppearanceSpan, 0, charSequence.length(), 33);
        return spannableString;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:18|19|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = new java.lang.StringBuilder("Resource does not exist: ");
        r2.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        throw new java.io.FileNotFoundException(r2.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:4:0x000d=Splitter:B:4:0x000d, B:21:0x003e=Splitter:B:21:0x003e} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m6714a(android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = r5.getScheme()     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.String r2 = "android.resource"
            boolean r1 = r2.equals(r1)     // Catch:{ FileNotFoundException -> 0x0053 }
            if (r1 == 0) goto L_0x0026
            android.graphics.drawable.Drawable r1 = r4.m6722b(r5)     // Catch:{ NotFoundException -> 0x0012 }
            return r1
        L_0x0012:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.String r3 = "Resource does not exist: "
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0053 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.String r5 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0053 }
            r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0053 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0053 }
        L_0x0026:
            android.content.Context r1 = r4.f5312p     // Catch:{ FileNotFoundException -> 0x0053 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0053 }
            java.io.InputStream r1 = r1.openInputStream(r5)     // Catch:{ FileNotFoundException -> 0x0053 }
            if (r1 == 0) goto L_0x003f
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r1, r0)     // Catch:{ all -> 0x003a }
            r1.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            return r5
        L_0x003a:
            r5 = move-exception
            r1.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            throw r5     // Catch:{ FileNotFoundException -> 0x0053 }
        L_0x003f:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.String r3 = "Failed to open "
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0053 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.String r5 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0053 }
            r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0053 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0053 }
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.C1359aq.m6714a(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    private Drawable m6722b(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f3456d.getPackageManager().getResourcesForApplication(authority);
                List pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt((String) pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder("Single path segment is not a resource ID: ");
                            sb.append(uri);
                            throw new FileNotFoundException(sb.toString());
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb2 = new StringBuilder("More than two path segments: ");
                        sb2.append(uri);
                        throw new FileNotFoundException(sb2.toString());
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    StringBuilder sb3 = new StringBuilder("No resource found for: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder("No path: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            } catch (NameNotFoundException unused2) {
                StringBuilder sb5 = new StringBuilder("No package found for authority: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder("No authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    /* renamed from: a */
    private Drawable m6715a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder("android.resource://");
            sb.append(this.f5312p.getPackageName());
            sb.append("/");
            sb.append(parseInt);
            String sb2 = sb.toString();
            Drawable b = m6723b(sb2);
            if (b != null) {
                return b;
            }
            Drawable a = C0683b.m2903a(this.f5312p, parseInt);
            m6720a(sb2, a);
            return a;
        } catch (NumberFormatException unused) {
            Drawable b2 = m6723b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable a2 = m6714a(Uri.parse(str));
            m6720a(str, a2);
            return a2;
        } catch (NotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m6716a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m6717a(Cursor cursor, String str) {
        return m6716a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static void m6719a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View b = mo3817b(this.f3456d, this.f3455c, viewGroup);
            if (b != null) {
                ((C1360a) b.getTag()).f5323a.setText(e.toString());
            }
            return b;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View a = mo3813a(this.f3456d, this.f3455c, viewGroup);
            if (a != null) {
                ((C1360a) a.getTag()).f5323a.setText(e.toString());
            }
            return a;
        }
    }

    /* renamed from: a */
    private Cursor m6712a(SearchableInfo searchableInfo, String str, int i) {
        String[] strArr = null;
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        Builder fragment = new Builder().scheme(C38347c.f99553h).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", "50");
        return this.f3456d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: a */
    private static void m6718a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public C1359aq(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f5310n = searchView;
        this.f5311o = searchableInfo;
        this.f5314r = searchView.getSuggestionCommitIconResId();
        this.f5312p = context;
        this.f5313q = weakHashMap;
    }
}
