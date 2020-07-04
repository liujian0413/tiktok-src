package com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui;

import android.support.p022v4.view.ViewPager.C0935e;
import com.p280ss.android.ugc.aweme.discover.p1189v4.adapter.DiscoverV4ViewPagerAdapter;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.ui.DiscoverV4NavigationFragment$initViewPager$1 */
public final class DiscoverV4NavigationFragment$initViewPager$1 implements C0935e {

    /* renamed from: a */
    final /* synthetic */ DiscoverV4NavigationFragment f71623a;

    public final void onPageScrollStateChanged(int i) {
    }

    DiscoverV4NavigationFragment$initViewPager$1(DiscoverV4NavigationFragment discoverV4NavigationFragment) {
        this.f71623a = discoverV4NavigationFragment;
    }

    public final void onPageSelected(int i) {
        this.f71623a.f71615h = i;
        DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter = this.f71623a.f71614g;
        if (discoverV4ViewPagerAdapter != null) {
            Map<Integer, WeakReference<C27189a>> map = discoverV4ViewPagerAdapter.f71594a;
            if (map != null) {
                WeakReference weakReference = (WeakReference) map.get(Integer.valueOf(i));
                if (weakReference != null) {
                    C27189a aVar = (C27189a) weakReference.get();
                    if (aVar != null) {
                        aVar.mo69940l();
                    }
                }
            }
        }
    }

    public final void onPageScrolled(int i, float f, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.f71623a.f71616i) {
            if (f < 1.0f && ((double) f) >= 0.5d) {
                DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter = this.f71623a.f71614g;
                if (discoverV4ViewPagerAdapter != null) {
                    Map<Integer, WeakReference<C27189a>> map = discoverV4ViewPagerAdapter.f71594a;
                    if (map != null) {
                        WeakReference weakReference = (WeakReference) map.get(Integer.valueOf(i));
                        if (weakReference != null) {
                            C27189a aVar = (C27189a) weakReference.get();
                            if (aVar != null) {
                                aVar.mo69941m();
                            }
                        }
                    }
                }
            } else if (f > 0.0f && ((double) f) < 0.5d) {
                DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter2 = this.f71623a.f71614g;
                if (discoverV4ViewPagerAdapter2 != null) {
                    Map<Integer, WeakReference<C27189a>> map2 = discoverV4ViewPagerAdapter2.f71594a;
                    if (map2 != null) {
                        WeakReference weakReference2 = (WeakReference) map2.get(Integer.valueOf(i + 1));
                        if (weakReference2 != null) {
                            C27189a aVar2 = (C27189a) weakReference2.get();
                            if (aVar2 != null) {
                                aVar2.mo69941m();
                            }
                        }
                    }
                }
            }
        }
        this.f71623a.f71616i = true;
        DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter3 = this.f71623a.f71614g;
        if (discoverV4ViewPagerAdapter3 != null) {
            Map<Integer, WeakReference<C27189a>> map3 = discoverV4ViewPagerAdapter3.f71594a;
            if (map3 != null) {
                WeakReference weakReference3 = (WeakReference) map3.get(Integer.valueOf(this.f71623a.f71615h));
                if (weakReference3 != null) {
                    C27189a aVar3 = (C27189a) weakReference3.get();
                    if (aVar3 != null) {
                        aVar3.mo69939k();
                    }
                }
            }
        }
        if (C43127fh.m136806a(this.f71623a.getContext())) {
            if (f == 0.0f && i == 0) {
                DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter4 = this.f71623a.f71614g;
                if (discoverV4ViewPagerAdapter4 != null) {
                    Map<Integer, WeakReference<C27189a>> map4 = discoverV4ViewPagerAdapter4.f71594a;
                    if (map4 != null) {
                        for (Entry entry : map4.entrySet()) {
                            WeakReference weakReference4 = (WeakReference) entry.getValue();
                            if (weakReference4 != null) {
                                C27189a aVar4 = (C27189a) weakReference4.get();
                                if (aVar4 != null) {
                                    if (((Number) entry.getKey()).intValue() != i) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    aVar4.mo69936a(z3);
                                }
                            }
                        }
                    }
                }
                this.f71623a.f71616i = false;
            } else if (f == 1.0f) {
                DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter5 = this.f71623a.f71614g;
                if (discoverV4ViewPagerAdapter5 != null) {
                    Map<Integer, WeakReference<C27189a>> map5 = discoverV4ViewPagerAdapter5.f71594a;
                    if (map5 != null) {
                        for (Entry entry2 : map5.entrySet()) {
                            WeakReference weakReference5 = (WeakReference) entry2.getValue();
                            if (weakReference5 != null) {
                                C27189a aVar5 = (C27189a) weakReference5.get();
                                if (aVar5 != null) {
                                    if (((Number) entry2.getKey()).intValue() != i + 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    aVar5.mo69936a(z2);
                                }
                            }
                        }
                    }
                }
                this.f71623a.f71616i = false;
            }
        } else if (f == 0.0f && i2 == 0) {
            DiscoverV4ViewPagerAdapter discoverV4ViewPagerAdapter6 = this.f71623a.f71614g;
            if (discoverV4ViewPagerAdapter6 != null) {
                Map<Integer, WeakReference<C27189a>> map6 = discoverV4ViewPagerAdapter6.f71594a;
                if (map6 != null) {
                    for (Entry entry3 : map6.entrySet()) {
                        WeakReference weakReference6 = (WeakReference) entry3.getValue();
                        if (weakReference6 != null) {
                            C27189a aVar6 = (C27189a) weakReference6.get();
                            if (aVar6 != null) {
                                if (((Number) entry3.getKey()).intValue() != i) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                aVar6.mo69936a(z);
                            }
                        }
                    }
                }
            }
            this.f71623a.f71616i = false;
        }
    }
}
