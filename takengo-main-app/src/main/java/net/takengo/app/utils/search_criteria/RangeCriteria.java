package net.takengo.app.utils.search_criteria;

import net.takengo.app.entity.exception.flow.TakenGoInvalidParameterException;

public class RangeCriteria {
    /**
     * Page index(0-based)
     */
    private final int page;

    /**
     * Number of elements per page
     */
    private final int rowCount;

    public RangeCriteria(final int page, final int rowCount) {
        if (page < 0) {
            throw new TakenGoInvalidParameterException("Incorrect page index:" + page);
        }
        if(rowCount < 0) {
            throw new TakenGoInvalidParameterException("Incorrect row count:" + rowCount);
        }
        this.page = page;
        this.rowCount = rowCount;
    }
    public int getPage() {
        return page;
    }

    public int getRowCount() {
        return rowCount;
    }
}

