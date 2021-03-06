package com.jaaarl.catalog.rest.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Bohdan on 22.10.2017.
 */

public class PagerModel {
    @SerializedName("records_per_page")
    @Expose
    private Integer recordsPerPage;
    @SerializedName("total_record_count")
    @Expose
    private Integer totalRecordCount;
    @SerializedName("current_page_record_count")
    @Expose
    private Integer currentPageRecordCount;
    @SerializedName("is_first_page")
    @Expose
    private Boolean isFirstPage;
    @SerializedName("is_final_page")
    @Expose
    private Boolean isFinalPage;
    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("current_page_path")
    @Expose
    private String currentPagePath;
    @SerializedName("next_page")
    @Expose
    private Integer nextPage;
    @SerializedName("next_page_path")
    @Expose
    private String nextPagePath;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("total_pages_path")
    @Expose
    private String totalPagesPath;

    public Integer getRecordsPerPage() {
        return recordsPerPage;
    }

    public void setRecordsPerPage(Integer recordsPerPage) {
        this.recordsPerPage = recordsPerPage;
    }

    public Integer getTotalRecordCount() {
        return totalRecordCount;
    }

    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public Integer getCurrentPageRecordCount() {
        return currentPageRecordCount;
    }

    public void setCurrentPageRecordCount(Integer currentPageRecordCount) {
        this.currentPageRecordCount = currentPageRecordCount;
    }

    public Boolean getIsFirstPage() {
        return isFirstPage;
    }

    public void setIsFirstPage(Boolean isFirstPage) {
        this.isFirstPage = isFirstPage;
    }

    public Boolean getIsFinalPage() {
        return isFinalPage;
    }

    public void setIsFinalPage(Boolean isFinalPage) {
        this.isFinalPage = isFinalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getCurrentPagePath() {
        return currentPagePath;
    }

    public void setCurrentPagePath(String currentPagePath) {
        this.currentPagePath = currentPagePath;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public String getNextPagePath() {
        return nextPagePath;
    }

    public void setNextPagePath(String nextPagePath) {
        this.nextPagePath = nextPagePath;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public String getTotalPagesPath() {
        return totalPagesPath;
    }

    public void setTotalPagesPath(String totalPagesPath) {
        this.totalPagesPath = totalPagesPath;
    }
}
