package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class DependencyCycleException extends DependencyException {
    private final List<C18279a<?>> zza;

    public List<C18279a<?>> getComponentsInCycle() {
        return this.zza;
    }

    public DependencyCycleException(List<C18279a<?>> list) {
        StringBuilder sb = new StringBuilder("Dependency cycle detected: ");
        sb.append(Arrays.toString(list.toArray()));
        super(sb.toString());
        this.zza = list;
    }
}
