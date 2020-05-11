package com.cdmu.constant;

/**
 * @Author: BenOnSHI
 * @Date: 2020/5/11 12:23
 **/
public enum RoleEnum {

    //  用户角色Enum
    ADMIN(1, "管理员"),
    TEACHER(2, "教师"),
    STUDENT(3, "学生");


    private Integer roleId;
    private String roleName;

    RoleEnum(Integer roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }
}
