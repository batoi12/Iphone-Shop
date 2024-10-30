/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author cuong
 */
public class Category {
    private String cid;
    private String cname;

    public Category() {
    }
    public Category(String cid, String cnameString) {
        this.cid = cid;
        this.cname = cnameString;
    }
    
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCnameString() {
        return cname;
    }

    public void setCnameString(String cnameString) {
        this.cname= cnameString;
    }

    @Override
    public String toString() {
        return "Category{" + "cid=" + cid + ", cname=" + cname + '}';
    }


}
