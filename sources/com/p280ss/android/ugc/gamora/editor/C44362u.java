package com.p280ss.android.ugc.gamora.editor;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39947b;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39949c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42060b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.gamora.editor.u */
public final class C44362u extends C42060b {

    /* renamed from: a */
    public List<C42060b> f114602a = new ArrayList();

    /* renamed from: b */
    private List<C42060b> f114603b = new ArrayList();

    /* renamed from: c */
    private List<C42060b> f114604c = new ArrayList();

    /* renamed from: d */
    private List<C42060b> f114605d = new ArrayList();

    /* renamed from: a */
    public final boolean mo96385a(C39949c cVar) {
        for (C42060b bVar : this.f114603b) {
            if (bVar != null && bVar.mo96385a(cVar)) {
                return true;
            }
        }
        for (C42060b bVar2 : this.f114602a) {
            if (bVar2 != null && bVar2.mo96385a(cVar)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114604c) {
            if (bVar3 != null && bVar3.mo96385a(cVar)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114605d) {
            if (bVar4 != null && bVar4.mo96385a(cVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo106801a(C42060b bVar) {
        this.f114603b.add(0, bVar);
    }

    /* renamed from: b */
    public final void mo106802b(C42060b bVar) {
        this.f114602a.add(0, bVar);
    }

    /* renamed from: c */
    public final void mo106803c(C42060b bVar) {
        this.f114604c.add(bVar);
    }

    /* renamed from: d */
    public final void mo106804d(C42060b bVar) {
        this.f114605d.add(bVar);
    }

    /* renamed from: e */
    public final void mo106805e(C42060b bVar) {
        this.f114602a.remove(bVar);
        mo106802b(bVar);
    }

    /* renamed from: a */
    public final boolean mo96381a(float f) {
        for (C42060b bVar : this.f114603b) {
            if (bVar != null && bVar.mo96381a(f)) {
                return true;
            }
        }
        for (C42060b bVar2 : this.f114602a) {
            if (bVar2 != null && bVar2.mo96381a(f)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114604c) {
            if (bVar3 != null && bVar3.mo96381a(f)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114605d) {
            if (bVar4 != null && bVar4.mo96381a(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo98460b(C39947b bVar) {
        for (C42060b bVar2 : this.f114603b) {
            if (bVar2 != null) {
                bVar2.mo98460b(bVar);
            }
        }
        for (C42060b bVar3 : this.f114602a) {
            if (bVar3 != null) {
                bVar3.mo98460b(bVar);
            }
        }
        for (C42060b bVar4 : this.f114604c) {
            if (bVar4 != null) {
                bVar4.mo98460b(bVar);
            }
        }
        for (C42060b bVar5 : this.f114605d) {
            if (bVar5 != null) {
                bVar5.mo98460b(bVar);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo96391c(float f) {
        for (C42060b bVar : this.f114603b) {
            if (bVar != null && bVar.mo96391c(f)) {
                return true;
            }
        }
        for (C42060b bVar2 : this.f114602a) {
            if (bVar2 != null && bVar2.mo96391c(f)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114604c) {
            if (bVar3 != null && bVar3.mo96391c(f)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114605d) {
            if (bVar4 != null && bVar4.mo96391c(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo96393d(MotionEvent motionEvent) {
        for (C42060b bVar : this.f114603b) {
            if (bVar != null && bVar.mo96393d(motionEvent)) {
                return true;
            }
        }
        for (C42060b bVar2 : this.f114602a) {
            if (bVar2 != null && bVar2.mo96393d(motionEvent)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114604c) {
            if (bVar3 != null && bVar3.mo96393d(motionEvent)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114605d) {
            if (bVar4 != null && bVar4.mo96393d(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo98462e(MotionEvent motionEvent) {
        for (C42060b bVar : this.f114603b) {
            if (bVar != null && bVar.mo98462e(motionEvent)) {
                return true;
            }
        }
        for (C42060b bVar2 : this.f114602a) {
            if (bVar2 != null && bVar2.mo98462e(motionEvent)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114604c) {
            if (bVar3 != null && bVar3.mo98462e(motionEvent)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114605d) {
            if (bVar4 != null && bVar4.mo98462e(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo96387b(float f) {
        for (C42060b bVar : this.f114603b) {
            if (bVar != null && bVar.mo96387b(f)) {
                return true;
            }
        }
        for (C42060b bVar2 : this.f114602a) {
            if (bVar2 != null && bVar2.mo96387b(f)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114604c) {
            if (bVar3 != null && bVar3.mo96387b(f)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114605d) {
            if (bVar4 != null && bVar4.mo96387b(f)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo96392c(MotionEvent motionEvent) {
        for (C42060b bVar : this.f114603b) {
            if (bVar != null && bVar.mo96392c(motionEvent)) {
                return true;
            }
        }
        for (C42060b bVar2 : this.f114602a) {
            if (bVar2 != null && bVar2.mo96392c(motionEvent)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114604c) {
            if (bVar3 != null && bVar3.mo96392c(motionEvent)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114605d) {
            if (bVar4 != null && bVar4.mo96392c(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo96384a(ScaleGestureDetector scaleGestureDetector) {
        for (C42060b bVar : this.f114603b) {
            if (bVar != null && bVar.mo96384a(scaleGestureDetector)) {
                return true;
            }
        }
        for (C42060b bVar2 : this.f114602a) {
            if (bVar2 != null && bVar2.mo96384a(scaleGestureDetector)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114604c) {
            if (bVar3 != null && bVar3.mo96384a(scaleGestureDetector)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114605d) {
            if (bVar4 != null && bVar4.mo96384a(scaleGestureDetector)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo98458a(C39947b bVar) {
        for (C42060b bVar2 : this.f114603b) {
            if (bVar2 != null && bVar2.mo98458a(bVar)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114602a) {
            if (bVar3 != null && bVar3.mo98458a(bVar)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114604c) {
            if (bVar4 != null && bVar4.mo98458a(bVar)) {
                return true;
            }
        }
        for (C42060b bVar5 : this.f114605d) {
            if (bVar5 != null && bVar5.mo98458a(bVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo96390b(ScaleGestureDetector scaleGestureDetector) {
        for (C42060b bVar : this.f114603b) {
            if (bVar != null && bVar.mo96390b(scaleGestureDetector)) {
                return true;
            }
        }
        for (C42060b bVar2 : this.f114602a) {
            if (bVar2 != null && bVar2.mo96390b(scaleGestureDetector)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114604c) {
            if (bVar3 != null && bVar3.mo96390b(scaleGestureDetector)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114605d) {
            if (bVar4 != null && bVar4.mo96390b(scaleGestureDetector)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo98459a(C39947b bVar, float f, float f2) {
        for (C42060b bVar2 : this.f114603b) {
            if (bVar2 != null && bVar2.mo98459a(bVar, f, f2)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114602a) {
            if (bVar3 != null && bVar3.mo98459a(bVar, f, f2)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114604c) {
            if (bVar4 != null && bVar4.mo98459a(bVar, f, f2)) {
                return true;
            }
        }
        for (C42060b bVar5 : this.f114605d) {
            if (bVar5 != null && bVar5.mo98459a(bVar, f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (C42060b bVar : this.f114603b) {
            if (bVar != null && bVar.mo96383a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C42060b bVar2 : this.f114602a) {
            if (bVar2 != null && bVar2.mo96383a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114604c) {
            if (bVar3 != null && bVar3.mo96383a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114605d) {
            if (bVar4 != null && bVar4.mo96383a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo96389b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (C42060b bVar : this.f114603b) {
            if (bVar != null && bVar.mo96389b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C42060b bVar2 : this.f114602a) {
            if (bVar2 != null && bVar2.mo96389b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C42060b bVar3 : this.f114604c) {
            if (bVar3 != null && bVar3.mo96389b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        for (C42060b bVar4 : this.f114605d) {
            if (bVar4 != null && bVar4.mo96389b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        return false;
    }
}
