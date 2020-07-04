package android.support.p022v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p022v4.app.Fragment.SavedState;
import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.FragmentStatePagerAdapter */
public abstract class FragmentStatePagerAdapter extends PagerAdapter {
    private C0633q mCurTransaction;
    private Fragment mCurrentPrimaryItem = null;
    private final C0608j mFragmentManager;
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private ArrayList<SavedState> mSavedState = new ArrayList<>();

    public abstract Fragment getItem(int i);

    public Parcelable saveState() {
        Bundle bundle;
        if (this.mSavedState.size() > 0) {
            bundle = new Bundle();
            SavedState[] savedStateArr = new SavedState[this.mSavedState.size()];
            this.mSavedState.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.mFragments.size(); i++) {
            Fragment fragment = (Fragment) this.mFragments.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder sb = new StringBuilder("f");
                sb.append(i);
                this.mFragmentManager.mo2647a(bundle, sb.toString(), fragment);
            }
        }
        return bundle;
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.mCurTransaction != null) {
            this.mCurTransaction.mo2610f();
            this.mCurTransaction = null;
        }
    }

    public FragmentStatePagerAdapter(C0608j jVar) {
        this.mFragmentManager = jVar;
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.mFragments.size() > i) {
            Fragment fragment = (Fragment) this.mFragments.get(i);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.mo2645a();
        }
        Fragment item = getItem(i);
        if (this.mSavedState.size() > i) {
            SavedState savedState = (SavedState) this.mSavedState.get(i);
            if (savedState != null) {
                item.setInitialSavedState(savedState);
            }
        }
        while (this.mFragments.size() <= i) {
            this.mFragments.add(null);
        }
        item.setMenuVisibility(false);
        item.setUserVisibleHint(false);
        this.mFragments.set(i, item);
        this.mCurTransaction.mo2585a(viewGroup.getId(), item);
        return item;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.mSavedState.clear();
            this.mFragments.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.mSavedState.add((SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment a = this.mFragmentManager.mo2643a(bundle, str);
                    if (a != null) {
                        while (this.mFragments.size() <= parseInt) {
                            this.mFragments.add(null);
                        }
                        a.setMenuVisibility(false);
                        this.mFragments.set(parseInt, a);
                    }
                }
            }
        }
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.mCurrentPrimaryItem) {
            if (this.mCurrentPrimaryItem != null) {
                this.mCurrentPrimaryItem.setMenuVisibility(false);
                this.mCurrentPrimaryItem.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.mCurrentPrimaryItem = fragment;
        }
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object obj2;
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.mo2645a();
        }
        while (this.mSavedState.size() <= i) {
            this.mSavedState.add(null);
        }
        ArrayList<SavedState> arrayList = this.mSavedState;
        if (fragment.isAdded()) {
            obj2 = this.mFragmentManager.mo2641a(fragment);
        } else {
            obj2 = null;
        }
        arrayList.set(i, obj2);
        this.mFragments.set(i, null);
        this.mCurTransaction.mo2587a(fragment);
    }
}
