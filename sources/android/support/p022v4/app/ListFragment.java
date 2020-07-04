package android.support.p022v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: android.support.v4.app.ListFragment */
public class ListFragment extends Fragment {

    /* renamed from: a */
    public ListAdapter f2214a;

    /* renamed from: b */
    ListView f2215b;

    /* renamed from: c */
    View f2216c;

    /* renamed from: d */
    TextView f2217d;

    /* renamed from: e */
    View f2218e;

    /* renamed from: f */
    View f2219f;

    /* renamed from: g */
    CharSequence f2220g;

    /* renamed from: h */
    boolean f2221h;

    /* renamed from: i */
    private final Handler f2222i = new Handler();

    /* renamed from: j */
    private final Runnable f2223j = new Runnable() {
        public final void run() {
            ListFragment.this.f2215b.focusableViewAvailable(ListFragment.this.f2215b);
        }
    };

    /* renamed from: k */
    private final OnItemClickListener f2224k = new OnItemClickListener() {
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    };

    public void onDestroyView() {
        this.f2222i.removeCallbacks(this.f2223j);
        this.f2215b = null;
        this.f2221h = false;
        this.f2219f = null;
        this.f2218e = null;
        this.f2216c = null;
        this.f2217d = null;
        super.onDestroyView();
    }

    /* renamed from: a */
    private void m2334a() {
        if (this.f2215b == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.f2215b = (ListView) view;
                } else {
                    this.f2217d = (TextView) view.findViewById(16711681);
                    if (this.f2217d == null) {
                        this.f2216c = view.findViewById(16908292);
                    } else {
                        this.f2217d.setVisibility(8);
                    }
                    this.f2218e = view.findViewById(16711682);
                    this.f2219f = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        this.f2215b = (ListView) findViewById;
                        if (this.f2216c != null) {
                            this.f2215b.setEmptyView(this.f2216c);
                        } else if (this.f2220g != null) {
                            this.f2217d.setText(this.f2220g);
                            this.f2215b.setEmptyView(this.f2217d);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f2221h = true;
                this.f2215b.setOnItemClickListener(this.f2224k);
                if (this.f2214a != null) {
                    ListAdapter listAdapter = this.f2214a;
                    this.f2214a = null;
                    m2335a(listAdapter);
                } else if (this.f2218e != null) {
                    m2336a(false, false);
                }
                this.f2222i.post(this.f2223j);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    /* renamed from: a */
    private void m2335a(ListAdapter listAdapter) {
        boolean z;
        boolean z2 = false;
        if (this.f2214a != null) {
            z = true;
        } else {
            z = false;
        }
        this.f2214a = listAdapter;
        if (this.f2215b != null) {
            this.f2215b.setAdapter(listAdapter);
            if (!this.f2221h && !z) {
                if (getView().getWindowToken() != null) {
                    z2 = true;
                }
                m2336a(true, z2);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m2334a();
    }

    /* renamed from: a */
    private void m2336a(boolean z, boolean z2) {
        m2334a();
        if (this.f2218e == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f2221h != z) {
            this.f2221h = z;
            if (z) {
                if (z2) {
                    this.f2218e.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.f2219f.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    this.f2218e.clearAnimation();
                    this.f2219f.clearAnimation();
                }
                this.f2218e.setVisibility(8);
                this.f2219f.setVisibility(0);
                return;
            }
            if (z2) {
                this.f2218e.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.f2219f.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                this.f2218e.clearAnimation();
                this.f2219f.clearAnimation();
            }
            this.f2218e.setVisibility(0);
            this.f2219f.setVisibility(8);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(context, null, 16842874), new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(context);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new LayoutParams(-1, -1));
        ListView listView = new ListView(context);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        return frameLayout;
    }
}
