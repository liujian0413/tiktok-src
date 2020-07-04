package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HotSearchDisplay */
public final class HotSearchDisplay extends Message<HotSearchDisplay, Builder> {
    public static final DefaultValueProtoAdapter<HotSearchDisplay> ADAPTER = new ProtoAdapter_HotSearchDisplay();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer most_display_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long one_display_intervals;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer op_most_display_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long op_one_display_intervals;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HotSearchDisplay$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<HotSearchDisplay, Builder> {
        public Integer most_display_times;
        public Long one_display_intervals;
        public Integer op_most_display_times;
        public Long op_one_display_intervals;

        public final HotSearchDisplay build() {
            HotSearchDisplay hotSearchDisplay = new HotSearchDisplay(this.most_display_times, this.one_display_intervals, this.op_most_display_times, this.op_one_display_intervals, super.buildUnknownFields());
            return hotSearchDisplay;
        }

        public final Builder most_display_times(Integer num) {
            this.most_display_times = num;
            return this;
        }

        public final Builder one_display_intervals(Long l) {
            this.one_display_intervals = l;
            return this;
        }

        public final Builder op_most_display_times(Integer num) {
            this.op_most_display_times = num;
            return this;
        }

        public final Builder op_one_display_intervals(Long l) {
            this.op_one_display_intervals = l;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HotSearchDisplay$ProtoAdapter_HotSearchDisplay */
    static final class ProtoAdapter_HotSearchDisplay extends DefaultValueProtoAdapter<HotSearchDisplay> {
        public final HotSearchDisplay redact(HotSearchDisplay hotSearchDisplay) {
            return hotSearchDisplay;
        }

        public ProtoAdapter_HotSearchDisplay() {
            super(FieldEncoding.LENGTH_DELIMITED, HotSearchDisplay.class);
        }

        public final HotSearchDisplay decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (HotSearchDisplay) null);
        }

        public final int encodedSize(HotSearchDisplay hotSearchDisplay) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, hotSearchDisplay.most_display_times) + ProtoAdapter.INT64.encodedSizeWithTag(2, hotSearchDisplay.one_display_intervals) + ProtoAdapter.INT32.encodedSizeWithTag(3, hotSearchDisplay.op_most_display_times) + ProtoAdapter.INT64.encodedSizeWithTag(4, hotSearchDisplay.op_one_display_intervals) + hotSearchDisplay.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, HotSearchDisplay hotSearchDisplay) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, hotSearchDisplay.most_display_times);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, hotSearchDisplay.one_display_intervals);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, hotSearchDisplay.op_most_display_times);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, hotSearchDisplay.op_one_display_intervals);
            protoWriter.writeBytes(hotSearchDisplay.unknownFields());
        }

        public final HotSearchDisplay decode(ProtoReader protoReader, HotSearchDisplay hotSearchDisplay) throws IOException {
            Builder builder;
            HotSearchDisplay hotSearchDisplay2 = (HotSearchDisplay) C10938a.m32097a().mo26425a(HotSearchDisplay.class, hotSearchDisplay);
            if (hotSearchDisplay2 != null) {
                builder = hotSearchDisplay2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.most_display_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.one_display_intervals((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.op_most_display_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.op_one_display_intervals((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (hotSearchDisplay2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Integer getMostDisplayTimes() throws NullValueException {
        if (this.most_display_times != null) {
            return this.most_display_times;
        }
        throw new NullValueException();
    }

    public final Long getOneDisplayIntervals() throws NullValueException {
        if (this.one_display_intervals != null) {
            return this.one_display_intervals;
        }
        throw new NullValueException();
    }

    public final Integer getOpMostDisplayTimes() throws NullValueException {
        if (this.op_most_display_times != null) {
            return this.op_most_display_times;
        }
        throw new NullValueException();
    }

    public final Long getOpOneDisplayIntervals() throws NullValueException {
        if (this.op_one_display_intervals != null) {
            return this.op_one_display_intervals;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.most_display_times = this.most_display_times;
        builder.one_display_intervals = this.one_display_intervals;
        builder.op_most_display_times = this.op_most_display_times;
        builder.op_one_display_intervals = this.op_one_display_intervals;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.most_display_times != null) {
            i = this.most_display_times.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.one_display_intervals != null) {
            i2 = this.one_display_intervals.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.op_most_display_times != null) {
            i3 = this.op_most_display_times.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.op_one_display_intervals != null) {
            i5 = this.op_one_display_intervals.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.most_display_times != null) {
            sb.append(", most_display_times=");
            sb.append(this.most_display_times);
        }
        if (this.one_display_intervals != null) {
            sb.append(", one_display_intervals=");
            sb.append(this.one_display_intervals);
        }
        if (this.op_most_display_times != null) {
            sb.append(", op_most_display_times=");
            sb.append(this.op_most_display_times);
        }
        if (this.op_one_display_intervals != null) {
            sb.append(", op_one_display_intervals=");
            sb.append(this.op_one_display_intervals);
        }
        StringBuilder replace = sb.replace(0, 2, "HotSearchDisplay{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HotSearchDisplay)) {
            return false;
        }
        HotSearchDisplay hotSearchDisplay = (HotSearchDisplay) obj;
        if (!unknownFields().equals(hotSearchDisplay.unknownFields()) || !Internal.equals(this.most_display_times, hotSearchDisplay.most_display_times) || !Internal.equals(this.one_display_intervals, hotSearchDisplay.one_display_intervals) || !Internal.equals(this.op_most_display_times, hotSearchDisplay.op_most_display_times) || !Internal.equals(this.op_one_display_intervals, hotSearchDisplay.op_one_display_intervals)) {
            return false;
        }
        return true;
    }

    public HotSearchDisplay(Integer num, Long l, Integer num2, Long l2) {
        this(num, l, num2, l2, ByteString.EMPTY);
    }

    public HotSearchDisplay(Integer num, Long l, Integer num2, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.most_display_times = num;
        this.one_display_intervals = l;
        this.op_most_display_times = num2;
        this.op_one_display_intervals = l2;
    }
}
