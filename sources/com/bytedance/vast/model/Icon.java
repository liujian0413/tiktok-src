package com.bytedance.vast.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Icon implements Serializable, Cloneable {
    public List<VideoClick> clickList;
    public int height;
    public String htmlResource;
    public String iFrameResource;
    public String program;
    public Set<String> staticResource;
    public Set<String> viewTracking;
    public int width;
}
