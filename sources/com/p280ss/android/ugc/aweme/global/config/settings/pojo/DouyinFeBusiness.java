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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DouyinFeBusiness */
public final class DouyinFeBusiness extends Message<DouyinFeBusiness, Builder> {
    public static final DefaultValueProtoAdapter<DouyinFeBusiness> ADAPTER = new ProtoAdapter_DouyinFeBusiness();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String aggregation_tab;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String brand_tab;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DouyinFeBusiness$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DouyinFeBusiness, Builder> {
        public String aggregation_tab;
        public String brand_tab;

        public final DouyinFeBusiness build() {
            return new DouyinFeBusiness(this.brand_tab, this.aggregation_tab, super.buildUnknownFields());
        }

        public final Builder aggregation_tab(String str) {
            this.aggregation_tab = str;
            return this;
        }

        public final Builder brand_tab(String str) {
            this.brand_tab = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DouyinFeBusiness$ProtoAdapter_DouyinFeBusiness */
    static final class ProtoAdapter_DouyinFeBusiness extends DefaultValueProtoAdapter<DouyinFeBusiness> {
        public final DouyinFeBusiness redact(DouyinFeBusiness douyinFeBusiness) {
            return douyinFeBusiness;
        }

        public ProtoAdapter_DouyinFeBusiness() {
            super(FieldEncoding.LENGTH_DELIMITED, DouyinFeBusiness.class);
        }

        public final DouyinFeBusiness decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (DouyinFeBusiness) null);
        }

        public final int encodedSize(DouyinFeBusiness douyinFeBusiness) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, douyinFeBusiness.brand_tab) + ProtoAdapter.STRING.encodedSizeWithTag(2, douyinFeBusiness.aggregation_tab) + douyinFeBusiness.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, DouyinFeBusiness douyinFeBusiness) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, douyinFeBusiness.brand_tab);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, douyinFeBusiness.aggregation_tab);
            protoWriter.writeBytes(douyinFeBusiness.unknownFields());
        }

        public final DouyinFeBusiness decode(ProtoReader protoReader, DouyinFeBusiness douyinFeBusiness) throws IOException {
            Builder builder;
            DouyinFeBusiness douyinFeBusiness2 = (DouyinFeBusiness) C10938a.m32097a().mo26425a(DouyinFeBusiness.class, douyinFeBusiness);
            if (douyinFeBusiness2 != null) {
                builder = douyinFeBusiness2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.brand_tab((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.aggregation_tab((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (douyinFeBusiness2 != null) {
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

    public final String getAggregationTab() throws NullValueException {
        if (this.aggregation_tab != null) {
            return this.aggregation_tab;
        }
        throw new NullValueException();
    }

    public final String getBrandTab() throws NullValueException {
        if (this.brand_tab != null) {
            return this.brand_tab;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.brand_tab = this.brand_tab;
        builder.aggregation_tab = this.aggregation_tab;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.brand_tab != null) {
            i = this.brand_tab.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.aggregation_tab != null) {
            i3 = this.aggregation_tab.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.brand_tab != null) {
            sb.append(", brand_tab=");
            sb.append(this.brand_tab);
        }
        if (this.aggregation_tab != null) {
            sb.append(", aggregation_tab=");
            sb.append(this.aggregation_tab);
        }
        StringBuilder replace = sb.replace(0, 2, "DouyinFeBusiness{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DouyinFeBusiness)) {
            return false;
        }
        DouyinFeBusiness douyinFeBusiness = (DouyinFeBusiness) obj;
        if (!unknownFields().equals(douyinFeBusiness.unknownFields()) || !Internal.equals(this.brand_tab, douyinFeBusiness.brand_tab) || !Internal.equals(this.aggregation_tab, douyinFeBusiness.aggregation_tab)) {
            return false;
        }
        return true;
    }

    public DouyinFeBusiness(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public DouyinFeBusiness(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.brand_tab = str;
        this.aggregation_tab = str2;
    }
}
