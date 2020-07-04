package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Metrics extends Message<Metrics, Builder> {
    public static final ProtoAdapter<Metrics> ADAPTER = new ProtoAdapter_Metrics();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.CounterMetric#ADAPTER", label = Label.REPEATED, tag = 1)
    public final List<CounterMetric> counters;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LevelMetric#ADAPTER", label = Label.REPEATED, tag = 3)
    public final List<LevelMetric> levels;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.TimerMetric#ADAPTER", label = Label.REPEATED, tag = 2)
    public final List<TimerMetric> timers;

    public static final class Builder extends com.squareup.wire.Message.Builder<Metrics, Builder> {
        public List<CounterMetric> counters = Internal.newMutableList();
        public List<LevelMetric> levels = Internal.newMutableList();
        public List<TimerMetric> timers = Internal.newMutableList();

        public final Metrics build() {
            return new Metrics(this.counters, this.timers, this.levels, super.buildUnknownFields());
        }

        public final Builder counters(List<CounterMetric> list) {
            Internal.checkElementsNotNull(list);
            this.counters = list;
            return this;
        }

        public final Builder levels(List<LevelMetric> list) {
            Internal.checkElementsNotNull(list);
            this.levels = list;
            return this;
        }

        public final Builder timers(List<TimerMetric> list) {
            Internal.checkElementsNotNull(list);
            this.timers = list;
            return this;
        }
    }

    static final class ProtoAdapter_Metrics extends ProtoAdapter<Metrics> {
        public ProtoAdapter_Metrics() {
            super(FieldEncoding.LENGTH_DELIMITED, Metrics.class);
        }

        public final int encodedSize(Metrics metrics) {
            return CounterMetric.ADAPTER.asRepeated().encodedSizeWithTag(1, metrics.counters) + TimerMetric.ADAPTER.asRepeated().encodedSizeWithTag(2, metrics.timers) + LevelMetric.ADAPTER.asRepeated().encodedSizeWithTag(3, metrics.levels) + metrics.unknownFields().size();
        }

        public final Metrics redact(Metrics metrics) {
            Builder newBuilder = metrics.newBuilder();
            Internal.redactElements(newBuilder.counters, CounterMetric.ADAPTER);
            Internal.redactElements(newBuilder.timers, TimerMetric.ADAPTER);
            Internal.redactElements(newBuilder.levels, LevelMetric.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final Metrics decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.counters.add(CounterMetric.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.timers.add(TimerMetric.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.levels.add(LevelMetric.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, Metrics metrics) throws IOException {
            CounterMetric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, metrics.counters);
            TimerMetric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, metrics.timers);
            LevelMetric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, metrics.levels);
            protoWriter.writeBytes(metrics.unknownFields());
        }
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((unknownFields().hashCode() * 37) + this.counters.hashCode()) * 37) + this.timers.hashCode()) * 37) + this.levels.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.counters = Internal.copyOf("counters", this.counters);
        builder.timers = Internal.copyOf("timers", this.timers);
        builder.levels = Internal.copyOf("levels", this.levels);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.counters.isEmpty()) {
            sb.append(", counters=");
            sb.append(this.counters);
        }
        if (!this.timers.isEmpty()) {
            sb.append(", timers=");
            sb.append(this.timers);
        }
        if (!this.levels.isEmpty()) {
            sb.append(", levels=");
            sb.append(this.levels);
        }
        StringBuilder replace = sb.replace(0, 2, "Metrics{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Metrics)) {
            return false;
        }
        Metrics metrics = (Metrics) obj;
        if (!unknownFields().equals(metrics.unknownFields()) || !this.counters.equals(metrics.counters) || !this.timers.equals(metrics.timers) || !this.levels.equals(metrics.levels)) {
            return false;
        }
        return true;
    }

    public Metrics(List<CounterMetric> list, List<TimerMetric> list2, List<LevelMetric> list3) {
        this(list, list2, list3, ByteString.EMPTY);
    }

    public Metrics(List<CounterMetric> list, List<TimerMetric> list2, List<LevelMetric> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.counters = Internal.immutableCopyOf("counters", list);
        this.timers = Internal.immutableCopyOf("timers", list2);
        this.levels = Internal.immutableCopyOf("levels", list3);
    }
}
