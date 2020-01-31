package cn.zh.community.model;

public class Nav {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NAV.ID
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NAV.TITLE
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NAV.URL
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NAV.PRIORITY
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    private Integer priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NAV.GMT_CREATE
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NAV.GMT_MODIFIED
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NAV.STATUS
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NAV.ID
     *
     * @return the value of NAV.ID
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NAV.ID
     *
     * @param id the value for NAV.ID
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NAV.TITLE
     *
     * @return the value of NAV.TITLE
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NAV.TITLE
     *
     * @param title the value for NAV.TITLE
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NAV.URL
     *
     * @return the value of NAV.URL
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NAV.URL
     *
     * @param url the value for NAV.URL
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NAV.PRIORITY
     *
     * @return the value of NAV.PRIORITY
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NAV.PRIORITY
     *
     * @param priority the value for NAV.PRIORITY
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NAV.GMT_CREATE
     *
     * @return the value of NAV.GMT_CREATE
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NAV.GMT_CREATE
     *
     * @param gmtCreate the value for NAV.GMT_CREATE
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NAV.GMT_MODIFIED
     *
     * @return the value of NAV.GMT_MODIFIED
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NAV.GMT_MODIFIED
     *
     * @param gmtModified the value for NAV.GMT_MODIFIED
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NAV.STATUS
     *
     * @return the value of NAV.STATUS
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NAV.STATUS
     *
     * @param status the value for NAV.STATUS
     *
     * @mbg.generated Fri Jan 31 17:17:08 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}