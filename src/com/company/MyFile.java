package com.company;

import java.util.Date;

/**
 * 文件和文件夹下的组合关系，并且查询出目录下面的子文件
 */
//子文件
public class MyFile {
    /* 文件名 */
    private String name;
    //创建时间
    private Date createTime;

    /* 文件大小 */
    private int size;

    /*上级目录*/
    private MyFolder Parent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MyFolder getParent() {
        return Parent;
    }

    public void setParent(MyFolder parent) {
        Parent = parent;
    }
}

//父文件夹
class MyFolder {
    private String name;
    private Date createtime;
    //上级文件夹
    private MyFolder parent;
    //包含的文件
    private MyFile[] files;
    //包含的子文件夹
    private MyFolder[] subFolders;

    //返回当前文件夹下所有文件的大小
    public int totalSize() {
        int totalSize = 0;
        if (files != null) {
            for (MyFile file : files) {
                totalSize += file.getSize();
            }
        }
        return totalSize;
    }
}

