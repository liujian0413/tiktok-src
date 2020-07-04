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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HotSearchWitch */
public final class HotSearchWitch extends Message<HotSearchWitch, Builder> {
    public static final DefaultValueProtoAdapter<HotSearchWitch> ADAPTER = new ProtoAdapter_HotSearchWitch();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean hotsearch_aweme_billboard_switch;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean hotsearch_billboard_switch;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean hotsearch_music_billboard_switch;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean hotsearch_positive_energy_billboard_switch;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean hotsearch_star_billboard_switch;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HotSearchWitch$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<HotSearchWitch, Builder> {
        public Boolean hotsearch_aweme_billboard_switch;
        public Boolean hotsearch_billboard_switch;
        public Boolean hotsearch_music_billboard_switch;
        public Boolean hotsearch_positive_energy_billboard_switch;
        public Boolean hotsearch_star_billboard_switch;

        public final HotSearchWitch build() {
            HotSearchWitch hotSearchWitch = new HotSearchWitch(this.hotsearch_billboard_switch, this.hotsearch_music_billboard_switch, this.hotsearch_aweme_billboard_switch, this.hotsearch_positive_energy_billboard_switch, this.hotsearch_star_billboard_switch, super.buildUnknownFields());
            return hotSearchWitch;
        }

        public final Builder hotsearch_aweme_billboard_switch(Boolean bool) {
            this.hotsearch_aweme_billboard_switch = bool;
            return this;
        }

        public final Builder hotsearch_billboard_switch(Boolean bool) {
            this.hotsearch_billboard_switch = bool;
            return this;
        }

        public final Builder hotsearch_music_billboard_switch(Boolean bool) {
            this.hotsearch_music_billboard_switch = bool;
            return this;
        }

        public final Builder hotsearch_positive_energy_billboard_switch(Boolean bool) {
            this.hotsearch_positive_energy_billboard_switch = bool;
            return this;
        }

        public final Builder hotsearch_star_billboard_switch(Boolean bool) {
            this.hotsearch_star_billboard_switch = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HotSearchWitch$ProtoAdapter_HotSearchWitch */
    static final class ProtoAdapter_HotSearchWitch extends DefaultValueProtoAdapter<HotSearchWitch> {
        public final HotSearchWitch redact(HotSearchWitch hotSearchWitch) {
            return hotSearchWitch;
        }

        public ProtoAdapter_HotSearchWitch() {
            super(FieldEncoding.LENGTH_DELIMITED, HotSearchWitch.class);
        }

        public final HotSearchWitch decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (HotSearchWitch) null);
        }

        public final int encodedSize(HotSearchWitch hotSearchWitch) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, hotSearchWitch.hotsearch_billboard_switch) + ProtoAdapter.BOOL.encodedSizeWithTag(2, hotSearchWitch.hotsearch_music_billboard_switch) + ProtoAdapter.BOOL.encodedSizeWithTag(3, hotSearchWitch.hotsearch_aweme_billboard_switch) + ProtoAdapter.BOOL.encodedSizeWithTag(4, hotSearchWitch.hotsearch_positive_energy_billboard_switch) + ProtoAdapter.BOOL.encodedSizeWithTag(5, hotSearchWitch.hotsearch_star_billboard_switch) + hotSearchWitch.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, HotSearchWitch hotSearchWitch) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, hotSearchWitch.hotsearch_billboard_switch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, hotSearchWitch.hotsearch_music_billboard_switch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, hotSearchWitch.hotsearch_aweme_billboard_switch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, hotSearchWitch.hotsearch_positive_energy_billboard_switch);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, hotSearchWitch.hotsearch_star_billboard_switch);
            protoWriter.writeBytes(hotSearchWitch.unknownFields());
        }

        public final HotSearchWitch decode(ProtoReader protoReader, HotSearchWitch hotSearchWitch) throws IOException {
            Builder builder;
            HotSearchWitch hotSearchWitch2 = (HotSearchWitch) C10938a.m32097a().mo26425a(HotSearchWitch.class, hotSearchWitch);
            if (hotSearchWitch2 != null) {
                builder = hotSearchWitch2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.hotsearch_billboard_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.hotsearch_music_billboard_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.hotsearch_aweme_billboard_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.hotsearch_positive_energy_billboard_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 5:
                            builder.hotsearch_star_billboard_switch((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (hotSearchWitch2 != null) {
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

    public final Boolean getHotsearchAwemeBillboardSwitch() throws NullValueException {
        if (this.hotsearch_aweme_billboard_switch != null) {
            return this.hotsearch_aweme_billboard_switch;
        }
        throw new NullValueException();
    }

    public final Boolean getHotsearchBillboardSwitch() throws NullValueException {
        if (this.hotsearch_billboard_switch != null) {
            return this.hotsearch_billboard_switch;
        }
        throw new NullValueException();
    }

    public final Boolean getHotsearchMusicBillboardSwitch() throws NullValueException {
        if (this.hotsearch_music_billboard_switch != null) {
            return this.hotsearch_music_billboard_switch;
        }
        throw new NullValueException();
    }

    public final Boolean getHotsearchPositiveEnergyBillboardSwitch() throws NullValueException {
        if (this.hotsearch_positive_energy_billboard_switch != null) {
            return this.hotsearch_positive_energy_billboard_switch;
        }
        throw new NullValueException();
    }

    public final Boolean getHotsearchStarBillboardSwitch() throws NullValueException {
        if (this.hotsearch_star_billboard_switch != null) {
            return this.hotsearch_star_billboard_switch;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.hotsearch_billboard_switch = this.hotsearch_billboard_switch;
        builder.hotsearch_music_billboard_switch = this.hotsearch_music_billboard_switch;
        builder.hotsearch_aweme_billboard_switch = this.hotsearch_aweme_billboard_switch;
        builder.hotsearch_positive_energy_billboard_switch = this.hotsearch_positive_energy_billboard_switch;
        builder.hotsearch_star_billboard_switch = this.hotsearch_star_billboard_switch;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.hotsearch_billboard_switch != null) {
            i = this.hotsearch_billboard_switch.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.hotsearch_music_billboard_switch != null) {
            i2 = this.hotsearch_music_billboard_switch.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.hotsearch_aweme_billboard_switch != null) {
            i3 = this.hotsearch_aweme_billboard_switch.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.hotsearch_positive_energy_billboard_switch != null) {
            i4 = this.hotsearch_positive_energy_billboard_switch.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.hotsearch_star_billboard_switch != null) {
            i6 = this.hotsearch_star_billboard_switch.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.hotsearch_billboard_switch != null) {
            sb.append(", hotsearch_billboard_switch=");
            sb.append(this.hotsearch_billboard_switch);
        }
        if (this.hotsearch_music_billboard_switch != null) {
            sb.append(", hotsearch_music_billboard_switch=");
            sb.append(this.hotsearch_music_billboard_switch);
        }
        if (this.hotsearch_aweme_billboard_switch != null) {
            sb.append(", hotsearch_aweme_billboard_switch=");
            sb.append(this.hotsearch_aweme_billboard_switch);
        }
        if (this.hotsearch_positive_energy_billboard_switch != null) {
            sb.append(", hotsearch_positive_energy_billboard_switch=");
            sb.append(this.hotsearch_positive_energy_billboard_switch);
        }
        if (this.hotsearch_star_billboard_switch != null) {
            sb.append(", hotsearch_star_billboard_switch=");
            sb.append(this.hotsearch_star_billboard_switch);
        }
        StringBuilder replace = sb.replace(0, 2, "HotSearchWitch{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HotSearchWitch)) {
            return false;
        }
        HotSearchWitch hotSearchWitch = (HotSearchWitch) obj;
        if (!unknownFields().equals(hotSearchWitch.unknownFields()) || !Internal.equals(this.hotsearch_billboard_switch, hotSearchWitch.hotsearch_billboard_switch) || !Internal.equals(this.hotsearch_music_billboard_switch, hotSearchWitch.hotsearch_music_billboard_switch) || !Internal.equals(this.hotsearch_aweme_billboard_switch, hotSearchWitch.hotsearch_aweme_billboard_switch) || !Internal.equals(this.hotsearch_positive_energy_billboard_switch, hotSearchWitch.hotsearch_positive_energy_billboard_switch) || !Internal.equals(this.hotsearch_star_billboard_switch, hotSearchWitch.hotsearch_star_billboard_switch)) {
            return false;
        }
        return true;
    }

    public HotSearchWitch(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this(bool, bool2, bool3, bool4, bool5, ByteString.EMPTY);
    }

    public HotSearchWitch(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.hotsearch_billboard_switch = bool;
        this.hotsearch_music_billboard_switch = bool2;
        this.hotsearch_aweme_billboard_switch = bool3;
        this.hotsearch_positive_energy_billboard_switch = bool4;
        this.hotsearch_star_billboard_switch = bool5;
    }
}
