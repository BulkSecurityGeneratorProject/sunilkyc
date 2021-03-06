package com.eagle.kyc.service.dto;

import java.io.Serializable;
import java.util.Objects;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;

/**
 * Criteria class for the GroupCd entity. This class is used in GroupCdResource to
 * receive all the possible filtering options from the Http GET request parameters.
 * For example the following could be a valid requests:
 * <code> /group-cds?id.greaterThan=5&amp;attr1.contains=something&amp;attr2.specified=false</code>
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class GroupCdCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter groupCd;

    private LongFilter typeCdId;

    public GroupCdCriteria() {
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getGroupCd() {
        return groupCd;
    }

    public void setGroupCd(StringFilter groupCd) {
        this.groupCd = groupCd;
    }

    public LongFilter getTypeCdId() {
        return typeCdId;
    }

    public void setTypeCdId(LongFilter typeCdId) {
        this.typeCdId = typeCdId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final GroupCdCriteria that = (GroupCdCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(groupCd, that.groupCd) &&
            Objects.equals(typeCdId, that.typeCdId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        groupCd,
        typeCdId
        );
    }

    @Override
    public String toString() {
        return "GroupCdCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (groupCd != null ? "groupCd=" + groupCd + ", " : "") +
                (typeCdId != null ? "typeCdId=" + typeCdId + ", " : "") +
            "}";
    }

}
